import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;

// $FF: renamed from: cU
public final class class_126 {

   // $FF: renamed from: <init> () void
   public void method_531() {
      super();
   }

   // $FF: renamed from: a (ca) boolean
   public static boolean method_532(class_46 var0) {
      boolean var1;
      if(var1 = method_533(var0) != 0) {
         class_172.method_787(var0);
      }

      return var1;
   }

   // $FF: renamed from: b (ca) int
   private static int method_533(class_46 var0) {
      boolean var1 = false;

      while(true) {
         boolean var2 = false;
         Iterator var4 = var0.method_63().iterator();

         while(true) {
            Iterator var3;
            if(var4.hasNext()) {
               class_46 var10000 = (class_46)var4.next();
               var3 = null;
               int var9 = method_533(var10000);
               var1 |= var9 != 0;
               if(var9 != 2) {
                  continue;
               }

               var2 = true;
            }

            if(!var2) {
               if(var0.field_13 == 5) {
                  class_47 var7;
                  boolean var10;
                  if((var7 = (class_47)var0).method_91() != 0) {
                     var10 = false;
                  } else {
                     var3 = var7.method_73().iterator();

                     while(true) {
                        if(!var3.hasNext()) {
                           class_46 var11;
                           for(var11 = var7.method_61(); var11.field_13 == 15; var11 = (class_46)var11.method_63().method_661()) {
                              ;
                           }

                           class_46 var5;
                           class_55 var12;
                           label79: {
                              if(var11.field_13 == 2 && (var12 = (class_55)var11).field_49 == 0 && var12.method_130() != null) {
                                 var5 = var12.method_130();
                                 class_124 var6;
                                 if((var6 = (class_124)var12.method_59().get(0)).method_518() == 8 && var6.field_303 == var7) {
                                    Set var13;
                                    (var13 = var7.method_56(8, 0)).remove(var11);
                                    if(var13.isEmpty() && method_534(var7, var5, var5)) {
                                       method_535(var7, var12);
                                       var10 = true;
                                       break label79;
                                    }
                                 }
                              }

                              var10 = false;
                           }

                           if(!var10) {
                              label124: {
                                 for(var11 = var7.method_61(); var11.field_13 == 15; var11 = var11.method_61()) {
                                    ;
                                 }

                                 if(var11.field_13 == 2 && (var12 = (class_55)var11).method_61().method_75().isEmpty() && var12.field_49 == 0 && var12.method_130() != null) {
                                    var5 = var12.method_130();
                                    if(method_534(var7, var5, var5)) {
                                       method_535(var7, var12);
                                       break label124;
                                    }
                                 }

                                 var10 = false;
                                 break;
                              }
                           }

                           var10 = true;
                           break;
                        }

                        class_124 var8;
                        if((var8 = (class_124)var3.next()).method_518() != 8 && var8.method_522().field_13 != 14) {
                           var10 = false;
                           break;
                        }
                     }
                  }

                  if(var10) {
                     return 2;
                  }
               }

               if(var1) {
                  return 1;
               }

               return 0;
            }
            break;
         }
      }
   }

   // $FF: renamed from: a (au, ca, ca) boolean
   private static boolean method_534(class_47 var0, class_46 var1, class_46 var2) {
      Iterator var4 = var2.method_59().iterator();

      while(var4.hasNext()) {
         class_124 var3 = (class_124)var4.next();
         if(var0.method_41(var3.method_522()) && !var1.method_41(var3.method_522())) {
            return false;
         }
      }

      var4 = var2.method_63().iterator();

      while(var4.hasNext()) {
         class_46 var5 = (class_46)var4.next();
         if(!method_534(var0, var1, var5)) {
            return false;
         }
      }

      return true;
   }

   // $FF: renamed from: a (au, G) void
   private static void method_535(class_47 var0, class_55 var1) {
      class_46 var2 = var1.method_130();
      class_124 var3 = var1.method_138();
      var1.method_131((class_46)null);
      var3.method_520().method_53(1, var3, 4);
      var3.field_303 = var0;
      var1.method_63().method_658(var2.field_14);
      var0.method_27(var3);
      class_49 var10000 = new class_49;
      var10000.method_96(Arrays.asList(new class_46[]{var0, var2}));
      class_49 var5 = var10000;
      var0.method_71().method_49(var0, var5);
      var5.method_26();
      class_124 var10001 = new class_124;
      var10001.method_516(1, var0, var2);
      var0.method_34(var10001);
      Iterator var4 = (new ArrayList(var5.method_73())).iterator();

      class_124 var6;
      while(var4.hasNext()) {
         if((var6 = (class_124)var4.next()).method_518() == 8 || var6 == var3) {
            var0.method_27(var6);
         }
      }

      var4 = var5.method_58(8).iterator();

      while(var4.hasNext()) {
         var6 = (class_124)var4.next();
         if(var0.method_42(var6.method_520())) {
            var5.method_33(var6);
            var6.method_520().method_52(1, var6, var0);
            var0.method_32(var6);
         }
      }

   }
}
