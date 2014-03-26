
// $FF: renamed from: az
public final class class_183 {

   // $FF: renamed from: c int
   private int field_469;
   // $FF: renamed from: a bD
   public class_208 field_470;
   // $FF: renamed from: b bD
   public class_208 field_471;
   // $FF: renamed from: d int
   private int field_472;


   // $FF: renamed from: <init> (int, bD, bD) void
   public void method_864(int var1, class_208 var2, class_208 var3) {
      super();
      this.field_469 = var1;
      this.field_470 = var2;
      this.field_471 = var3;
      this.field_472 = var2.hashCode() ^ var3.hashCode() + var1;
   }

   public final boolean equals(Object var1) {
      if(var1 != null && var1 instanceof class_183) {
         class_183 var2 = (class_183)var1;
         return this.field_469 == var2.field_469 && this.field_470 == var2.field_470 && this.field_471 == var2.field_471;
      } else {
         return false;
      }
   }

   public final int hashCode() {
      return this.field_472;
   }
}
