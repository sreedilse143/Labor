package javaAdvanced;

import java.net.InetAddress;

public class Inet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	public static String getCanonicalHostName() throws Exception {
		return InetAddress.getLocalHost().getCanonicalHostName();
	}
	
	public static String getHostAddress() throws Exception {
		return InetAddress.getLocalHost().getHostAddress();
	}
}
