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
public final class SparkPlugs_Factory implements Factory<SparkPlugs> {
  @Override
  public SparkPlugs get() {
    return newInstance();
  }

  public static SparkPlugs_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static SparkPlugs newInstance() {
    return new SparkPlugs();
  }

  private static final class InstanceHolder {
    private static final SparkPlugs_Factory INSTANCE = new SparkPlugs_Factory();
  }
}
