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
public class Smoczek extends Potwory
{

    
    public Smoczek()
    {
        this.hp = 5000;
        this.atk= 400;
        this.lvl=1;
    }
    
    public Smoczek(double hp, double atk)
    {
        super(hp, atk);
        this.lvl=1;
        
    }
    
}