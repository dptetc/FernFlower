
// $FF: renamed from: j
public class class_5 implements class_1 {

   // $FF: renamed from: a int
   public int field_5;
   // $FF: renamed from: b int
   public int field_6;
   // $FF: renamed from: c boolean
   public boolean field_7;
   // $FF: renamed from: d int[]
   private int[] field_8;


   // $FF: renamed from: <init> () void
   public void method_13() {
      super();
      this.field_6 = 1;
      this.field_7 = false;
      this.field_8 = null;
   }

   // $FF: renamed from: a () int
   public final int method_14() {
      return this.field_8 == null?0:this.field_8.length;
   }

   // $FF: renamed from: a (int) int
   public final int method_15(int var1) {
      return this.field_8[var1];
   }

   // $FF: renamed from: b () j
   public class_5 method_16() {
      return class_213.method_1067(this.field_5, this.field_7, this.field_6, (int[])(this.field_8 == null?null:(class_41[])this.field_8.clone()));
   }

   public String toString() {
      String var1 = this.field_7?"@wide ":"";
      var1 = var1 + "@" + class_213.method_1066(this.field_5);
      int var2 = this.method_14();

      for(int var3 = 0; var3 < var2; ++var3) {
         int var4;
         if((var4 = this.field_8[var3]) < 0) {
            var1 = var1 + " -" + Integer.toHexString(-var4);
         } else {
            var1 = var1 + " " + Integer.toHexString(var4);
         }
      }

      return var1;
   }

   // $FF: renamed from: a (cQ) void
   public void method_17(class_61 var1) {}

   // $FF: renamed from: c () int[]
   public final int[] method_18() {
      return this.field_8;
   }

   // $FF: renamed from: a (int[]) void
   public final void method_19(int[] var1) {
      this.field_8 = var1;
   }
}
