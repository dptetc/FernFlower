import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

// $FF: renamed from: bB
public final class class_209 implements class_1 {

   // $FF: renamed from: a java.util.HashMap
   private static final HashMap field_572;
   // $FF: renamed from: b Q[]
   private static final class_83[] field_573;
   // $FF: renamed from: c Q[]
   private static final class_83[] field_574;
   // $FF: renamed from: d Q[]
   private static final class_83[] field_575;
   // $FF: renamed from: f int[]
   private static final int[] field_576;
   // $FF: renamed from: g int[]
   private static final int[] field_577;
   // $FF: renamed from: h int[]
   private static final int[] field_578;
   // $FF: renamed from: i int[]
   private static final int[] field_579;
   // $FF: renamed from: j int[]
   private static final int[] field_580;
   // $FF: renamed from: k int[]
   private static final int[] field_581;
   // $FF: renamed from: l int[]
   private static final int[] field_582;
   // $FF: renamed from: m int[]
   private static final int[] field_583;
   // $FF: renamed from: n int[]
   private static final int[] field_584;
   // $FF: renamed from: o int[]
   private static final int[] field_585;
   // $FF: renamed from: p java.lang.String[]
   private static final String[] field_586;
   // $FF: renamed from: q ce
   private class_164 field_587;


   // $FF: renamed from: <clinit> () void
   static void method_1() {
      (field_572 = new HashMap()).put(new Integer(190), new Integer(31));
      field_572.put(new Integer(192), new Integer(29));
      field_572.put(new Integer(193), new Integer(30));
      field_573 = new class_83[]{class_83.field_118, class_83.field_119, class_83.field_120, class_83.field_121, class_83.field_130, class_83.field_129};
      field_574 = new class_83[]{class_83.field_118, class_83.field_120, class_83.field_119, class_83.field_121, class_83.field_131};
      field_575 = new class_83[]{class_83.field_118, class_83.field_120, class_83.field_119, class_83.field_121, class_83.field_131, class_83.field_125, class_83.field_123, class_83.field_124};
      field_576 = new int[]{0, 1, 2, 3, 7};
      field_577 = new int[]{8, 9, 10, 4, 5, 6};
      field_578 = new int[]{14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28};
      field_579 = new int[]{37, 38, 39, 40, 41};
      field_580 = new int[]{0, 1, 2, 3, 4, 5};
      field_581 = new int[]{8, 9, 10, 11, 12, 13, 14, 15};
      field_582 = new int[]{6, 7};
      field_583 = new int[]{0, 1};
      field_584 = new int[]{7, 1, 3, 2, 0, 6, 4, 5};
      field_585 = new int[]{1, 0, 3, 2, 5, 4, 7, 6, 9, 8, 11, 10, 13, 12, 15, 14};
      field_586 = new String[]{"byte", "char", "double", "float", "int", "long", "short", "boolean"};
   }

   // $FF: renamed from: <init> () void
   public void method_1027() {
      super();
      this.field_587 = (class_164)class_181.method_844("CURRENT_VAR_PROCESSOR");
   }

   // $FF: renamed from: a (S, bK) void
   public final void method_1028(class_54 var1, class_203 var2) {
      class_81 var10000 = new class_81;
      var10000.method_225();
      class_81 var3 = var10000;
      class_114 var4 = var10000.method_226(var1);
      HashSet var5 = new HashSet();
      Iterator var7 = var4.field_258.values().iterator();

      HashSet var6;
      List var23;
      while(var7.hasNext()) {
         var23 = (List)var7.next();
         var6 = null;
         Iterator var9 = var23.iterator();

         while(var9.hasNext()) {
            class_104 var8 = (class_104)var9.next();
            var5.add(var8.field_218);
         }
      }

      var6 = new HashSet();
      Iterator var27 = var4.field_259.values().iterator();

      while(var27.hasNext()) {
         Iterator var10 = ((List)var27.next()).iterator();

         while(var10.hasNext()) {
            class_104 var28 = (class_104)var10.next();
            var6.add(var28.field_216 + "##" + var28.field_218);
         }
      }

      HashMap var25 = new HashMap();
      this.method_1031(var1, var3, var25);
      HashMap var26 = new HashMap();
      LinkedList var29 = new LinkedList();
      LinkedList var30 = new LinkedList();
      var29.add(var4.field_257);
      var30.add(new LinkedList());
      HashMap var21;
      HashMap var24 = var21 = new HashMap();
      class_58 var10002 = new class_58;
      var10002.method_148();
      var24.put((Object)null, var10002);
      var26.put(var4.field_257, var21);

      while(!var29.isEmpty()) {
         class_148 var22 = (class_148)var29.removeFirst();
         LinkedList var11 = (LinkedList)var30.removeFirst();
         class_58 var31;
         if(var25.containsKey(var22.field_369)) {
            class_88 var12 = (class_88)var25.get(var22.field_369);
            class_58 var19 = new class_58;
            var19.method_148();
            class_58 var13 = var19;
            class_88 var20 = new class_88;
            var20.method_276(10000, var12.method_254(), var12.method_283());
            class_88 var14 = var20;
            var20.method_289();
            var23 = var13.method_150();
            class_93 var10001 = new class_93;
            var10001.method_315(var14, var12.method_261());
            var23.add(var10001);
            var13.method_151().method_491(var14.method_261());
            var31 = var13;
         } else {
            var31 = (class_58)((Map)var26.get(var22)).get(method_1029(var11));
         }

         class_48 var33 = var22.field_370;
         if(var22.field_370 != null) {
            this.method_1033(var33, var31, var2);
            var33.method_76(var31.method_150());
         }

         String var32 = var11.isEmpty()?null:(String)var11.getLast();
         Iterator var15 = var22.field_373.iterator();

         while(var15.hasNext()) {
            class_148 var34 = (class_148)var15.next();
            boolean var16 = true;
            if(var32 != null && var4.field_259.containsKey(var22.field_369)) {
               var16 = false;
               Iterator var18 = ((List)var4.field_259.get(var22.field_369)).iterator();

               while(var18.hasNext()) {
                  class_104 var17;
                  if((var17 = (class_104)var18.next()).field_216.equals(var32) && var17.field_217.equals(var34.field_369)) {
                     var16 = true;
                     break;
                  }
               }
            }

            if(var16) {
               Object var35;
               if((var35 = (Map)var26.get(var34)) == null) {
                  var26.put(var34, var35 = new HashMap());
               }

               LinkedList var37 = new LinkedList(var11);
               if(var6.contains(var22.field_369 + "##" + var34.field_369)) {
                  var37.addLast(var22.field_369);
               } else if(!var5.contains(var34.field_369) && var4.field_259.containsKey(var22.field_369)) {
                  var37.removeLast();
               }

               String var36 = method_1029(var37);
               if(!((Map)var35).containsKey(var36)) {
                  ((Map)var35).put(var36, method_1030(var31.method_149()));
                  var29.add(var34);
                  var30.add(var37);
               }
            }
         }
      }

      this.method_1032(var1);
   }

   // $FF: renamed from: a (java.util.LinkedList) java.lang.String
   private static String method_1029(LinkedList var0) {
      if(var0.isEmpty()) {
         return null;
      } else {
         StringBuilder var1 = new StringBuilder();
         Iterator var2 = var0.iterator();

         while(var2.hasNext()) {
            String var3 = (String)var2.next();
            var1.append(var3);
            var1.append(":");
         }

         return var1.toString();
      }
   }

   // $FF: renamed from: a (B) B
   private static class_58 method_1030(class_58 var0) {
      class_119 var1 = var0.method_151();

      for(int var2 = 0; var2 < var1.size(); ++var2) {
         var1.set(var2, ((class_86)var1.get(var2)).method_261());
      }

      return var0;
   }

   // $FF: renamed from: a (ca, dd, java.util.Map) void
   private void method_1031(class_46 var1, class_81 var2, Map var3) {
      List var4 = null;
      if(var1.field_13 == 12) {
         class_51 var5;
         if(!(var5 = (class_51)var1).method_107()) {
            var4 = var5.method_111();
         }
      } else if(var1.field_13 == 7) {
         var4 = ((class_50)var1).method_102();
      }

      if(var4 != null) {
         for(int var7 = 1; var7 < var1.method_63().size(); ++var7) {
            var3.put(((String[])var2.method_229().get(((class_46)var1.method_63().get(var7)).field_14))[0], (class_88)var4.get(var7 - 1));
         }
      }

      Iterator var6 = var1.method_63().iterator();

      while(var6.hasNext()) {
         class_46 var8 = (class_46)var6.next();
         this.method_1031(var8, var2, var3);
      }

   }

   // $FF: renamed from: a (ca) void
   private void method_1032(class_46 var1) {
      var1.method_45();
      Iterator var2 = var1.method_63().iterator();

      while(var2.hasNext()) {
         var1 = (class_46)var2.next();
         this.method_1032(var1);
      }

   }

   // $FF: renamed from: a (ci, B, bK) void
   private void method_1033(class_48 var1, class_58 var2, class_203 var3) {
      class_191 var10 = var1.method_94();
      class_119 var4 = var2.method_151();
      List var12 = var2.method_150();
      class_61 var11 = var10.method_925();

      for(int var5 = 0; var5 < var11.method_176(); ++var5) {
         class_5 var6;
         class_83 var8;
         class_86 var15;
         class_93 var16;
         class_86 var21;
         class_95 var23;
         class_90 var24;
         class_93 var30;
         class_93 var32;
         class_87 var39;
         class_99 var10001;
         switch((var6 = var11.method_171(var5)).field_5) {
         case 1:
            var39 = new class_87;
            var39.method_266(class_83.field_128, (Object)null);
            this.method_1034(var4, var12, var39);
         case 2:
         case 3:
         case 4:
         case 5:
         case 6:
         case 7:
         case 8:
         case 26:
         case 27:
         case 28:
         case 29:
         case 30:
         case 31:
         case 32:
         case 33:
         case 34:
         case 35:
         case 36:
         case 37:
         case 38:
         case 39:
         case 40:
         case 41:
         case 42:
         case 43:
         case 44:
         case 45:
         case 59:
         case 60:
         case 61:
         case 62:
         case 63:
         case 64:
         case 65:
         case 66:
         case 67:
         case 68:
         case 69:
         case 70:
         case 71:
         case 72:
         case 73:
         case 74:
         case 75:
         case 76:
         case 77:
         case 78:
         case 167:
         case 168:
         case 169:
         case 186:
         case 196:
         default:
            break;
         case 9:
         case 10:
            var39 = new class_87;
            var39.method_266(class_83.field_120, new Long((long)(var6.field_5 - 9)));
            this.method_1034(var4, var12, var39);
            break;
         case 11:
         case 12:
         case 13:
            var39 = new class_87;
            var39.method_266(class_83.field_119, new Float((float)(var6.field_5 - 11)));
            this.method_1034(var4, var12, var39);
            break;
         case 14:
         case 15:
            var39 = new class_87;
            var39.method_266(class_83.field_121, new Double((double)(var6.field_5 - 14)));
            this.method_1034(var4, var12, var39);
            break;
         case 16:
         case 17:
            var39 = new class_87;
            var39.method_265(var6.method_15(0), true);
            this.method_1034(var4, var12, var39);
            break;
         case 18:
         case 19:
         case 20:
            class_80 var18 = var3.method_995(var6.method_15(0));
            var39 = new class_87;
            var39.method_266(field_573[var18.field_99 - 3], var18.field_106);
            this.method_1034(var4, var12, var39);
            break;
         case 21:
         case 22:
         case 23:
         case 24:
         case 25:
            class_88 var37 = new class_88;
            var37.method_276(var6.method_15(0), field_574[var6.field_5 - 21], this.field_587);
            this.method_1034(var4, var12, var37);
            break;
         case 46:
         case 47:
         case 48:
         case 49:
         case 50:
         case 51:
         case 52:
         case 53:
            var15 = var4.method_492();
            var21 = var4.method_492();
            class_83 var19 = null;
            switch(var6.field_5) {
            case 47:
               var19 = class_83.field_120;
            case 48:
            default:
               break;
            case 49:
               var19 = class_83.field_121;
            }

            class_100 var38 = new class_100;
            var38.method_366(var21, var15, field_575[var6.field_5 - 46]);
            this.method_1035(var4, var12, var38, var19);
            break;
         case 54:
         case 55:
         case 56:
         case 57:
         case 58:
            var15 = var4.method_492();
            int var20 = var6.method_15(0);
            var32 = new class_93;
            class_88 var28 = new class_88;
            var28.method_276(var20, field_574[var6.field_5 - 54], this.field_587);
            var32.method_315(var28, var15);
            var16 = var32;
            var12.add(var16);
            break;
         case 79:
         case 80:
         case 81:
         case 82:
         case 83:
         case 84:
         case 85:
         case 86:
            var15 = var4.method_492();
            var21 = var4.method_492();
            class_86 var9 = var4.method_492();
            var32 = new class_93;
            class_100 var26 = new class_100;
            var26.method_366(var9, var21, field_575[var6.field_5 - 79]);
            var32.method_315(var26, var15);
            var16 = var32;
            var12.add(var16);
            break;
         case 87:
         case 88:
            var4.method_492();
            break;
         case 89:
            this.method_1034(var4, var12, ((class_86)var4.method_488(-1)).method_261());
            break;
         case 90:
            this.method_1036(-2, var4, var12, -1);
            break;
         case 91:
            if(((class_86)var4.method_488(-2)).method_254().field_137 == 2) {
               this.method_1036(-2, var4, var12, -1);
            } else {
               this.method_1036(-3, var4, var12, -1);
            }
            break;
         case 92:
            if(((class_86)var4.method_488(-1)).method_254().field_137 == 2) {
               this.method_1034(var4, var12, ((class_86)var4.method_488(-1)).method_261());
            } else {
               this.method_1034(var4, var12, ((class_86)var4.method_488(-2)).method_261());
               this.method_1034(var4, var12, ((class_86)var4.method_488(-2)).method_261());
            }
            break;
         case 93:
            if(((class_86)var4.method_488(-1)).method_254().field_137 == 2) {
               this.method_1036(-2, var4, var12, -1);
            } else {
               this.method_1036(-3, var4, var12, -2);
               this.method_1036(-3, var4, var12, -1);
            }
            break;
         case 94:
            if(((class_86)var4.method_488(-1)).method_254().field_137 == 2) {
               if(((class_86)var4.method_488(-2)).method_254().field_137 == 2) {
                  this.method_1036(-2, var4, var12, -1);
               } else {
                  this.method_1036(-3, var4, var12, -1);
               }
            } else if(((class_86)var4.method_488(-3)).method_254().field_137 == 2) {
               this.method_1036(-3, var4, var12, -2);
               this.method_1036(-3, var4, var12, -1);
            } else {
               this.method_1036(-4, var4, var12, -2);
               this.method_1036(-4, var4, var12, -1);
            }
            break;
         case 95:
            this.method_1036(-2, var4, var12, -1);
            var4.method_492();
            break;
         case 96:
         case 97:
         case 98:
         case 99:
         case 100:
         case 101:
         case 102:
         case 103:
         case 104:
         case 105:
         case 106:
         case 107:
         case 108:
         case 109:
         case 110:
         case 111:
         case 112:
         case 113:
         case 114:
         case 115:
            var24 = new class_90;
            var24.method_295(field_576[(var6.field_5 - 96) / 4], var4);
            this.method_1034(var4, var12, var24);
            break;
         case 116:
         case 117:
         case 118:
         case 119:
            var24 = new class_90;
            var24.method_295(13, var4);
            this.method_1034(var4, var12, var24);
            break;
         case 120:
         case 121:
         case 122:
         case 123:
         case 124:
         case 125:
         case 126:
         case 127:
         case 128:
         case 129:
         case 130:
         case 131:
            var24 = new class_90;
            var24.method_295(field_577[(var6.field_5 - 120) / 2], var4);
            this.method_1034(var4, var12, var24);
            break;
         case 132:
            class_88 var31 = new class_88;
            var31.method_276(var6.method_15(0), class_83.field_118, this.field_587);
            class_88 var17 = var31;
            var30 = new class_93;
            class_90 var10004 = new class_90;
            int var10006 = var6.method_15(1) < 0?1:0;
            class_86[] var10007 = new class_86[]{var17.method_261(), null};
            class_87 var10010 = new class_87;
            var10010.method_266(class_83.field_118, new Integer(Math.abs(var6.method_15(1))));
            var10007[1] = var10010;
            var10004.method_296(var10006, Arrays.asList(var10007));
            var30.method_315(var17, var10004);
            var12.add(var30);
            break;
         case 133:
         case 134:
         case 135:
         case 136:
         case 137:
         case 138:
         case 139:
         case 140:
         case 141:
         case 142:
         case 143:
         case 144:
         case 145:
         case 146:
         case 147:
            var24 = new class_90;
            var24.method_295(field_578[var6.field_5 - 133], var4);
            this.method_1034(var4, var12, var24);
            break;
         case 148:
         case 149:
         case 150:
         case 151:
         case 152:
            var24 = new class_90;
            var24.method_295(field_579[var6.field_5 - 148], var4);
            this.method_1034(var4, var12, var24);
            break;
         case 153:
         case 154:
         case 155:
         case 156:
         case 157:
         case 158:
            var10001 = new class_99;
            var10001.method_361(field_585[field_580[var6.field_5 - 153]], var4);
            var12.add(var10001);
            break;
         case 159:
         case 160:
         case 161:
         case 162:
         case 163:
         case 164:
         case 165:
         case 166:
            var10001 = new class_99;
            var10001.method_361(field_585[field_581[var6.field_5 - 159]], var4);
            var12.add(var10001);
            break;
         case 170:
         case 171:
            class_91 var27 = new class_91;
            var27.method_305(var4.method_492());
            var12.add(var27);
            break;
         case 172:
         case 173:
         case 174:
         case 175:
         case 176:
         case 177:
         case 191:
            class_89 var25 = new class_89;
            var25.method_290(var6.field_5 == 191?1:0, var6.field_5 == 177?null:var4.method_492(), var6.field_5 == 191?null:((class_197)class_181.method_844("CURRENT_METHOD_DESCRIPTOR")).field_520);
            var12.add(var25);
            break;
         case 178:
         case 180:
            class_92 var22 = new class_92;
            var22.method_307(var3.method_996(var6.method_15(0)), var6.field_5 == 178?null:var4.method_492());
            this.method_1034(var4, var12, var22);
            break;
         case 179:
         case 181:
            var15 = var4.method_492();
            class_92 var35 = new class_92;
            var35.method_307(var3.method_996(var6.method_15(0)), var6.field_5 == 179?null:var4.method_492());
            class_92 var13 = var35;
            var30 = new class_93;
            var30.method_315(var13, var15);
            var12.add(var30);
            break;
         case 182:
         case 183:
         case 184:
         case 185:
            class_97 var34 = new class_97;
            var34.method_338(var6.field_5, var3.method_996(var6.method_15(0)), var4);
            class_97 var14 = var34;
            if(var34.method_343().field_520.field_133 == 10) {
               var12.add(var14);
            } else {
               this.method_1034(var4, var12, var14);
            }
            break;
         case 187:
         case 189:
         case 197:
            int var7 = var6.field_5 == 187?0:(var6.field_5 == 189?1:var6.method_15(1));
            class_83 var10000 = new class_83;
            class_80 var10002 = var3.method_995(var6.method_15(0));
            var8 = null;
            var10000.method_239((String)var10002.field_106, true);
            var8 = var10000;
            if(var6.field_5 != 197) {
               var8.field_135 += var7;
            }

            var23 = new class_95;
            var23.method_322(var8, var4, var7);
            this.method_1034(var4, var12, var23);
            break;
         case 188:
            var23 = new class_95;
            class_83 var36 = new class_83;
            var36.method_236(field_584[var6.method_15(0) - 4], 1);
            var23.method_322(var36, var4, 1);
            this.method_1034(var4, var12, var23);
            break;
         case 192:
         case 193:
            class_87 var29 = new class_87;
            class_83 var10003 = new class_83;
            class_80 var10005 = var3.method_995(var6.method_15(0));
            var8 = null;
            var10003.method_239((String)var10005.field_106, true);
            var29.method_266(var10003, (Object)null);
            var4.method_491(var29);
         case 190:
            var24 = new class_90;
            var24.method_295(((Integer)field_572.get(Integer.valueOf(var6.field_5))).intValue(), var4);
            this.method_1034(var4, var12, var24);
            break;
         case 194:
         case 195:
            class_98 var33 = new class_98;
            var33.method_357(field_583[var6.field_5 - 194], var4.method_492());
            var12.add(var33);
            break;
         case 198:
         case 199:
            var10001 = new class_99;
            var10001.method_361(field_585[field_582[var6.field_5 - 198]], var4);
            var12.add(var10001);
         }
      }

   }

   // $FF: renamed from: a (bs, java.util.List, aJ) void
   private void method_1034(class_119 var1, List var2, class_86 var3) {
      this.method_1035(var1, var2, var3, (class_83)null);
   }

   // $FF: renamed from: a (bs, java.util.List, aJ, Q) void
   private void method_1035(class_119 var1, List var2, class_86 var3, class_83 var4) {
      int var5 = 10000 + var1.size();
      class_88 var10000 = new class_88;
      var10000.method_276(var5, var4 == null?var3.method_254():var4, this.field_587);
      class_88 var6 = var10000;
      var10000.method_289();
      class_93 var10001 = new class_93;
      var10001.method_315(var6, var3);
      var2.add(var10001);
      var1.method_491(var6.method_261());
   }

   // $FF: renamed from: a (int, bs, java.util.List, int) void
   private void method_1036(int var1, class_119 var2, List var3, int var4) {
      int var5 = 10000 + var2.size();
      LinkedList var6 = new LinkedList();

      class_88 var9;
      class_93 var10001;
      class_88 var10000;
      for(int var7 = -1; var7 >= var1; --var7) {
         class_86 var8 = var2.method_492();
         var10000 = new class_88;
         var10000.method_276(var5 + var7 + 1, var8.method_254(), this.field_587);
         var9 = var10000;
         var10000.method_289();
         var10001 = new class_93;
         var10001.method_315(var9, var8);
         var3.add(var10001);
         var6.add(0, (class_88)var9.method_261());
      }

      class_86 var11 = ((class_88)var6.get(var6.size() + var4)).method_261();
      var10000 = new class_88;
      var10000.method_276(var5 + var1, var11.method_254(), this.field_587);
      class_88 var12 = var10000;
      var10000.method_289();
      var10001 = new class_93;
      var10001.method_315(var12, var11);
      var3.add(var10001);
      var6.add(0, (class_88)var12.method_261());
      Iterator var10 = var6.iterator();

      while(var10.hasNext()) {
         var9 = (class_88)var10.next();
         var2.method_491(var9);
      }

   }

   // $FF: renamed from: a (Q) java.lang.String
   public static String method_1037(class_83 var0) {
      return method_1038(var0, true);
   }

   // $FF: renamed from: b (Q, boolean) java.lang.String
   private static String method_1038(class_83 var0, boolean var1) {
      int var2 = var0.field_133;
      if(var0.field_133 <= 7) {
         return field_586[var2];
      } else if(var2 == 17) {
         return "<unknown>";
      } else if(var2 == 13) {
         return "<null>";
      } else if(var2 == 10) {
         return "void";
      } else if(var2 == 8) {
         String var3 = method_1042(var0.field_136);
         if(var1) {
            var3 = class_181.method_847().method_571(var3, true);
         }

         if(var3 == null) {
            var3 = "<undefinedtype>";
         }

         return var3;
      } else {
         throw new RuntimeException("invalid type");
      }
   }

   // $FF: renamed from: b (Q) java.lang.String
   public static String method_1039(class_83 var0) {
      return method_1040(var0, true);
   }

   // $FF: renamed from: a (Q, boolean) java.lang.String
   public static String method_1040(class_83 var0, boolean var1) {
      String var3 = method_1038(var0, var1);

      for(int var2 = var0.field_135; var2-- > 0; var3 = var3 + "[]") {
         ;
      }

      return var3;
   }

   // $FF: renamed from: a (ca, int, boolean) java.lang.String
   public static String method_1041(class_46 var0, int var1, boolean var2) {
      StringBuffer var3 = new StringBuffer(var0.method_43(var1));
      List var4;
      class_124 var5;
      if((var4 = var0.method_57(1073741824)).size() == 1 && (var5 = (class_124)var4.get(0)).method_518() != 1 && var5.field_305 && var5.method_522().field_13 != 14) {
         var3.append(class_129.method_557(var1));
         switch(var5.method_518()) {
         case 4:
            var3.append("break");
         case 5:
         case 6:
         case 7:
         default:
            break;
         case 8:
            var3.append("continue");
         }

         if(var5.field_304) {
            var3.append(" label" + var5.field_303.field_14);
         }

         var3.append(";\r\n");
      }

      if(var3.length() == 0 && var2) {
         var3.append(class_129.method_557(var1) + ";\r\n");
      }

      return var3.toString();
   }

   // $FF: renamed from: a (java.lang.String) java.lang.String
   public static String method_1042(String var0) {
      String var1;
      class_198 var2;
      if((var1 = var0.replace('/', '.')).indexOf("$") >= 0 && ((var2 = class_181.method_851().method_393(var0)) == null || !var2.method_979())) {
         var1 = var1.replace('$', '.');
      }

      return var1;
   }

   // $FF: renamed from: a (java.util.List, int) java.lang.String
   public static String method_1043(List var0, int var1) {
      String var2 = class_129.method_557(var1);
      StringBuffer var3 = new StringBuffer();
      Iterator var4 = var0.iterator();

      while(var4.hasNext()) {
         String var5;
         class_86 var6;
         if((var5 = (var6 = (class_86)var4.next()).method_262(var1)).length() > 0) {
            if(var6.field_148 != 12 || !((class_88)var6).method_286()) {
               var3.append(var2);
            }

            var3.append(var5);
            if(var6.field_148 == 9 && ((class_98)var6).method_358() == 0) {
               var3.append("{}");
            }

            int var7;
            if((var7 = var6.field_148) != 11 && var7 != 9 && var7 != 7 && (var7 != 12 || !((class_88)var6).method_286())) {
               var3.append(";");
            }

            var3.append("\r\n");
         }
      }

      return var3.toString();
   }

   // $FF: renamed from: c (Q) bI
   public static class_87 method_1044(class_83 var0) {
      class_87 var1;
      class_87 var10000;
      if(var0.field_133 != 8 && var0.field_135 <= 0) {
         if(var0.field_133 == 3) {
            var10000 = new class_87;
            var10000.method_266(class_83.field_119, new Float(0.0F));
            var1 = var10000;
         } else if(var0.field_133 == 5) {
            var10000 = new class_87;
            var10000.method_266(class_83.field_120, new Long(0L));
            var1 = var10000;
         } else if(var0.field_133 == 2) {
            var10000 = new class_87;
            var10000.method_266(class_83.field_121, new Double(0.0D));
            var1 = var10000;
         } else {
            var10000 = new class_87;
            var10000.method_265(0, true);
            var1 = var10000;
         }
      } else {
         var10000 = new class_87;
         var10000.method_266(class_83.field_128, (Object)null);
         var1 = var10000;
      }

      return var1;
   }

   // $FF: renamed from: a (aJ, Q, java.lang.StringBuilder, int, boolean) boolean
   public static boolean method_1045(class_86 var0, class_83 var1, StringBuilder var2, int var3, boolean var4) {
      return method_1046(var0, var1, var2, var3, var4, false);
   }

   // $FF: renamed from: a (aJ, Q, java.lang.StringBuilder, int, boolean, boolean) boolean
   public static boolean method_1046(class_86 var0, class_83 var1, StringBuilder var2, int var3, boolean var4, boolean var5) {
      boolean var6 = false;
      class_83 var7 = var0.method_254();
      String var9 = var0.method_262(var3);
      boolean var10000 = !var1.method_242(var7) && (var7.equals(class_83.field_131) || var1.field_133 != 8);
      boolean var8 = false;
      if(!(var8 = var10000 | (var5 && !var1.equals(var7))) && var4 && var7.field_133 == 13) {
         Object var10 = null;
         var8 = !"<undefinedtype>".equals(method_1038(var1, true));
      }

      if(!var8) {
         label54: {
            if(var0.field_148 == 3) {
               switch(((class_87)var0).method_271().field_133) {
               case 0:
               case 4:
               case 6:
               case 15:
               case 16:
                  var10000 = true;
                  break label54;
               }
            }

            var10000 = false;
         }

         var8 = var10000 && class_83.field_118.method_243(var1);
      }

      if(var8) {
         if(var0.method_253() >= class_90.method_297()) {
            var9 = "(" + var9 + ")";
         }

         var9 = "(" + method_1040(var1, true) + ")" + var9;
         var6 = true;
      }

      var2.append(var9);
      return var6;
   }
}
