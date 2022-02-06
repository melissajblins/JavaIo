package Teste;

import java.io.IOException;
import java.io.PrintStream;

public class TesteEscritaPrintStream {

	public static void main(String[] args) throws IOException {
		
		PrintStream ps = new PrintStream("lorem-print-stream");
		
		ps.print("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
		ps.close();
		
	}
}
