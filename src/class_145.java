import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

// $FF: renamed from: bc
final class class_145 implements class_2 {

   // $FF: renamed from: <init> (java.util.HashMap, java.util.HashMap) void
   void method_652(HashMap var1, HashMap var2) {
      this.field_364 = var1;
      this.field_365 = var2;
      super();
   }

   // $FF: renamed from: a (aJ) int
   public final int method_2(class_86 var1) {
      List var2;
      (var2 = var1.method_258(true)).add(var1);
      Iterator var5 = var2.iterator();

      while(var5.hasNext()) {
         class_77 var10001;
         HashMap var10000;
         if((var1 = (class_86)var5.next()).field_148 == 12) {
            class_88 var3 = (class_88)var1;
            var10000 = this.field_364;
            var10001 = new class_77;
            var10001.method_216(var3);
            Integer var4;
            if((var4 = (Integer)var10000.get(var10001)) != null) {
               var3.method_278(var4.intValue());
               var3.method_285(0);
            }
         } else if(var1.field_148 == 3) {
            var10000 = this.field_365;
            var10001 = new class_77;
            var10001.method_214(var1.field_149, -1);
            class_83 var6;
            if((var6 = (class_83)var10000.get(var10001)) != null && var6.equals(class_83.field_123)) {
               ((class_87)var1).method_272(var6);
            }
         }
      }

      return 0;
   }
}
