/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;

import Gra.Bohaterowie.Bohaterowie;

/**
 *
 * @author marci
 */
public class kamien 
{
    public static Bohaterowie x;
    public static boolean sprawdz(Bohaterowie x)
    {
        if(x.drop.equals("kamien"))
            return true;
        else
            return false;
    }
}
