package arquivos;

import java.io.File;
import java.io.*;

public class TesteLeitura2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Agenda ag= new Agenda();
		
		try {
			File file = new File("src/arquivos/oi2.bin");
			
			ObjectInputStream objectIn = new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)));
			ag = (Agenda)objectIn.readObject();
			objectIn.close();
		}
		catch(Exception e){
			System.out.println(e.toString());
		}
		System.out.println(ag.get(0).getNome());
	}

}
