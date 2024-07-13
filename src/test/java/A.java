import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class A {
	public static void main(String[] args) throws FileNotFoundException, IOException {
//		Properties properties=new Properties();
//		properties.load(new FileInputStream("C:\\Users\\karku\\eclipse-workspace\\OMRBranchHotelAutomationProject\\config\\config.properties"));
//		Object object = properties.get("url");
//		String value=(String) object;
//		System.out.println(value);
		
		
		//to get particular project location
		String path = System.getProperty("user.dir");
		System.out.println(path);
	}

}
