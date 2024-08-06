package mg.fanantenana.garage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;
import mg.fanantenana.garage.services.*;


@SpringBootApplication
public class GarageApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(GarageApplication.class, args);

		UserService userservice = configurableApplicationContext.getBean(UserService.class);

		try {
			String first = "Ny Ony Fanantenana";
			String last = "RAMAVO HARINVAIVO";

			String mail = "nyxrafaly@gmail.com";
			String pws = "12334";
			Integer roleId = 1;

			userservice.create(first, last, mail, pws, roleId.shortValue());


		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
