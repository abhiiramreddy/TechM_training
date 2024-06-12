package com.example.cmdline;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CmdlineApplication {

	public static void main(String[] args) {
		SpringApplication.run(CmdlineApplication.class, args);
		System.out.println("started.....");
	}

}
