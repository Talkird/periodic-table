import element.ElementManager;
import ui.Frame;

public class Main {
    
    public static ElementManager elementManager;
    public static Frame frame;

    public static void main(String[] args) {
        
        elementManager = new ElementManager();
        frame = new Frame();

        elementManager.initElements();


    }

}
