
package Gra;
import Gra.Potwory.Szkielet;
import Gra.Potwory.Zombie;
import Gra.Potwory.Golum;
import Gra.Bohaterowie.Paladyn;
import Gra.Bohaterowie.Archer;
import Gra.Bohaterowie.Mag;
import Gra.Potwory.Potwory;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;
import menu.MenuMag;


/**
 *
 * @author marci
 */



public class gra {


    public static void main(String[] args) throws IOException 
    {
        
        
        Szkielet szkielet = new Szkielet(1250,300);
        Zombie zombie = new Zombie (2000, 200);
        Golum golum = new Golum (1500, 233);
        
        

        
        Paladyn Pal = new Paladyn (2500, 300,0,0);
        Archer Arch = new Archer (2000,700,0,0);
        Mag mag = new Mag (2050,550,0,0);
        
          
        walka pojedynek1 = new walka();
        

       
        String x;



        x = JOptionPane.showInputDialog("Twoje klasy do wyboru to: Paladyn, Mag, Archer");
    
     
             




if(null!=x)
switch (x) 
{
    case "Archer":
        String y1=("Wybrałeś klasę Archer, Twoja broń to łuk");
        JOptionPane.showMessageDialog(null, y1);
        break;
    case "Paladyn":
        String y2=("Wybrałeś klasę Paladyn, Twoja broń to młot");
        JOptionPane.showMessageDialog(null, y2);
        break;
    case "Mag":
        String y3=("Wybrałeś maga, a Twoja broń to różdzka");
        JOptionPane.showMessageDialog(null, y3);
   
        break;
    default:
        break;
}


        
   for(;;){        

       String y; 

       y = JOptionPane.showInputDialog("Twoi przeciwnicy to: Golum, Szkielet, Zombie, wybierz jednego");
       switch(y)
       {
           case "Golum":
               String x1 = ("Jestem twardy i umiem mocno bić arrr.");
               JOptionPane.showMessageDialog(null, x1);
               break;
           case "Szkielet":
               String x2=("Tank ze mnie sredniawka, ale moc w mych kosciach od urodzenia");
               JOptionPane.showMessageDialog(null, x2);
               break;
           case "Zombie":
               String x3=("grrrr.... euuuu... braaaainnnn!");
               JOptionPane.showMessageDialog(null, x3);
               break;
           default:
               break;
       }
       
        String a=("Walczyć ze sobą będzie  "+x + " i "+ y );
        
        JOptionPane.showMessageDialog(null, a);
        
     
               
        if("Paladyn".equalsIgnoreCase(x)&&"Szkielet".equalsIgnoreCase(y))
        {
            
            pojedynek1.walcz(Pal,szkielet );
            szkielet.hp+=1250;
            PoWalce leczPal= new PoWalce(Pal);
        }
        
        else if("Paladyn".equalsIgnoreCase(x)&&"Golum".equalsIgnoreCase(y))
        {
            pojedynek1.walcz(Pal, golum);
            golum.hp+=1500;
//            if(Pal.exp>120){
//                golum.atk+=400;
//                golum.hp+=2000;
//            }
            PoWalce leczPal= new PoWalce(Pal);
        }
                
        else if("Paladyn".equalsIgnoreCase(x)&&"Zombie".equalsIgnoreCase(y))
        {
            pojedynek1.walcz(Pal, zombie);
            zombie.hp+=2000;
            
            PoWalce leczPal= new PoWalce(Pal);
        }
        else if("Archer".equalsIgnoreCase(x)&&"Szkielet".equalsIgnoreCase(y))
        {
            pojedynek1.walcz(Arch, szkielet);
            szkielet.hp+=1250;
            PoWalce leczArch= new PoWalce(Arch);
        }
        else if("Archer".equalsIgnoreCase(x)&&"Golum".equalsIgnoreCase(y))
        {
            pojedynek1.walcz(Arch, golum);
            golum.hp+=1500;
            PoWalce leczArch= new PoWalce(Arch);
        }
        else if("Archer".equalsIgnoreCase(x)&&"Zombie".equalsIgnoreCase(y))
        {
            pojedynek1.walcz(Arch, zombie);
            zombie.hp+=2000;
            PoWalce leczArch= new PoWalce(Arch);
        }
        else if("Mag".equalsIgnoreCase(x)&&"Szkielet".equalsIgnoreCase(y))
        {
            pojedynek1.walcz(mag, szkielet);
            szkielet.hp+=1250;
            PoWalce leczmaga= new PoWalce(mag);
        }
        else if("Mag".equalsIgnoreCase(x)&&"Zombie".equalsIgnoreCase(y))
        {
                pojedynek1.walcz(mag, zombie);
                zombie.hp+=2000;
                PoWalce leczmaga= new PoWalce(mag);
        }       
        else if("Mag".equalsIgnoreCase(x)&&"Golum".equalsIgnoreCase(y))
        {
            pojedynek1.walcz(mag, golum);
            golum.hp+=1500;
            PoWalce leczmaga= new PoWalce(mag);
        

        }
        
          
        if(mag.exp>=120||Pal.exp>=120||Arch.exp>=120)
        {
            
            JOptionPane.showMessageDialog(null,"It Will be hard... Take Care bro ! Potwory rosną w siłe !");
            golum.atk+=100;
            zombie.atk+=100;
            szkielet.atk+=100;
            golum.hp+=100;
            zombie.hp+=100;
            szkielet.hp+=100;
        }}
     
       
    }

}




