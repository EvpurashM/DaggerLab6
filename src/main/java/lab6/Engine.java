package lab6;
import javax.inject.Inject;

public class Engine {
    // Має 2 залежності
    @Inject
    public Engine(Cylinders c, SparkPlugs s) {
        System.out.println(" [++] Engine зібрано (2 залежності)");
    }
    public void start() { System.out.println("Вррр! Двигун працює."); }
}