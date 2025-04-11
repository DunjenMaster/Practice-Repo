package ConceptOfInterfaceWithAbstraction;

//Concrete class
class Phone{
    public void call(){
        System.out.println("Calling from phone.");
    }

    public void message(){
        System.out.println("Sending sms from phone.");
    }
}

// Interface is a from of Absrtact Class where the methods are abstract by default.
interface ICamera{
    void click();
    void record();
}

interface IMusicPlayer{
    void Play();
    void Pause();
    void stop();
}

// A sub Concrete class to inherit and implement the abstract methods of the interface. And to override the methods of the interface because they are having the abstract classes.
class SmartPhone extends Phone implements ICamera, IMusicPlayer
{
    public void click() {
        System.out.println("Clicking photo from SmartPhone's ICamera.");
    }

    public void record(){
        System.out.println("Recording video from SmartPhone's ICamera.");
    }

    public void Play(){
        System.out.println("Playing music from SmartPhone's IMusicPlayer.");
    }

    public void Pause(){
        System.out.println("Pausing music from SmartPhone's IMusicPlayer.");
    }

    public void stop(){
        System.out.println("Stopping music from SmartPhone's IMusicPlayer.");
    }

    public void videoCall(){
        System.out.println("Video calling from SmartPhone.");
    }
}

public class Demo1 {
    public static void main(String[] args) {
        SmartPhone sp = new SmartPhone();
        sp.call();
        sp.message();
        sp.click();
        sp.record();
        sp.Play();
        sp.Pause();
        sp.stop();
        sp.videoCall();
        
        System.out.println("");

        // Using the IMusicPlayer Interface as a reference to create the object of the SmartPhone class. And in order to only allow to use the methods of IMusicPlayer. 
        IMusicPlayer mp = new SmartPhone();
        mp.Play();
        mp.Pause();     
        mp.stop();
    }

}
