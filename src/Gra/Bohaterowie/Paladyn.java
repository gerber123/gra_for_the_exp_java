
package Gra.Bohaterowie;

/**
 *
 * @author marci
 */
public class Paladyn extends Bohaterowie
{

    public Paladyn()
    {
        this.hpbohater=3220;
        this.atkbohater=300;
        this.exp=0;
        this.hajs=50;
        this.lvl=1;
        this.drop="brak";

    }
    
    
    public Paladyn(double hpbohater, double atkbohater, double exp,double hajs)
    {
        super(hpbohater, atkbohater, exp, hajs);
    }
    
}
