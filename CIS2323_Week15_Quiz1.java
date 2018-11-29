
import java.nio.file.*; 
import java.nio.file.attribute.*; 
import java.io.IOException; 

public class CIS2323_Week15_Quiz1 {
	public static void main(String[] args) {
		Path filePath = Paths.get("C:\\Users\\schogan\\Desktop\\Projects\\CIS2323_Week15_Quiz1");
		
		
		int count = filePath.getNameCount();
		
		System.out.println("File name is " + filePath.getFileName());
		for(int x = 0; x < count; ++x){
			System.out.println("The containing folder is: " + filePath.getName(x));
		}
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