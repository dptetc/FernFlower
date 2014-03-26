import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

// $FF: renamed from: a
public final class class_103 {

   // $FF: renamed from: a Q
   private static final class_83 field_215;


   // $FF: renamed from: <clinit> () void
   static void method_382() {
      class_83 var10000 = new class_83;
      var10000.method_237(8, 0, "java/lang/AssertionError");
      field_215 = var10000;
   }

   // $FF: renamed from: <init> () void
   public void method_383() {
      super();
   }

   // $FF: renamed from: a (v) void
   public static void method_384(class_109 var0) {
      class_109 var1 = var0;
      boolean var2 = class_181.method_846("nns");
      Iterator var4 = var0.method_411().method_977().iterator();

      class_168 var3;
      class_168 var10000;
      while(true) {
         if(!var4.hasNext()) {
            var10000 = null;
            break;
         }

         String var5 = class_129.method_562((var3 = (class_168)var4.next()).method_775(), var3.method_774());
         if(var1.method_414().method_662(var5)) {
            int var6 = var3.field_423;
            boolean var7 = (var3.field_423 & 4096) != 0 || var3.method_772().method_662("Synthetic");
            if((var6 & 8) != 0 && (var6 & 16) != 0 && (var7 || var2)) {
               class_206 var15 = class_206.method_1009(var3.method_774());
               class_86 var12;
               class_97 var13;
               class_90 var14;
               if(class_83.field_125.equals(var15.field_559) && (var12 = (class_86)var1.method_414().method_659(var5)).field_148 == 6 && (var14 = (class_90)var12).method_301() == 12 && ((class_86)var14.method_303().get(0)).field_148 == 8 && (var13 = (class_97)var14.method_303().get(0)).method_349() != null && var13.method_349().field_148 == 3 && "desiredAssertionStatus".equals(var13.method_353()) && "java/lang/Class".equals(var13.method_345()) && var13.method_341().isEmpty()) {
                  class_87 var16 = (class_87)var13.method_349();
                  if(class_83.field_130.equals(var16.method_271()) && var1.method_411().field_528.equals(var16.method_273())) {
                     var10000 = var3;
                     break;
                  }
               }
            }
         }
      }

      class_168 var8 = var10000;
      if(var10000 != null) {
         String var9 = class_129.method_562(var8.method_775(), var8.method_774());
         var2 = false;
         var4 = var0.method_412().iterator();

         while(var4.hasNext()) {
            class_120 var10 = (class_120)var4.next();
            var3 = null;
            class_54 var11;
            if((var11 = var10.field_277) != null) {
               var2 |= method_385(var11, var0.method_411().field_528, var9);
            }
         }

         if(var2) {
            var0.method_413().add(var9);
         }
      }

   }

   // $FF: renamed from: a (ca, java.lang.String, java.lang.String) boolean
   private static boolean method_385(class_46 var0, String var1, String var2) {
      boolean var3 = false;

      class_46 var4;
      for(Iterator var5 = var0.method_63().iterator(); var5.hasNext(); var3 |= method_385(var4, var1, var2)) {
         var4 = (class_46)var5.next();
      }

      boolean var19 = true;

      while(var19) {
         var19 = false;
         Iterator var6 = var0.method_63().iterator();

         while(true) {
            if(var6.hasNext()) {
               class_46 var20;
               if((var20 = (class_46)var6.next()).field_13 != 2) {
                  continue;
               }

               class_55 var7 = (class_55)var20;
               class_46 var10000 = var7.method_130();
               class_46 var10 = null;
               var10 = var10000;
               class_97 var18;
               if(var10000 != null && var10.method_75() != null && var10.method_75().size() == 1) {
                  label75: {
                     class_89 var26;
                     class_86 var29;
                     if((var29 = (class_86)var10.method_75().get(0)).field_148 == 4 && (var26 = (class_89)var29).method_291() == 1 && var26.method_292().field_148 == 10) {
                        class_95 var28 = (class_95)var26.method_292();
                        if(field_215.equals(var28.method_329()) && var28.method_326() != null) {
                           var18 = var28.method_326();
                           break label75;
                        }
                     }

                     var18 = null;
                  }
               } else {
                  var18 = null;
               }

               class_97 var31 = var18;
               boolean var13;
               if(var18 == null) {
                  var13 = false;
               } else {
                  Object[] var8;
                  if(!((Boolean)(var8 = method_386(var7.method_135().method_364().method_261(), var1, var2))[1]).booleanValue()) {
                     var13 = false;
                  } else {
                     ArrayList var9 = new ArrayList();
                     class_90 var11 = null;
                     class_86 var12 = null;
                     if(var8[0] != null) {
                        class_90 var16 = new class_90;
                        var16.method_296(12, Arrays.asList(new class_86[]{(class_86)var8[0]}));
                        var11 = var16;
                        var12 = class_127.method_540(var16);
                     }

                     var9.add(var12 == null?var11:var12);
                     if(!var31.method_341().isEmpty()) {
                        var9.add((class_86)var31.method_341().get(0));
                     }

                     class_94 var17 = new class_94;
                     var17.method_321(var9);
                     class_94 var22 = var17;
                     class_48 var14 = new class_48;
                     class_191 var10002 = new class_191;
                     var10002.method_910(class_181.method_853().method_814(0));
                     var14.method_93(var10002);
                     Object var23 = var14;
                     var14.method_76(Arrays.asList(new class_86[]{var22}));
                     class_46 var21 = var7.method_61();
                     if(var7.field_49 == class_55.field_48 || var21.method_75() != null && !var21.method_75().isEmpty()) {
                        var21.method_35(var7.method_138());
                        var21.method_35(var7.method_139());
                        ArrayList var32 = new ArrayList();
                        if(var21.method_75() != null && !var21.method_75().isEmpty()) {
                           var32.add(var21);
                        }

                        var32.add(var23);
                        if(var7.field_49 == class_55.field_48) {
                           var32.add(var7.method_128());
                        }

                        class_49 var15 = new class_49;
                        var15.method_96(var32);
                        class_49 var24 = var15;
                        var15.method_26();

                        for(int var25 = 0; var25 < var24.method_63().size() - 1; ++var25) {
                           var10000 = (class_46)var24.method_63().get(var25);
                           class_124 var10001 = new class_124;
                           var10001.method_516(1, (class_46)var24.method_63().get(var25), (class_46)var24.method_63().get(var25 + 1));
                           var10000.method_34(var10001);
                        }

                        if(var7.field_49 == class_55.field_48) {
                           var10000 = var7.method_128();
                           var9 = null;
                           class_124 var27;
                           List var30;
                           if(!(var30 = var10000.method_59()).isEmpty() && (var27 = (class_124)var30.get(0)).field_303 == var7) {
                              var24.method_27(var27);
                           }
                        }

                        var23 = var24;
                     }

                     ((class_46)var23).method_74().addAll(var7.method_74());
                     var0.method_49(var7, (class_46)var23);
                     var13 = true;
                  }
               }

               if(!var13) {
                  continue;
               }

               var19 = true;
            }

            var3 |= var19;
            break;
         }
      }

      return var3;
   }

   // $FF: renamed from: a (aJ, java.lang.String, java.lang.String) java.lang.Object[]
   private static Object[] method_386(class_86 var0, String var1, String var2) {
      if(var0.field_148 == 6) {
         class_90 var3;
         if((var3 = (class_90)var0).method_301() == 48) {
            int var4;
            class_86 var5;
            for(var4 = 0; var4 < 2; ++var4) {
               class_86 var10000 = (class_86)var3.method_303().get(var4);
               var5 = null;
               if(method_387(var10000, var1, var2)) {
                  return new Object[]{var3.method_303().get(1 - var4), Boolean.valueOf(true)};
               }
            }

            for(var4 = 0; var4 < 2; ++var4) {
               Object[] var6;
               if(((Boolean)(var6 = method_386(var5 = (class_86)var3.method_303().get(var4), var1, var2))[1]).booleanValue()) {
                  if(var5 != var6[0]) {
                     var3.method_303().set(var4, (class_86)var6[0]);
                  }

                  return new Object[]{var3, Boolean.valueOf(true)};
               }
            }
         } else if(method_387(var3, var1, var2)) {
            return new Object[]{null, Boolean.valueOf(true)};
         }
      }

      return new Object[]{var0, Boolean.valueOf(false)};
   }

   // $FF: renamed from: b (aJ, java.lang.String, java.lang.String) boolean
   private static boolean method_387(class_86 var0, String var1, String var2) {
      class_90 var3;
      if(var0.field_148 == 6 && (var3 = (class_90)var0).method_301() == 12 && ((class_86)var3.method_303().get(0)).field_148 == 5) {
         class_92 var4 = (class_92)var3.method_303().get(0);
         if(var1.equals(var4.method_309()) && var2.equals(class_129.method_562(var4.method_313(), var4.method_310()))) {
            return true;
         }
      }

      return false;
   }
}
