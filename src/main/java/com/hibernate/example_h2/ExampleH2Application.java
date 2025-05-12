package com.hibernate.example_h2;

import com.hibernate.example_h2.entity.Address;
import com.hibernate.example_h2.entity.AddressId;
import com.hibernate.example_h2.entity.User;
import com.hibernate.example_h2.repo.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ExampleH2Application {

	public static void main(String[] args) {
		SpringApplication.run(ExampleH2Application.class, args);
	}

//	@Bean
//	CommandLineRunner initData(UserRepository userRepository) {
//		return args -> {
//			Address address = new Address(new AddressId(1L,"New York"), "NY");
//			User user = new User(null, "John Doe", address);
//			userRepository.save(user);
//
//			Address address2 = new Address(new AddressId(2L,"Los Angeles"),"CA");
//			User user2 = new User(null, "Jane Smith", address2);
//			userRepository.save(user2);
//
//			System.out.println("Data initialized!");
//		};
//	}


}
