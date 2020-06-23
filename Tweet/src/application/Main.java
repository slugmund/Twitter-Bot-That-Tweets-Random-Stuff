package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Main {
	public static void main(String[] args) {
		Sentence s = new Sentence("struct.txt");
		s.setParts("verb.txt", "adj.txt", "noun.txt");
		File ioFile = new File("file.out");
		PrintWriter writer;
		try {
			writer = new PrintWriter(ioFile);
			writer.print(s.getSentence());
			writer.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
	}
}
