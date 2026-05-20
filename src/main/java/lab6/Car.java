package lab6;
import javax.inject.Inject;

public class Car {
    private Engine engine;

    // Має 1 залежність
    @Inject
    public Car(Engine engine) {
        this.engine = engine;
        System.out.println(" [+++] Car зібрано (1 залежність)");
    }

    public void drive() {
        engine.start();
        System.out.println("Машина поїхала!");
    }
}