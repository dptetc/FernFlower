import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

// $FF: renamed from: cu
public final class class_155 {

   // $FF: renamed from: a java.util.HashMap
   private HashMap field_392;
   // $FF: renamed from: b java.util.HashMap
   private HashMap field_393;
   // $FF: renamed from: c java.util.HashMap
   private HashMap field_394;


   // $FF: renamed from: <init> () void
   public void method_713() {
      super();
      this.field_392 = new HashMap();
      this.field_393 = new HashMap();
      this.field_394 = new HashMap();
   }

   // $FF: renamed from: a (S, q) void
   public final void method_714(class_54 var1, class_114 var2) {
      class_155 var9 = this;
      class_128 var10000 = (class_128)class_181.method_844("CURRENT_METHOD");
      List var4 = null;
      boolean var14 = (var10000.method_550() & 8) == 0;
      class_197 var5 = (class_197)class_181.method_844("CURRENT_METHOD_DESCRIPTOR");
      class_77 var10001;
      HashMap var13;
      if(var14) {
         class_83 var12 = new class_83;
         var12.method_237(8, 0, ((class_198)class_181.method_844("CURRENT_CLASS")).field_528);
         class_83 var6 = var12;
         var13 = this.field_392;
         var10001 = new class_77;
         var10001.method_214(0, 1);
         var13.put(var10001, var6);
         var13 = this.field_393;
         var10001 = new class_77;
         var10001.method_214(0, 1);
         var13.put(var10001, var6);
      }

      int var17 = 0;

      for(int var7 = 0; var7 < var5.field_519.length; ++var7) {
         var13 = var9.field_392;
         var10001 = new class_77;
         var10001.method_214(var17 + (var14?1:0), 1);
         var13.put(var10001, var5.field_519[var7]);
         var13 = var9.field_393;
         var10001 = new class_77;
         var10001.method_214(var17 + (var14?1:0), 1);
         var13.put(var10001, var5.field_519[var7]);
         var17 += var5.field_519[var7].field_137;
      }

      LinkedList var18;
      (var18 = new LinkedList()).add(var1);

      class_46 var11;
      for(; !var18.isEmpty(); var18.addAll(var11.method_63())) {
         var11 = (class_46)var18.removeFirst();
         var4 = null;
         if(var11.field_13 == 12) {
            var4 = ((class_51)var11).method_111();
         } else if(var11.field_13 == 7) {
            var4 = ((class_50)var11).method_102();
         }

         if(var4 != null) {
            Iterator var15 = var4.iterator();

            while(var15.hasNext()) {
               class_88 var16 = (class_88)var15.next();
               var13 = var9.field_392;
               var10001 = new class_77;
               var10001.method_214(var16.method_277(), 1);
               var13.put(var10001, var16.method_279());
               var13 = var9.field_393;
               var10001 = new class_77;
               var10001.method_214(var16.method_277(), 1);
               var13.put(var10001, var16.method_279());
            }
         }
      }

      class_171 var8 = new class_171;
      var8.method_785();
      var2.method_453(var8);

      class_170 var10;
      do {
         var10 = new class_170;
         var10.method_784(this);
      } while(!var2.method_453(var10));

   }

   // $FF: renamed from: a (aJ) boolean
   private boolean method_715(class_86 var1) {
      Iterator var3 = var1.method_260().iterator();

      while(var3.hasNext()) {
         class_86 var2 = (class_86)var3.next();
         if(!this.method_715(var2)) {
            return false;
         }
      }

      class_87 var6;
      if(var1.field_148 == 3 && (var6 = (class_87)var1).method_271().field_134 <= 2) {
         class_77 var10000 = new class_77;
         var10000.method_214(var6.field_149, -1);
         class_77 var9 = var10000;
         if(!this.field_392.containsKey(var9)) {
            this.field_392.put(var9, var6.method_271());
         }
      }

      class_178 var7;
      Iterator var4 = (var7 = var1.method_256()).method_820().iterator();

      while(var4.hasNext()) {
         class_85 var10;
         if((var10 = (class_85)var4.next()).field_147.field_134 != 6) {
            this.method_716(var10.field_146, var10.field_147, 1);
         }
      }

      boolean var11 = true;

      class_85 var5;
      for(Iterator var8 = var7.method_821().iterator(); var8.hasNext(); var11 &= this.method_716(var5.field_146, var5.field_147, 0)) {
         var5 = (class_85)var8.next();
      }

      return var11;
   }

   // $FF: renamed from: a (aJ, Q, int) boolean
   private boolean method_716(class_86 var1, class_83 var2, int var3) {
      boolean var4 = true;
      switch(var1.field_148) {
      case 2:
         return this.method_716(((class_93)var1).method_317(), var2, var3);
      case 3:
         class_87 var10000 = (class_87)var1;
         class_83 var5 = null;
         var5 = var10000.method_271();
         if(var2.field_134 > 2 || var5.field_134 > 2) {
            return true;
         }

         if(var2.field_134 == 2) {
            var10000 = new class_87;
            var10000.method_265(((Integer)((class_87)var1).method_273()).intValue(), false);
            if((var5 = var10000.method_271()).method_243(var2)) {
               var2 = var5;
            }
         }
      case 6:
         class_90 var6;
         switch((var6 = (class_90)var1).method_301()) {
         case 4:
         case 5:
         case 6:
            var4 = true & this.method_716((class_86)var6.method_303().get(0), var2, var3) & this.method_716((class_86)var6.method_303().get(1), var2, var3);
            return var4;
         case 36:
            var4 = true & this.method_716((class_86)var6.method_303().get(1), var2, var3) & this.method_716((class_86)var6.method_303().get(2), var2, var3);
            return var4;
         default:
            return var4;
         }
      case 12:
         class_77 var8 = null;
         class_77 var7;
         if(var1.field_148 == 3) {
            var7 = new class_77;
            var7.method_214(((class_87)var1).field_149, -1);
            var8 = var7;
         } else if(var1.field_148 == 12) {
            var7 = new class_77;
            var7.method_216((class_88)var1);
            var8 = var7;
         }

         class_83 var9;
         if(var3 == 0) {
            if((var9 = (class_83)this.field_392.get(var8)) != null && var2.field_134 <= var9.field_134) {
               if(var2.field_134 < var9.field_134) {
                  return true;
               }

               var2 = class_83.method_245(var9, var2);
            }

            this.field_392.put(var8, var2);
            if(var1.field_148 == 3) {
               ((class_87)var1).method_272(var2);
            }

            if(var9 != null && (var2.field_134 > var9.field_134 || var2.method_243(var9))) {
               return false;
            }
         } else {
            if((var9 = (class_83)this.field_393.get(var8)) != null && var2.field_134 >= var9.field_134) {
               if(var2.field_134 > var9.field_134) {
                  return true;
               }

               var2 = class_83.method_244(var9, var2);
            }

            this.field_393.put(var8, var2);
         }
      }

      return var4;
   }

   // $FF: renamed from: a () java.util.HashMap
   public final HashMap method_717() {
      return this.field_393;
   }

   // $FF: renamed from: b () java.util.HashMap
   public final HashMap method_718() {
      return this.field_392;
   }

   // $FF: renamed from: c () java.util.HashMap
   public final HashMap method_719() {
      return this.field_394;
   }

   // $FF: renamed from: a (de, Q) void
   public final void method_720(class_77 var1, class_83 var2) {
      this.field_392.put(var1, var2);
   }

   // $FF: renamed from: a (de) Q
   public final class_83 method_721(class_77 var1) {
      return (class_83)this.field_392.get(var1);
   }
}
