import java.util.ArrayList;

public class Taxi extends Car{
    private ArrayList<Person>people;

    public Taxi(String name, Color color, int msxGuest, int price, ArrayList<Person> people) {
        super(name, color, msxGuest, price);
        this.people = people;
    }

    public Taxi(ArrayList<Person> people) {
        this.people = people;
    }

    public Taxi() {

    }

    public ArrayList<Person> getPeople() {
        return people;
    }

    public void setPeople(ArrayList<Person> people) {
        this.people = people;
    }

    @Override
    public void stop() {
        if (people.size()<getMsxGuest()){
            System.out.println("Orun bar toktodu");
        }else {
            System.out.println("Orun jok");
        }
    }

    @Override
    public String toString() {
        return "Taxi{" +
                "people=" + people +
                '}';
    }
}
