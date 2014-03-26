import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

// $FF: renamed from: cp
final class class_157 implements class_2 {

   // $FF: renamed from: <init> (java.util.HashMap, aK, java.util.HashMap, cX) void
   void method_725(HashMap var1, class_177 var2, HashMap var3, class_120 var4) {
      this.field_395 = var1;
      this.field_396 = var2;
      this.field_397 = var3;
      this.field_398 = var4;
      super();
   }

   // $FF: renamed from: a (aJ) int
   public final int method_2(class_86 var1) {
      List var2;
      (var2 = var1.method_258(true)).add(var1);
      Iterator var11 = var2.iterator();

      while(var11.hasNext()) {
         class_97 var10;
         if((var1 = (class_86)var11.next()).field_148 == 10 && (var10 = ((class_95)var1).method_326()) != null && this.field_395.containsKey(var10.method_345())) {
            String var3 = var10.method_345();
            class_177 var4;
            if((var4 = this.field_396.method_816(var3)).field_435 != 1) {
               List var5 = (List)((HashMap)this.field_395.get(var3)).get(var10.method_355());
               if(!this.field_397.containsKey(var3)) {
                  this.field_397.put(var3, new HashMap());
               }

               ArrayList var6 = new ArrayList();

               for(int var7 = 0; var7 < var5.size(); ++var7) {
                  class_86 var8 = (class_86)var10.method_341().get(var7);
                  class_160 var9 = null;
                  if(var8.field_148 == 12 && var5.get(var7) != null) {
                     class_77 var10000 = new class_77;
                     var10000.method_216((class_88)var8);
                     class_77 var15 = var10000;
                     class_160 var12 = new class_160;
                     var12.method_729(((class_160)var5.get(var7)).field_405, var15);
                     var9 = var12;
                  }

                  var6.add(var9);
               }

               Object var13;
               if((var13 = (List)((HashMap)this.field_397.get(var3)).get(var10.method_355())) == null) {
                  var13 = var6;
               } else {
                  for(int var14 = 0; var14 < ((List)var13).size(); ++var14) {
                     if(!class_129.method_558(((List)var13).get(var14), var6.get(var14))) {
                        ((List)var13).set(var14, (Object)null);
                     }
                  }
               }

               ((HashMap)this.field_397.get(var3)).put(var10.method_355(), var13);
               var4.field_440 = class_129.method_562(this.field_398.field_279.method_549(), this.field_398.field_279.method_548());
            }
         }
      }

      return 0;
   }
}
