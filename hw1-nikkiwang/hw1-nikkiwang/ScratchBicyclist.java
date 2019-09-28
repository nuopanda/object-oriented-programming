package Assignment1;

public class ScratchBicyclist {
    public static void main(String[] args) {
        Time end = new Time(10, 18, 10);
        Time start = new Time(1, 20, 40);
        Bicyclist person = new Bicyclist("Max", "Seattle", start, end);
        Time duration = person.getDuration();
        System.out.println("hour: " + duration.getHour());
        System.out.println("min: " + duration.getMin());
        System.out.println("sec: " + duration.getSec());
    }
}
