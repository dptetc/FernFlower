import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// $FF: renamed from: bD
public final class class_208 implements class_4 {

   // $FF: renamed from: a int
   public int field_566;
   // $FF: renamed from: b int
   public int field_567;
   // $FF: renamed from: c java.util.Set
   public Set field_568;
   // $FF: renamed from: d java.util.Set
   public Set field_569;
   // $FF: renamed from: e int
   public int field_570;
   // $FF: renamed from: f bZ
   public class_184 field_571;


   // $FF: renamed from: <init> (int, int) void
   public void method_1022(int var1, int var2) {
      super();
      this.field_568 = new HashSet();
      this.field_569 = new HashSet();
      class_184 var10001 = new class_184;
      var10001.method_865();
      this.field_571 = var10001;
      this.field_566 = var1;
      this.field_567 = var2;
   }

   // $FF: renamed from: a () java.util.List
   public final List method_5() {
      ArrayList var1 = new ArrayList(this.field_569.size());
      Iterator var2 = this.field_569.iterator();

      while(var2.hasNext()) {
         class_183 var3 = (class_183)var2.next();
         var1.add(var3.field_470);
      }

      return var1;
   }

   // $FF: renamed from: a (az) void
   public final void method_1023(class_183 var1) {
      this.field_568.remove(var1);
   }

   // $FF: renamed from: b (az) void
   public final void method_1024(class_183 var1) {
      this.field_569.remove(var1);
   }

   // $FF: renamed from: c (az) void
   public final void method_1025(class_183 var1) {
      this.field_568.add(var1);
   }

   // $FF: renamed from: d (az) void
   public final void method_1026(class_183 var1) {
      this.field_569.add(var1);
   }

   public final String toString() {
      return "(" + this.field_566 + "_" + this.field_567 + ")";
   }
}
