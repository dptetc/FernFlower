import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// $FF: renamed from: o
public final class class_99 extends class_86 {

   // $FF: renamed from: c int[]
   private static final int[] field_205;
   // $FF: renamed from: d aJ
   private class_86 field_206;


   // $FF: renamed from: <clinit> () void
   static void method_360() {
      field_205 = new int[]{42, 43, 44, 45, 46, 47, 42, 43, 42, 43, 44, 45, 46, 47, 42, 43, 48, 49, 12, -1};
   }

   // $FF: renamed from: <init> (int, cb) void
   public void method_361(int var1, class_118 var2) {
      super.method_252();
      this.field_148 = 7;
      class_87 var10001;
      if(var1 <= 5) {
         var10001 = new class_87;
         var10001.method_265(0, true);
         var2.method_483(var10001);
      } else if(var1 <= 7) {
         var10001 = new class_87;
         var10001.method_266(class_83.field_128, (Object)null);
         var2.method_483(var10001);
      }

      if(var1 == 19) {
         this.field_206 = (class_86)var2.method_484();
      } else {
         class_90 var3 = new class_90;
         var3.method_295(field_205[var1], var2);
         this.field_206 = var3;
      }
   }

   // $FF: renamed from: <init> (aJ) void
   private void method_362(class_86 var1) {
      super.method_252();
      this.field_148 = 7;
      this.field_206 = var1;
   }

   // $FF: renamed from: a () aJ
   public final class_86 method_261() {
      class_99 var10000 = new class_99;
      var10000.method_362(this.field_206.method_261());
      return var10000;
   }

   // $FF: renamed from: b () java.util.List
   public final List method_260() {
      ArrayList var1;
      (var1 = new ArrayList()).add(this.field_206);
      return var1;
   }

   // $FF: renamed from: a (int) java.lang.String
   public final String method_262(int var1) {
      StringBuffer var2;
      (var2 = new StringBuffer("if(")).append(this.field_206.method_262(var1));
      var2.append(")");
      return var2.toString();
   }

   public final boolean equals(Object var1) {
      if(var1 != null && var1 instanceof class_99) {
         class_99 var2 = (class_99)var1;
         return class_129.method_558(this.field_206, var2.field_206);
      } else {
         return false;
      }
   }

   // $FF: renamed from: a (aJ, aJ) void
   public final void method_263(class_86 var1, class_86 var2) {
      if(var1 == this.field_206) {
         this.field_206 = var2;
      }

   }

   // $FF: renamed from: b_ () o
   public final class_99 method_363() {
      class_90 var10001 = new class_90;
      var10001.method_296(12, Arrays.asList(new class_86[]{this.field_206}));
      this.field_206 = var10001;
      return this;
   }

   // $FF: renamed from: d () aJ
   public final class_86 method_364() {
      return this.field_206;
   }

   // $FF: renamed from: a (aJ) void
   public final void method_365(class_86 var1) {
      this.field_206 = var1;
   }
}
