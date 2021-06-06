package Base;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution 08
 *  Copyright 2021 Ivedent Lloyd III
 */

import java.util.Scanner;

public class Solution{

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args){

        int numberPeople = numPeople();
        int numberPizza = numPizza();
        int numberSlices = numSlices();

        int totalSlices = numberPizza * numberSlices;

        int slicesPerson = totalSlices / numberPeople;

        int leftoverPizza = numberSlices % numberPeople;

        System.out.println(+numberPeople+ " people with "+numberPizza+" pizzas ("+totalSlices+" slices)");
        System.out.println("Each person gets "+slicesPerson+" pieces of pizza.");
        System.out.println("There are "+leftoverPizza+" leftover pieces.");

    }

    private static int numPeople(){

        System.out.print("How many people? ");
        String people = in.nextLine();
        int numberPeople = Integer.parseInt(people);

        return numberPeople;

    }

    private static int numPizza(){

        System.out.print("How many pizzas do you have? ");
        String pizzas = in.nextLine();
        int numberPizzas = Integer.parseInt(pizzas);

        return numberPizzas;

    }

    private static int numSlices(){

        System.out.print("How many slices per pizza? ");
        String slices = in.nextLine();
        int numberSlices = Integer.parseInt(slices);

        return numberSlices;

    }

}
