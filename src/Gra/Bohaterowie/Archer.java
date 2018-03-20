
package Gra.Bohaterowie;

import javax.swing.JOptionPane;

/**
 *
 * @author marci
 */
public class Archer extends Bohaterowie
{
    public void Atakuj()
    {
        System.out.println("Łucznik zadał Ci "+ this.atkbohater+" dmg");
    }
    public void SkillArchera()
    {
        this.atkbohater+=300;
        System.out.println("Łucznik zwiększył swój dmg o 300");
    }
    
        public Archer()
    {
        this.hpbohater=2420;
        this.atkbohater=400;
        this.exp=0;
        this.hajs=50;
        this.lvl=1;
        this.drop="brak";
    }
    
    public Archer(double hpbohater, double atkbohater, double exp,double hajs)
    {
        super(hpbohater, atkbohater, exp, hajs);
       
       }
    
    
    }
    

