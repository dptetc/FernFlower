import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

// $FF: renamed from: cO
public final class class_127 {

   // $FF: renamed from: a int[]
   private static final int[] field_306;
   // $FF: renamed from: b java.util.HashMap
   private static final HashMap field_307;


   // $FF: renamed from: <clinit> () void
   static void method_536() {
      field_306 = new int[]{43, 42, 45, 44, 47, 46, 49, 48};
      (field_307 = new HashMap()).put(Integer.valueOf(42), new Integer[]{Integer.valueOf(44), Integer.valueOf(42), Integer.valueOf(46)});
      field_307.put(Integer.valueOf(43), new Integer[]{Integer.valueOf(45), Integer.valueOf(43), Integer.valueOf(47)});
      field_307.put(Integer.valueOf(46), new Integer[]{Integer.valueOf(45), Integer.valueOf(46), null});
      field_307.put(Integer.valueOf(45), new Integer[]{null, Integer.valueOf(45), Integer.valueOf(46)});
      field_307.put(Integer.valueOf(44), new Integer[]{null, Integer.valueOf(44), Integer.valueOf(47)});
      field_307.put(Integer.valueOf(47), new Integer[]{Integer.valueOf(44), Integer.valueOf(47), null});
   }

   // $FF: renamed from: <init> () void
   public void method_537() {
      super();
   }

   // $FF: renamed from: a (ca) boolean
   public static boolean method_538(class_46 var0) {
      if(var0.method_75() == null && var0.field_13 == 2) {
         class_55 var1;
         class_46 var2 = (var1 = (class_55)var0).method_130();
         if(var1.field_49 == class_55.field_48 && var2.method_75() != null && var2.method_75().isEmpty() && (var2.method_59().isEmpty() || !((class_124)var2.method_59().get(0)).field_305)) {
            var1.method_63().method_658(var2.field_14);
            var1.field_49 = 0;
            var1.method_131(var1.method_128());
            var1.method_129((class_46)null);
            if(var1.method_59().isEmpty() && !var2.method_59().isEmpty()) {
               class_124 var8 = (class_124)var2.method_59().get(0);
               var2.method_35(var8);
               var8.method_521(var1);
               if(var8.field_303 != null) {
                  var1.method_71().method_27(var8);
               }

               var1.method_34(var8);
            }

            var1.method_61().method_35(var1.method_138());
            var1.method_137(var1.method_139());
            var1.method_136((class_124)null);
            var1.method_133(!var1.method_132());
            var1.method_134().set(0, ((class_99)var1.method_135().method_261()).method_363());
            return true;
         }
      }

      boolean var6 = true;

      while(var6) {
         var6 = false;
         ArrayList var7 = new ArrayList(var0.method_75() == null?var0.method_44():var0.method_75());

         for(int var3 = 0; var3 < var7.size(); ++var3) {
            Object var4;
            if((var4 = var7.get(var3)) instanceof class_46) {
               if(method_538((class_46)var4)) {
                  var6 = true;
                  break;
               }
            } else {
               class_86 var5;
               if(var4 instanceof class_86 && (var5 = method_539((class_86)var4)) != null) {
                  if(var0.method_75() == null) {
                     var0.method_46((class_86)var4, var5);
                  } else {
                     var0.method_75().set(var3, var5);
                  }

                  var6 = true;
                  break;
               }
            }
         }
      }

      return false;
   }

   // $FF: renamed from: b (aJ) aJ
   private static class_86 method_539(class_86 var0) {
      class_90 var1;
      class_86 var4;
      class_90 var5;
      class_87 var6;
      class_86 var12;
      class_90 var10000;
      if(var0.field_148 == 6) {
         switch((var1 = (class_90)var0).method_301()) {
         case 12:
            if((var12 = method_540(var1)) != null) {
               return var12;
            }
            break;
         case 42:
         case 43:
         case 44:
         case 45:
         case 46:
         case 47:
            class_86 var3 = (class_86)var1.method_303().get(0);
            var4 = (class_86)var1.method_303().get(1);
            if(var3.field_148 == 3) {
               var4 = var3;
               var3 = (class_86)var1.method_303().get(1);
            }

            if(var3.field_148 == 6 && var4.field_148 == 3) {
               var5 = (class_90)var3;
               var6 = (class_87)var4;
               int var2;
               if((var2 = var5.method_301()) == 37 || var2 == 39 || var2 == 38 || var2 == 41 || var2 == 40) {
                  int var7 = -1;
                  Integer[] var8;
                  int var9;
                  Integer var10;
                  if((var8 = (Integer[])field_307.get(Integer.valueOf(var1.method_301()))) != null && (var9 = var6.method_274() + 1) >= 0 && var9 <= 2 && (var10 = var8[var9]) != null) {
                     var7 = var10.intValue();
                  }

                  if(var7 >= 0) {
                     var10000 = new class_90;
                     var10000.method_296(var7, var5.method_303());
                     return var10000;
                  }
               }
            }
         }
      }

      boolean var11 = true;

      while(var11) {
         var11 = false;
         Iterator var17 = var0.method_260().iterator();

         while(var17.hasNext()) {
            if((var4 = method_539(var12 = (class_86)var17.next())) != null) {
               var0.method_263(var12, var4);
               var11 = true;
               break;
            }
         }
      }

      class_90 var13;
      class_86 var22;
      switch(var0.field_148) {
      case 2:
         class_93 var25;
         var22 = (var25 = (class_93)var0).method_317();
         class_86 var28 = var25.method_316();
         if(var22.field_148 == 6) {
            var13 = (class_90)var22;
            class_83 var32 = null;
            if(var13.method_301() >= 14 && var13.method_301() <= 28) {
               var22 = (class_86)var13.method_303().get(0);
               var32 = var13.method_298();
               if(var22.field_148 != 6) {
                  return null;
               }

               var13 = (class_90)var22;
            }

            List var29 = var13.method_303();
            class_86 var15 = null;
            switch(var13.method_301()) {
            case 0:
            case 4:
            case 5:
            case 6:
               if(var28.equals(var29.get(1))) {
                  var15 = (class_86)var29.get(0);
                  break;
               }
            case 1:
            case 2:
            case 3:
            case 7:
            case 8:
            case 9:
            case 10:
               if(var28.equals(var29.get(0))) {
                  var15 = (class_86)var29.get(1);
               }
            }

            if(var15 != null && (var32 == null || var32.equals(var15.method_254()))) {
               var25.method_318(var15);
               var25.method_320(var13.method_301());
            }
         }
      case 3:
      case 4:
      case 5:
      case 7:
      default:
         break;
      case 6:
         List var19 = (var13 = (class_90)var0).method_303();
         int var21;
         class_87 var20;
         int var24;
         class_87 var34;
         switch(var13.method_301()) {
         case 6:
            for(var21 = 0; var21 < 2; ++var21) {
               class_83 var26 = (var22 = (class_86)var19.get(var21)).method_254();
               if(var22.field_148 == 3 && var26.field_133 != 7) {
                  var20 = (class_87)var22;
                  long var31;
                  if(var26.field_133 == 5) {
                     var31 = ((Long)var20.method_273()).longValue();
                  } else {
                     var31 = (long)((Integer)var20.method_273()).intValue();
                  }

                  if(var31 == -1L) {
                     ArrayList var14;
                     (var14 = new ArrayList()).add((class_86)var19.get(1 - var21));
                     var10000 = new class_90;
                     var10000.method_296(11, var14);
                     return var10000;
                  }
               }
            }

            return null;
         case 12:
            if(((class_86)var19.get(0)).field_148 == 3) {
               int var33 = ((class_87)var19.get(0)).method_274();
               boolean var23 = false;
               if(var33 == 0) {
                  var34 = new class_87;
                  var34.method_266(class_83.field_125, new Integer(1));
                  return var34;
               }

               var34 = new class_87;
               var34.method_266(class_83.field_125, new Integer(0));
               return var34;
            }

            return null;
         case 36:
            var4 = (class_86)var19.get(1);
            var22 = (class_86)var19.get(2);
            if(var4.field_148 == 3 && var22.field_148 == 3) {
               var6 = (class_87)var4;
               var20 = (class_87)var22;
               if(var6.method_254().field_133 == 7 && var20.method_254().field_133 == 7) {
                  if(var6.method_274() == 0 && var20.method_274() != 0) {
                     var10000 = new class_90;
                     var10000.method_296(12, Arrays.asList(new class_86[]{(class_86)var19.get(0)}));
                     return var10000;
                  }

                  if(var6.method_274() != 0 && var20.method_274() == 0) {
                     return (class_86)var19.get(0);
                  }

                  return null;
               }
            }

            return null;
         case 37:
         case 38:
         case 39:
         case 40:
         case 41:
            var24 = class_181.method_853().method_814(2);
            class_83 var18 = ((class_86)var19.get(0)).method_254();
            class_164 var27 = (class_164)class_181.method_844("CURRENT_VAR_PROCESSOR");
            var10000 = new class_90;
            class_86[] var10003 = new class_86[3];
            class_90 var10006 = new class_90;
            class_86[] var10009 = new class_86[2];
            class_88 var10012 = new class_88;
            var10012.method_276(var24, var18, var27);
            var10009[0] = var10012;
            var10009[1] = class_87.method_270(var18.field_133);
            var10006.method_296(44, Arrays.asList(var10009));
            var10003[0] = var10006;
            class_87 var36 = new class_87;
            var36.method_266(class_83.field_118, new Integer(-1));
            var10003[1] = var36;
            var36 = new class_87;
            var36.method_266(class_83.field_118, new Integer(1));
            var10003[2] = var36;
            var10000.method_296(36, Arrays.asList(var10003));
            class_90 var30 = var10000;
            var10000 = new class_90;
            var10003 = new class_86[2];
            class_93 var37 = new class_93;
            class_88 var10008 = new class_88;
            var10008.method_276(var24, var18, var27);
            class_90 var35 = new class_90;
            var35.method_296(1, Arrays.asList(new class_86[]{(class_86)var19.get(0), (class_86)var19.get(1)}));
            var37.method_315(var10008, var35);
            var10003[0] = var37;
            var10003[1] = class_87.method_270(var18.field_133);
            var10000.method_296(42, Arrays.asList(var10003));
            var1 = var10000;
            class_77 var10001 = new class_77;
            var10001.method_214(var24, 0);
            var27.method_752(var10001, var18);
            var10000 = new class_90;
            var10003 = new class_86[]{var1, null, null};
            var36 = new class_87;
            var36.method_266(class_83.field_118, new Integer(0));
            var10003[1] = var36;
            var10003[2] = var30;
            var10000.method_296(36, Arrays.asList(var10003));
            return var10000;
         case 42:
         case 43:
            if(((class_86)var19.get(0)).method_254().field_133 == 7 && ((class_86)var19.get(1)).method_254().field_133 == 7) {
               for(var21 = 0; var21 < 2; ++var21) {
                  if(((class_86)var19.get(var21)).field_148 == 3) {
                     var34 = (class_87)var19.get(var21);
                     var5 = null;
                     var24 = ((Integer)var34.method_273()).intValue();
                     if((var13.method_301() != 42 || var24 != 1) && (var13.method_301() != 43 || var24 != 0)) {
                        ArrayList var16;
                        (var16 = new ArrayList()).add((class_86)var19.get(1 - var21));
                        var10000 = new class_90;
                        var10000.method_296(12, var16);
                        return var10000;
                     }

                     return (class_86)var19.get(1 - var21);
                  }
               }
            }

            return null;
         default:
            return null;
         }
      case 8:
         var12 = class_134.method_581(var0);
         if(!var0.equals(var12)) {
            return var12;
         }
      }

      return null;
   }

   // $FF: renamed from: a (aJ) aJ
   public static class_86 method_540(class_86 var0) {
      class_90 var6;
      if(var0.field_148 == 6 && (var6 = (class_90)var0).method_301() == 12 && (var0 = (class_86)var6.method_303().get(0)).field_148 == 6) {
         int var1;
         switch(var1 = (var6 = (class_90)var0).method_301()) {
         case 12:
            class_86 var7;
            if((var7 = method_540(var0 = (class_86)var6.method_303().get(0))) == null) {
               return var0;
            }

            return var7;
         case 48:
         case 49:
            List var2 = var6.method_303();

            for(int var3 = 0; var3 < var2.size(); ++var3) {
               class_90 var10000 = new class_90;
               var10000.method_296(12, Arrays.asList(new class_86[]{(class_86)var2.get(var3)}));
               class_90 var4 = var10000;
               class_86 var5 = method_540(var10000);
               var2.set(var3, var5 == null?var4:var5);
            }
         case 42:
         case 43:
         case 44:
         case 45:
         case 46:
         case 47:
            var6.method_302(field_306[var1 - 42]);
            return var6;
         }
      }

      return null;
   }
}
