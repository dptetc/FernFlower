import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

// $FF: renamed from: bm
final class class_135 implements class_0 {

   // $FF: renamed from: <init> (an) void
   void method_582(class_207 var1) {
      this.field_343 = var1;
      super();
   }

   // $FF: renamed from: a (ca, java.util.HashMap) boolean
   public final boolean method_0(class_46 var1, HashMap var2) {
      Integer var3 = var1.field_14;
      class_115 var4 = (class_115)var2.get(var3);
      ArrayList var5 = new ArrayList();

      Iterator var6;
      class_115 var7;
      for(var6 = var1.method_58(1).iterator(); var6.hasNext(); var5.add(var7)) {
         class_124 var11 = (class_124)var6.next();
         if((var7 = (class_115)var2.get(var11.method_520().field_14)) == null) {
            var7 = (class_115)class_207.method_1019(this.field_343).get(var11.method_520().field_14);
         }
      }

      var6 = var4.method_466().iterator();

      while(var6.hasNext()) {
         Integer var12 = (Integer)var6.next();
         var7 = var4.method_455();
         class_115 var13 = class_207.method_1020(this.field_343).method_951();
         boolean var8 = false;
         Iterator var10 = var5.iterator();

         while(var10.hasNext()) {
            class_115 var9;
            if((var9 = (class_115)var10.next()).method_460(var12)) {
               if(!var8) {
                  var13.method_462(var9);
                  var8 = true;
               } else {
                  var13.method_463(var9);
               }
            }
         }

         if(var3.intValue() != var12.intValue()) {
            var13.method_457(var3);
         } else {
            var13.method_459(var3);
         }

         var7.method_464(var13);
         ((class_115)class_207.method_1021(this.field_343).get(var12)).method_464(var7);
      }

      return false;
   }
}
