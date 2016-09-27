package jrout.tutorial.corejava.io;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FirstExample {
	static File file = new File("StudentBatch23.txt");

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		//createFile();
//		writeContentToFile();
		readContentFromFile();
	}

	/**
	 * Creates a new File if it does not exist
	 */
	private static void createFile() {
		try {
			boolean newFile = false;

			System.out.println("Is the file exist ? " + file.exists()); // look
																		// for a
																		// real
			System.out.println(file.canExecute());
			System.out.println(file.canRead());
			System.out.println(file.canWrite());
			
			if (!file.exists()) {
				newFile = file.createNewFile(); // maybe create a file!
			}
			System.out.println("Has a new File been created ? " + newFile); // already
																			// there?
			System.out.println("Is the File Exists nows ? " + file.exists()); // look
																				// again
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Write some content to the file
	 * 
	 * @throws IOException
	 */
	private static void writeContentToFile() {
		FileWriter fw = null;
		
		
		try {
			fw = new FileWriter(file, true);
			fw.write("I am going to write to the file again...");
			fw.flush();
			System.out.println("Writing Done...");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fw != null) {
				try {
					fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	private static void readContentFromFile() throws IOException {
		char[] in = new char[100];
		FileReader fr = null;
		int size;
		fr = new FileReader(file);
		size = fr.read(in); // read the content of file into the char array
		System.out.println(size + " "); // how many bytes read

		for (char c : in)
			System.out.print(c);
		
		if(fr != null){
			try{
				fr.close();	
			}catch(Exception exp){}
		}
	}
}