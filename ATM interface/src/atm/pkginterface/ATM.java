/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atm.pkginterface;

/**
 *
 * @author avula
 */
public class ATM {
    private double balance;
    private double depositAmount;
    private double withdrawAmount;
    private double TransferAmount;
    //default constructor
  public ATM(){
      
  }
    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance)
    {
        this.balance=balance;
    }
    public double getDepositAmount()
    {
        return depositAmount;
    }
    public void setDepositAmount(double depositAmount)
    {
        this.depositAmount=depositAmount;
    }
    public double getWithdrawAmount(){
        return withdrawAmount;
    }
    public void setWithDrawAmount(double withdrawAmount){
        this.withdrawAmount=withdrawAmount;
    }
    public double getTransferAmount(){
        return TransferAmount;
    }
    public void setTransfereAmount(double TransferAmount){
        this.TransferAmount=TransferAmount;
    }
    
}
