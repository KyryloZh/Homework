package Task1;

import java.util.Set;
import java.util.TreeSet;

public class Schedule {
    private Set<Seance> seances = new TreeSet<>();

    public String addSeance (Seance s){
        if (s.startTime.compareTo(Cinema.getOpen()) >= 0 && s.endTime.compareTo(Cinema.getClose()) <= 0)
        seances.add(s);
        return s.startTime + " seance is added to the schedule";
    }

    public String removeSeance (Seance s){
        seances.remove(s);
        return s.startTime + " seance is removed from the schedule.";
    }

}
