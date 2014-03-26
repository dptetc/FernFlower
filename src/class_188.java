import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

// $FF: renamed from: cA
public final class class_188 {

   // $FF: renamed from: a boolean
   private boolean field_480;
   // $FF: renamed from: b java.util.HashMap
   private HashMap field_481;


   // $FF: renamed from: <init> () void
   public void method_887() {
      super();
      this.field_481 = new HashMap();
   }

   // $FF: renamed from: a (aK) void
   public final void method_888(class_177 var1) {
      if(!var1.field_445.isEmpty()) {
         this.field_480 = class_181.method_846("nns");
         this.method_889(var1);
         this.method_891(var1);
      }
   }

   // $FF: renamed from: b (aK) void
   private void method_889(class_177 var1) {
      Iterator var3 = var1.field_445.iterator();

      while(var3.hasNext()) {
         class_177 var2 = (class_177)var3.next();
         this.method_889(var2);
      }

      var3 = var1.field_439.method_412().iterator();

      while(var3.hasNext()) {
         class_120 var4 = (class_120)var3.next();
         this.method_890(var1, var4);
      }

   }

   // $FF: renamed from: a (aK, cX) void
   private void method_890(class_177 var1, class_120 var2) {
      byte var3 = 1;
      if(var2.field_277 != null) {
         class_114 var4 = var2.method_495();
         int var5;
         if((((var5 = var2.field_279.method_550()) & 4096) != 0 || var2.field_279.method_552().method_662("Synthetic") || this.field_480) && (var5 & 8) != 0 && var4.field_256.size() == 2) {
            class_86 var12;
            if(var4.field_257.field_372.size() == 1) {
               var12 = (class_86)var4.field_257.field_372.get(0);
               int var6 = class_197.method_963(var2.field_279.method_548()).field_519.length;
               class_86 var7 = var12;
               class_89 var16;
               if(var12.field_148 == 4 && (var16 = (class_89)var12).method_291() == 0 && var16.method_292() != null) {
                  var7 = var16.method_292();
               }

               switch(var7.field_148) {
               case 2:
                  class_93 var8;
                  if((var8 = (class_93)var7).method_316().field_148 == 5 && var8.method_317().field_148 == 12) {
                     class_92 var10 = (class_92)var8.method_316();
                     if((var6 == 2 && !var10.method_312() || var6 == 1 && var10.method_312()) && var10.method_309().equals(var1.field_438.field_528) && (var10.method_312() || var10.method_311().field_148 == 12 && ((class_88)var10.method_311()).method_277() == 0) && ((class_88)var8.method_317()).method_277() == var6 - 1) {
                        var3 = 3;
                     }
                  }
                  break;
               case 5:
                  class_92 var14 = (class_92)var7;
                  if((var6 == 1 && !var14.method_312() || var6 == 0 && var14.method_312()) && var14.method_309().equals(var1.field_438.field_528) && (var14.method_312() || var14.method_311().field_148 == 12 && ((class_88)var14.method_311()).method_277() == 0)) {
                     var3 = 2;
                  }
                  break;
               case 8:
                  var3 = 4;
                  break;
               case 12:
                  if(var6 == 1 && ((class_88)var7).method_277() != 0) {
                     var3 = 2;
                  }
               }

               if(var3 == 4) {
                  var3 = 1;
                  class_97 var17;
                  if((var17 = (class_97)var7).method_351() && var17.method_341().size() == var6 || !var17.method_351() && var17.method_349().field_148 == 12 && ((class_88)var17.method_349()).method_277() == 0 && var17.method_341().size() == var6 - 1) {
                     boolean var20 = true;

                     for(int var11 = 0; var11 < var17.method_341().size(); ++var11) {
                        class_86 var9;
                        if((var9 = (class_86)var17.method_341().get(var11)).field_148 != 12 || ((class_88)var9).method_277() != var11 + (var17.method_351()?0:1)) {
                           var20 = false;
                           break;
                        }
                     }

                     if(var20) {
                        var3 = 4;
                     }
                  }
               }
            } else if(var4.field_257.field_372.size() == 2) {
               var12 = (class_86)var4.field_257.field_372.get(0);
               class_86 var13 = (class_86)var4.field_257.field_372.get(1);
               if(var12.field_148 == 2 && var13.field_148 == 4) {
                  int var19 = class_197.method_963(var2.field_279.method_548()).field_519.length;
                  class_93 var18;
                  if((var18 = (class_93)var12).method_316().field_148 == 5 && var18.method_317().field_148 == 12) {
                     class_92 var21 = (class_92)var18.method_316();
                     class_89 var15;
                     if((var19 == 2 && !var21.method_312() || var19 == 1 && var21.method_312()) && var21.method_309().equals(var1.field_438.field_528) && (var21.method_312() || var21.method_311().field_148 == 12 && ((class_88)var21.method_311()).method_277() == 0) && ((class_88)var18.method_317()).method_277() == var19 - 1 && (var15 = (class_89)var13).method_291() == 0 && var15.method_292() != null && var15.method_292().field_148 == 12 && ((class_88)var18.method_317()).method_277() == var19 - 1) {
                        var3 = 3;
                     }
                  }
               }
            }
         }
      }

      if(var3 != 1) {
         this.field_481.put(var2, Integer.valueOf(var3));
      } else {
         this.field_481.remove(var2);
      }
   }

   // $FF: renamed from: c (aK) void
   private void method_891(class_177 var1) {
      Iterator var3 = var1.field_439.method_412().iterator();

      while(var3.hasNext()) {
         class_120 var2;
         if((var2 = (class_120)var3.next()).field_277 != null) {
            boolean var4 = false;
            class_114 var5 = var2.method_495();
            HashSet var6 = new HashSet();
            LinkedList var7;
            (var7 = new LinkedList()).add(var5.field_257);

            while(!var7.isEmpty()) {
               class_148 var12 = (class_148)var7.removeFirst();
               if(!var6.contains(var12)) {
                  var6.add(var12);

                  for(int var8 = 0; var8 < var12.field_372.size(); ++var8) {
                     class_86 var9 = (class_86)var12.field_372.get(var8);
                     var4 |= this.method_892(var1, var2, var9);
                     class_86 var10 = null;
                     if(var9.field_148 == 8) {
                        var10 = this.method_895(var1, var2, (class_97)var9);
                     } else if(var9.field_148 == 5) {
                        var10 = this.method_894(var1, var2, (class_92)var9);
                     }

                     if(var10 != null) {
                        var12.field_372.set(var8, var10);
                        var4 = true;
                     }
                  }

                  Iterator var14 = var12.field_373.iterator();

                  while(var14.hasNext()) {
                     class_148 var13 = (class_148)var14.next();
                     var7.add(var13);
                  }
               }
            }

            if(var4) {
               this.method_890(var1, var2);
            }
         }
      }

      var3 = var1.field_445.iterator();

      while(var3.hasNext()) {
         class_177 var11 = (class_177)var3.next();
         this.method_891(var11);
      }

   }

   // $FF: renamed from: a (aK, cX, aJ) boolean
   private boolean method_892(class_177 var1, class_120 var2, class_86 var3) {
      boolean var4 = false;

      class_86 var5;
      for(Iterator var6 = var3.method_260().iterator(); var6.hasNext(); var4 |= this.method_892(var1, var2, var5)) {
         var5 = (class_86)var6.next();
      }

      while(true) {
         boolean var9 = false;
         Iterator var7 = var3.method_260().iterator();

         while(true) {
            if(var7.hasNext()) {
               class_86 var10 = (class_86)var7.next();
               class_86 var8 = null;
               if(var10.field_148 == 8) {
                  var8 = this.method_895(var1, var2, (class_97)var10);
               } else if(var10.field_148 == 5) {
                  var8 = this.method_894(var1, var2, (class_92)var10);
               }

               if(var8 == null) {
                  continue;
               }

               var3.method_263(var10, var8);
               var9 = true;
               var4 = true;
            }

            if(!var9) {
               return var4;
            }
            break;
         }
      }
   }

   // $FF: renamed from: a (aK, aK) boolean
   private static boolean method_893(class_177 var0, class_177 var1) {
      if(var0.field_438.field_528.equals(var1.field_438.field_528)) {
         return false;
      } else {
         while(var0.field_447 != null) {
            var0 = var0.field_447;
         }

         while(var1.field_447 != null) {
            var1 = var1.field_447;
         }

         return var0 == var1;
      }
   }

   // $FF: renamed from: a (aK, cX, aG) aJ
   private class_86 method_894(class_177 var1, class_120 var2, class_92 var3) {
      class_177 var5 = (class_177)class_181.method_855().method_588().get(var3.method_309());
      String var4 = class_129.method_562(var3.method_313(), var3.method_310());
      if(var5.field_442.containsKey(var4) && (var4 = (String)var5.field_443.get(var4)) != null && var4.length() > 0) {
         if(!method_893(var1, var5)) {
            return null;
         } else {
            if(!var2.field_284.contains(var4)) {
               class_193 var10000 = new class_193;
               var10000.method_936();
               class_193 var6 = var10000;
               var10000.method_938(var4);
               var2.field_278.method_750(var6);
               var2.field_284.add(var4);
            }

            int var7 = var2.field_280.method_814(2);
            class_88 var9 = new class_88;
            var9.method_276(var7, var3.method_254(), var2.field_278);
            class_88 var8 = var9;
            class_164 var10 = var2.field_278;
            class_77 var10001 = new class_77;
            var10001.method_214(var7, 0);
            var10.method_754(var10001, var4);
            return var8;
         }
      } else {
         return null;
      }
   }

   // $FF: renamed from: a (aK, cX, cR) aJ
   private class_86 method_895(class_177 var1, class_120 var2, class_97 var3) {
      class_177 var4 = (class_177)class_181.method_855().method_588().get(var3.method_345());
      class_120 var5 = null;
      if(var4 != null && var4.field_439 != null) {
         var5 = var4.field_439.method_410(var3.method_353(), var3.method_355());
      }

      if(var5 != null && this.field_481.containsKey(var5)) {
         if(var4.field_438.field_528.equals(var1.field_438.field_528) && var5.field_279.method_549().equals(var2.field_279.method_549()) && var5.field_279.method_548().equals(var2.field_279.method_548())) {
            return null;
         } else {
            int var7 = ((Integer)this.field_481.get(var5)).intValue();
            if(!method_893(var1, var4)) {
               return null;
            } else {
               class_86 var8 = (class_86)var5.method_495().field_257.field_372.get(0);
               Object var6 = null;
               switch(var7) {
               case 2:
                  class_89 var10;
                  if((var10 = (class_89)var8).method_292().field_148 == 12) {
                     class_88 var18 = (class_88)var10.method_292();
                     class_164 var16 = var5.field_278;
                     class_77 var10001 = new class_77;
                     var10001.method_216(var18);
                     String var12 = var16.method_753(var10001);
                     if(!var2.field_284.contains(var12)) {
                        class_193 var17 = new class_193;
                        var17.method_936();
                        class_193 var22 = var17;
                        var17.method_938(var12);
                        var2.field_278.method_750(var22);
                        var2.field_284.add(var12);
                     }

                     int var21 = var2.field_280.method_814(2);
                     class_88 var14 = new class_88;
                     var14.method_276(var21, var18.method_279(), var2.field_278);
                     var18 = var14;
                     var16 = var2.field_278;
                     var10001 = new class_77;
                     var10001.method_214(var21, 0);
                     var16.method_754(var10001, var12);
                     var6 = var18;
                  } else {
                     class_92 var20;
                     if(!(var20 = (class_92)var10.method_292().method_261()).method_312()) {
                        var20.method_263(var20.method_311(), (class_86)var3.method_341().get(0));
                     }

                     var6 = var20;
                  }
                  break;
               case 3:
                  class_93 var15;
                  if(var8.field_148 == 4) {
                     class_89 var10000 = (class_89)var8;
                     this = null;
                     var15 = (class_93)((class_93)var10000.method_292()).method_261();
                  } else {
                     var15 = (class_93)((class_93)var8).method_261();
                  }

                  class_92 var9;
                  if((var9 = (class_92)var15.method_316()).method_312()) {
                     var15.method_263(var15.method_317(), (class_86)var3.method_341().get(0));
                  } else {
                     var15.method_263(var15.method_317(), (class_86)var3.method_341().get(1));
                     var9.method_263(var9.method_311(), (class_86)var3.method_341().get(0));
                  }

                  var6 = var15;
                  break;
               case 4:
                  if(var8.field_148 == 4) {
                     var8 = ((class_89)var8).method_292();
                  }

                  var6 = (class_97)var8.method_261();
                  byte var11 = 0;
                  if(!((class_97)var6).method_351()) {
                     ((class_97)var6).method_263(((class_97)var6).method_349(), (class_86)var3.method_341().get(0));
                     var11 = 1;
                  }

                  for(var7 = 0; var7 < ((class_97)var6).method_341().size(); ++var7) {
                     ((class_97)var6).method_263((class_86)((class_97)var6).method_341().get(var7), (class_86)var3.method_341().get(var7 + var11));
                  }
               }

               if(var6 != null) {
                  boolean var13 = true;
                  if(var4.field_435 == 0 || (var4.field_436 & 8) != 0) {
                     class_128 var19 = var5.field_279;
                     if((var5.field_279.method_550() & 4096) == 0 && !var19.method_552().method_662("Synthetic")) {
                        var13 = false;
                     }
                  }

                  if(var13) {
                     var4.field_439.method_413().add(class_129.method_562(var3.method_353(), var3.method_355()));
                  }
               }

               return (class_86)var6;
            }
         }
      } else {
         return null;
      }
   }
}
