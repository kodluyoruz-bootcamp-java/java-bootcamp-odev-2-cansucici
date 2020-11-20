package Odev2;

public class Samsung extends TelefonFabrikası implements PhysicalKeyboard{

    public Samsung() {

        super();
    }

    @Override
    public void Call() {
        System.out.println("Samsung ile Arama yapıyorsunuz");
    }

    @Override
    public void SMS() {
        System.out.println("Samsung ile SMS gönderiyorsunuz");

    }

    public void File(){
        System.out.println("Samsung cihazınız ile Dosya paylaşımı yapabilir");
    }

    public void MP3(){
        System.out.println("Samsung cihazınız Mp3 destekli");

    }

    @Override
    public void Physical() {
        System.out.println("Samsung fiziksel klavyeye sahiptir.");
    }
}
