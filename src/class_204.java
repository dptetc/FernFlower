import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// $FF: renamed from: bP
public final class class_204 {

   // $FF: renamed from: <init> () void
   public void method_999() {
      super();
   }

   // $FF: renamed from: a (v) void
   public static void method_1000(class_109 var0) {
      class_120 var1;
      class_109 var13;
      if((var1 = var0.method_410("<clinit>", "()V")) != null && var1.field_277 != null) {
         var13 = var0;
         class_54 var3 = var1.field_277;
         class_198 var4 = var0.method_411();
         class_46 var5;
         if((var5 = method_1004(var3)) != null) {
            while(!var5.method_75().isEmpty()) {
               class_86 var6 = (class_86)var5.method_75().get(0);
               boolean var7 = false;
               class_93 var8;
               class_92 var9;
               if(var6.field_148 == 2 && (var8 = (class_93)var6).method_316().field_148 == 5 && (var9 = (class_92)var8.method_316()).method_312() && var9.method_309().equals(var4.field_528)) {
                  String var24 = class_129.method_562(var9.method_313(), var9.method_310());
                  if(!var13.method_414().method_662(var24)) {
                     var13.method_414().method_655(var8.method_317(), var24);
                     var5.method_75().remove(0);
                     var7 = true;
                  }
               }

               if(!var7) {
                  break;
               }
            }
         }
      }

      var13 = var0;
      class_198 var14 = var0.method_411();
      boolean var15 = ((class_177)class_181.method_855().method_588().get(var14.field_528)).field_435 == 2;
      ArrayList var16 = new ArrayList();
      ArrayList var17 = new ArrayList();
      Iterator var20 = var0.method_412().iterator();

      label127:
      while(true) {
         class_86 var26;
         if(!var20.hasNext()) {
            if(!var16.isEmpty()) {
               while(true) {
                  String var18 = null;
                  class_86 var23 = null;

                  for(int var21 = 0; var21 < var16.size(); ++var21) {
                     List var25;
                     if((var25 = (List)var16.get(var21)).size() < (var15?1:2)) {
                        break label127;
                     }

                     var26 = (class_86)var25.get(var15?0:1);
                     boolean var10 = false;
                     class_93 var28;
                     if(var26.field_148 == 2 && (var28 = (class_93)var26).method_316().field_148 == 5) {
                        class_92 var11;
                        String var12 = class_129.method_562((var11 = (class_92)var28.method_316()).method_313(), var11.method_310());
                        if(!var11.method_312() && var11.method_309().equals(var14.field_528) && var13.method_411().method_977().method_662(var12) && method_1003(var28.method_317(), (class_120)var17.get(var21))) {
                           if(var18 == null) {
                              var18 = var12;
                              var23 = var28.method_317();
                           } else if(!var18.equals(var12) || !var23.equals(var28.method_317())) {
                              break label127;
                           }

                           var10 = true;
                        }
                     }

                     if(!var10) {
                        break label127;
                     }
                  }

                  if(var13.method_415().method_662(var18)) {
                     break label127;
                  }

                  var13.method_415().method_655(var23, var18);
                  Iterator var27 = var16.iterator();

                  while(var27.hasNext()) {
                     ((List)var27.next()).remove(var15?0:1);
                  }
               }
            }
            break;
         }

         class_120 var19 = (class_120)var20.next();
         if("<init>".equals(var19.field_279.method_549()) && var19.field_277 != null) {
            class_46 var22;
            if((var22 = method_1004(var19.field_277)) == null || var22.method_75().isEmpty()) {
               break;
            }

            var16.add(var22.method_75());
            var17.add(var19);
            var26 = (class_86)var22.method_75().get(0);
            if(!var15 && (var26.field_148 != 8 || !method_1005((class_97)var26, var19, var13, false))) {
               break;
            }
         }
      }

      method_1001(var0);
      if(class_181.method_846("hes")) {
         method_1002(var0);
      }

   }

   // $FF: renamed from: b (v) void
   private static void method_1001(class_109 var0) {
      Iterator var2 = var0.method_412().iterator();

      while(var2.hasNext()) {
         class_120 var1 = (class_120)var2.next();
         if("<init>".equals(var1.field_279.method_549()) && var1.field_277 != null) {
            class_46 var3;
            if((var3 = method_1004(var1.field_277)) == null) {
               return;
            }

            int var4 = 0;

            List var8;
            for(Iterator var6 = (var8 = var3.method_75()).iterator(); var6.hasNext(); ++var4) {
               class_86 var5 = (class_86)var6.next();
               boolean var7 = false;
               if(var5.field_148 == 2) {
                  class_93 var9;
                  class_168 var10;
                  class_92 var11;
                  if((var9 = (class_93)var5).method_316().field_148 == 5 && var9.method_317().field_148 == 12 && (var11 = (class_92)var9.method_316()).method_309().equals(var0.method_411().field_528) && (var10 = var0.method_411().method_967(var11.method_313(), var11.method_310())) != null && (var10.field_423 & 16) != 0) {
                     var7 = true;
                  }
               } else if(var4 > 0 && var5.field_148 == 8 && method_1005((class_97)var5, var1, var0, true)) {
                  var8.add(0, (class_86)var8.remove(var4));
                  var7 = true;
               }

               if(!var7) {
                  break;
               }
            }
         }
      }

   }

   // $FF: renamed from: c (v) void
   private static void method_1002(class_109 var0) {
      Iterator var2 = var0.method_412().iterator();

      while(true) {
         class_120 var1;
         do {
            do {
               if(!var2.hasNext()) {
                  return;
               }

               var1 = (class_120)var2.next();
            } while(!"<init>".equals(var1.field_279.method_549()));
         } while(var1.field_277 == null);

         class_46 var3;
         if((var3 = method_1004(var1.field_277)) == null || var3.method_75().isEmpty()) {
            return;
         }

         class_86 var4;
         class_97 var5;
         if((var4 = (class_86)var3.method_75().get(0)).field_148 == 8 && method_1005(var5 = (class_97)var4, var1, var0, false) && var5.method_341().isEmpty()) {
            var3.method_75().remove(0);
         }
      }
   }

   // $FF: renamed from: a (aJ, cX) boolean
   private static boolean method_1003(class_86 var0, class_120 var1) {
      List var2;
      (var2 = var0.method_258(true)).add(var0);
      Iterator var5 = var2.iterator();

      while(var5.hasNext()) {
         switch((var0 = (class_86)var5.next()).field_148) {
         case 5:
            return false;
         case 12:
            class_77 var10000 = new class_77;
            var10000.method_216((class_88)var0);
            class_77 var3 = var10000;
            String var4;
            if(!var1.field_278.method_758().contains(var3) && !(var4 = var1.field_278.method_753(var3)).equals("this") && !var4.endsWith(".this")) {
               return false;
            }
         }
      }

      return true;
   }

   // $FF: renamed from: a (ca) ca
   private static class_46 method_1004(class_46 var0) {
      if(var0.method_75() != null) {
         return var0;
      } else if(var0.method_69()) {
         return null;
      } else {
         switch(var0.field_13) {
         case 2:
         case 6:
         case 10:
         case 13:
         case 15:
            return method_1004(var0.method_61());
         default:
            return null;
         }
      }
   }

   // $FF: renamed from: a (cR, cX, v, boolean) boolean
   private static boolean method_1005(class_97 var0, class_120 var1, class_109 var2, boolean var3) {
      if(var0.method_347() == 2 && var0.method_349().field_148 == 12) {
         class_88 var4 = (class_88)var0.method_349();
         class_77 var10000 = new class_77;
         var10000.method_216(var4);
         class_77 var5 = var10000;
         if((String)var1.field_278.method_757().get(var5) != null && (var3 || !var2.method_411().field_528.equals(var0.method_345()))) {
            return true;
         }
      }

      return false;
   }
}
