package com.judell.expirements;

import java.util.Random;

public class ExperimentsMain {

    public static void main(String[] args) {
    }

    public static String userType(Integer num){
        if(num == 1){
            return "user";
        }
        else if (num == 2){
            return "content creator";
        }
        return "yup";
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
