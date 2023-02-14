package com.example.baseball;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.GridLayout;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class TeamFrame extends JFrame {

  public TeamFrame() throws IOException {
    Player;
    var hankeesData = new Scanner(new File("Hankees.txt"));

    for (int num = 1; num <= 9; num++) {
      player = new Player(hankeesData.nextLine(), hankeesData.nextDouble());
      hankeesData.nextLine();
      addPlayerInfo(player);
    }

    setTitle("The Hankees");
    setLayout(new GridLayout(10, 2, 20, 6));
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    pack();
    setVisible(true);

    hankeesData.close();
  }

  void addPlayerInfo(Player player) {
    add(new JLabel("    " + player.getName()));
    add(new JLabel(player.getAverageString()));
  }
}
