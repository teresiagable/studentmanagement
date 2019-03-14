package util;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ScannerInputService implements UserInputService {

	private Scanner scanner;

	@Autowired
	public void setScanner(Scanner scanner) {
		this.scanner = scanner;
	}

	@Override
	public String getString() {
		return scanner.nextLine();
	}

	@Override
	public int getint() {
		return scanner.nextInt();
	}
}
