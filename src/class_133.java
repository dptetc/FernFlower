import java.util.HashMap;
import java.util.Iterator;

// $FF: renamed from: bl
final class class_133 implements class_0 {

   // $FF: renamed from: <init> (an) void
   void method_578(class_207 var1) {
      this.field_340 = var1;
      super();
   }

   // $FF: renamed from: a (ca, java.util.HashMap) boolean
   public final boolean method_0(class_46 var1, HashMap var2) {
      Integer var4 = var1.field_14;
      Iterator var3 = ((class_115)var2.get(var4)).method_466().iterator();

      while(var3.hasNext()) {
         Integer var5 = (Integer)var3.next();
         ((class_115)class_207.method_1021(this.field_340).get(var5)).method_457(var4);
      }

      return false;
   }
}
