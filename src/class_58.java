import java.util.ArrayList;
import java.util.List;

// $FF: renamed from: B
public final class class_58 {

   // $FF: renamed from: a java.util.List
   private List field_64;
   // $FF: renamed from: b bs
   private class_119 field_65;


   // $FF: renamed from: <init> () void
   public void method_148() {
      super();
      this.field_64 = new ArrayList();
      class_119 var10001 = new class_119;
      var10001.method_480();
      this.field_65 = var10001;
   }

   // $FF: renamed from: a () B
   public final class_58 method_149() {
      class_58 var10000 = new class_58;
      var10000.method_148();
      class_58 var1 = var10000;
      var10000.field_65 = this.field_65.method_493();
      return var1;
   }

   // $FF: renamed from: b () java.util.List
   public final List method_150() {
      return this.field_64;
   }

   // $FF: renamed from: c () bs
   public final class_119 method_151() {
      return this.field_65;
   }
}
