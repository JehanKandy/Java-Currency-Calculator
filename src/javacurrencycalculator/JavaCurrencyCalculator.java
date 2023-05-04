/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javacurrencycalculator;


import java.util.Scanner;
/**
 *
 * @author Jehan
 */
public class JavaCurrencyCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Choose the currency to Calculate : ");
        System.out.println("1. Singapore Dollars");
        System.out.println("2. US Dollars");
        System.out.println("Erous");
        
        int choice = sc.nextInt();
        
        System.out.println("Enter Ammount of Currency to convert : ");
        double amout = sc.nextDouble();
        double currentAmount = 0.0;
        
    }
    
}
