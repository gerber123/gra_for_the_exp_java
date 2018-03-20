/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gra.Potwory;



/**
 *
 * @author marci
 */
public class miniBoss extends Potwory
{

    
    public miniBoss()
    {
        this.hp = 3000;
        this.atk= 500;
        this.lvl=1;
    }
    
    public miniBoss(double hp, double atk)
    {
        super(hp, atk);
        this.lvl=1;
        
    }
    
}