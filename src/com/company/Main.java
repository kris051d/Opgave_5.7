package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a = 0, b = 0, c = 0;

        Scanner scan_a = new Scanner(System.in);
        Scanner scan_b = new Scanner(System.in);
        Scanner scan_c = new Scanner(System.in);
        if(!scan_a.hasNextInt()){
            String word = scan_a.next();
            System.err.println(word + " is not a number, restart the program.");
            System.exit(0);
        } else {
            a = scan_a.nextInt();
        }
        if(!scan_b.hasNextInt()){
            String word = scan_b.next();
            System.err.println(word + " is not a number, restart the program.");
            System.exit(0);
        } else {
            b = scan_b.nextInt();
        }
        if(!scan_c.hasNextInt()){
            String word = scan_c.next();
            System.err.println(word + " is not a number, restart the program.");
            System.exit(0);
        } else {
            c = scan_c.nextInt();
        }
        if(a+b<=c || b+c<=a || a+c<=b){
            System.out.println("Dette kan ikke blive en trekant");
        } else {
            System.out.println("Dette kan blive en trekant");
        }
    }
}
