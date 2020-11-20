package Odev2;

public class Main {
    public static void main(String[] args) {

        // TelefonFabrikası samsung1= new Samsung();
        Samsung samsung1=new Samsung();
        System.out.println("samsung cihaz :");
         samsung1.Call();
        samsung1.SMS();
        samsung1.File();
        samsung1.MP3();
        samsung1.Physical();

        Apple apple1 = new Apple();
        System.out.println("apple cihaz : ");
        apple1.Call();
       apple1.SMS();
       apple1.ScreenShot();
       apple1.VideoCall();
       apple1.Touch();    }
}
