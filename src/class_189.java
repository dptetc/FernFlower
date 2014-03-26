import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

// $FF: renamed from: bU
public final class class_189 {

   // $FF: renamed from: a java.util.HashMap
   private HashMap field_482;
   // $FF: renamed from: b java.util.HashMap
   private HashMap field_483;
   // $FF: renamed from: c ce
   private class_164 field_484;


   // $FF: renamed from: <init> (ce) void
   public void method_896(class_164 var1) {
      super();
      this.field_482 = new HashMap();
      this.field_483 = new HashMap();
      this.field_484 = var1;
   }

   // $FF: renamed from: a (bn, S, cI) boolean
   public final boolean method_897(class_128 var1, class_54 var2, class_139 var3) {
      LinkedList var4;
      (var4 = new LinkedList()).add(var2);

      class_46 var5;
      for(; !var4.isEmpty(); var4.addAll(var5.method_63())) {
         class_46 var6;
         if((var6 = (var5 = (class_46)var4.removeLast()).method_71()) != null && var6.field_13 == 12 && var5 == var6.method_61() && !var6.method_77()) {
            class_51 var11;
            class_191 var7 = (var11 = (class_51)var6).method_68().method_94();
            class_191 var8 = var11.method_106().method_68().method_94();
            if(!this.field_483.containsKey(Integer.valueOf(var8.field_488))) {
               if(!this.field_482.containsKey(Integer.valueOf(var8.field_488))) {
                  Object[] var12;
                  if((var12 = method_898(var1, var2, var11)) == null) {
                     this.field_483.put(Integer.valueOf(var8.field_488), (Object)null);
                  } else {
                     if(class_181.method_846("fdi") && this.method_902(var3, var11, var12)) {
                        this.field_482.put(Integer.valueOf(var8.field_488), (Object)null);
                     } else {
                        int var10 = class_181.method_853().method_814(2);
                        this.method_899(var3, method_901(var11.method_61()), var7, var8, var10, var12);
                        this.field_482.put(Integer.valueOf(var8.field_488), Integer.valueOf(var10));
                     }

                     class_113.method_443(var3);
                     class_113.method_444(var3);
                     class_113.method_449(var3);
                  }

                  return true;
               }

               var11.method_108();
               Integer var9 = (Integer)this.field_482.get(Integer.valueOf(var8.field_488));
               class_88 var10001;
               if(var9 == null) {
                  var10001 = null;
               } else {
                  var10001 = new class_88;
                  var10001.method_276(var9.intValue(), class_83.field_118, this.field_484);
               }

               var11.method_110(var10001);
            }
         }
      }

      return false;
   }

   // $FF: renamed from: a (bn, S, h) java.lang.Object[]
   private static Object[] method_898(class_128 var0, class_54 var1, class_51 var2) {
      HashMap var3 = new HashMap();
      class_48 var4;
      class_191 var5;
      class_5 var6 = (var5 = (var4 = var2.method_106().method_68()).method_94()).method_911();
      byte var7 = 0;
      switch(var6.field_5) {
      case 58:
         var7 = 2;
         break;
      case 87:
         var7 = 1;
      }

      class_209 var10000 = new class_209;
      var10000.method_1027();
      var10000.method_1028(var1, var0.method_553().method_973());
      class_179 var36 = new class_179;
      var36.method_822();
      var36.method_823(var1, var0);
      List var16 = var4.method_75();
      class_77 var37 = new class_77;
      var37.method_216((class_88)((class_93)var16.get(var7 == 2?1:0)).method_316());
      class_77 var17 = var37;
      class_81 var35 = new class_81;
      var35.method_225();
      class_114 var18 = var35.method_226(var1);
      LinkedList var20;
      (var20 = new LinkedList()).add(var18.field_257);
      HashSet var19 = new HashSet();

      while(!var20.isEmpty()) {
         class_148 var22 = (class_148)var20.removeFirst();
         if(!var19.contains(var22)) {
            var19.add(var22);
            class_48 var8 = null;
            if(var22.field_370 != null) {
               var8 = var22.field_370;
            } else if(var22.field_374.size() == 1) {
               var8 = ((class_148)var22.field_374.get(0)).field_370;
            }

            boolean var9 = true;
            if(var7 != 1) {
               var9 = false;

               for(int var10 = 0; var10 < var22.field_372.size(); ++var10) {
                  class_86 var11 = (class_86)var22.field_372.get(var10);
                  if(var7 == 0) {
                     List var12;
                     (var12 = var11.method_260()).add(var11);
                     boolean var13 = false;
                     Iterator var15 = var12.iterator();

                     while(var15.hasNext()) {
                        class_86 var14;
                        if((var14 = (class_86)var15.next()).field_148 == 12) {
                           var37 = new class_77;
                           var37.method_216((class_88)var14);
                           if(var37.equals(var17)) {
                              var13 = true;
                              break;
                           }
                        }
                     }

                     if(var13) {
                        var13 = false;
                        class_89 var32;
                        if(var11.field_148 == 4 && (var32 = (class_89)var11).method_291() == 1 && var32.method_292().field_148 == 12) {
                           var13 = true;
                        }

                        if(!var13) {
                           return null;
                        }

                        var9 = true;
                     }
                  } else {
                     class_93 var27;
                     if(var7 == 2 && var11.field_148 == 2 && (var27 = (class_93)var11).method_317().field_148 == 12) {
                        var37 = new class_77;
                        var37.method_216((class_88)var27.method_317());
                        if(var37.equals(var17)) {
                           class_86 var29 = null;
                           if(var10 == var22.field_372.size() - 1) {
                              class_148 var33;
                              if(var22.field_373.size() == 1 && !(var33 = (class_148)var22.field_373.get(0)).field_372.isEmpty()) {
                                 var29 = (class_86)var33.field_372.get(0);
                              }
                           } else {
                              var29 = (class_86)var22.field_372.get(var10 + 1);
                           }

                           boolean var30 = false;
                           class_89 var31;
                           if(var29 != null && var29.field_148 == 4 && (var31 = (class_89)var29).method_291() == 1 && var31.method_292().field_148 == 12 && var27.method_316().equals(var31.method_292())) {
                              var30 = true;
                           }

                           if(!var30) {
                              return null;
                           }

                           var9 = true;
                        }
                     }
                  }
               }
            }

            if(var8 != null && var8.method_94() != null) {
               class_46 var25 = var2.method_106();
               Iterator var28 = var8.method_57(1073741824).iterator();

               while(var28.hasNext()) {
                  class_124 var24;
                  Boolean var34;
                  if((var24 = (class_124)var28.next()).method_518() != 1 && var25.method_41(var8) && !var25.method_41(var24.method_522()) && ((var34 = (Boolean)var3.get(var8.method_94())) == null || !var34.booleanValue())) {
                     var3.put(var8.method_94(), Boolean.valueOf(var9));
                     break;
                  }
               }
            }

            var20.addAll(var22.field_373);
         }
      }

      if(var2.method_106().field_13 == 8) {
         boolean var21 = false;
         boolean var23 = var3.containsKey(var5);
         class_61 var26 = var5.method_925();
         switch(var7) {
         case 0:
            var21 = var23 && var26.method_176() == 1;
            break;
         case 1:
            var21 = var26.method_176() == 1;
            break;
         case 2:
            var21 = var23?var26.method_176() == 3:var26.method_176() == 1;
         }

         if(var21) {
            var7 = 3;
         }
      }

      return new Object[]{Integer.valueOf(var7), var3};
   }

   // $FF: renamed from: a (cI, java.util.HashSet, bT, bT, int, java.lang.Object[]) void
   private void method_899(class_139 var1, HashSet var2, class_191 var3, class_191 var4, int var5, Object[] var6) {
      HashSet var11 = new HashSet(var2);
      int var7 = ((Integer)var6[0]).intValue();
      HashMap var19 = (HashMap)var6[1];
      method_907(var4, 1, var7);
      Iterator var18 = var19.entrySet().iterator();

      class_191 var8;
      while(var18.hasNext()) {
         Entry var16;
         var8 = (class_191)(var16 = (Entry)var18.next()).getKey();
         if(((Boolean)var16.getValue()).booleanValue()) {
            method_907(var8, 2, var7);
            var1.method_623().add(var8);
         }
      }

      var18 = var2.iterator();

      class_191 var12;
      class_62 var14;
      class_191 var15;
      Iterator var21;
      while(var18.hasNext()) {
         List var10000 = (var4 = (class_191)var18.next()).method_927();
         var8 = null;
         var21 = var10000.iterator();

         while(var21.hasNext()) {
            var12 = (class_191)var21.next();
            if(!var11.contains(var12) && var12 != var1.method_622()) {
               var14 = new class_62;
               var14.method_165();
               class_62 var9 = var14;
               var14.method_168(class_213.method_1067(16, false, 1, new int[1]), -1);
               var9.method_168(class_213.method_1067(54, false, 1, new int[]{var5}), -1);
               var15 = new class_191;
               var15.method_910(++var1.field_346);
               var8 = var15;
               var15.method_926(var9);
               var4.method_917(var12, var8);
               var8.method_915(var12);
               var11.add(var8);
               var1.method_618().method_655(var8, Integer.valueOf(var8.field_488));

               for(int var13 = 0; var13 < var4.method_928().size(); ++var13) {
                  class_191 var22 = (class_191)var4.method_928().get(var13);
                  class_201 var10 = var1.method_605(var22, var4);
                  var8.method_920(var22);
                  var10.method_989().add(var8);
               }
            }
         }
      }

      var14 = new class_62;
      var14.method_165();
      class_62 var17 = var14;
      var14.method_168(class_213.method_1067(16, false, 1, new int[]{1}), -1);
      var17.method_168(class_213.method_1067(54, false, 1, new int[]{var5}), -1);
      var15 = new class_191;
      var15.method_910(++var1.field_346);
      class_191 var20 = var15;
      var15.method_926(var17);
      method_900(var1, var3, var20);
      var14 = new class_62;
      var14.method_165();
      var17 = var14;
      var14.method_168(class_213.method_1067(16, false, 1, new int[1]), -1);
      var17.method_168(class_213.method_1067(54, false, 1, new int[]{var5}), -1);
      var15 = new class_191;
      var15.method_910(++var1.field_346);
      var8 = var15;
      var15.method_926(var17);
      method_900(var1, var20, var8);
      var11.add(var20);
      var11.add(var8);
      var21 = (new HashSet(var8.method_928())).iterator();

      while(var21.hasNext()) {
         var12 = (class_191)var21.next();
         class_201 var23 = var1.method_605(var12, var8);
         if(var11.containsAll(var23.method_989())) {
            var8.method_921(var12);
            var23.method_989().remove(var8);
         }
      }

   }

   // $FF: renamed from: a (cI, bT, bT) void
   private static void method_900(class_139 var0, class_191 var1, class_191 var2) {
      ArrayList var3;
      (var3 = new ArrayList()).addAll(var1.method_924());
      var3.addAll(var1.method_929());
      Iterator var4 = var3.iterator();

      while(var4.hasNext()) {
         ((class_191)var4.next()).method_917(var1, var2);
      }

      var4 = var1.method_928().iterator();

      while(var4.hasNext()) {
         class_191 var6 = (class_191)var4.next();
         class_201 var5 = var0.method_605(var6, var1);
         var2.method_920(var6);
         var5.method_989().add(var2);
      }

      var4 = var0.method_621().iterator();

      while(var4.hasNext()) {
         class_201 var7;
         if((var7 = (class_201)var4.next()).method_987() == var1) {
            var7.method_988(var2);
         }
      }

      var2.method_915(var1);
      var0.method_618().method_655(var2, Integer.valueOf(var2.field_488));
      if(var0.method_619() == var1) {
         var0.method_620(var2);
      }

   }

   // $FF: renamed from: a (ca) java.util.HashSet
   private static HashSet method_901(class_46 var0) {
      LinkedList var1;
      (var1 = new LinkedList()).add(var0);
      int var3 = 0;

      do {
         class_46 var2;
         if((var2 = (class_46)var1.get(var3)).field_13 == 8) {
            ++var3;
         } else {
            var1.addAll(var2.method_63());
            var1.remove(var3);
         }
      } while(var3 < var1.size());

      HashSet var5 = new HashSet();
      Iterator var4 = var1.iterator();

      while(var4.hasNext()) {
         var0 = (class_46)var4.next();
         var5.add(((class_48)var0).method_94());
      }

      return var5;
   }

   // $FF: renamed from: a (cI, h, java.lang.Object[]) boolean
   private boolean method_902(class_139 var1, class_51 var2, Object[] var3) {
      HashSet var4 = method_901(var2.method_61());
      HashSet var5 = method_901(var2.method_106());
      int var6 = ((Integer)var3[0]).intValue();
      HashMap var12 = (HashMap)var3[1];
      class_191 var7 = var2.method_106().method_68().method_94();
      boolean var8 = false;
      if(var6 == 3) {
         method_907(var7, 3, var6);
         if(var12.containsKey(var7)) {
            var1.method_623().add(var7);
         }

         return true;
      } else {
         class_191 var9;
         if(var7.method_925().method_176() == 1 && var6 > 0) {
            var9 = (class_191)var7.method_927().get(0);
            if(var5.contains(var9)) {
               var7 = var9;
               var8 = true;
            }
         }

         HashSet var14 = new HashSet();
         Iterator var11 = var4.iterator();

         while(var11.hasNext()) {
            class_191 var10 = (class_191)var11.next();
            var14.addAll(var10.method_927());
         }

         var14.remove(var1.method_622());
         var14.removeAll(var4);
         ArrayList var17 = new ArrayList();
         Iterator var13 = var14.iterator();

         while(var13.hasNext()) {
            class_191 var16 = (class_191)var13.next();
            Object[] var15;
            if((var15 = this.method_903(var1, var16, var5, var7, var6, var12, var8)) == null) {
               return false;
            }

            var17.add(new Object[]{var16, var15[0], var15[1]});
         }

         var13 = var17.iterator();

         while(var13.hasNext()) {
            Object[] var18 = (Object[])var13.next();
            method_906(var1, var18);
         }

         var13 = var12.entrySet().iterator();

         while(var13.hasNext()) {
            Entry var19;
            var9 = (class_191)(var19 = (Entry)var13.next()).getKey();
            if(((Boolean)var19.getValue()).booleanValue()) {
               method_907(var9, 2, var6);
               var1.method_623().add(var9);
            }
         }

         method_907(var2.method_106().method_68().method_94(), 1, var6);
         return true;
      }
   }

   // $FF: renamed from: a (cI, bT, java.util.HashSet, bT, int, java.util.HashMap, boolean) java.lang.Object[]
   private Object[] method_903(class_139 var1, class_191 var2, HashSet var3, class_191 var4, int var5, HashMap var6, boolean var7) {
      LinkedList var8 = new LinkedList();
      HashSet var9 = new HashSet();
      HashMap var10 = new HashMap();
      class_64 var10001 = new class_64;
      var10001.method_185(var4, var2, new ArrayList());
      var8.add(var10001);

      while(!var8.isEmpty()) {
         class_64 var21;
         class_191 var11 = (var21 = (class_64)var8.remove(0)).field_75;
         class_191 var12 = var21.field_76;
         boolean var13 = !var7 && var11 == var4;
         boolean var14;
         boolean var15 = (var14 = var6.containsKey(var11)) && ((Boolean)var6.get(var11)).booleanValue();
         if(!this.method_905(var1, var11, var12, (var13?1:0) | (var15?2:0), var5, var21.field_77)) {
            return null;
         }

         if(var12.method_927().size() != var11.method_927().size()) {
            return null;
         }

         var9.add(var12);

         class_191 var17;
         class_191 var16;
         int var22;
         for(var22 = 0; var22 < var11.method_927().size(); ++var22) {
            var16 = (class_191)var11.method_927().get(var22);
            var17 = (class_191)var12.method_927().get(var22);
            if(var3.contains(var16) && !var9.contains(var17)) {
               var10001 = new class_64;
               var10001.method_185(var16, var17, var21.field_77);
               var8.add(var10001);
            }
         }

         if(!var14 || !var12.method_925().method_177()) {
            if(var11.method_928().size() != var12.method_928().size()) {
               return null;
            }

            for(var22 = 0; var22 < var11.method_928().size(); ++var22) {
               var16 = (class_191)var11.method_928().get(var22);
               var17 = (class_191)var12.method_928().get(var22);
               String var18 = var1.method_605(var16, var11).method_990();
               String var19 = var1.method_605(var17, var12).method_990();
               boolean var10000 = var18 == null?var19 == null:var18.equals(var19);
               boolean var28 = false;
               if(!var10000) {
                  return null;
               }

               if(var3.contains(var16) && !var9.contains(var17)) {
                  Object var27 = var21.field_77;
                  if(var16.method_925().method_176() > 0 && var17.method_925().method_176() > 0) {
                     class_5 var26 = var16.method_925().method_171(0);
                     class_5 var20 = var17.method_925().method_171(0);
                     if(var26.field_5 == 58 && var20.field_5 == 58) {
                        (var27 = new ArrayList((Collection)var27)).add(new int[]{var26.method_15(0), var20.method_15(0)});
                     }
                  }

                  var10001 = new class_64;
                  var10001.method_185(var16, var17, (List)var27);
                  var8.add(var10001);
               }
            }
         }

         if(var14) {
            HashSet var23;
            (var23 = new HashSet(var12.method_927())).removeAll(var9);
            Iterator var25 = var8.iterator();

            while(var25.hasNext()) {
               class_64 var24 = (class_64)var25.next();
               var23.remove(var24.field_76);
            }

            var25 = var23.iterator();

            while(var25.hasNext()) {
               var16 = (class_191)var25.next();
               if(var1.method_622() != var16) {
                  var10.put(var12.field_488 + "#" + var16.field_488, new class_191[]{var12, var16, var15?var16:null});
               }
            }
         }
      }

      return new Object[]{var9, method_904(var1, new HashSet(var10.values()))};
   }

   // $FF: renamed from: a (cI, java.util.HashSet) bT
   private static class_191 method_904(class_139 var0, HashSet var1) {
      class_191 var2 = null;
      boolean var3 = false;
      Iterator var5 = var1.iterator();

      class_191[] var4;
      while(var5.hasNext()) {
         if((var4 = (class_191[])var5.next())[2] != null) {
            var2 = var4[1];
            var3 = false;
            break;
         }

         if(var2 == null) {
            var2 = var4[1];
         } else if(var2 != var4[1]) {
            var3 = true;
         }

         if(var4[1].method_924().size() == 1) {
            var2 = var4[1];
         }
      }

      if(var3) {
         var5 = var1.iterator();

         while(var5.hasNext()) {
            class_191[] var10000 = (class_191[])var5.next();
            var4 = null;
            class_191 var12;
            if((var12 = var10000[1]) != var2) {
               List var10 = var2.method_927();
               List var6 = var12.method_927();
               List var14 = var10;
               boolean var11;
               if(var10 == null) {
                  var11 = var6 == null;
               } else {
                  label72: {
                     if(var6 != null && var14.size() == var6.size()) {
                        HashSet var16;
                        (var16 = new HashSet(var14)).removeAll(var6);
                        if(var16.size() == 0) {
                           var11 = true;
                           break label72;
                        }
                     }

                     var11 = false;
                  }
               }

               if(!var11) {
                  return null;
               }

               class_61 var15 = var2.method_925();
               class_61 var13 = var12.method_925();
               if(var15.method_176() != var13.method_176()) {
                  return null;
               }

               for(int var17 = 0; var17 < var15.method_176(); ++var17) {
                  class_5 var7 = var15.method_171(var17);
                  class_5 var8 = var13.method_171(var17);
                  if(var7.field_5 != var8.field_5 || var7.field_7 != var8.field_7 || var7.method_14() != var8.method_14()) {
                     return null;
                  }

                  for(int var9 = 0; var17 < var7.method_18().length; ++var9) {
                     if(var7.method_15(var9) != var8.method_15(var9)) {
                        return null;
                     }
                  }
               }
            }
         }

         var5 = var1.iterator();

         while(var5.hasNext()) {
            if((var4 = (class_191[])var5.next())[1] != var2) {
               var4[0].method_916(var4[1]);
               var4[0].method_915(var2);
            }
         }

         class_113.method_443(var0);
      }

      return var2;
   }

   // $FF: renamed from: a (cI, bT, bT, int, int, java.util.List) boolean
   private boolean method_905(class_139 var1, class_191 var2, class_191 var3, int var4, int var5, List var6) {
      class_61 var12 = var2.method_925();
      class_61 var16 = var3.method_925();
      if(var4 != 0) {
         var12 = var12.method_166();
         if((var4 & 1) > 0 && var5 > 0) {
            var12.method_170(0);
         }

         if((var4 & 2) > 0) {
            if(var5 == 0 || var5 == 2) {
               var12.method_170(var12.method_176() - 1);
            }

            if(var5 == 2) {
               var12.method_170(var12.method_176() - 1);
            }
         }
      }

      if(var12.method_176() > var16.method_176()) {
         return false;
      } else {
         for(var4 = 0; var4 < var12.method_176(); ++var4) {
            class_5 var21 = var12.method_171(var4);
            class_5 var7 = var16.method_171(var4);
            class_5 var10000 = var21;
            var7 = var7;
            var21 = var21;
            boolean var20;
            if(var10000.field_5 == var7.field_5 && var21.field_7 == var7.field_7 && var21.method_14() == var7.method_14()) {
               label104: {
                  if(var21.field_6 != 2 && var21.method_18() != null) {
                     label100:
                     for(int var9 = 0; var9 < var21.method_18().length; ++var9) {
                        int var10 = var21.method_15(var9);
                        int var11 = var7.method_15(var9);
                        if(var10 != var11) {
                           if(var21.field_5 == 25 || var21.field_5 == 58) {
                              Iterator var27 = var6.iterator();

                              while(var27.hasNext()) {
                                 class_41[] var24;
                                 if((var24 = (class_41[])var27.next())[0] == var10 && var24[1] == var11) {
                                    break label100;
                                 }
                              }
                           }

                           var20 = false;
                           break label104;
                        }
                     }
                  }

                  var20 = true;
               }
            } else {
               var20 = false;
            }

            if(!var20) {
               return false;
            }
         }

         if(var12.method_176() < var16.method_176()) {
            class_62 var15 = new class_62;
            var15.method_165();
            class_62 var23 = var15;

            for(var5 = var16.method_176() - 1; var5 >= var12.method_176(); --var5) {
               var23.method_169(var16.method_171(var5));
               var16.method_170(var5);
            }

            class_191 var18 = new class_191;
            var18.method_910(++var1.field_346);
            class_191 var25 = var18;
            var18.method_926(var23);
            ArrayList var26;
            (var26 = new ArrayList()).addAll(var3.method_927());
            Iterator var17 = var26.iterator();

            class_191 var13;
            while(var17.hasNext()) {
               var13 = (class_191)var17.next();
               var3.method_916(var13);
               var25.method_915(var13);
            }

            var3.method_915(var25);
            var1.method_618().method_655(var25, Integer.valueOf(var25.field_488));
            HashSet var14;
            if((var14 = var1.method_623()).contains(var3)) {
               var14.remove(var3);
               var14.add(var25);
            }

            for(int var19 = 0; var19 < var3.method_928().size(); ++var19) {
               var13 = (class_191)var3.method_928().get(var19);
               class_201 var22 = var1.method_605(var13, var3);
               var25.method_920(var13);
               var22.method_989().add(var25);
            }
         }

         return true;
      }
   }

   // $FF: renamed from: a (cI, java.lang.Object[]) void
   private static void method_906(class_139 var0, Object[] var1) {
      class_191 var2 = (class_191)var1[0];
      class_191 var3 = (class_191)var1[2];
      if(var2 != var3) {
         if(var3 == null) {
            var3 = var0.method_622();
         }

         Iterator var5 = (new ArrayList(var2.method_924())).iterator();

         HashSet var4;
         while(var5.hasNext()) {
            class_191 var10000 = (class_191)var5.next();
            var4 = null;
            var10000.method_917(var2, var3);
         }

         Iterator var7 = (var4 = (HashSet)var1[1]).iterator();

         while(var7.hasNext()) {
            class_191 var8 = (class_191)var7.next();
            if(var0.method_618().method_662(Integer.valueOf(var8.field_488))) {
               if(var8.method_925().method_177() && var8.method_927().size() == 1) {
                  var2 = (class_191)var8.method_927().get(0);
                  Iterator var6 = (new ArrayList(var8.method_924())).iterator();

                  while(var6.hasNext()) {
                     var3 = (class_191)var6.next();
                     if(!var4.contains(var3)) {
                        var3.method_917(var8, var2);
                     }
                  }

                  if(var0.method_619() == var8) {
                     var0.method_620(var2);
                  }
               }

               var0.method_604(var8);
            }
         }

      }
   }

   // $FF: renamed from: a (bT, int, int) void
   private static void method_907(class_191 var0, int var1, int var2) {
      class_61 var3 = var0.method_925();
      if(var2 == 3) {
         for(var1 = var3.method_176() - 1; var1 >= 0; --var1) {
            var3.method_170(var1);
         }

      } else {
         if((var1 & 1) > 0 && (var2 == 2 || var2 == 1)) {
            var3.method_170(0);
         }

         if((var1 & 2) > 0) {
            if(var2 == 2 || var2 == 0) {
               var3.method_170(var3.method_176() - 1);
            }

            if(var2 == 2) {
               var3.method_170(var3.method_176() - 1);
            }
         }

      }
   }
}
