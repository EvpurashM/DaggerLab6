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
public final class Cylinders_Factory implements Factory<Cylinders> {
  private final Provider<Piston> pProvider;

  private final Provider<Valve> vProvider;

  private final Provider<Rings> rProvider;

  public Cylinders_Factory(Provider<Piston> pProvider, Provider<Valve> vProvider,
      Provider<Rings> rProvider) {
    this.pProvider = pProvider;
    this.vProvider = vProvider;
    this.rProvider = rProvider;
  }

  @Override
  public Cylinders get() {
    return newInstance(pProvider.get(), vProvider.get(), rProvider.get());
  }

  public static Cylinders_Factory create(Provider<Piston> pProvider, Provider<Valve> vProvider,
      Provider<Rings> rProvider) {
    return new Cylinders_Factory(pProvider, vProvider, rProvider);
  }

  public static Cylinders newInstance(Object p, Object v, Object r) {
    return new Cylinders((Piston) p, (Valve) v, (Rings) r);
  }
}
