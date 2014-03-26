import java.util.ArrayList;
import java.util.List;

// $FF: renamed from: ao
public final class class_89 extends class_86 {

   // $FF: renamed from: c int
   private int field_161;
   // $FF: renamed from: d aJ
   private class_86 field_162;
   // $FF: renamed from: e Q
   private class_83 field_163;


   // $FF: renamed from: <init> (int, aJ, Q) void
   public void method_290(int var1, class_86 var2, class_83 var3) {
      super.method_252();
      this.field_148 = 4;
      this.field_161 = var1;
      this.field_162 = var2;
      this.field_163 = var3;
   }

   // $FF: renamed from: a () aJ
   public final class_86 method_261() {
      class_89 var10000 = new class_89;
      var10000.method_290(this.field_161, this.field_162 == null?null:this.field_162.method_261(), this.field_163);
      return var10000;
   }

   // $FF: renamed from: e () aM
   public final class_178 method_256() {
      class_178 var10000 = new class_178;
      var10000.method_817();
      class_178 var1 = var10000;
      if(this.field_161 == 0 && this.field_163.field_133 != 10) {
         var1.method_819(this.field_162, class_83.method_246(this.field_163.field_134));
         var1.method_818(this.field_162, this.field_163);
      }

      return var1;
   }

   // $FF: renamed from: b () java.util.List
   public final List method_260() {
      ArrayList var1 = new ArrayList();
      if(this.field_162 != null) {
         var1.add(this.field_162);
      }

      return var1;
   }

   // $FF: renamed from: a (int) java.lang.String
   public final String method_262(int var1) {
      if(this.field_161 == 0) {
         StringBuilder var8 = new StringBuilder();
         if(this.field_163.field_133 != 10) {
            var8.append(" ");
            class_209.method_1045(this.field_162, this.field_163, var8, var1, false);
         }

         return "return" + var8.toString();
      } else {
         class_120 var2 = (class_120)class_181.method_844("CURRENT_METHOD_WRAPPER");
         class_177 var3 = (class_177)class_181.method_844("CURRENT_CLASSNODE");
         class_71 var7;
         if(var2 != null && var3 != null && (var7 = (class_71)var2.field_279.method_552().method_659("Exceptions")) != null) {
            String var4 = null;

            for(int var5 = 0; var5 < var7.method_206().size(); ++var5) {
               String var6 = var7.method_205(var5, var3.field_438.method_973());
               if("java/lang/Throwable".equals(var6)) {
                  var4 = var6;
                  break;
               }

               if("java/lang/Exception".equals(var6)) {
                  var4 = var6;
               }
            }

            if(var4 != null) {
               class_83 var10000 = new class_83;
               var10000.method_239(var4, true);
               class_83 var9 = var10000;
               StringBuilder var10 = new StringBuilder();
               class_209.method_1045(this.field_162, var9, var10, var1, false);
               return "throw " + var10.toString();
            }
         }

         return "throw " + this.field_162.method_262(var1);
      }
   }

   public final boolean equals(Object var1) {
      if(var1 != null && var1 instanceof class_89) {
         class_89 var2 = (class_89)var1;
         return this.field_161 == var2.field_161 && class_129.method_558(this.field_162, var2.field_162);
      } else {
         return false;
      }
   }

   // $FF: renamed from: a (aJ, aJ) void
   public final void method_263(class_86 var1, class_86 var2) {
      if(var1 == this.field_162) {
         this.field_162 = var2;
      }

   }

   // $FF: renamed from: f () int
   public final int method_291() {
      return this.field_161;
   }

   // $FF: renamed from: g () aJ
   public final class_86 method_292() {
      return this.field_162;
   }

   // $FF: renamed from: h () Q
   public final class_83 method_293() {
      return this.field_163;
   }
}
