package com.corejava;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a noun: ");
        String noun = input.nextLine();
        System.out.print("Enter a verb: ");
        String verb = input.nextLine();
        System.out.print("Enter a part of a body: ");
        String partBody = input.nextLine();
        System.out.print("Enter an article of clothing: ");
        String articleClothing = input.nextLine();
        System.out.print("Enter an adjective: ");
        String adjective = input.nextLine();

        System.out.println("Here's Your MadLib");
        System.out.println("==================");
        System.out.println("What came first, the chicken or the " + noun + "?" + " \nI like my donuts with extra " + verb + " on them. \nIt doesn’t matter if you are Irish. On St.Patrick day, everybody wears Shamrocks on their " + partBody + ". \nMy gym locker stinks because I’m always leaving my dirty " + articleClothing + " in there ! \nOnce that " + adjective + " music comes on, it’s time to shut down your acceptance speech !");
    }
}
