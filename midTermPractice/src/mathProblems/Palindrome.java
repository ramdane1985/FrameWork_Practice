package mathProblems;

public class Palindrome {
    public static void main(String[] args) {
/*
If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
Palindrome. So write java code to check if a given String is Palindrome or not.
*/
        String reverse = ""; // Objects of String class
        String word = "MADAM";

//char a = word.charAt(0); The pricipe of using word.charAt(i)
//System.out.println(a);

        int length = word.length();
        for (int i = length -1 ; i >=0; i--) {

            reverse = reverse+ word.charAt(i);
            System.out.println(reverse);// to print the word in the opposite way
        }
        System.out.println(reverse);// to print the word in the opposite way

        if (word.equals(reverse))
            System.out.println("The string is a palindrome.");
        else
            System.out.println("The string isn't a palindrome.");



        String test = "madam";
        char [] a = test.toCharArray();//store the string to the array char

        int size = test.length();// int size =5

        char [] vide = new char[size]; //create an empty array char with the size of test.length=5

        int i = 0;
        while (i != size){
            vide[size-1-i]=a[i];
            i++;
        }
        System.out.println(vide);




    }
}
