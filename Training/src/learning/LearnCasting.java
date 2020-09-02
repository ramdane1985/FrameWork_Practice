package learning;

public class LearnCasting {// casting means converting  data type

    public static void main(String[] args) {

        double price = 5000.500;
        System.out.println("The price is " + price);
        int newPrice = (int) price;
        System.out.println("The new price is  " + newPrice);
        float fee = 400.65f;
        int newFee = (int) fee;
        System.out.println("the new fee is " + newFee);
        float a= 67.7f;
        int newA= (int)a;
        System.out.println(a);
        System.out.println("The new a is  "+newA);


    }


}
