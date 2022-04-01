package kekaproject;

import java.util.Scanner;

public class HelloWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		 float nota1,nota2,nota3,media,m;
		 
		 Scanner leia = new Scanner(System.in);
		 
		 System.out.println("\n Entre com o primeiro número:");
		 nota1 = leia.nextFloat();
		 System.out.println("\n Entre com o segundo número:");
		 nota2 = leia.nextFloat();
		 System.out.println("\n Entre com o terceiro número:");
		 nota3 = leia.nextFloat();
		 
		 if ( nota1>nota2) {
			 if (nota1>nota3) {
				 m = nota1;		 }
		 else {
			 m = nota3;
		 
		 }
		 
	}
		 else { 
			 if (nota2 > nota3) {
				 m = nota2;
				 
			 }else { m = nota3;
				 
			 }
		 }
		 System.out.println("\n O maior número foi: "+ m);
		 }
	}
	


