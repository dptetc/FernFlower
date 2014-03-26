import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

// $FF: renamed from: cH
public final class class_138 {

   // $FF: renamed from: <init> () void
   public void method_592() {
      super();
   }

   // $FF: renamed from: a (S) boolean
   public static boolean method_593(class_54 var0) {
      boolean var1;
      if(var1 = method_594(var0, new HashSet())) {
         class_172.method_787(var0);
      }

      return var1;
   }

   // $FF: renamed from: b (ca, java.util.HashSet) boolean
   private static boolean method_594(class_46 var0, HashSet var1) {
      boolean var2 = false;
      boolean var3;
      if(var0.method_75() == null) {
         do {
            var3 = false;
            Iterator var4 = var0.method_63().iterator();

            while(var4.hasNext()) {
               class_46 var5 = (class_46)var4.next();
               var2 |= method_594(var5, var1);
               if(var3 = method_595(var5, var1)) {
                  break;
               }
            }

            var2 |= var3;
         } while(var3);
      }

      return var2;
   }

   // $FF: renamed from: a (ca, java.util.HashSet) boolean
   public static boolean method_595(class_46 var0, HashSet var1) {
      if(var0.field_13 != 2 && var0.field_13 != 15) {
         return false;
      } else {
         boolean var2 = false;

         while(true) {
            boolean var3 = false;
            ArrayList var4 = new ArrayList();
            if(var0.field_13 == 2) {
               var4.add(var0);
            } else {
               var4.addAll(var0.method_63());
            }

            boolean var5 = var4.size() == 1;
            Iterator var6 = var4.iterator();

            while(var6.hasNext()) {
               class_46 var15;
               if((var15 = (class_46)var6.next()).field_13 == 2) {
                  class_55 var8;
                  class_124 var12;
                  class_152 var10000;
                  if((var8 = (class_55)var15).field_49 == class_55.field_48) {
                     var10000 = null;
                  } else {
                     var10000 = new class_152;
                     var10000.method_708(var8);
                     class_152 var10 = var10000;
                     class_46 var11;
                     class_152 var10001;
                     if((var11 = var8.method_130()) == null) {
                        var12 = var8.method_138();
                        var10001 = new class_152;
                        var10001.method_708(var12.method_522());
                        var10.method_709(var10001, 1);
                     } else {
                        var10000 = new class_152;
                        var10000.method_708(var11);
                        class_152 var21 = var10000;
                        var10.method_709(var21, 0);
                        if(var11.field_13 == 2 && ((class_55)var11).field_49 == 0) {
                           class_55 var13;
                           class_46 var14;
                           if((var14 = (var13 = (class_55)var11).method_130()) == null) {
                              class_124 var7 = var13.method_138();
                              var10001 = new class_152;
                              var10001.method_708(var7.method_522());
                              var21.method_709(var10001, 1);
                           } else {
                              var10001 = new class_152;
                              var10001.method_708(var14);
                              var21.method_709(var10001, 0);
                           }
                        }

                        if(!var11.method_59().isEmpty()) {
                           var10001 = new class_152;
                           var10001.method_708(((class_124)var11.method_59().get(0)).method_522());
                           var21.method_709(var10001, 1);
                        }
                     }

                     class_46 var25 = (var12 = (class_124)var8.method_59().get(0)).method_522();
                     var10000 = new class_152;
                     var10000.method_708(var25);
                     class_152 var28 = var10000;
                     if(!var5 && var12.method_518() == 1) {
                        var10.method_709(var28, 0);
                        if(var25.field_13 == 2 && ((class_55)var25).field_49 == 0) {
                           class_55 var16;
                           class_46 var18;
                           if((var18 = (var16 = (class_55)var25).method_130()) == null) {
                              var10001 = new class_152;
                              var10001.method_708(var16.method_138().method_522());
                              var28.method_709(var10001, 1);
                           } else {
                              var10001 = new class_152;
                              var10001.method_708(var18);
                              var28.method_709(var10001, 0);
                           }
                        }

                        if(!var25.method_59().isEmpty()) {
                           var10001 = new class_152;
                           var10001.method_708(((class_124)var25.method_59().get(0)).method_522());
                           var28.method_709(var10001, 1);
                        }
                     } else {
                        var10.method_709(var28, 1);
                     }

                     var10000 = var10;
                  }

                  class_152 var17 = var10000;
                  if(var10000 != null) {
                     class_152 var9;
                     class_55 var19;
                     class_55 var20;
                     class_90 var31;
                     boolean var33;
                     label103: {
                        if(((Integer)var17.field_388.get(0)).intValue() == 0 && (var9 = (class_152)var17.field_387.get(0)).field_387.size() == 2 && ((class_152)var9.field_387.get(1)).field_386 == ((class_152)var17.field_387.get(1)).field_386) {
                           var20 = (class_55)var17.field_386;
                           var19 = (class_55)var9.field_386;
                           class_46 var24 = ((class_152)var9.field_387.get(0)).field_386;
                           if(var19.method_61().method_75().isEmpty()) {
                              var20.method_61().method_35(var20.method_138());
                              var19.method_35((class_124)var19.method_59().get(0));
                              var20.method_63().method_658(var19.field_14);
                              class_124 var22;
                              if(((Integer)var9.field_388.get(0)).intValue() == 1) {
                                 var20.method_131((class_46)null);
                                 var22 = var19.method_138();
                                 var19.method_61().method_35(var22);
                                 var22.method_521(var20.method_61());
                                 if(var22.field_303 == var19) {
                                    var22.field_303 = null;
                                 }

                                 var20.method_61().method_34(var22);
                                 var20.method_137(var22);
                              } else {
                                 var19.method_61().method_35(var19.method_138());
                                 class_124 var32 = new class_124;
                                 var32.method_516(1, var20.method_61(), var24);
                                 var22 = var32;
                                 var20.method_61().method_34(var22);
                                 var20.method_137(var22);
                                 var20.method_131(var24);
                                 var20.method_63().method_655(var24, var24.field_14);
                                 var24.method_72(var20);
                                 class_124 var29;
                                 if(!var24.method_59().isEmpty() && (var29 = (class_124)var24.method_59().get(0)).field_303 == var19) {
                                    var29.field_303 = null;
                                 }
                              }

                              class_99 var27 = var20.method_135();
                              ArrayList var26;
                              (var26 = new ArrayList()).add(var27.method_364());
                              var26.add(var19.method_135().method_364());
                              var31 = new class_90;
                              var31.method_296(48, var26);
                              var27.method_365(var31);
                              var33 = true;
                              break label103;
                           }
                        }

                        var33 = false;
                     }

                     var3 = var33;
                     if(var33) {
                        break;
                     }

                     if(!var1.contains(var15.field_14)) {
                        label136: {
                           if(((Integer)var17.field_388.get(0)).intValue() == 0 && (var9 = (class_152)var17.field_387.get(0)).field_387.size() == 2 && ((class_152)var9.field_387.get(0)).field_386 == ((class_152)var17.field_387.get(1)).field_386) {
                              var20 = (class_55)var17.field_386;
                              if((var19 = (class_55)var9.field_386).method_61().method_75().isEmpty()) {
                                 var20.method_61().method_35(var20.method_138());
                                 var19.method_61().method_35(var19.method_138());
                                 var20.method_63().method_658(var19.field_14);
                                 if(((Integer)var9.field_388.get(1)).intValue() != 1 || ((Integer)var9.field_388.get(0)).intValue() != 1) {
                                    throw new RuntimeException("inconsistent if structure!");
                                 }

                                 var20.method_131((class_46)null);
                                 var12 = (class_124)var19.method_59().get(0);
                                 var19.method_35(var12);
                                 var12.method_521(var20.method_61());
                                 var20.method_61().method_34(var12);
                                 var20.method_137(var12);
                                 class_99 var23 = var20.method_135();
                                 ArrayList var30;
                                 (var30 = new ArrayList()).add(var23.method_364());
                                 var31 = new class_90;
                                 var31.method_296(12, Arrays.asList(new class_86[]{var19.method_135().method_364()}));
                                 var30.add(var31);
                                 var31 = new class_90;
                                 var31.method_296(48, var30);
                                 var23.method_365(var31);
                                 var33 = true;
                                 break label136;
                              }
                           }

                           var33 = false;
                        }

                        var3 = var33;
                        if(var33 || (var3 = method_596(var17))) {
                           break;
                        }
                     }

                     if(var3 = method_597((class_55)var15)) {
                        var1.add(var15.field_14);
                        break;
                     }
                  }
               }
            }

            if(!var3) {
               return var2;
            }

            var2 |= var3;
         }
      }
   }

   // $FF: renamed from: a (cy) boolean
   private static boolean method_596(class_152 var0) {
      if(((Integer)var0.field_388.get(1)).intValue() == 0) {
         class_152 var1;
         class_90 var10001;
         class_99 var15;
         if((var1 = (class_152)var0.field_387.get(1)).field_387.size() == 2) {
            int var2;
            if((var2 = ((class_152)var1.field_387.get(1)).field_386 == ((class_152)var0.field_387.get(0)).field_386?2:(((class_152)var1.field_387.get(0)).field_386 == ((class_152)var0.field_387.get(0)).field_386?1:0)) > 0) {
               class_55 var6 = (class_55)var0.field_386;
               class_55 var8 = (class_55)var1.field_386;
               class_46 var3 = var6.method_71();
               if(var8.method_61().method_75().isEmpty()) {
                  var6.method_61().method_35(var6.method_138());
                  var6.method_36(var8);
                  Iterator var5 = var6.method_60().iterator();

                  while(var5.hasNext()) {
                     class_124 var4 = (class_124)var5.next();
                     if(!var6.method_42(var4.method_520())) {
                        var6.method_33(var4);
                        var4.method_520().method_52(1, var4, var8);
                        var8.method_32(var4);
                     }
                  }

                  var3.method_63().method_658(var6.field_14);
                  if(var3.method_61() == var6) {
                     var3.method_62(var8);
                  }

                  var15 = var8.method_135();
                  ArrayList var16;
                  (var16 = new ArrayList()).add(var6.method_135().method_364());
                  if(var2 == 2) {
                     class_90 var10002 = new class_90;
                     var10002.method_296(12, Arrays.asList(new class_86[]{(class_86)var16.get(0)}));
                     var16.set(0, var10002);
                  }

                  var16.add(var15.method_364());
                  var10001 = new class_90;
                  var10001.method_296(var2 == 1?49:48, var16);
                  var15.method_365(var10001);
                  if(var8.method_61().method_75().isEmpty() && !var6.method_61().method_75().isEmpty()) {
                     var8.method_49(var8.method_61(), var6.method_61());
                  }

                  return true;
               }
            }
         } else if(var1.field_387.size() == 1 && ((class_152)var1.field_387.get(0)).field_386 == ((class_152)var0.field_387.get(0)).field_386) {
            class_55 var10 = (class_55)var0.field_386;
            class_46 var7 = var1.field_386;
            var10.method_36(var7);
            Iterator var12 = var7.method_59().iterator();

            class_124 var9;
            while(var12.hasNext()) {
               var9 = (class_124)var12.next();
               var7.method_35(var9);
               var9.method_521(var10);
               var10.method_34(var9);
            }

            var9 = var10.method_138();
            var10.method_61().method_35(var9);
            class_124 var11 = new class_124;
            var11.method_515(var9.method_518(), var7, var9.method_522(), var9.field_303);
            var7.method_34(var11);
            class_124 var10000 = new class_124;
            var10000.method_516(1, var10.method_61(), var7);
            class_124 var14 = var10000;
            var10.method_61().method_34(var14);
            var10.method_131(var7);
            var10.method_63().method_655(var7, var7.field_14);
            var7.method_72(var10);
            var10.method_71().method_63().method_658(var7.field_14);
            class_99 var13 = var15 = var10.method_135();
            var10001 = new class_90;
            var10001.method_296(12, Arrays.asList(new class_86[]{var15.method_364()}));
            var13.method_365(var10001);
            return true;
         }
      }

      return false;
   }

   // $FF: renamed from: a (G) boolean
   private static boolean method_597(class_55 var0) {
      if(var0.field_49 == class_55.field_48) {
         return false;
      } else {
         boolean var1 = false;
         boolean var2 = false;
         boolean var3 = false;
         boolean var4 = false;
         boolean var5 = false;
         boolean var6 = false;
         class_46 var7;
         Object var12;
         class_46 var8 = method_599((class_46)(var12 = (var7 = var0.method_71()).field_13 == 15?var7:var0));
         if(var0.method_130() == null) {
            var3 = true;
            if(var0.method_138().method_518() == 32) {
               var1 = true;
            } else {
               var1 = class_142.method_646((class_46)var12, var0.method_138().method_522());
            }
         } else {
            List var9;
            if(!(var9 = var0.method_130().method_59()).isEmpty() && ((class_124)var9.get(0)).method_518() == 32) {
               var1 = true;
            } else {
               var1 = method_598(var0.method_130(), (class_46)var12);
            }
         }

         Object var10000 = var7.field_13 == 15?(class_46)((class_49)var7).method_63().method_661():var0;
         Object var22 = var10000;
         var4 = var10000 == var0;
         if(!((class_46)var22).method_59().isEmpty() && ((class_124)((class_46)var22).method_59().get(0)).method_518() == 32) {
            var2 = true;
         } else {
            var2 = method_598((class_46)var22, (class_46)var12);
         }

         if(!var4 && method_600(var0, ((class_124)var0.method_59().get(0)).method_522())) {
            return false;
         } else {
            if(!var1 && !var3) {
               var5 = method_600(var0, var8);
            }

            class_46 var11;
            class_49 var24;
            if(!var2 && !var4) {
               for(int var10 = (var24 = (class_49)var7).method_63().size() - 1; var10 >= 0 && (var11 = (class_46)var24.method_63().get(var10)) != var0 && !(var6 = method_600(var11, var8)); --var10) {
                  ;
               }
            }

            class_46 var13;
            class_49 var35;
            class_124 var33;
            if((var1 || var5) && (var2 || var6) && !var3 && !var4) {
               var24 = (class_49)var7;
               ArrayList var27 = new ArrayList();

               for(int var31 = var24.method_63().size() - 1; var31 >= 0 && (var13 = (class_46)var24.method_63().get(var31)) != var0; --var31) {
                  var27.add(0, var13);
               }

               Object var29;
               if(var27.size() == 1) {
                  var29 = (class_46)var27.get(0);
               } else {
                  var35 = new class_49;
                  var35.method_96(var27);
                  var29 = var35;
                  var35.method_26();
               }

               var0.method_35((class_124)var0.method_59().get(0));
               Iterator var20 = var27.iterator();

               while(var20.hasNext()) {
                  var13 = (class_46)var20.next();
                  var24.method_63().method_658(var13.field_14);
               }

               var33 = new class_124;
               var33.method_516(1, var0.method_61(), (class_46)var29);
               class_124 var21 = var33;
               var0.method_61().method_34(var21);
               var0.method_129((class_46)var29);
               var0.method_136(var21);
               var0.method_63().method_655(var29, ((class_46)var29).field_14);
               ((class_46)var29).method_72(var0);
               var0.field_49 = class_55.field_48;
            } else {
               if(!var1 || var2 && (!var3 || var4)) {
                  return false;
               }

               class_99 var23;
               class_99 var34 = var23 = var0.method_135();
               class_90 var10001 = new class_90;
               var10001.method_296(12, Arrays.asList(new class_86[]{var23.method_364()}));
               var34.method_365(var10001);
               class_124 var32;
               if(var4) {
                  class_124 var28 = var0.method_138();
                  class_124 var26 = (class_124)var0.method_59().get(0);
                  if(var3) {
                     var0.method_61().method_35(var28);
                     var0.method_35(var26);
                     var28.method_521(var0);
                     var26.method_521(var0.method_61());
                     var0.method_34(var28);
                     var0.method_61().method_34(var26);
                     var0.method_137(var26);
                  } else {
                     var13 = var0.method_130();
                     var35 = new class_49;
                     var35.method_96(Arrays.asList(new class_46[]{var0, var13}));
                     class_49 var15 = var35;
                     var0.method_61().method_35(var28);
                     var0.method_63().method_658(var13.field_14);
                     var0.method_131((class_46)null);
                     var0.method_35(var26);
                     var26.method_521(var0.method_61());
                     var0.method_61().method_34(var26);
                     var0.method_137(var26);
                     var0.method_71().method_49(var0, var15);
                     var15.method_26();
                     var32 = new class_124;
                     var32.method_516(1, var0, var13);
                     var0.method_34(var32);
                  }
               } else {
                  class_49 var25 = (class_49)var7;
                  ArrayList var30 = new ArrayList();

                  class_46 var16;
                  for(int var14 = var25.method_63().size() - 1; var14 >= 0 && (var16 = (class_46)var25.method_63().get(var14)) != var0; --var14) {
                     var30.add(0, var16);
                  }

                  Object var17;
                  if(var30.size() == 1) {
                     var17 = (class_46)var30.get(0);
                  } else {
                     var35 = new class_49;
                     var35.method_96(var30);
                     var17 = var35;
                     var35.method_26();
                  }

                  var0.method_35((class_124)var0.method_59().get(0));
                  Iterator var18 = var30.iterator();

                  while(var18.hasNext()) {
                     var16 = (class_46)var18.next();
                     var25.method_63().method_658(var16.field_14);
                  }

                  class_124 var19;
                  if(var3) {
                     var19 = var0.method_138();
                     var0.method_61().method_35(var19);
                     var19.method_521(var0);
                     var0.method_34(var19);
                  } else {
                     var16 = var0.method_130();
                     var0.method_61().method_35(var0.method_138());
                     var0.method_63().method_658(var16.field_14);
                     var32 = new class_124;
                     var32.method_516(1, var0, var16);
                     var0.method_34(var32);
                     var25.method_63().method_655(var16, var16.field_14);
                     var16.method_72(var25);
                  }

                  var33 = new class_124;
                  var33.method_516(1, var0.method_61(), (class_46)var17);
                  var19 = var33;
                  var0.method_61().method_34(var19);
                  var0.method_131((class_46)var17);
                  var0.method_137(var19);
                  var0.method_63().method_655(var17, ((class_46)var17).field_14);
                  ((class_46)var17).method_72(var0);
               }
            }

            return true;
         }
      }
   }

   // $FF: renamed from: a (ca, ca) boolean
   private static boolean method_598(class_46 var0, class_46 var1) {
      Iterator var3 = var0.method_59().iterator();

      class_124 var2;
      while(var3.hasNext()) {
         var2 = (class_124)var3.next();
         if(class_142.method_646(var1, var2.method_522())) {
            return true;
         }
      }

      if(var0.method_75() == null) {
         switch(var0.field_13) {
         case 2:
            class_55 var5;
            if((var5 = (class_55)var0).field_49 == class_55.field_48) {
               if(!method_598(var5.method_130(), var1) && !method_598(var5.method_128(), var1)) {
                  return false;
               }

               return true;
            }
         case 3:
         case 4:
         case 5:
         case 8:
         case 9:
         case 11:
         case 13:
         case 14:
         default:
            break;
         case 6:
            Iterator var4 = var0.method_63().iterator();

            do {
               if(!var4.hasNext()) {
                  return false;
               }
            } while(!method_598((class_46)var4.next(), var1));

            return true;
         case 7:
         case 12:
            var3 = var0.method_63().iterator();

            class_46 var10000;
            do {
               if(!var3.hasNext()) {
                  return false;
               }

               var10000 = (class_46)var3.next();
               var2 = null;
            } while(!method_598(var10000, var1));

            return true;
         case 10:
            return method_598((class_46)var0.method_63().get(1), var1);
         case 15:
            return method_598((class_46)var0.method_63().method_661(), var1);
         }
      }

      return false;
   }

   // $FF: renamed from: a (ca) ca
   private static class_46 method_599(class_46 var0) {
      class_46 var1;
      switch((var1 = var0.method_71()).field_13) {
      case 5:
         return var1;
      case 13:
         return ((class_54)var1).method_123();
      case 15:
         class_49 var2;
         if((var2 = (class_49)var1).method_63().method_661() != var0) {
            for(int var3 = var2.method_63().size() - 1; var3 >= 0; --var3) {
               if(var2.method_63().get(var3) == var0) {
                  return (class_46)var2.method_63().get(var3 + 1);
               }
            }
         }
      default:
         return method_599(var1);
      }
   }

   // $FF: renamed from: b (ca, ca) boolean
   private static boolean method_600(class_46 var0, class_46 var1) {
      Iterator var2 = var1.method_60().iterator();

      while(var2.hasNext()) {
         class_124 var3 = (class_124)var2.next();
         if(var0.method_42(var3.method_520())) {
            return true;
         }
      }

      return false;
   }
}
