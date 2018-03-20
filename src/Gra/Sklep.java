
package Gra;
import java.util.Scanner;
import Gra.Potwory.Potwory;
import Gra.Potwory.Szkielet;
import Gra.Potwory.Zombie;
import Gra.Potwory.Golum;
import Gra.Bohaterowie.Bohaterowie;
import Gra.Bohaterowie.Paladyn;
import Gra.Bohaterowie.Archer;
import Gra.Bohaterowie.Mag;
import static com.sun.javafx.application.PlatformImpl.exit;
import java.io.IOException;
import static java.lang.System.exit;
import java.util.Arrays;
import static javafx.application.Platform.exit;
import javax.swing.JOptionPane;
import static jdk.nashorn.internal.objects.Global.exit;
/**
 *
 * @author marci
 */
public class Sklep {
    
    private Bohaterowie x;
    public int a;
    
    
    public void benc() 
    {
          int a=JOptionPane.showConfirmDialog(null, "Czy Chciałbyś kupić miecza szmato ?", "zakupy", 0);
          
          if(a==0)
          {
              JOptionPane.showMessageDialog(null, "Kupiłeś Miecz smoka Orpelsona, Twój atak rośnie o 150");
              x.atkbohater+=150;
          }
          else if(a!=0)
          {
              
          }
    }
    
}
