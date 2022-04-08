package system.com;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import system.com.component.Component_Dependencia;

@SpringBootApplication
public class SystemApplication implements CommandLineRunner{

	public Component_Dependencia component_Dependencia;
	
	public SystemApplication(Component_Dependencia component_Dependencia) {
		
		this.component_Dependencia = component_Dependencia;
	}

	public static void main(String[] args) {
		SpringApplication.run(SystemApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		int a= component_Dependencia.leer_numeros();
		int b= component_Dependencia.leer_numeros();
		component_Dependencia.visualizar_resultado(component_Dependencia.suma(a, b));
	}

}
