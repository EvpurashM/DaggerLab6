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
public final class Rings_Factory implements Factory<Rings> {
  @Override
  public Rings get() {
    return newInstance();
  }

  public static Rings_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static Rings newInstance() {
    return new Rings();
  }

  private static final class InstanceHolder {
    private static final Rings_Factory INSTANCE = new Rings_Factory();
  }
}
