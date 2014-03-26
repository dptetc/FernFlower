import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// $FF: renamed from: cC
public final class class_142 {

   // $FF: renamed from: <init> () void
   public void method_642() {
      super();
   }

   // $FF: renamed from: a (ca) void
   public static void method_643(class_46 var0) {
      while(method_644(var0)) {
         ;
      }

      class_172.method_787(var0);
   }

   // $FF: renamed from: b (ca) boolean
   private static boolean method_644(class_46 var0) {
      boolean var1 = false;
      Iterator var3 = var0.method_63().iterator();

      while(var3.hasNext()) {
         class_46 var2;
         if((var2 = (class_46)var3.next()).method_75() == null) {
            var1 |= method_644(var2);
         }
      }

      if(var0.field_13 == 5) {
         boolean var10000 = var1;
         class_47 var7;
         int var8;
         switch(var8 = (var7 = (class_47)var0).method_91()) {
         case 0:
            class_47 var9 = var7;

            class_46 var10;
            for(var10 = var7.method_61(); var10.field_13 == 15; var10 = var10.method_61()) {
               ;
            }

            boolean var11;
            label79: {
               class_55 var4;
               if(var10.field_13 == 2 && (var4 = (class_55)var10).method_61().method_75().isEmpty() && var4.field_49 == 0) {
                  class_124 var5;
                  class_48 var10001;
                  class_48 var12;
                  class_191 var10003;
                  if(var4.method_130() == null) {
                     var5 = var4.method_138();
                     if(method_646(var7, var5.method_522())) {
                        var7.method_92(2);
                        class_99 var6;
                        (var6 = (class_99)var4.method_135().method_261()).method_363();
                        var7.method_86(var6.method_364());
                        var4.method_61().method_35(var5);
                        var4.method_35((class_124)var4.method_59().get(0));
                        if(var7.method_59().isEmpty()) {
                           var5.method_521(var7);
                           if(var5.field_303 == var7) {
                              var5.field_303 = var7.method_71();
                           }

                           var7.method_34(var5);
                        }

                        if(var4 == var7.method_61()) {
                           var10001 = new class_48;
                           var10003 = new class_191;
                           var10003.method_910(class_181.method_853().method_814(0));
                           var10001.method_93(var10003);
                           var12 = var10001;
                           var10001.method_76(new ArrayList());
                           var7.method_49(var4, var12);
                        } else {
                           (var10 = var4.method_71()).method_63().method_658(var4.field_14);
                           var10.method_62((class_46)var10.method_63().get(0));
                        }

                        var11 = true;
                        break label79;
                     }
                  } else {
                     var5 = (class_124)var4.method_59().get(0);
                     if(method_646(var7, var5.method_522())) {
                        var7.method_92(2);
                        var7.method_86(((class_99)var4.method_135().method_261()).method_364());
                        class_124 var15 = var4.method_138();
                        var4.method_61().method_35(var15);
                        var4.method_35(var5);
                        if(var7.method_59().isEmpty()) {
                           var5.method_521(var7);
                           if(var5.field_303 == var7) {
                              var5.field_303 = var7.method_71();
                           }

                           var7.method_34(var5);
                        }

                        if(var4.method_130() == null) {
                           var10001 = new class_48;
                           var10003 = new class_191;
                           var10003.method_910(class_181.method_853().method_814(0));
                           var10001.method_93(var10003);
                           var12 = var10001;
                           var10001.method_76(new ArrayList());
                           var15.method_521(var12);
                           var12.method_34(var15);
                           var7.method_49(var4, var12);
                        } else {
                           var10.method_71().method_49(var10, var4.method_130());
                           Iterator var13 = var5.method_522().method_58(4).iterator();

                           while(var13.hasNext()) {
                              class_124 var14 = (class_124)var13.next();
                              if(var9.method_42(var14.field_303)) {
                                 var9.method_27(var14);
                              }
                           }

                           class_211.method_1056(var9);
                        }

                        var11 = true;
                        break label79;
                     }
                  }
               }

               var11 = false;
            }

            if(var11) {
               method_647(var7);
            } else {
               method_645(var7);
            }
         case 1:
         default:
            break;
         case 2:
            method_647(var7);
         }

         var1 = var10000 | var7.method_91() != var8;
      }

      return var1;
   }

   // $FF: renamed from: a (au) boolean
   private static boolean method_645(class_47 var0) {
      class_46 var1;
      for(var1 = var0.method_61(); var1.field_13 == 15; var1 = (class_46)var1.method_63().method_661()) {
         ;
      }

      class_55 var2;
      if(var1.field_13 == 2 && (var2 = (class_55)var1).field_49 == 0 && var2.method_130() == null) {
         class_124 var3 = var2.method_138();
         class_124 var4 = (class_124)var2.method_59().get(0);
         if(var3.method_518() == 4 && var4.method_518() == 8 && var4.field_303 == var0 && method_646(var0, var3.method_522()) || var3.method_518() == 8 && var4.method_518() == 4 && var3.field_303 == var0 && method_646(var0, var4.method_522())) {
            Set var5;
            (var5 = var0.method_56(8, 0)).remove(var1);
            if(!var5.isEmpty()) {
               return false;
            }

            var0.method_92(1);
            class_99 var6 = (class_99)var2.method_135().method_261();
            if(var3.method_518() == 4) {
               var6.method_363();
            }

            var0.method_86(var6.method_364());
            var2.method_61().method_35(var3);
            var2.method_35(var4);
            class_124 var7;
            if(var2.method_61().method_75().isEmpty()) {
               method_648(var0, var2);
            } else {
               var2.method_76(var2.method_61().method_75());
               class_124 var10000 = new class_124;
               var10000.method_516(8, var2, var0);
               var7 = var10000;
               var2.method_34(var7);
               var0.method_27(var7);
            }

            if(var0.method_59().isEmpty()) {
               (var7 = var4.method_518() == 8?var3:var4).method_521(var0);
               if(var7.field_303 == var0) {
                  var7.field_303 = var0.method_71();
               }

               var0.method_34(var7);
            }

            return true;
         }
      }

      return false;
   }

   // $FF: renamed from: a (ca, ca) boolean
   public static boolean method_646(class_46 var0, class_46 var1) {
      Set var2;
      if((var2 = var0.method_56(1073741824, 1)).isEmpty()) {
         class_46 var5;
         if((var5 = var0.method_71()) == null) {
            return false;
         } else {
            switch(var5.field_13) {
            case 5:
               if(var1 == var5) {
                  return true;
               }

               return false;
            case 6:
               class_53 var3 = (class_53)var5;

               for(int var4 = 0; var4 < var3.method_120().size() - 1; ++var4) {
                  if((class_46)var3.method_120().get(var4) == var0) {
                     if((var0 = (class_46)var3.method_120().get(var4 + 1)).method_75() != null && var0.method_75().isEmpty()) {
                        var0 = ((class_124)var0.method_59().get(0)).method_522();
                     }

                     if(var1 == var0) {
                        return true;
                     }

                     return false;
                  }
               }
            case 13:
               if(var1.field_13 == 14) {
                  return true;
               }

               return false;
            default:
               return method_646(var5, var1);
            }
         }
      } else {
         return var2.contains(var1);
      }
   }

   // $FF: renamed from: b (au) boolean
   private static boolean method_647(class_47 var0) {
      class_86 var1 = null;
      class_46 var2 = null;
      class_46 var3 = null;
      if((var2 = method_649(var0.method_61())) != null && !var2.method_75().isEmpty()) {
         List var4;
         List var10000 = var4 = var2.method_75();
         var1 = (class_86)var10000.get(var10000.size() - 1);
         boolean var5 = false;
         if(var4.size() == 1 && var2.method_60().size() > 1) {
            var5 = true;
         }

         boolean var9 = var5 || var1.field_148 == 2 || var1.field_148 == 6;
         boolean var7 = false;
         if(!var9) {
            return false;
         } else {
            boolean var10 = false;

            class_46 var6;
            for(Object var8 = var0; (var6 = ((class_46)var8).method_71()) != null && var6.field_13 == 15; var8 = var6) {
               if(var8 != var6.method_61()) {
                  if((var3 = method_649((class_46)((class_46)var8).method_55(1, 0).get(0))) != null && !var3.method_75().isEmpty() && ((class_86)var3.method_75().get(var3.method_75().size() - 1)).field_148 == 2) {
                     var10 = true;
                  }
                  break;
               }
            }

            if(var10 || var5) {
               Set var12;
               (var12 = var0.method_56(8, 0)).remove(var2);
               if(!var12.isEmpty()) {
                  return false;
               }

               var0.method_92(3);
               if(var10) {
                  var0.method_90((class_86)var3.method_75().remove(var3.method_75().size() - 1));
               }

               var0.method_88((class_86)var2.method_75().remove(var2.method_75().size() - 1));
            }

            if(var2.method_75().isEmpty()) {
               List var11;
               if(!(var11 = var2.method_59()).isEmpty()) {
                  var2.method_35((class_124)var11.get(0));
               }

               method_648(var0, var2);
            }

            return true;
         }
      } else {
         return false;
      }
   }

   // $FF: renamed from: a (au, ca) void
   private static void method_648(class_47 var0, class_46 var1) {
      if(var1 == var0.method_61()) {
         class_48 var10000 = new class_48;
         class_191 var10002 = new class_191;
         var10002.method_910(class_181.method_853().method_814(0));
         var10000.method_93(var10002);
         class_48 var4 = var10000;
         var10000.method_76(new ArrayList());
         var0.method_49(var1, var4);
      } else {
         Iterator var3 = var1.method_60().iterator();

         while(var3.hasNext()) {
            class_124 var2;
            (var2 = (class_124)var3.next()).method_520().method_53(1, var2, 8);
            var1.method_33(var2);
            var2.method_520().method_52(1, var2, var0);
            var0.method_32(var2);
            var0.method_27(var2);
         }

         var1.method_71().method_63().method_658(var1.field_14);
      }
   }

   // $FF: renamed from: c (ca) ca
   private static class_46 method_649(class_46 var0) {
      if(var0.method_75() != null) {
         return var0;
      } else {
         switch(var0.field_13) {
         case 15:
            for(int var1 = var0.method_63().size() - 1; var1 >= 0; --var1) {
               class_46 var2;
               if((var2 = method_649((class_46)var0.method_63().get(var1))) == null || !var2.method_75().isEmpty()) {
                  return var2;
               }
            }
         default:
            return null;
         }
      }
   }
}
