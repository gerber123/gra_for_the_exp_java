package Gra.Potwory;

/**
 *
 * @author marci
 */
public class Szkielet extends Potwory
{
    public void atakuj()
    {
        System.out.println("Szkielet zabrał Ci"+this.atk+"hp");
    }
    
    public Szkielet()
    {
        this.hp = 2200;
        this.atk= 500;
    }
    
    public Szkielet(double hp, double atk)
    {
        super(hp, atk);
        this.lvl=1;
        
    }
    
}
