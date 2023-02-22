import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import edu.java.cuentaCorriente.CuentaCorriente;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Inicializar el tipo cuenta
				EjercicioPrueba ccc = new EjercicioPrueba();
				
				String []letras=new String [] {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", 
						"K", "E", "T"};
				
				// Scanner con el numero y letra del usuario
				Scanner sc = new Scanner(System.in);		
				Boolean cerrarMenu = false;
				int numerodni;
				String letra;
				while(!cerrarMenu) {	
					//Mostramos el menú
					System.out.println("Introduzca un número de dni: ");
					numerodni = sc.nextInt();
					System.out.println("Introduzca una letra de dni: ");
					letra = sc.nextLine();
					
					if(numerodni>99999999||numerodni<0) {
						System.out.println("El número indicado no es correto");
					System.out.println("Vuelva a Introducir un número de dni: ");
					numerodni = sc.nextInt();
					}
					else
						break;
					
					int dni;
					generarDni(dni, letras);

					
				}		

			}

	
		
	}
			

}
