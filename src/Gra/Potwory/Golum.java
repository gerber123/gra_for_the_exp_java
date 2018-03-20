
package Gra.Potwory;

/**
 *
 * @author marci
 */
public class Golum extends Potwory
{
     public void atakuj()
    {
        System.out.println("Golum zabrał Ci "+this.atk+"hp");
    }
    
    public Golum()
    {
        this.hp = 3000;
        this.atk= 200;
    }
    
    public Golum(double hp, double atk)
    {
        super(hp, atk);
        this.lvl=1;

    }
}
