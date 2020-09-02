package learning;


public class LearnBlock {
    {// block starts

        String name = "James";
        System.out.println(name);

    }// block ends

    {
        int num1 = 24;
        int num2 = 26;
        int sum = num1 + num2;
        System.out.println("the some of num1+num2 is" + " " + sum);

    }

    {
        int num3 = 10;
        int num4 = 20;
        int multi = num3 * num4;
        System.out.println("The multiplication of num3*num4 is " + " " + multi);

    }


    public void display() {

        System.out.println("Tv display");
    }

    public void carEngin() {
        System.out.println("Engin Power");
    }

    public static void main(String[] args) {

        LearnBlock obj = new LearnBlock();
        obj.display();
        obj.carEngin();



    }


}
