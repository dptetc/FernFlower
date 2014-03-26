
// $FF: renamed from: de
public final class class_77 {

   // $FF: renamed from: a int
   public int field_96;
   // $FF: renamed from: b int
   public int field_97;
   // $FF: renamed from: c int
   private int field_98;


   // $FF: renamed from: <init> (int, int) void
   public void method_214(int var1, int var2) {
      super();
      this.field_98 = -1;
      this.field_96 = var1;
      this.field_97 = var2;
   }

   // $FF: renamed from: <init> (java.lang.Integer, java.lang.Integer) void
   public void method_215(Integer var1, Integer var2) {
      super();
      this.field_98 = -1;
      this.field_96 = var1.intValue();
      this.field_97 = var2.intValue();
   }

   // $FF: renamed from: <init> (aa) void
   public void method_216(class_88 var1) {
      super();
      this.field_98 = -1;
      this.field_96 = var1.method_277();
      this.field_97 = var1.method_284();
   }

   public final boolean equals(Object var1) {
      if(var1 != null && var1 instanceof class_77) {
         class_77 var2 = (class_77)var1;
         return this.field_96 == var2.field_96 && this.field_97 == var2.field_97;
      } else {
         return false;
      }
   }

   public final int hashCode() {
      if(this.field_98 == -1) {
         this.field_98 = this.field_96 * 3 + this.field_97;
      }

      return this.field_98;
   }

   public final String toString() {
      return "(" + this.field_96 + "," + this.field_97 + ")";
   }
}
