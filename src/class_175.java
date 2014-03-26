import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

// $FF: renamed from: aX
public final class class_175 {

   // $FF: renamed from: <init> () void
   public void method_802() {
      super();
   }

   // $FF: renamed from: b (ca) cE
   private static class_146 method_803(class_46 var0) {
      HashMap var1 = new HashMap();
      class_196 var10000 = new class_196;
      var10000.method_955(var0);
      List var2 = null;
      var2 = var10000.method_961();
      List var3 = var0.method_40(class_196.method_958(var2));
      class_195 var16 = new class_195;
      var16.method_950(var3);
      class_195 var4 = var16;
      class_115 var5;
      (var5 = var16.method_951()).method_456();
      class_115 var6;
      (var6 = var4.method_951()).method_456();
      Iterator var7 = var2.iterator();

      class_115 var8;
      class_46 var9;
      Iterator var10;
      while(var7.hasNext()) {
         if(class_196.method_957(var2 = (List)var7.next())) {
            (var8 = var4.method_951()).method_458(var2);
         } else {
            var8 = var6.method_455();
         }

         var10 = var2.iterator();

         while(var10.hasNext()) {
            var9 = (class_46)var10.next();
            var1.put(var9, var8);
         }
      }

      class_46 var11;
      Iterator var25;
      do {
         var7 = var3.iterator();

         while(var7.hasNext()) {
            class_46 var13 = (class_46)var7.next();
            if(var5.method_460(var13)) {
               var5.method_459(var13);
               var8 = (class_115)var1.get(var13);
               class_115 var21 = var4.method_951();
               List var24 = var13.method_55(1, 1);

               for(int var18 = 0; var18 < var24.size(); ++var18) {
                  var11 = (class_46)var24.get(var18);
                  class_115 var12 = (class_115)var1.get(var11);
                  if(var18 == 0) {
                     var21.method_462(var12);
                  } else {
                     var21.method_463(var12);
                  }
               }

               if(!var21.method_460(var13)) {
                  var21.method_457(var13);
               }

               if(!class_129.method_558(var21, var8)) {
                  var1.put(var13, var21);
                  List var17 = var13.method_55(1, 0);
                  var6 = null;
                  var25 = var17.iterator();

                  while(var25.hasNext()) {
                     var11 = (class_46)var25.next();
                     var5.method_457(var11);
                  }
               }
            }
         }
      } while(!var5.method_465());

      class_146 var14 = new class_146;
      var14.method_653();
      class_146 var15 = var14;
      List var20 = var0.method_39();
      HashMap var22 = new HashMap();

      for(int var23 = 0; var23 < var20.size(); ++var23) {
         var22.put(((class_46)var20.get(var23)).field_14, Integer.valueOf(var23));
      }

      ArrayList var19;
      for(var10 = var3.iterator(); var10.hasNext(); var15.method_655(var19, var9.field_14)) {
         var9 = (class_46)var10.next();
         var19 = new ArrayList();
         var25 = ((class_115)var1.get(var9)).iterator();

         while(var25.hasNext()) {
            var11 = (class_46)var25.next();
            var19.add(var11.field_14);
         }

         class_186 var10001 = new class_186;
         var10001.method_885(var22);
         Collections.sort(var19, var10001);
         if(var19.size() > 1 && ((Integer)var19.get(0)).intValue() == var9.field_14.intValue()) {
            var19.add((Integer)var19.remove(0));
         }
      }

      return var15;
   }

   // $FF: renamed from: a (cI) S
   public static class_54 method_804(class_139 var0) {
      class_146 var10000 = new class_146;
      var10000.method_653();
      class_146 var1 = var10000;
      class_146 var2;
      Iterator var4 = (var2 = var0.method_618()).iterator();

      while(var4.hasNext()) {
         class_191 var3 = (class_191)var4.next();
         class_48 var10001 = new class_48;
         var10001.method_93(var3);
         var1.method_655(var10001, Integer.valueOf(var3.field_488));
      }

      class_46 var15 = (class_46)var1.method_659(Integer.valueOf(var0.method_619().field_488));
      class_46 var17 = new class_46;
      var17.method_23();
      class_46 var19 = var17;
      var17.field_13 = 14;
      class_54 var14;
      class_124 var16;
      if(var1.size() > 1) {
         class_52 var18 = new class_52;
         var18.method_113(var15, var1, (class_46)null);
         class_52 var5 = var18;
         Iterator var6 = var2.iterator();

         while(var6.hasNext()) {
            class_191 var12 = (class_191)var6.next();
            class_46 var7 = (class_46)var1.method_659(Integer.valueOf(var12.field_488));
            Iterator var9 = var12.method_927().iterator();

            class_191 var8;
            class_46 var10;
            while(var9.hasNext()) {
               var8 = (class_191)var9.next();
               byte var20;
               if((var10 = (class_46)var1.method_659(Integer.valueOf(var8.field_488))) == var15) {
                  var20 = 8;
               } else if(var0.method_623().contains(var12)) {
                  var20 = 32;
                  var10 = var19;
               } else if(var8.field_488 == var0.method_622().field_488) {
                  var20 = 4;
                  var10 = var19;
               } else {
                  var20 = 1;
               }

               var16 = new class_124;
               var16.method_515(var20, var7, (class_46)(var20 == 8?var5:var10), var20 == 1?null:var5);
               var7.method_34(var16);
            }

            var9 = var12.method_928().iterator();

            while(var9.hasNext()) {
               var8 = (class_191)var9.next();
               var10 = (class_46)var1.method_659(Integer.valueOf(var8.field_488));
               class_201 var21;
               if(!(var21 = var0.method_605(var8, var12)).method_986()) {
                  var16 = new class_124;
                  var16.method_517(var7, var10, var21.method_990());
                  var7.method_34(var16);
               }
            }
         }

         var5.method_37();
         var5.method_38();
         var14 = new class_54;
         var14.method_122(var5, var19);
      } else {
         var14 = new class_54;
         var14.method_122(var15, var19);
         class_54 var13 = var14;
         var16 = new class_124;
         var16.method_515(4, var15, var19, var13);
         var15.method_34(var16);
         var14 = var13;
      }

      class_54 var11 = var14;
      if(!method_807(var14, new HashMap())) {
         class_181.method_859().writeMessage("parsing failure!", 4);
         throw new RuntimeException("parsing failure!");
      } else {
         class_211.method_1055(var11, new HashSet());
         class_172.method_787(var11);
         var11.method_38();
         method_806(var11);
         return var11;
      }
   }

   // $FF: renamed from: a (ca) void
   public static void method_805(class_46 var0) {
      Iterator var1 = var0.method_63().iterator();

      while(var1.hasNext()) {
         method_805((class_46)var1.next());
      }

      if(var0.field_13 == 10) {
         ((class_56)var0).method_141();
      }

   }

   // $FF: renamed from: c (ca) void
   private static void method_806(class_46 var0) {
      Iterator var2 = var0.method_63().iterator();

      class_124 var1;
      while(var2.hasNext()) {
         class_46 var10000 = (class_46)var2.next();
         var1 = null;
         method_806(var10000);
      }

      boolean var7;
      if(var0.field_13 == 15) {
         do {
            var7 = false;
            class_146 var9 = var0.method_63();

            for(int var3 = 0; var3 < var9.size() - 1; ++var3) {
               class_46 var4;
               if((var4 = (class_46)var9.get(var3)).method_67()) {
                  class_46 var5;
                  class_46 var6;
                  for(var6 = var5 = (class_46)var9.get(var3 + 1); var5.field_13 == 15; var5 = var5.method_61()) {
                     ;
                  }

                  class_51 var13;
                  if(var5.field_13 == 12 && (var13 = (class_51)var5).method_61().method_66() && var13.method_106().method_66()) {
                     var4.method_35((class_124)var4.method_57(1073741824).get(0));
                     var2 = var4.method_58(1073741824).iterator();

                     while(var2.hasNext()) {
                        var1 = (class_124)var2.next();
                        var4.method_33(var1);
                        var1.method_520().method_52(1, var1, var6);
                        var6.method_32(var1);
                     }

                     var0.method_63().method_658(var4.field_14);
                     var0.method_62((class_46)var0.method_63().get(0));
                     class_56 var11 = new class_56;
                     var11.method_140(var4, var13.method_61(), var13.method_106());
                     class_56 var8 = var11;
                     var11.method_26();
                     Iterator var12 = (new HashSet(var13.method_73())).iterator();

                     while(var12.hasNext()) {
                        class_124 var10 = (class_124)var12.next();
                        var8.method_27(var10);
                     }

                     class_124 var10001 = new class_124;
                     var10001.method_516(1, var4, var13.method_61());
                     var4.method_34(var10001);
                     var13.method_71().method_49(var13, var8);
                     var7 = true;
                     break;
                  }
               }
            }
         } while(var7);
      }

   }

   // $FF: renamed from: a (ca, java.util.HashMap) boolean
   private static boolean method_807(class_46 var0, HashMap var1) {
      if(var0.field_13 == 13) {
         class_46 var9;
         if((var9 = var0.method_61()).field_13 != 0) {
            return true;
         } else {
            boolean var10;
            if(var10 = method_807(var9, var1)) {
               var0.method_49(var9, var9.method_61());
            }

            return var10;
         }
      } else {
         boolean var2 = var1.isEmpty();

         for(int var3 = 0; var3 < 2; ++var3) {
            for(int var4 = 0; var4 < 5; ++var4) {
               if(var4 > 0) {
                  if(!class_65.method_187(var0)) {
                     if(var3 == 2 || var2) {
                        class_181.method_859().writeMessage("Statement cannot be decomposed although reducible!", 4);
                     }
                     break;
                  }

                  if(!class_65.method_188(var0)) {
                     class_181.method_859().writeMessage("Irreducible statement cannot be decomposed!", 4);
                     break;
                  }

                  var1 = new HashMap();
                  var2 = true;
               }

               int var5 = 0;

               while(var5 < 2) {
                  boolean var6 = var5 != 0;

                  while(true) {
                     if(method_810(var0, var1)) {
                        var4 = 0;
                     }

                     if(var0.field_13 == 11) {
                        return true;
                     }

                     class_46 var7;
                     if((var7 = method_808(var0, var6, var1)) == null) {
                        ++var5;
                        break;
                     }

                     boolean var10000 = method_807(var7, var0.method_61() == var7?var1:new HashMap());
                     boolean var8 = false;
                     if(!var10000) {
                        return false;
                     }

                     var0.method_49(var7, var7.method_61());
                     var1 = new HashMap();
                     var2 = true;
                     var4 = 0;
                  }
               }
            }

            if(var2) {
               break;
            }

            var1 = new HashMap();
         }

         return false;
      }
   }

   // $FF: renamed from: a (ca, boolean, java.util.HashMap) ca
   private static class_46 method_808(class_46 var0, boolean var1, HashMap var2) {
      class_146 var3 = var0.method_63();
      class_207 var4;
      if(var2.isEmpty()) {
         class_207 var10000 = new class_207;
         var10000.method_1011();
         var4 = var10000;
         var2.putAll(var4.method_1012(var0));
      }

      class_146 var19;
      if(var1) {
         class_146 var34 = new class_146;
         var34.method_653();
         var19 = var34;
         var4 = null;
         Iterator var6 = var0.method_40((List)null).iterator();

         while(var6.hasNext()) {
            class_46 var5 = (class_46)var6.next();
            Set var7;
            if((var7 = (Set)var2.get(var5.field_14)) != null) {
               var19.method_655(new ArrayList(var7), var5.field_14);
            }
         }

         Object var8;
         Set var21;
         Integer var24;
         if((var21 = (Set)var2.get(var0.method_61().field_14)) != null) {
            for(Iterator var25 = var21.iterator(); var25.hasNext(); ((List)var8).add(var24)) {
               var24 = (Integer)var25.next();
               if((var8 = (List)var19.method_659(var24)) == null) {
                  var19.method_655(var8 = new ArrayList(), var24);
               }
            }
         }
      } else {
         var19 = method_803(var0);
      }

      for(int var20 = 0; var20 < var19.size(); ++var20) {
         Integer var22 = (Integer)var19.method_664(var20);
         List var23 = (List)var19.get(var20);
         if(var2.containsKey(var22) || var23.size() == 1 && ((Integer)var23.get(0)).equals(var22)) {
            class_46 var26 = (class_46)var3.method_659(var22);
            Set var27 = (Set)var2.get(var22);

            for(int var9 = 0; var9 < var23.size(); ++var9) {
               Integer var10;
               class_46 var28;
               if(((var10 = (Integer)var23.get(var9)).equals(var22) || var27.contains(var10)) && (var28 = (class_46)var3.method_659(var10)) != null) {
                  boolean var11 = var28 == var26;
                  HashSet var12 = new HashSet();
                  HashSet var13 = new HashSet();
                  HashSet var14;
                  (var14 = new HashSet()).add(var26);

                  boolean var15;
                  class_46 var17;
                  Iterator var16;
                  class_46 var29;
                  do {
                     var15 = false;
                     var16 = var14.iterator();

                     while(var16.hasNext()) {
                        var17 = (class_46)var16.next();
                        if(!var12.contains(var17)) {
                           boolean var18;
                           if(!(var18 = var12.size() == 0)) {
                              List var32 = var17.method_55(2, 0);
                              var18 = var12.containsAll(var32) && (var12.size() > var32.size() || var12.size() == 1);
                           }

                           if(var18) {
                              LinkedList var31;
                              (var31 = new LinkedList()).add(var17);

                              while(!var31.isEmpty()) {
                                 var29 = (class_46)var31.remove(0);
                                 if(!var12.contains(var29) && (var11 || var29 != var28)) {
                                    var12.add(var29);
                                    if(var29 != var26) {
                                       var13.addAll(var29.method_55(1, 0));
                                    }

                                    var31.addAll(var29.method_55(1, 1));
                                    var14.addAll(var29.method_55(2, 1));
                                 }
                              }

                              var15 = true;
                              var14.remove(var17);
                              break;
                           }
                        }
                     }
                  } while(var15);

                  var14.clear();
                  var16 = var12.iterator();

                  while(var16.hasNext()) {
                     var29 = (class_46)var16.next();
                     var14.addAll(var29.method_55(2, 1));
                  }

                  var14.removeAll(var12);
                  var15 = true;
                  var16 = var14.iterator();

                  while(var16.hasNext()) {
                     class_46 var35 = (class_46)var16.next();
                     var17 = null;
                     if(!var35.method_55(2, 0).containsAll(var12)) {
                        var15 = false;
                        break;
                     }
                  }

                  if(var15) {
                     var17 = null;
                     var13.removeAll(var12);
                     if(var13.size() == 0 && (var12.size() > 1 || var26.method_55(1, 0).contains(var26)) && var12.size() < var3.size() && method_809(var12)) {
                        class_52 var33 = new class_52;
                        var33.method_113(var26, var12, var11?null:var28);
                        class_52 var30 = var33;
                        var0.method_25(var30);
                        return var30;
                     }
                  }
               }
            }
         }
      }

      return null;
   }

   // $FF: renamed from: a (java.util.HashSet) boolean
   private static boolean method_809(HashSet var0) {
      Iterator var2 = var0.iterator();

      List var3;
      do {
         class_46 var1;
         do {
            if(!var2.hasNext()) {
               return true;
            }
         } while(!(var1 = (class_46)var2.next()).method_67());

         if((var3 = var1.method_57(1073741824)).size() != 1 || ((class_124)var3.get(0)).method_518() != 1) {
            return false;
         }
      } while(var0.contains(((class_124)var3.get(0)).method_522()));

      return false;
   }

   // $FF: renamed from: b (ca, java.util.HashMap) boolean
   private static boolean method_810(class_46 var0, HashMap var1) {
      boolean var3 = false;

      while(true) {
         boolean var2 = false;
         class_46 var4 = null;
         Iterator var5 = var0.method_40((List)null).iterator();

         while(true) {
            if(var5.hasNext()) {
               class_46 var6;
               if((var4 = (var6 = class_47.method_81(var4 = (class_46)var5.next())) != null?var6:((var6 = class_53.method_116(var4)) != null?var6:((var6 = class_55.method_127(var4)) != null?var6:((var6 = class_49.method_98(var4)) != null?var6:((var6 = class_50.method_101(var4)) != null?var6:((var6 = class_51.method_105(var4)) != null?var6:null)))))) == null) {
                  continue;
               }

               if(var0.field_13 == 0 && var4.method_61() == var0.method_61() && var0.method_63().size() == var4.method_63().size()) {
                  var0.field_13 = 11;
               }

               var0.method_25(var4);
               if(!var1.isEmpty()) {
                  HashSet var9 = new HashSet();
                  Iterator var13 = var4.method_63().iterator();

                  while(var13.hasNext()) {
                     class_46 var10 = (class_46)var13.next();
                     var9.add(var10.field_14);
                  }

                  Integer var12 = var4.field_14;
                  Iterator var11 = (new ArrayList((Collection)var1.keySet())).iterator();

                  while(var11.hasNext()) {
                     Integer var14 = (Integer)var11.next();
                     Set var7;
                     int var8 = (var7 = (Set)var1.get(var14)).size();
                     var7.removeAll(var9);
                     if(var9.contains(var14)) {
                        Object var15;
                        if((var15 = (Set)var1.get(var12)) == null) {
                           var1.put(var12, var15 = new HashSet());
                        }

                        ((Set)var15).addAll(var7);
                        var1.remove(var14);
                     } else if(var7.size() < var8) {
                        var7.add(var12);
                     }
                  }
               }

               var2 = true;
            }

            if(var2) {
               var3 = true;
            }

            if(!var2) {
               return var3;
            }
            break;
         }
      }
   }
}
