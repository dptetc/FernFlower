import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;

// $FF: renamed from: d
public final class class_101 {

   // $FF: renamed from: a java.util.HashMap
   private HashMap field_210;
   // $FF: renamed from: b cu
   private class_155 field_211;


   // $FF: renamed from: <init> () void
   public void method_369() {
      super();
      this.field_210 = new HashMap();
   }

   // $FF: renamed from: a (S) void
   public final void method_370(class_54 var1) {
      class_128 var2 = (class_128)class_181.method_844("CURRENT_METHOD");
      class_179 var10000 = new class_179;
      var10000.method_822();
      class_179 var3 = var10000;
      var10000.method_823(var1, var2);
      class_81 var15 = new class_81;
      var15.method_225();
      class_114 var12 = var15.method_226(var1);
      ArrayList var5 = new ArrayList();
      Iterator var6 = var3.method_833().entrySet().iterator();

      class_77 var10001;
      int var19;
      while(var6.hasNext()) {
         Entry var14 = (Entry)var6.next();
         HashSet var7;
         (var7 = new HashSet()).add((class_77)var14.getKey());
         Iterator var9 = ((class_141)var14.getValue()).iterator();

         while(var9.hasNext()) {
            Integer var8 = (Integer)var9.next();
            var10001 = new class_77;
            var10001.method_214(((class_77)var14.getKey()).field_96, var8.intValue());
            var7.add(var10001);
         }

         for(var19 = var5.size() - 1; var19 >= 0; --var19) {
            HashSet var20 = (HashSet)var5.get(var19);
            HashSet var10;
            (var10 = new HashSet(var7)).retainAll(var20);
            if(!var10.isEmpty()) {
               var7.addAll(var20);
               var5.remove(var19);
            }
         }

         var5.add(var7);
      }

      HashMap var16 = new HashMap();
      Iterator var18 = var5.iterator();

      while(var18.hasNext()) {
         HashSet var17 = (HashSet)var18.next();
         var19 = Integer.MAX_VALUE;
         Iterator var22 = var17.iterator();

         class_77 var21;
         while(var22.hasNext()) {
            if((var21 = (class_77)var22.next()).field_97 < var19) {
               var19 = var21.field_97;
            }
         }

         var22 = var17.iterator();

         while(var22.hasNext()) {
            var21 = (class_77)var22.next();
            var10001 = new class_77;
            var10001.method_214(var21.field_96, var21.field_97);
            var16.put(var10001, Integer.valueOf(var19));
         }
      }

      class_143 var11 = new class_143;
      var11.method_650(var16);
      var12.method_453(var11);
      class_155 var13 = new class_155;
      var13.method_713();
      this.field_211 = var13;
      this.field_211.method_714(var1, var12);
      this.method_372(this.field_211, var12);
      method_371(this.field_211);
      this.method_373(this.field_211, var12);
   }

   // $FF: renamed from: a (cu) void
   private static void method_371(class_155 var0) {
      HashMap var1 = var0.method_717();
      HashMap var6 = var0.method_718();
      HashSet var10000 = new HashSet((Collection)var6.keySet());
      class_77 var2 = null;
      Iterator var3 = var10000.iterator();

      while(var3.hasNext()) {
         var2 = (class_77)var3.next();
         class_83 var4 = (class_83)var6.get(var2);
         class_83 var5 = (class_83)var1.get(var2);
         if(var4.field_133 != 15 && var4.field_133 != 16) {
            if(var4.field_133 == 13) {
               var6.put(var2, class_83.field_131);
            }
         } else {
            var4 = var5 != null && var5.field_133 == 1?class_83.field_123:(var4.field_133 == 15?class_83.field_122:class_83.field_124);
            var6.put(var2, var4);
         }
      }

   }

   // $FF: renamed from: a (cu, q) void
   private void method_372(class_155 var1, class_114 var2) {
      HashMap var16 = var1.method_717();
      HashMap var3 = var1.method_718();
      HashMap var4 = new HashMap();
      Iterator var6 = var3.keySet().iterator();

      while(var6.hasNext()) {
         class_77 var5;
         if((var5 = (class_77)var6.next()).field_97 >= 0) {
            HashSet var7;
            if((var7 = (HashSet)var4.get(Integer.valueOf(var5.field_96))) == null) {
               var7 = new HashSet();
               var4.put(Integer.valueOf(var5.field_96), var7);
            }

            var7.add(Integer.valueOf(var5.field_97));
         }
      }

      HashMap var18 = new HashMap();
      Iterator var20 = var4.entrySet().iterator();

      while(var20.hasNext()) {
         Entry var19;
         if(((HashSet)(var19 = (Entry)var20.next()).getValue()).size() > 1) {
            ArrayList var17;
            Collections.sort(var17 = new ArrayList((Collection)var19.getValue()));

            for(int var8 = 0; var8 < var17.size(); ++var8) {
               class_77 var10000 = new class_77;
               var10000.method_215((Integer)var19.getKey(), (Integer)var17.get(var8));
               class_77 var9 = var10000;
               class_83 var10 = (class_83)var3.get(var9);

               for(int var11 = var8 + 1; var11 < var17.size(); ++var11) {
                  var10000 = new class_77;
                  var10000.method_215((Integer)var19.getKey(), (Integer)var17.get(var11));
                  class_77 var12 = var10000;
                  class_83 var13 = (class_83)var3.get(var12);
                  if(var10.equals(var13) || var10.equals(class_83.field_128) && var13.field_133 == 8 || var13.equals(class_83.field_128) && var10.field_133 == 8) {
                     class_83 var14 = (class_83)var16.get(var9);
                     class_83 var15 = (class_83)var16.get(var12);
                     var16.put(var9, var14 == null?var15:(var15 == null?var14:class_83.method_244(var14, var15)));
                     var18.put(var12, Integer.valueOf(var9.field_97));
                     var16.remove(var12);
                     var3.remove(var12);
                     if(var10.equals(class_83.field_128)) {
                        var3.put(var9, var13);
                        var10 = var13;
                     }

                     var1.method_719().put(var9, Integer.valueOf(1));
                     var17.remove(var11);
                     --var11;
                  }
               }
            }
         }
      }

      if(!var18.isEmpty()) {
         class_187 var10001 = new class_187;
         var10001.method_886(var18);
         var2.method_453(var10001);
      }

   }

   // $FF: renamed from: b (cu, q) void
   private void method_373(class_155 var1, class_114 var2) {
      HashMap var3 = var1.method_717();
      HashMap var4 = var1.method_718();
      HashMap var12 = var1.method_719();
      class_176 var5 = class_181.method_853();
      HashMap var6 = new HashMap();
      HashMap var7 = new HashMap();
      HashSet var10000 = new HashSet((Collection)var4.keySet());
      class_77 var8 = null;
      Iterator var9 = var10000.iterator();

      while(var9.hasNext()) {
         if((var8 = (class_77)var9.next()).field_97 >= 0) {
            int var10 = var8.field_97 == 1?var8.field_96:var5.method_814(2);
            class_77 var13 = new class_77;
            var13.method_214(var10, 0);
            class_77 var11 = var13;
            var4.put(var11, (class_83)var4.get(var8));
            var3.put(var11, (class_83)var3.get(var8));
            if(var12.containsKey(var8)) {
               var12.put(var11, (Integer)var12.remove(var8));
            }

            var6.put(var8, Integer.valueOf(var10));
            var7.put(Integer.valueOf(var10), Integer.valueOf(var8.field_96));
         }
      }

      class_145 var10001 = new class_145;
      var10001.method_652(var6, var3);
      var2.method_453(var10001);
      this.field_210 = var7;
   }

   // $FF: renamed from: a (de) Q
   public final class_83 method_374(class_77 var1) {
      return this.field_211 == null?null:this.field_211.method_721(var1);
   }

   // $FF: renamed from: a (de, Q) void
   public final void method_375(class_77 var1, class_83 var2) {
      this.field_211.method_720(var1, var2);
   }

   // $FF: renamed from: b (de) int
   public final int method_376(class_77 var1) {
      int var2 = 3;
      if(this.field_211 != null) {
         Integer var3;
         var2 = (var3 = (Integer)this.field_211.method_719().get(var1)) == null?3:var3.intValue();
      }

      return var2;
   }

   // $FF: renamed from: c (de) void
   public final void method_377(class_77 var1) {
      this.field_211.method_719().put(var1, Integer.valueOf(2));
   }

   // $FF: renamed from: a () java.util.HashMap
   public final HashMap method_378() {
      return this.field_210;
   }
}
