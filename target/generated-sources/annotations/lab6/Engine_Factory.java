package lab6;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.Generated;
import javax.inject.Provider;

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
public final class Engine_Factory implements Factory<Engine> {
  private final Provider<Cylinders> cProvider;

  private final Provider<SparkPlugs> sProvider;

  public Engine_Factory(Provider<Cylinders> cProvider, Provider<SparkPlugs> sProvider) {
    this.cProvider = cProvider;
    this.sProvider = sProvider;
  }

  @Override
  public Engine get() {
    return newInstance(cProvider.get(), sProvider.get());
  }

  public static Engine_Factory create(Provider<Cylinders> cProvider,
      Provider<SparkPlugs> sProvider) {
    return new Engine_Factory(cProvider, sProvider);
  }

  public static Engine newInstance(Cylinders c, Object s) {
    return new Engine(c, (SparkPlugs) s);
  }
}
