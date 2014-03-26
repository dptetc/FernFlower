import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

// $FF: renamed from: ag
public final class class_211 {

   // $FF: renamed from: <init> () void
   public void method_1050() {
      super();
   }

   // $FF: renamed from: a (S) void
   public static void method_1051(class_54 var0) {
      method_1057(var0);
      method_1054(var0);
      method_1053(var0);
      method_1055(var0, new HashSet());
      method_1056(var0);
   }

   // $FF: renamed from: b (S) void
   public static void method_1052(class_54 var0) {
      method_1058(var0);
      method_1060(var0);
      method_1061(var0);
      Iterator var1 = var0.method_123().method_60().iterator();

      while(var1.hasNext()) {
         class_124 var3;
         List var2 = (var3 = (class_124)var1.next()).method_520().method_75();
         if(var3.method_518() == 32 || var2 != null && !var2.isEmpty() && ((class_86)var2.get(var2.size() - 1)).field_148 == 4) {
            var3.field_304 = false;
         }
      }

   }

   // $FF: renamed from: c (ca) void
   private static void method_1053(class_46 var0) {
      Iterator var2 = var0.method_59().iterator();

      while(var2.hasNext()) {
         class_124 var1;
         switch((var1 = (class_124)var2.next()).method_518()) {
         case 4:
            class_46 var3;
            if((var3 = var1.method_522()).field_13 != 14) {
               class_46 var4 = var3.method_71();
               ArrayList var5 = new ArrayList();
               if(var4.field_13 == 15) {
                  var5.addAll(((class_49)var4).method_63());
               } else if(var4.field_13 == 6) {
                  var5.addAll(((class_53)var4).method_120());
               }

               for(int var6 = 0; var6 < var5.size(); ++var6) {
                  if(var5.get(var6) == var3) {
                     ((class_46)var5.get(var6 - 1)).method_27(var1);
                     break;
                  }
               }
            }
         case 5:
         case 6:
         case 7:
         default:
            break;
         case 8:
            if(var1.method_522() != var1.field_303) {
               var1.method_522().method_27(var1);
            }
         }
      }

      var2 = var0.method_63().iterator();

      while(var2.hasNext()) {
         method_1053((class_46)var2.next());
      }

   }

   // $FF: renamed from: d (ca) void
   private static void method_1054(class_46 var0) {
      Iterator var2 = var0.method_63().iterator();

      class_124 var1;
      while(var2.hasNext()) {
         class_46 var10000 = (class_46)var2.next();
         var1 = null;
         method_1054(var10000);
      }

      if(!var0.method_70()) {
         var2 = var0.method_57(12).iterator();

         while(var2.hasNext()) {
            var1 = (class_124)var2.next();
            var0.method_35(var1);
         }
      }

   }

   // $FF: renamed from: a (ca, java.util.HashSet) void
   public static void method_1055(class_46 var0, HashSet var1) {
      boolean var2;
      if(!(var2 = var0.field_13 != 5)) {
         class_47 var4;
         var2 = (var4 = (class_47)var0).method_91() == 0 || var4.method_91() == 2 || var4.method_91() == 3 && var4.method_87() == null;
      }

      if(var2) {
         var1.addAll(var0.method_58(8));
      }

      Iterator var3;
      if(var2 && var0.field_13 == 5) {
         var3 = var1.iterator();

         while(var3.hasNext()) {
            class_124 var5 = (class_124)var3.next();
            if(var0.method_42(var5.method_520())) {
               var5.method_522().method_33(var5);
               var5.method_520().method_52(1, var5, var0);
               var0.method_32(var5);
               var0.method_27(var5);
            }
         }
      }

      var3 = var0.method_63().iterator();

      while(var3.hasNext()) {
         class_46 var6;
         if((var6 = (class_46)var3.next()) == var0.method_61()) {
            method_1055(var6, var1);
         } else {
            method_1055(var6, new HashSet());
         }
      }

   }

   // $FF: renamed from: a (ca) void
   public static void method_1056(class_46 var0) {
      Iterator var2 = (new ArrayList(var0.method_73())).iterator();

      while(var2.hasNext()) {
         class_124 var1;
         if((var1 = (class_124)var2.next()).method_518() == 4) {
            Iterator var4 = var0.method_63().iterator();

            while(var4.hasNext()) {
               class_46 var3;
               if((var3 = (class_46)var4.next()).method_42(var1.method_520()) && class_142.method_646(var3, var1.method_522())) {
                  var3.method_27(var1);
               }
            }
         }
      }

      var2 = var0.method_63().iterator();

      while(var2.hasNext()) {
         method_1056((class_46)var2.next());
      }

   }

   // $FF: renamed from: e (ca) void
   private static void method_1057(class_46 var0) {
      Iterator var2 = var0.method_63().iterator();

      class_124 var1;
      while(var2.hasNext()) {
         class_46 var10000 = (class_46)var2.next();
         var1 = null;
         method_1057(var10000);
      }

      for(var2 = var0.method_59().iterator(); var2.hasNext(); var1.field_304 = true) {
         (var1 = (class_124)var2.next()).field_305 = true;
      }

   }

   // $FF: renamed from: f (ca) java.util.HashMap
   private static HashMap method_1058(class_46 var0) {
      HashMap var1 = new HashMap();
      if(var0.method_75() != null) {
         return var1;
      } else {
         switch(var0.field_13) {
         case 2:
            class_55 var8;
            if((var8 = (class_55)var0).method_130() == null) {
               method_1059(var8.method_61(), var1, (class_46)null);
            } else {
               if(var8.method_130() != null) {
                  var1 = method_1058(var8.method_130());
                  method_1059(var8.method_130(), var1, (class_46)null);
               }

               HashMap var15 = null;
               if(var8.method_128() != null) {
                  var15 = method_1058(var8.method_128());
                  method_1059(var8.method_128(), var15, (class_46)null);
               }

               if(var15 != null) {
                  Iterator var9 = var15.entrySet().iterator();

                  while(var9.hasNext()) {
                     Entry var17 = (Entry)var9.next();
                     if(var1.containsKey(var17.getKey())) {
                        ((List)var1.get(var17.getKey())).addAll((Collection)var17.getValue());
                     } else {
                        var1.put((class_46)var17.getKey(), (List)var17.getValue());
                     }
                  }
               }
            }
         case 3:
         case 4:
         case 8:
         case 9:
         case 11:
         case 14:
         default:
            break;
         case 5:
            var1 = method_1058(var0.method_61());
            method_1059(var0.method_61(), var1, var0);
            break;
         case 6:
            class_53 var7 = (class_53)var0;

            class_46 var12;
            int var14;
            for(var14 = 0; var14 < var7.method_120().size() - 1; ++var14) {
               var12 = (class_46)var7.method_120().get(var14);
               if((var0 = (class_46)var7.method_120().get(var14 + 1)).method_75() != null && var0.method_75().isEmpty()) {
                  var0 = ((class_124)var0.method_59().get(0)).method_522();
               }

               method_1059(var12, method_1058(var12), var0);
            }

            if((var14 = var7.method_120().size() - 1) >= 0) {
               if((var12 = (class_46)var7.method_120().get(var14)).method_75() != null && var12.method_75().isEmpty()) {
                  class_124 var5 = (class_124)var12.method_59().get(0);
                  var1.put(var5.method_522(), new ArrayList((Collection)Arrays.asList(new class_124[]{var5})));
               } else {
                  var1 = method_1058(var12);
                  method_1059(var12, var1, (class_46)null);
               }
            }
            break;
         case 7:
         case 12:
            Iterator var11 = var0.method_63().iterator();

            while(var11.hasNext()) {
               class_46 var2;
               HashMap var13 = method_1058(var2 = (class_46)var11.next());
               method_1059(var2, var13, (class_46)null);
               if((var0.field_13 == 7 || var2 == var0.method_61()) && var13 != null) {
                  Iterator var16 = var13.entrySet().iterator();

                  while(var16.hasNext()) {
                     Entry var6 = (Entry)var16.next();
                     if(var1.containsKey(var6.getKey())) {
                        ((List)var1.get(var6.getKey())).addAll((Collection)var6.getValue());
                     } else {
                        var1.put((class_46)var6.getKey(), (List)var6.getValue());
                     }
                  }
               }
            }

            return var1;
         case 10:
            class_56 var10;
            method_1059((var10 = (class_56)var0).method_61(), method_1058(var0.method_61()), var10.method_142());
            var1 = method_1058(var10.method_142());
            method_1059(var10.method_142(), var1, (class_46)null);
            break;
         case 13:
            var1 = method_1058(var0.method_61());
            method_1059(var0.method_61(), var1, ((class_54)var0).method_123());
            break;
         case 15:
            int var3;
            class_46 var4;
            for(var3 = 0; var3 < var0.method_63().size() - 1; ++var3) {
               class_46 var10000 = (class_46)var0.method_63().get(var3);
               var4 = null;
               method_1059(var10000, method_1058(var10000), (class_46)var0.method_63().get(var3 + 1));
            }

            var1 = method_1058(var4 = (class_46)var0.method_63().get(var3));
            method_1059(var4, var1, (class_46)null);
         }

         return var1;
      }
   }

   // $FF: renamed from: a (ca, java.util.HashMap, ca) void
   private static void method_1059(class_46 var0, HashMap var1, class_46 var2) {
      class_124 var3 = null;
      List var4;
      if(!(var4 = var0.method_59()).isEmpty()) {
         if((var3 = (class_124)var4.get(0)).method_522() == var2) {
            var3.field_305 = false;
            var3 = null;
         } else {
            var2 = var3.method_522();
         }
      }

      if(var0.field_13 == 5 && ((class_47)var0).method_91() == 0) {
         var2 = null;
      }

      class_124 var10000;
      if(var2 == null) {
         if(var1.size() == 1 && (var4 = (List)var1.values().iterator().next()).size() > 1 && ((class_46)var1.keySet().iterator().next()).field_13 != 14) {
            class_124 var5 = (class_124)var4.get(0);
            class_46 var6;
            if(!(var6 = var0.method_71()).method_42(var5.field_303)) {
               var6 = var5.field_303;
            }

            var10000 = new class_124;
            var10000.method_515(var5.method_518(), var0, var5.method_522(), var6);
            class_124 var8 = var10000;
            var0.method_34(var8);

            for(Iterator var7 = var4.iterator(); var7.hasNext(); ((class_124)var7.next()).field_305 = false) {
               ;
            }

            var1.put(var8.method_522(), new ArrayList((Collection)Arrays.asList(new class_124[]{var8})));
         }
      } else {
         boolean var10 = false;
         Iterator var16 = var1.entrySet().iterator();

         while(var16.hasNext()) {
            Entry var11;
            if((var11 = (Entry)var16.next()).getKey() == var2) {
               for(Iterator var12 = ((List)var11.getValue()).iterator(); var12.hasNext(); ((class_124)var12.next()).field_305 = false) {
                  ;
               }

               var10 = true;
               break;
            }
         }

         if(var0.method_59().isEmpty() && !var10) {
            List var14 = null;
            Iterator var9 = var1.entrySet().iterator();

            while(var9.hasNext()) {
               Entry var15;
               if(((class_46)(var15 = (Entry)var9.next()).getKey()).field_13 != 14 && (var14 == null || ((List)var15.getValue()).size() > var14.size())) {
                  var14 = (List)var15.getValue();
               }
            }

            if(var14 != null && var14.size() > 1) {
               class_124 var17 = (class_124)var14.get(0);
               if(!(var2 = var0.method_71()).method_42(var17.field_303)) {
                  var2 = var17.field_303;
               }

               var10000 = new class_124;
               var10000.method_515(var17.method_518(), var0, var17.method_522(), var2);
               class_124 var13 = var10000;
               var0.method_34(var13);

               for(var9 = var14.iterator(); var9.hasNext(); ((class_124)var9.next()).field_305 = false) {
                  ;
               }
            }
         }

         var1.clear();
      }

      if(var3 != null) {
         var1.put(var3.method_522(), new ArrayList((Collection)Arrays.asList(new class_124[]{var3})));
      }

   }

   // $FF: renamed from: g (ca) void
   private static void method_1060(class_46 var0) {
      class_53 var1;
      int var2;
      class_46 var3;
      if(var0.field_13 == 6 && (var2 = (var1 = (class_53)var0).method_120().size() - 1) >= 0 && (var3 = (class_46)var1.method_120().get(var2)).method_75() != null && var3.method_75().isEmpty() && !((class_124)var3.method_59().get(0)).field_305) {
         List var5;
         (var5 = (List)var1.method_119().get(var2)).remove(var1.method_121());
         if(var5.isEmpty()) {
            var1.method_120().remove(var2);
            var1.method_119().remove(var2);
         }
      }

      Iterator var4 = var0.method_63().iterator();

      while(var4.hasNext()) {
         method_1060((class_46)var4.next());
      }

   }

   // $FF: renamed from: h (ca) java.util.HashSet[]
   private static HashSet[] method_1061(class_46 var0) {
      HashSet var1 = new HashSet();
      HashSet var2 = new HashSet();
      if(var0.method_75() == null) {
         Iterator var4 = var0.method_63().iterator();

         while(var4.hasNext()) {
            class_46 var10000 = (class_46)var4.next();
            Object var3 = null;
            HashSet[] var5 = method_1061(var10000);
            var1.addAll(var5[0]);
            var2.addAll(var5[1]);
         }

         boolean var6 = var0.field_13 == 5 || var0.field_13 == 6;
         Iterator var8 = var0.method_73().iterator();

         while(var8.hasNext()) {
            class_124 var7;
            if((var7 = (class_124)var8.next()).field_305 && var6 && (var7.method_518() == 4 && var1.contains(var7.method_520()) || var7.method_518() == 8 && var2.contains(var7.method_520()))) {
               var7.field_304 = false;
            }
         }

         switch(var0.field_13) {
         case 5:
            var2.clear();
         case 6:
            var1.clear();
         }
      }

      var1.add(var0);
      var2.add(var0);
      return new HashSet[]{var1, var2};
   }

   // $FF: renamed from: b (ca) void
   public static void method_1062(class_46 var0) {
      if(var0.field_13 == 5) {
         List var10000 = var0.method_58(8);
         Iterator var1 = null;
         var1 = var10000.iterator();

         label47:
         while(var1.hasNext()) {
            class_124 var2;
            if((var2 = (class_124)var1.next()).field_305) {
               class_124 var3 = var2;
               class_46 var4 = var2.field_303;

               while(true) {
                  boolean var5 = false;
                  Iterator var7 = var4.method_63().iterator();

                  while(true) {
                     if(var7.hasNext()) {
                        class_46 var6;
                        if(!(var6 = (class_46)var7.next()).method_42(var3.method_520()) || !class_142.method_646(var6, var3.method_522())) {
                           continue;
                        }

                        var4 = var6;
                        var5 = true;
                     }

                     if(!var5) {
                        if(var4 != var2.field_303 && !class_180.method_838(var2.method_520(), var4)) {
                           var2.method_520().method_53(1, var2, 4);
                           var2.field_304 = false;
                           var4.method_27(var2);
                        }
                        continue label47;
                     }
                     break;
                  }
               }
            }
         }
      }

      Iterator var8 = var0.method_63().iterator();

      while(var8.hasNext()) {
         method_1062((class_46)var8.next());
      }

   }
}
