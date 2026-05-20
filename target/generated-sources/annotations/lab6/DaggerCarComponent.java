package lab6;

import dagger.internal.DaggerGenerated;
import javax.annotation.Generated;

@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class DaggerCarComponent {
  private DaggerCarComponent() {
  }

  public static Builder builder() {
    return new Builder();
  }

  public static CarComponent create() {
    return new Builder().build();
  }

  public static final class Builder {
    private Builder() {
    }

    public CarComponent build() {
      return new CarComponentImpl();
    }
  }

  private static final class CarComponentImpl implements CarComponent {
    private final CarComponentImpl carComponentImpl = this;

    private CarComponentImpl() {


    }

    private Cylinders cylinders() {
      return new Cylinders(new Piston(), new Valve(), new Rings());
    }

    private Engine engine() {
      return new Engine(cylinders(), new SparkPlugs());
    }

    @Override
    public Car getCar() {
      return new Car(engine());
    }
  }
}
