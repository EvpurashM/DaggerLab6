package lab6;
import dagger.Component;

// За допомогою цієї анотації Dagger будує граф залежностей
@Component
public interface CarComponent {
    Car getCar();
}