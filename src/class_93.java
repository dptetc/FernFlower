import java.util.ArrayList;
import java.util.List;

// $FF: renamed from: aC
public final class class_93 extends class_86 {

   // $FF: renamed from: c java.lang.String[]
   private static final String[] field_179;
   // $FF: renamed from: d aJ
   private class_86 field_180;
   // $FF: renamed from: e aJ
   private class_86 field_181;
   // $FF: renamed from: f int
   private int field_182;


   // $FF: renamed from: <clinit> () void
   static void method_314() {
      field_179 = new String[]{" += ", " -= ", " *= ", " /= ", " &= ", " |= ", " ^= ", " %= ", " <<= ", " >>= ", " >>>= "};
   }

   // $FF: renamed from: <init> (aJ, aJ) void
   public void method_315(class_86 var1, class_86 var2) {
      super.method_252();
      this.field_182 = -1;
      this.field_148 = 2;
      this.field_180 = var1;
      this.field_181 = var2;
   }

   // $FF: renamed from: c () Q
   public final class_83 method_254() {
      return this.field_181.method_254();
   }

   // $FF: renamed from: e () aM
   public final class_178 method_256() {
      class_178 var10000 = new class_178;
      var10000.method_817();
      class_178 var1 = var10000;
      class_83 var2 = this.field_180.method_254();
      class_83 var3 = this.field_181.method_254();
      if(var2.field_134 > var3.field_134) {
         var1.method_819(this.field_181, class_83.method_246(var2.field_134));
      } else if(var2.field_134 < var3.field_134) {
         var1.method_819(this.field_180, var3);
      } else {
         var1.method_819(this.field_180, class_83.method_245(var2, var3));
      }

      return var1;
   }

   // $FF: renamed from: b () java.util.List
   public final List method_260() {
      ArrayList var1;
      (var1 = new ArrayList()).add(this.field_180);
      var1.add(this.field_181);
      return var1;
   }

   // $FF: renamed from: a () aJ
   public final class_86 method_261() {
      class_93 var10000 = new class_93;
      var10000.method_315(this.field_180.method_261(), this.field_181.method_261());
      return var10000;
   }

   // $FF: renamed from: c_ () int
   public final int method_253() {
      return 13;
   }

   // $FF: renamed from: a (int) java.lang.String
   public final String method_262(int var1) {
      class_83 var2 = this.field_180.method_254();
      class_83 var3 = this.field_181.method_254();
      String var4 = this.field_181.method_262(var1);
      if(this.field_182 == -1 && !var2.method_242(var3) && (var3.equals(class_83.field_131) || var2.field_133 != 8)) {
         if(this.field_181.method_253() >= class_90.method_297()) {
            var4 = "(" + var4 + ")";
         }

         var4 = "(" + class_209.method_1039(var2) + ")" + var4;
      }

      StringBuilder var7 = new StringBuilder();
      boolean var8 = false;
      class_92 var5;
      class_177 var6;
      class_168 var9;
      if(this.field_180.field_148 == 5 && (var5 = (class_92)this.field_180).method_312() && (var6 = (class_177)class_181.method_844("CURRENT_CLASSNODE")) != null && (var9 = var6.field_438.method_967(var5.method_313(), var5.method_310())) != null && (var9.field_423 & 16) != 0) {
         var8 = true;
      }

      if(var8) {
         var7.append(((class_92)this.field_180).method_313());
      } else {
         var7.append(this.field_180.method_262(var1));
      }

      var7.append((this.field_182 == -1?" = ":field_179[this.field_182]) + var4);
      return var7.toString();
   }

   public final boolean equals(Object var1) {
      if(var1 != null && var1 instanceof class_93) {
         class_93 var2 = (class_93)var1;
         return class_129.method_558(this.field_180, var2.field_180) && class_129.method_558(this.field_181, var2.field_181) && this.field_182 == var2.field_182;
      } else {
         return false;
      }
   }

   // $FF: renamed from: a (aJ, aJ) void
   public final void method_263(class_86 var1, class_86 var2) {
      if(var1 == this.field_180) {
         this.field_180 = var2;
      }

      if(var1 == this.field_181) {
         this.field_181 = var2;
      }

   }

   // $FF: renamed from: g () aJ
   public final class_86 method_316() {
      return this.field_180;
   }

   // $FF: renamed from: h () aJ
   public final class_86 method_317() {
      return this.field_181;
   }

   // $FF: renamed from: a (aJ) void
   public final void method_318(class_86 var1) {
      this.field_181 = var1;
   }

   // $FF: renamed from: i () int
   public final int method_319() {
      return this.field_182;
   }

   // $FF: renamed from: b (int) void
   public final void method_320(int var1) {
      this.field_182 = var1;
   }
}
