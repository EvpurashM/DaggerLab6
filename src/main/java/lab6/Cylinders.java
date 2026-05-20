package lab6;
import javax.inject.Inject;

public class Cylinders {
    // Має 3 залежності
    @Inject
    public Cylinders(Piston p, Valve v, Rings r) {
        System.out.println(" [+] Cylinders зібрано (3 залежності)");
    }
}