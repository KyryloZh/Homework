package Task1;

public class Main {
    public static void main(String[] args) {
        Pupil firstPupil = new BadPupil();
        Pupil secondPupil = new GoodPupil();
        Pupil thirdPupil = new ExcellentPupil();
        Pupil fourthPupil = new GoodPupil();
        ClassRoom test = new ClassRoom(firstPupil, secondPupil, thirdPupil, fourthPupil);

        test.studying();
        test.resting();
        test.writing();
        test.reading();
    }
}
