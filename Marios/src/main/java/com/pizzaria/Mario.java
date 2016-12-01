// Simpel OO-implementation af Marios Pizzabar. 31/10-2016, Jon Bertelsen

import java.util.Scanner;

public class Mario
{
   public static void main(String[] args)
   {  
   
      // Instantier objekter:
   
      Bestillingsliste ordrer = new Bestillingsliste();
      Menukort pizzaer = new Menukort();
            
      // Inistantier variabler og scanner:
      
      boolean running = true;
      Scanner console = new Scanner(System.in);
      
      // Menu-loop
   
      while (running)
      {
         System.out.println("");
         System.out.println("****************************************************");
         System.out.println(" Menu system!                                       ");
         System.out.println(" [1]Menu Kort        [2]Indtast Order               ");
         System.out.println(" [3]Vis bestillinger [4]Fjern bestilling  [exit]    ");
         System.out.println("****************************************************");
         System.out.print("> ");
      
         String str = console.next();
         
         if (str.equals("exit"))
         {
            running = false;
         }
         else if(str.equals("1"))
         {
            System.out.println("****************************************************");
            System.out.println(" Menu Kort                                            ");           
            System.out.println("****************************************************");
            
            pizzaer.udskriv();
            
         }         
         else if(str.equals("2"))
         {
            System.out.println("****************************************************");
            System.out.println(" Indtast Order                                            ");           
            System.out.println("****************************************************");
            
            ordrer.tilfoejBestilling();
         }
         else if(str.equals("3"))
         {
            System.out.println("****************************************************");
            System.out.println(" Vis bestillinger                                            ");           
            System.out.println("****************************************************");
            
            ordrer.visBestillinger();
         }
         else if(str.equals("4"))
         {
            System.out.println("****************************************************");
            System.out.println(" Fjern bestilling                                             ");           
            System.out.println("****************************************************");
            
            ordrer.fjernBestilling();  
         }
                  
      }
      
      System.out.println("exiting the program");
   }
}