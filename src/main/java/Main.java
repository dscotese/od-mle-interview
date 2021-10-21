import C.Simulator;
import extras.Location;
import extras.Person;

public class Main {

    public static void problemA() {
        // TODO explain why this class is not working as expected
        // Fix this class so the correct names get printed out
        Person solange = new Person("Solange");
        Person beyonce = new Person("Beyonce");
        solange.sayMyName();
        beyonce.sayMyName();
    }

    public static void problemB() {
        Location atl = new Location("Alpharetta","GA",30005, -84.2941f, 34.0754f);
        Location nyc = new Location("NYC","NY",10111,-74.0060f,40.7128f);
        // These functions MUST be implemented in package B
        double edist = 0.0; // TODO implement a function which uses Euclidean distance for finding the distance between atl and nyc
        double hdist = 0.0;// TODO implement a function which uses Haversine formula for finding the distance between atl and nyc
        // TODO write a unit test for each of these functions in the src.tests folder
    }

    public static void problemC() {
        Person solange = new Person("Solange");
        Person beyonce = new Person("Beyonce");
        Location atl = new Location("Alpharetta","GA",30005, -84.2941f, 34.0754f);
        Location nyc = new Location("NYC","NY",10111,-74.0060f,40.7128f);
        Simulator sim = new Simulator();
        sim.goOnATrip(solange, beyonce, atl, nyc);
    }

    public static void main(String[] args) {
        System.out.println("Let's get it started!");

        problemA();
        problemB();
        problemC();
    }
}
