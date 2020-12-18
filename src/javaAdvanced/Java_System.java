package javaAdvanced;

import java.util.Properties;
import java.util.Set;

public class Java_System {

	public static void main(String[] args) {

		Java_System js = new Java_System();
		js.systemProperty();
	}

	public void systemProperty() {
		Properties prop = System.getProperties();
		Set<Object> keySet = prop.keySet();
		for (Object obj : keySet) {
			System.out.println(obj.toString() + "	=	" + System.getProperty(obj.toString()));

			//System.out.println("System Property: {" + obj.toString() + "," + System.getProperty(obj.toString()) + "}");

		}
	}

}
