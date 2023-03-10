import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        Person person1 = new Person("Manas", 27,Gender.MALE);
        Person person2 = new Person("Manas", 27,Gender.MALE);
        Person person3 = new Person("Manas", 27,Gender.MALE);
        Person person4 = new Person("Manas", 27,Gender.MALE);
        Person person5 = new Person("Manas", 27,Gender.MALE);
        Person person6 = new Person("Manas", 27,Gender.MALE);
        Person person7 = new Person("Manas", 27,Gender.MALE);
        Person person8 = new Person("Manas", 27,Gender.MALE);
        Person person9 = new Person("Manas", 27,Gender.MALE);
        Person person10 = new Person("Manas", 27,Gender.MALE);
        Person person11 = new Person("Ulan", 27,Gender.MALE);
        Person person12 = new Person("Manas", 27,Gender.MALE);
        Person person13 = new Person("Manas", 27,Gender.MALE);
        Person person14 = new Person("Manas", 27,Gender.MALE);
        Person person15 = new Person("Manas", 27,Gender.MALE);
        Person person16 = new Person("Manas", 27,Gender.MALE);
        Person person17 = new Person("Manas", 27,Gender.MALE);
        Person person18 = new Person("Manas", 27,Gender.MALE);
        Person person19 = new Person("Manas", 27,Gender.MALE);
        Person person20 = new Person("bek", 27,Gender.MALE);

        ArrayList<Person>people=new ArrayList<>(Arrays.asList(person16,person17,person18,person19,person20));
        people.add(person1);
        people.add(person2);
        people.add(person3);
        people.add(person4);
        people.add(person5);
        people.add(person6);
        people.add(person7);
        people.add(person8);
        people.add(person9);
        people.add(person10);
        people.add(person11);
        ArrayList<Person>people1=new ArrayList<>();
        people1.add(person12);
        people1.add(person13);
        people1.add(person14);
        people1.add(person15);
        Car bus = new Bus("Bus",Color.BLUE,20,200,people);
        Car taxi = new Taxi("Taxi",Color.BLACK,4,500,people1);
        Car[] cars = {taxi,bus};
        StopAblelImpl stopAblel = new StopAblelImpl();
        stopAblel.allCars(cars);
        stopAblel.passenger(cars,"Bus");
        stopAblel.cars(cars,"Bus");
        bus.stop();
        taxi.stop();
    }
}