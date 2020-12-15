package javaAdvanced;

public class Util_RunTIme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static void killIE() throws Exception {
		Runtime.getRuntime().exec("taskkill /F /IM iexplore.exe");
	}

	public static void killIEDriverServer() throws Exception {
		Runtime.getRuntime().exec("taskkill /F /IM IEDriverServer.exe");
	}

}
