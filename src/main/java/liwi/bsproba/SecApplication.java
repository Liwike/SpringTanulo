package liwi.bsproba;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SecApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext x = SpringApplication.run(SecApplication.class, args);
		String[] b = x.getBeanDefinitionNames();
		List<String> r = Arrays.asList(b);
		Collections.sort(r);
		for (String s : r) {
			System.out.println(s);
		}
	}

}
