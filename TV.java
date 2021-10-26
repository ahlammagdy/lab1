/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assig.pkg1;

/**
 *
 * @author NOTEBOOK
 */
public class TV {
    private int channel ;
    private int volume;
    private boolean on;
    
   public TV()
          {
          }
   public void TrueOn(boolean x)
   {
       if(x==true)
           System.out.println("the TV is on ");
       else
          System.out.println("the TV is not on "); 
   }
    public void TrueOff(boolean x)
   {
       if(x==false)
           System.out.println("the TV is off ");
       else
          System.out.println("the TV is not off "); 
   }
    public void setChannel(int ch)
   {
       if(on && ch >=1 && ch<=120)
           channel=ch;
   }
   public void setvolume(int vol)
   {
       if(on && vol >=1 && vol<=7)
           volume=vol;
   }
   public void ChannelUp()
   {
       if(on && channel<=120)
           channel++;
   }public void ChannelDown()
   {
       if(on && channel >=1)
           channel--;
   }
   public void volumeUp()
   {
       if(on && volume<=7)
           volume++;
   }
   public void volumeDown()
   {
       if(on && volume >=1)
           volume--;
   }
   
}
