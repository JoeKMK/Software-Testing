package com.example.chapter14;

import com.burdbrain.drawings.Drawing;
import com.burdbrain.frames.ArtFrame;

public class ShowFrame {

    public static void main(String[] args) {
        var artFrame = new ArtFrame(new Drawing());

        artFrame.setSize(200, 100);
        artFrame.setVisible(true);
    }
}
