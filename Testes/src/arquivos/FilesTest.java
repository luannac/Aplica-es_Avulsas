package arquivos;

import java.io.File;
import java.io.IOException;

public class FilesTest {

	public static void main(String[] args) throws IOException {
		File arquivo = new File( "src/arquivos/oi.bin" );
		if(!arquivo.exists())
			arquivo.createNewFile();
		if(arquivo.delete())
			System.out.println("Deletado");
	}	

}
