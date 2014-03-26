import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

// $FF: renamed from: as
public final class class_192 {

   // $FF: renamed from: a cE
   public class_146 field_496;
   // $FF: renamed from: b c
   private class_102 field_497;


   // $FF: renamed from: <init> () void
   public void method_930() {
      super();
      class_146 var10001 = new class_146;
      var10001.method_653();
      this.field_496 = var10001;
   }

   // $FF: renamed from: a (de) bD
   public final class_208 method_931(class_77 var1) {
      class_146 var10000 = this.field_496;
      class_208 var10001 = new class_208;
      var10001.method_1022(var1.field_96, var1.field_97);
      class_208 var2 = var10001;
      var10000.method_655(var10001, var1);
      return var2;
   }

   // $FF: renamed from: a (bD, java.util.HashSet) boolean
   public final boolean method_932(class_208 var1, HashSet var2) {
      if(var2.size() == 1) {
         return this.field_497.method_381(var1, (class_4)var2.iterator().next());
      } else {
         HashSet var5 = new HashSet();
         if(var2.contains(var1)) {
            return true;
         } else {
            LinkedList var3;
            (var3 = new LinkedList()).add(var1);

            while(!var3.isEmpty()) {
               var1 = (class_208)var3.remove(0);
               if(!var5.contains(var1)) {
                  var5.add(var1);
                  if(var1.field_569.isEmpty()) {
                     return false;
                  }

                  Iterator var4 = var1.field_569.iterator();

                  while(var4.hasNext()) {
                     var1 = ((class_183)var4.next()).field_470;
                     if(!var5.contains(var1) && !var2.contains(var1)) {
                        var3.add(var1);
                     }
                  }
               }
            }

            return true;
         }
      }
   }

   // $FF: renamed from: a () void
   public final void method_933() {
      HashSet var1 = new HashSet();
      Iterator var3 = this.field_496.iterator();

      while(var3.hasNext()) {
         class_208 var2;
         if((var2 = (class_208)var3.next()).field_569.isEmpty()) {
            var1.add(var2);
         }
      }

      class_102 var10001 = new class_102;
      class_212 var10003 = new class_212;
      var10003.method_1063(this, var1);
      var10001.method_379(var10003);
      this.field_497 = var10001;
      this.field_497.method_380();
   }

   // $FF: renamed from: a (bD, java.util.List, java.util.HashSet) void
   private static void method_934(class_208 var0, List var1, HashSet var2) {
      HashMap var3 = new HashMap();
      LinkedList var4 = new LinkedList();
      LinkedList var5 = new LinkedList();
      var4.add(var0);
      var5.add(Integer.valueOf(0));

      while(!var4.isEmpty()) {
         var0 = (class_208)var4.getLast();
         int var6 = ((Integer)var5.removeLast()).intValue();
         var2.add(var0);
         Object var7;
         if((var7 = (List)var3.get(var0)) == null) {
            var3.put(var0, var7 = new ArrayList(var0.field_568));
         }

         while(true) {
            if(var6 < ((List)var7).size()) {
               class_208 var8 = ((class_183)((List)var7).get(var6)).field_471;
               if(var2.contains(var8)) {
                  ++var6;
                  continue;
               }

               var5.add(Integer.valueOf(var6 + 1));
               var4.add(var8);
               var5.add(Integer.valueOf(0));
            }

            if(var6 == ((List)var7).size()) {
               var1.add(0, var0);
               var4.removeLast();
            }
            break;
         }
      }

   }
}
