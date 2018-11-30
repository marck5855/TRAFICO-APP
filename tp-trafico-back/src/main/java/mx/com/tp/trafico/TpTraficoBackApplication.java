package mx.com.tp.trafico;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"mx.com.tp.trafico"})
public class TpTraficoBackApplication {

	public static void main(String[] args) {
		SpringApplication.run(TpTraficoBackApplication.class, args);
	}
}
