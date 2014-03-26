import java.util.ArrayList;
import java.util.List;

// $FF: renamed from: X
public final class class_100 extends class_86 {

   // $FF: renamed from: c aJ
   private class_86 field_207;
   // $FF: renamed from: d aJ
   private class_86 field_208;
   // $FF: renamed from: e Q
   private class_83 field_209;


   // $FF: renamed from: <init> (aJ, aJ, Q) void
   public void method_366(class_86 var1, class_86 var2, class_83 var3) {
      super.method_252();
      this.field_148 = 1;
      this.field_207 = var1;
      this.field_208 = var2;
      this.field_209 = var3;
   }

   // $FF: renamed from: a () aJ
   public final class_86 method_261() {
      class_100 var10000 = new class_100;
      var10000.method_366(this.field_207.method_261(), this.field_208.method_261(), this.field_209);
      return var10000;
   }

   // $FF: renamed from: c () Q
   public final class_83 method_254() {
      class_83 var1;
      if((var1 = this.field_207.method_254().method_241()).equals(class_83.field_128)) {
         var1 = this.field_209.method_241();
      } else {
         var1.method_240();
      }

      return var1;
   }

   // $FF: renamed from: d_ () int
   public final int method_255() {
      return this.field_207.method_255() & this.field_208.method_255() & 1;
   }

   // $FF: renamed from: e () aM
   public final class_178 method_256() {
      class_178 var10000 = new class_178;
      var10000.method_817();
      class_178 var1 = var10000;
      var10000.method_819(this.field_208, class_83.field_126);
      var1.method_818(this.field_208, class_83.field_118);
      return var1;
   }

   // $FF: renamed from: b () java.util.List
   public final List method_260() {
      ArrayList var1;
      (var1 = new ArrayList()).add(this.field_207);
      var1.add(this.field_208);
      return var1;
   }

   // $FF: renamed from: a (int) java.lang.String
   public final String method_262(int var1) {
      String var2 = this.field_207.method_262(var1);
      if(this.field_207.method_253() > this.method_253()) {
         var2 = "(" + var2 + ")";
      }

      class_83 var10000 = this.field_207.method_254();
      class_83 var3 = null;
      if(var10000.field_135 == 0) {
         (var3 = class_83.field_131.method_241()).field_135 = 1;
         var2 = "((" + class_209.method_1039(var3) + ")" + var2 + ")";
      }

      return var2 + "[" + this.field_208.method_262(var1) + "]";
   }

   public final boolean equals(Object var1) {
      if(var1 != null && var1 instanceof class_100) {
         class_100 var2 = (class_100)var1;
         return class_129.method_558(this.field_207, var2.field_207) && class_129.method_558(this.field_208, var2.field_208);
      } else {
         return false;
      }
   }

   // $FF: renamed from: a (aJ, aJ) void
   public final void method_263(class_86 var1, class_86 var2) {
      if(var1 == this.field_207) {
         this.field_207 = var2;
      }

      if(var1 == this.field_208) {
         this.field_208 = var2;
      }

   }

   // $FF: renamed from: f () aJ
   public final class_86 method_367() {
      return this.field_207;
   }

   // $FF: renamed from: g () aJ
   public final class_86 method_368() {
      return this.field_208;
   }
}
