import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Map.Entry;

// $FF: renamed from: C
public final class class_59 {

   // $FF: renamed from: <init> () void
   public void method_152() {
      super();
   }

   // $FF: renamed from: a (aK, aK) void
   public final void method_153(class_177 var1, class_177 var2) {
      if(!var2.field_445.isEmpty()) {
         class_177 var4 = var2;
         class_59 var3 = this;
         HashMap var5 = new HashMap();
         int var6 = 0;
         Iterator var8 = var2.field_445.iterator();

         while(var8.hasNext()) {
            class_177 var7;
            if(((var7 = (class_177)var8.next()).field_436 & 8) == 0 && (var7.field_436 & 512) == 0) {
               var6 |= var7.field_435;
               HashMap var9;
               if((var9 = var3.method_157(var7.field_439)).isEmpty()) {
                  class_181.method_859().writeMessage("Nested class " + var7.field_438.field_528 + " has no constructor!", 3);
               } else {
                  var5.put(var7.field_438.field_528, var9);
               }
            }
         }

         HashMap var19 = new HashMap();
         class_177 var17;
         Iterator var22;
         if(var6 != 1) {
            var22 = var2.field_439.method_412().iterator();

            while(var22.hasNext()) {
               class_120 var21;
               if((var21 = (class_120)var22.next()).field_277 != null) {
                  class_114 var10000 = var21.method_495();
                  var17 = null;
                  class_157 var10001 = new class_157;
                  var10001.method_725(var5, var4, var19, var21);
                  var10000.method_453(var10001);
               }
            }
         }

         var22 = var5.entrySet().iterator();

         while(var22.hasNext()) {
            Entry var20 = (Entry)var22.next();
            var17 = var4.method_816((String)var20.getKey());
            ArrayList var12 = null;
            Iterator var10;
            if(var19.containsKey(var20.getKey())) {
               var10 = ((HashMap)var19.get(var20.getKey())).values().iterator();

               while(var10.hasNext()) {
                  List var15 = (List)var10.next();
                  if(var12 == null) {
                     var12 = new ArrayList(var15);
                  } else {
                     method_159(var12, var15, false);
                  }
               }
            }

            ArrayList var16 = null;
            Iterator var11 = ((HashMap)var20.getValue()).values().iterator();

            while(var11.hasNext()) {
               List var26 = (List)var11.next();
               if(var16 == null) {
                  var16 = new ArrayList(var26);
               } else {
                  method_159(var16, var26, false);
               }
            }

            if(var12 == null) {
               var12 = new ArrayList(var16);
               boolean var27 = false;

               for(int var24 = 0; var24 < var12.size(); ++var24) {
                  if(var12.get(var24) != null) {
                     if(var27) {
                        var12.set(var24, (Object)null);
                     }

                     var27 = true;
                  }
               }
            }

            method_159(var12, var16, true);

            for(int var25 = 0; var25 < var12.size(); ++var25) {
               class_160 var28;
               if((var28 = (class_160)var12.get(var25)) != null && var28.field_405.length() > 0) {
                  var17.field_442.put(var28.field_405, var28.field_406);
               }
            }

            var11 = ((HashMap)var20.getValue()).entrySet().iterator();

            while(var11.hasNext()) {
               Entry var29;
               method_159((List)(var29 = (Entry)var11.next()).getValue(), var12, false);
               class_120 var18;
               (var18 = var17.field_439.method_410("<init>", (String)var29.getKey())).field_282 = new ArrayList();
               var10 = ((List)var29.getValue()).iterator();

               while(var10.hasNext()) {
                  class_160 var23 = (class_160)var10.next();
                  var18.field_282.add(var23 == null?null:var23.field_406);
               }
            }
         }

         this.method_154(var1, var2);
         Iterator var13 = var2.field_445.iterator();

         class_177 var14;
         while(var13.hasNext()) {
            if(((var14 = (class_177)var13.next()).field_435 == 4 || var14.field_435 == 1) && var14.field_437 == null) {
               class_181.method_859().writeMessage("Nameless local or member class " + var14.field_438.field_528 + "!", 3);
               var14.field_437 = "NamelessClass" + var14.hashCode();
            }
         }

         var13 = var2.field_445.iterator();

         while(var13.hasNext()) {
            if((var14 = (class_177)var13.next()).field_435 != 1 || (var14.field_436 & 8) == 0) {
               this.method_156(var2, var14);
               if(var14.field_435 == 4) {
                  this.method_160((class_120)var2.field_439.method_412().method_659(var14.field_440), var14);
               }
            }
         }

         var13 = var2.field_445.iterator();

         while(var13.hasNext()) {
            var14 = (class_177)var13.next();
            this.method_153(var1, var14);
         }

      }
   }

   // $FF: renamed from: b (aK, aK) void
   private void method_154(class_177 var1, class_177 var2) {
      Iterator var3 = (new ArrayList(var2.field_445)).iterator();

      while(var3.hasNext()) {
         class_177 var6;
         if(((var6 = (class_177)var3.next()).field_435 == 4 || var6.field_435 == 2) && var6.field_440 == null) {
            Set var4 = var6.field_446;
            class_68 var5;
            if(var6.field_446.size() == 1 && (var5 = (class_68)var6.field_438.method_978().method_659("EnclosingMethod")) != null && var5.method_200() != null && var2.field_438.field_528.equals(var5.method_198()) && var2.field_438.method_968(var5.method_200(), var5.method_199()) != null) {
               var6.field_440 = class_129.method_562(var5.method_200(), var5.method_199());
            } else {
               var2.field_445.remove(var6);
               var6.field_447 = null;
               var4.remove(var2.field_438.field_528);
               boolean var7;
               if(var7 = !var4.isEmpty()) {
                  var7 = method_155(var1, var6);
               }

               if(!var7) {
                  if(var6.field_435 == 2) {
                     class_181.method_859().writeMessage("Unreferenced anonymous class " + var6.field_438.field_528 + "!", 3);
                  } else if(var6.field_435 == 4) {
                     class_181.method_859().writeMessage("Unreferenced local class " + var6.field_438.field_528 + "!", 3);
                  }
               }
            }
         }
      }

   }

   // $FF: renamed from: c (aK, aK) boolean
   private static boolean method_155(class_177 var0, class_177 var1) {
      Set var2 = var1.field_446;
      LinkedList var3;
      (var3 = new LinkedList()).add(var0);

      while(!var3.isEmpty()) {
         var0 = (class_177)var3.removeFirst();
         if(var2.contains(var0.field_438.field_528)) {
            var0.field_445.add(var1);
            var1.field_447 = var0;
            return true;
         }

         var3.addAll(var0.field_445);
      }

      return false;
   }

   // $FF: renamed from: d (aK, aK) void
   private void method_156(class_177 var1, class_177 var2) {
      class_120 var16 = (class_120)var1.field_439.method_412().method_659(var2.field_440);
      Iterator var4 = var2.field_439.method_412().iterator();

      while(var4.hasNext()) {
         class_120 var3;
         if((var3 = (class_120)var4.next()).field_277 != null) {
            HashMap var5 = new HashMap();
            HashMap var6 = new HashMap();
            HashMap var7 = new HashMap();
            class_77 var11;
            class_77 var10000;
            if(var3.field_282 != null) {
               int var8 = 0;
               int var9 = 1;
               class_197 var10 = class_197.method_963(var3.field_279.method_548());

               for(Iterator var12 = var3.field_282.iterator(); var12.hasNext(); var9 += var10.field_519[var8++].field_137) {
                  if((var11 = (class_77)var12.next()) != null) {
                     var10000 = new class_77;
                     var10000.method_214(var3.field_280.method_814(2), 0);
                     class_77 var13 = var10000;
                     var7.put(Integer.valueOf(var9), var13);
                     String var14 = null;
                     class_83 var15 = null;
                     if(var2.field_435 != 1) {
                        var14 = var16.field_278.method_753(var11);
                        var15 = var16.field_278.method_751(var11);
                        var16.field_278.method_756(var11);
                     }

                     if(var11.field_96 == -1 || "this".equals(var14)) {
                        if(var1.field_437 == null) {
                           var14 = "<VAR_NAMELESS_ENCLOSURE>";
                        } else {
                           var14 = var1.field_437 + ".this";
                        }

                        var3.field_278.method_757().put(var13, var1.field_438.field_528);
                     }

                     var5.put(var13, var14);
                     var6.put(var13, var15);
                  }
               }
            }

            HashMap var20 = new HashMap();
            Iterator var23 = var2.field_442.entrySet().iterator();

            while(var23.hasNext()) {
               Entry var22 = (Entry)var23.next();
               var10000 = new class_77;
               var10000.method_214(var3.field_280.method_814(2), 0);
               var11 = var10000;
               var20.put((String)var22.getKey(), var11);
               class_168 var25 = (class_168)var2.field_438.method_977().method_659((String)var22.getKey());
               var2.field_439.method_413().add(class_129.method_562(var25.method_775(), var25.method_774()));
               String var28 = null;
               class_83 var30 = null;
               if(var2.field_435 != 1) {
                  var28 = var16.field_278.method_753((class_77)var22.getValue());
                  var30 = var16.field_278.method_751((class_77)var22.getValue());
                  var16.field_278.method_756((class_77)var22.getValue());
               }

               if(((class_77)var22.getValue()).field_96 == -1 || "this".equals(var28)) {
                  if(var1.field_437 == null) {
                     var28 = "<VAR_NAMELESS_ENCLOSURE>";
                  } else {
                     var28 = var1.field_437 + ".this";
                  }

                  var3.field_278.method_757().put(var11, var1.field_438.field_528);
               }

               var5.put(var11, var28);
               var6.put(var11, var30);
               var2.field_443.put((String)var22.getKey(), var28);
            }

            HashSet var21;
            (var21 = new HashSet(var5.values())).removeAll(var3.field_284);
            class_164 var19 = var3.field_278;
            class_193 var10001 = new class_193;
            var10001.method_937(var21);
            var19.method_750(var10001);
            var3.field_284.addAll(var21);
            Iterator var27 = var5.entrySet().iterator();

            while(var27.hasNext()) {
               Entry var24;
               class_77 var26 = (class_77)(var24 = (Entry)var27.next()).getKey();
               class_83 var29 = (class_83)var6.get(var26);
               var3.field_278.method_754(var26, (String)var24.getValue());
               if(var29 != null) {
                  var3.field_278.method_752(var26, var29);
               }
            }

            class_114 var17 = var3.method_495();
            class_159 var18 = new class_159;
            var18.method_727(var2, var20, var3, var7);
            var17.method_453(var18);
         }
      }

   }

   // $FF: renamed from: a (v) java.util.HashMap
   private HashMap method_157(class_109 var1) {
      HashMap var12 = new HashMap();
      class_198 var2;
      Iterator var4 = (var2 = var1.method_411()).method_976().iterator();

      while(var4.hasNext()) {
         class_128 var3 = (class_128)var4.next();
         if("<init>".equals(var3.method_549())) {
            class_197 var5 = class_197.method_963(var3.method_548());
            class_120 var6;
            class_114 var7;
            if((var7 = (var6 = var1.method_410("<init>", var3.method_548())).method_495()) != null) {
               ArrayList var8 = new ArrayList();
               int var9 = 1;

               for(int var10 = 0; var10 < var5.field_519.length; ++var10) {
                  String var11 = method_158(var2, var6, var7, var9);
                  class_160 var10001;
                  if(var11 == null) {
                     var10001 = null;
                  } else {
                     var10001 = new class_160;
                     class_77 var10004 = new class_77;
                     var10004.method_214(-1, 0);
                     var10001.method_729(var11, var10004);
                  }

                  var8.add(var10001);
                  var9 += var5.field_519[var10].field_137;
               }

               var12.put(var3.method_548(), var8);
            }
         }
      }

      return var12;
   }

   // $FF: renamed from: a (bW, cX, q, int) java.lang.String
   private static String method_158(class_198 var0, class_120 var1, class_114 var2, int var3) {
      String var4 = "";
      class_164 var10000 = var1.field_278;
      class_77 var10001 = new class_77;
      var10001.method_214(var3, 0);
      if(var10000.method_755(var10001) == 1) {
         return null;
      } else {
         boolean var7 = class_181.method_846("nns");
         class_148 var8;
         if((var8 = var2.field_257).field_374.isEmpty()) {
            Iterator var5 = var8.field_372.iterator();

            while(var5.hasNext()) {
               class_86 var9;
               class_93 var10;
               if((var9 = (class_86)var5.next()).field_148 == 2 && (var10 = (class_93)var9).method_317().field_148 == 12 && ((class_88)var10.method_317()).method_277() == var3 && var10.method_316().field_148 == 5) {
                  class_92 var11 = (class_92)var10.method_316();
                  class_168 var6;
                  if((var6 = var0.method_967(var11.method_313(), var11.method_310())) != null && var0.field_528.equals(var11.method_309()) && (var6.field_423 & 16) != 0 && ((var6.field_423 & 4096) != 0 || var6.method_772().method_662("Synthetic") || var7 && (var6.field_423 & 2) != 0)) {
                     var4 = class_129.method_562(var11.method_313(), var11.method_310());
                     break;
                  }
               }
            }
         }

         return var4;
      }
   }

   // $FF: renamed from: a (java.util.List, java.util.List, boolean) void
   private static void method_159(List var0, List var1, boolean var2) {
      int var3;
      class_160 var4;
      class_160 var5;
      boolean var6;
      for(var3 = 1; var0.size() > var3 && var1.size() > var3; ++var3) {
         var4 = (class_160)var0.get(var0.size() - var3);
         var5 = (class_160)var1.get(var1.size() - var3);
         var6 = false;
         if(var4 != null && var5 != null) {
            var6 = true;
            if(var4.field_405.length() == 0) {
               var4.field_405 = var5.field_405;
            } else if(var5.field_405.length() == 0) {
               if(var2) {
                  var5.field_405 = var4.field_405;
               }
            } else {
               var6 = var4.field_405.equals(var5.field_405);
            }
         } else {
            var6 = var4 == var5;
         }

         if(!var6) {
            var0.set(var0.size() - var3, (Object)null);
            if(var2) {
               var1.set(var1.size() - var3, (Object)null);
            }
         } else if(var4 != null) {
            if(var4.field_406.field_96 == -1) {
               var4.field_406 = var5.field_406;
            } else {
               var5.field_406 = var4.field_406;
            }
         }
      }

      int var7;
      for(var7 = 1; var7 <= var0.size() - var3; ++var7) {
         var0.set(var7, (Object)null);
      }

      if(var2) {
         for(var7 = 1; var7 <= var1.size() - var3; ++var7) {
            var1.set(var7, (Object)null);
         }
      }

      if(var0.isEmpty()) {
         if(!var1.isEmpty() && var2) {
            var1.set(0, (Object)null);
            return;
         }
      } else {
         if(var1.isEmpty()) {
            var0.set(0, (Object)null);
            return;
         }

         var4 = (class_160)var0.get(0);
         var5 = (class_160)var1.get(0);
         var6 = false;
         if(var4 != null && var5 != null) {
            var6 = true;
            if(var4.field_405.length() == 0) {
               var4.field_405 = var5.field_405;
            } else if(var5.field_405.length() == 0) {
               if(var2) {
                  var5.field_405 = var4.field_405;
               }
            } else {
               var6 = var4.field_405.equals(var5.field_405);
            }
         } else {
            var6 = var4 == var5;
         }

         if(!var6) {
            var0.set(0, (Object)null);
            if(var2) {
               var1.set(0, (Object)null);
               return;
            }
         } else {
            if(var4.field_406.field_96 == -1) {
               var4.field_406 = var5.field_406;
               return;
            }

            var5.field_406 = var4.field_406;
         }
      }

   }

   // $FF: renamed from: a (cX, aK) void
   private void method_160(class_120 var1, class_177 var2) {
      class_54 var3 = var1.field_277;
      HashSet var4 = new HashSet();
      class_83 var10000 = new class_83;
      var10000.method_239(var2.field_438.field_528, true);
      class_83 var7 = var10000;
      class_46 var5;
      if((var5 = this.method_162(var3, var7, var4)) == null) {
         var5 = var3.method_61();
      }

      List var6;
      class_46 var8;
      if((var8 = method_161(var5, var4)) == null) {
         var6 = var5.method_74();
      } else if(var8.method_75() == null) {
         var6 = var8.method_74();
      } else {
         var6 = var8.method_75();
      }

      int var9 = 0;

      for(Iterator var11 = var6.iterator(); var11.hasNext() && !method_163((class_86)var11.next(), var7); ++var9) {
         ;
      }

      class_88 var10 = new class_88;
      var10.method_276(var1.field_280.method_814(2), var7, var1.field_278);
      class_88 var12 = var10;
      var10.method_282();
      var12.method_287();
      var6.add(var9, var12);
   }

   // $FF: renamed from: a (ca, java.util.HashSet) ca
   private static class_46 method_161(class_46 var0, HashSet var1) {
      LinkedList var2;
      (var2 = new LinkedList()).add(var0);

      while(!var2.isEmpty()) {
         var0 = (class_46)var2.remove(0);
         if(var2.isEmpty() || var1.contains(var0)) {
            if(var0.method_69() && !var2.isEmpty()) {
               return var0;
            }

            if(var0.method_75() != null) {
               return var0;
            }

            var2.clear();
            switch(var0.field_13) {
            case 2:
            case 6:
            case 10:
            case 13:
               var2.add(var0.method_61());
               break;
            case 15:
               var2.addAll(0, var0.method_63());
               break;
            default:
               return var0;
            }
         }
      }

      return null;
   }

   // $FF: renamed from: a (ca, Q, java.util.HashSet) ca
   private class_46 method_162(class_46 var1, class_83 var2, HashSet var3) {
      Object var4 = new ArrayList();
      class_46 var5 = null;
      if(var1.method_75() == null) {
         int var6 = 0;
         Iterator var8 = var1.method_44().iterator();

         while(var8.hasNext()) {
            Object var7;
            if((var7 = var8.next()) instanceof class_46) {
               class_46 var11 = (class_46)var7;
               class_46 var9;
               if((var9 = this.method_162(var11, var2, var3)) != null) {
                  if(var6 == 1) {
                     var5 = var1;
                     break;
                  }

                  var5 = var9;
                  ++var6;
               }

               if(var11.field_13 == 5) {
                  class_47 var13 = (class_47)var11;
                  ((List)var4).addAll(var13.method_82());
                  ((List)var4).addAll(var13.method_83());
               }
            } else if(var7 instanceof class_86) {
               ((List)var4).add((class_86)var7);
            }
         }
      } else {
         var4 = var1.method_75();
      }

      if(var5 != var1) {
         Iterator var12 = ((List)var4).iterator();

         while(var12.hasNext()) {
            class_86 var10;
            if((var10 = (class_86)var12.next()) != null && method_163(var10, var2)) {
               var5 = var1;
               break;
            }
         }
      }

      if(var5 != null) {
         var3.add(var1);
      }

      return var5;
   }

   // $FF: renamed from: a (aJ, Q) boolean
   private static boolean method_163(class_86 var0, class_83 var1) {
      List var2;
      (var2 = var0.method_258(true)).add(var0);
      String var5 = var1.field_136;
      Iterator var3 = var2.iterator();

      boolean var4;
      do {
         if(!var3.hasNext()) {
            return false;
         }

         class_86 var6 = (class_86)var3.next();
         var4 = false;
         class_83 var8;
         switch(var6.field_148) {
         case 3:
            class_87 var9 = (class_87)var6;
            var4 = class_83.field_130.equals(var9.method_271()) && var5.equals(var9.method_273()) || var1.equals(var9.method_271());
         case 4:
         case 6:
         case 7:
         case 9:
         case 11:
         default:
            break;
         case 5:
            var4 = var5.equals(((class_92)var6).method_309());
            break;
         case 8:
            var4 = var5.equals(((class_97)var6).method_345());
            break;
         case 10:
            var4 = (var8 = var6.method_254()).field_133 == 8 && var5.equals(var8.field_136);
            break;
         case 12:
            class_88 var7;
            if((var7 = (class_88)var6).method_281()) {
               var8 = var7.method_279();
               if(var1.equals(var8) || var8.field_135 > 0 && var1.field_136.equals(var8.field_136)) {
                  var4 = true;
               }
            }
         }
      } while(!var4);

      return true;
   }
}
