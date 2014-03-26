import java.io.BufferedWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

// $FF: renamed from: aY
public final class class_95 extends class_86 {

   // $FF: renamed from: c cR
   private class_97 field_184;
   // $FF: renamed from: d Q
   private class_83 field_185;
   // $FF: renamed from: e java.util.List
   private List field_186;
   // $FF: renamed from: f java.util.List
   private List field_187;
   // $FF: renamed from: g boolean
   private boolean field_188;
   // $FF: renamed from: h boolean
   private boolean field_189;
   // $FF: renamed from: i boolean
   private boolean field_190;


   // $FF: renamed from: <init> (Q, cb, int) void
   public void method_322(class_83 var1, class_118 var2, int var3) {
      super.method_252();
      this.field_186 = new ArrayList();
      this.field_187 = new ArrayList();
      this.field_148 = 10;
      this.field_185 = var1;

      for(int var4 = 0; var4 < var3; ++var4) {
         this.field_186.add(0, (class_86)var2.method_484());
      }

      this.method_324();
   }

   // $FF: renamed from: <init> (Q, java.util.List) void
   public void method_323(class_83 var1, List var2) {
      super.method_252();
      this.field_186 = new ArrayList();
      this.field_187 = new ArrayList();
      this.field_148 = 10;
      this.field_185 = var1;
      this.field_186 = var2;
      this.method_324();
   }

   // $FF: renamed from: n () void
   private void method_324() {
      this.field_189 = false;
      class_177 var1;
      if(this.field_185.field_133 == 8 && this.field_185.field_135 == 0 && (var1 = (class_177)class_181.method_855().method_588().get(this.field_185.field_136)) != null && var1.field_435 == 2) {
         this.field_189 = true;
      }

   }

   // $FF: renamed from: c () Q
   public final class_83 method_254() {
      return this.field_189?((class_177)class_181.method_855().method_588().get(this.field_185.field_136)).field_444:this.field_185;
   }

   // $FF: renamed from: e () aM
   public final class_178 method_256() {
      class_178 var10000 = new class_178;
      var10000.method_817();
      class_178 var1 = var10000;
      if(this.field_185.field_135 != 0) {
         Iterator var3 = this.field_186.iterator();

         while(var3.hasNext()) {
            class_86 var2 = (class_86)var3.next();
            var1.method_819(var2, class_83.field_126);
            var1.method_818(var2, class_83.field_118);
         }

         if(this.field_185.field_135 == 1) {
            class_83 var5;
            (var5 = this.field_185.method_241()).method_240();
            Iterator var4 = this.field_187.iterator();

            while(var4.hasNext()) {
               class_86 var6 = (class_86)var4.next();
               var1.method_819(var6, class_83.method_246(var5.field_134));
               var1.method_818(var6, var5);
            }
         }
      } else if(this.field_184 != null) {
         return this.field_184.method_256();
      }

      return var1;
   }

   // $FF: renamed from: b () java.util.List
   public final List method_260() {
      ArrayList var1 = new ArrayList();
      if(this.field_185.field_135 == 0) {
         if(this.field_184 != null) {
            var1.addAll(this.field_184.method_341());
         }
      } else {
         var1.addAll(this.field_186);
         var1.addAll(this.field_187);
      }

      return var1;
   }

   // $FF: renamed from: a () aJ
   public final class_86 method_261() {
      ArrayList var1 = new ArrayList();
      Iterator var3 = this.field_186.iterator();

      while(var3.hasNext()) {
         class_86 var2 = (class_86)var3.next();
         var1.add(var2.method_261());
      }

      class_95 var10000 = new class_95;
      var10000.method_323(this.field_185, var1);
      class_95 var4 = var10000;
      var10000.field_184 = this.field_184 == null?null:(class_97)this.field_184.method_261();
      var4.field_187 = this.field_187;
      var4.field_188 = this.field_188;
      var4.field_189 = this.field_189;
      var4.field_190 = this.field_190;
      return var4;
   }

   // $FF: renamed from: c_ () int
   public final int method_253() {
      return 1;
   }

   // $FF: renamed from: a (int) java.lang.String
   public final String method_262(int var1) {
      StringBuffer var2 = new StringBuffer();
      class_177 var5;
      String var14;
      int var22;
      ArrayList var10000;
      class_77 var10002;
      if(this.field_189) {
         class_177 var3 = (class_177)class_181.method_855().method_588().get(this.field_185.field_136);
         var2.append("(");
         if(this.field_184 != null) {
            class_97 var4 = var3.field_441;
            var5 = (class_177)class_181.method_855().method_588().get(var4.method_345());
            Object var6 = null;
            if(var5 != null) {
               if(var5.field_439 != null) {
                  var6 = var5.field_439.method_410("<init>", var4.method_355()).field_282;
               } else if(var5.field_435 == 1 && (var5.field_436 & 8) == 0 && !this.field_184.method_341().isEmpty()) {
                  var10000 = var6 = new ArrayList((Collection)Collections.nCopies(this.field_184.method_341().size(), (Object)null));
                  var10002 = new class_77;
                  var10002.method_214(-1, 0);
                  var10000.set(0, var10002);
               }
            }

            boolean var7 = true;

            for(int var8 = 0; var8 < var4.method_341().size(); ++var8) {
               if(var6 == null || ((List)var6).get(var8) == null) {
                  if(!var7) {
                     var2.append(", ");
                  }

                  class_86 var16;
                  if((var16 = (class_86)var4.method_341().get(var8)).field_148 == 12 && (var22 = ((class_88)var16).method_277()) > 0 && var22 <= this.field_184.method_341().size()) {
                     var16 = (class_86)this.field_184.method_341().get(var22 - 1);
                  }

                  StringBuilder var27 = new StringBuilder();
                  class_209.method_1045(var16, var4.method_343().field_519[var8], var27, var1, true);
                  var2.append(var27);
                  var7 = false;
               }
            }
         }

         if(!this.field_190) {
            var14 = null;
            if(this.field_184 != null) {
               var14 = method_325(var3.field_444.field_136, this.field_184.method_341(), var1);
            }

            String var19 = class_209.method_1039(var3.field_444);
            if(var14 != null) {
               class_177 var21;
               if((var21 = (class_177)class_181.method_855().method_588().get(var3.field_444.field_136)) != null) {
                  var19 = var21.field_437;
               } else {
                  var19 = var19.substring(var19.lastIndexOf(46) + 1);
               }
            }

            var2.insert(0, "new " + var19);
            if(var14 != null) {
               var2.insert(0, var14 + ".");
            }
         }

         var2.append(")");
         StringWriter var15 = new StringWriter();
         BufferedWriter var25 = new BufferedWriter(var15);
         class_194 var12 = new class_194;
         var12.method_942();
         class_194 var26 = var12;

         try {
            var26.method_943(var3, var25, var1);
            var25.flush();
         } catch (IOException var9) {
            throw new RuntimeException(var9);
         }

         var2.append(var15.toString());
      } else {
         class_83 var10;
         int var18;
         StringBuilder var24;
         if(this.field_188) {
            (var10 = this.field_185.method_241()).method_240();
            var2.append("{");

            for(var18 = 0; var18 < this.field_187.size(); ++var18) {
               if(var18 > 0) {
                  var2.append(", ");
               }

               var24 = new StringBuilder();
               class_209.method_1045((class_86)this.field_187.get(var18), var10, var24, var1, false);
               var2.append(var24);
            }

            var2.append("}");
         } else if(this.field_185.field_135 == 0) {
            if(this.field_184 != null) {
               List var11 = this.field_184.method_341();
               class_177 var20 = (class_177)class_181.method_855().method_588().get(this.field_184.method_345());
               Object var29 = null;
               if(var20 != null) {
                  if(var20.field_439 != null) {
                     var29 = var20.field_439.method_410("<init>", this.field_184.method_355()).field_282;
                  } else if(var20.field_435 == 1 && (var20.field_436 & 8) == 0 && !this.field_184.method_341().isEmpty()) {
                     var10000 = var29 = new ArrayList((Collection)Collections.nCopies(var11.size(), (Object)null));
                     var10002 = new class_77;
                     var10002.method_214(-1, 0);
                     var10000.set(0, var10002);
                  }
               }

               var2.append("(");
               boolean var23 = true;

               for(var22 = 0; var22 < var11.size(); ++var22) {
                  if(var29 == null || ((List)var29).get(var22) == null) {
                     if(!var23) {
                        var2.append(", ");
                     }

                     StringBuilder var28 = new StringBuilder();
                     class_209.method_1045((class_86)var11.get(var22), this.field_184.method_343().field_519[var22], var28, var1, true);
                     var2.append(var28);
                     var23 = false;
                  }
               }

               var2.append(")");
            }

            if(!this.field_190) {
               String var13 = null;
               if(this.field_184 != null) {
                  var13 = method_325(this.field_185.field_136, this.field_184.method_341(), var1);
               }

               var14 = class_209.method_1037(this.field_185);
               if(var13 != null) {
                  if((var5 = (class_177)class_181.method_855().method_588().get(this.field_185.field_136)) != null) {
                     var14 = var5.field_437;
                  } else {
                     var14 = var14.substring(var14.lastIndexOf(46) + 1);
                  }
               }

               var2.insert(0, "new " + var14);
               if(var13 != null) {
                  var2.insert(0, var13 + ".");
               }
            }
         } else {
            var2.append("new " + class_209.method_1037(this.field_185));
            int var17;
            if(this.field_187.isEmpty()) {
               for(var17 = 0; var17 < this.field_185.field_135; ++var17) {
                  var2.append("[" + (var17 < this.field_186.size()?((class_86)this.field_186.get(var17)).method_262(var1):"") + "]");
               }
            } else {
               for(var17 = 0; var17 < this.field_185.field_135; ++var17) {
                  var2.append("[]");
               }

               (var10 = this.field_185.method_241()).method_240();
               var2.append("{");

               for(var18 = 0; var18 < this.field_187.size(); ++var18) {
                  if(var18 > 0) {
                     var2.append(", ");
                  }

                  var24 = new StringBuilder();
                  class_209.method_1045((class_86)this.field_187.get(var18), var10, var24, var1, false);
                  var2.append(var24);
               }

               var2.append("}");
            }
         }
      }

      return var2.toString();
   }

   // $FF: renamed from: a (java.lang.String, java.util.List, int) java.lang.String
   private static String method_325(String var0, List var1, int var2) {
      class_177 var5;
      if((var5 = (class_177)class_181.method_855().method_588().get(var0)) != null && var5.field_435 != 0 && (var5.field_436 & 8) == 0 && !var1.isEmpty()) {
         class_86 var6;
         boolean var7;
         label18: {
            var6 = (class_86)var1.get(0);
            var7 = false;
            if(var6.field_148 == 12) {
               class_88 var3 = (class_88)var6;
               class_198 var4 = ((class_177)class_181.method_844("CURRENT_CLASSNODE")).field_438;
               HashMap var10000 = var3.method_283().method_757();
               class_77 var10001 = new class_77;
               var10001.method_216(var3);
               String var8 = (String)var10000.get(var10001);
               if(var4.field_528.equals(var8)) {
                  break label18;
               }
            }

            var7 = true;
         }

         if(var7) {
            return var6.method_262(var2);
         }
      }

      return null;
   }

   public final boolean equals(Object var1) {
      if(var1 != null && var1 instanceof class_95) {
         class_95 var2 = (class_95)var1;
         return class_129.method_558(this.field_185, var2.field_185) && class_129.method_560(this.field_186, var2.field_186) && class_129.method_558(this.field_184, var2.field_184) && this.field_188 == var2.field_188 && class_129.method_560(this.field_187, var2.field_187);
      } else {
         return false;
      }
   }

   // $FF: renamed from: a (aJ, aJ) void
   public final void method_263(class_86 var1, class_86 var2) {
      if(var1 == this.field_184) {
         this.field_184 = (class_97)var2;
      }

      if(this.field_184 != null) {
         this.field_184.method_263(var1, var2);
      }

      int var3;
      for(var3 = 0; var3 < this.field_186.size(); ++var3) {
         if(var1 == this.field_186.get(var3)) {
            this.field_186.set(var3, var2);
         }
      }

      for(var3 = 0; var3 < this.field_187.size(); ++var3) {
         if(var1 == this.field_187.get(var3)) {
            this.field_187.set(var3, var2);
         }
      }

   }

   // $FF: renamed from: g () cR
   public final class_97 method_326() {
      return this.field_184;
   }

   // $FF: renamed from: a (cR) void
   public final void method_327(class_97 var1) {
      this.field_184 = var1;
   }

   // $FF: renamed from: h () java.util.List
   public final List method_328() {
      return this.field_186;
   }

   // $FF: renamed from: i () Q
   public final class_83 method_329() {
      return this.field_185;
   }

   // $FF: renamed from: j () java.util.List
   public final List method_330() {
      return this.field_187;
   }

   // $FF: renamed from: a (java.util.List) void
   public final void method_331(List var1) {
      this.field_187 = var1;
   }

   // $FF: renamed from: k () void
   public final void method_332() {
      this.field_188 = true;
   }

   // $FF: renamed from: l () boolean
   public final boolean method_333() {
      return this.field_189;
   }

   // $FF: renamed from: m () void
   public final void method_334() {
      this.field_190 = true;
   }
}
