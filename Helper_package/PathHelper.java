package Helper_package;
import java.io.FileInputStream;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.Properties;
public class PathHelper {
	

		public String completePath ="";
		public Properties p = new Properties();
		//public static final String filepath="C:\\Users\\palla\\eclipse-workspace\\OnlineExamProject\\QuestionBank";

		public PathHelper() {
			try {
				Path CurrentDirectoryPath = FileSystems.getDefault().getPath("");

				String CurrentDirectoryName = CurrentDirectoryPath.toAbsolutePath().toString();
				
				completePath = CurrentDirectoryName+"\\src\\Resources\\DB.properties";
				
				FileInputStream finf = new FileInputStream(completePath);
				
				p.load(finf);
			} 
			catch (Exception ex) {
				System.out.println("Exception is PAthHElper : " + ex);
			}

	}

}
