package demogirish;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationClass {
	
	public static void main(String [] args) {
		Person person = null;
		try {
			
			FileInputStream fIs = new FileInputStream ("C:\\Users\\girish.bonde\\OneDrive - Sapiens\\Desktop\\Girish Document\\data.txt");
			ObjectInputStream in = new ObjectInputStream(fIs);
			person = (Person) in.readObject();
			in.close();
			fIs.close();
			System.out.println(person.getName());
			System.out.println(person.getMobileno());
			System.out.println(person.getAge());
			File f = new File("C:\\Users\\girish.bonde\\OneDrive - Sapiens\\Desktop\\Girish Document\\data.txt");
			if(f.delete()) {
				System.out.println("Deleted");
			}
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
