package lab6;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.Generated;

@ScopeMetadata
@QualifierMetadata
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
public final class Valve_Factory implements Factory<Valve> {
  @Override
  public Valve get() {
    return newInstance();
  }

  public static Valve_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static Valve newInstance() {
    return new Valve();
  }

  private static final class InstanceHolder {
    private static final Valve_Factory INSTANCE = new Valve_Factory();
  }
}
