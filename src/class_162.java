import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Map.Entry;

// $FF: renamed from: cj
public final class class_162 {

   // $FF: renamed from: a java.util.HashMap
   private HashMap field_409;
   // $FF: renamed from: b java.util.HashMap
   private HashMap field_410;
   // $FF: renamed from: c java.util.HashSet
   private HashSet field_411;
   // $FF: renamed from: d ce
   private class_164 field_412;


   // $FF: renamed from: <init> (ca, bn, ce) void
   public void method_735(class_46 var1, class_128 var2, class_164 var3) {
      super();
      this.field_409 = new HashMap();
      this.field_410 = new HashMap();
      this.field_411 = new HashSet();
      this.field_412 = var3;
      class_193 var4 = class_181.method_849();
      boolean var5 = (var2.method_550() & 8) == 0;
      class_197 var9 = class_197.method_963(var2.method_548());
      byte var6 = 0;
      if(var5) {
         var6 = 1;
      }

      int var14 = var6 + var9.field_519.length;
      int var7 = 0;

      class_77 var10001;
      for(int var8 = 0; var8 < var14; ++var8) {
         this.field_411.add(Integer.valueOf(var7));
         var10001 = new class_77;
         var10001.method_214(var7, 0);
         var3.method_754(var10001, var4.method_939(var7));
         if(var5) {
            if(var8 == 0) {
               ++var7;
            } else {
               var7 += var9.field_519[var8 - 1].field_137;
            }
         } else {
            var7 += var9.field_519[var8].field_137;
         }
      }

      if(var5) {
         class_198 var15 = (class_198)class_181.method_844("CURRENT_CLASS");
         HashMap var10000 = var3.method_757();
         var10001 = new class_77;
         var10001.method_214(0, 0);
         var10000.put(var10001, var15.field_528);
         var10001 = new class_77;
         var10001.method_214(0, 0);
         var3.method_754(var10001, "this");
         var4.method_938("this");
      }

      LinkedList var16;
      (var16 = new LinkedList()).add(var1);

      class_46 var10;
      for(; !var16.isEmpty(); var16.addAll(var10.method_63())) {
         var10 = (class_46)var16.removeFirst();
         List var11 = null;
         if(var10.field_13 == 12) {
            var11 = ((class_51)var10).method_111();
         } else if(var10.field_13 == 7) {
            var11 = ((class_50)var10).method_102();
         }

         if(var11 != null) {
            Iterator var13 = var11.iterator();

            while(var13.hasNext()) {
               class_88 var12 = (class_88)var13.next();
               this.field_411.add(Integer.valueOf(var12.method_277()));
               var10001 = new class_77;
               var10001.method_216(var12);
               var3.method_754(var10001, var4.method_939(var12.method_277()));
               var12.method_282();
            }
         }
      }

      this.method_737(var1);
   }

   // $FF: renamed from: a () void
   public final void method_736() {
      class_193 var1 = class_181.method_849();
      Iterator var2 = this.field_409.entrySet().iterator();

      while(var2.hasNext()) {
         Entry var3;
         class_46 var4 = (class_46)(var3 = (Entry)var2.next()).getValue();
         Integer var11 = (Integer)var3.getKey();
         if(!this.field_411.contains(var11)) {
            class_164 var10000 = this.field_412;
            class_77 var10001 = new class_77;
            var10001.method_214(var11.intValue(), 0);
            var10000.method_754(var10001, var1.method_939(var11.intValue()));
            class_47 var5;
            class_46 var6;
            class_88 var12;
            if(var4.field_13 == 5 && (var5 = (class_47)var4).method_91() == 3) {
               if(var5.method_89() != null && method_739(var5.method_89(), var11)) {
                  continue;
               }

               Iterator var7 = method_738(Arrays.asList(new class_86[]{var5.method_85(), var5.method_87()})).iterator();

               while(var7.hasNext()) {
                  var12 = (class_88)var7.next();
                  var6 = null;
                  if(var12.method_277() == var11.intValue()) {
                     var4 = var4.method_71();
                     break;
                  }
               }
            }

            Integer var20 = var11;
            class_162 var14 = this;
            LinkedList var8;
            (var8 = new LinkedList()).add(var4);

            class_46 var13;
            label89:
            while(true) {
               if(var8.isEmpty()) {
                  var13 = null;
                  break;
               }

               var6 = (class_46)var8.remove(0);
               if(var8.isEmpty() || ((HashSet)var14.field_410.get(var6.field_14)).contains(var20)) {
                  if(var6.method_69() && !var8.isEmpty()) {
                     var13 = var6;
                     break;
                  }

                  if(var6.method_75() != null) {
                     var13 = var6;
                     break;
                  }

                  var8.clear();
                  switch(var6.field_13) {
                  case 2:
                  case 6:
                  case 10:
                  case 13:
                     var8.add(var6.method_61());
                     break;
                  case 15:
                     var8.addAll(0, var6.method_63());
                     break;
                  default:
                     var13 = var6;
                     break label89;
                  }
               }
            }

            class_46 var17 = var13;
            List var16;
            if(var13 == null) {
               var16 = var4.method_74();
            } else if(var17.method_75() == null) {
               var16 = var17.method_74();
            } else {
               var16 = var17.method_75();
            }

            boolean var19 = false;
            int var21 = 0;

            for(Iterator var22 = var16.iterator(); var22.hasNext(); ++var21) {
               class_86 var15;
               if(method_739(var15 = (class_86)var22.next(), var11)) {
                  var19 = true;
                  break;
               }

               boolean var9 = false;
               Iterator var10 = var15.method_258(true).iterator();

               while(var10.hasNext()) {
                  if((var15 = (class_86)var10.next()).field_148 == 12 && ((class_88)var15).method_277() == var11.intValue()) {
                     var9 = true;
                     break;
                  }
               }

               if(var9) {
                  break;
               }
            }

            if(!var19) {
               var12 = new class_88;
               int var10002 = var11.intValue();
               class_164 var10003 = this.field_412;
               class_77 var10004 = new class_77;
               var10004.method_214(var11.intValue(), 0);
               var12.method_276(var10002, var10003.method_751(var10004), this.field_412);
               class_88 var18 = var12;
               var12.method_282();
               var16.add(var21, var18);
            }
         }
      }

   }

   // $FF: renamed from: a (ca) java.util.Set
   private Set method_737(class_46 var1) {
      HashMap var2 = new HashMap();
      List var8;
      if(var1.method_75() == null) {
         ArrayList var3 = new ArrayList();
         ArrayList var4 = new ArrayList();
         Iterator var6 = var1.method_44().iterator();

         while(var6.hasNext()) {
            Object var5;
            if((var5 = var6.next()) instanceof class_46) {
               class_46 var7 = (class_46)var5;
               var3.addAll(this.method_737(var7));
               if(var7.field_13 == 5) {
                  class_47 var12;
                  if((var12 = (class_47)var7).method_91() != 3 && var12.method_91() != 0) {
                     var4.add(var12.method_85());
                  }
               } else {
                  class_51 var14;
                  if(var7.field_13 == 12 && (var14 = (class_51)var7).method_107() && var14.method_109() != null) {
                     var4.add(var14.method_109());
                  }
               }
            } else if(var5 instanceof class_86) {
               var4.add((class_86)var5);
            }
         }

         Integer var16;
         Integer var13;
         for(var6 = var3.iterator(); var6.hasNext(); var2.put(var13, new Integer(var16.intValue() + 1))) {
            var13 = (Integer)var6.next();
            if((var16 = (Integer)var2.get(var13)) == null) {
               var16 = new Integer(0);
            }
         }

         var8 = method_738(var4);
      } else {
         var8 = method_738(var1.method_75());
      }

      Iterator var10 = var8.iterator();

      while(var10.hasNext()) {
         class_88 var9 = (class_88)var10.next();
         var2.put(new Integer(var9.method_277()), new Integer(2));
      }

      HashSet var11 = new HashSet((Collection)var2.keySet());
      var10 = var2.entrySet().iterator();

      while(var10.hasNext()) {
         Entry var15;
         if(((Integer)(var15 = (Entry)var10.next()).getValue()).intValue() > 1) {
            this.field_409.put((Integer)var15.getKey(), var1);
         }
      }

      this.field_410.put(var1.field_14, var11);
      return var11;
   }

   // $FF: renamed from: a (java.util.List) java.util.List
   private static List method_738(List var0) {
      ArrayList var1 = new ArrayList();
      ArrayList var2 = new ArrayList();
      Iterator var3 = var0.iterator();

      class_86 var4;
      while(var3.hasNext()) {
         var4 = (class_86)var3.next();
         var2.addAll(var4.method_258(true));
         var2.add(var4);
      }

      var3 = var2.iterator();

      while(var3.hasNext()) {
         if((var4 = (class_86)var3.next()).field_148 == 12) {
            var1.add((class_88)var4);
         }
      }

      return var1;
   }

   // $FF: renamed from: a (aJ, java.lang.Integer) boolean
   private static boolean method_739(class_86 var0, Integer var1) {
      class_88 var2;
      if(var0.field_148 == 2 && (var0 = ((class_93)var0).method_316()).field_148 == 12 && (var2 = (class_88)var0).method_277() == var1.intValue()) {
         var2.method_282();
         return true;
      } else {
         return false;
      }
   }
}
