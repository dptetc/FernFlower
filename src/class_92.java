import java.util.ArrayList;
import java.util.List;

// $FF: renamed from: aG
public final class class_92 extends class_86 {

   // $FF: renamed from: c java.lang.String
   private String field_173;
   // $FF: renamed from: d java.lang.String
   private String field_174;
   // $FF: renamed from: e boolean
   private boolean field_175;
   // $FF: renamed from: f aJ
   private class_86 field_176;
   // $FF: renamed from: g am
   private class_206 field_177;
   // $FF: renamed from: h java.lang.String
   private String field_178;


   // $FF: renamed from: <init> (g, aJ) void
   public void method_307(class_79 var1, class_86 var2) {
      super.method_252();
      this.field_148 = 5;
      this.field_176 = var2;
      if(var2 == null) {
         this.field_175 = true;
      }

      this.field_174 = var1.field_102;
      this.field_173 = var1.field_103;
      this.field_178 = var1.field_104;
      this.field_177 = class_206.method_1009(var1.field_104);
   }

   // $FF: renamed from: <init> (java.lang.String, java.lang.String, boolean, aJ, am) void
   public void method_308(String var1, String var2, boolean var3, class_86 var4, class_206 var5) {
      super.method_252();
      this.field_148 = 5;
      this.field_173 = var1;
      this.field_174 = var2;
      this.field_175 = var3;
      this.field_176 = var4;
      this.field_177 = var5;
      this.field_178 = var5.field_560;
   }

   // $FF: renamed from: c () Q
   public final class_83 method_254() {
      return this.field_177.field_559;
   }

   // $FF: renamed from: d_ () int
   public final int method_255() {
      return this.field_176 == null?1:this.field_176.method_255() & 1;
   }

   // $FF: renamed from: b () java.util.List
   public final List method_260() {
      ArrayList var1 = new ArrayList();
      if(this.field_176 != null) {
         var1.add(this.field_176);
      }

      return var1;
   }

   // $FF: renamed from: a () aJ
   public final class_86 method_261() {
      class_92 var10000 = new class_92;
      var10000.method_308(this.field_173, this.field_174, this.field_175, this.field_176 == null?null:this.field_176.method_261(), this.field_177);
      return var10000;
   }

   // $FF: renamed from: a (int) java.lang.String
   public final String method_262(int var1) {
      StringBuffer var2 = new StringBuffer();
      if(this.field_175) {
         class_177 var3;
         if((var3 = (class_177)class_181.method_844("CURRENT_CLASSNODE")) == null || !this.field_174.equals(var3.field_438.field_528)) {
            var2.append(class_181.method_847().method_571(class_209.method_1042(this.field_174), true));
            var2.append(".");
         }
      } else {
         String var6 = null;
         String var9;
         if(this.field_176 != null && this.field_176.field_148 == 12) {
            class_88 var4 = (class_88)this.field_176;
            class_77 var10000 = new class_77;
            var10000.method_216(var4);
            class_77 var5 = var10000;
            class_120 var8;
            if((var8 = (class_120)class_181.method_844("CURRENT_METHOD_WRAPPER")) != null && (var9 = (String)var8.field_278.method_757().get(var5)) != null && !this.field_174.equals(var9)) {
               var6 = var9;
            }
         }

         if(var6 != null) {
            class_198 var12 = ((class_177)class_181.method_844("CURRENT_CLASSNODE")).field_438;
            if(!var6.equals(var12.field_528)) {
               var2.append(class_181.method_847().method_571(class_209.method_1042(var6), true));
               var2.append(".");
            }

            var2.append("super");
         } else {
            StringBuilder var11 = new StringBuilder();
            class_86 var7 = this.field_176;
            class_83 var10001 = new class_83;
            var10001.method_237(8, 0, this.field_174);
            boolean var10 = class_209.method_1045(var7, var10001, var11, var1, true);
            var9 = var11.toString();
            if(var10 || this.field_176.method_253() > this.method_253()) {
               var9 = "(" + var9 + ")";
            }

            var2.append(var9);
         }

         var2.append(".");
      }

      var2.append(this.field_173);
      return var2.toString();
   }

   public final boolean equals(Object var1) {
      if(var1 != null && var1 instanceof class_92) {
         class_92 var2 = (class_92)var1;
         return class_129.method_558(this.field_173, var2.field_173) && class_129.method_558(this.field_174, var2.field_174) && this.field_175 == var2.field_175 && class_129.method_558(this.field_176, var2.field_176) && class_129.method_558(this.field_178, var2.field_178);
      } else {
         return false;
      }
   }

   // $FF: renamed from: a (aJ, aJ) void
   public final void method_263(class_86 var1, class_86 var2) {
      if(var1 == this.field_176) {
         this.field_176 = var2;
      }

   }

   // $FF: renamed from: g () java.lang.String
   public final String method_309() {
      return this.field_174;
   }

   // $FF: renamed from: h () java.lang.String
   public final String method_310() {
      return this.field_178;
   }

   // $FF: renamed from: i () aJ
   public final class_86 method_311() {
      return this.field_176;
   }

   // $FF: renamed from: j () boolean
   public final boolean method_312() {
      return this.field_175;
   }

   // $FF: renamed from: k () java.lang.String
   public final String method_313() {
      return this.field_173;
   }
}
