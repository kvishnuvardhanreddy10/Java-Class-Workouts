package fileHandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	
	Scanner sc = new Scanner(System.in);
	
	public void createFile() throws IOException {
		
		System.out.println("Enter u r file name and format");
		String filename = sc.nextLine();
		
		File file = new File(filename);
		
		if(file.createNewFile()) {
			System.out.println("file is created");
		}else {
			System.out.println("file is already created");
		}
	}
	
	public void writeFile() throws IOException {
		
		System.out.println("Enter u r file name and format");
		String filename = sc.nextLine();
		System.out.println("Enter u r data");
		String data = sc.nextLine();
		
		FileWriter file = new FileWriter(filename);
		file.write(data);
		file.close();
		System.out.println("Thank u");
	}

	public void readFile() throws IOException {
		System.out.println("Enter u r read file name");
		String filename = sc.nextLine();
		
		FileReader fileReader = new FileReader(filename);
		System.out.println(fileReader.readAllAsString());
		
		fileReader.close();
	}
	
	
	public void deleteFile() {
		System.out.println("Enter u r file name and format");
		String filename = sc.nextLine();
		File file = new File(filename);
		
		if(file.delete()) {
			System.out.println("file deleted");
		}else {
			System.out.println("file not present");
		}
	}
	
	
	public void addWithExisting() throws IOException {
		System.out.println("Enter u r file name");
		String file = sc.nextLine();
		
		FileReader fileReader = new FileReader(file);
		String old = fileReader.readAllAsString();
		System.out.println(old);
		fileReader.close();
		
		FileWriter fileWriter = new FileWriter(file);
		System.out.println("Enter u r data");
		
		String data = sc.nextLine();
		fileWriter.write(old + "\n" + data);
		fileWriter.close();
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Main main = new Main();
		
		int choice = 0;
		
		do {
			System.out.println("---file handling---");
			System.out.println("1.Create");
			System.out.println("2.write");
			System.out.println("3.read");
			System.out.println("4.delete");
			System.out.println("5.edit");
			System.out.println("0.exit");
			System.out.print("Enter your option : ");
			Scanner sc= new Scanner(System.in);
			choice=sc.nextInt();
			
			switch(choice) {
			case 1:
				main.createFile();
				break;
				
			case 2:
				main.writeFile();
				break;
				
			case 3:
				main.readFile();
				break;
				
			case 4: 
				main.deleteFile();
				break;
				
			case 5:
				main.addWithExisting();
				break;
				
			case 0:
				break;
				
			default:
				System.out.println("incorrect option");
			}
		}while(choice!=0);
		
		
		

	}

}
