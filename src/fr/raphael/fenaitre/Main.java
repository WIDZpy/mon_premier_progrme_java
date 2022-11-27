package fr.raphael.fenaitre;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;


public class Main {
    public static void main(String[] args){
        ProcessBuilder proStart = new ProcessBuilder("C:\\Users\\raphs\\OneDrive\\Documents\\programation\\JAVA\\mon_premier_progrme_java\\src\\fr\\raphael\\fenaitre\\strt.bat");
        ProcessBuilder proKill = new ProcessBuilder("C:\\Users\\raphs\\OneDrive\\Documents\\programation\\JAVA\\mon_premier_progrme_java\\src\\fr\\raphael\\fenaitre\\kill.bat");


        JFrame maFenaitre = new JFrame();
        maFenaitre.setSize(500, 500);

        final int[] nameNb = {0};

        maFenaitre.setTitle("ma premier fenaitre "+ nameNb[0]);
        JPanel pan = new JPanel();
        maFenaitre.setContentPane(pan);
        pan.setBackground(Color.red);

        JButton add = new JButton("++");
        maFenaitre.getContentPane().add(add);

        JButton sup = new JButton("--");
        maFenaitre.getContentPane().add(sup);

        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nameNb[0] += 1 ;
                maFenaitre.setTitle("ma premier fenaitre "+ nameNb[0]);
                try {
                    Process ps = proStart.start();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });

        sup.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nameNb[0] = 0;
                maFenaitre.setTitle("ma premier fenaitre "+ nameNb[0]);
                try {
                    Process pk = proKill.start();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });

        maFenaitre.setVisible(true);
    }
}
