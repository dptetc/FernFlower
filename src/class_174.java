import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// $FF: renamed from: aU
final class class_174 implements class_3 {

   // $FF: renamed from: <init> (cI) void
   void method_801(class_139 var1) {
      this.field_433 = var1;
      super();
   }

   // $FF: renamed from: a () java.util.List
   public final List method_3() {
      return this.field_433.method_616();
   }

   // $FF: renamed from: b () java.util.Set
   public final Set method_4() {
      return new HashSet((Collection)Arrays.asList(new class_4[]{this.field_433.method_619()}));
   }
}
