
// $FF: renamed from: br
public class class_29 extends class_5 {

   // $FF: renamed from: d int[]
   private int[] field_9;
   // $FF: renamed from: f int[]
   private int[] field_10;
   // $FF: renamed from: g int
   private int field_11;


   // $FF: renamed from: <init> () void
   public void method_13() {
      super.method_13();
   }

   // $FF: renamed from: a (cQ) void
   public final void method_17(class_61 var1) {
      int var2 = this.field_5 == 170?3:2;
      int var3 = this.method_18().length - var2;
      this.field_11 = var1.method_175(this.method_15(0));
      int var4 = 0;
      if(this.field_5 == 171) {
         var3 /= 2;
      } else {
         var4 = this.method_15(1);
      }

      this.field_9 = new int[var3];
      this.field_10 = new int[var3];
      int var5 = 0;

      for(int var6 = 0; var5 < var3; ++var6) {
         if(this.field_5 == 171) {
            this.field_10[var5] = this.method_15(var2 + var6);
            ++var6;
         } else {
            this.field_10[var5] = var4 + var6;
         }

         this.field_9[var5] = var1.method_175(this.method_15(var2 + var6));
         ++var5;
      }

   }

   // $FF: renamed from: d () int[]
   public final int[] method_20() {
      return this.field_9;
   }

   // $FF: renamed from: e () int
   public final int method_21() {
      return this.field_11;
   }

   // $FF: renamed from: f () int[]
   public final int[] method_22() {
      return this.field_10;
   }
}
