// Listing 14-8

package com.example.chapter14;

import com.burdbrain.drawings.DrawingWideBB;
import com.burdbrain.frames.ArtFrame;

public class ShowFrame {

    public static void main(String[] args) {
        var artFrame = new ArtFrame(new DrawingWideBB());

        artFrame.setSize(200, 100);
        artFrame.setVisible(true);
    }
}



