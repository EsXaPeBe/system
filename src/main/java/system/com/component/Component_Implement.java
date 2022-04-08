package system.com.component;

import java.util.Scanner;

import org.springframework.stereotype.Component;

@Component
public class Component_Implement  implements Component_Dependencia{

	@Override
	public void saludar(String mensaje) {
		System.out.println("hola "+ mensaje);
	}

	
	@Override
	public String leer_nombre() {
		System.out.println("Por favor ingrese su nombre:  ");
		Scanner leer=new Scanner(System.in);
		return leer.nextLine();
	}


	@Override
	public String suma(int a, int b) {
		int resultado=a+b;
		return String.valueOf(resultado) ;
	}


	@Override
	public int leer_numeros() {
		System.out.println("Ingresa una cantidad");
		Scanner leer=new Scanner(System.in);
		return leer.nextInt();
	}


	@Override
	public void visualizar_resultado(String resulado) {
		
		System.out.println("El resulado es: "+ resulado);
	}


	
}
