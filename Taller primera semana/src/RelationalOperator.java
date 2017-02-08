import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;


public class RelationalOperator {

	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner scan;
		File f = new File("C_1.in");
		if(f.exists()){
			scan = new Scanner(f);
		}else{
			scan = new Scanner(System.in);
		}
		
		String[] input;
		input=scan.nextLine().split(" ");
		int casos=Integer.parseInt(input[0]);
		
		for(int i=0;i<casos;i++){
			input=scan.nextLine().split(" ");
			
			BigInteger num1=new BigInteger(input[0]);
			BigInteger num2=new BigInteger(input[1]);
			int comp=num1.compareTo(num2);
			if(comp==-1){
				System.out.println("<");	
			}else if(comp==0){
				System.out.println("=");
			}else{
				System.out.println(">");
			}
			
		}

	}


}
