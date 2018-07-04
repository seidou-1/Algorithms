/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CenturyAlgorithm;

import java.util.Scanner;

/**
 *
 * @author laptop
 */
public class Century {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            
        /*
        Given a year, return the century it is in. The first century spans 
        from the year 1 up to and including the year 100, 
        the second - from the year 101 up to and including 
        the year 200, etc.
        
        */
        
        Scanner myScanner = new Scanner (System.in);
        
        System.out.println("Enter a year: ");
        int year = myScanner.nextInt();
        
        
        
        
        if (year % 100 == 1) {
            System.out.println("The Century is: " + (year / 100));
        } else {
            System.out.println ("The Century is: " + ((year / 100) + 1));
        }

    }
    }
    

