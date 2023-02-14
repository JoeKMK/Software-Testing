// Listiing 14-10

package com.burdbrain.drawings;

import com.burdbrain.frames.ArtFrame;

class ShowFrameWideBB {

    public static void main(String[] args) {
        var drawing = new Drawing();
        drawing.width = 100;
        drawing.height = 30;
        var artFrame = new ArtFrame(drawing);
        artFrame.setSize(200, 100);
        artFrame.setVisible(true);
    }
}
