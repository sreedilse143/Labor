package databases;

import java.util.Base64;

public class ApacheDataEncrypt {

	public static void main(String[] args) {
		String encrptData = "Testdata";

		byte[] encodedBytes = Base64.getEncoder().encode(encrptData.getBytes());

		String decrptData = new String(encodedBytes).toString();

		System.out.println("encodedBytes --------------->" + decrptData);

		byte[] decodeBytes = Base64.getDecoder().decode(decrptData.getBytes());

		System.out.println("decodedBytes --------------->" + new String(decodeBytes));

	}

}
