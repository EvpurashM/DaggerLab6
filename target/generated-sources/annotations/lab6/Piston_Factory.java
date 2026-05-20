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
public final class Piston_Factory implements Factory<Piston> {
  @Override
  public Piston get() {
    return newInstance();
  }

  public static Piston_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static Piston newInstance() {
    return new Piston();
  }

  private static final class InstanceHolder {
    private static final Piston_Factory INSTANCE = new Piston_Factory();
  }
}
