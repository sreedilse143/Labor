package windows_executables;

import static java.lang.System.out;

import java.io.IOException;


public class ProcessBuilder_Start {


	public static void main(String[] args) throws IOException {

		// create a new list of arguments for our process
		String[] list = { "notepad.exe", "mytextfile.txt" };

		// create the process builder
		ProcessBuilder pb = new ProcessBuilder(list);

		// set the command list
		pb.command(list);

		// print the new command list
		out.println("" + pb.command());
		
		pb.command(list).start();
	}
}
