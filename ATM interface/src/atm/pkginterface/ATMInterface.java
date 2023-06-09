/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atm.pkginterface;

/**
 *
 * @author avula
 */
import java.util.Scanner;
public class ATMInterface {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        AtmOperatioInterf op=new AtmOperationImpl();
        // TODO code application logic here
        int atmnumber=12345;
        int atmpin=123;
        int accountnumber=12234567;
        Scanner in=new Scanner(System.in);
        System.out.println("welcome to Atm machine!!!");
        System.out.println("enter atm Number:");
        int atmNumber=in.nextInt();
        System.out.println("enter pin");
        int pin=in.nextInt();
        if((atmnumber==atmNumber) && (atmpin==pin))
        {
            //System.out.println("validation Done");
            while(true){
                System.out.println("1. view Balance\n 2.withdraw Amount \n 3.Deposit Amount\n 4.view Transaction History \n5.transfer amount \n6.Exit");
                System.out.println("Enter choice");
                int ch=in.nextInt();
                if(ch==1)
                {
                    op.viewBalance();
                }
                else if(ch==2){
                     System.out.println("enter the amount to withdraw");
                     double withdrawAmount=in.nextDouble();
                     op.withdrawAmount(withdrawAmount);
            }
                else if(ch==3){
                    System.out.println("enter amount to deposit");
                    double depositAmount=in.nextDouble();
                    op.depositAmount(depositAmount);
                }
                else if(ch==4){
                    op.viewMiniStatement();
                }
                 else if(ch==5){
                      System.out.println("emter the account number to transfer");
                      double n=in.nextDouble();
                      if(n==accountnumber){
                    System.out.println("enter amount to transfer");
                    double transferAmount=in.nextDouble();
                    op.TransferAmount(transferAmount);
                      }
                      else{
                           System.out.println("enter the valid account Number");
                      }
                }
                 else if(ch==6){
                    System.out.println("collect atm card .....\n Thank you for using ATM");
                    System.exit(0);
                }
                
                else{
                    System.out.println("please enter correct choice");
                }
         
        }
        }
        else{
             System.out.println("Incorrect Atm Number or pin");
             System.exit(0);
        }
    }
    
}
