/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bosy;

import Gra.Bohaterowie.Bohaterowie;
import Gra.Potwory.Potwory;
import static Logowanie.Logowanie.rand;
import javax.swing.JOptionPane;
import static menu.MenuMag.boss;
import static Gra.Potwory.Potwory.*;
import static WalkaLvl5Archer.Powyzej5potwory.*;
import static menu.MenuMag.miniboss;
import static menu.MenuMag.miniboss1;



/**
 *
 * @author marci
 */
public class WalkaZBosikami 
{
    public static Bohaterowie x;
    public static Bohaterowie xhp;
    public static Potwory y;
    public static Potwory yhp;
    public static String a;
    public static String b;
    public static int iloscwalk=1;
    public static void walcz(Bohaterowie x, Bohaterowie xhp, Potwory y)
    {
        x.hpbohater-=y.atk;
        y.hp-=x.atkbohater;
    
    }
    
      
    
        public static String sprawdzhp(Bohaterowie x)
    {
        return "Hp bohatera to: "+x.hpbohater;
    }    
        public static String sprawdzhpp(Potwory y)
    {
        return "Hp Potwora to: "+y.hp;
    }   
        
            public static boolean sprawdz(Bohaterowie x, Bohaterowie xhp, Potwory y, Potwory yhp)
    {
        
        if(x.hpbohater<=0&&y.hp<=0)
        {
            JOptionPane.showMessageDialog(null, "Remis");
            x.hpbohater=xhp.hpbohater;
            y.hp=yhp.hp;
            return true;
        }
        
        else if(x.hpbohater<=0)
        {
            JOptionPane.showMessageDialog(null, "Walke wygrywa :"+y.getClass().getName());
            
  
            return false;

        }
        else if(y.hp<=0)
        {
             int   dropexp=0;
                     int  drophajsu=0;
                     int droprare = 0;
            if(y.atk==boss.atk)
            {
         drophajsu =  rand.nextInt(100)+50;
         dropexp = rand.nextInt(300)+90; 
         droprare=rand.nextInt(1);
            }
            else if(y.atk==miniboss.atk)
            {
         drophajsu =  rand.nextInt(30)+20;
         dropexp = rand.nextInt(20)+20; 
         droprare=rand.nextInt(1)+6;
            }

                        else if(y.atk!=boss.atk&&y.atk!=miniboss.atk&&y.atk!=miniboss1.atk&&y.atk!=skorpion.atk&&y.atk!=wilk.atk&&y.atk!=smok.atk)
            {
         drophajsu =  rand.nextInt(20)+30;
         dropexp = rand.nextInt(20)+20; 
         droprare=rand.nextInt(1)+6;
            }
                        else if(y.atk!=boss.atk&&y.atk!=miniboss.atk&&y.atk!=miniboss1.atk)
            {
         drophajsu =  rand.nextInt(45)+50;
         dropexp = rand.nextInt(50)+50; 
         droprare=rand.nextInt(1)+4;
            }
            
            
            

                

            
            iloscwalk+=1;
            y.hp=yhp.hp;
            x.exp+=dropexp;
            x.hajs+=drophajsu;
            System.out.println(x.getClass().getName());
            JOptionPane.showMessageDialog(null, "Walka Wygrana, ! \n Drop to: "+drophajsu+" golda\n a exp to: "+dropexp);
            
            if(droprare==0)
            {
                x.drop="kamien";
                JOptionPane.showMessageDialog(null, "Udało Ci się wydropić magiczny kamień, użyj go w sklepie");
            }

            if(x.exp>=xhp.exp)
            {
                
                x.lvl+=1;
                x.atkbohater+=50;
                x.hpbohater+=50;
                xhp.hpbohater+=50;
                x.exp=0;
                xhp.exp+=60;
                if(y.atk!=boss.atk&&y.atk!=miniboss.atk&&y.atk!=miniboss1.atk)
                {
            menu.wzrostPotwor.wzrost(wilk);
            menu.wzrostPotwor.wzrost(wilkhp);
            menu.wzrostPotwor.wzrost(smok);
            menu.wzrostPotwor.wzrost(smokhp);
            menu.wzrostPotwor.wzrost(skorpion);
            menu.wzrostPotwor.wzrost(skorpionhp);
            menu.wzrostPotwor.wzrost(golum);
            menu.wzrostPotwor.wzrost(golumhp);
            menu.wzrostPotwor.wzrost(szkielethp);
            menu.wzrostPotwor.wzrost(szkielet);
            menu.wzrostPotwor.wzrost(zombie);
            menu.wzrostPotwor.wzrost(zombiehp);
                }

                
                x.hpbohater=xhp.hpbohater;
                JOptionPane.showMessageDialog(null, "LVL UP ! Twoje siła i życie zwiększyły się o 50 \n A Twoje Zdrowie się zregenerowało");
                
            }
            return true;


}
        return false;
    }
    
}
