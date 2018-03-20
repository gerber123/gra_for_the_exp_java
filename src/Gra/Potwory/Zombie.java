
package Gra.Potwory;

/**
 *
 * @author marci
 */
public class Zombie extends Potwory
{
     public void atakuj()
    {
        System.out.println("Zombie zabrał Ci  "+this.atk+"hp");
    }
    
    public Zombie()
    {
        this.hp = 2600;
        this.atk= 350;
    }
    
    public Zombie(double hp, double atk)
    {
        super(hp, atk);
        this.lvl=1;
    }
}
