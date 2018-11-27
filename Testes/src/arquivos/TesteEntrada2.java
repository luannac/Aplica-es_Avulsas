package arquivos;

import java.io.*;

public class TesteEntrada2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Agenda ag= new Agenda();
		ag.novoContato("Luann");
		
		try {
			File file = new File("src/arquivos/oi2.bin");
			if(!file.exists())
				file.createNewFile();
			
			ObjectOutputStream objectOut = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
			
			
			objectOut.writeObject(ag);
			objectOut.close();
		} 
		catch (Exception e) {
			System.out.println(e.toString());
		}
	}

}
