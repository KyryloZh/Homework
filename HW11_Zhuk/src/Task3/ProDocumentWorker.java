package Task3;

public class ProDocumentWorker extends DocumentWorker {
    @Override
    public void editDocument(){
        System.out.println("The document has been edited.");
    }
    @Override
    public void saveDocument(){
        System.out.println("Saved in a standard format, other formats available in Expert version.");
    }
}
