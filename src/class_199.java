import java.util.Iterator;

// $FF: renamed from: al
public final class class_199 implements Iterator {

   // $FF: renamed from: a cE
   private class_146 field_537;
   // $FF: renamed from: b int[]
   private int[] field_538;
   // $FF: renamed from: c int[]
   private int[] field_539;
   // $FF: renamed from: d int
   private int field_540;
   // $FF: renamed from: e int
   private int field_541;
   // $FF: renamed from: f int
   private int field_542;


   // $FF: renamed from: <init> (cJ) void
   private void method_981(class_141 var1) {
      super();
      this.field_541 = -1;
      this.field_542 = -1;
      this.field_537 = class_132.method_576(var1.method_638());
      this.field_538 = class_141.method_639(var1);
      this.field_539 = class_141.method_640(var1);
      this.field_540 = this.field_537.size();
   }

   // $FF: renamed from: a (int) int
   private int method_982(int var1) {
      ++var1;
      int var2 = var1 >>> 5;
      var1 &= 31;

      while(var2 < this.field_538.length) {
         int var3;
         if((var3 = this.field_538[var2]) != 0) {
            for(var3 >>>= var1; var1 < 32; ++var1) {
               if((var3 & 1) != 0) {
                  return (var2 << 5) + var1;
               }

               var3 >>>= 1;
            }
         }

         var1 = 0;
         if((var2 = this.field_539[var2]) == 0) {
            break;
         }
      }

      return -1;
   }

   public final boolean hasNext() {
      this.field_542 = this.method_982(this.field_541);
      return this.field_542 >= 0;
   }

   public final Object next() {
      if(this.field_542 >= 0) {
         this.field_541 = this.field_542;
      } else {
         this.field_541 = this.method_982(this.field_541);
         if(this.field_541 == -1) {
            this.field_541 = this.field_540;
         }
      }

      this.field_542 = -1;
      return this.field_541 < this.field_540?this.field_537.method_664(this.field_541):null;
   }

   public final void remove() {
      class_41[] var1 = (class_41[])this.field_537.get(this.field_541);
      this.field_538[var1[0]] &= ~var1[1];
   }
}
