package Task2;

public class XMLHandler extends AbstractHandler {

    @Override
    public void open(){
        System.out.println("Opening XML document...");
        System.out.println("Opened!");
    }

    @Override
    public void create(){
        System.out.println("Creating XML document...");
        System.out.println("Done!");
    }

    @Override
    public void change(){
        System.out.println("Changing XML document...");
        System.out.println("The document has been changed.");
    }

    @Override
    public void save(){
        System.out.println("Saving XML document...");
        System.out.println("Saving complete");
    }
}
