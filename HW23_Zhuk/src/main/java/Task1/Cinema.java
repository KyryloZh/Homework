package Task1;

import java.util.TreeMap;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;

public class Cinema {
    private Map<Days, Schedule>schedules = new TreeMap<>();
    private static Time open, close;

    public  static Time getOpen() { return open; }
    public void setOpen(Time open) { this.open = open; }

    public static Time getClose() { return close; }
    public void setClose(Time close) { this.close = close; }

    public String addScheduleToOneDay(Days day, Schedule schedule){
        Set<Map.Entry<Days, Schedule>> entries = schedules.entrySet();
        for (Map.Entry <Days, Schedule> entry : entries) {
            if (entry.getKey().equals(day)) {
                entry.setValue(schedule);
            }
        }
        return "Schedule set for " + day;
    }

    @NotNull
    public String addScheduleToMultipleDays (Set<Days> days, Schedule schedule){
        Set<Map.Entry<Days, Schedule>> entries = schedules.entrySet();
        for (Days day : days) {
            for (Map.Entry<Days, Schedule> entry : entries) {
                if (entry.getKey().equals(day)){
                    entry.setValue(schedule);
                }
            }
        }
        return "Schedule is added to all the specified days.";
    }

    public String removeScheduleFromOneDay(Days day, Schedule schedule){
        Set<Map.Entry<Days, Schedule>> entries = schedules.entrySet();
        for (Map.Entry <Days, Schedule> entry : entries) {
            if (entry.getKey().equals(day)) { entries.remove(entry); }
        }
        return "Schedule removed from " + day;
    }

    @NotNull
    public String removeScheduleFromAllDays (Set<Days> days, Schedule schedule){
        Set<Map.Entry<Days, Schedule>> entries = schedules.entrySet();
        for (Days day : days) {
            for (Map.Entry <Days, Schedule> entry : entries) {
                if (entry.getKey().equals(day)) { entries.remove(entry); }
            }
        }
        return "Schedule is removed from specified days.";
    }
}

