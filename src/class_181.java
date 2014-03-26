import de.fernflower.main.extern.IFernflowerLogger;
import java.util.HashMap;

// $FF: renamed from: aD
public final class class_181 {

   // $FF: renamed from: a java.lang.ThreadLocal
   private static ThreadLocal field_458;
   // $FF: renamed from: b java.util.HashMap
   private HashMap field_459;
   // $FF: renamed from: c i
   private class_107 field_460;
   // $FF: renamed from: d cL
   private class_131 field_461;
   // $FF: renamed from: e bS
   private class_193 field_462;
   // $FF: renamed from: f aI
   private class_176 field_463;
   // $FF: renamed from: g cG
   private class_136 field_464;
   // $FF: renamed from: h u
   private class_110 field_465;
   // $FF: renamed from: i de.fernflower.main.extern.IFernflowerLogger
   private IFernflowerLogger field_466;


   // $FF: renamed from: <clinit> () void
   static void method_839() {
      field_458 = new ThreadLocal();
   }

   // $FF: renamed from: <init> (java.util.HashMap) void
   private void method_840(HashMap var1) {
      super();
      this.field_459 = new HashMap();
      this.field_459.putAll(var1);
   }

   // $FF: renamed from: a (java.util.HashMap) void
   public static void method_841(HashMap var0) {
      HashMap var1;
      (var1 = new HashMap()).put("din", "1");
      var1.put("dc4", "1");
      var1.put("das", "1");
      var1.put("rbr", "1");
      var1.put("rsy", "0");
      var1.put("hes", "1");
      var1.put("hdc", "1");
      var1.put("dgs", "0");
      var1.put("occ", "0");
      var1.put("ner", "1");
      var1.put("den", "1");
      var1.put("fdi", "1");
      var1.put("rgn", "1");
      var1.put("bto", "1");
      var1.put("nns", "1");
      var1.put("uto", "1");
      var1.put("udv", "1");
      var1.put("mpm", "0");
      var1.put("rer", "1");
      if(var0 != null) {
         var1.putAll(var0);
      }

      ThreadLocal var10000 = field_458;
      class_181 var10001 = new class_181;
      var10001.method_840(var1);
      var10000.set(var10001);
   }

   // $FF: renamed from: a () aD
   public static class_181 method_842() {
      return (class_181)field_458.get();
   }

   // $FF: renamed from: a (aD) void
   public static void method_843(class_181 var0) {
      field_458.set(var0);
   }

   // $FF: renamed from: a (java.lang.String) java.lang.Object
   public static Object method_844(String var0) {
      return method_842().field_459.get(var0);
   }

   // $FF: renamed from: a (java.lang.String, java.lang.Object) void
   public static void method_845(String var0, Object var1) {
      method_842().field_459.put(var0, var1);
   }

   // $FF: renamed from: b (java.lang.String) boolean
   public static boolean method_846(String var0) {
      return "1".equals(method_842().field_459.get(var0));
   }

   // $FF: renamed from: b () cL
   public static class_131 method_847() {
      return method_842().field_461;
   }

   // $FF: renamed from: a (cL) void
   public static void method_848(class_131 var0) {
      method_842().field_461 = var0;
   }

   // $FF: renamed from: c () bS
   public static class_193 method_849() {
      return method_842().field_462;
   }

   // $FF: renamed from: a (bS) void
   public static void method_850(class_193 var0) {
      method_842().field_462 = var0;
   }

   // $FF: renamed from: d () i
   public static class_107 method_851() {
      return method_842().field_460;
   }

   // $FF: renamed from: a (i) void
   public static void method_852(class_107 var0) {
      method_842().field_460 = var0;
   }

   // $FF: renamed from: e () aI
   public static class_176 method_853() {
      return method_842().field_463;
   }

   // $FF: renamed from: a (aI) void
   public static void method_854(class_176 var0) {
      method_842().field_463 = var0;
   }

   // $FF: renamed from: f () cG
   public static class_136 method_855() {
      return method_842().field_464;
   }

   // $FF: renamed from: a (cG) void
   public static void method_856(class_136 var0) {
      method_842().field_464 = var0;
   }

   // $FF: renamed from: g () u
   public static class_110 method_857() {
      return method_842().field_465;
   }

   // $FF: renamed from: a (u) void
   public static void method_858(class_110 var0) {
      method_842().field_465 = var0;
   }

   // $FF: renamed from: h () de.fernflower.main.extern.IFernflowerLogger
   public static IFernflowerLogger method_859() {
      return method_842().field_466;
   }

   // $FF: renamed from: a (de.fernflower.main.extern.IFernflowerLogger) void
   public static void method_860(IFernflowerLogger var0) {
      method_842().field_466 = var0;
      String var1;
      Integer var2;
      if((var0 = method_842().field_466) != null && (var1 = (String)method_844("log")) != null && (var2 = (Integer)IFernflowerLogger.mapLogLevel.get(var1.toUpperCase())) != null) {
         var0.setSeverity(var2.intValue());
      }

   }
}
