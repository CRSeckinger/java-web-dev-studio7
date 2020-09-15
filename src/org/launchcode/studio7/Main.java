package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object.

        CD myCD = new CD(800,"Frank Sinatra", 90, "CD");
        DVD myDVD = new DVD(1200, "Golden Girls", 180, "DVD");
        // TODO: Call each CD and DVD method to verify that they work as expected.

        myCD.startDisc();
        myDVD.stopDisc();

        myCD.remainingCapacity();
        myDVD.remainingCapacity();

    }
}
