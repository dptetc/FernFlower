import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// $FF: renamed from: aB
public final class class_180 {

   // $FF: renamed from: <init> () void
   public void method_834() {
      super();
   }

   // $FF: renamed from: a (S) boolean
   public static boolean method_835(class_54 var0) {
      boolean var1;
      if(var1 = method_836(var0)) {
         class_172.method_787(var0);
      }

      return var1;
   }

   // $FF: renamed from: a (ca) boolean
   private static boolean method_836(class_46 var0) {
      boolean var1 = false;

      class_46 var2;
      for(Iterator var3 = var0.method_63().iterator(); var3.hasNext(); var1 |= method_836(var2)) {
         var2 = (class_46)var3.next();
      }

      if(var0.field_13 == 15) {
         class_49 var14 = (class_49)var0;

         for(int var15 = 1; var15 < var14.method_63().size(); ++var15) {
            class_46 var5;
            class_49 var11;
            class_124 var17;
            boolean var16;
            class_46 var10000;
            label100: {
               var11 = var14;
               var5 = (class_46)var14.method_63().get(var15);
               var10000 = (class_46)var14.method_63().get(var15 - 1);
               List var6 = null;
               if(!var10000.method_70() && (var6 = var5.method_58(4)).size() == 1) {
                  class_124 var7;
                  class_46 var9 = (var17 = var7 = (class_124)var6.get(0)).method_520();
                  class_46 var19 = var17.method_522();

                  while(true) {
                     class_46 var10;
                     if((var10 = var9.method_71()).method_42(var19)) {
                        var16 = true;
                        break;
                     }

                     if(var10.field_13 != 7 && var10.field_13 != 12) {
                        if(var10.field_13 == 10 && var10.method_63().get(1) == var9) {
                           var16 = false;
                           break;
                        }
                     } else if(var10.method_61() == var9) {
                        var16 = false;
                        break;
                     }

                     var9 = var10;
                  }

                  if(var16) {
                     if(var7.field_305) {
                        var16 = true;
                        break label100;
                     }

                     int var8 = var15;

                     while(true) {
                        if(var8 >= var11.method_63().size()) {
                           var16 = true;
                           break label100;
                        }

                        if(!method_837((class_46)var11.method_63().get(var8), var11)) {
                           break;
                        }

                        ++var8;
                     }
                  }
               }

               var16 = false;
            }

            if(var16) {
               int var4 = var15;
               var11 = var14;
               var5 = (class_46)var14.method_63().get(var15);
               var10000 = (class_46)var14.method_63().get(var15 - 1);
               var10000.method_35((class_124)var10000.method_59().get(0));
               class_46 var18;
               class_46 var21 = (var18 = (var17 = (class_124)var5.method_58(4).get(0)).method_520()).method_71();
               var18.method_35(var17);
               ArrayList var20 = new ArrayList();

               for(int var23 = var14.method_63().size() - 1; var23 >= var4; --var23) {
                  var20.add(0, (class_46)var11.method_63().remove(var23));
               }

               class_49 var13;
               if(var21.field_13 == 2 && ((class_55)var21).field_49 == 0 && var18 == var21.method_61()) {
                  class_55 var26 = (class_55)var21;
                  var13 = new class_49;
                  var13.method_96(var20);
                  class_49 var22 = var13;
                  var13.method_26();
                  class_124 var12 = new class_124;
                  var12.method_516(1, var18, var22);
                  class_124 var27 = var12;
                  var18.method_34(var27);
                  var26.method_137(var27);
                  var26.method_131(var22);
                  var26.method_63().method_655(var22, var22.field_14);
                  var22.method_72(var26);
               } else {
                  var20.add(0, var18);
                  var13 = new class_49;
                  var13.method_96(var20);
                  class_49 var24 = var13;
                  var13.method_26();
                  var21.method_49(var18, var24);
                  Iterator var25 = var24.method_58(8).iterator();

                  while(var25.hasNext()) {
                     var17 = (class_124)var25.next();
                     var24.method_33(var17);
                     var17.method_520().method_52(1, var17, var18);
                     var18.method_32(var17);
                     var18.method_27(var17);
                  }

                  if(var21.field_13 == 6) {
                     ((class_53)var21).method_117();
                  }

                  class_124 var10001 = new class_124;
                  var10001.method_516(1, var18, var5);
                  var18.method_34(var10001);
               }

               return true;
            }
         }
      }

      return var1;
   }

   // $FF: renamed from: b (ca, ca) boolean
   private static boolean method_837(class_46 var0, class_46 var1) {
      Iterator var3 = var0.method_59().iterator();

      while(var3.hasNext()) {
         class_124 var2;
         if((var2 = (class_124)var3.next()).method_518() != 1 && var2.method_522().field_13 != 14 && !var1.method_42(var2.method_522())) {
            return false;
         }
      }

      var3 = var0.method_63().iterator();

      while(var3.hasNext()) {
         if(!method_837((class_46)var3.next(), var1)) {
            return false;
         }
      }

      return true;
   }

   // $FF: renamed from: a (ca, ca) boolean
   public static boolean method_838(class_46 var0, class_46 var1) {
      return var1.field_13 != 5 && var1.field_13 != 6?true:((var0 = var0.method_71()) == var1?false:var0.field_13 == 5 || var0.field_13 == 6 || method_838(var0, var1));
   }
}
