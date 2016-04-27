package Module_2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.jboss.netty.handler.queue.BufferedWriteHandler;

import com.google.common.io.FileWriteMode;

public class HandlingWriteToNotepad {

	public static void main(String[] args) throws IOException {
		File f = new File("//home//bhanu//Notepad//TestWrite.txt");
		// f.createNewFile();
		FileWriter fw = new FileWriter(f);

		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("Hello");
		bw.newLine();
		bw.write("23");
		bw.newLine();
		bw.write("Welcome Bhanu");

		bw.close();
		fw.close();

	}

}

