/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atm.pkginterface;

/**
 *
 * @author avula
 */
import java.util.*;
public class AtmOperationImpl  implements AtmOperatioInterf{
    ATM atm=new ATM();
HashMap<Double,String> ministmt=new HashMap<Double,String>();
     public void viewBalance(){
         System.out.println("Available Balance is:"+atm.getBalance());
     }
     public void withdrawAmount(double withdrawAmount){
         if(withdrawAmount%500==0)
         {
         if(withdrawAmount>atm.getBalance()){
             System.out.println("insufficient funds");
         }
         ministmt.put(withdrawAmount,"amount withdrawn");
          System.out.println("collect the cash"+withdrawAmount);
          atm.setBalance(atm.getBalance()-withdrawAmount);
          viewBalance();
         }
         else{
             System.out.println("please enter the amount in the multiple of 500");
         }
     }
      public void depositAmount(double depositAmount){
           ministmt.put(depositAmount,"amount depposited");
           System.out.println(depositAmount+"deposited successfully!!");
           atm.setBalance(atm.getBalance()+depositAmount);
           viewBalance();
      }
        public void viewMiniStatement(){
             System.out.println("The account History is");
            for(Map.Entry<Double,String>m:ministmt.entrySet()){
                System.out.println(m.getKey()+""+m.getValue());
            }
        }
        public void TransferAmount(double transferAmount){
             ministmt.put(transferAmount,"amount transfered");
             System.out.println("amount is transfered successfully"+transferAmount);
              atm.setBalance(atm.getBalance()-transferAmount);
             viewBalance();
             
        }
       
}
