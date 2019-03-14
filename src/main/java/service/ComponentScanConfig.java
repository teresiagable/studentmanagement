package service;

import java.util.Scanner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import util.ScannerInputService;

@Configuration
@ComponentScan("data_access")
public class ComponentScanConfig {

	@Bean
	public ScannerInputService scannerInputService() {
		ScannerInputService scannerInputService = new ScannerInputService();
		scannerInputService.setScanner(scanner());
		return scannerInputService;
	}
	
	@Bean
	public Scanner scanner() {		
		return new Scanner(System.in);
	}
}

