package Task1;

import java.util.Objects;
import java.util.Scanner;

public class Worker implements Comparable {
    private String name;
    private String position;
    private int hiringYear;

    public Worker (String name, String position, int hiringYear){
        this.name = name;
        this.position = position;
        this.hiringYear = hiringYear;
    }



    public String getName(){ return name; }
    public void setName(String name){this.name = name; }

    public String getPosition(){ return position; }
    public void setPosition(String position){ this.position = position; }

    public int getHiringYear(){ return hiringYear; }
    public void setHiringYear(int hiringYear) {this.hiringYear = hiringYear; }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}

