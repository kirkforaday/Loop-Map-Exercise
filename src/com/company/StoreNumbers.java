package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StoreNumbers {
    public static void storeNumbers() {
        //Set Up Scanner And List
        Scanner numberScanner = new Scanner(System.in);
        ArrayList<Integer> inputs = new ArrayList<Integer>();
        //Ask The User For 5 Numbers
        System.out.println("Please Enter Your Numbers. Type 'Done' When Finished.");
        //Store The Numbers In An Array List
        while (numberScanner.hasNextInt()) {
            inputs.add(numberScanner.nextInt());
        }
        // Print The Given Numbers
        System.out.println("Your Numbers Are: " + (inputs));
        //Find The Sum Of The Numbers
        int sum = 0;
        for (Integer input : inputs) sum += input;
        System.out.println("The Sum of Your Numbers is: " + sum);
        //Find The Product Of The Numbers
        int product = 1;
        for (Integer input : inputs) product = product * input;
        System.out.println("The Product of Your Numbers is: " + product);
        //Find The Largest Of The Numbers
        int largest = Collections.max(inputs);
        System.out.println("The Largest Number You Entered Is: " + largest);
        //Find The Smallest Of The Numbers
        int smallest = Collections.min(inputs);
        System.out.println("The Smallest Number You Entered Is: " + smallest);
    }
}