import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

// $FF: renamed from: J
public final class class_65 {

   // $FF: renamed from: <init> () void
   public void method_186() {
      super();
   }

   // $FF: renamed from: a (ca) boolean
   public static boolean method_187(class_46 var0) {
      HashMap var1 = new HashMap();
      Iterator var3 = var0.method_63().iterator();

      class_46 var2;
      while(var3.hasNext()) {
         if(!(var2 = (class_46)var3.next()).method_57(2).isEmpty()) {
            return false;
         }

         Integer var10001 = var2.field_14;
         class_154 var10002 = new class_154;
         var10002.method_712(var2.field_14);
         var1.put(var10001, var10002);
      }

      var3 = var0.method_63().iterator();

      class_154 var5;
      Iterator var6;
      class_154 var9;
      while(var3.hasNext()) {
         var2 = (class_46)var3.next();
         var5 = (class_154)var1.get(var2.field_14);
         var6 = var2.method_55(1, 1).iterator();

         while(var6.hasNext()) {
            class_46 var4 = (class_46)var6.next();
            var9 = (class_154)var1.get(var4.field_14);
            var5.field_391.add(var9);
            var9.field_390.add(var5);
         }
      }

      while(true) {
         boolean var7 = false;
         class_154 var8 = null;
         Iterator var10 = var1.values().iterator();

         while(true) {
            if(var10.hasNext()) {
               if((var5 = (class_154)var10.next()).field_391.contains(var5)) {
                  var7 = true;
               } else if(var5.field_390.size() == 1) {
                  var7 = true;
               }

               if(!var7) {
                  continue;
               }

               var8 = var5;
            }

            if(var8 == null) {
               if(var1.size() > 1) {
                  return true;
               }

               return false;
            }

            if(var7) {
               var8.field_391.remove(var8);
               var8.field_390.remove(var8);
               break;
            }

            (var5 = (class_154)var8.field_390.iterator().next()).field_391.addAll(var8.field_391);
            var5.field_391.remove(var8);
            var6 = var8.field_391.iterator();

            while(var6.hasNext()) {
               (var9 = (class_154)var6.next()).field_390.remove(var8);
               var9.field_390.add(var5);
            }

            var1.remove(var8.field_389);
            break;
         }
      }
   }

   // $FF: renamed from: b (ca) boolean
   public static boolean method_188(class_46 var0) {
      class_46 var2 = null;
      int var3 = Integer.MAX_VALUE;
      int var4 = Integer.MAX_VALUE;
      Iterator var5 = var0.method_63().iterator();

      class_46 var1;
      while(var5.hasNext()) {
         Set var6;
         int var7;
         if((var6 = (var1 = (class_46)var5.next()).method_56(1, 0)).size() > 1 && (var7 = var1.method_56(1, 1).size()) <= var4) {
            int var12 = method_189(var1) * (var6.size() - 1);
            if(var7 < var4 || var12 < var3) {
               var2 = var1;
               var3 = var12;
               var4 = var7;
            }
         }
      }

      var1 = var2;
      if(var2 == null) {
         return false;
      } else {
         class_124 var9 = (class_124)var2.method_58(1).iterator().next();
         class_46 var10;
         method_191(var10 = method_190(var1, (class_46)null, new HashMap()));
         var10.method_72(var0);
         var0.method_63().method_655(var10, var10.field_14);
         Iterator var11 = var1.method_58(1073741824).iterator();

         class_124 var8;
         while(var11.hasNext()) {
            if((var8 = (class_124)var11.next()).method_520() == var9.method_520() || var8.field_303 == var9.method_520()) {
               var1.method_33(var8);
               var8.method_520().method_52(1, var8, var10);
               var10.method_32(var8);
            }
         }

         var11 = var1.method_57(1073741824).iterator();

         while(var11.hasNext()) {
            var8 = (class_124)var11.next();
            class_124 var10001 = new class_124;
            var10001.method_515(var8.method_518(), var10, var8.method_522(), var8.field_303);
            var10.method_34(var10001);
         }

         return true;
      }
   }

   // $FF: renamed from: c (ca) int
   private static int method_189(class_46 var0) {
      int var1 = 0;
      if(var0.field_13 == 8) {
         var1 = ((class_48)var0).method_94().method_925().method_176();
      } else {
         for(Iterator var2 = var0.method_63().iterator(); var2.hasNext(); var1 += method_189(var0)) {
            var0 = (class_46)var2.next();
         }
      }

      return var1;
   }

   // $FF: renamed from: a (ca, ca, java.util.HashMap) ca
   private static class_46 method_190(class_46 var0, class_46 var1, HashMap var2) {
      if(var1 == null) {
         var1 = var0.method_47();
         var2.put(var0, var1);
      }

      Iterator var4 = var0.method_63().iterator();

      class_46 var5;
      while(var4.hasNext()) {
         class_46 var3;
         var5 = (var3 = (class_46)var4.next()).method_47();
         var1.method_63().method_655(var5, var5.field_14);
         var2.put(var3, var5);
      }

      int var7;
      class_46 var8;
      for(var7 = 0; var7 < var0.method_63().size(); ++var7) {
         var8 = (class_46)var0.method_63().get(var7);
         var5 = (class_46)var1.method_63().get(var7);
         Iterator var6 = var8.method_57(1073741824).iterator();

         while(var6.hasNext()) {
            class_124 var9 = (class_124)var6.next();
            class_124 var10000 = new class_124;
            var10000.method_515(var9.method_518(), var5, var2.containsKey(var9.method_522())?(class_46)var2.get(var9.method_522()):var9.method_522(), var2.containsKey(var9.field_303)?(class_46)var2.get(var9.field_303):var9.field_303);
            var9 = var10000;
            var5.method_34(var9);
         }
      }

      for(var7 = 0; var7 < var0.method_63().size(); ++var7) {
         var8 = (class_46)var0.method_63().get(var7);
         var5 = (class_46)var1.method_63().get(var7);
         method_190(var8, var5, var2);
      }

      return var1;
   }

   // $FF: renamed from: d (ca) void
   private static void method_191(class_46 var0) {
      var0.method_48();
      var0.method_78();
      Iterator var2 = var0.method_63().iterator();

      while(var2.hasNext()) {
         class_46 var1;
         (var1 = (class_46)var2.next()).method_72(var0);
         method_191(var1);
      }

   }
}
