import java.util.Iterator;

// $FF: renamed from: O
public final class class_63 extends class_61 {

   // $FF: renamed from: <init> (cE, bf) void
   public void method_184(class_146 var1, class_137 var2) {
      super.method_165();
      this.field_72 = var1;
      this.field_74 = var2;

      class_84 var3;
      for(Iterator var4 = var2.method_591().iterator(); var4.hasNext(); var3.field_144 = this.method_174(var3.field_141)) {
         (var3 = (class_84)var4.next()).field_142 = this.method_174(var3.field_139);
         var3.field_143 = this.method_174(var3.field_140);
      }

   }
}
