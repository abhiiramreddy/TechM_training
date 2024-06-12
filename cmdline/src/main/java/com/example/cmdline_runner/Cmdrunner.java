package com.example.cmdline_runner;
import java.util.Arrays;
import java.util.String;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Cmdrunner implements CommandLineRunner{
	public void run(String...args) throws Exception{
		System.out.println("this is cmd runner");
		System.out.println(args[0]);
		System.out.println(Arrays.asList(args));
	}

}
