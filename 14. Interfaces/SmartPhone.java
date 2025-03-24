class Phone{
    void call()
    {
        System.out.println("calling your friend");
    }
    void sms()
    {
        System.out.println("doing sms to your friend");
    }
}
interface Camera{
    void clickPhoto();
    void record();
}
interface MusicPlayer{
    void playMusic();
    void stopMusic();
}
class Smart  extends Phone implements Camera,MusicPlayer{
    public void clickPhoto()
    {
        System.out.println("you are clicking a photo");
    }
    public void record()
    {
        System.out.println("you are recording a video");
    }
    public void playMusic()
    {
        System.out.println("you are playing a music ");
    }
    public void stopMusic()
    {
        System.out.println("music is stopped");
    }
}
public class SmartPhone{
    public static void main(String[] args)
    {
        Smart s = new Smart();
        s.call();
        s.sms();
        s.clickPhoto();
        s.record();
        s.playMusic();
        s.stopMusic();
        Camera c = s;
        c.clickPhoto();
        c.record();
        
    }
}