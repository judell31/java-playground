package com.judell.expirements;

import java.util.Random;

public class ExperimentsMain {

    public static void main(String[] args) {
        System.out.println(add(2, 2, 5 ,7));
    }

//    public static void x(){
////        String[] array = {"d", "c", "e"};
////        int i;
////        for (i = 0; i < array.length; i++){
////            System.out.println(array[i]);
////        }
////        System.out.println(i);
//    }

    public static Integer add(int a, int b, int y, int z){
        Integer x = a + b;
        Integer w = y * z;
        Integer u = x + w;
        return u;
    }
}

/*

public class Test  {

    public static void main(String[] args) {
        A myObject = new B();
        myObject.doSomething();
    }

}

class A {
    public void doSomething(){
        System.out.println("A");
    }
}

class B extends A {
    public void doSomething(){
        System.out.println("B");
    }
}

public class Test  {

    public static void main(String[] args) {
        A myObject = new B();
        myObject.doSomething();
    }

}

class A {
    public void doSomething(){
        System.out.println("A");
    }
}

class B extends A {
    public void doSomething(){
        System.out.println("B");
    }

    public void doSomethingElse(){
        System.out.println("Something else");
    }
}
 */
