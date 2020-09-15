package org.launchcode.studio7;

public abstract class BasicDisc implements OpticalDisc{

        protected int storageCapacity;
        private String name;
        protected double runTime;
        private String mediaType;

    public int getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRunTime() {
        return runTime;
    }

    public void setRunTime(double runTime) {
        this.runTime = runTime;
    }

    public String getMediaType() {
        return mediaType;
    }

    public void setMediaType(String mediaType) {
        this.mediaType = mediaType;
    }

    public BasicDisc(int storageCapacity, String name, double runTime, String mediaType) {
        this.storageCapacity = storageCapacity;
        this.name = name;
        this.runTime = runTime;
        this.mediaType = mediaType;
    }

    public void remainingCapacity() {
        System.out.println(this.storageCapacity - this.runTime);
    }
}
