import java.io.ByteArrayInputStream;
import java.util.ArrayList;

// $FF: renamed from: bn
public final class class_128 implements class_1 {

   // $FF: renamed from: a int
   private int field_308;
   // $FF: renamed from: b int
   private int field_309;
   // $FF: renamed from: c int[]
   private static final int[] field_310;
   // $FF: renamed from: d int[]
   private static final int[] field_311;
   // $FF: renamed from: f int[]
   private static final int[] field_312;
   // $FF: renamed from: g int[]
   private static final int[] field_313;
   // $FF: renamed from: h int
   private int field_314;
   // $FF: renamed from: i cE
   private class_146 field_315;
   // $FF: renamed from: j int
   private int field_316;
   // $FF: renamed from: k java.lang.String
   private String field_317;
   // $FF: renamed from: l java.lang.String
   private String field_318;
   // $FF: renamed from: m cQ
   private class_61 field_319;
   // $FF: renamed from: n boolean
   private boolean field_320;
   // $FF: renamed from: o boolean
   private boolean field_321;
   // $FF: renamed from: p bW
   private class_198 field_322;
   // $FF: renamed from: q boolean
   private boolean field_323;
   // $FF: renamed from: r boolean
   private boolean field_324;
   // $FF: renamed from: s int
   private int field_325;
   // $FF: renamed from: t int
   private int field_326;


   // $FF: renamed from: <clinit> () void
   static void method_1() {
      field_310 = new int[]{-1, 0, 1, 2, 3, 4, 5};
      field_311 = new int[]{0, 1, 2, 3, 0, 1, 2, 3, 0, 1, 2, 3, 0, 1, 2, 3, 0, 1, 2, 3};
      field_312 = new int[]{21, 22, 23, 24, 25};
      field_313 = new int[]{54, 55, 56, 57, 58};
   }

   // $FF: renamed from: <init> (cw, boolean, bW) void
   public void method_541(class_153 var1, boolean var2, class_198 var3) {
      this.method_542(var1, true, var2, var3);
   }

   // $FF: renamed from: <init> (cw, boolean, boolean, bW) void
   private void method_542(class_153 var1, boolean var2, boolean var3, class_198 var4) {
      super();
      this.field_320 = false;
      this.field_325 = 0;
      this.field_326 = 0;
      this.field_321 = var3;
      this.field_323 = true;
      this.field_324 = false;
      this.field_322 = var4;
      this.field_314 = var1.readUnsignedShort();
      this.field_308 = var1.readUnsignedShort();
      this.field_309 = var1.readUnsignedShort();
      class_203 var10 = var4.method_973();
      int var5 = var4.field_524;
      String[] var13 = var10.method_993(3, var5, this.field_308, this.field_309);
      this.field_317 = var13[0];
      this.field_318 = var13[1];
      class_146 var10000 = new class_146;
      var10000.method_653();
      class_146 var11 = var10000;
      int var14 = var1.readUnsignedShort();

      for(var5 = 0; var5 < var14; ++var5) {
         int var6 = var1.readUnsignedShort();
         class_80 var12 = var10.method_995(var6);
         String var9 = null;
         String var7 = (String)var12.field_106;
         if("Code".equals(var7)) {
            if(!this.field_321) {
               var1.skip(8L);
               var1.skip((long)var1.readInt());
               var1.skip((long)(8 * var1.readUnsignedShort()));
            } else {
               this.field_320 = true;
               var1.skip(4L);
               var1.readUnsignedShort();
               this.field_316 = var1.readUnsignedShort();
               this.field_325 = var1.readInt();
               var1.skip((long)this.field_325);
               var6 = var1.readUnsignedShort();
               this.field_326 = this.field_325 + (var6 << 3) + 2;
               var1.skip((long)(var6 << 3));
            }

            var6 = var1.readUnsignedShort();

            for(int var15 = 0; var15 < var6; ++var15) {
               int var8 = var1.readUnsignedShort();
               var9 = (String)var10.method_995(var8).field_106;
               method_543(var1, var10, var11, var8, var9);
            }
         } else {
            method_543(var1, var10, var11, var6, var7);
         }
      }

      this.field_315 = var11;
   }

   // $FF: renamed from: a (cw, bK, cE, int, java.lang.String) void
   private static void method_543(class_153 var0, class_203 var1, class_146 var2, int var3, String var4) {
      class_67 var5;
      if((var5 = class_67.method_195(var3, var4)) != null) {
         byte[] var6 = new byte[var0.readInt()];
         var0.method_711(var6);
         var5.method_196(var6);
         var5.method_194(var1);
         var4 = var5.method_197();
         if("LocalVariableTable".equals(var4) && var2.method_662(var4)) {
            ((class_76)var2.method_659(var4)).method_212((class_76)var5);
         } else {
            var2.method_655(var5, var5.method_197());
         }
      } else {
         var0.skip((long)var0.readInt());
      }
   }

   // $FF: renamed from: a () void
   public final void method_544() {
      if(this.field_320 && this.field_323 && !this.field_324) {
         byte[] var1 = this.field_322.method_980().method_704(this, this.field_326);
         class_153 var10001 = new class_153;
         var10001.method_710(new ByteArrayInputStream(var1));
         this.field_319 = method_546(var10001, this.field_325, this.field_322.method_973());
         this.field_324 = true;
      }

   }

   // $FF: renamed from: b () void
   public final void method_545() {
      if(this.field_320 && this.field_323 && this.field_324) {
         this.field_319 = null;
         this.field_324 = false;
      }

   }

   // $FF: renamed from: a (cw, int, bK) cQ
   private static class_61 method_546(class_153 var0, int var1, class_203 var2) {
      class_146 var10000 = new class_146;
      var10000.method_653();
      class_146 var3 = var10000;

      int var6;
      int var12;
      for(int var4 = 0; var4 < var1; ++var4) {
         var6 = var0.readUnsignedByte();
         byte var7 = 1;
         boolean var8;
         if(var8 = var6 == 196) {
            ++var4;
            var6 = var0.readUnsignedByte();
         }

         ArrayList var9 = new ArrayList();
         int var11;
         if(var6 >= 2 && var6 <= 8) {
            var9.add(new Integer(field_310[var6 - 2]));
            var6 = 16;
         } else if(var6 >= 26 && var6 <= 45) {
            var9.add(new Integer(field_311[var6 - 26]));
            var6 = field_312[(var6 - 26) / 4];
         } else if(var6 >= 59 && var6 <= 78) {
            var9.add(new Integer(field_311[var6 - 59]));
            var6 = field_313[(var6 - 59) / 4];
         } else {
            int var10;
            switch(var6) {
            case 16:
               var9.add(new Integer(var0.readByte()));
               ++var4;
               break;
            case 17:
            case 153:
            case 154:
            case 155:
            case 156:
            case 157:
            case 158:
            case 159:
            case 160:
            case 161:
            case 162:
            case 163:
            case 164:
            case 165:
            case 166:
            case 167:
            case 168:
            case 198:
            case 199:
               if(var6 != 17) {
                  var7 = 2;
               }

               var9.add(new Integer(var0.readShort()));
               var4 += 2;
               break;
            case 18:
            case 188:
               var9.add(new Integer(var0.readUnsignedByte()));
               ++var4;
               break;
            case 19:
            case 20:
            case 178:
            case 179:
            case 180:
            case 181:
            case 182:
            case 183:
            case 184:
            case 187:
            case 189:
            case 192:
            case 193:
               var9.add(new Integer(var0.readUnsignedShort()));
               var4 += 2;
               if(var6 >= 178 && var6 <= 181) {
                  var7 = 5;
               } else if(var6 >= 182 && var6 <= 184) {
                  var7 = 4;
               }
               break;
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 169:
               if(var8) {
                  var9.add(new Integer(var0.readUnsignedShort()));
                  var4 += 2;
               } else {
                  var9.add(new Integer(var0.readUnsignedByte()));
                  ++var4;
               }

               if(var6 != 169) {
                  break;
               }
            case 132:
               if(var8) {
                  var9.add(new Integer(var0.readUnsignedShort()));
                  var9.add(new Integer(var0.readShort()));
                  var4 += 4;
               } else {
                  var9.add(new Integer(var0.readUnsignedByte()));
                  var9.add(new Integer(var0.readByte()));
                  var4 += 2;
               }
               break;
            case 170:
               var0.skip((long)((4 - (var4 + 1) % 4) % 4));
               var4 += (4 - (var4 + 1) % 4) % 4;
               var9.add(new Integer(var0.readInt()));
               var4 += 4;
               var10 = var0.readInt();
               var9.add(new Integer(var10));
               var4 += 4;
               var11 = var0.readInt();
               var9.add(new Integer(var11));
               var4 += 4;

               for(var12 = 0; var12 < var11 - var10 + 1; ++var12) {
                  var9.add(new Integer(var0.readInt()));
                  var4 += 4;
               }

               var7 = 3;
               break;
            case 171:
               var0.skip((long)((4 - (var4 + 1) % 4) % 4));
               var4 += (4 - (var4 + 1) % 4) % 4;
               var9.add(new Integer(var0.readInt()));
               var4 += 4;
               var12 = var0.readInt();
               var9.add(new Integer(var12));
               var4 += 4;

               for(var10 = 0; var10 < var12; ++var10) {
                  var9.add(new Integer(var0.readInt()));
                  var4 += 4;
                  var9.add(new Integer(var0.readInt()));
                  var4 += 4;
               }

               var7 = 3;
               break;
            case 172:
            case 173:
            case 174:
            case 175:
            case 176:
            case 177:
            case 191:
               var7 = 6;
               break;
            case 185:
               var9.add(new Integer(var0.readUnsignedShort()));
               var9.add(new Integer(var0.readUnsignedByte()));
               var0.skip(1L);
               var7 = 4;
               var4 += 4;
               break;
            case 197:
               var9.add(new Integer(var0.readUnsignedShort()));
               var9.add(new Integer(var0.readUnsignedByte()));
               var4 += 3;
               break;
            case 200:
            case 201:
               var6 = var6 == 201?168:167;
               var9.add(new Integer(var0.readInt()));
               var7 = 2;
               var4 += 4;
            }
         }

         int[] var16 = new int[var9.size()];

         for(var11 = 0; var11 < var9.size(); ++var11) {
            var16[var11] = ((Integer)var9.get(var11)).intValue();
         }

         class_5 var18 = class_213.method_1067(var6, var8, var7, var16);
         var3.method_655(var18, new Integer(var4));
      }

      ArrayList var19 = new ArrayList();
      int var5 = var0.readUnsignedShort();

      for(var6 = 0; var6 < var5; ++var6) {
         class_84 var20 = new class_84;
         var20.method_250();
         class_84 var17 = var20;
         var20.field_139 = var0.readUnsignedShort();
         var17.field_140 = var0.readUnsignedShort();
         var17.field_141 = var0.readUnsignedShort();
         int var14;
         if((var14 = var0.readUnsignedShort()) != 0) {
            var17.field_145 = (String)var2.method_995(var14).field_106;
         }

         var19.add(var17);
      }

      class_63 var21 = new class_63;
      class_137 var10003 = new class_137;
      var10003.method_590(var19);
      var21.method_184(var3, var10003);
      class_63 var15 = var21;
      var12 = var21.method_176() - 1;
      var15.method_181(var12);

      for(; var12 >= 0; var15.method_178()) {
         class_5 var13;
         if((var13 = var15.method_171(var12--)).field_6 != 1) {
            var13.method_17(var15);
         }
      }

      return var15;
   }

   // $FF: renamed from: c () cQ
   public final class_61 method_547() {
      return this.field_319;
   }

   // $FF: renamed from: d () java.lang.String
   public final String method_548() {
      return this.field_318;
   }

   // $FF: renamed from: e () java.lang.String
   public final String method_549() {
      return this.field_317;
   }

   // $FF: renamed from: f () int
   public final int method_550() {
      return this.field_314;
   }

   // $FF: renamed from: g () int
   public final int method_551() {
      return this.field_316;
   }

   // $FF: renamed from: h () cE
   public final class_146 method_552() {
      return this.field_315;
   }

   // $FF: renamed from: i () bW
   public final class_198 method_553() {
      return this.field_322;
   }
}
