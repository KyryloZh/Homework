package Task1;

public class GoodPupil extends Pupil {

    @Override
    public void study() {
        System.out.println("Good pupil studies");
    }

    @Override
    public void read() {
        System.out.println("Good pupil reads");
    }

    @Override
    public void write() {
        System.out.println("Good pupil writes");
    }

    @Override
    public void rest(){
        System.out.println("Good pupil rests");
    }

}
