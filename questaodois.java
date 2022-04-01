package kekaproject;

import java.util.Scanner;
public class questaodois {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 float idade;
		 
		 
		 Scanner leia = new Scanner(System.in);
		 
     System.out.print("\n Digite a idade:");
     idade = leia.nextFloat();
     
     if  (idade>=10 && idade<=14) {
    
     System.out.print("Sua categoria é Infantil");
     }
		 
     if (idade>= 15 && idade<=17 ) { 

    	 System.out.print("Sua categoria é Juvenil");
    	  
	}

     if (idade>=18 && idade<=25) {
    	 System.out.print("Sua categoria é Adulto");
     }
}
}
