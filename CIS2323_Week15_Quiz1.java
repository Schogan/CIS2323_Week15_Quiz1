
import java.nio.file.*; 
import java.nio.file.attribute.*; 
import java.io.IOException; 

public class CIS2323_Week15_Quiz1 {
	public static void main(String[] args) {
	Path filePath = Paths.get("C:\\Users\\schogan\\Desktop\\Projects\\CIS2323_Week15_Quiz1");
		
		try{
			BasicFileAttributes attr = Files.readAttributes(filePath, BasicFileAttributes.class);
			System.out.println("Creation time " + attr.creationTime()); 
			System.out.println("Last modified time " + attr.lastModifiedTime()); 
			System.out.println("Size " + attr.size());
		}
		catch(IOException e) {
			System.out.println("IO Exception");
		}
	}
}