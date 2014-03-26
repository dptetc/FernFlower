
// $FF: renamed from: am
public final class class_206 {

   // $FF: renamed from: a am
   public static final class_206 field_555;
   // $FF: renamed from: b am
   public static final class_206 field_556;
   // $FF: renamed from: c am
   public static final class_206 field_557;
   // $FF: renamed from: d am
   public static final class_206 field_558;
   // $FF: renamed from: e Q
   public class_83 field_559;
   // $FF: renamed from: f java.lang.String
   public String field_560;


   // $FF: renamed from: <clinit> () void
   static void method_1007() {
      field_555 = method_1009("Ljava/lang/Integer;");
      field_556 = method_1009("Ljava/lang/Long;");
      field_557 = method_1009("Ljava/lang/Float;");
      field_558 = method_1009("Ljava/lang/Double;");
   }

   // $FF: renamed from: <init> () void
   private void method_1008() {
      super();
   }

   // $FF: renamed from: a (java.lang.String) am
   public static class_206 method_1009(String var0) {
      class_206 var10000 = new class_206;
      var10000.method_1008();
      class_206 var1 = var10000;
      class_83 var10001 = new class_83;
      var10001.method_238(var0);
      var10000.field_559 = var10001;
      var1.field_560 = var0;
      return var1;
   }

   // $FF: renamed from: a () java.lang.String
   public final String method_1010() {
      return this.field_559.toString();
   }

   public final boolean equals(Object var1) {
      if(var1 != null && var1 instanceof class_206) {
         class_206 var2 = (class_206)var1;
         return this.field_559.equals(var2.field_559);
      } else {
         return false;
      }
   }

   public final int hashCode() {
      return this.field_559.hashCode();
   }
}
