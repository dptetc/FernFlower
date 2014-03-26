import java.util.HashSet;
import java.util.List;
import java.util.Set;

// $FF: renamed from: bH
final class class_212 implements class_3 {

   // $FF: renamed from: <init> (as, java.util.HashSet) void
   void method_1063(class_192 var1, HashSet var2) {
      this.field_593 = var1;
      this.field_594 = var2;
      super();
   }

   // $FF: renamed from: a () java.util.List
   public final List method_3() {
      return class_192.method_935(this.field_593, this.field_594);
   }

   // $FF: renamed from: b () java.util.Set
   public final Set method_4() {
      return new HashSet(this.field_594);
   }
}
