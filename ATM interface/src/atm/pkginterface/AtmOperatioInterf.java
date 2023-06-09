/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atm.pkginterface;

/**
 *
 * @author avula
 */
public interface AtmOperatioInterf {
    public void viewBalance();
     public void withdrawAmount(double withdrawAmount);
      public void depositAmount(double depositAmount);
       public void viewMiniStatement();
       public void TransferAmount(double transferAmount);
}
