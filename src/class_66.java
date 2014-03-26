import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;

// $FF: renamed from: K
final class class_66 implements class_2 {

   // $FF: renamed from: <init> (x, java.util.HashMap, java.util.HashSet) void
   void method_192(class_117 var1, HashMap var2, HashSet var3) {
      this.field_78 = var1;
      this.field_79 = var2;
      this.field_80 = var3;
      super();
   }

   // $FF: renamed from: a (aJ) int
   public final int method_2(class_86 var1) {
      Iterator var3 = this.field_79.entrySet().iterator();

      while(var3.hasNext()) {
         Entry var2 = (Entry)var3.next();
         if(class_117.method_479(this.field_78, var1, (class_109)var2.getKey(), (class_120)var2.getValue())) {
            this.field_80.add((class_109)var2.getKey());
         }
      }

      return 0;
   }
}
