package javaAdvanced;
import static java.lang.System.out;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AJ_getDeclaredMethod {
	private static Object objCustomerLoanHistory_Page;
	private static String col;

	public static void main(String[] args) {

		AJ_getDeclaredMethod cls = new AJ_getDeclaredMethod();
		Class c = cls.getClass();

		try {
			// parameter type is null
			Method m = c.getDeclaredMethod("show", null);
			out.println("method = " + m.toString());

			// method Integer
			Class[] cArg = new Class[1];
			cArg[0] = Integer.class;
			Method lMethod = c.getDeclaredMethod("showInteger", cArg);
			out.println("method = " + lMethod.toString());
		} catch (NoSuchMethodException e) {
			out.println(e.toString());
		}
	}

	private Integer show() {
		return 1;
	}

	public void showInteger(Integer i) {
		this.i = i;
	}

	public int i = 78655;

	public static void getclass_getDeclaredMethod() throws IllegalAccessException, IllegalArgumentException,
			InvocationTargetException, NoSuchMethodException, SecurityException {
		// TODO Auto-generated method stub
		String Actual = (String) objCustomerLoanHistory_Page.getClass()
				.getDeclaredMethod("get_" + col.replace("Coltext.", ""), String.class)
				.invoke(objCustomerLoanHistory_Page, "asd");
		out.println(Actual);
	}

}
