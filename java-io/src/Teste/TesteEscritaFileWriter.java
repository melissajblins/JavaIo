package Teste;

import java.io.FileWriter;
import java.io.IOException;

public class TesteEscritaFileWriter {

	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("lorem-file-writer");		
		fw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
		fw.write(System.lineSeparator());
		fw.close();
		
// 		Alternativa mais elegante:
//		BufferedWriter bw = new BufferedWriter(FileWriter fw = new FileWriter("lorem2.txt"));
//      bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
//      bw.newLine();
//		bw.close();
	}
}
