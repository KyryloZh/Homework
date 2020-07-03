package Task2;

public class DOCHandler extends AbstractHandler {

    @Override
    public void open(){
        System.out.println("Opening DOC document...");
        System.out.println("Opened!");
    }

    @Override
    public void create(){
        System.out.println("Creating DOC document...");
        System.out.println("Done!");
    }

    @Override
    public void change(){
        System.out.println("Changing DOC document...");
        System.out.println("The document has been changed.");
    }

    @Override
    public void save(){
        System.out.println("Saving DOC document...");
        System.out.println("Saving complete");
    }
}
