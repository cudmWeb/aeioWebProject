package demo.cdcm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class CustomerDataCollectionAndManagementApplication {

	private Environment env;

	public static void main(String[] args) {
		SpringApplication.run(CustomerDataCollectionAndManagementApplication.class, args);
	}

}
