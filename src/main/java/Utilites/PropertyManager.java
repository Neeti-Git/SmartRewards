package Utilites;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertyManager {
	private static Properties props = new Properties();
	TestUtils utils = new TestUtils();

	public Properties getProps() throws IOException {
		FileReader fileInput = null;

		if (props.isEmpty()) {
			try {
				utils.log().info("loading config properties");
				File file = new File(System.getProperty("user.dir") + "/configuration/config.properties");

				fileInput = new FileReader(file);

				props.load(fileInput);
			} catch (IOException e) {
				e.printStackTrace();
				utils.log().fatal("Failed to load config properties. ABORT!!" + e.toString());
				throw e;
			} finally {
				if (fileInput != null) {
					fileInput.close();
				}
			}
		}
		return props;
	}
}
