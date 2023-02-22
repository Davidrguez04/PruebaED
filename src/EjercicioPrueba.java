
public class EjercicioPrueba {

	
	//Declaramos las variables
	private String dni;
	private int numeroDni;
	private String letra;
	private String []letras=new String [] {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", 
			"K", "E", "T"};
	
	//Generación de getters y setters
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getLetra() {
		return letra;
	}
	public void setLetra(String letra) {
		this.letra = letra;
	}
	public String[] getLetras() {
		return letras;
	}
	public void setLetras(String[] letras) {
		this.letras = letras;
	}
	
	public EjercicioPrueba generarDni(int numeroDni, String[]letras) {
		int  operacion=numeroDni/23;
		
		String letra=letras[operacion];
		if(numeroDni<=0||numeroDni>99999999)
			System.out.println("Este número no es válido");
			
		else{
		
		System.out.println(numeroDni);
		System.out.println(letra);
		String dni=String.valueOf(numeroDni)+letra;
		
		System.out.println(dni);
		}

		return 0;
	}
	
	
}
