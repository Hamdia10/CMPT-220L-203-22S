package base;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


public class Main {
    
    
   // private static int regularNumber;

    /**
     * # Lab Four
     * ---
     *
     * For this lab we're going to be making and using a bunch of functions.
     *
     * Our Goals are:
     * - Switch Case
     * - Looping
     * - Making our own functions
     * - Combining functions
     * - Structuring solutions
     * @param c 
     * @param regularNumber 
     * 
     * @param result
     */
    

    // Give me an example of you using switch case.
    public static void main(String[] args) {
        
        


        //CASES
        String beginner = "Friends";
        switch (beginner) {
            case "Friends":
                System.out.println("Friends especially good friends are all you need to succeed in life.");
            case "F1":
                System.out.println("Formula 1 is a sport with so much sentimental and financial value.");
            case "Clouds":
                System.out.println(
                        "Clouds are so special because of how simple they look on the outside but complex on the inside.");
            default:
                System.out.println("What are your interest?");
        }
        //int number = 9;
       // int power = 7;
        //System.out.println(result);  

         func(7, 3);

      int[] list = { 2, 3, 5, 2, 3, 6, 7, 8, 2 };
   
      int givenNumber = 3;
      //System.out.println("Result of Pythagorean theorem is = "+c);
      //trig(7,9);
      Pytheorem(8,4);


      // calling method countGivenNumberAppearanceInList with parameters
      System.out.println(countGivenNumberAppearanceInList(list, givenNumber));



      int[]  specialNo = {12,4,8,9,98};
      int regularNumber = 4;
      System.out.println( summation ( specialNo, regularNumber));

         
         //division(67,9);

        // }
        // Give me an example of you using a for loop
        for (int x = 0; x < 11; x++) {
            System.out.println("We are counting from: " + x);
        }
        // Give me an example of you using a while loop

        int a = 12;
        int b = 72;
        int difference = b - a + 7;
        int subjectiveInteger = (int) (Math.random() * difference) + a;

        int evenNumber = 2;

        while (evenNumber != subjectiveInteger) {
            System.out.println("We haven't identified the subjective integer yet.");
            evenNumber++;
        }
        System.out.println("We've identified the subjective integer and it was : " + subjectiveInteger);
        // int exponent (int number , int power) {
        // int answer = a + b;
        // return answer;
    }

    // For the following todos you'll probably want to define them below and then
    // call them from the main function above.

    

    /**
     * I want you to write a function that will take in a number and raise it to the
     * power given.
     * For example if given the numbers 2 and 3. The math that the function should
     * do is 2^3
     * and should print out or return 8. Print the output.
     */
    public static void func(int number, int power) {
        int ans = 1;
        for (int i = 0; i < power; i++) {
            ans = ans * number;
        }
        System.out.println(number +"^" +power + " =  " + ans);
    }
    
        
        
    

    // class Party{
    // public static void main(String[] args) {
    // Scanner scan = new Scanner (System.in);
    // System.out.println("Enter a number: ");
    // int

    // }

    // }
    

    /**
     * I want you to write a function that will take in a list and see how many
     * times a given number is in the list.
     * For example if the array given is [2,3,5,2,3,6,7,8,2] and the number given is
     * 2 the function should print out
     * or return 3. Print the output.
     * @return 
     */

        // method to count number of times appears a given number in list
    public static int countGivenNumberAppearanceInList(int[] list, int givenNumber) {

                // declaring a variable count used to store number of times appears a given
                // number in list
                int count = 0;

                // iterating every number in list
                for (int number : list) {

                        // checking number is equals to givenNumber or not
                        if (number == givenNumber) {

                                // if givenNumber is equals to number then increment count value by 1
                                count++;
                        }
                }

                // return number of times appears a given number in list
                return count;
    }

      

    



   
    
    

    /**
     * Create a function named summation that will take in an int[ ] and return an
     * int.
     * I want the function to then go through the given array and sum up digits in
     * the array.
     * Once that’s done print or return the answer. Print the output
     */
    public static int summation(int [] specialNo, int regularNumber) {
    
        int sum = 0;
        int i;
        for (i = 0; i < specialNo.length; i++) {
            sum += specialNo[i];
        }
        
            
            

        return sum;
        

        
        
    }




    
        
    
        
        
        
        


        
       
    
        

        // return number of times appears a given number in list
       // return random;    }



    

    /**
     * Give me a function that gives the answer to the pythagorean theorem.
     * I'd like you to reuse the exponent function from above as well as the
     * functions below to make your function.
     *
     * If you don't remember the pythagorean theorem the formula is (a^2 + b^2 =
     * c^2).
     * Given a and b as parameters i'd like you to return c.
     *
     * If this doesn't make sense look up `Pythagorean Theorem Formula` on google.
     *
     * Once that’s done print or return the answer. Print the output
     * 
     */
    //public static void trig(int a, int b) {
        //int c = 0;
       // double square = Math.pow(a, 2);
      //  double squarem = Math.pow(b, 2);
       // double squared =Math.pow(c, 2);
       // double d= Math.sqrt(a + b);
       // c = a + b;
      //  System.out.println(a + b + " =  " + c );
      // }
    public static void Pytheorem(double a, double b){
        double c =Math.sqrt(a*a+b*b);
        System.out.println("Result of Pythagorean theorem is = "+c);
        
        
    }

    

    //int addition(int a, int b) {
        //int answer = a + b;
        //return answer;
    //}

   // static int division(int a, int b) {
       // int answer = a / b;
        //return answer;
   // }
}


   
