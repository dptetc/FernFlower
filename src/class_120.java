import java.util.HashSet;
import java.util.List;

// $FF: renamed from: cX
public final class class_120 {

   // $FF: renamed from: a S
   public class_54 field_277;
   // $FF: renamed from: b ce
   public class_164 field_278;
   // $FF: renamed from: c bn
   public class_128 field_279;
   // $FF: renamed from: d aI
   public class_176 field_280;
   // $FF: renamed from: h q
   private class_114 field_281;
   // $FF: renamed from: e java.util.List
   public List field_282;
   // $FF: renamed from: f boolean
   public boolean field_283;
   // $FF: renamed from: g java.util.HashSet
   public HashSet field_284;


   // $FF: renamed from: <init> (S, ce, bn, aI) void
   public void method_494(class_54 var1, class_164 var2, class_128 var3, class_176 var4) {
      super();
      this.field_284 = new HashSet();
      this.field_277 = var1;
      this.field_278 = var2;
      this.field_279 = var3;
      this.field_280 = var4;
   }

   // $FF: renamed from: a () q
   public final class_114 method_495() {
      if(this.field_281 == null && this.field_277 != null) {
         class_81 var10000 = new class_81;
         var10000.method_225();
         class_81 var1 = var10000;
         this.field_281 = var1.method_226(this.field_277);
      }

      return this.field_281;
   }
}
