package Odev2;

public abstract class TelefonFabrikası {

    public String modelName;
    public String imeiNumber;
    public String versionNunber;
    public int capacityOfRam;
    public double screenSize;

    public TelefonFabrikası() {
        this.modelName = "";
        this.imeiNumber = "";
        this.versionNunber = "";
        this.capacityOfRam = 0;
        this.screenSize = 0.0;
    }

    public TelefonFabrikası(String modelName, String imeiNumber, String versionNunber, int capacityOfRam, double screenSize) {
        this.modelName = modelName;
        this.imeiNumber = imeiNumber;
        this.versionNunber = versionNunber;
        this.capacityOfRam = capacityOfRam;
        this.screenSize = screenSize;
    }

 public abstract void Call();
    public abstract void SMS();



}

