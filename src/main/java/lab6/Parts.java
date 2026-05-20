package lab6;
import javax.inject.Inject;

// Останні класи в ієрархії, не мають залежностей
class Piston { @Inject Piston() { System.out.println("  -> Piston створено"); } }
class Valve { @Inject Valve() { System.out.println("  -> Valve створено"); } }
class Rings { @Inject Rings() { System.out.println("  -> Rings створено"); } }
class SparkPlugs { @Inject SparkPlugs() { System.out.println("  -> SparkPlugs створено"); } }