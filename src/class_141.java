import java.util.Iterator;

// $FF: renamed from: cJ
public final class class_141 implements Iterable {

   // $FF: renamed from: a cM
   private class_132 field_355;
   // $FF: renamed from: b cE
   private class_146 field_356;
   // $FF: renamed from: c int[]
   private int[] field_357;
   // $FF: renamed from: d int[]
   private int[] field_358;


   // $FF: renamed from: <init> (cM) void
   private void method_625(class_132 var1) {
      super();
      this.field_355 = var1;
      this.field_356 = class_132.method_576(var1);
      int var2 = var1.method_575() + 1;
      this.field_357 = new int[var2];
      this.field_358 = new int[var2];
   }

   // $FF: renamed from: <init> (cM, int[], int[]) void
   private void method_626(class_132 var1, int[] var2, int[] var3) {
      super();
      this.field_355 = var1;
      this.field_356 = class_132.method_576(var1);
      this.field_357 = var2;
      this.field_358 = var3;
   }

   // $FF: renamed from: a () cJ
   public final class_141 method_627() {
      int var1;
      int[] var2 = new int[var1 = this.field_357.length];
      int[] var3 = new int[var1];
      System.arraycopy(this.field_357, 0, var2, 0, var1);
      System.arraycopy(this.field_358, 0, var3, 0, var1);
      class_141 var10000 = new class_141;
      var10000.method_626(this.field_355, var2, var3);
      return var10000;
   }

   // $FF: renamed from: a (int) int[]
   private int[] method_628(int var1) {
      int var2;
      if((var2 = this.field_357.length) == 0) {
         var2 = 1;
      }

      while(var2 <= var1) {
         var2 <<= 1;
      }

      int[] var3 = new int[var2];
      System.arraycopy(this.field_357, 0, var3, 0, this.field_357.length);
      this.field_357 = var3;
      int[] var4 = new int[var2];
      System.arraycopy(this.field_358, 0, var4, 0, this.field_358.length);
      this.field_358 = var4;
      return var3;
   }

   // $FF: renamed from: a (java.lang.Object) void
   public final void method_629(Object var1) {
      Object var2;
      if((var2 = (class_41[])this.field_356.method_659(var1)) == null) {
         var2 = class_132.method_577(this.field_355, var1);
      }

      if((var1 = ((Object[])var2)[0]) >= this.field_357.length) {
         this.method_628((int)var1);
      }

      this.field_357[var1] |= ((Object[])var2)[1];
      method_632(this.field_358, (int)var1, this.field_358[var1], (int)var1);
   }

   // $FF: renamed from: b (java.lang.Object) void
   public final void method_630(Object var1) {
      Object var2;
      if((var2 = (class_41[])this.field_356.method_659(var1)) == null) {
         var2 = class_132.method_577(this.field_355, var1);
      }

      if((var1 = ((Object[])var2)[0]) < this.field_357.length) {
         this.field_357[var1] &= ~((Object[])var2)[1];
         if(this.field_357[var1] == 0) {
            method_632(this.field_358, (int)var1, (int)var1, this.field_358[var1]);
         }
      }

   }

   // $FF: renamed from: c (java.lang.Object) boolean
   public final boolean method_631(Object var1) {
      Object var2;
      if((var2 = (class_41[])this.field_356.method_659(var1)) == null) {
         var2 = class_132.method_577(this.field_355, var1);
      }

      return ((Object[])var2)[0] < this.field_357.length && (this.field_357[((Object[])var2)[0]] & ((Object[])var2)[1]) != 0;
   }

   // $FF: renamed from: a (int[], int, int, int) void
   private static void method_632(int[] var0, int var1, int var2, int var3) {
      --var1;

      while(var1 >= 0 && var0[var1] == var2) {
         var0[var1] = var3;
         --var1;
      }

   }

   // $FF: renamed from: a (cJ) void
   public final void method_633(class_141 var1) {
      Object var3 = null;
      int[] var2 = var1.field_357;
      int[] var7 = var1.field_358;
      int[] var8 = this.field_357;
      int var4 = this.field_357.length;
      int var5 = 0;

      do {
         if(var5 >= var4) {
            var8 = this.method_628(var2.length - 1);
         }

         boolean var6 = var8[var5] == 0;
         var8[var5] |= var2[var5];
         if(var6) {
            method_632(this.field_358, var5, this.field_358[var5], var5);
         }
      } while((var5 = var7[var5]) != 0);

   }

   // $FF: renamed from: b (cJ) void
   public final void method_634(class_141 var1) {
      int[] var5 = var1.field_357;
      int[] var2 = this.field_357;

      int var3;
      int var4;
      for(var4 = (var3 = Math.min(var5.length, var2.length)) - 1; var4 >= 0; --var4) {
         var2[var4] &= var5[var4];
      }

      for(var4 = var2.length - 1; var4 >= var3; --var4) {
         var2[var4] = 0;
      }

      int var6 = 0;

      for(int var7 = this.field_357.length - 1; var7 >= 0; --var7) {
         this.field_358[var7] = var6;
         if(this.field_357[var7] != 0) {
            var6 = var7;
         }
      }

   }

   // $FF: renamed from: c (cJ) void
   public final void method_635(class_141 var1) {
      int[] var5 = var1.field_357;
      int[] var2 = this.field_357;
      int var3 = var5.length;
      int var4 = 0;

      while(var4 < var3) {
         var2[var4] &= ~var5[var4];
         if(var2[var4] == 0) {
            method_632(this.field_358, var4, var4, this.field_358[var4]);
         }

         if((var4 = this.field_358[var4]) == 0) {
            break;
         }
      }

   }

   public final boolean equals(Object var1) {
      if(!(var1 instanceof class_141)) {
         return false;
      } else {
         int[] var4 = ((class_141)var1).field_357;
         int[] var2 = this.field_357;
         if(this.field_357.length > var4.length) {
            var2 = var4;
            var4 = this.field_357;
         }

         int var3;
         for(var3 = var2.length - 1; var3 >= 0; --var3) {
            if(var2[var3] != var4[var3]) {
               return false;
            }
         }

         for(var3 = var4.length - 1; var3 >= var2.length; --var3) {
            if(var4[var3] != 0) {
               return false;
            }
         }

         return true;
      }
   }

   // $FF: renamed from: b () int
   public final int method_636() {
      boolean var1 = false;

      int[] var4;
      for(int var2 = (var4 = this.field_357).length - 1; var2 >= 0; --var2) {
         int var3;
         if((var3 = var4[var2]) != 0) {
            if(var1) {
               return 2;
            }

            if((var3 & var3 - 1) != 0) {
               return 2;
            }

            var1 = true;
         }
      }

      if(var1) {
         return 1;
      } else {
         return 0;
      }
   }

   // $FF: renamed from: c () boolean
   public final boolean method_637() {
      return this.field_357.length == 0 || this.field_358[0] == 0 && this.field_357[0] == 0;
   }

   public final Iterator iterator() {
      class_199 var10000 = new class_199;
      var10000.method_983(this, (class_199)null);
      return var10000;
   }

   // $FF: renamed from: d () cM
   public final class_132 method_638() {
      return this.field_355;
   }
}
