package Module_2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class HandlingNotepad {

	public static void main(String[] args) throws IOException {
		File f = new File("//home//bhanu//Notepad//Test.txt");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		System.out.println(br.readLine());
		System.out.println(br.readLine());
		
		String str = br.readLine();
		while(str!=null){
			System.out.println(str);
			str = br.readLine();
			
		}

	}

}

