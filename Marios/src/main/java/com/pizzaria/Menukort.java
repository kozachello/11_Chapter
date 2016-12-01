// Simpel OO-implementation af Marios Pizzabar. 31/10-2016, Jon Bertelsen

import java.util.*;

public class Menukort
{

   // Attributter
   
   public static final int MAX_PIZZALIST_SIZE = 100;
     
   public Pizza[] pizzaListe = new Pizza[MAX_PIZZALIST_SIZE];
   public int firstPizza = 0;  
   public int nextPizza = 0;
   
   
   // Constructor, som koeres naar Menukort instantieres
   
   public Menukort()
   {
      // Her hard-codes 6 pizzaer til menuen:
      
      tilfoejPizza(1,"Magarita",48,"Med tomat og ost");
      tilfoejPizza(2,"Vesuvio",45,"Med tomat, ost og skinke");
      tilfoejPizza(3,"Napoli",48,"Med tomat, ost, skinke og rejer");
      tilfoejPizza(4,"Hawaii",57,"Med tomat, ost, skinke og ananas");
      tilfoejPizza(5,"Capriciosa",55,"Med tomat, ost, skinke og champigno");
      tilfoejPizza(6,"Palermo",52,"Med tomat, ost, skinke og poelse");      
   }
   
   
   public void tilfoejPizza(int pizzaNr, String navn, int pris, String ingredienser)
   {
    
     Pizza nyPizza = new Pizza();
      
     nyPizza.pizzaNr = pizzaNr;
     nyPizza.navn = navn;
     nyPizza.pris = pris;
     nyPizza.ingredienser = ingredienser;
    
     pizzaListe[nextPizza] = nyPizza;
     nextPizza++;
   }

   
   public void udskriv()
   {
      for (int i = 0; i < nextPizza; i++)
      {
         System.out.printf("%s) %s. %s. %s kr.%n",
         pizzaListe[i].pizzaNr,pizzaListe[i].navn, pizzaListe[i].ingredienser, pizzaListe[i].pris);
      }
   }

}