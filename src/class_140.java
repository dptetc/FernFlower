import java.util.HashMap;
import java.util.Iterator;

// $FF: renamed from: bh
final class class_140 implements class_0 {

   // $FF: renamed from: <init> (an, int) void
   void method_624(class_207 var1, int var2) {
      this.field_353 = var1;
      this.field_354 = var2;
      super();
   }

   // $FF: renamed from: a (ca, java.util.HashMap) boolean
   public final boolean method_0(class_46 var1, HashMap var2) {
      Iterator var4 = var1.method_59().iterator();

      class_124 var3;
      class_115 var5;
      do {
         if(!var4.hasNext()) {
            return false;
         }
      } while(((var3 = (class_124)var4.next()).method_518() & this.field_354) == 0 || !var2.containsKey(var3.method_522().field_14) || class_129.method_558(var5 = (class_115)var2.get(var1.field_14), class_207.method_1019(this.field_353).get(var1.field_14)));

      class_207.method_1019(this.field_353).put(var1.field_14, var5);
      return true;
   }
}
