package File;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class CompareTwoFiles {

	void compareTwoFiles() throws Exception {

		FileReader fileReaderOne = new FileReader("D:\\file1.txt");
		FileReader fileReaderTwo = new FileReader("D:\\file2.txt");

		BufferedReader bufferReaderOne = new BufferedReader(fileReaderOne);
		BufferedReader bufferReaderTwo = new BufferedReader(fileReaderTwo);

		String lineOne = bufferReaderOne.readLine();
		String lineTwo = bufferReaderTwo.readLine();
		boolean comparedValue = false;

		while (lineOne != null && lineTwo != null) {
			//System.out.println(lineOne);
			//System.out.println(lineTwo);
			if (lineOne.equalsIgnoreCase(lineTwo)) {
				comparedValue = true;

			} else {
				comparedValue = false;
				break;
			}
			lineOne = bufferReaderOne.readLine();
			
			lineTwo = bufferReaderTwo.readLine();
			
		}
		if (comparedValue) {

			FileWriter fileWriter = new FileWriter("D:\\file3.txt");
			BufferedWriter bufferWriter = new BufferedWriter(fileWriter);

			String address = "D:\\file1.txt";

			FileReader fileReader = new FileReader(address);

			BufferedReader bufferReader = new BufferedReader(fileReader);

			String line;
			int lineCount = 0;
			int wordCount = 0;

			while ((line = bufferReader.readLine()) != null) {

				if (line.equals("")) {
					break;
				} else {

					String words[] = line.split("\\s+");
					wordCount += words.length;

					String word[] = line.split("[!?.:]+");
					lineCount += word.length;
					System.out.println(line);
				}
			}

			System.out.println("Total word count is = " + wordCount);
			System.out.println("Number of Lines count is :" + lineCount);
			bufferReader.close();

			bufferWriter.write("Number of Words is :" + wordCount);
			bufferWriter.newLine();

			bufferWriter.write("Number of lines is :" + lineCount);
			bufferWriter.newLine();

			bufferWriter.flush();
			bufferWriter.close();

		}

		else {
			System.out.println("Two files contents are different in a text file.");
		}
		bufferReaderOne.close();
		bufferReaderTwo.close();
	}

}