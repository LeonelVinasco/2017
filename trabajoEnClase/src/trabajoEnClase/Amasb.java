package trabajoEnClase;
import java.math.BigInteger;
import java.util.*;

public class Amasb {

	public static void main(String[] args) {
	        Scanner scan;
			scan = new Scanner(System.in);
			String input[];
			input=scan.nextLine().split(" ");
			int casos=Integer.parseInt(input[0]);			
			for(int i=0;i<casos;i++){
				input=scan.nextLine().split(" "); 
				BigInteger a=new BigInteger(input[0]);
				BigInteger b=new BigInteger(input[1]);
				System.out.println(a.add(b));
			
	    }

	}

}
