package File;

import java.io.File;

public class FolderCreation {

	public static void main(String[] args) {
		
		File file = new File("D:\\TFL");
		
		boolean present = file.exists();
		
		System.out.println("Folder present: "+ present);
		
		if(present== false)
			
			file.mkdir();
		
		present =file.exists();
		
		System.out.println("Folder present: "+present);
	}

}
