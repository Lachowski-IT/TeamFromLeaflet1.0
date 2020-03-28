package com.TeamFromLeaflet10.TeamFromLeaflet10;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {


	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

		//District distict01 = districtRepository.save("Stare Miasto", 556.76, 31359);

	}
}
