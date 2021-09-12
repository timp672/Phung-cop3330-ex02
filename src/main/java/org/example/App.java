/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Tim Phung
 */
package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        System.out.println( "What is the input string?" );
        String str = scan.nextLine();
        System.out.println( str + " has " + str.length() + " characters. ");
    }
}
