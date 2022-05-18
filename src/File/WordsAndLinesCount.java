package File;

import java.io.BufferedReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class WordsAndLinesCount {

	void countWordsAndLines() throws Exception {

		int LinesCount = 0;
		int wordCount = 0;

		File file;
		file = new File("D:\\tfl.txt");

		try {
			BufferedReader bufferedReader = new BufferedReader(new FileReader(file));

			String currentLine = bufferedReader.readLine();

			while (currentLine != null) {

				LinesCount++;

				String[] words = currentLine.split(" ");

				wordCount = wordCount + words.length;

				System.out.println(currentLine);

				currentLine = bufferedReader.readLine();

			}

			System.out.println("Number of Lines : " + LinesCount);
			System.out.println("Number of Words : " + wordCount);
			bufferedReader.close();

		} catch (FileNotFoundException fileNotFoundException) {

			System.out.println(fileNotFoundException.getMessage());

		} catch (IOException ioException) {

			System.out.println(ioException.getMessage());
		}
	}
}