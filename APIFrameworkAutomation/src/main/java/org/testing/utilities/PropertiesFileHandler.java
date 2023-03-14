package org.testing.utilities;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

// Purpose of this method -- to load the properties file //
// Input -- file path //
//Output -- Properties Object //

public class PropertiesFileHandler {

	public static Properties loadproperties(String filePath) throws IOException {
		File F=new File(filePath);
		FileReader FR=new FileReader(F);
		Properties pr=new Properties();
	    pr.load(FR);
	    return pr;

	}

}
