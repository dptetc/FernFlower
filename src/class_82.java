import java.util.ArrayList;
import java.util.List;

// $FF: renamed from: V
public final class class_82 {

   // $FF: renamed from: a bW
   private class_198 field_115;
   // $FF: renamed from: b java.util.List
   private List field_116;


   // $FF: renamed from: <init> (bW) void
   public void method_230(class_198 var1) {
      super();
      this.field_116 = new ArrayList();
      this.field_115 = var1;
   }

   // $FF: renamed from: a (V) void
   public final void method_231(class_82 var1) {
      this.field_116.add(var1);
   }

   // $FF: renamed from: a () bW
   public final class_198 method_232() {
      return this.field_115;
   }

   // $FF: renamed from: b () java.util.List
   public final List method_233() {
      return this.field_116;
   }
}
