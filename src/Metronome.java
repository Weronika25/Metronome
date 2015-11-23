/**
 * Created by Michał on 23-Nov-15.
 */

import java.awt.*;
import java.io.File;
import java.io.FileInputStream;
import java.lang.Object;
import java.util.Scanner;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;
import javax.swing.*;



public class Metronome {

    public static void main(String[] args) {
        Metronome t = new Metronome();

    }


    public Metronome(){
        Tempo te = new Tempo();
        int tempo = te.GetTempo();
        Metrum metrum = new Metrum();
        int met1 = metrum.GetMet1();
        int met2 = metrum.GetMet2();
        Takt ta = new Takt();
        int takt = ta.GetTakt();
        Nuta n = new Nuta();
        boolean nuta = n.GetNuta();
        Metronome.this.generate(tempo, met1, met2, takt, nuta);
    }
    private void playSound() {
        try {
            FileInputStream in = new FileInputStream(new File("C:\\Users\\pc1\\Desktop\\metronom\\Click1.wav"));
            AudioStream s = new AudioStream(in);
            AudioPlayer.player.start(s);
        } catch (Exception var) {
            JOptionPane.showMessageDialog((Component)null, var);
        }

    }
    private void playSound2() {
        try {
            FileInputStream in = new FileInputStream(new File("C:\\Users\\pc1\\Desktop\\metronom\\gunclick.wav"));
            AudioStream s1 = new AudioStream(in);
            AudioPlayer.player.start(s1);
        } catch (Exception var) {
            JOptionPane.showMessageDialog((Component)null, var);
        }

    }
    public void generate(int tempo, int met1, int met2, int takt, boolean nuta) {
        double o = 4.0 / ((met2*tempo) / 60.0);
        int okres = (int)Math.round(o * 1000.0);
        //int il = (int)(tempo / 60.0D * time);

        if (nuta) {
            for (int licznik = takt; licznik != 0; --licznik) {

                this.playSound2();
                try {
                    Thread.sleep((long) okres);
                } catch (InterruptedException var10) {
                    var10.printStackTrace();
                }
                for (int ctr = met1 - 1; ctr != 0; --ctr) {
                    this.playSound();
                    try {
                        Thread.sleep((long) okres);
                    } catch (InterruptedException var10) {
                        var10.printStackTrace();
                    }
                }
            }


        }

        else{
            for (int licznik = takt; licznik != 0; --licznik) {
                for (int ctr = met1; ctr != 0; --ctr) {
                    this.playSound();
                    try {
                        Thread.sleep((long) okres);
                    } catch (InterruptedException var10) {
                        var10.printStackTrace();
                    }
                }
            }
        }
    }
}
