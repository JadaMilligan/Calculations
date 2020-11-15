package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int x= input.nextInt();
        System.out.print("Please enter another number: ");
        int y= input.nextInt();
        int sum = x+y;
        int product = x*y;
        System.out.println("Sum: " +sum);
        System.out.println("Product: " +product);
  //Square Program
        System.out.print("Enter a number you would like to find the square of: ");
        int z= input.nextInt();
        int square =z*z;
        System.out.println("Square: " +square);
  // Same line print
        Scanner words = new Scanner(System.in);
        System.out.print("Enter some words: ");
        String first = words.nextLine();
        System.out.print("Enter some more words: ");
        String second = words.nextLine();
        System.out.println("You entered: " +first+ " " + second);
    }
}
