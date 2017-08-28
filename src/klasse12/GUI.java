package klasse12;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author MAGO
 */
public  class GUI extends JFrame {

    static String Aufgaben;
    static String Theorie;
    static String Beispiele;
    static String Video;
    static String Lösung;

    JButton exit_button = new JButton();
    JButton algorithmen_button = new JButton();
    JButton datenbank_button = new JButton();
    JButton download_button = new JButton();
    JButton hilfe_button = new JButton();
    JButton theoretischeinfo_button = new JButton();
    JButton java_button = new JButton();
    JButton spiel_button = new JButton();

    JButton projekte_button = new JButton();

    static final String Exit = "Exit";
    static final String Algorithmen = "Algorithmen";
    static final String Datenbank = "Datenbank";
    static final String Download = "Download";
    static final String theoretische_Informatik = "theoretische_Informatik";
    static final String Java = "Java";
    static final String Projekte = "Projekte";
    static final String Spiel = "Spiel";

    public GUI() {

        this.setLayout(new FlowLayout());
        // this.setUndecorated(false); //For fullscreen, this statement MUST COME BEFORE SET VISIBLE TRUE!!
        this.setSize(1920, 1080);
        //this.setBackground(Color.BLACK);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setTitle("Basis Screen");
        this.setResizable(false);
        this.requestFocus();

        //Exit Button
        exit_button.setBounds(25, 100, 150, 40);
        exit_button.setBackground(new Color(100, 200, 150));
        exit_button.setFocusPainted(true);
        exit_button.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        exit_button.setActionCommand(GUI.Exit);
        exit_button.setText("Exit");
        this.add(exit_button);

        //Hallo Button
        algorithmen_button.setBounds(200, 100, 150, 40);
        algorithmen_button.setBackground(new Color(100, 200, 250));
        algorithmen_button.setFocusPainted(true);
        algorithmen_button.setBorder(BorderFactory.createLineBorder(Color.MAGENTA));
        algorithmen_button.setText("Algorithmen");
        algorithmen_button.setActionCommand(GUI.Algorithmen);
        this.add(algorithmen_button);

        //A Button
        datenbank_button.setBounds(375, 100, 150, 40);
        datenbank_button.setBackground(new Color(100, 200, 250));
        datenbank_button.setFocusPainted(true);
        datenbank_button.setBorder(BorderFactory.createLineBorder(Color.MAGENTA));
        datenbank_button.setActionCommand(GUI.Datenbank);
        datenbank_button.setText("Datenbank");
        this.add(datenbank_button);

        //B Button
        download_button.setBounds(550, 100, 150, 40);
        download_button.setBackground(new Color(100, 200, 250));
        download_button.setFocusPainted(true);
        download_button.setBorder(BorderFactory.createLineBorder(Color.MAGENTA));
        download_button.setActionCommand(GUI.Download);
        download_button.setText("Download");
        this.add(download_button);

        //C Button
        theoretischeinfo_button.setBounds(725, 100, 150, 40);
        theoretischeinfo_button.setBackground(new Color(100, 200, 250));
        theoretischeinfo_button.setFocusPainted(true);
        theoretischeinfo_button.setBorder(BorderFactory.createLineBorder(Color.MAGENTA));
        theoretischeinfo_button.setActionCommand(GUI.theoretische_Informatik);
        theoretischeinfo_button.setText("theoretische_Informatik");
        this.add(theoretischeinfo_button);

        //D Button
        java_button.setBounds(900, 100, 150, 40);
        java_button.setBackground(new Color(100, 200, 250));
        java_button.setFocusPainted(true);
        java_button.setBorder(BorderFactory.createLineBorder(Color.MAGENTA));
        java_button.setActionCommand(GUI.Java);
        java_button.setText("Java");
        this.add(java_button);

        //E Button
        projekte_button.setBounds(1075, 100, 150, 40);
        projekte_button.setBackground(new Color(100, 200, 250));
        projekte_button.setFocusPainted(true);
        projekte_button.setBorder(BorderFactory.createLineBorder(Color.MAGENTA));
        projekte_button.setActionCommand(GUI.Projekte);
        projekte_button.setText("Projekte");
        this.add(projekte_button);

        //F Button
        spiel_button.setBounds(1250, 100, 150, 40);
        spiel_button.setBackground(new Color(100, 200, 250));
        spiel_button.setFocusPainted(true);
        spiel_button.setBorder(BorderFactory.createLineBorder(Color.MAGENTA));
        spiel_button.setActionCommand(GUI.Spiel);
        spiel_button.setText("Spiel");
        this.add(spiel_button);

    }

    public JButton getExitButton() {
        return exit_button;

    }

    public JButton getAlgoButton() {
        return algorithmen_button;

    }

    public JButton getJaButton() {
        return java_button;

    }

    public JButton getDaButton() {
        return datenbank_button;

    }

    public JButton getDowButton() {
        return download_button;

    }

    public JButton getTIButton() {
        return theoretischeinfo_button;

    }

    public JButton getProButton() {
        return projekte_button;

    }

    public JButton getSpButton() {
        return spiel_button;

    }

}

 class Screen1 extends JFrame {

    JButton exit_button = new JButton();
    JButton aufgaben_button = new JButton();
    JButton theorie_button = new JButton();
    JButton beispiele_button = new JButton();
    JButton video_button = new JButton();
    JButton losung_button = new JButton();

    static final String Exit = "Exit";
    static final String Aufgaben = "Aufgaben";
    static final String Theorie = "Theorie";
    static final String Beispiele = "Beispiele";
    static final String Video = "Video";
    static final String Lösung = "Lösung";

    Screen1() {

        this.setLayout(new FlowLayout());
        this.setUndecorated(false); //For fullscreen, this statement MUST COME BEFORE SET VISIBLE TRUE!!
        this.setSize(800, 600);
        this.setBackground(Color.BLACK);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setTitle("Basis Screen");
        this.setResizable(false);
        this.requestFocus();

        //Exit Button
        exit_button = new JButton("Exit");
        exit_button.setBounds(25, 100, 150, 40);
        exit_button.setBackground(new Color(100, 200, 150));
        exit_button.setFocusPainted(true);
        exit_button.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        exit_button.setActionCommand(GUI.Exit);
        exit_button.setText("Exit");
        this.add(exit_button);

        //Hallo Button
        aufgaben_button = new JButton("Hallo");
        aufgaben_button.setBounds(200, 100, 150, 40);
        aufgaben_button.setBackground(new Color(100, 200, 250));
        aufgaben_button.setFocusPainted(true);
        aufgaben_button.setBorder(BorderFactory.createLineBorder(Color.MAGENTA));
        aufgaben_button.setActionCommand(GUI.Aufgaben);
        aufgaben_button.setText("Aufgaben");
        this.add(aufgaben_button);

        //A Button
        theorie_button = new JButton("A");
        theorie_button.setBounds(375, 100, 150, 40);
        theorie_button.setBackground(new Color(100, 200, 250));
        theorie_button.setFocusPainted(true);
        theorie_button.setBorder(BorderFactory.createLineBorder(Color.MAGENTA));
        theorie_button.setActionCommand(GUI.Theorie);
        theorie_button.setText("Theorie");
        this.add(theorie_button);

        //B Button
        beispiele_button = new JButton("B");
        beispiele_button.setBounds(550, 100, 150, 40);
        beispiele_button.setBackground(new Color(100, 200, 250));
        beispiele_button.setFocusPainted(true);
        beispiele_button.setBorder(BorderFactory.createLineBorder(Color.MAGENTA));
        beispiele_button.setActionCommand(GUI.Beispiele);
        beispiele_button.setText("Beispiele");
        this.add(beispiele_button);

        //C Button
        video_button = new JButton("C");
        video_button.setBounds(725, 100, 150, 40);
        video_button.setBackground(new Color(100, 200, 250));
        video_button.setFocusPainted(true);
        video_button.setBorder(BorderFactory.createLineBorder(Color.MAGENTA));
        video_button.setActionCommand(GUI.Video);
        video_button.setText("Video");
        this.add(video_button);

        //D Button
        losung_button = new JButton("D");
        losung_button.setBounds(900, 100, 150, 40);
        losung_button.setBackground(new Color(100, 200, 250));
        losung_button.setFocusPainted(true);
        losung_button.setBorder(BorderFactory.createLineBorder(Color.MAGENTA));
        losung_button.setActionCommand(GUI.Lösung);
        losung_button.setText("Lösung");
        this.add(losung_button);

    }

    public JButton getExitButton() {
        return exit_button;

    }

    public JButton getAufButton() {
        return aufgaben_button;

    }

    public JButton getTheButton() {
        return theorie_button;

    }

    public JButton getVidButton() {
        return video_button;

    }

    public JButton getLosButton() {
        return losung_button;

    }

    public JButton getBeiButton() {
        return beispiele_button;

    }
}
