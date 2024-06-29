package SaturdayAssessment;
import java.util.Scanner;


public class Atm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your account balance: ");
        int balance = scanner.nextInt();
        
       
        System.out.print("Enter the amount to withdraw: ");
        int withdrawalAmount = scanner.nextInt();
        
       
        if (balance >= withdrawalAmount) {
            balance -= withdrawalAmount;
            
            System.out.println("Withdrawal successful!");
        } else {
            System.out.println("Insufficient balance!");
        }
        
       
        System.out.println("Remaining balance: " + balance);
        

    }
        
        
    }
           
   
       

