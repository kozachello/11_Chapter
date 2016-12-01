// Simpel OO-implementation af Marios Pizzabar. 31/10-2016, Jon Bertelsen

import java.io.*;
import java.util.Scanner;

public class Bestillingsliste
{
   // Attributter
  
   public static final int MAX_ORDRELIST_SIZE = 100; 
        
   public Bestilling[] ordreListe = new Bestilling[MAX_ORDRELIST_SIZE];
   
   public int firstOrder = 0;  
   public int nextOrder = 0;
   public int ordreNr = 1;
   
   // Metoder
      
   public void tilfoejBestilling()
   {
      Scanner console = new Scanner(System.in);

      Bestilling nyOrdre = new Bestilling();

      System.out.print("Indtast Pizzanummer og tryk retur: ");
      nyOrdre.pizzaNr = Integer.parseInt(console.next());
      
      System.out.print("Indtast antal og tryk retur: ");
      nyOrdre.antal = Integer.parseInt(console.next());
      
      System.out.print("Indtast afhentningstidspunkt og tryk retur: ");
      nyOrdre.afhentningstidspunkt = console.next();
      
      nyOrdre.bestillingsNr = ordreNr;
  
      ordreListe[nextOrder] = nyOrdre;
      nextOrder++;  
      ordreNr++;
   }
   
   
   public void visBestillinger()
   {
      for (int i = firstOrder; i < nextOrder; i++)
      {
         System.out.print("Pizzanummer: " + ordreListe[i].pizzaNr + ". ");
         System.out.print("Antal: " + ordreListe[i].antal + ". ");
         System.out.print("Afhentes: " + ordreListe[i].afhentningstidspunkt + ". ");
         System.out.println("Ordrer nummer: " + ordreListe[i].bestillingsNr);
      }
   }

   
   // Fjern første ordre fra bestillingslisten og tilføj til arkiv
   
   public void fjernBestilling()
   {
   
      if (firstOrder < nextOrder)
      {
         System.out.println("Du har fjernet: ");   
         System.out.print("Pizzanummer: " + ordreListe[firstOrder].pizzaNr + ". ");
         System.out.print("Antal: " + ordreListe[firstOrder].antal + ". ");
         System.out.print("Afhentes: " + ordreListe[firstOrder].afhentningstidspunkt + ". ");
         System.out.println("Ordrer nummer: " + ordreListe[firstOrder].bestillingsNr);
         
         try
         {
            PrintStream output = new PrintStream(new FileOutputStream("arkiv.txt", true)); // true for append
            
            output.print("Pizzanummer: " + ordreListe[firstOrder].pizzaNr + ". ");
            output.print("Antal: " + ordreListe[firstOrder].antal + ". ");
            output.print("Afhentes: " + ordreListe[firstOrder].afhentningstidspunkt + ". ");
            output.println("Ordrer nummer: " + ordreListe[firstOrder].bestillingsNr);
         }  
         catch (IOException ex)
         {
            System.out.println("Fejl ved skrivning til fil");
         }
         
         // Ryk alle bestillinger en plads frem i listen:
         
         for (int i = firstOrder; i < nextOrder - 1; i++)
         {
            ordreListe[i] = ordreListe[i+1];
         }
         
         nextOrder--;
      }
      else
      {
         System.out.println("Der er ikke nogle bestillinger at fjerne");
      }
   }

}