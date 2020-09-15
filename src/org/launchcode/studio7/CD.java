package org.launchcode.studio7;

public class CD extends BasicDisc {
    @Override
    public void startDisc() {
        System.out.println("The CD has now stopped");
    }

    @Override
    public void stopDisc() {
        System.out.println("The CD has now stopped");

    }

    public CD(int storageCapacity, String name, double runTime, String mediaType) {
        super(storageCapacity, name, runTime, mediaType);
    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
