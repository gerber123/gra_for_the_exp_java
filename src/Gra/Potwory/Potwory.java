
package Gra.Potwory;




/**
 *
 * @author marci
 */
 public class Potwory 
{
         public static Golum golum = new Golum(2500, 150);
    public static Szkielet szkielet= new Szkielet(1600, 350);
    public static Zombie zombie = new Zombie(2000, 200);
    public static Golum golumhp = new Golum(2500, 150);
    public static Szkielet szkielethp= new Szkielet(1600, 350);
    public static Zombie zombiehp = new Zombie(2000, 200);
    
    public double hp;
    public double atk;
    public double lvl;
    
    Potwory()
    {
        
    }

    Potwory(double hp, double atk)
    {
        this.hp=hp;
        this.atk=atk;
    }

    
    

}
