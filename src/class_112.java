import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

// $FF: renamed from: s
public final class class_112 {

   // $FF: renamed from: a java.util.HashMap
   private HashMap field_243;
   // $FF: renamed from: b java.util.HashMap
   private HashMap field_244;
   // $FF: renamed from: c java.util.HashMap
   private HashMap field_245;
   // $FF: renamed from: d java.util.HashMap
   private HashMap field_246;
   // $FF: renamed from: e java.util.HashMap
   private HashMap field_247;
   // $FF: renamed from: f java.util.HashMap
   private HashMap field_248;
   // $FF: renamed from: g java.util.HashMap
   private HashMap field_249;
   // $FF: renamed from: h java.util.HashMap
   private HashMap field_250;
   // $FF: renamed from: i java.util.HashMap
   private HashMap field_251;
   // $FF: renamed from: j as
   private class_192 field_252;
   // $FF: renamed from: k java.util.HashMap
   private HashMap field_253;
   // $FF: renamed from: l int
   private int field_254;
   // $FF: renamed from: m cM
   private class_132 field_255;


   // $FF: renamed from: <init> () void
   public void method_424() {
      super();
      this.field_243 = new HashMap();
      this.field_244 = new HashMap();
      this.field_245 = new HashMap();
      this.field_246 = new HashMap();
      this.field_247 = new HashMap();
      this.field_248 = new HashMap();
      this.field_249 = new HashMap();
      this.field_250 = new HashMap();
      this.field_251 = new HashMap();
      class_192 var10001 = new class_192;
      var10001.method_930();
      this.field_252 = var10001;
      this.field_253 = new HashMap();
      this.field_254 = -1;
   }

   // $FF: renamed from: a (S, bn) void
   public final void method_425(class_54 var1, class_128 var2) {
      class_81 var10000 = new class_81;
      var10000.method_225();
      class_81 var3 = var10000;
      class_114 var4 = var10000.method_226(var1);
      HashSet var5 = new HashSet();

      for(int var6 = 0; var6 < 64; ++var6) {
         var5.add(Integer.valueOf(var6));
      }

      class_132 var10001 = new class_132;
      var10001.method_573(var5);
      this.field_255 = var10001;
      this.field_246.put(var4.field_257.field_369, this.method_436(var2, var1));
      this.method_435(var1, var4, var3);
      HashSet var7 = new HashSet();

      do {
         this.method_426(var4, var7, false);
      } while(!var7.isEmpty());

      this.method_426(var4, var7, true);
      this.field_252.method_933();
   }

   // $FF: renamed from: a (q, java.util.HashSet, boolean) void
   private void method_426(class_114 var1, HashSet var2, boolean var3) {
      Iterator var5 = var1.field_256.iterator();

      while(var5.hasNext()) {
         class_148 var4 = (class_148)var5.next();
         var2.remove(var4.field_369);
         class_114 var8 = var1;
         class_148 var7 = var4;
         class_112 var6 = this;
         class_184 var10000 = new class_184;
         var10000.method_865();
         class_184 var9 = var10000;
         Iterator var11 = var4.field_374.iterator();

         class_184 var18;
         while(var11.hasNext()) {
            class_148 var10 = (class_148)var11.next();
            var18 = var6.method_431(var7.field_369, var10.field_369, var8, var7.field_369);
            if(var9.method_870()) {
               var9 = var18.method_868();
            } else {
               method_432(var9, var18);
            }
         }

         if(var6.field_246.containsKey(var7.field_369)) {
            var18 = (class_184)var6.field_246.get(var7.field_369);
            if(var9.method_870()) {
               var9 = var18.method_868();
            } else {
               method_432(var9, var18);
            }
         }

         var6.field_243.put(var7.field_369, var9);
         var10000 = new class_184;
         var10000.method_867((class_184)this.field_243.get(var4.field_369));
         class_184 var14 = var10000;
         class_184[] var13 = new class_184[]{var14, null};
         if(var4.field_372 != null) {
            Iterator var17 = var4.field_372.iterator();

            while(var17.hasNext()) {
               class_86 var15 = (class_86)var17.next();
               this.method_427(var15, var13, var4.field_371, var3);
            }
         }

         if(var13[1] == null) {
            var13[1] = var13[0];
         }

         if(!method_433(var13[0], (class_184)this.field_244.get(var4.field_369)) || this.field_245.containsKey(var4.field_369) && !method_433(var13[1], (class_184)this.field_245.get(var4.field_369))) {
            this.field_244.put(var4.field_369, var13[0]);
            if(var1.field_260.containsKey(var4.field_369)) {
               this.field_245.put(var4.field_369, var13[1]);
            }

            Iterator var12 = var4.field_373.iterator();

            while(var12.hasNext()) {
               class_148 var16 = (class_148)var12.next();
               var2.add(var16.field_369);
            }
         }
      }

   }

   // $FF: renamed from: a (aJ, bZ[], ca, boolean) void
   private void method_427(class_86 var1, class_184[] var2, class_46 var3, boolean var4) {
      if(var1 != null) {
         class_88 var5 = null;
         boolean var6 = false;
         class_90 var8;
         class_184[] var11;
         class_86 var22;
         switch(var1.field_148) {
         case 2:
            class_93 var7;
            if((var7 = (class_93)var1).method_319() == -1 && (var22 = var7.method_316()).field_148 == 12) {
               var5 = (class_88)var22;
            }
         case 3:
         case 4:
         case 5:
         default:
            break;
         case 6:
            class_184[] var10000;
            class_184 var10003;
            switch((var8 = (class_90)var1).method_301()) {
            case 36:
               this.method_427((class_86)var8.method_303().get(0), var2, var3, var4);
               class_184 var19;
               if(var2[1] == null) {
                  class_184 var41 = new class_184;
                  var41.method_867(var2[0]);
                  var19 = var41;
               } else {
                  var19 = var2[1];
                  var2[1] = null;
               }

               this.method_427((class_86)var8.method_303().get(1), var2, var3, var4);
               class_184[] var9 = new class_184[]{var19, null};
               this.method_427((class_86)var8.method_303().get(2), var9, var3, var4);
               method_432(var2[0], var9[0]);
               var2[1] = null;
               var6 = true;
               break;
            case 48:
               this.method_427((class_86)var8.method_303().get(0), var2, var3, var4);
               var10000 = new class_184[2];
               var10003 = new class_184;
               var10003.method_867(var2[0]);
               var10000[0] = var10003;
               class_184[] var10 = var10000;
               this.method_427((class_86)var8.method_303().get(1), var10, var3, var4);
               var2[1] = method_432(var2[var2[1] == null?0:1], var10[var10[1] == null?0:1]);
               var2[0] = var10[0];
               var6 = true;
               break;
            case 49:
               this.method_427((class_86)var8.method_303().get(0), var2, var3, var4);
               var10000 = new class_184[2];
               var10003 = new class_184;
               var10003.method_867(var2[var2[1] == null?0:1]);
               var10000[0] = var10003;
               var11 = var10000;
               this.method_427((class_86)var8.method_303().get(1), var11, var3, var4);
               var2[1] = var11[var11[1] == null?0:1];
               var2[0] = method_432(var2[0], var11[0]);
               var6 = true;
            }
         }

         if(!var6) {
            List var18;
            (var18 = var1.method_260()).remove(var5);
            Iterator var21 = var18.iterator();

            while(var21.hasNext()) {
               var22 = (class_86)var21.next();
               this.method_427(var22, var2, var3, var4);
            }
         }

         class_184 var20 = var2[0];
         class_192 var39;
         class_77 var10001;
         if(var1.field_148 == 5) {
            int var26;
            if(this.field_253.containsKey(Integer.valueOf(var1.field_149))) {
               var26 = ((Integer)this.field_253.get(Integer.valueOf(var1.field_149))).intValue();
            } else {
               var26 = this.field_254--;
               this.field_253.put(Integer.valueOf(var1.field_149), Integer.valueOf(var26));
               var39 = this.field_252;
               var10001 = new class_77;
               var10001.method_214(var26, 1);
               var39.method_931(var10001);
            }

            this.method_434(var20, Integer.valueOf(var26), Integer.valueOf(1));
         } else if(var1.field_148 == 8 || var1.field_148 == 2 && ((class_93)var1).method_316().field_148 == 5 || var1.field_148 == 10 && ((class_95)var1).method_329().field_133 == 8 || var1.field_148 == 6) {
            boolean var27 = true;
            if(var1.field_148 == 6) {
               var27 = false;
               class_90 var25;
               if((var25 = (class_90)var1).method_301() >= 32 && var25.method_301() <= 35 && ((class_86)var25.method_303().get(0)).field_148 == 5) {
                  var27 = true;
               }
            }

            if(var27) {
               var20.method_872();
            }
         }

         Integer var28;
         if(var5 != null) {
            Integer var32 = Integer.valueOf(var5.method_277());
            if(var5.method_284() == 0) {
               var28 = this.method_430(var32, var3);
               var5.method_285(var28.intValue());
               var39 = this.field_252;
               var10001 = new class_77;
               var10001.method_215(var32, var28);
               var39.method_931(var10001);
               this.method_434(var20, var32, var28);
            } else {
               if(var4) {
                  var10001 = new class_77;
                  var10001.method_214(var32.intValue(), var5.method_284());
                  this.method_429(var10001, var20);
               }

               this.method_434(var20, var32, Integer.valueOf(var5.method_284()));
            }
         } else {
            Integer var12;
            class_208 var13;
            Integer var24;
            if(var1.field_148 == 6) {
               switch((var8 = (class_90)var1).method_301()) {
               case 32:
               case 33:
               case 34:
               case 35:
                  if(((class_86)var8.method_303().get(0)).field_148 != 12) {
                     break;
                  }

                  class_88 var23;
                  var24 = Integer.valueOf((var23 = (class_88)var8.method_303().get(0)).method_277());
                  class_77 var40 = new class_77;
                  var40.method_214(var24.intValue(), var23.method_284());
                  class_77 var29 = var40;
                  var40 = (class_77)this.field_250.get(var29);
                  var11 = null;
                  if(var40 == null) {
                     var12 = this.method_430(var24, (class_46)null);
                     var40 = new class_77;
                     var40.method_215(var24, var12);
                     class_77 var33 = var40;
                     this.field_252.method_931(var33);
                     var13 = (class_208)this.field_252.field_496.method_659(var29);
                     class_141 var17 = this.field_255.method_574();
                     if(var13.field_569.size() == 1) {
                        var17.method_629(Integer.valueOf(((class_183)var13.field_569.iterator().next()).field_470.field_567));
                     } else {
                        Iterator var34 = var13.field_569.iterator();

                        while(var34.hasNext()) {
                           class_183 var14 = (class_183)var34.next();
                           var17.method_629(Integer.valueOf(((class_183)var14.field_470.field_569.iterator().next()).field_470.field_567));
                        }
                     }

                     var17.method_629(var12);
                     this.method_428(var29, var17, var3);
                     this.field_250.put(var29, var33);
                  }

                  if(var4) {
                     this.method_429(var29, var20);
                  }

                  this.method_434(var20, Integer.valueOf(var24.intValue()), Integer.valueOf(var23.method_284()));
               default:
                  return;
               }
            } else if(var1.field_148 == 12) {
               class_88 var35;
               var28 = Integer.valueOf((var35 = (class_88)var1).method_277());
               var24 = Integer.valueOf(var35.method_284());
               class_141 var30;
               int var36;
               if((var36 = (var30 = var20.method_875(var28.intValue())).method_636()) == 1) {
                  if(var24.intValue() != 0) {
                     if(var4) {
                        var10001 = new class_77;
                        var10001.method_215(var28, var24);
                        this.method_429(var10001, var20);
                     }

                     this.method_434(var20, var28, var24);
                     return;
                  }

                  var12 = this.method_430(var28, var3);
                  var35.method_285(var12.intValue());
                  this.method_434(var20, var28, var12);
                  Integer var15 = (Integer)var30.iterator().next();
                  class_146 var38 = this.field_252.field_496;
                  var10001 = new class_77;
                  var10001.method_215(var28, var15);
                  class_208 var16 = (class_208)var38.method_659(var10001);
                  var39 = this.field_252;
                  var10001 = new class_77;
                  var10001.method_215(var28, var12);
                  var13 = var39.method_931(var10001);
                  class_183 var37 = new class_183;
                  var37.method_864(0, var16, var13);
                  class_183 var31 = var37;
                  var16.method_1025(var31);
                  var13.method_1026(var31);
                  return;
               }

               if(var36 == 2) {
                  if(var24.intValue() != 0) {
                     if(var4) {
                        var10001 = new class_77;
                        var10001.method_215(var28, var24);
                        this.method_429(var10001, var20);
                     }

                     this.method_434(var20, var28, var24);
                  } else {
                     var12 = this.method_430(var28, var3);
                     var35.method_285(var12.intValue());
                     var39 = this.field_252;
                     var10001 = new class_77;
                     var10001.method_215(var28, var12);
                     var39.method_931(var10001);
                     this.method_434(var20, var28, var12);
                     var24 = var12;
                  }

                  var10001 = new class_77;
                  var10001.method_215(var28, var24);
                  this.method_428(var10001, var30, var3);
               }
            }

         }
      }
   }

   // $FF: renamed from: a (de, cJ, ca) void
   private void method_428(class_77 var1, class_141 var2, class_46 var3) {
      class_141 var4 = var2.method_627();
      HashSet var5 = new HashSet();
      class_208 var6 = (class_208)this.field_252.field_496.method_659(var1);
      ArrayList var7;
      class_183 var16;
      if((var7 = new ArrayList(var6.field_569)).size() == 1) {
         (var16 = (class_183)var7.get(0)).field_470.method_1023(var16);
         var6.method_1024(var16);
      } else {
         Iterator var8 = var7.iterator();

         while(var8.hasNext()) {
            int var9 = ((class_183)(var16 = (class_183)var8.next()).field_470.field_569.iterator().next()).field_470.field_567;
            if(!var2.method_631(Integer.valueOf(var9))) {
               var16.field_470.method_1023(var16);
               var6.method_1024(var16);
            } else {
               var4.method_630(Integer.valueOf(var9));
               var5.add(Integer.valueOf(var9));
            }
         }
      }

      var7 = new ArrayList();
      ArrayList var17 = new ArrayList();
      Iterator var12 = var4.iterator();

      while(var12.hasNext()) {
         Integer var18 = (Integer)var12.next();
         class_146 var10000 = this.field_252.field_496;
         class_77 var10001 = new class_77;
         var10001.method_214(var1.field_96, var18.intValue());
         class_208 var15 = (class_208)var10000.method_659(var10001);
         var18 = this.method_430(Integer.valueOf(var1.field_96), var3);
         class_208 var13 = new class_208;
         var13.method_1022(var1.field_96, var18.intValue());
         class_208 var10 = var13;
         var7.add(var10);
         var10001 = new class_77;
         var10001.method_214(var1.field_96, var18.intValue());
         var17.add(var10001);
         class_183 var14 = new class_183;
         var14.method_864(0, var15, var10);
         class_183 var11 = var14;
         var15.method_1025(var11);
         var10.method_1026(var11);
         var14 = new class_183;
         var14.method_864(0, var10, var6);
         var11 = var14;
         var10.method_1025(var11);
         var6.method_1026(var11);
         var5.add(var18);
      }

      this.field_252.field_496.method_654(var7, var17);
      this.field_247.put(var1, var5);
   }

   // $FF: renamed from: a (de, bZ) void
   private void method_429(class_77 var1, class_184 var2) {
      class_208 var10000 = (class_208)this.field_252.field_496.method_659(var1);
      class_184 var10001 = new class_184;
      var10001.method_867(var2);
      var10000.field_571 = var10001;
   }

   // $FF: renamed from: a (java.lang.Integer, ca) java.lang.Integer
   private Integer method_430(Integer var1, class_46 var2) {
      Integer var3;
      if((var3 = (Integer)this.field_248.get(var1)) == null) {
         var3 = new Integer(1);
      } else {
         var3 = new Integer(var3.intValue() + 1);
      }

      this.field_248.put(var1, var3);
      Integer var4;
      if(var2 != null && (var4 = method_437(var2)) != null) {
         HashMap var10000 = this.field_249;
         class_77 var10001 = new class_77;
         var10001.method_215(var1, var3);
         var10000.put(var10001, var4);
      }

      return var3;
   }

   // $FF: renamed from: a (java.lang.String, java.lang.String, q, java.lang.String) bZ
   private class_184 method_431(String var1, String var2, class_114 var3, String var4) {
      class_184 var10000 = new class_184;
      var10000.method_865();
      class_184 var5 = var10000;
      boolean var6 = var3.field_258.containsKey(var2);
      if(var1.equals(var3.field_260.get(var2))) {
         if(this.field_245.containsKey(var2)) {
            var5 = ((class_184)this.field_245.get(var2)).method_868();
         }
      } else if(this.field_244.containsKey(var2)) {
         var5 = ((class_184)this.field_244.get(var2)).method_868();
      }

      if(var6) {
         class_184 var24 = var5.method_868();
         var10000 = new class_184;
         var10000.method_865();
         class_184 var7 = var10000;
         String var8;
         boolean var28 = (var8 = (String)var3.field_261.get(var2)) != null && !var1.equals(var8);
         HashSet var9 = new HashSet();
         Iterator var11 = var3.field_259.values().iterator();

         class_104 var10;
         Iterator var13;
         while(var11.hasNext()) {
            List var21 = (List)var11.next();
            var10 = null;
            var13 = var21.iterator();

            while(var13.hasNext()) {
               class_104 var12 = (class_104)var13.next();
               var9.add(var12.field_217 + "##" + var12.field_216);
            }
         }

         var11 = ((List)var3.field_258.get(var2)).iterator();

         while(var11.hasNext()) {
            var10 = (class_104)var11.next();
            class_184 var31;
            boolean var33;
            if(var33 = var3.field_258.containsKey(var10.field_216)) {
               var31 = this.method_431(var10.field_218, var10.field_216, var3, var4);
            } else if(var10.field_218.equals(var3.field_260.get(var10.field_216))) {
               var31 = (class_184)this.field_245.get(var10.field_216);
            } else {
               var31 = (class_184)this.field_244.get(var10.field_216);
            }

            boolean var14 = false;
            if(var33) {
               var14 = !var10.field_217.equals(var1);
            } else {
               var14 = !var9.contains(var4 + "##" + var10.field_216);
            }

            if(var14) {
               var24.method_876(var31);
            } else if(var7.method_870()) {
               if(var31 != null) {
                  var7 = var31.method_868();
               }
            } else {
               method_432(var7, var31);
            }
         }

         if(var28) {
            var5 = var7;
         } else {
            var24.method_878(var7);
            var5.method_877(var24);
            if(!var7.method_870() && !var5.method_870()) {
               HashMap var30;
               if((var30 = (HashMap)this.field_251.get(var2)) == null) {
                  var30 = new HashMap();
               }

               class_184 var32;
               (var32 = var5.method_868()).method_876(var7);
               var13 = var32.method_879().iterator();

               class_141 var20;
               class_77 var23;
               while(var13.hasNext()) {
                  Entry var35;
                  for(Iterator var15 = ((class_141)(var35 = (Entry)var13.next()).getValue()).iterator(); var15.hasNext(); var20.method_629(Integer.valueOf(var23.field_97))) {
                     Integer var34 = (Integer)var15.next();
                     Integer var19 = (Integer)var35.getKey();
                     class_77 var18 = new class_77;
                     var18.method_215(var19, var34);
                     class_77 var22 = var18;
                     (var20 = var5.method_875(var19.intValue())).method_630(var34);
                     if((var23 = (class_77)var30.get(var22)) == null) {
                        Integer var25 = this.method_430(Integer.valueOf(var22.field_96), (class_46)null);
                        var18 = new class_77;
                        var18.method_214(var22.field_96, var25.intValue());
                        var23 = var18;
                        class_208 var26 = (class_208)this.field_252.field_496.method_659(var22);
                        class_208 var27;
                        class_208 var16 = var27 = this.field_252.method_931(var23);
                        var16.field_570 |= 2;
                        class_183 var17 = new class_183;
                        var17.method_864(1, var26, var27);
                        class_183 var29 = var17;
                        var26.method_1025(var29);
                        var27.method_1026(var29);
                        var30.put(var22, var23);
                     }
                  }
               }

               if(!var30.isEmpty()) {
                  this.field_251.put(var2, var30);
               }
            }
         }
      }

      return var5;
   }

   // $FF: renamed from: a (bZ, bZ) bZ
   private static class_184 method_432(class_184 var0, class_184 var1) {
      if(var1 != null && !var1.method_870()) {
         var0.method_878(var1);
      }

      return var0;
   }

   // $FF: renamed from: b (bZ, bZ) boolean
   private static boolean method_433(class_184 var0, class_184 var1) {
      if(var0 == null) {
         return var1 == null;
      } else if(var1 == null) {
         return false;
      } else if(var0.method_869() != var1.method_869()) {
         return false;
      } else {
         Iterator var2 = var1.method_879().iterator();

         while(var2.hasNext()) {
            Entry var3 = (Entry)var2.next();
            if(!class_129.method_558(var0.method_875(((Integer)var3.getKey()).intValue()), var3.getValue())) {
               return false;
            }
         }

         return true;
      }
   }

   // $FF: renamed from: a (bZ, java.lang.Integer, java.lang.Integer) void
   private void method_434(class_184 var1, Integer var2, Integer var3) {
      class_141 var4;
      (var4 = this.field_255.method_574()).method_629(var3);
      var1.method_871(var2.intValue(), var4);
   }

   // $FF: renamed from: a (ca, q, dd) void
   private void method_435(class_46 var1, class_114 var2, class_81 var3) {
      switch(var1.field_13) {
      case 7:
      case 12:
         List var5;
         if(var1.field_13 == 12) {
            var5 = ((class_51)var1).method_111();
         } else {
            var5 = ((class_50)var1).method_102();
         }

         for(int var6 = 1; var6 < var1.method_63().size(); ++var6) {
            int var7 = ((class_88)var5.get(var6 - 1)).method_277();
            int var8 = this.method_430(Integer.valueOf(var7), var1).intValue();
            class_184 var10000 = new class_184;
            var10000.method_865();
            class_184 var4 = var10000;
            this.method_434(var4, Integer.valueOf(var7), Integer.valueOf(var8));
            this.field_246.put(((class_148)var2.field_256.method_659(((String[])var3.method_229().get(((class_46)var1.method_63().get(var6)).field_14))[0])).field_369, var4);
            class_192 var9 = this.field_252;
            class_77 var10001 = new class_77;
            var10001.method_214(var7, var8);
            var9.method_931(var10001);
         }
      default:
         Iterator var11 = var1.method_63().iterator();

         while(var11.hasNext()) {
            class_46 var10 = (class_46)var11.next();
            this.method_435(var10, var2, var3);
         }

      }
   }

   // $FF: renamed from: a (bn, S) bZ
   private class_184 method_436(class_128 var1, class_54 var2) {
      boolean var3 = (var1.method_550() & 8) == 0;
      class_197 var10;
      int var4 = (var10 = class_197.method_963(var1.method_548())).field_519.length + (var3?1:0);
      int var5 = 0;
      class_184 var10000 = new class_184;
      var10000.method_865();
      class_184 var6 = var10000;

      for(int var7 = 0; var7 < var4; ++var7) {
         int var8 = this.method_430(Integer.valueOf(var5), var2).intValue();
         class_141 var9;
         (var9 = this.field_255.method_574()).method_629(Integer.valueOf(var8));
         var6.method_871(var5, var9);
         class_192 var11 = this.field_252;
         class_77 var10001 = new class_77;
         var10001.method_214(var5, var8);
         var11.method_931(var10001);
         if(var3) {
            if(var7 == 0) {
               ++var5;
            } else {
               var5 += var10.field_519[var7 - 1].field_137;
            }
         } else {
            var5 += var10.field_519[var7].field_137;
         }
      }

      return var6;
   }

   // $FF: renamed from: a (ca) java.lang.Integer
   private static Integer method_437(class_46 var0) {
      class_46 var1;
      for(; (var1 = var0.method_71()) != null; var0 = var1) {
         if(var1.field_13 != 12 && var1.field_13 != 7) {
            if(var1.field_13 == 10 && ((class_56)var1).method_142() == var0) {
               return var1.field_14;
            }
         } else if(var1.method_61() == var0) {
            return var1.field_14;
         }
      }

      return null;
   }

   // $FF: renamed from: a () as
   public final class_192 method_438() {
      return this.field_252;
   }

   // $FF: renamed from: a (de) bZ
   public final class_184 method_439(class_77 var1) {
      class_208 var2;
      return (var2 = (class_208)this.field_252.field_496.method_659(var1)) != null?var2.field_571:null;
   }

   // $FF: renamed from: b () java.util.HashMap
   public final HashMap method_440() {
      return this.field_249;
   }

   // $FF: renamed from: c () java.util.HashMap
   public final HashMap method_441() {
      return this.field_253;
   }
}
