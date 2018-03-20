
package Gra;
import Gra.Bohaterowie.Bohaterowie;
import Gra.Potwory.Potwory;
import Gra.gra;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author marci
 */
public class walka extends gra {

    private  Bohaterowie x;
    private  Potwory y;

    public void walcz(Bohaterowie x, Potwory y) throws FileNotFoundException
    {
       
            this.x=x;
            this.y=y;
            
//            File odczyt = new File("C:\\Users\\marci\\Documents\\NetBeansProjects\\JavaApplication30\\Prosze.txt");
//        
//             Scanner in = new Scanner(odczyt);
//             this.x.hpbohater = in.nextDouble();
//             this.x.atkbohater = in.nextDouble();
//            this.x.exp=in.nextDouble();
//             this.x.hajs=in.nextDouble();
//            System.out.println("HP"+x.hpbohater+"Atk: "+x.atkbohater+" exp"+x.exp+"hajs :"+x.hajs);
            
            while(x.hpbohater>=0&&y.hp>=0)
        {
         
            x.hpbohater-=y.atk;
            y.hp-=x.atkbohater;
            
               String walka=("Hp "+x.getClass().getSimpleName()+" po wymianie ciosów to "+x.hpbohater);
            String walka1=("Hp "+y.getClass().getSimpleName()+" , po wymianie ciosów to "+y.hp);
            JOptionPane.showMessageDialog(null, walka);
            JOptionPane.showMessageDialog(null, walka1);
            
        }
            String wynik1=(y.getClass().getSimpleName()+" nie żyje i umarł a hp "+
                x.getClass().getSimpleName()+" wynosi : "+x.hpbohater);
            String wynik2=(x.getClass().getSimpleName()+" przegrał walke, i nie zyje, a Hp "
                +y.getClass().getSimpleName()+" to "+y.hp);
            if(y.hp<=0){
                JOptionPane.showMessageDialog(null, wynik1);
                x.exp+=30;
                x.hajs+=40;
                JOptionPane.showMessageDialog(null, "Twój exp wynosi "+x.exp+"\n Wydropiło Ci "
                        + "40 golda, a Stan Twojego Portfela to "+x.hajs);
                  Sklep zakupy = new Sklep();
                  
                  if(x.hajs>200){
                     int a=JOptionPane.showConfirmDialog(null, "Czy Chciałbyś ulepszyć swoją broń aby zwiększyć atak ?", "zakupy", 0);

                        if(a==0)
                        {
                            JOptionPane.showMessageDialog(null, "Ulepszyłeś broń, Twój atak rośnie o 150");
                            x.atkbohater+=150;
                            x.hajs-=120;
                        }
                        else if(a!=0)
          {
              
          }
                  }
                    if(x.exp%60==0){
                        
                        
                        this.x.atkbohater+=150;
            JOptionPane.showMessageDialog(null, "LVL Up Twój atak rośnie o 150 \n po walce Twoje staty to"
                    + " atk: "+x.atkbohater);  
//                        System.out.println(this.x.atkbohater);
            
                        
//                        if(x.exp%120==0)
//                        {
//                            JOptionPane.showMessageDialog(null, "Zabiłeś "+y.getClass().getSimpleName()+" Wystarczającą"
//                                    + "ilość razy, odradza się mocniejszy ");
//                        
////                            if(x.exp>=120)
//                            y.atk=y.atk+400;
//                            y.hp=y.hp+2000;
////                            System.out.println(y.atk+"a hp potwora to"+y.hp);
//                    }
//                        
    }
            }
            else if(x.hpbohater<=0)
                JOptionPane.showMessageDialog(null, wynik2);    
            
                PrintWriter zapis = new PrintWriter("Prosze.txt");
        
        zapis.println(x.hpbohater);
        zapis.println(x.atkbohater);
        zapis.println(x.exp);
        zapis.println(x.hajs);
        
        zapis.close();
        }

        }

    
        
    

