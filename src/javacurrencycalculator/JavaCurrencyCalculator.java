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
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        double lkr,usd,sgd,inr,dubai,eruo,pound;
        
        System.out.println("Currency Converter"); 

        System.out.println("1. Sri Lankan Rupee");
        System.out.println("2. US Dollar");
        System.out.println("3. Singapore Dollar");
        System.out.println("4. Indian Rupee");
        System.out.println("5. Dubai Dirham");
        System.out.println("6. Euro");
        System.out.println("7. Pound");
        
        System.out.print("Choose the option : ");
        
        int choise = sc.nextInt();
        
        System.out.print("Enter Amount to Converter : ");
        double amount = sc.nextDouble();
       
        switch(choise){
            case 1: //LKR Converter
                
        }
    }
}
