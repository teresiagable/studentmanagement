package studentmanagement.config;

import java.util.Scanner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import studentmanagement.data_access.StudentDao;
import studentmanagement.util.ScannerInputService;
import studentmanagement.util.UserInputService;

@Configuration
@ComponentScan("studentmanagement")

public class ComponentScanConfig {
	
	@Bean
	public Scanner scanner() {		
		return new Scanner(System.in);
	}
}

