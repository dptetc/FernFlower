import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Map.Entry;

// $FF: renamed from: aV
public final class class_173 {

   // $FF: renamed from: a boolean
   private boolean field_432;


   // $FF: renamed from: <init> (boolean) void
   public void method_794(boolean var1) {
      super();
      this.field_432 = var1;
   }

   // $FF: renamed from: a (ca, java.util.HashSet, aO) boolean
   public final boolean method_795(class_46 var1, HashSet var2, class_179 var3) {
      boolean var4 = false;
      boolean var5;
      if(var1.method_75() == null) {
         do {
            var5 = false;
            Iterator var7 = var1.method_63().iterator();

            while(var7.hasNext()) {
               class_46 var6 = (class_46)var7.next();
               var4 |= this.method_795(var6, var2, var3);
               if(var5 = class_138.method_595(var6, var2)) {
                  break;
               }

               boolean var10000;
               label105: {
                  class_46 var19;
                  class_55 var18;
                  if((var19 = var6).field_13 == 2 && var19.method_75() == null && (var18 = (class_55)var19).field_49 == class_55.field_48) {
                     class_46 var8 = var18.method_130();
                     class_46 var9 = var18.method_128();
                     if(var8.method_75() != null && var8.method_75().size() == 1 && var9.method_75() != null && var9.method_75().size() == 1 && var8.method_59().size() == 1 && var9.method_59().size() == 1 && ((class_124)var8.method_59().get(0)).method_522() == ((class_124)var9.method_59().get(0)).method_522()) {
                        class_86 var10 = (class_86)var8.method_75().get(0);
                        class_86 var23 = (class_86)var9.method_75().get(0);
                        class_90 var10004;
                        if(var10.field_148 == 2 && var23.field_148 == 2) {
                           class_93 var28 = (class_93)var10;
                           class_93 var24 = (class_93)var23;
                           if(var28.method_316().field_148 == 12 && var24.method_316().field_148 == 12) {
                              class_88 var26 = (class_88)var28.method_316();
                              class_88 var29 = (class_88)var24.method_316();
                              if(var26.method_277() == var29.method_277() && var26.method_288()) {
                                 boolean var13 = false;
                                 Iterator var14 = var3.method_833().entrySet().iterator();

                                 while(var14.hasNext()) {
                                    Entry var21;
                                    if(((class_77)(var21 = (Entry)var14.next()).getKey()).field_96 == var26.method_277() && ((class_141)var21.getValue()).method_631(Integer.valueOf(var26.method_284())) && ((class_141)var21.getValue()).method_631(Integer.valueOf(var29.method_284()))) {
                                       var13 = true;
                                       break;
                                    }
                                 }

                                 if(var13) {
                                    ArrayList var20;
                                    (var20 = new ArrayList()).addAll(var18.method_61().method_75());
                                    class_93 var15 = new class_93;
                                    var10004 = new class_90;
                                    var10004.method_296(36, Arrays.asList(new class_86[]{var18.method_135().method_364(), var28.method_317(), var24.method_317()}));
                                    var15.method_315(var26, var10004);
                                    var20.add(var15);
                                    var18.method_76(var20);
                                    if(var18.method_59().isEmpty()) {
                                       class_124 var30 = (class_124)var8.method_59().get(0);
                                       class_124 var17 = new class_124;
                                       var17.method_516(var30.method_518(), var18, var30.method_522());
                                       class_124 var22 = var17;
                                       var18.method_34(var22);
                                       if(var30.field_303 != null) {
                                          var30.field_303.method_27(var22);
                                       }
                                    }

                                    class_172.method_792(var18);
                                    var10000 = true;
                                    break label105;
                                 }
                              }
                           }
                        } else if(var10.field_148 == 4 && var23.field_148 == 4) {
                           class_89 var27 = (class_89)var10;
                           class_89 var25 = (class_89)var23;
                           if(var27.method_291() == var25.method_291() && var27.method_292() != null && var25.method_292() != null && var27.method_291() == 0 && (var27.method_291() != 1 || var27.method_292().method_254().equals(var25.method_292().method_254()))) {
                              ArrayList var11;
                              (var11 = new ArrayList()).addAll(var18.method_61().method_75());
                              class_89 var10001 = new class_89;
                              int var10003 = var27.method_291();
                              var10004 = new class_90;
                              var10004.method_296(36, Arrays.asList(new class_86[]{var18.method_135().method_364(), var27.method_292(), var25.method_292()}));
                              var10001.method_290(var10003, var10004, var27.method_293());
                              var11.add(var10001);
                              var18.method_76(var11);
                              class_124 var12 = (class_124)var8.method_59().get(0);
                              class_124 var16 = new class_124;
                              var16.method_515(4, var18, var12.method_522(), var12.field_303 == var18?var18.method_71():var12.field_303);
                              var18.method_34(var16);
                              class_172.method_792(var18);
                              var10000 = true;
                              break label105;
                           }
                        }
                     }
                  }

                  var10000 = false;
               }

               var5 = var10000;
               if(var10000) {
                  break;
               }
            }

            var4 |= var5;
         } while(var5);
      } else {
         var4 = false | this.method_796(var1.method_75());
      }

      return var4;
   }

   // $FF: renamed from: a (java.util.List) boolean
   private boolean method_796(List var1) {
      boolean var2 = false;
      int var3 = 0;

      while(var3 < var1.size()) {
         class_86 var4;
         class_86 var5;
         if((var5 = method_800(var4 = (class_86)var1.get(var3))) != null) {
            var1.set(var3, var5);
            var2 = true;
         } else {
            class_98 var7;
            if(var4.field_148 == 9 && (var7 = (class_98)var4).method_358() == 1 && var7.method_359().field_148 == 12 && !((class_88)var7.method_359()).method_288()) {
               var1.remove(var3);
               var2 = true;
            } else {
               class_93 var19;
               boolean var10000;
               label155: {
                  if(var4.field_148 == 2 && (var19 = (class_93)var4).method_316().field_148 == 12 && var19.method_317().field_148 == 12) {
                     class_88 var8 = (class_88)var19.method_316();
                     class_88 var9 = (class_88)var19.method_317();
                     if(var8.method_277() == var9.method_277() && var8.method_288() && var9.method_288()) {
                        var10000 = true;
                        break label155;
                     }
                  }

                  var10000 = false;
               }

               if(var10000) {
                  var1.remove(var3);
                  var2 = true;
               } else {
                  if(var3 == var1.size() - 1) {
                     break;
                  }

                  class_93 var27;
                  label267: {
                     var5 = (class_86)var1.get(var3 + 1);
                     List var6 = var1;
                     class_86 var24;
                     if((var24 = (class_86)var1.get(var3)).field_148 == 2 && (var27 = (class_93)var24).method_316().field_148 == 12 && var27.method_317().field_148 == 10) {
                        class_95 var10;
                        class_83 var11 = (var10 = (class_95)var27.method_317()).method_329();
                        class_77 var45 = new class_77;
                        var45.method_216((class_88)var27.method_316());
                        class_77 var23 = var45;
                        if(var11.field_133 == 8 && var11.field_135 == 0 && var10.method_326() == null) {
                           HashSet var12 = new HashSet();

                           for(int var13 = var3 + 1; var13 < var6.size(); ++var13) {
                              class_86 var14;
                              class_97 var15;
                              Set var16;
                              if((var14 = (class_86)var6.get(var13)).field_148 == 8 && (var15 = (class_97)var14).method_347() == 2 && var15.method_349().field_148 == 12 && var27.method_316().equals(var15.method_349())) {
                                 (var16 = var14.method_259()).remove(var23);
                                 var16.retainAll(var12);
                                 if(var16.isEmpty()) {
                                    var10.method_327(var15);
                                    var15.method_350((class_86)null);
                                    if(!var12.isEmpty()) {
                                       var6.add(var3 + 1, var27.method_261());
                                       var6.remove(var13 + 1);
                                    } else {
                                       var6.set(var13, var27.method_261());
                                    }

                                    var10000 = true;
                                    break label267;
                                 }
                              }

                              boolean var39 = false;
                              class_93 var41;
                              if(var14.field_148 == 2 && (var41 = (class_93)var14).method_316().field_148 == 12 && var41.method_317().field_148 == 12) {
                                 class_77 var10001 = new class_77;
                                 var10001.method_216((class_88)var41.method_316());
                                 var12.add(var10001);
                                 var39 = true;
                              }

                              if(!var39) {
                                 if((var16 = var14.method_259()).contains(var23)) {
                                    break;
                                 }

                                 var12.addAll(var16);
                              }
                           }
                        }
                     }

                     var10000 = false;
                  }

                  if(var10000) {
                     var1.remove(var3);
                     var2 = true;
                  } else if(class_181.method_846("rgn") && method_799(var4, var5)) {
                     var1.remove(var3);
                     var2 = true;
                  } else {
                     int var18;
                     if((var18 = method_797(var1, var3)) > 0) {
                        for(int var22 = 0; var22 < var18; ++var22) {
                           var1.remove(var3 + 1);
                        }

                        var2 = true;
                     } else {
                        class_93 var28;
                        label237: {
                           class_95 var30;
                           if(var4.field_148 == 2 && (var28 = (class_93)var4).method_317().field_148 == 10 && var28.method_316().field_148 == 12 && !(var30 = (class_95)var28.method_317()).method_330().isEmpty()) {
                              class_88 var34 = (class_88)var28.method_316();
                              class_100 var26;
                              class_93 var33;
                              class_86 var38;
                              int var36;
                              if(var5.field_148 == 2 && (var33 = (class_93)var5).method_316().field_148 == 1 && (var26 = (class_100)var33.method_316()).method_367().field_148 == 12 && var34.equals(var26.method_367()) && var26.method_368().field_148 == 3 && (var36 = ((class_87)var26.method_368()).method_274()) < var30.method_330().size() && (var38 = (class_86)var30.method_330().get(var36)).field_148 == 3) {
                                 class_87 var40 = (class_87)var38;
                                 class_83 var42;
                                 (var42 = var30.method_329().method_241()).method_240();
                                 class_87 var43 = class_209.method_1044(var42);
                                 class_86 var17;
                                 if(var40.equals(var43) && !(var17 = var33.method_317()).method_257(var34)) {
                                    var30.method_330().set(var36, var17);
                                    if(var17.field_148 == 10) {
                                       class_95 var20 = (class_95)var17;
                                       boolean var21 = false;
                                       if(var30.method_329().field_135 > 1 && !var20.method_330().isEmpty()) {
                                          var20.method_332();
                                       }
                                    }

                                    var10000 = true;
                                    break label237;
                                 }
                              }
                           }

                           var10000 = false;
                        }

                        if(var10000) {
                           var1.remove(var3 + 1);
                           var2 = true;
                        } else {
                           class_90 var44;
                           label220: {
                              class_90 var31;
                              if(var4.field_148 == 2 && (var19 = (class_93)var4).method_317().field_148 == 6 && ((var31 = (class_90)var19.method_317()).method_301() == 0 || var31.method_301() == 1)) {
                                 class_86 var29 = (class_86)var31.method_303().get(0);
                                 class_86 var35;
                                 if((var35 = (class_86)var31.method_303().get(1)).field_148 != 3 && var29.field_148 == 3 && var31.method_301() == 0) {
                                    var29 = var35;
                                    var35 = (class_86)var31.method_303().get(0);
                                 }

                                 class_86 var37;
                                 if(var35.field_148 == 3 && ((class_87)var35).method_269() && (var37 = var19.method_316()).field_148 != 12 && var37.equals(var29)) {
                                    var44 = new class_90;
                                    var44.method_296(var31.method_301() == 0?35:33, Arrays.asList(new class_86[]{var29}));
                                    var31 = var44;
                                    var44.method_304(class_83.field_118);
                                    var44 = var31;
                                    break label220;
                                 }
                              }

                              var44 = null;
                           }

                           class_90 var25 = var44;
                           if(var44 != null) {
                              var1.set(var3, var25);
                              var2 = true;
                           } else {
                              label205: {
                                 if(var4.field_148 == 2 && var5.field_148 == 6) {
                                    var28 = (class_93)var4;
                                    class_90 var32;
                                    if(((var32 = (class_90)var5).method_301() == 33 || var32.method_301() == 35) && ((class_86)var32.method_303().get(0)).equals(var28.method_317())) {
                                       if(var32.method_301() == 33) {
                                          var32.method_302(32);
                                       } else {
                                          var32.method_302(34);
                                       }

                                       var28.method_318(var32);
                                       var10000 = true;
                                       break label205;
                                    }
                                 }

                                 var10000 = false;
                              }

                              if(var10000) {
                                 var1.remove(var3 + 1);
                                 var2 = true;
                              } else if(method_798(var4, var5)) {
                                 var1.remove(var3 + 1);
                                 var2 = true;
                              } else {
                                 if(!this.field_432) {
                                    label190: {
                                       if(var4.field_148 == 2 && var5.field_148 == 2) {
                                          var28 = (class_93)var4;
                                          var27 = (class_93)var5;
                                          if(var28.method_316().field_148 == 12 && var27.method_317().field_148 == 12 && var28.method_316().equals(var27.method_317()) && ((class_88)var28.method_316()).method_288() && (var27.method_316().field_148 != 12 || !((class_88)var27.method_316()).method_288())) {
                                             class_93 var46 = new class_93;
                                             var46.method_315(var27.method_316(), var28.method_317());
                                             var28.method_318(var46);
                                             var10000 = true;
                                             break label190;
                                          }
                                       }

                                       var10000 = false;
                                    }

                                    if(var10000) {
                                       var1.remove(var3 + 1);
                                       var2 = true;
                                       continue;
                                    }
                                 }

                                 ++var3;
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      }

      return var2;
   }

   // $FF: renamed from: a (java.util.List, int) int
   private static int method_797(List var0, int var1) {
      class_86 var2;
      class_95 var3;
      class_93 var14;
      if((var2 = (class_86)var0.get(var1)).field_148 == 2 && (var14 = (class_93)var2).method_317().field_148 == 10 && var14.method_316().field_148 == 12 && (var3 = (class_95)var14.method_317()).method_254().field_135 > 0 && var3.method_328().size() == 1 && var3.method_330().isEmpty() && ((class_86)var3.method_328().get(0)).field_148 == 3) {
         int var4;
         if((var4 = ((Integer)((class_87)var3.method_328().get(0)).method_273()).intValue()) == 0) {
            return 0;
         }

         class_88 var15 = (class_88)var14.method_316();
         HashMap var5 = new HashMap();

         for(int var6 = 1; var1 + var6 < var0.size() && var6 <= var4; ++var6) {
            boolean var9 = false;
            class_93 var7;
            class_100 var8;
            class_86 var10;
            int var20;
            if((var10 = (class_86)var0.get(var1 + var6)).field_148 == 2 && (var7 = (class_93)var10).method_316().field_148 == 1 && (var8 = (class_100)var7.method_316()).method_367().field_148 == 12 && var15.equals(var8.method_367()) && var8.method_368().field_148 == 3 && (var20 = ((class_87)var8.method_368()).method_274()) < var4 && !var5.containsKey(Integer.valueOf(var20)) && !var7.method_317().method_257(var15)) {
               var5.put(Integer.valueOf(var20), var7.method_317());
               var9 = true;
            }

            if(!var9) {
               break;
            }
         }

         double var22 = (double)var5.size() / (double)var4;
         if(var15.method_288() && var22 > 0.0D || var4 <= 7 && var22 >= 0.3D || var4 > 7 && var22 >= 0.7D) {
            ArrayList var18 = new ArrayList();
            class_83 var19;
            (var19 = var3.method_329().method_241()).method_240();
            class_87 var21 = class_209.method_1044(var19);

            int var11;
            for(var11 = 0; var11 < var4; ++var11) {
               var18.add(var21.method_261());
            }

            var11 = var3.method_329().field_135;
            Iterator var16 = var5.entrySet().iterator();

            while(var16.hasNext()) {
               Entry var12;
               class_86 var17 = (class_86)(var12 = (Entry)var16.next()).getValue();
               var18.set(((Integer)var12.getKey()).intValue(), var17);
               if(var17.field_148 == 10) {
                  class_95 var13 = (class_95)var17;
                  if(var11 > 1 && !var13.method_330().isEmpty()) {
                     var13.method_332();
                  }
               }
            }

            var3.method_331(var18);
            return var5.size();
         }
      }

      return 0;
   }

   // $FF: renamed from: a (aJ, aJ) boolean
   private static boolean method_798(class_86 var0, class_86 var1) {
      if(var0.field_148 == 2 && var1.field_148 == 2) {
         class_93 var2 = (class_93)var0;
         class_93 var3 = (class_93)var1;

         while(true) {
            if(var2.method_317().equals(var3.method_317()) && var2.method_316().field_148 == 12 && ((class_88)var2.method_316()).method_288() && (var3.method_316().field_148 != 12 || !((class_88)var3.method_316()).method_288()) && !var3.method_316().method_257(var2.method_316())) {
               var2.method_318(var3);
               return true;
            }

            if(var2.method_317().field_148 != 2) {
               break;
            }

            var2 = (class_93)var2.method_317();
         }
      }

      return false;
   }

   // $FF: renamed from: b (aJ, aJ) boolean
   private static boolean method_799(class_86 var0, class_86 var1) {
      class_97 var3;
      if(var0.field_148 == 8 && !(var3 = (class_97)var0).method_351() && var3.method_349().field_148 == 12 && var3.method_353().equals("getClass") && var3.method_355().equals("()Ljava/lang/Class;")) {
         List var2;
         (var2 = var1.method_260()).add(var1);
         Iterator var6 = var2.iterator();

         while(var6.hasNext()) {
            class_95 var4;
            if((var1 = (class_86)var6.next()).field_148 == 10 && (var4 = (class_95)var1).method_326() != null && !var4.method_326().method_341().isEmpty() && ((class_86)var4.method_326().method_341().get(0)).equals(var3.method_349())) {
               String var5 = var4.method_329().field_136;
               class_177 var7;
               if((var7 = (class_177)class_181.method_855().method_588().get(var5)) != null && var7.field_435 != 0) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   // $FF: renamed from: a (aJ) aJ
   private static class_86 method_800(class_86 var0) {
      List var10000 = var0.method_260();
      class_86 var1 = null;
      Iterator var2 = var10000.iterator();

      while(var2.hasNext()) {
         class_86 var3;
         if((var3 = method_800(var1 = (class_86)var2.next())) != null) {
            var0.method_263(var1, var3);
         }
      }

      class_97 var4;
      if(var0.field_148 == 8 && (var4 = (class_97)var0).method_347() == 2 && var4.method_349().field_148 == 10) {
         class_95 var5;
         (var5 = (class_95)var4.method_349()).method_327(var4);
         var4.method_350((class_86)null);
         return var5;
      } else {
         return null;
      }
   }
}
