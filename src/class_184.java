import java.util.ArrayList;
import java.util.List;

// $FF: renamed from: bZ
public final class class_184 {

   // $FF: renamed from: a int
   private int field_473;
   // $FF: renamed from: b cJ[][]
   private class_141[][] field_474;
   // $FF: renamed from: c int[][]
   private int[][] field_475;


   // $FF: renamed from: <init> () void
   public void method_865() {
      this.method_866(true);
   }

   // $FF: renamed from: <init> (boolean) void
   private void method_866(boolean var1) {
      super();
      this.field_474 = new class_141[3][];
      this.field_475 = (int[][])(new class_41[3][]);
      if(var1) {
         for(int var2 = 2; var2 >= 0; --var2) {
            this.field_474[var2] = new class_141[0];
            this.field_475[var2] = new int[0];
         }
      }

   }

   // $FF: renamed from: <init> (bZ) void
   public void method_867(class_184 var1) {
      super();
      this.field_474 = new class_141[3][];
      this.field_475 = (int[][])(new class_41[3][]);

      for(int var2 = 2; var2 >= 0; --var2) {
         class_141[] var3 = var1.field_474[var2];
         int[] var4 = var1.field_475[var2];
         int var5;
         class_141[] var6 = new class_141[var5 = var3.length];
         int[] var7 = new int[var5];
         System.arraycopy(var3, 0, var6, 0, var5);
         System.arraycopy(var4, 0, var7, 0, var5);
         this.field_474[var2] = var6;
         this.field_475[var2] = var7;
         this.field_473 = var1.field_473;
      }

   }

   // $FF: renamed from: a () bZ
   public final class_184 method_868() {
      class_184 var10000 = new class_184;
      var10000.method_866(false);
      class_184 var1 = var10000;
      var10000.field_473 = this.field_473;
      class_141[][] var2 = var1.field_474;
      int[][] var3 = var1.field_475;

      for(int var4 = 2; var4 >= 0; --var4) {
         class_141[] var5;
         int var6;
         if((var6 = (var5 = this.field_474[var4]).length) > 0) {
            int[] var7 = this.field_475[var4];
            class_141[] var8 = new class_141[var6];
            int[] var9 = new int[var6];
            System.arraycopy(var7, 0, var9, 0, var6);
            var2[var4] = var8;
            var3[var4] = var9;
            var6 = 0;

            do {
               class_141 var10;
               if((var10 = var5[var6]) != null) {
                  var8[var6] = var10.method_627();
               }
            } while((var6 = var7[var6]) != 0);
         } else {
            var2[var4] = new class_141[0];
            var3[var4] = new int[0];
         }
      }

      return var1;
   }

   // $FF: renamed from: b () int
   public final int method_869() {
      return this.field_473;
   }

   // $FF: renamed from: c () boolean
   public final boolean method_870() {
      return this.field_473 == 0;
   }

   // $FF: renamed from: a (int, cJ) void
   public final void method_871(int var1, class_141 var2) {
      class_184 var10000 = this;
      boolean var6 = false;
      this = var10000;
      byte var3 = 0;
      if((var1 = var1) < 0) {
         var3 = 2;
         var1 = -var1;
      } else if(var1 >= 10000) {
         var3 = 1;
         var1 -= 10000;
      }

      class_141[] var4 = this.field_474[var3];
      if(var1 >= var4.length) {
         var4 = this.method_880(var3, var1 + 1, false);
      }

      class_141 var5 = var4[var1];
      var4[var1] = var2;
      int[] var7 = this.field_475[var3];
      if(var5 == null && var2 != null) {
         ++this.field_473;
         method_873(var7, var1, var7[var1], var1);
      } else {
         if(var5 != null && var2 == null) {
            --this.field_473;
            method_873(var7, var1, var1, var7[var1]);
         }

      }
   }

   // $FF: renamed from: d () void
   public final void method_872() {
      class_141[] var1 = this.field_474[2];
      int[] var2 = this.field_475[2];

      for(int var3 = var1.length - 1; var3 >= 0; --var3) {
         if(var1[var3] != null) {
            var1[var3] = null;
            --this.field_473;
         }

         var2[var3] = 0;
      }

   }

   // $FF: renamed from: a (int[], int, int, int) void
   private static void method_873(int[] var0, int var1, int var2, int var3) {
      --var1;

      while(var1 >= 0 && var0[var1] == var2) {
         var0[var1] = var3;
         --var1;
      }

   }

   // $FF: renamed from: a (int) boolean
   public final boolean method_874(int var1) {
      return this.method_875(var1) != null;
   }

   // $FF: renamed from: b (int) cJ
   public final class_141 method_875(int var1) {
      byte var2 = 0;
      if(var1 < 0) {
         var2 = 2;
         var1 = -var1;
      } else if(var1 >= 10000) {
         var2 = 1;
         var1 -= 10000;
      }

      class_141[] var3 = this.field_474[var2];
      return var1 < var3.length?var3[var1]:null;
   }

   // $FF: renamed from: a (bZ) void
   public final void method_876(class_184 var1) {
      for(int var2 = 2; var2 >= 0; --var2) {
         class_141[] var3;
         if((var3 = this.field_474[var2]).length != 0) {
            class_141[] var4 = var1.field_474[var2];
            int[] var5 = this.field_475[var2];
            int var6 = 0;

            do {
               class_141 var7;
               if((var7 = var3[var6]) != null) {
                  if(var6 >= var4.length) {
                     break;
                  }

                  class_141 var8;
                  if((var8 = var4[var6]) != null) {
                     var7.method_635(var8);
                     if(var7.method_637()) {
                        var3[var6] = null;
                        --this.field_473;
                        method_873(var5, var6, var6, var5[var6]);
                     }
                  }
               }
            } while((var6 = var5[var6]) != 0);
         }
      }

   }

   // $FF: renamed from: b (bZ) void
   public final void method_877(class_184 var1) {
      for(int var2 = 2; var2 >= 0; --var2) {
         class_141[] var3;
         if((var3 = this.field_474[var2]).length != 0) {
            class_141[] var4 = var1.field_474[var2];
            int[] var5 = this.field_475[var2];
            int var6 = 0;

            do {
               class_141 var7;
               if((var7 = var3[var6]) != null) {
                  class_141 var8 = null;
                  if(var6 < var4.length) {
                     var8 = var4[var6];
                  }

                  if(var8 != null) {
                     var7.method_634(var8);
                  }

                  if(var8 == null || var7.method_637()) {
                     var3[var6] = null;
                     --this.field_473;
                     method_873(var5, var6, var6, var5[var6]);
                  }
               }
            } while((var6 = var5[var6]) != 0);
         }
      }

   }

   // $FF: renamed from: c (bZ) void
   public final void method_878(class_184 var1) {
      for(int var2 = 2; var2 >= 0; --var2) {
         class_141[] var3;
         if((var3 = var1.field_474[var2]).length != 0) {
            class_141[] var4 = this.field_474[var2];
            int[] var5 = this.field_475[var2];
            int[] var6 = var1.field_475[var2];
            int var7 = 0;

            do {
               if(var7 >= var4.length) {
                  var4 = this.method_880(var2, var3.length, true);
                  var5 = this.field_475[var2];
               }

               class_141 var8;
               if((var8 = var3[var7]) != null) {
                  class_141 var9;
                  if((var9 = var4[var7]) == null) {
                     var4[var7] = var8.method_627();
                     ++this.field_473;
                     method_873(var5, var7, var5[var7], var7);
                  } else {
                     var9.method_633(var8);
                  }
               }
            } while((var7 = var6[var7]) != 0);
         }
      }

   }

   // $FF: renamed from: e () java.util.List
   public final List method_879() {
      ArrayList var1 = new ArrayList();

      for(int var2 = 2; var2 >= 0; --var2) {
         int var3 = 0;
         class_141[] var7;
         int var6 = (var7 = this.field_474[var2]).length;

         for(int var5 = 0; var5 < var6; ++var5) {
            class_141 var4;
            if((var4 = var7[var5]) != null) {
               int var8 = var2 == 0?var3:(var2 == 1?var3 + 10000:-var3);
               class_158 var10001 = new class_158;
               var10001.method_726(var8, var4);
               var1.add(var10001);
            }

            ++var3;
         }
      }

      return var1;
   }

   // $FF: renamed from: a (int, int, boolean) cJ[]
   private class_141[] method_880(int var1, int var2, boolean var3) {
      class_141[] var4 = this.field_474[var1];
      int[] var5 = this.field_475[var1];
      int var6 = var2;
      if(!var3) {
         var6 = 2 * var4.length / 3 + 1;
         if(var2 > var6) {
            var6 = var2;
         }
      }

      class_141[] var7 = new class_141[var6];
      System.arraycopy(var4, 0, var7, 0, var4.length);
      int[] var8 = new int[var6];
      System.arraycopy(var5, 0, var8, 0, var5.length);
      this.field_474[var1] = var7;
      this.field_475[var1] = var8;
      return var7;
   }
}
