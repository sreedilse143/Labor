package files;

import java.io.InputStream;
import java.io.OutputStream;

public class Read_notepad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Read_notepad.notepad_getInputStream();
	}

	public static void notepad_getInputStream() {
		try {
			// create a new process
			System.out.println("Creating Process...");
			Process p = Runtime.getRuntime().exec("notepad.exe");

			// get the input stream of the process and print it
			InputStream in = p.getInputStream();
			for (int i = 0; i < in.available(); i++) {
				System.out.println("" + in.read());
			}

			System.out.println("reading completed...");

	         // get the output stream
	         OutputStream out = p.getOutputStream();
	         out.write(7);
	         // close the output stream
	         System.out.println("Closing the output stream...");
	         
	         out.close();

	         
			// wait for 10 seconds and then destroy the process
			Thread.sleep(10000);
			p.destroy();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
