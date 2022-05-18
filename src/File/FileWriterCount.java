package File;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FileWriterCount {
	
	Scanner scan = new Scanner(System.in);

	void createFile() throws IOException {

		int numberOfLines = 0;
		String words;

		System.out.println("Enter the number of Lines :");

		try {
			numberOfLines = scan.nextInt();
			scan.nextLine();
			
		} catch (InputMismatchException exception) {
			
			System.out.println("Enter integer values");
		}
		
		FileWriter fileWriter = new FileWriter("D:\\tfl.txt");

		BufferedWriter bufferWriter = new BufferedWriter(fileWriter);

		System.out.println("Enter the file datas ");

		for (int line = 0; line < numberOfLines; line++) {
			words = scan.nextLine();
			bufferWriter.write(words);
			bufferWriter.newLine();
		}

		bufferWriter.flush();
		bufferWriter.close();
		scan.close();

	}

}