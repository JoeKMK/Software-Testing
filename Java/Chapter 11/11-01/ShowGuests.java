package com.example.hotel;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import static java.lang.System.out;

public class ShowGuests {

    public static void main(String[] args) throws IOException {
        int[] guests = new int[10];
        var diskScanner = new Scanner(new File("GuestList.txt"));

        for (int roomNum = 0; roomNum < 10; roomNum++) {
            guests[roomNum] = diskScanner.nextInt();
        }

        out.println("Room\tGuests");

        for (int roomNum = 0; roomNum < 10; roomNum++) {
            out.print(roomNum);
            out.print("\t");
            out.println(guests[roomNum]);
        }

        diskScanner.close();
    }
}
