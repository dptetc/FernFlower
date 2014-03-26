
// $FF: renamed from: T
public final class class_80 extends class_78 {

   // $FF: renamed from: c int
   private int field_105;
   // $FF: renamed from: a java.lang.Object
   public Object field_106;
   // $FF: renamed from: b boolean
   public boolean field_107;


   // $FF: renamed from: <init> (int, java.lang.Object) void
   public void method_222(int var1, Object var2) {
      super.method_217();
      this.field_99 = var1;
      this.field_106 = var2;
      this.method_224();
   }

   // $FF: renamed from: <init> (int, int) void
   public void method_223(int var1, int var2) {
      super.method_217();
      this.field_99 = var1;
      this.field_105 = var2;
   }

   // $FF: renamed from: a (bK) void
   public final void method_218(class_203 var1) {
      if(this.field_99 == 7 || this.field_99 == 8) {
         this.field_106 = (String)var1.method_995(this.field_105).field_106;
         this.method_224();
      }

   }

   public final boolean equals(Object var1) {
      if(var1 != null && var1 instanceof class_80) {
         class_80 var2 = (class_80)var1;
         return this.field_99 == var2.field_99 && this.field_107 == var2.field_107 && this.field_106.equals(var2.field_106);
      } else {
         return false;
      }
   }

   // $FF: renamed from: a () void
   private void method_224() {
      if(this.field_99 == 7) {
         String var1 = null;
         var1 = (String)this.field_106;
         this.field_107 = var1.length() > 0 && var1.charAt(0) == 91;
      }

   }
}
