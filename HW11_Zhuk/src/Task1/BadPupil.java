package Task1;

public class BadPupil extends Pupil {
    @Override
    public void study() {
        System.out.println("Bad pupil studies");
    }

    @Override
    public void read() {
        System.out.println("Bad pupil reads");
    }

    @Override
    public void write() {
        System.out.println("Bad pupil writes");
    }

    @Override
    public void rest(){
        System.out.println("Bad pupil rests");
    }
}
