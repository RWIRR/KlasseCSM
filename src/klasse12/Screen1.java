package klasse12;


import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;

public  class Screen1 extends JFrame {

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
        exit_button.setActionCommand(Screen1.Exit);
        exit_button.setText("Exit");
        this.add(exit_button);

        //Hallo Button
        aufgaben_button = new JButton("Hallo");
        aufgaben_button.setBounds(200, 100, 150, 40);
        aufgaben_button.setBackground(new Color(100, 200, 250));
        aufgaben_button.setFocusPainted(true);
        aufgaben_button.setBorder(BorderFactory.createLineBorder(Color.MAGENTA));
        aufgaben_button.setActionCommand(Screen1.Aufgaben);
        aufgaben_button.setText("Aufgaben");
        this.add(aufgaben_button);

        //A Button
        theorie_button = new JButton("A");
        theorie_button.setBounds(375, 100, 150, 40);
        theorie_button.setBackground(new Color(100, 200, 250));
        theorie_button.setFocusPainted(true);
        theorie_button.setBorder(BorderFactory.createLineBorder(Color.MAGENTA));
        theorie_button.setActionCommand(Screen1.Theorie);
        theorie_button.setText("Theorie");
        this.add(theorie_button);

        //B Button
        beispiele_button = new JButton("B");
        beispiele_button.setBounds(550, 100, 150, 40);
        beispiele_button.setBackground(new Color(100, 200, 250));
        beispiele_button.setFocusPainted(true);
        beispiele_button.setBorder(BorderFactory.createLineBorder(Color.MAGENTA));
        beispiele_button.setActionCommand(Screen1.Beispiele);
        beispiele_button.setText("Beispiele");
        this.add(beispiele_button);

        //C Button
        video_button = new JButton("C");
        video_button.setBounds(725, 100, 150, 40);
        video_button.setBackground(new Color(100, 200, 250));
        video_button.setFocusPainted(true);
        video_button.setBorder(BorderFactory.createLineBorder(Color.MAGENTA));
        video_button.setActionCommand(Screen1.Video);
        video_button.setText("Video");
        this.add(video_button);

        //D Button
        losung_button = new JButton("D");
        losung_button.setBounds(900, 100, 150, 40);
        losung_button.setBackground(new Color(100, 200, 250));
        losung_button.setFocusPainted(true);
        losung_button.setBorder(BorderFactory.createLineBorder(Color.MAGENTA));
        losung_button.setActionCommand(Screen1.Lösung);
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
