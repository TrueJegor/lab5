package lab6;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Фамилия");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        GUI gui = new GUI();
        gui.setBackground(Color.WHITE);
        frame.add(gui);
        frame.setSize(700,300);
        frame.setVisible(true);

    }
}
