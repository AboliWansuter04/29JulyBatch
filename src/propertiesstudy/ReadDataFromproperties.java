package propertiesstudy;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

public class ReadDataFromproperties {

	public static void main(String[] args) throws IOException
	{
		//create object of Properties
				Properties prop= new Properties();
				//Create Object of FileInputStream
				FileInputStream myFile= new FileInputStream("C:\\Users\\sagar\\OneDrive\\Documents\\Book1.xlsx");
				prop.load(myFile);
				String value = prop.getProperty("CityName");

				System.out.println(value);

			}
			public static String readDataFromPropertyFile(String key) throws IOException
			{
			//Create object of Properties class
			Properties prop= new Properties();
			//File Location
			FileInputStream myFile= new

			FileInputStream("C:\\Users\\sagar\\OneDrive\\Documents\\CoverFox.xlsx");

			//load file
			prop.load(myFile);
			//pass the Key for the data we want
			String value = prop.getProperty(key);
			return value;
			}

		

	}


