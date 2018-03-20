/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eq;

import Gra.Bohaterowie.Bohaterowie;

/**
 *
 * @author marci
 */
public class ekiw extends EkwipunekMag
{
    public static Bohaterowie x;
    public static String drop;
    public static String hajs;
    public static String sprawdzdrop(Bohaterowie x)
    {
        return "Posiadane przedmioty: "+x.drop;
    }    
    public static String sprawdzhajs(Bohaterowie x)
    {
        return "Posiadane złoto: "+x.hajs;
    }
}
