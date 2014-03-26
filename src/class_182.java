
// $FF: renamed from: aH
public final class class_182 {

   // $FF: renamed from: a int[][][]
   private static final int[][][] field_467;
   // $FF: renamed from: b int[]
   private static final int[] field_468;


   // $FF: renamed from: <clinit> () void
   static void method_861() {
      field_467 = (int[][][])(new class_41[][][]{new class_41[2][], null, null, null, null, null, null, null, null, {null, {5}}, {null, {5}}, {null, {3}}, {null, {3}}, {null, {3}}, {null, {2}}, {null, {2}}, {null, {4}}, {null, {4}}, null, null, null, {null, {4}}, {null, {5}}, {null, {3}}, {null, {2}}, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, {{8, 4}, {4}}, {{8, 4}, {5}}, {{8, 4}, {3}}, {{8, 4}, {2}}, null, {{8, 4}, {4}}, {{8, 4}, {4}}, {{8, 4}, {4}}, {{4}, null}, {{5}, null}, {{3}, null}, {{2}, null}, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, {{8, 4, 4}, null}, {{8, 4, 5}, null}, {{8, 4, 3}, null}, {{8, 4, 2}, null}, {{8, 4, 8}, null}, {{8, 4, 4}, null}, {{8, 4, 4}, null}, {{8, 4, 4}, null}, {{11}, null}, {{11, 11}, null}, null, null, null, null, null, null, null, {{4, 4}, {4}}, {{5, 5}, {5}}, {{3, 3}, {3}}, {{2, 2}, {2}}, {{4, 4}, {4}}, {{5, 5}, {5}}, {{3, 3}, {3}}, {{2, 2}, {2}}, {{4, 4}, {4}}, {{5, 5}, {5}}, {{3, 3}, {3}}, {{2, 2}, {2}}, {{4, 4}, {4}}, {{5, 5}, {5}}, {{3, 3}, {3}}, {{2, 2}, {2}}, {{4, 4}, {4}}, {{5, 5}, {5}}, {{3, 3}, {3}}, {{2, 2}, {2}}, {{4}, {4}}, {{5}, {5}}, {{3}, {3}}, {{2}, {2}}, {{4, 4}, {4}}, {{5, 4}, {5}}, {{4, 4}, {4}}, {{5, 4}, {5}}, {{4, 4}, {4}}, {{5, 4}, {5}}, {{4, 4}, {4}}, {{5, 5}, {5}}, {{4, 4}, {4}}, {{5, 5}, {5}}, {{4, 4}, {4}}, {{5, 5}, {5}}, new class_41[2][], {{4}, {5}}, {{4}, {3}}, {{4}, {2}}, {{5}, {4}}, {{5}, {3}}, {{5}, {2}}, {{3}, {4}}, {{3}, {5}}, {{3}, {2}}, {{2}, {4}}, {{2}, {5}}, {{2}, {3}}, {{4}, {4}}, {{4}, {4}}, {{4}, {4}}, {{5, 5}, {4}}, {{3, 3}, {4}}, {{3, 3}, {4}}, {{2, 2}, {4}}, {{2, 2}, {4}}, {{4}, null}, {{4}, null}, {{4}, null}, {{4}, null}, {{4}, null}, {{4}, null}, {{4, 4}, null}, {{4, 4}, null}, {{4, 4}, null}, {{4, 4}, null}, {{4, 4}, null}, {{4, 4}, null}, {{8, 8}, null}, {{8, 8}, null}, new class_41[2][], {null, {9}}, new class_41[2][], {{4}, null}, {{4}, null}, {{4}, null}, {{5}, null}, {{3}, null}, {{2}, null}, {{8}, null}, new class_41[2][], null, null, null, null, null, null, null, null, null, null, null, null, {{8}, {4}}, null, null, null, {{8}, null}, {{8}, null}, null, null, {{8}, null}, {{8}, null}, new class_41[2][], {null, {9}}});
      field_468 = new int[]{7, 1, 3, 2, 0, 6, 4, 5};
   }

   // $FF: renamed from: <init> () void
   public void method_862() {
      super();
   }

   // $FF: renamed from: a (aR, j, bK) void
   public static void method_863(class_169 var0, class_5 var1, class_203 var2) {
      class_118 var3 = var0.method_783();
      int[][] var4;
      class_83 var10001;
      int var13;
      if((var4 = field_467[var1.field_5]) != null) {
         int[] var6 = var4[0];
         int[] var9 = var4[1];
         int var10;
         if(var6 != null) {
            var10 = 0;

            for(var13 = 0; var13 < var6.length; ++var13) {
               int var5 = var6[var13];
               ++var10;
               if(var5 == 5 || var5 == 2) {
                  ++var10;
               }
            }

            var3.method_486(var10);
         }

         if(var9 != null) {
            for(var10 = 0; var10 < var9.length; ++var10) {
               var13 = var9[var10];
               var10001 = new class_83;
               var10001.method_235(var13);
               var3.method_483(var10001);
               if(var13 == 5 || var13 == 2) {
                  var10001 = new class_83;
                  var10001.method_235(12);
                  var3.method_483(var10001);
               }
            }

            return;
         }
      } else {
         var3 = var0.method_783();
         class_80 var7;
         class_83 var8;
         class_79 var12;
         class_83 var10000;
         int var14;
         switch(var1.field_5) {
         case 1:
            var10001 = new class_83;
            var10001.method_237(13, 0, (String)null);
            var3.method_483(var10001);
            return;
         case 18:
         case 19:
         case 20:
            switch(var2.method_995(var1.method_15(0)).field_99) {
            case 3:
               var10001 = new class_83;
               var10001.method_235(4);
               var3.method_483(var10001);
               return;
            case 4:
               var10001 = new class_83;
               var10001.method_235(3);
               var3.method_483(var10001);
               return;
            case 5:
               var10001 = new class_83;
               var10001.method_235(5);
               var3.method_483(var10001);
               var10001 = new class_83;
               var10001.method_235(12);
               var3.method_483(var10001);
               return;
            case 6:
               var10001 = new class_83;
               var10001.method_235(2);
               var3.method_483(var10001);
               var10001 = new class_83;
               var10001.method_235(12);
               var3.method_483(var10001);
               return;
            case 7:
               var10001 = new class_83;
               var10001.method_237(8, 0, "java/lang/Class");
               var3.method_483(var10001);
            case 8:
               var10001 = new class_83;
               var10001.method_237(8, 0, "java/lang/String");
               var3.method_483(var10001);
               return;
            default:
               return;
            }
         case 25:
            if((var8 = var0.method_778(var1.method_15(0))) != null) {
               var3.method_483(var8);
               return;
            }

            var10001 = new class_83;
            var10001.method_237(8, 0, (String)null);
            var3.method_483(var10001);
            return;
         case 50:
            var8 = (class_83)var3.method_485(2);
            var10001 = new class_83;
            var10001.method_237(var8.field_133, var8.field_135 - 1, var8.field_136);
            var3.method_483(var10001);
            return;
         case 58:
            var0.method_777(var1.method_15(0), (class_83)var3.method_484());
            return;
         case 89:
         case 90:
         case 91:
            var14 = 88 - var1.field_5;
            var3.method_489(var14, ((class_83)var3.method_488(-1)).method_241());
            return;
         case 92:
         case 93:
         case 94:
            var14 = 90 - var1.field_5;
            var3.method_489(var14, ((class_83)var3.method_488(-2)).method_241());
            var3.method_489(var14, ((class_83)var3.method_488(-1)).method_241());
            return;
         case 95:
            var8 = (class_83)var3.method_484();
            var3.method_489(-1, var8);
            return;
         case 180:
            var3.method_484();
         case 178:
            var12 = var2.method_996(var1.method_15(0));
            var10000 = new class_83;
            var10000.method_238(var12.field_104);
            var8 = var10000;
            var3.method_483(var8);
            if(var8.field_137 == 2) {
               var10001 = new class_83;
               var10001.method_235(12);
               var3.method_483(var10001);
               return;
            }
            break;
         case 181:
            var3.method_484();
         case 179:
            var12 = var2.method_996(var1.method_15(0));
            var10000 = new class_83;
            var10000.method_238(var12.field_104);
            var8 = var10000;
            var3.method_485(var8.field_137);
            return;
         case 182:
         case 183:
         case 185:
            var3.method_484();
         case 184:
            class_197 var11 = class_197.method_963(var2.method_996(var1.method_15(0)).field_104);

            for(var13 = 0; var13 < var11.field_519.length; ++var13) {
               var3.method_485(var11.field_519[var13].field_137);
            }

            if(var11.field_520.field_133 != 10) {
               var3.method_483(var11.field_520);
               if(var11.field_520.field_137 == 2) {
                  var10001 = new class_83;
                  var10001.method_235(12);
                  var3.method_483(var10001);
                  return;
               }
            }
            break;
         case 187:
            var7 = var2.method_995(var1.method_15(0));
            var10001 = new class_83;
            var10001.method_237(8, 0, (String)var7.field_106);
            var3.method_483(var10001);
            return;
         case 188:
            var3.method_484();
            var10000 = new class_83;
            var10000.method_235(field_468[var1.method_15(0) - 4]);
            var8 = var10000;
            var10000.field_135 = 1;
            var3.method_483(var8);
            return;
         case 189:
         case 197:
            var13 = var1.field_5 == 189?1:var1.method_15(1);
            var3.method_485(var13);
            if((var7 = var2.method_995(var1.method_15(0))).field_107) {
               var10000 = new class_83;
               var10000.method_237(8, 0, (String)var7.field_106);
               var8 = var10000;
               var10000.field_135 += var13;
               var3.method_483(var8);
               return;
            }

            var10001 = new class_83;
            var10001.method_237(8, var13, (String)var7.field_106);
            var3.method_483(var10001);
            break;
         case 191:
            var8 = (class_83)var3.method_484();
            var3.clear();
            var3.method_483(var8);
            return;
         case 192:
         case 193:
            var3.method_484();
            var7 = var2.method_995(var1.method_15(0));
            var10001 = new class_83;
            var10001.method_237(8, 0, (String)var7.field_106);
            var3.method_483(var10001);
            return;
         }
      }

   }
}
