package com.judell.playground.strings;

import java.io.File;
import java.util.Objects;

public class Strings {

    public static void main(String[] args) {
        String folderPath = "C:\\Users\\justi\\Desktop\\public";

        File myFolder = new File(folderPath);
        File[] file_array = myFolder.listFiles();

        for (int i = 0; i < Objects.requireNonNull(file_array).length; i++)
        {
            System.out.println(file_array[i].getName());

            if (file_array[i].isFile())
            {

                File myFile = new File(folderPath + "\\" + file_array[i].getName());
                String long_file_name = file_array[i].getName();
//                String[] tokens = long_file_name.split("\\s");
                String nfn = long_file_name.replace(" ", "-").toLowerCase();
//                String new_file_name = tokens[1];
//                System.out.println(long_file_name);
//                System.out.print(new_file_name);

                // file name format: "Snapshot 11 (12-05-2017 11-57).png"
                // To Shorten it to "11.png", get the substring which
                // starts after the first space character in the long
                // _file_name.
                myFile.renameTo(new File(folderPath +
                        "\\" + nfn));
            }
        }

//        System.out.println(formatString("1 Quick Wins! The Secret to Using Speaker Notes Effectively.MP4"));
//        String ch = "t";
//        String test = "test";
//        String[] strArray = {"test", "me", "and", "you"};
//
//        System.out.println(ch.charAt(0) == test.charAt(0));
//
//        System.out.println("String:\tA\n".replace("\t", "\\t").replace("\n","\\n"));
//        System.out.println("\\n");
//        String x = "e";
//        System.out.println(x.contains("e"));
//        char c = 10;
//        System.out.println("d\n".charAt(1) == c);
//
//        int count = 0;
//        for (int i = 0; i < strArray.length; i++){
//            count++;
//        }
//        System.out.println(count);
    }

    private static String formatString(String name){
        return name.replace(" ", "-").toLowerCase();
    }
}
