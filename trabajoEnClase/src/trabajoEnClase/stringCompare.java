//https://www.hackerrank.com/challenges/java-string-compare

package trabajoEnClase;

import java.io.File;
import java.util.Scanner;

public class stringCompare {

	public static void main(String[] args) {
		Scanner scan;
		scan = new Scanner(System.in);
		String input;
		String ancho;
		input=new String(scan.nextLine());
		ancho=new String(scan.nextLine());
		int ancho_int=Integer.parseInt(ancho);
		int inicio=0;
		String temp;
		temp=new String();
		temp=input.substring(inicio,inicio+ancho_int );
		String mayor;
		mayor=new String("");
		String menor;
		menor=new String("");
		int nuevo_Inicio=inicio+ancho_int;
		
		for(int i=0;i<input.length()-ancho_int;i=i+ancho_int){
			int comp=temp.compareTo(input.substring(i, i+ancho_int));
			int compMenor=temp.compareTo(menor);
			int compMayor=temp.compareTo(mayor);
			
			if(comp<0 && compMenor<0 ){
				menor=temp;
			}else if(comp<0 && compMayor>0){
				mayor=temp;
			}
			
		}		
		
		System.out.println(mayor);
		
		
		

	}

	

}
