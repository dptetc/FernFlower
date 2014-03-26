import java.util.HashMap;
import java.util.Iterator;

// $FF: renamed from: cn
final class class_159 implements class_2 {

   // $FF: renamed from: <init> (aK, java.util.HashMap, cX, java.util.HashMap) void
   void method_727(class_177 var1, HashMap var2, class_120 var3, HashMap var4) {
      this.field_401 = var1;
      this.field_402 = var2;
      this.field_403 = var3;
      this.field_404 = var4;
      super();
   }

   // $FF: renamed from: a (aJ) int
   public final int method_2(class_86 var1) {
      class_93 var2;
      class_92 var3;
      if(var1.field_148 == 2 && (var2 = (class_93)var1).method_316().field_148 == 5 && (var3 = (class_92)var2.method_316()).method_309().equals(this.field_401.field_438.field_528) && this.field_402.containsKey(class_129.method_562(var3.method_313(), var3.method_310()))) {
         return 2;
      } else {
         class_97 var4;
         if(this.field_401.field_435 == 2 && "<init>".equals(this.field_403.field_279.method_549()) && var1.field_148 == 8 && (var4 = (class_97)var1).method_347() == 2) {
            this.field_401.field_441 = var4;
            return 2;
         } else {
            this.method_728(var1);
            return 0;
         }
      }
   }

   // $FF: renamed from: b (aJ) aJ
   private class_86 method_728(class_86 var1) {
      class_88 var10000;
      if(var1.field_148 == 12) {
         int var2 = ((class_88)var1).method_277();
         if(this.field_404.containsKey(Integer.valueOf(var2))) {
            class_77 var3 = (class_77)this.field_404.get(Integer.valueOf(var2));
            this.field_403.field_278.method_758().add(var3);
            var10000 = new class_88;
            var10000.method_276(var3.field_96, this.field_403.field_278.method_751(var3), this.field_403.field_278);
            return var10000;
         }
      } else if(var1.field_148 == 5) {
         class_92 var6;
         String var8 = class_129.method_562((var6 = (class_92)var1).method_313(), var6.method_310());
         if(var6.method_309().equals(this.field_401.field_438.field_528) && this.field_402.containsKey(var8)) {
            class_77 var10 = (class_77)this.field_402.get(var8);
            this.field_403.field_278.method_758().add(var10);
            var10000 = new class_88;
            var10000.method_276(var10.field_96, this.field_403.field_278.method_751(var10), this.field_403.field_278);
            return var10000;
         }
      }

      boolean var7 = true;

      while(var7) {
         var7 = false;
         Iterator var4 = var1.method_260().iterator();

         while(var4.hasNext()) {
            class_86 var9 = (class_86)var4.next();
            class_86 var5;
            if((var5 = this.method_728(var9)) != null) {
               var1.method_263(var9, var5);
               var7 = true;
               break;
            }
         }
      }

      return null;
   }
}
