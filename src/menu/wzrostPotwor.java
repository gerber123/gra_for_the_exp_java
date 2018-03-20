/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;

import Gra.Potwory.Potwory;

/**
 *
 * @author marci
 */
public class wzrostPotwor 
{
    public static Potwory y;
    public static void wzrost(Potwory y)
    {
        y.atk+=15;
        y.hp+=50;
    }
}
