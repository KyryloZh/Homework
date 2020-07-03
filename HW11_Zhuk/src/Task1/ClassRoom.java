package Task1;

public class ClassRoom {
    private Pupil no1, no2, no3, no4;

    public ClassRoom(Pupil no1, Pupil no2, Pupil no3, Pupil no4){
        this.no1 = no1;
        this.no2 = no2;
        this.no3 = no3;
        this.no4 = no4;
    }
    public ClassRoom(Pupil no1, Pupil no2, Pupil no3){
        this.no1 = no1;
        this.no2 = no2;
        this.no3 = no3;
    }
    public ClassRoom(Pupil no1, Pupil no2){
        this.no1 = no1;
        this.no2 = no2;
    }
    public ClassRoom(Pupil no1){
        this.no1 = no1;
    }

    public void studying (){
        no1.study();
        no2.study();
        no3.study();
        no4.study();
        System.out.println();
    }
    public void reading (){
        no1.read();
        no2.read();
        no3.read();
        no4.read();
        System.out.println();
    }
    public void writing (){
        no1.write();
        no2.write();
        no3.write();
        no4.write();
        System.out.println();
    }
    public void resting (){
        no1.rest();
        no2.rest();
        no3.rest();
        no4.rest();
        System.out.println();
    }






}



    /*  Створити клас, що представляє навчальний клас ClassRoom.
        Створіть клас Pupil. У тілі класу створіть методи void study (), void read (), void write (), void relax ()
        які виводитимуть "Pupil study", "Pupil read" і т.д.
        Створіть 3 похідних класу ExcellentPupil, GoodPupil, BadPupil від класу базового класу Pupil і
        перевизначите кожен з методів, в залежності від успішності учня.("GoodPupil read", "Bad pupil read" і т.д.)
        Конструктор класу ClassRoom приймає аргументи типу Pupil, клас повинен складатися з 4 учнів.
        Передбачте можливість того, що користувач може передати 2 або 3 аргументи.
        Виведіть інформацію про те, як всі учні екземпляра класу ClassRoom вміють вчитися, читати, писати,
        відпочивати.*/