package Zapis;


import Gra.Bohaterowie.Bohaterowie;
import Gra.Potwory.Potwory;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marci
 */
public class ZapisIOdczyt 
{
public static void zapisz ( Bohaterowie x,Bohaterowie xx, PrintWriter nazwa)
{
    nazwa.println(x.hpbohater);
    nazwa.println(x.atkbohater);
    nazwa.println(x.lvl);
    nazwa.println(x.exp);
    nazwa.println(x.hajs);
    nazwa.println(xx.hpbohater);
    nazwa.println(xx.atkbohater);
    nazwa.println(xx.lvl);
    nazwa.println(xx.exp);
    nazwa.println(xx.hajs);
    
    nazwa.close();
}
public static void odczytaj ( Bohaterowie x,Bohaterowie xx, File nazwa) throws FileNotFoundException
{

      Scanner in = new Scanner(nazwa);
 
      x.hpbohater= Double.parseDouble(in.nextLine());
      x.atkbohater= Double.parseDouble(in.nextLine());
      x.lvl= Double.parseDouble(in.nextLine());
      x.exp= Double.parseDouble(in.nextLine());
      x.hajs=Double.parseDouble(in.nextLine());
      xx.hpbohater= Double.parseDouble(in.nextLine());
      xx.atkbohater= Double.parseDouble(in.nextLine());
      xx.lvl= Double.parseDouble(in.nextLine());
      xx.exp= Double.parseDouble(in.nextLine());
      xx.hajs= Double.parseDouble(in.nextLine());
      
      
    
    
}
public static void zapiszPotwor ( Potwory x,Potwory xx, Potwory xy,Potwory xyy,Potwory x1,Potwory xx1,Potwory x2,Potwory xx2, Potwory x3,Potwory xx3,Potwory x4,Potwory xx4, PrintWriter nazwa)
{
    nazwa.println(x.hp);
    nazwa.println(x.atk);
    nazwa.println(xx.hp);
    nazwa.println(xx.atk);
    nazwa.println(xy.hp);
    nazwa.println(xy.atk);
    nazwa.println(xyy.hp);
    nazwa.println(xyy.atk);
    nazwa.println(x1.hp);
    nazwa.println(x1.atk);
    nazwa.println(xx1.hp);
    nazwa.println(xx1.atk);
    nazwa.println(x2.hp);
    nazwa.println(x2.atk);
    nazwa.println(xx2.hp);
    nazwa.println(xx2.atk);
    nazwa.println(x3.hp);
    nazwa.println(x3.atk);
    nazwa.println(xx3.hp);
    nazwa.println(xx3.atk);
    nazwa.println(x4.hp);
    nazwa.println(x4.atk);
    nazwa.println(xx4.hp);
    nazwa.println(xx4.atk);

    
    nazwa.close();
}
public static void odczytajPotwor ( Potwory x,Potwory xx, Potwory xy,Potwory xyy,Potwory x1,Potwory xx1,Potwory x2,Potwory xx2, Potwory x3,Potwory xx3,Potwory x4,Potwory xx4,File nazwa) throws FileNotFoundException
{

      Scanner in = new Scanner(nazwa);
 
      x.hp= Double.parseDouble(in.nextLine());
      x.atk= Double.parseDouble(in.nextLine());
      xx.hp=Double.parseDouble(in.nextLine());
      xx.atk=Double.parseDouble(in.nextLine());
      xy.hp=Double.parseDouble(in.nextLine());
      xy.atk=Double.parseDouble(in.nextLine());
      xyy.hp=Double.parseDouble(in.nextLine());
      xyy.atk=Double.parseDouble(in.nextLine());
      x1.hp=Double.parseDouble(in.nextLine());
      x1.atk=Double.parseDouble(in.nextLine());
      xx1.hp=Double.parseDouble(in.nextLine());
      xx1.atk=Double.parseDouble(in.nextLine());
      x2.hp=Double.parseDouble(in.nextLine());
      x2.atk=Double.parseDouble(in.nextLine());
      xx2.hp=Double.parseDouble(in.nextLine());
      xx2.atk=Double.parseDouble(in.nextLine());
      x3.hp=Double.parseDouble(in.nextLine());
      x3.atk=Double.parseDouble(in.nextLine());
      xx3.hp=Double.parseDouble(in.nextLine());
      xx3.atk=Double.parseDouble(in.nextLine());
      x4.hp=Double.parseDouble(in.nextLine());
      x4.atk=Double.parseDouble(in.nextLine());
      xx4.hp=Double.parseDouble(in.nextLine());
      xx4.atk=Double.parseDouble(in.nextLine());
}
    
}

