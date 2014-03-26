import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

// $FF: renamed from: bd
public final class class_147 {

   // $FF: renamed from: <init> () void
   public void method_667() {
      super();
   }

   // $FF: renamed from: a (S, bn) void
   public final void method_668(class_54 var1, class_128 var2) {
      HashSet var3 = new HashSet();
      class_112 var4 = null;

      boolean var5;
      class_112 var8;
      do {
         var5 = false;
         class_179 var10000 = new class_179;
         var10000.method_822();
         class_179 var6 = var10000;
         var10000.method_823(var1, var2);
         class_173 var7 = new class_173;
         var7.method_794(var4 == null);

         for(class_173 var9 = var7; var9.method_795(var1, var3, var6); var5 = true) {
            ;
         }

         this.method_669(var1);
         class_172.method_787(var1);
         var8 = new class_112;
         var8.method_424();
         var4 = var8;
         var8.method_425(var1, var2);
         if(this.method_671(var1, var4)) {
            var5 = true;
         }

         this.method_669(var1);
      } while(var5);

      var8 = new class_112;
      var8.method_424();
      var4 = var8;
      var8.method_425(var1, var2);
      this.method_671(var1, var4);
      this.method_669(var1);
   }

   // $FF: renamed from: a (ca) void
   private void method_669(class_46 var1) {
      Iterator var2;
      if(var1.method_75() == null) {
         var2 = var1.method_44().iterator();

         while(var2.hasNext()) {
            Object var3;
            if((var3 = var2.next()) instanceof class_46) {
               this.method_669((class_46)var3);
            } else if(var3 instanceof class_86) {
               method_670((class_86)var3);
            }
         }

      } else {
         var2 = var1.method_75().iterator();

         while(var2.hasNext()) {
            method_670((class_86)var2.next());
         }

      }
   }

   // $FF: renamed from: a (aJ) void
   private static void method_670(class_86 var0) {
      List var1;
      (var1 = var0.method_258(true)).add(var0);
      Iterator var2 = var1.iterator();

      while(var2.hasNext()) {
         if((var0 = (class_86)var2.next()).field_148 == 12) {
            ((class_88)var0).method_285(0);
         }
      }

   }

   // $FF: renamed from: a (S, s) boolean
   private boolean method_671(class_54 var1, class_112 var2) {
      class_81 var10000 = new class_81;
      var10000.method_225();
      Object var3 = null;
      class_114 var13 = var10000.method_226(var1);
      boolean var15 = false;
      HashSet var4 = new HashSet();
      LinkedList var5 = new LinkedList();
      LinkedList var6 = new LinkedList();
      var5.add(var13.field_257);
      var6.add(new HashMap());

      while(!var5.isEmpty()) {
         class_148 var14 = (class_148)var5.removeFirst();
         HashMap var7 = (HashMap)var6.removeFirst();
         if(!var4.contains(var14)) {
            var4.add(var14);
            ArrayList var8 = new ArrayList();
            if(!var14.field_372.isEmpty()) {
               var8.add(var14.field_372);
            }

            class_148 var9;
            if(var14.field_373.size() == 1 && (var9 = (class_148)var14.field_373.get(0)).field_368 == 2 && !var9.field_372.isEmpty()) {
               var8.add(((class_148)var14.field_373.get(0)).field_372);
               var14 = var9;
            }

            for(int var16 = 0; var16 < var8.size(); ++var16) {
               List var10 = (List)var8.get(var16);

               int[] var18;
               for(int var11 = 0; var11 < var10.size(); var15 |= var18[1] == 1) {
                  class_86 var12 = null;
                  if(var11 == var10.size() - 1) {
                     if(var16 < var8.size() - 1) {
                        var12 = (class_86)((List)var8.get(var16 + 1)).get(0);
                     }
                  } else {
                     var12 = (class_86)var10.get(var11 + 1);
                  }

                  if((var18 = this.method_673(var10, var11, var12, var7, var2))[0] >= 0) {
                     var11 = var18[0];
                  } else {
                     ++var11;
                  }
               }
            }

            Iterator var17 = var14.field_373.iterator();

            while(var17.hasNext()) {
               var9 = (class_148)var17.next();
               var5.add(var9);
               var6.add(new HashMap(var7));
            }
         }
      }

      return var15;
   }

   // $FF: renamed from: a (aJ, aa, aJ, s) void
   private void method_672(class_86 var1, class_88 var2, class_86 var3, class_112 var4) {
      var1.method_263(var2, var3);
      class_77 var10001 = new class_77;
      var10001.method_216(var2);
      class_184 var6 = var4.method_439(var10001);
      Iterator var9 = method_674(var3).iterator();

      while(var9.hasNext()) {
         class_77 var7 = (class_77)var9.next();
         Iterator var8 = ((class_208)var4.method_438().field_496.method_659(var7)).field_571.method_879().iterator();

         while(var8.hasNext()) {
            Entry var10;
            Integer var5 = (Integer)(var10 = (Entry)var8.next()).getKey();
            if(!var6.method_874(var5.intValue())) {
               var8.remove();
            } else {
               class_141 var11;
               (var11 = (class_141)var10.getValue()).method_635(var6.method_875(var5.intValue()));
               if(var11.method_637()) {
                  var8.remove();
               }
            }
         }
      }

   }

   // $FF: renamed from: a (java.util.List, int, aJ, java.util.HashMap, s) int[]
   private int[] method_673(List var1, int var2, class_86 var3, HashMap var4, class_112 var5) {
      class_86 var6 = (class_86)var1.get(var2);
      int var7 = 0;
      Iterator var9 = var6.method_260().iterator();

      boolean var12;
      while(var9.hasNext()) {
         class_86 var8 = (class_86)var9.next();

         while(true) {
            Object[] var10;
            class_86 var11 = (class_86)(var10 = this.method_675(var8, var6, var3, var4, var5))[0];
            var7 |= ((Boolean)var10[1]).booleanValue()?1:0;
            var12 = ((Boolean)var10[2]).booleanValue();
            if(var11 != null) {
               if(var12) {
                  this.method_672(var6, (class_88)var8, var11, var5);
                  var8 = var11;
               } else {
                  var6.method_263(var8, var11);
               }

               var7 = 1;
            }

            if(!var12) {
               break;
            }
         }
      }

      class_88 var22 = null;
      class_86 var23 = null;
      class_93 var27;
      if(var6.field_148 == 2 && (var27 = (class_93)var6).method_316().field_148 == 12) {
         var22 = (class_88)var27.method_316();
         var23 = var27.method_317();
      }

      if(var22 == null) {
         return new int[]{-1, var7};
      } else {
         class_77 var10000 = new class_77;
         var10000.method_216(var22);
         class_77 var28 = var10000;
         ArrayList var26 = new ArrayList();
         if(!(var12 = method_676(var5, var28, var26)) && var26.isEmpty()) {
            if(var22.method_288() && (var23.field_148 == 8 || var23.field_148 == 2 || var23.field_148 == 10)) {
               class_95 var19;
               if(var23.field_148 == 10 && ((var19 = (class_95)var23).method_333() || var19.method_329().field_135 > 0 || var19.method_329().field_133 != 8)) {
                  return new int[]{-1, var7};
               } else {
                  var1.set(var2, var23);
                  return new int[]{var2 + 1, 1};
               }
            } else if(var23.field_148 == 12) {
               var1.remove(var2);
               return new int[]{var2, 1};
            } else {
               return new int[]{-1, var7};
            }
         } else {
            int var17 = var23.method_255();
            if(!var22.method_288() && (var23.field_148 != 12 || ((class_88)var23).method_288())) {
               return new int[]{-1, var7};
            } else if((var17 & 1) == 0 && (var12 || var26.size() > 1)) {
               return new int[]{-1, var7};
            } else {
               HashMap var18;
               boolean var21;
               if((var21 = (var18 = method_678(var28, var23, var5)).containsKey(Integer.valueOf(var28.field_96))) && var12) {
                  return new int[]{-1, var7};
               } else {
                  HashSet var20 = var3 == null?null:method_674(var3);
                  if(var23.field_148 != 3 && var23.field_148 != 12 && var20 != null && var18.containsKey(Integer.valueOf(var28.field_96))) {
                     Iterator var13 = var26.iterator();

                     while(var13.hasNext()) {
                        class_208 var25 = (class_208)var13.next();
                        class_77 var10001 = new class_77;
                        var10001.method_214(var25.field_566, var25.field_567);
                        if(!var20.contains(var10001)) {
                           return new int[]{-1, var7};
                        }
                     }
                  }

                  var18.remove(Integer.valueOf(var28.field_96));
                  boolean var24 = false;
                  boolean var31 = false;
                  HashSet var14 = new HashSet();
                  Iterator var15 = var26.iterator();

                  while(var15.hasNext()) {
                     class_208 var29 = (class_208)var15.next();
                     var10000 = new class_77;
                     var10000.method_214(var29.field_566, var29.field_567);
                     class_77 var16 = var10000;
                     if(method_677(var10000, var18, var5, var28) && (var23.field_148 == 3 || var23.field_148 == 12 || var23.field_148 == 5 || var20 == null || var20.contains(var16))) {
                        var14.add(var16);
                        var31 = true;
                     } else {
                        var24 = true;
                     }
                  }

                  if(var21 && var24) {
                     return new int[]{-1, var7};
                  } else {
                     class_77 var30;
                     class_86 var32;
                     for(var15 = var14.iterator(); var15.hasNext(); var4.put(var30, var32)) {
                        var30 = (class_77)var15.next();
                        var32 = var23.method_261();
                        if(var23.field_148 == 5 && var5.method_441().containsKey(Integer.valueOf(var23.field_149))) {
                           var5.method_441().put(Integer.valueOf(var32.field_149), (Integer)var5.method_441().get(Integer.valueOf(var23.field_149)));
                        }
                     }

                     if(!var12 && !var24) {
                        var1.remove(var2);
                        return new int[]{var2, 1};
                     } else if(var31) {
                        return new int[]{var2 + 1, var7};
                     } else {
                        return new int[]{-1, var7};
                     }
                  }
               }
            }
         }
      }
   }

   // $FF: renamed from: b (aJ) java.util.HashSet
   private static HashSet method_674(class_86 var0) {
      HashSet var1 = new HashSet();
      ArrayList var2;
      (var2 = new ArrayList(var0.method_258(true))).add(var0);
      Iterator var4 = var2.iterator();

      while(var4.hasNext()) {
         if((var0 = (class_86)var4.next()).field_148 == 12) {
            class_88 var3 = (class_88)var0;
            class_77 var10001 = new class_77;
            var10001.method_216(var3);
            var1.add(var10001);
         }
      }

      return var1;
   }

   // $FF: renamed from: a (aJ, aJ, aJ, java.util.HashMap, s) java.lang.Object[]
   private Object[] method_675(class_86 var1, class_86 var2, class_86 var3, HashMap var4, class_112 var5) {
      boolean var6 = false;
      Iterator var8 = var1.method_260().iterator();

      while(var8.hasNext()) {
         class_86 var7 = (class_86)var8.next();

         while(true) {
            Object[] var9;
            class_86 var10 = (class_86)(var9 = this.method_675(var7, var2, var3, var4, var5))[0];
            var6 |= ((Boolean)var9[1]).booleanValue();
            boolean var11 = ((Boolean)var9[2]).booleanValue();
            if(var10 != null) {
               if(var11) {
                  this.method_672(var1, (class_88)var7, var10, var5);
                  var7 = var10;
               } else {
                  var1.method_263(var7, var10);
               }

               var6 = true;
            }

            if(!var11) {
               break;
            }
         }
      }

      class_86 var23 = null;
      if(var1.field_148 == 12) {
         class_88 var13 = (class_88)var1;
         class_77 var10001 = new class_77;
         var10001.method_216(var13);
         var23 = (class_86)var4.get(var10001);
      }

      if(var23 != null) {
         return new Object[]{var23, Boolean.valueOf(true), Boolean.valueOf(true)};
      } else {
         class_88 var25 = null;
         class_86 var24 = null;
         class_93 var27;
         if(var1.field_148 == 2 && (var27 = (class_93)var1).method_316().field_148 == 12) {
            var25 = (class_88)var27.method_316();
            var24 = var27.method_317();
         }

         if(var25 == null) {
            return new Object[]{null, Boolean.valueOf(var6), Boolean.valueOf(false)};
         } else {
            boolean var29 = false;
            class_98 var26;
            if(var3 == null && var2.field_148 == 9 && (var26 = (class_98)var2).method_358() == 0 && var1.equals(var26.method_359())) {
               var29 = true;
            }

            if(!var25.method_288() && !var29) {
               return new Object[]{null, Boolean.valueOf(var6), Boolean.valueOf(false)};
            } else {
               class_77 var10000 = new class_77;
               var10000.method_216(var25);
               class_77 var31 = var10000;
               ArrayList var14 = new ArrayList();
               boolean var16;
               if(!(var16 = method_676(var5, var31, var14)) && var14.isEmpty()) {
                  return new Object[]{var24, Boolean.valueOf(var6), Boolean.valueOf(false)};
               } else if(!var25.method_288()) {
                  return new Object[]{null, Boolean.valueOf(var6), Boolean.valueOf(false)};
               } else {
                  int var20 = var24.method_255();
                  boolean var22 = false;
                  if((var20 & 3) != 3) {
                     return new Object[]{null, Boolean.valueOf(var6), Boolean.valueOf(false)};
                  } else {
                     HashMap var21;
                     if((var21 = method_678(var31, var24, var5)).containsKey(Integer.valueOf(var31.field_96)) && var16) {
                        return new Object[]{null, Boolean.valueOf(var6), Boolean.valueOf(false)};
                     } else {
                        var21.remove(Integer.valueOf(var31.field_96));
                        HashSet var18 = method_674(var2);
                        if(var3 != null) {
                           var18.addAll(method_674(var3));
                        }

                        boolean var19 = false;
                        HashSet var28 = new HashSet();
                        Iterator var32 = var14.iterator();

                        while(var32.hasNext()) {
                           class_208 var15 = (class_208)var32.next();
                           var10000 = new class_77;
                           var10000.method_214(var15.field_566, var15.field_567);
                           class_77 var12 = var10000;
                           if(method_677(var10000, var21, var5, var31) && (var24.field_148 == 12 || var18.contains(var12))) {
                              var28.add(var12);
                           } else {
                              var19 = true;
                           }
                        }

                        if(!var16 && !var19) {
                           class_77 var17;
                           class_86 var30;
                           for(var32 = var28.iterator(); var32.hasNext(); var4.put(var17, var30)) {
                              var17 = (class_77)var32.next();
                              var30 = var24.method_261();
                              if(var24.field_148 == 5 && var5.method_441().containsKey(Integer.valueOf(var24.field_149))) {
                                 var5.method_441().put(Integer.valueOf(var30.field_149), (Integer)var5.method_441().get(Integer.valueOf(var24.field_149)));
                              }
                           }

                           return new Object[]{var24, Boolean.valueOf(var6), Boolean.valueOf(false)};
                        } else {
                           return new Object[]{null, Boolean.valueOf(var6), Boolean.valueOf(false)};
                        }
                     }
                  }
               }
            }
         }
      }
   }

   // $FF: renamed from: a (s, de, java.util.List) boolean
   private static boolean method_676(class_112 var0, class_77 var1, List var2) {
      class_208 var10 = (class_208)var0.method_438().field_496.method_659(var1);
      HashSet var11 = new HashSet();
      HashSet var3 = new HashSet();
      LinkedList var4;
      (var4 = new LinkedList()).add(var10);

      while(!var4.isEmpty()) {
         class_208 var5 = (class_208)var4.remove(0);
         var11.add(var5);
         if(var5 != var10 && (var5.field_570 & 2) == 0) {
            var2.add(var5);
         }

         Iterator var6 = var5.field_568.iterator();

         while(var6.hasNext()) {
            class_183 var12;
            class_208 var7 = (var12 = (class_183)var6.next()).field_471;
            if(!var11.contains(var12.field_471)) {
               boolean var13 = true;
               Iterator var9 = var7.field_569.iterator();

               while(true) {
                  if(var9.hasNext()) {
                     class_183 var8 = (class_183)var9.next();
                     if(var11.contains(var8.field_470)) {
                        continue;
                     }

                     var13 = false;
                  }

                  if(var13) {
                     var4.add(var7);
                  } else {
                     var3.add(var7);
                  }
                  break;
               }
            }
         }
      }

      var3.removeAll(var11);
      if(var3.isEmpty()) {
         return false;
      } else {
         return true;
      }
   }

   // $FF: renamed from: a (de, java.util.HashMap, s, de) boolean
   private static boolean method_677(class_77 var0, HashMap var1, class_112 var2, class_77 var3) {
      class_192 var4 = var2.method_438();
      class_184 var5;
      if((var5 = var2.method_439(var0)) == null) {
         return false;
      } else if(!class_129.method_558(var2.method_440().get(var3), var2.method_440().get(var0))) {
         return false;
      } else {
         Iterator var9 = var1.entrySet().iterator();

         while(var9.hasNext()) {
            Entry var8 = (Entry)var9.next();
            class_141 var10;
            if((var10 = var5.method_875(((Integer)var8.getKey()).intValue())) == null) {
               return false;
            }

            HashSet var12 = new HashSet();
            Iterator var7 = ((HashSet)var8.getValue()).iterator();

            while(var7.hasNext()) {
               class_77 var6 = (class_77)var7.next();
               var12.add((class_208)var4.field_496.method_659(var6));
            }

            boolean var13 = false;
            Iterator var11 = var10.iterator();

            while(true) {
               if(var11.hasNext()) {
                  Integer var14 = (Integer)var11.next();
                  class_146 var10000 = var4.field_496;
                  class_77 var10001 = new class_77;
                  var10001.method_214(((Integer)var8.getKey()).intValue(), var14.intValue());
                  class_208 var15 = (class_208)var10000.method_659(var10001);
                  if(!var4.method_932(var15, var12)) {
                     continue;
                  }

                  var13 = true;
               }

               if(!var13) {
                  return false;
               }
               break;
            }
         }

         return true;
      }
   }

   // $FF: renamed from: a (de, aJ, s) java.util.HashMap
   private static HashMap method_678(class_77 var0, class_86 var1, class_112 var2) {
      HashMap var3 = new HashMap();
      class_184 var4 = var2.method_439(var0);
      List var5;
      (var5 = var1.method_258(true)).add(var1);
      Iterator var10 = var5.iterator();

      while(var10.hasNext()) {
         HashSet var6;
         Integer var7;
         Iterator var8;
         int var9;
         class_77 var10001;
         if((var1 = (class_86)var10.next()).field_148 == 12) {
            var9 = ((class_88)var1).method_277();
            if(var0.field_96 != var9) {
               if(!var4.method_874(var9)) {
                  throw new RuntimeException("inkonsistent live map!");
               }

               var6 = new HashSet();
               var8 = var4.method_875(var9).iterator();

               while(var8.hasNext()) {
                  var7 = (Integer)var8.next();
                  var10001 = new class_77;
                  var10001.method_214(var9, var7.intValue());
                  var6.add(var10001);
               }

               var3.put(Integer.valueOf(var9), var6);
            } else {
               var3.put(Integer.valueOf(var9), (Object)null);
            }
         } else if(var1.field_148 == 5 && var2.method_441().containsKey(Integer.valueOf(var1.field_149))) {
            var9 = ((Integer)var2.method_441().get(Integer.valueOf(var1.field_149))).intValue();
            if(var4.method_874(var9)) {
               var6 = new HashSet();
               var8 = var4.method_875(var9).iterator();

               while(var8.hasNext()) {
                  var7 = (Integer)var8.next();
                  var10001 = new class_77;
                  var10001.method_214(var9, var7.intValue());
                  var6.add(var10001);
               }

               var3.put(Integer.valueOf(var9), var6);
            }
         }
      }

      return var3;
   }
}
