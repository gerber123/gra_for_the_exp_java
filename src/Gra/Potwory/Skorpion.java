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
public class Skorpion extends Potwory
{

    
    public Skorpion()
    {
        this.hp = 4900;
        this.atk= 350;
        this.lvl=1;
    }
    
    public Skorpion(double hp, double atk)
    {
        super(hp, atk);
        this.lvl=1;
        
    }
    
}