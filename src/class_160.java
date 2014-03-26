
// $FF: renamed from: ck
final class class_160 {

   // $FF: renamed from: a java.lang.String
   public String field_405;
   // $FF: renamed from: b de
   public class_77 field_406;


   // $FF: renamed from: <init> (java.lang.String, de) void
   public void method_729(String var1, class_77 var2) {
      super();
      this.field_405 = "";
      this.field_405 = var1;
      this.field_406 = var2;
   }

   public final boolean equals(Object var1) {
      if(!(var1 instanceof class_160)) {
         return false;
      } else {
         class_160 var2 = (class_160)var1;
         return this.field_405.equals(var2.field_405) && this.field_406.equals(var2.field_406);
      }
   }

   public final int hashCode() {
      return this.field_405.hashCode() + this.field_406.hashCode();
   }
}
