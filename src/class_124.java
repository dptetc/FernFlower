
// $FF: renamed from: cV
public final class class_124 {

   // $FF: renamed from: a int[]
   public static final int[] field_298;
   // $FF: renamed from: e int
   private int field_299;
   // $FF: renamed from: f ca
   private class_46 field_300;
   // $FF: renamed from: g ca
   private class_46 field_301;
   // $FF: renamed from: h java.lang.String
   private String field_302;
   // $FF: renamed from: b ca
   public class_46 field_303;
   // $FF: renamed from: c boolean
   public boolean field_304;
   // $FF: renamed from: d boolean
   public boolean field_305;


   // $FF: renamed from: <clinit> () void
   static void method_514() {
      field_298 = new int[]{1, 2, 4, 8, 32};
   }

   // $FF: renamed from: <init> (int, ca, ca, ca) void
   public void method_515(int var1, class_46 var2, class_46 var3, class_46 var4) {
      this.method_516(var1, var2, var3);
      this.field_303 = var4;
   }

   // $FF: renamed from: <init> (int, ca, ca) void
   public void method_516(int var1, class_46 var2, class_46 var3) {
      super();
      this.field_304 = true;
      this.field_305 = true;
      this.field_299 = var1;
      this.field_300 = var2;
      this.field_301 = var3;
   }

   // $FF: renamed from: <init> (ca, ca, java.lang.String) void
   public void method_517(class_46 var1, class_46 var2, String var3) {
      this.method_516(2, var1, var2);
      this.field_302 = var3;
   }

   // $FF: renamed from: a () int
   public final int method_518() {
      return this.field_299;
   }

   // $FF: renamed from: a (int) void
   public final void method_519(int var1) {
      this.field_299 = var1;
   }

   // $FF: renamed from: b () ca
   public final class_46 method_520() {
      return this.field_300;
   }

   // $FF: renamed from: a (ca) void
   public final void method_521(class_46 var1) {
      this.field_300 = var1;
   }

   // $FF: renamed from: c () ca
   public final class_46 method_522() {
      return this.field_301;
   }

   // $FF: renamed from: b (ca) void
   public final void method_523(class_46 var1) {
      this.field_301 = var1;
   }

   // $FF: renamed from: d () java.lang.String
   public final String method_524() {
      return this.field_302;
   }
}
