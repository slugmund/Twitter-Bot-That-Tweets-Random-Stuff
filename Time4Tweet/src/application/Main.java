package application;

import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		Runtime rt = Runtime.getRuntime();
		
		while(true) {
			try {
				Process pr = rt.exec("java -jar ./path to jar file");
				pr = rt.exec("node ./path to js");
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
			try {
				System.out.println("here");
				Thread.sleep(7200000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
