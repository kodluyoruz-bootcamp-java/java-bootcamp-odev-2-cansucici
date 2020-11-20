package Odev2;

public class Apple extends TelefonFabrikası implements TouchKeyboard{

    public Apple() {
        super();
    }

    @Override
    public void Call() {
        System.out.println("Apple ile Arama yapıyorsunuz");
    }

    @Override
    public void SMS() {
        System.out.println("Apple ile SMS gönderiyorsunuz.");

    }


    public void VideoCall() {
        System.out.println("Apple ile görüntülü görüşme yapabilirsiniz.");

    }

    public void ScreenShot() {
        System.out.println("Apple ile ekran paylaşımı yapabilirsiniz.");

    }


    @Override
    public void Touch() {
        System.out.println("Apple dokunmatik klavyeye sahiptir.");
    }
}
