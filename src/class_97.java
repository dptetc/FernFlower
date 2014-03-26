import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// $FF: renamed from: cR
public final class class_97 extends class_86 {

   // $FF: renamed from: c java.lang.String
   private String field_194;
   // $FF: renamed from: d java.lang.String
   private String field_195;
   // $FF: renamed from: e boolean
   private boolean field_196;
   // $FF: renamed from: f int
   private int field_197;
   // $FF: renamed from: g aJ
   private class_86 field_198;
   // $FF: renamed from: h av
   private class_197 field_199;
   // $FF: renamed from: i java.lang.String
   private String field_200;
   // $FF: renamed from: j int
   private int field_201;
   // $FF: renamed from: k java.util.List
   private List field_202;


   // $FF: renamed from: <init> () void
   public void method_252() {
      super.method_252();
      this.field_197 = 1;
      this.field_201 = 2;
      this.field_202 = new ArrayList();
      this.field_148 = 8;
   }

   // $FF: renamed from: <init> (int, g, cb) void
   public void method_338(int var1, class_79 var2, class_118 var3) {
      super.method_252();
      this.field_197 = 1;
      this.field_201 = 2;
      this.field_202 = new ArrayList();
      this.field_148 = 8;
      this.field_194 = var2.field_103;
      this.field_195 = var2.field_102;
      switch(var1) {
      case 182:
         this.field_201 = 2;
         break;
      case 183:
         this.field_201 = 1;
         break;
      case 184:
         this.field_201 = 3;
         break;
      case 185:
         this.field_201 = 4;
      }

      if("<init>".equals(this.field_194)) {
         this.field_197 = 2;
      } else if("<clinit>".equals(this.field_194)) {
         this.field_197 = 3;
      }

      this.field_200 = var2.field_104;
      this.field_199 = class_197.method_963(var2.field_104);

      for(int var4 = 0; var4 < this.field_199.field_519.length; ++var4) {
         this.field_202.add(0, (class_86)var3.method_484());
      }

      if(var1 == 184) {
         this.field_196 = true;
      } else {
         this.field_198 = (class_86)var3.method_484();
      }
   }

   // $FF: renamed from: <init> (cR) void
   private void method_339(class_97 var1) {
      super.method_252();
      this.field_197 = 1;
      this.field_201 = 2;
      this.field_202 = new ArrayList();
      this.field_148 = 8;
      this.field_194 = var1.field_194;
      this.field_195 = var1.field_195;
      this.field_196 = var1.field_196;
      this.field_197 = var1.field_197;
      this.field_198 = var1.field_198;
      if(this.field_198 != null) {
         this.field_198 = this.field_198.method_261();
      }

      this.field_201 = var1.field_201;
      this.field_200 = var1.field_200;
      this.field_199 = var1.field_199;
      this.field_202 = new ArrayList(var1.field_202);

      for(int var2 = 0; var2 < this.field_202.size(); ++var2) {
         this.field_202.set(var2, ((class_86)this.field_202.get(var2)).method_261());
      }

   }

   // $FF: renamed from: c () Q
   public final class_83 method_254() {
      return this.field_199.field_520;
   }

   // $FF: renamed from: e () aM
   public final class_178 method_256() {
      class_178 var10000 = new class_178;
      var10000.method_817();
      class_178 var1 = var10000;

      for(int var2 = 0; var2 < this.field_202.size(); ++var2) {
         class_86 var3 = (class_86)this.field_202.get(var2);
         class_83 var4 = this.field_199.field_519[var2];
         var1.method_819(var3, class_83.method_246(var4.field_134));
         var1.method_818(var3, var4);
      }

      return var1;
   }

   // $FF: renamed from: b () java.util.List
   public final List method_260() {
      ArrayList var1 = new ArrayList();
      if(this.field_198 != null) {
         var1.add(this.field_198);
      }

      var1.addAll(this.field_202);
      return var1;
   }

   // $FF: renamed from: a () aJ
   public final class_86 method_261() {
      class_97 var10000 = new class_97;
      var10000.method_339(this);
      return var10000;
   }

   // $FF: renamed from: a (int) java.lang.String
   public final String method_262(int var1) {
      StringBuilder var2 = new StringBuilder("");
      String var3 = null;
      boolean var4 = false;
      class_77 var6;
      class_131 var10001;
      String var10002;
      if(this.field_196) {
         class_177 var5;
         if((var5 = (class_177)class_181.method_844("CURRENT_CLASSNODE")) == null || !this.field_195.equals(var5.field_438.field_528)) {
            var10001 = class_181.method_847();
            var10002 = class_209.method_1042(this.field_195);
            var6 = null;
            var2.append(var10001.method_571(var10002, true));
         }
      } else {
         if(this.field_198 != null && this.field_198.field_148 == 12) {
            class_88 var13 = (class_88)this.field_198;
            class_77 var10000 = new class_77;
            var10000.method_216(var13);
            var6 = var10000;
            class_164 var7;
            class_120 var8;
            if((var7 = var13.method_283()) == null && (var8 = (class_120)class_181.method_844("CURRENT_METHOD_WRAPPER")) != null) {
               var7 = var8.field_278;
            }

            String var22 = null;
            if(var7 != null) {
               var22 = (String)var7.method_757().get(var6);
            }

            if(var22 != null) {
               var4 = true;
               if(this.field_201 == 1 && !this.field_195.equals(var22)) {
                  var3 = var22;
               }
            }
         }

         if(this.field_197 == 1) {
            if(var3 != null) {
               class_198 var15 = ((class_177)class_181.method_844("CURRENT_CLASSNODE")).field_438;
               if(!var3.equals(var15.field_528)) {
                  var10001 = class_181.method_847();
                  var10002 = class_209.method_1042(var3);
                  var6 = null;
                  var2.append(var10001.method_571(var10002, true));
                  var2.append(".");
               }

               var2.append("super");
            } else {
               String var14 = this.field_198.method_262(var1);
               class_83 var17 = this.field_198.method_254();
               class_83 var10 = new class_83;
               var10.method_237(8, 0, this.field_195);
               class_83 var19 = var10;
               if(var17.equals(class_83.field_131) && !var19.equals(var17)) {
                  var2.append("((" + class_209.method_1039(var19) + ")");
                  if(this.field_198.method_253() >= class_90.method_297()) {
                     var14 = "(" + var14 + ")";
                  }

                  var2.append(var14 + ")");
               } else if(this.field_198.method_253() > this.method_253()) {
                  var2.append("(" + var14 + ")");
               } else {
                  var2.append(var14);
               }
            }
         }
      }

      switch(this.field_197) {
      case 1:
         if("<VAR_NAMELESS_ENCLOSURE>".equals(var2.toString())) {
            var2 = new StringBuilder("");
         }

         if(var2.length() > 0) {
            var2.append(".");
         }

         var2.append(this.field_194 + "(");
         break;
      case 2:
         if(var3 != null) {
            var2.append("super(");
         } else if(var4) {
            var2.append("this(");
         } else {
            var2.append(this.field_198.method_262(var1));
            var2.append(".<init>(");
         }
         break;
      case 3:
         throw new RuntimeException("Explicite invocation of <clinit>");
      }

      Object var18 = null;
      class_177 var16;
      if(this.field_197 == 2 && (var16 = (class_177)class_181.method_855().method_588().get(this.field_195)) != null) {
         if(var16.field_439 != null) {
            var18 = var16.field_439.method_410("<init>", this.field_200).field_282;
         } else if(var16.field_435 == 1 && (var16.field_436 & 8) == 0) {
            ArrayList var11 = var18 = new ArrayList((Collection)Collections.nCopies(this.field_202.size(), (Object)null));
            class_77 var9 = new class_77;
            var9.method_214(-1, 0);
            var11.set(0, var9);
         }
      }

      Set var20 = this.method_340();
      boolean var21 = true;

      for(int var23 = 0; var23 < this.field_202.size(); ++var23) {
         if(var18 == null || ((List)var18).get(var23) == null) {
            if(!var21) {
               var2.append(", ");
            }

            StringBuilder var12 = new StringBuilder();
            class_209.method_1046((class_86)this.field_202.get(var23), this.field_199.field_519[var23], var12, var1, true, var20.contains(Integer.valueOf(var23)));
            var2.append(var12);
            var21 = false;
         }
      }

      var2.append(")");
      return var2.toString();
   }

   // $FF: renamed from: r () java.util.Set
   private Set method_340() {
      HashSet var1 = new HashSet();
      class_198 var2;
      if((var2 = class_181.method_851().method_393(this.field_195)) != null) {
         ArrayList var3 = new ArrayList();
         Iterator var4 = var2.method_976().iterator();

         class_197 var5;
         int var8;
         while(var4.hasNext()) {
            class_128 var7 = (class_128)var4.next();
            if(this.field_194.equals(var7.method_549()) && (var5 = class_197.method_963(var7.method_548())).field_519.length == this.field_199.field_519.length) {
               boolean var6 = true;

               for(var8 = 0; var8 < var5.field_519.length; ++var8) {
                  if(var5.field_519[var8].field_134 != this.field_199.field_519[var8].field_134) {
                     var6 = false;
                     break;
                  }
               }

               if(var6) {
                  var3.add(var5);
               }
            }
         }

         if(var3.size() > 1) {
            for(var8 = 0; var8 < this.field_199.field_519.length; ++var8) {
               class_83 var9 = this.field_199.field_519[var8];
               Iterator var10 = var3.iterator();

               while(var10.hasNext()) {
                  var5 = (class_197)var10.next();
                  if(!var9.equals(var5.field_519[var8])) {
                     var1.add(Integer.valueOf(var8));
                     break;
                  }
               }
            }
         }
      }

      return var1;
   }

   public final boolean equals(Object var1) {
      if(var1 != null && var1 instanceof class_97) {
         class_97 var2 = (class_97)var1;
         return class_129.method_558(this.field_194, var2.field_194) && class_129.method_558(this.field_195, var2.field_195) && this.field_196 == var2.field_196 && class_129.method_558(this.field_198, var2.field_198) && class_129.method_558(this.field_199, var2.field_199) && this.field_197 == var2.field_197 && class_129.method_560(this.field_202, var2.field_202);
      } else {
         return false;
      }
   }

   // $FF: renamed from: a (aJ, aJ) void
   public final void method_263(class_86 var1, class_86 var2) {
      if(var1 == this.field_198) {
         this.field_198 = var2;
      }

      for(int var3 = 0; var3 < this.field_202.size(); ++var3) {
         if(var1 == this.field_202.get(var3)) {
            this.field_202.set(var3, var2);
         }
      }

   }

   // $FF: renamed from: g () java.util.List
   public final List method_341() {
      return this.field_202;
   }

   // $FF: renamed from: a (java.util.List) void
   public final void method_342(List var1) {
      this.field_202 = var1;
   }

   // $FF: renamed from: h () av
   public final class_197 method_343() {
      return this.field_199;
   }

   // $FF: renamed from: a (av) void
   public final void method_344(class_197 var1) {
      this.field_199 = var1;
   }

   // $FF: renamed from: i () java.lang.String
   public final String method_345() {
      return this.field_195;
   }

   // $FF: renamed from: a (java.lang.String) void
   public final void method_346(String var1) {
      this.field_195 = var1;
   }

   // $FF: renamed from: j () int
   public final int method_347() {
      return this.field_197;
   }

   // $FF: renamed from: k () void
   public final void method_348() {
      this.field_197 = 2;
   }

   // $FF: renamed from: l () aJ
   public final class_86 method_349() {
      return this.field_198;
   }

   // $FF: renamed from: a (aJ) void
   public final void method_350(class_86 var1) {
      this.field_198 = var1;
   }

   // $FF: renamed from: m () boolean
   public final boolean method_351() {
      return this.field_196;
   }

   // $FF: renamed from: n () void
   public final void method_352() {
      this.field_196 = true;
   }

   // $FF: renamed from: o () java.lang.String
   public final String method_353() {
      return this.field_194;
   }

   // $FF: renamed from: b (java.lang.String) void
   public final void method_354(String var1) {
      this.field_194 = var1;
   }

   // $FF: renamed from: q () java.lang.String
   public final String method_355() {
      return this.field_200;
   }

   // $FF: renamed from: c (java.lang.String) void
   public final void method_356(String var1) {
      this.field_200 = var1;
   }
}
