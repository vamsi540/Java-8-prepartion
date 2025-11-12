package Abstarct;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

//how to read the properties file in java
public class ReadPropertiesExample {

	public static void main(String[] args) {

		Properties props = new Properties();

		try {
			//fileinputstream - it will read the file from your computer
			FileInputStream input = new FileInputStream("config.properties");
			props.load(input); 

			String appName = props.getProperty("app.name");
			String version = props.getProperty("app.version");
			String username = props.getProperty("db.username");

			System.out.println("App Name: " + appName);
			System.out.println("Version: " + version);

			System.out.println("DB Username: " + username);

		} catch (IOException e) {
			e.printStackTrace(); 
		}
	}

}
