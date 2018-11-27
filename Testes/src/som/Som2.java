package som;

import java.net.URL;
import javax.swing.*;
import javax.sound.sampled.*;

public class Som2 {

    public static void main(String[] args) throws Exception {

        // Carrega o arquivo de �udio (n�o funciona com .mp3, s� .wav) 
        URL oUrl = new URL("http://www.soundjay.com/button/beep-02.wav");
        Clip oClip = AudioSystem.getClip();
        AudioInputStream oStream = AudioSystem.getAudioInputStream(oUrl);
        oClip.open(oStream);

        oClip.loop(0); // Toca uma vez
        //clip.loop(Clip.LOOP_CONTINUOUSLY); // Toca continuamente (para o caso de m�sicas)

        // Para a execu��o (sen�o o programa termina antes de voc� ouvir o som)
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JOptionPane.showMessageDialog(null, "Clique pra fechar!");
            }
        });
    }
}
