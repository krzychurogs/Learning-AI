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
		ArrayList<Float> b = new ArrayList<Float>();
		ArrayList<Float> c = new ArrayList<Float>();
		ArrayList<Float> d = new ArrayList<Float>();
		ArrayList<String> e = new ArrayList<String>();
		BufferedReader buff = null;
		InputStream input = JavaApplication23.class.getResourceAsStream("learning.txt");
                InputStreamReader inputReader = new InputStreamReader(input);
			buff = new BufferedReader(inputReader);
			String line=null;
			while((line = buff.readLine()) != null) {
				line=line.replaceAll(",", ".");
				String rozdziel[]=line.split("[;)\\[\\|]");
				for(int i=0;i<rozdziel.length;i++) {
					a.add(Float.parseFloat(rozdziel[1]));
					b.add(Float.parseFloat(rozdziel[2]));
					c.add(Float.parseFloat(rozdziel[5]));
					d.add(Float.parseFloat(rozdziel[6]));
					e.add(rozdziel[8]);
				
				}
				 
				
			}
					
		
		Scanner in = new Scanner(System.in);
		 float x,y;
		 System.out.println("Podaj liczbe" );
		  x=in.nextFloat();
		 System.out.println("Podaj druga" );
		  y=in.nextFloat();
		 for(int i=0;i<a.size();i++) {
			 if((x>a.get(i)&&x<b.get(i))&& (y>c.get(i) && y<d.get(i))) {
				 System.out.println(e.get(i));
				 break;
			 }
		 }
	}

}
