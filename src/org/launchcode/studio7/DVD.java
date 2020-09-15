package org.launchcode.studio7;

public class DVD extends BasicDisc{
    @Override
    public void startDisc() {
        System.out.println("This DVD is now running");
    }

    @Override
    public void stopDisc() {
        System.out.println("The DVD has now stopped");
    }

    public DVD(int storageCapacity, String name, double runTime, String mediaType) {
        super(storageCapacity, name, runTime, mediaType);
    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
