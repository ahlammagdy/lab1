/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assig.pkg1.pkg2;

/**
 *
 * @author NOTEBOOK
 */
public class account {
    private int id ;
    private double balance;
    private double AIR ;
    private java.util.Date datecreated;
    //private Date dateCreated; 
    
    account()
    {
        id=0;
        balance=0;
        AIR=0;
    }
    account(int x ,double y)
    {
        id=x;
        balance=y;
    }
    public void SetData(int x, double y)
    {
        id=x;
        balance=y;
       
    }
     public void SetAIR(double z)
     {
         AIR=z;
     }
     public void GetData()
     {
         System.out.println("the id is  " + id);
         System.out.println("the balance is  " + balance);
         System.out.println("the AIR is  " + AIR);
     }
     public String GetDate()
     {
         return this.datecreated.toString();
     }
     public double GetdMonIeRate()
     {
         return(AIR/100)/12;
     }
     public void Withdraw(double w)
     {
         balance-=w;
         System.out.println("the balance after withdraw is  " + balance);
     }
     public void Deposit(double A)
     {
         balance+=A;
         System.out.println("the balance after deposit is  " + balance);
     }
    
}
