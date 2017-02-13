//https://www.hackerrank.com/challenges/java-string-compare

package trabajoEnClase;


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
		String menor;
		String mayorTemp;
		String menorTemp;
		
		int compMenor=0;
		int compMayor=0;
		
		temp=input.substring(inicio,inicio+ancho_int );
		menor=new String(temp);
		mayor=new String(temp);
		for(int i=ancho_int;i<=input.length()-ancho_int;i=i+1){
			
			
			int comp=temp.compareTo(input.substring(i, i+ancho_int));
			
			if(comp<=0){
				menorTemp=temp;
				mayorTemp=input.substring(i, i+ancho_int);
			}else{
				menorTemp=input.substring(i, i+ancho_int);
				mayorTemp=temp;
			}
			compMenor=menorTemp.compareTo(menor);
			compMayor=mayorTemp.compareTo(mayor);
			
			if(compMenor<0){
				menor=menorTemp;
				
			}
			if(compMayor>0){
				mayor=mayorTemp;
			}
			temp=input.substring(i, i+ancho_int);
		}		
		System.out.println(menor);
		System.out.println(mayor);
		
		
		
		

	}

	

}
