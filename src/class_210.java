import java.util.Iterator;

// $FF: renamed from: bC
public final class class_210 implements Iterator {

   // $FF: renamed from: a cE
   private class_146 field_588;
   // $FF: renamed from: b int[]
   private int[] field_589;
   // $FF: renamed from: c int
   private int field_590;
   // $FF: renamed from: d int
   private int field_591;
   // $FF: renamed from: e int
   private int field_592;


   // $FF: renamed from: <init> (p) void
   private void method_1047(class_115 var1) {
      super();
      this.field_591 = -1;
      this.field_592 = -1;
      this.field_588 = class_195.method_952(var1.method_468());
      this.field_589 = class_115.method_469(var1);
      this.field_590 = this.field_588.size();
   }

   // $FF: renamed from: a (int) int
   private int method_1048(int var1) {
      ++var1;
      int var2 = var1;
      int var3 = var1 / 32;

      for(var1 %= 32; var3 < this.field_589.length; ++var3) {
         int var4;
         if((var4 = this.field_589[var3]) != 0) {
            for(var4 >>>= var1; var1 < 32; ++var2) {
               if((var4 & 1) != 0) {
                  return var2;
               }

               var4 >>>= 1;
               ++var1;
            }
         } else {
            var2 += 32 - var1;
         }

         var1 = 0;
      }

      return -1;
   }

   public final boolean hasNext() {
      this.field_592 = this.method_1048(this.field_591);
      return this.field_592 >= 0;
   }

   public final Object next() {
      if(this.field_592 >= 0) {
         this.field_591 = this.field_592;
      } else {
         this.field_591 = this.method_1048(this.field_591);
         if(this.field_591 == -1) {
            this.field_591 = this.field_590;
         }
      }

      this.field_592 = -1;
      return this.field_591 < this.field_590?this.field_588.method_664(this.field_591):null;
   }

   public final void remove() {
      class_41[] var1 = (class_41[])this.field_588.get(this.field_591);
      this.field_589[var1[0]] &= ~var1[1];
   }
}
