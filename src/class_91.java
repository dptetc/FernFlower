import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// $FF: renamed from: aq
public final class class_91 extends class_86 {

   // $FF: renamed from: c aJ
   private class_86 field_171;
   // $FF: renamed from: d java.util.List
   private List field_172;


   // $FF: renamed from: <init> (aJ) void
   public void method_305(class_86 var1) {
      super.method_252();
      this.field_172 = new ArrayList();
      this.field_148 = 11;
      this.field_171 = var1;
   }

   // $FF: renamed from: a () aJ
   public final class_86 method_261() {
      class_91 var10000 = new class_91;
      var10000.method_305(this.field_171.method_261());
      class_91 var1 = var10000;
      ArrayList var2 = new ArrayList();
      Iterator var3 = this.field_172.iterator();

      while(var3.hasNext()) {
         List var4 = (List)var3.next();
         var2.add(new ArrayList(var4));
      }

      var1.field_172 = var2;
      return var1;
   }

   // $FF: renamed from: e () aM
   public final class_178 method_256() {
      class_178 var10000 = new class_178;
      var10000.method_817();
      class_178 var1 = var10000;
      var10000.method_819(this.field_171, class_83.field_126);
      var1.method_818(this.field_171, class_83.field_118);
      class_83 var2 = this.field_171.method_254();
      Iterator var4 = this.field_172.iterator();

      while(var4.hasNext()) {
         List var7 = (List)var4.next();
         class_87 var3 = null;
         Iterator var5 = var7.iterator();

         while(var5.hasNext()) {
            class_83 var6;
            if((var3 = (class_87)var5.next()) != null && !(var6 = var3.method_254()).equals(var2)) {
               var2 = class_83.method_245(var6, var2);
               var1.method_819(this.field_171, var2);
            }
         }
      }

      return var1;
   }

   // $FF: renamed from: b () java.util.List
   public final List method_260() {
      ArrayList var1;
      (var1 = new ArrayList()).add(this.field_171);
      return var1;
   }

   // $FF: renamed from: a (int) java.lang.String
   public final String method_262(int var1) {
      return "switch(" + this.field_171.method_262(var1) + ")";
   }

   public final boolean equals(Object var1) {
      if(var1 != null && var1 instanceof class_91) {
         class_91 var2 = (class_91)var1;
         return class_129.method_558(this.field_171, var2.field_171);
      } else {
         return false;
      }
   }

   // $FF: renamed from: a (aJ, aJ) void
   public final void method_263(class_86 var1, class_86 var2) {
      if(var1 == this.field_171) {
         this.field_171 = var2;
      }

   }

   // $FF: renamed from: a (java.util.List) void
   public final void method_306(List var1) {
      this.field_172 = var1;
   }
}
