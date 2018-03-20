
package Gra;

import Gra.Bohaterowie.Bohaterowie;
import Gra.Potwory.Potwory;
import javax.swing.JOptionPane;

/**
 *
 * @author marci
 */
public class PoWalce {
    
    private  Bohaterowie x;
    private  Potwory y;
    private double ilehp;
    

  
    
    PoWalce(Bohaterowie x)
    {

        this.ilehp=500;

        int aaaa = JOptionPane.showConfirmDialog(null,"Koszt bandażu to 50, czy chcesz kupić aby " 
        + "zregenerować swoje HP " + "czy nie? "," Regeneracja ", JOptionPane.YES_NO_CANCEL_OPTION);
                if(aaaa==0){
                    if(x.hajs<50)
                        JOptionPane.showMessageDialog(null, "Nie masz wystarczające ilośći Hajsu");
                    if(x.hajs>=50){
                x.hajs-=50;    
                    if(x.hpbohater<3000)
                    ilehp=3000-x.hpbohater;
                    x.hpbohater+=ilehp;
                    }
            
                }
            else if(aaaa!=0)
            {
            }
    }

    
}
