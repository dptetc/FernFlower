import java.util.ArrayList;
import java.util.List;

// $FF: renamed from: bp
public final class class_98 extends class_86 {

   // $FF: renamed from: c int
   private int field_203;
   // $FF: renamed from: d aJ
   private class_86 field_204;


   // $FF: renamed from: <init> (int, aJ) void
   public void method_357(int var1, class_86 var2) {
      super.method_252();
      this.field_148 = 9;
      this.field_203 = var1;
      this.field_204 = var2;
   }

   // $FF: renamed from: a () aJ
   public final class_86 method_261() {
      class_98 var10000 = new class_98;
      var10000.method_357(this.field_203, this.field_204.method_261());
      return var10000;
   }

   // $FF: renamed from: b () java.util.List
   public final List method_260() {
      ArrayList var1;
      (var1 = new ArrayList()).add(this.field_204);
      return var1;
   }

   // $FF: renamed from: a (int) java.lang.String
   public final String method_262(int var1) {
      return this.field_203 == 0?"synchronized(" + this.field_204.method_262(var1) + ")":"";
   }

   public final boolean equals(Object var1) {
      if(var1 != null && var1 instanceof class_98) {
         class_98 var2 = (class_98)var1;
         return this.field_203 == var2.field_203 && class_129.method_558(this.field_204, var2.field_204);
      } else {
         return false;
      }
   }

   // $FF: renamed from: a (aJ, aJ) void
   public final void method_263(class_86 var1, class_86 var2) {
      if(var1 == this.field_204) {
         this.field_204 = var2;
      }

   }

   // $FF: renamed from: g () int
   public final int method_358() {
      return this.field_203;
   }

   // $FF: renamed from: h () aJ
   public final class_86 method_359() {
      return this.field_204;
   }
}
