
// $FF: renamed from: l
public final class class_104 {

   // $FF: renamed from: a java.lang.String
   public String field_216;
   // $FF: renamed from: b java.lang.String
   public String field_217;
   // $FF: renamed from: c java.lang.String
   public String field_218;


   // $FF: renamed from: <init> (java.lang.String, java.lang.String, java.lang.String) void
   private void method_388(String var1, String var2, String var3) {
      super();
      this.field_216 = var1;
      this.field_217 = var2;
      this.field_218 = var3;
   }

   public final boolean equals(Object var1) {
      if(var1 != null && var1 instanceof class_104) {
         class_104 var2 = (class_104)var1;
         return (this.field_216 + ":" + this.field_217 + ":" + this.field_218).equals(var2.field_216 + ":" + var2.field_217 + ":" + var2.field_218);
      } else {
         return false;
      }
   }

   public final int hashCode() {
      return (this.field_216 + ":" + this.field_217 + ":" + this.field_218).hashCode();
   }
}
