package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Sentence {
	private String structure;
	
	public Sentence() {
		structure = "";
	}
	
	public Sentence(String structFile){
		int size = 0;
		
		try (BufferedReader br = new BufferedReader(new FileReader(structFile))) {
			String s;
			while ((s = br.readLine()) != null) {
				size++;
			}
			br.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		int randNum = (int)(Math.random()*size);
		
		try (BufferedReader br = new BufferedReader(new FileReader(structFile))) {
			String s;
			int countUp = 0;
			while ((s = br.readLine()) != null) {
				if(countUp == randNum) {
					structure = s;
					break;
				}
				countUp++;
			}
			br.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void setParts(String verbFile,String adjFile, String nounFile) {
		int size = 0;
		
		try (BufferedReader br = new BufferedReader(new FileReader(adjFile))) {
			String s;
			while ((s = br.readLine()) != null) {
				size++;
			}
			br.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		
		int adjNum = (int)(Math.random()*size);
		String adjective = "";
		
		try (BufferedReader br = new BufferedReader(new FileReader(adjFile))) {
			String s;
			int countUp = 0;
			while ((s = br.readLine()) != null) {
				if(countUp == adjNum) {
					adjective = s;
					break;
				}
				countUp++;
			}
			br.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		size = 0;
		
		try (BufferedReader br = new BufferedReader(new FileReader(verbFile))) {
			String s;
			while ((s = br.readLine()) != null) {
				size++;
			}
			br.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		
		int verbNum = (int)(Math.random()*size);
		String verb = "";
		
		try (BufferedReader br = new BufferedReader(new FileReader(verbFile))) {
			String s;
			int countUp = 0;
			while ((s = br.readLine()) != null) {
				if(countUp == verbNum) {
					verb = s;
					break;
				}
				countUp++;
			}
			br.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		size = 0;
		
		try (BufferedReader br = new BufferedReader(new FileReader(nounFile))) {
			String s;
			while ((s = br.readLine()) != null) {
				size++;
			}
			br.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		
		int nounNum = (int)(Math.random()*size);
		String noun = "";
		
		try (BufferedReader br = new BufferedReader(new FileReader(nounFile))) {
			String s;
			int countUp = 0;
			while ((s = br.readLine()) != null) {
				if(countUp == nounNum) {
					noun = s;
					break;
				}
				countUp++;
			}
			br.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		structure = structure.replace("*noun*",noun);
		structure = structure.replace("*verb*", verb);
		structure = structure.replace("*adj*", adjective);
		
	}
	
	public String getSentence() {
		return structure;
	}
}
