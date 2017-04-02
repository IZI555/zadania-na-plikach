

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class main {
	public static void zad1 (  String [] tab ) throws FileNotFoundException
	{
		
		
		  PrintWriter zapis = new PrintWriter("zadanie 1.txt");
		  zapis.println("a)");

		  for(int i = 0;i<tab.length;i++)
		{
			  char[] tabCHAR =tab[i].toCharArray(); 
			  int liczA= 0;
			 for(int j  = 0; j<tabCHAR.length;j++)
			 {
				 
				 	if(tabCHAR[j]=='A' )
				 	{
				 		liczA ++;
				 	}
				 	
			 }
					 if(liczA == 2 )
					 	{
						 zapis.println(""+tab[i]);
						 }
		}
		  zapis.close();
	}
	
	public static void zad2 (  String [] tab ) throws FileNotFoundException
	{
		
		
		  PrintWriter zapis = new PrintWriter("zadanie 2.txt");
		  zapis.println("b)");
		  int globalna_liczba_znakow=0;	
		  
		  for(int i = 0;i<tab.length;i++)
			{
				  char[] tabCHAR =tab[i].toCharArray(); 
				  zapis.println(""+tab[i]+ "("+tabCHAR.length+")");
				  globalna_liczba_znakow+=tabCHAR.length;
							 
			}
		  zapis.println(globalna_liczba_znakow);
		  zapis.close();
	}
	public static void zad3 (  String [] tab ) throws FileNotFoundException
	{
		
		
		  PrintWriter zapis = new PrintWriter("zadanie 3.txt");
		  
		  
		  for(int i = 0;i<tab.length;i++)
			{
				  char[] tabCHAR =tab[i].toCharArray(); 
					boolean flaga=true;
					
					for(int j =0;j<tabCHAR.length;j++ )
					{
						if(tabCHAR[j]==(tabCHAR[(tabCHAR.length-1)-j]))
						{
							
						}	
						else
						{
							flaga=false;
							break;
						}
						
					}
				


					if(flaga)
					{
						//System.out.println("Wyraz jest palindromem.");
						zapis.println(tab[i]);
					}
					else
					{
						//System.out.println("wyraz nie jest palindromem.");
					}
				
				  
							 
			}
		  
		  zapis.close();

	}
		    static void zad4(String[] tab)throws FileNotFoundException
		    {
		    	
		    	PrintWriter zapis = new PrintWriter("zadanie 4.txt");
		    	int a = 0;
		    	for(int i =0;i<tab.length;i++ )
		    		
		    	{
		    		if(tab[i].contains("AA"))
		    				{
		    			zapis.println(tab[i]);
		    			a++;
		    				}
		    		zapis.println("³¹cznie jest " +a+"wyrazow ktore maja 2 A obok siebie");
		    		zapis.close();
		    	}
		    	

	}
public static void main(String[] args) throws FileNotFoundException
{
	String nazwa = "dane.txt";
	  File file = new File(nazwa);
    Scanner in = new Scanner(file);
//    String lower = t.toLowerCase(); // Convert to lowercase
            int licznik  = 0;
            //SPRAWDZENIE ILE LINI POSIADA PLIK
        while(in.hasNextLine()) // sprawdzenie czy plik posiada nastepna linie 
        {
      	  licznik = licznik+1;// licznik++
            String o=in.nextLine(); // odczyt bie¿¹cej lini w pliku tekstowym
            //System.out.println(""+o.toLowerCase());
        }
        System.out.println("plik ma "+licznik+" lini");
        String[] dane = new String[licznik];
      	
      	
        in.close(); // zamkniecie odczytu obecnego pliku
        
       
        in = new Scanner(file);// zamkniecie skanera i ponowna jego deklaracja umozliwia odczytanie danych z pliku po raz kolejny
        //PRZYPISANIE LINI Z PLIKU DO TABLICY
        int i = 0;
        while(in.hasNextLine())
        {
            dane[i++] =in.nextLine();
            //System.out.println(""+o.toUpperCase());
        }
        
	
	
	zad1(dane);
	zad2(dane);
	zad3(dane);
	zad4(dane);
	}
}


