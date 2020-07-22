package Task1;

public class Seance {
    Movie movie;
    Time startTime;
    Time endTime;

    public Seance(Movie movie, Time startTime){
        this.movie = movie;
        this.startTime = startTime;
        this.endTime.setHour(this.startTime.getHour() + movie.getDuration().getHour());
        this.endTime.setMin(this.startTime.getMin() + movie.getDuration().getMin());
    }


}
