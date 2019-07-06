/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication23;


import java.awt.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

public class JavaApplication23 {

	public static void main(String[] args) throws IOException {
		ArrayList<Float> a = new ArrayList<Float>();
		ArrayList<String> e = new ArrayList<String>();
		BufferedReader bf = null;
		InputStream plik = JavaApplication23.class.getResourceAsStream("learning.txt");
                InputStreamReader ir = new InputStreamReader(plik);
			bf = new BufferedReader(ir);
			String line=null;
                        
			while((line = bf.readLine()) != null) {//czytanie z pliku
				line=line.replaceAll(",", ".");
				String rozdziel[]=line.split("[;)\\[\\|]");
                                int i=1;		
					a.add(Float.parseFloat(rozdziel[i]));
                                        a.add(Float.parseFloat(rozdziel[i+1]));
					a.add(Float.parseFloat(rozdziel[i+4]));
					a.add(Float.parseFloat(rozdziel[i+5]));
					e.add(rozdziel[i+7]);
                                 i++;       
				
					
			}
                       
               
         
		int licznika=0;
                int licznikb=0;
                int licznikc=0;
                for(int i=0;i<e.size();i++)
                {
                    if(e.get(i).equals("A"))
                    {
                        licznika++;//50
                    }
                    if(e.get(i).equals("B"))
                    {
                        licznikb++;//50
                    }
                    if(e.get(i).equals("C"))
                    {
                        licznikc++;//50
                    }
                    
                }
                
                    double prawdopodobienstwoa,prawdopodobienstwob,prawdopodobienstwoc;
                    prawdopodobienstwoa= (double) licznika / (double) e.size();//0.3333.. 
                    prawdopodobienstwob=(double) licznikb / (double) e.size();//0.3333.. (50 literek B z 150)
                    prawdopodobienstwoc=(double) licznikc / (double) e.size();//0.3333...
                    
               
            
		
		Scanner in = new Scanner(System.in);
		 float x,y;
		 System.out.println("Podaj liczbe" );
		  x=in.nextFloat();
		 System.out.println("Podaj druga" );
		  y=in.nextFloat();
                  int licznikprawda=0;
                  int licznikprawdb=0;
                  int licznikprawdc=0;
                   int j=0;
		 for(int i=0;i<a.size();i+=4) {
                    
			 if((x>a.get(i)&&x<a.get(i+1))&& (y>a.get(i+2) && y<a.get(i+3))&& e.get(j).equals("A")) {
				 licznikprawda++;
			 }           
                        if((x>a.get(i)&&x<a.get(i+1))&& (y>a.get(i+2) && y<a.get(i+3))&& e.get(j).equals("B"))
                         {
                              licznikprawdb++;  //liczba zdarzen(liczb w przedzialach pod warunkiem "decyzji" B
                         }
                        if((x>a.get(i)&&x<a.get(i+1))&& (y>a.get(i+2) && y<a.get(i+3))&& e.get(j).equals("C"))
                         {
                             licznikprawdc++;
                         }
                     j++;
                }
                 double warunkowea=(double)licznikprawda/150;
                 double warunkoweb=(double)licznikprawdb/150;
                 double warunkowec=(double)licznikprawdc/150;
                 
                 double wynika=(double)warunkowea*(double)prawdopodobienstwoa;//
                 double wynikb=(double)warunkoweb*(double)prawdopodobienstwob;//prawdopodobienstwo warunkowe *prawdopodobinestwo decyzji(a,b,c)
                 double wynikc=(double)warunkowec*(double)prawdopodobienstwoc;//
                 
                 if(wynika>wynikb && wynika>wynikc)
                 {
                     System.out.println("Liczby nalezy do przedzialu a");
                 }
                 else if(wynikb>wynika && wynikb>wynikc)
                 {
                     System.out.println("Liczby nalezy do przedzialu b");
                 }
                 else if(wynikc>wynika && wynikc>wynikb)
                 {
                     System.out.println("Liczby nalezy do przedzialu c");
                 }
                 
                 
}
}

    