package demogirish;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationClass {
	
	
	public static void main(String [] args) {
			
	Person person =new Person();
	person.setName("Girish");
	person.setMobileno("8446818504");
	person.setAge(25);
	
	try {
		
		File f = new File("C:\\\\Users\\\\girish.bonde\\\\OneDrive - Sapiens\\\\Desktop\\\\Girish Document\\\\data.txt\"");
		FileOutputStream fos = new FileOutputStream ("C:\\Users\\girish.bonde\\OneDrive - Sapiens\\Desktop\\Girish Document\\data.txt");
		ObjectOutputStream out = new ObjectOutputStream(fos);
		out.writeObject(person);
		out.close();
		fos.close();
		System.out.println("done");
		
	}catch(IOException e) {
		
		e.printStackTrace();
	}

}
	}
