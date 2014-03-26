import java.util.ArrayList;
import java.util.List;

// $FF: renamed from: aM
public final class class_178 {

   // $FF: renamed from: a java.util.List
   private List field_448;
   // $FF: renamed from: b java.util.List
   private List field_449;


   // $FF: renamed from: <init> () void
   public void method_817() {
      super();
      this.field_448 = new ArrayList();
      this.field_449 = new ArrayList();
   }

   // $FF: renamed from: a (aJ, Q) void
   public final void method_818(class_86 var1, class_83 var2) {
      List var10000 = this.field_448;
      class_85 var10001 = new class_85;
      var10001.method_251(var1, var2);
      var10000.add(var10001);
   }

   // $FF: renamed from: b (aJ, Q) void
   public final void method_819(class_86 var1, class_83 var2) {
      List var10000 = this.field_449;
      class_85 var10001 = new class_85;
      var10001.method_251(var1, var2);
      var10000.add(var10001);
   }

   // $FF: renamed from: a () java.util.List
   public final List method_820() {
      return this.field_448;
   }

   // $FF: renamed from: b () java.util.List
   public final List method_821() {
      return this.field_449;
   }
}
