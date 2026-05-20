package lab6;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Лабораторна №6: Dagger 2 ---");

        // Основна залежність запроваджується за допомогою компонента Dagger
        CarComponent component = DaggerCarComponent.create();
        Car car = component.getCar();
        car.drive();
    }
}