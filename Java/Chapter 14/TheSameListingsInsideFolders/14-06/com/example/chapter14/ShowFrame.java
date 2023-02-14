// Listing 14-5

package com.example.chapter14;

// No longer needed: import com.burdbrain.drawings.Drawing;
import com.burdbrain.frames.ArtFrame;

public class ShowFrame {

    public static void main(String[] args) {
        var artFrame = new ArtFrame(new DrawingWide());

        artFrame.setSize(200, 100);
        artFrame.setVisible(true);
    }
}


