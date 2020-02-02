package com.judell.playground.random;

public class RandomMain {
    private static GenRandomNumber randomNumber = new GenRandomNumber();

    public static void main(String[] args) {
        String user = "!help";

        if (user.equals(Triggers.triggerKeys("!help"))){
            randomNumber.setRandomNumber(20);
            System.out.println("you got helped");
        }
        else if (Triggers.triggerValues().contains(user) && randomNumber.randomNumber() <= 4){
            System.out.println("not in mood");
        }
        else {
            System.out.println("in mood to talk");
        }

        //------------------------------------------------
        // Create a hashtable and put some key-value pair.
        //
//        HashMap<String, String> companies = new HashMap<String, String>();
//        companies.put("eBay", "South San Jose");
//        companies.put("Paypal", "North San Jose");
//        companies.put("Google", "Mountain View");
//        companies.put("Yahoo", "Santa Clara");
//        companies.put("Twitter", "San Francisco");
//
//        // Get a random entry from the HashMap.
//        Object[] crunchifyKeys = companies.keySet().toArray();
//        Object key = crunchifyKeys[new Random(System.currentTimeMillis()).nextInt(crunchifyKeys.length)];
//        System.out.println("************ Random Value ************ \n" + key + " :: " + companies.get(key));
//
//        List<Map.Entry<String, String>> list = new ArrayList<Map.Entry<String, String>>(companies.entrySet());
//
//        // Bonus Crunchify Tips: How to Shuffle a List??
//        // Each time you get a different order...
//        System.out.println("\n************ Now Let's start shuffling list ************");
//        Collections.shuffle(list);
//        for (Map.Entry<String, String> entry : list) {
//            System.out.println(entry.getKey() + " :: " + entry.getValue());
//        }
    }
}
