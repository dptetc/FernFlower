import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

// $FF: renamed from: ba
final class class_187 implements class_2 {

   // $FF: renamed from: <init> (java.util.HashMap) void
   void method_886(HashMap var1) {
      this.field_479 = var1;
      super();
   }

   // $FF: renamed from: a (aJ) int
   public final int method_2(class_86 var1) {
      List var2;
      (var2 = var1.method_258(true)).add(var1);
      Iterator var5 = var2.iterator();

      while(var5.hasNext()) {
         if((var1 = (class_86)var5.next()).field_148 == 12) {
            class_88 var4 = (class_88)var1;
            HashMap var10000 = this.field_479;
            class_77 var10001 = new class_77;
            var10001.method_216(var4);
            Integer var3;
            if((var3 = (Integer)var10000.get(var10001)) != null) {
               var4.method_285(var3.intValue());
            }
         }
      }

      return 0;
   }
}
