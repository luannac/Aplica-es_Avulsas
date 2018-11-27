package SomThread;

	import java.io.File;

import javax.sound.sampled.AudioFormat;
	import javax.sound.sampled.AudioInputStream;
	import javax.sound.sampled.SourceDataLine;
	import javax.swing.JOptionPane;
	/**
	 *
	 * @author lucas
	 */
	public class Play implements Runnable {
	    private boolean waiting = false;
	    private SourceDataLine line;
	    private AudioInputStream din;
	    private AudioFormat decodeFormat;
	    public Play (Music track)
	    {
	        this.line = track.getLine();
	        this.din = track.getDin();
	        this.decodeFormat = track.getDecodeFormat();
	    }
	    //metodo para pausar a thread.. a propria thread deve se parar, e n�o uma thread externa
	    public synchronized void aguardar() {
	        waiting = true;
	    }
	    //metodo para reiniciar uma thread
	    public void continuar() {
	        waiting = false;
	        synchronized(this) {
	            this.notify();
	        }
	    }
	     //aqui executa a musica
	    public void run() {
	        try
	        {
	            if(line != null)
	            {
			line.open(decodeFormat);
			byte[] data = new byte[4096];
			// Start
			line.start();
	        	int nBytesRead;
	               //toca enquanto a musica n�o acaba
			while ((nBytesRead = din.read(data, 0, data.length)) != -1)
	                {
	                    //se for solicitado para para  a propria thread para
	                    while (waiting) {
	                        synchronized (this) {
	                            wait(); //Note que essa thread mesmo chama o wait
	                        }
	                    }
	                    line.write(data, 0, nBytesRead);
			}
			// Stop
			line.drain();
			line.stop();
			line.close();
			din.close();
	            }
	        }
	        catch(Exception e)
	        {
	            JOptionPane.showMessageDialog(null,"Erro:"+e.getMessage());
	        }
	    }
	public static void main(String[] args) {
			// TODO Auto-generated method stub
		Music track = new Music(new File("src/som/Carro Ligando.wav")); //no windows seria C:\\diret�rio em que a musica se encontra\\eric clapton-layla.mp3
		Play play = new Play(track);
		Thread newThrd = new Thread(play);
		newThrd.start();
		}
	
}
