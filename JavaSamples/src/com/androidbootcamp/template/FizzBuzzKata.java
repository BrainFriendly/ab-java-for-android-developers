package com.androidbootcamp.template;

/**
 * Created by eduardomedina on 29/01/18.

 Return “fizz”, “buzz” or “fizzbuzz”.

 For a given natural number greater than zero return:

    “fizz” if the number is dividable by 3
    “buzz” if the number is dividable by 5
    “fizzbuzz” if the number is dividable by 15
    the same number if no other requirement is *fulfilled*

 */
public class FizzBuzzKata {

    public static void main(String[] args)
    {
        System.out.println("Hello Java !");
        //getResultShouldReturnFizzIfTheNumberIsDividableBy3();
        //getResultShouldReturnBuzzIfTheNumberIsDividableBy5();
        getResultShouldReturnBuzzIfTheNumberIsDividableBy15();
        //getResultShouldReturnTheSameNumberIfNoOtherRequirementIsFulfilled();
    }

    /**
     * result = fizz
     */
    public  static void getResultShouldReturnFizzIfTheNumberIsDividableBy3() {

        String result= FizzBuzz.getResult(3);
        System.out.println("result "+result);
    }

    /**
     * result = buzz
     */
    public static void getResultShouldReturnBuzzIfTheNumberIsDividableBy5() {

        String result1= FizzBuzz.getResult(5);
        String result2= FizzBuzz.getResult(10);

        System.out.println("result1 "+result1);
        System.out.println("result2 "+result2);
    }

    /**
     * result = fizzbuzz
     */
    public static void getResultShouldReturnBuzzIfTheNumberIsDividableBy15() {
        String result1= FizzBuzz.getResult(15);
        String result2= FizzBuzz.getResult(30);

        System.out.println("result1 "+result1);
        System.out.println("result2 "+result2);
    }

    /**
     * result = number
     */
    public static void getResultShouldReturnTheSameNumberIfNoOtherRequirementIsFulfilled() {

        String result1= FizzBuzz.getResult(1);
        String result2= FizzBuzz.getResult(2);
        String result3= FizzBuzz.getResult(4);

        System.out.println("result1 "+result1);
        System.out.println("result2 "+result2);
        System.out.println("result3 "+result3);

    }
}
