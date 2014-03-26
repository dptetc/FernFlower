import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

// $FF: renamed from: aS
public final class class_172 {

   // $FF: renamed from: <init> () void
   public void method_786() {
      super();
   }

   // $FF: renamed from: a (ca) void
   public static void method_787(class_46 var0) {
      method_788(var0);
   }

   // $FF: renamed from: c (ca) void
   private static void method_788(class_46 var0) {
      boolean var2;
      Iterator var10;
      if(((class_46)var0).field_13 == 15) {
         ArrayList var1;
         (var1 = new ArrayList()).addAll(((class_46)var0).method_63());
         var2 = false;

         for(int var3 = 0; var3 < var1.size(); ++var3) {
            class_46 var4;
            if((var4 = (class_46)var1.get(var3)).field_13 == 15) {
               method_790((class_49)var4);
               if(var3 == var1.size() - 1 || method_789(var4, (class_46)var1.get(var3 + 1))) {
                  class_46 var9 = var4.method_61();
                  Iterator var6 = var4.method_60().iterator();

                  while(var6.hasNext()) {
                     class_124 var5 = (class_124)var6.next();
                     var4.method_33(var5);
                     var5.method_520().method_52(1, var5, var9);
                     var9.method_32(var5);
                  }

                  class_46 var14;
                  class_124 var15;
                  if((var14 = (class_46)var4.method_63().method_661()).method_59().isEmpty() && var3 < var1.size() - 1) {
                     class_124 var10001 = new class_124;
                     var10001.method_516(1, var14, (class_46)var1.get(var3 + 1));
                     var14.method_34(var10001);
                  } else {
                     var10 = var14.method_59().iterator();

                     while(var10.hasNext()) {
                        var15 = (class_124)var10.next();
                        if(var3 == var1.size() - 1) {
                           if(var15.field_303 == var4) {
                              ((class_46)var0).method_27(var15);
                           }
                        } else {
                           var15.method_520().method_53(1, var15, 1);
                           var15.field_303.method_73().remove(var15);
                           var15.field_303 = null;
                        }
                     }
                  }

                  var10 = var4.method_59().iterator();

                  while(var10.hasNext()) {
                     var15 = (class_124)var10.next();
                     var4.method_35(var15);
                  }

                  var10 = (new HashSet(var4.method_73())).iterator();

                  while(var10.hasNext()) {
                     if((var15 = (class_124)var10.next()).method_520() != var14) {
                        var14.method_27(var15);
                     }
                  }

                  var1.remove(var3);
                  var1.addAll(var3, var4.method_63());
                  --var3;
                  var2 = true;
               }
            }
         }

         if(var2) {
            class_49 var10000 = new class_49;
            var10000.method_96(var1);
            class_49 var12 = var10000;
            var10000.method_26();
            ((class_46)var0).method_71().method_49((class_46)var0, var12);
            var0 = var12;
         }
      }

      class_46 var7;
      if(((class_46)var0).field_13 == 15) {
         method_790((class_49)var0);
         if(((class_46)var0).method_63().size() == 1) {
            if(!(var2 = (var7 = ((class_46)var0).method_61()).method_59().isEmpty())) {
               class_124 var13 = (class_124)var7.method_59().get(0);
               if(!(var2 = ((class_46)var0).method_59().isEmpty())) {
                  class_124 var11 = (class_124)((class_46)var0).method_59().get(0);
                  if(var2 = var13.method_522() == var11.method_522()) {
                     var7.method_35(var13);
                  }
               }
            }

            if(var2) {
               ((class_46)var0).method_71().method_49((class_46)var0, var7);
               var0 = var7;
            }
         }
      }

      while(true) {
         var10 = ((class_46)var0).method_63().iterator();

         do {
            if(!var10.hasNext()) {
               for(int var8 = 0; var8 < ((class_46)var0).method_63().size(); ++var8) {
                  method_788((class_46)((class_46)var0).method_63().get(var8));
               }

               return;
            }
         } while(!(var7 = (class_46)var10.next()).method_63().isEmpty() && var7.method_75() == null || var7.field_13 == 8);

         method_792(var7);
      }
   }

   // $FF: renamed from: a (ca, ca) boolean
   private static boolean method_789(class_46 var0, class_46 var1) {
      List var2;
      if(!(var2 = (var0 = (class_46)var0.method_63().method_661()).method_59()).isEmpty() && ((class_124)var2.get(0)).method_522() != var1) {
         return false;
      } else {
         Iterator var4 = var1.method_58(4).iterator();

         class_124 var3;
         do {
            if(!var4.hasNext()) {
               return true;
            }

            var3 = (class_124)var4.next();
         } while(var0 == var3.method_520() || var0.method_42(var3.method_520()));

         return false;
      }
   }

   // $FF: renamed from: a (cx) void
   private static void method_790(class_49 var0) {
      if(var0.method_63().size() > 1) {
         class_49 var1 = var0;

         class_46 var2;
         boolean var4;
         do {
            var2 = null;
            class_46 var3 = null;
            var4 = false;

            for(int var5 = var1.method_63().size() - 1; var5 >= 0; --var5) {
               var2 = var3;
               var3 = (class_46)var1.method_63().get(var5);
               if(var2 != null && var3.method_75() != null && !var3.method_75().isEmpty()) {
                  if(var2.method_75() != null) {
                     var2.method_75().addAll(0, var3.method_75());
                     var3.method_75().clear();
                     var4 = true;
                  } else if((var2 = method_791(var2)) != null) {
                     var2.method_75().addAll(0, var3.method_75());
                     var3.method_75().clear();
                     var4 = true;
                  }
               }
            }
         } while(var4);

         while(true) {
            boolean var6 = false;
            Iterator var8 = var0.method_63().iterator();

            while(true) {
               if(var8.hasNext()) {
                  if((var2 = (class_46)var8.next()).method_75() == null || !var2.method_75().isEmpty()) {
                     continue;
                  }

                  class_124 var7;
                  class_124 var9;
                  Iterator var10;
                  if(var2.method_59().isEmpty()) {
                     List var10000 = var2.method_58(4);
                     var9 = null;
                     if(var10000.isEmpty()) {
                        var10 = var2.method_60().iterator();

                        while(var10.hasNext()) {
                           (var7 = (class_124)var10.next()).method_520().method_35(var7);
                        }

                        var6 = true;
                     }
                  } else if((var9 = (class_124)var2.method_59().get(0)).method_518() != 32) {
                     var2.method_35(var9);
                     var10 = var2.method_60().iterator();

                     while(var10.hasNext()) {
                        var7 = (class_124)var10.next();
                        if(var9.method_518() != 1) {
                           var7.method_520().method_53(1, var7, var9.method_518());
                        }

                        var2.method_33(var7);
                        var7.method_520().method_52(1, var7, var9.method_522());
                        var9.method_522().method_32(var7);
                        if(var9.field_303 != null) {
                           var9.field_303.method_27(var7);
                        }
                     }

                     var6 = true;
                  }

                  if(!var6) {
                     continue;
                  }

                  var0.method_63().method_658(var2.field_14);
               }

               if(!var6) {
                  var0.method_62((class_46)var0.method_63().get(0));
                  return;
               }
               break;
            }
         }
      }
   }

   // $FF: renamed from: d (ca) ca
   private static class_46 method_791(class_46 var0) {
      if(var0.method_75() != null) {
         return var0;
      } else {
         switch(var0.field_13) {
         case 2:
         case 6:
         case 10:
         case 15:
            return method_791(var0.method_61());
         default:
            return null;
         }
      }
   }

   // $FF: renamed from: b (ca) void
   public static void method_792(class_46 var0) {
      method_793(var0, false);
      class_48 var10000 = new class_48;
      class_191 var10002 = new class_191;
      var10002.method_910(class_181.method_853().method_814(0));
      var10000.method_93(var10002);
      class_48 var1 = var10000;
      if(var0.method_75() == null) {
         var1.method_76(new ArrayList());
      } else {
         var1.method_76(class_150.method_698(var0.method_75()));
      }

      var0.method_71().method_49(var0, var1);
   }

   // $FF: renamed from: a (ca, boolean) void
   public static void method_793(class_46 var0, boolean var1) {
      Iterator var3 = var0.method_63().iterator();

      class_124 var2;
      while(var3.hasNext()) {
         class_46 var10000 = (class_46)var3.next();
         var2 = null;
         method_793(var10000, true);
      }

      var0.method_63().clear();
      if(var1) {
         var3 = var0.method_59().iterator();

         while(var3.hasNext()) {
            var2 = (class_124)var3.next();
            var0.method_35(var2);
         }
      }

   }
}
