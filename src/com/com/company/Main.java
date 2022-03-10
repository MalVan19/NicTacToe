package com.company;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Игра началась");
        JFrame window = new JFrame("Крестики-нолики");
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setSize(400, 400);
        window.setLayout(new BorderLayout());
        window.setLocationRelativeTo(null);
        window.setVisible(true);
       NicTacToe game = new NicTacToe();
        window.add(game);

    }
}
