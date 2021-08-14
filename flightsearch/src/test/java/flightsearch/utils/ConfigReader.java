package flightsearch.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

	Properties prop;

	public ConfigReader() {

		File fileSource = new File("./configuration/config.properties");

		try {
			FileInputStream fileReader = new FileInputStream(fileSource);
			prop = new Properties();
			prop.load(fileReader);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
/**
 * @return url
 */
	public String getUrl() {
		return prop.getProperty("url");
	}
}
