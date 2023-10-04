package org.java;

import java.math.BigDecimal;

import org.java.POJO.Pizza;
import org.java.interfaces.PizzaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringLaMiaPizzeriaCrudApplication implements CommandLineRunner{
	
	@Autowired
	private PizzaRepo pizzaRepo;

	public static void main(String[] args) {
		SpringApplication.run(SpringLaMiaPizzeriaCrudApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Pizza margherita = new Pizza("margherita", "pom., mozz., basilico", "", new BigDecimal(4.5));
		Pizza ortolana = new Pizza("ortolana", "pom., mozz., verdure grigliate miste", "", new BigDecimal(4.5));
		Pizza diavola = new Pizza("diavola", "pom., mozz., salsiccia secca piccante, olio piccante", "", new BigDecimal(7.5));
		Pizza bufala = new Pizza("bufala", "pom., mozzarella di bufala, basilico", "", new BigDecimal(9));
		Pizza marinara = new Pizza("marinara", "pom., aglio, origano, acciughe", "", new BigDecimal(7));
	
		pizzaRepo.save(margherita);
		pizzaRepo.save(ortolana);
		pizzaRepo.save(diavola);
		pizzaRepo.save(bufala);
		pizzaRepo.save(marinara);
		System.out.println("bravoooo!!!!");
	}
	
	

}
