/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javacurrencycalculator;


import java.util.Scanner;
import java.text.DecimalFormat;
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
        DecimalFormat f = new DecimalFormat("##.###");
        
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
                usd = amount / 320.54;
                System.out.println(amount + " Sri Lankan Rupee : " + f.format(usd) + " Dollars."); 
                
                sgd = amount / 241.75;
                System.out.println(amount + " Sri Lankan Rupee : " + f.format(sgd) + " in Singapore Dollar");
                
                inr = amount / 3.92;
                System.out.println(amount + " Sri Lankan Rupee : " + f.format(inr) + " in Indian Rupee");
                
                dubai = amount / 87.14;
                System.out.println(amount + " Sri Lankan Rupee : " + f.format(dubai) + " in UAE Dinar");
                
                eruo = amount / 358.76;
                System.out.println(amount + " Sri Lankan Rupee : " + f.format(eruo)+ " in Eruo");
                
                pound = amount / 404.47;
                System.out.println(amount + " Sri Lankan Rupee : " + f.format(pound) + " in Pound");
                
                break;
             
            case 2: //USD Converter
                lkr = amount * 320.02;
                System.out.println(amount + " USD : " + f.format(lkr) + " in Sri Lankan Rupee");
                
                sgd = amount * 1.33;
                System.out.println(amount + " USD : " + f.format(sgd) + " in Singapore Dollar");
                
                inr = amount * 81.73;
                System.out.println(amount + " USD : " + f.format(inr) + " in Indian Rupee");
                
                dubai = amount * 3.67;
                System.out.println(amount + " USD : " + f.format(dubai) + " in UAE Dinar");
                
                eruo = amount * 0.89;
                System.out.println(amount + " USD : " + f.format(eruo) + " in Eruo");
                
                
                
                break;
                
        }
    }
}
