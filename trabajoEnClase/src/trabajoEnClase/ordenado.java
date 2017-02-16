package trabajoEnClase;

import java.util.Arrays;
import java.util.Scanner;

public class ordenado {

	public static void main(String[] args) {
		   
		    Scanner s = new Scanner(System.in);
	        String input[];
	        
	        
	        
	        while(s.hasNext()){
	        	input= s.nextLine().split(" ");
	            int largo=Integer.parseInt(input[0]);
	            if(largo==0){break;}
	        	int arreglo[]=new int[largo];
	        	int ordenado[]=new int[largo];
	        	input= s.nextLine().split(" ");
	        		for(int i=0;i<largo;i++){
	        			arreglo[i]=Integer.parseInt(input[i]);
	        			ordenado[i]=Integer.parseInt(input[i]);
	        			}
	        	Arrays.sort(ordenado);
	        
	        		for(int j=0;j<largo;j++){
	        	
	        			if (j==largo-1 && arreglo[j]==ordenado[j]){
	        		
	        			System.out.println("Ordenado");
	        		
	        			}else if(arreglo[j]!=ordenado[j]){
	        			
	        			System.out.println("NO Ordenado");
	        			break;
	        			}
	        	
	        	
	        		}
	        }   

	}

}
