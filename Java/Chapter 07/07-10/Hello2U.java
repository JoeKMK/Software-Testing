package com.example.graphical;

import com.allmycode.dummiesframe.DummiesFrame;

public class Hello2U {

    public static void main(String[] args) {
        var frame = new DummiesFrame("Greet Me!");
        frame.addRow("Your first name");
        frame.go();
    }

    public static String calculate(String firstName) {
        return "Hello, " + firstName + "!";
    }
}
