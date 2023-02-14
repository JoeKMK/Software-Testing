// Listing 14-3

package com.burdbrain.frames;

import com.burdbrain.drawings.Drawing;

import javax.swing.JFrame;
import java.awt.Graphics;

public class ArtFrame extends JFrame {

    Drawing drawing;

    public ArtFrame(Drawing drawing) {
        this.drawing = drawing;
        setTitle("Abstract Art");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void paint(Graphics g) {
        drawing.paint(g);
    }
}

