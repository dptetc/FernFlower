import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

// $FF: renamed from: bq
public final class class_130 {

   // $FF: renamed from: a ca
   private class_46 field_327;
   // $FF: renamed from: b java.util.Map
   private Map field_328;
   // $FF: renamed from: c java.util.Map
   private Map field_329;
   // $FF: renamed from: d java.util.Map
   private Map field_330;
   // $FF: renamed from: e java.util.Map
   private Map field_331;
   // $FF: renamed from: f ay
   private class_185 field_332;


   // $FF: renamed from: <init> (ca) void
   public void method_563(class_46 var1) {
      super();
      this.field_328 = new HashMap();
      this.field_329 = new HashMap();
      this.field_330 = new HashMap();
      this.field_331 = new HashMap();
      this.field_327 = var1;
   }

   // $FF: renamed from: a () void
   public final void method_564() {
      class_185 var10001 = new class_185;
      var10001.method_881(this.field_327);
      this.field_332 = var10001;
      this.field_332.method_882();
      class_130 var1 = this;

      class_146 var2;
      List var3;
      for(int var4 = (var3 = (List)(var2 = this.field_332.method_883()).method_665()).size() - 1; var4 >= 0; --var4) {
         Integer var5 = (Integer)var3.get(var4);
         Integer var6 = (Integer)var2.get(var4);
         Object var7;
         if((var7 = (Set)var1.field_328.get(var6)) == null) {
            var1.field_328.put(var6, var7 = new HashSet());
         }

         ((Set)var7).add(var5);
      }

      Integer var8 = var1.field_327.method_61().field_14;
      ((Set)var1.field_328.get(var8)).remove(var8);
      this.method_566();
      this.method_568(this.field_327.method_61().field_14);
      this.field_328.clear();
      this.field_329.clear();
   }

   // $FF: renamed from: a (java.lang.Integer, java.lang.Integer) boolean
   public final boolean method_565(Integer var1, Integer var2) {
      Map var10000 = (Map)this.field_331.get(var1);
      Entry var3 = null;
      Iterator var4 = var10000.entrySet().iterator();

      Integer var5;
      do {
         do {
            if(!var4.hasNext()) {
               return true;
            }

            var3 = (Entry)var4.next();
         } while(var1.equals(this.field_330.get(var3.getKey())));
      } while((var5 = (Integer)var3.getValue()).intValue() != -1 && var5.equals(var2));

      return false;
   }

   // $FF: renamed from: c () void
   private void method_566() {
      Iterator var2 = this.field_327.method_63().iterator();

      while(var2.hasNext()) {
         class_46 var1;
         List var3;
         if(!(var3 = (var1 = (class_46)var2.next()).method_55(2, 0)).isEmpty()) {
            HashSet var4 = new HashSet();
            Iterator var5 = var3.iterator();

            while(var5.hasNext()) {
               class_46 var6 = (class_46)var5.next();
               var4.add(var6.field_14);
            }

            this.field_329.put(var1.field_14, var4);
         }
      }

      this.field_330 = this.method_567(this.field_327.method_61().field_14);
   }

   // $FF: renamed from: a (java.lang.Integer) java.util.Map
   private Map method_567(Integer var1) {
      HashMap var2 = new HashMap();
      Set var3;
      Iterator var4;
      if((var3 = (Set)this.field_328.get(var1)) != null) {
         var4 = var3.iterator();

         while(var4.hasNext()) {
            Integer var7 = (Integer)var4.next();
            Map var8;
            Iterator var6 = (var8 = this.method_567(var7)).keySet().iterator();

            while(var6.hasNext()) {
               Integer var5 = (Integer)var6.next();
               var2.put(var5, var2.containsKey(var5)?var1:(Integer)var8.get(var5));
            }
         }
      }

      var4 = this.field_329.entrySet().iterator();

      while(var4.hasNext()) {
         Entry var9;
         if(((Set)(var9 = (Entry)var4.next()).getValue()).contains(var1)) {
            var2.put((Integer)var9.getKey(), var1);
         }
      }

      return var2;
   }

   // $FF: renamed from: b (java.lang.Integer) void
   private void method_568(Integer var1) {
      HashMap var2 = new HashMap();
      Set var3;
      if((var3 = (Set)this.field_328.get(var1)) != null) {
         Iterator var4 = var3.iterator();

         while(var4.hasNext()) {
            Integer var10 = (Integer)var4.next();
            this.method_568(var10);
            Map var5 = (Map)this.field_331.get(var10);
            Iterator var7 = this.field_329.entrySet().iterator();

            while(var7.hasNext()) {
               Entry var6;
               Integer var8 = (Integer)(var6 = (Entry)var7.next()).getKey();
               Set var11;
               if((var11 = (Set)var6.getValue()).contains(var1)) {
                  Integer var9 = null;
                  if((var9 = !var11.contains(var10)?var10:(var2.containsKey(var8)?new Integer(-1):(Integer)var5.get(var8))) != null) {
                     var2.put(var8, var9);
                  }
               }
            }
         }
      }

      this.field_331.put(var1, var2);
   }

   // $FF: renamed from: b () ay
   public final class_185 method_569() {
      return this.field_332;
   }
}
