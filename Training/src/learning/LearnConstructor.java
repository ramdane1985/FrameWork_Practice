package learning;

import jdk.swing.interop.SwingInterOpUtils;

public class LearnConstructor {
    int age;
    String name;
    double fee;
    String address;
    int num;

    // create a constructor
    public LearnConstructor() {// default constructor
        System.out.println("this is my default constructor");

    }

    // create a second constructor
    public LearnConstructor(String address, int age) {// single parameter constructor
        this.address= address;
        this.age=age;
        System.out.println("the student address is"+ this.address+" the student age is "+ this.age);


//       tem.out System.out.println("This is my first parameter constructor");
//        this.address = address;
//        System.out.println("This one has a value of global variable " + this.address);
//        address = "USA";
//        System.out.println("This is my new address " + (address));
//        this.age = age;
//        //int age = 35;
//        System.out.println("My age is " + this.age);
//        this.fee = fee;
//        //double fee = 8888.888;
//        System.out.println("This is my course fee " + this.fee);
//        this.name = name;
//        //String name = "Raza";
//        Sys.println("Our team lead name is " + this.name);


    }
    // create a third constructor
    public LearnConstructor(int num){
        this.num=num;
        //int num=4357;
        System.out.println("My student ID is "+ this.num);

    }


    public static void main(String[] args) {

        LearnConstructor obj = new LearnConstructor();
       // LearnConstructor obj1 = new LearnConstructor("Canada");
        LearnConstructor obj2= new LearnConstructor(5436);
        LearnConstructor obj3= new LearnConstructor("USA",30);

    }


}
