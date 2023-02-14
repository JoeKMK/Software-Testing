package com.example.baseball;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.GridLayout;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class TeamFrame extends JFrame {

  public TeamFrame() throws IOException {
    PlayerPlus player;
    var hankeesData = new Scanner(new File("Hankees.txt"));

    for (int num = 1; num <= 9; num++) {
      player =
          new PlayerPlus(hankeesData.nextLine(), hankeesData.nextDouble());
      hankeesData.nextLine();

      addPlayerInfo(player);
    }

    add(new JLabel());
    add(new JLabel("----"));
    add(new JLabel("    Team Batting Average:"));
    add(new JLabel(PlayerPlus.findTeamAverageString()));

    setTitle("The Hankees");
    setLayout(new GridLayout(12, 2, 20, 6));
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    pack();
    setVisible(true);

    hankeesData.close();
  }

  void addPlayerInfo(PlayerPlus player) {
    add(new JLabel("    " + player.getName()));
    add(new JLabel(player.getAverageString()));
  }
}
