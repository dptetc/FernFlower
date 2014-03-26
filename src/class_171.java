import java.util.Iterator;
import java.util.List;

// $FF: renamed from: aT
final class class_171 implements class_2 {

   // $FF: renamed from: <init> () void
   void method_785() {
      super();
   }

   // $FF: renamed from: a (aJ) int
   public final int method_2(class_86 var1) {
      List var2;
      (var2 = var1.method_258(true)).add(var1);
      Iterator var5 = var2.iterator();

      while(var5.hasNext()) {
         class_86 var3;
         if((var3 = (class_86)var5.next()).field_148 == 12) {
            ((class_88)var3).method_280(class_83.field_117);
         } else {
            class_87 var4;
            if(var3.field_148 == 3 && (var4 = (class_87)var3).method_271().field_134 == 2) {
               class_87 var10001 = new class_87;
               var10001.method_265(var4.method_274(), var4.method_275());
               var4.method_272(var10001.method_271());
            }
         }
      }

      return 0;
   }
}
