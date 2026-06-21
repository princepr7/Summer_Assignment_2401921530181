import java.util.Random;

abstract class Compartment {
    public abstract String notice();
}

class FirstClass extends Compartment {
    @Override
    public String notice() {
        return "First Class Compartment";
    }
}

class Ladies extends Compartment {
    @Override
    public String notice() {
        return "Ladies Compartment";
    }
}

class General extends Compartment {
    @Override
    public String notice() {
        return "General Compartment";
    }
}

class Luggage extends Compartment {
    @Override
    public String notice() {
        return "Luggage Compartment";
    }
}

public class TestCompartment {
    public static void main(String[] args) {

        Compartment[] coaches = new Compartment[10];
        Random rand = new Random();

        for (int i = 0; i < coaches.length; i++) {
            int choice = rand.nextInt(4) + 1; // 1 to 4

            switch (choice) {
                case 1:
                    coaches[i] = new FirstClass();
                    break;
                case 2:
                    coaches[i] = new Ladies();
                    break;
                case 3:
                    coaches[i] = new General();
                    break;
                case 4:
                    coaches[i] = new Luggage();
                    break;
            }
        }
        System.out.println("Railway Compartments:");
        for (Compartment c : coaches) {
            System.out.println(c.notice());
        }
    }
}
