package backendclase23b;

import backendclase23b.bd.BD;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BackendClase23BApplication {

	public static void main(String[] args) throws Exception {
		BD.crearTablas();
		SpringApplication.run(BackendClase23BApplication.class, args);
	}

}
