package Task2;

public class TXTHandler extends AbstractHandler {

    @Override
    public void open(){
        System.out.println("Opening TXT document...");
        System.out.println("Opened!");
    }

    @Override
    public void create(){
        System.out.println("Creating TXT document...");
        System.out.println("Done!");
    }

    @Override
    public void change(){
        System.out.println("Changing TXT document...");
        System.out.println("The document has been changed.");
    }

    @Override
    public void save(){
        System.out.println("Saving TXT document...");
        System.out.println("Saving complete");
    }
}
