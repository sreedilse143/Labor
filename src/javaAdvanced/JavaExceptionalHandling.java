package javaAdvanced;

import java.io.BufferedReader;
import java.io.FileReader;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JavaExceptionalHandling {
	WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JavaExceptionalHandling o = new JavaExceptionalHandling();
		o.tryWithoutCatch();
	}

	public void aaasd() throws ArithmeticException, RuntimeException {
		// throw vs throws
		throw new ArithmeticException("sorry device error");
		// throw new ArithmeticException("1");
		// throw new RuntimeException("sorry device error");

	}

	public void handle_StaleElementReferenceException() {

		new WebDriverWait(driver, 10).ignoring(StaleElementReferenceException.class).until((WebDriver d) -> {
			d.findElement(By.id("checkoutLink")).click();
			return true;
		});
	}

	public boolean handle_StaleElementReferenceException2() {

		boolean result = false;
		int attempts = 0;
		while (attempts < 2) {
			try {
				driver.findElement(By.id("checkoutLink")).click();
				result = true;
				break;
			} catch (StaleElementReferenceException e) {
			}
			attempts++;
		}
		return result;

	}

	public void tryWithoutCatch() {
		try {
			System.out.println("Executing try block");
		} finally {
			System.out.println("Executing finally block");
		}
	}

	public void try_catch_finally_NOexceptionOccurred() {
		try {
			System.out.println("try block");
		} catch (Exception e) {
			System.out.println("catch block");
		} finally {
			System.out.println("finally block");
		}
	}

	public void try_catch_finally_ExceptionOccurred() {
		try {
			System.out.println("try block");

			throw new NullPointerException("Null occurred");
		} catch (Exception e) {
			System.out.println("catch block");
		} finally {
			System.out.println("finally block");
		}
	}

	public void try_finally_exceptionNotHandled() {
		try {
			System.out.println("try block");

			throw new NullPointerException("Null occurred");
		} finally {
			System.out.println("finally block");
		}
	}

	public void try_MultipleCatchBlock() {
		try {
			System.out.println("try block");

			throw new NullPointerException("null occurred");
		} catch (NumberFormatException e) {
			System.out.println("catch block 1");
		} catch (NullPointerException e) {
			System.out.println("catch block 2");
		} catch (Exception e) {
			System.out.println("catch block 3");
		} finally {
			System.out.println("finally block");
		}
	}

	public void try_catch_finally_ExceptionthrowCatch() {
		try {
			System.out.println("try block");

			throw new NullPointerException("NullPointerException occured");
		} catch (NullPointerException e) {
			System.out.println("catch block 1");

			throw new NumberFormatException("NumberFormatException occurred");
		} catch (Exception e) {
			System.out.println("catch block 2");
		} finally {
			System.out.println("finally block");
		}
	}

	public void try_withresources() {
		try (BufferedReader br = new BufferedReader(new FileReader("C:/temp/test.txt"))) {
			String sCurrentLine;
			while ((sCurrentLine = br.readLine()) != null) {
				System.out.println(sCurrentLine);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
