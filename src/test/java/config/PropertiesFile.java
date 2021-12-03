package config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class PropertiesFile {

	static Properties prop = new Properties();
	static String projectpath = System.getProperty("user.dir"); // gives the location of current project ie.,
																// SeleniumFrameWork

	public static void main(String[] args) {
		getProperties();
		setProperties();
		getProperties();
	}

	public static void getProperties() {

		try {
			prop = new Properties();

			System.out.println(projectpath);

			InputStream input = new FileInputStream(projectpath + "\\src\\test\\java\\config\\config.properties");

			prop.load(input);

			String browser = prop.getProperty("browser");

			System.out.println(browser);
		} catch (Exception e) {

			System.out.println(e.getMessage());

			System.out.println(e.getCause());

			e.printStackTrace();

		}

	}

	public static void setProperties() {

		try {
			OutputStream output = new FileOutputStream(projectpath + "\\src\\test\\java\\config\\config.properties");

			prop.setProperty("browser", "chrome");

			try {
				prop.store(output, "Hello changes");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("Cannot change browser from firefox to chrome");
			}

		} catch (FileNotFoundException e) {

			System.out.println(e.getMessage());

			System.out.println(e.getCause());

			e.printStackTrace();
		}

	}

}
