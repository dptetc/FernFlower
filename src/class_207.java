import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

// $FF: renamed from: an
public final class class_207 {

   // $FF: renamed from: a java.util.List
   private List field_561;
   // $FF: renamed from: b java.util.HashMap
   private HashMap field_562;
   // $FF: renamed from: c java.util.HashMap
   private HashMap field_563;
   // $FF: renamed from: d ca
   private class_46 field_564;
   // $FF: renamed from: e aw
   private class_195 field_565;


   // $FF: renamed from: <init> () void
   public void method_1011() {
      super();
      this.field_562 = new HashMap();
      this.field_563 = new HashMap();
   }

   // $FF: renamed from: a (ca) java.util.HashMap
   public final HashMap method_1012(class_46 var1) {
      this.field_564 = var1;
      HashSet var2 = new HashSet();
      Iterator var4 = var1.method_63().iterator();

      while(var4.hasNext()) {
         class_46 var3 = (class_46)var4.next();
         var2.add(var3.field_14);
      }

      class_195 var10001 = new class_195;
      var10001.method_950(var2);
      this.field_565 = var10001;
      this.field_561 = var1.method_39();
      this.method_1016();
      this.method_1015();
      class_130 var10000 = new class_130;
      var10000.method_563(var1);
      class_130 var7 = var10000;
      var10000.method_564();
      this.method_1014(var7);
      this.method_1013(var7);
      HashMap var8 = new HashMap();
      Iterator var6 = this.field_563.entrySet().iterator();

      while(var6.hasNext()) {
         Entry var5 = (Entry)var6.next();
         var8.put((Integer)var5.getKey(), ((class_115)var5.getValue()).method_466());
      }

      return var8;
   }

   // $FF: renamed from: a (bq) void
   private void method_1013(class_130 var1) {
      class_185 var13 = var1.method_569();
      Iterator var3 = (new HashSet((Collection)this.field_563.keySet())).iterator();

      while(var3.hasNext()) {
         Integer var2 = (Integer)var3.next();
         class_115 var4 = (class_115)this.field_563.get(var2);
         LinkedList var5 = new LinkedList();
         LinkedList var6 = new LinkedList();
         var5.add((class_46)this.field_564.method_63().method_659(var2));
         var6.add(this.field_565.method_951());
         HashSet var7 = new HashSet();

         while(!var5.isEmpty()) {
            class_46 var8 = (class_46)var5.removeFirst();
            class_115 var9 = (class_115)var6.removeFirst();
            if(var4.method_460(var8.field_14)) {
               var9.method_457(var8.field_14);
            }

            if(!var9.method_461(var4)) {
               var7.add(var8);
               boolean var10 = false;
               Iterator var11 = var4.iterator();

               while(var11.hasNext()) {
                  Integer var12 = (Integer)var11.next();
                  if(!var9.method_460(var12)) {
                     if(!var10) {
                        var10 = var13.method_884(var8.field_14, var2)?true:true;
                     }

                     if(var10) {
                        var11.remove();
                     }
                  }
               }

               Iterator var15 = var8.method_57(1).iterator();

               while(var15.hasNext()) {
                  class_124 var14 = (class_124)var15.next();
                  if(!var7.contains(var14.method_522())) {
                     var5.add(var14.method_522());
                     var6.add(var9.method_455());
                  }
               }
            }
         }

         if(var4.method_465()) {
            this.field_563.remove(var2);
         }
      }

   }

   // $FF: renamed from: b (bq) void
   private void method_1014(class_130 var1) {
      Iterator var3 = (new HashSet((Collection)this.field_563.keySet())).iterator();

      while(var3.hasNext()) {
         Integer var2 = (Integer)var3.next();
         class_115 var4;
         Iterator var5 = (var4 = (class_115)this.field_563.get(var2)).iterator();

         while(var5.hasNext()) {
            if(!var1.method_565(var2, (Integer)var5.next())) {
               var5.remove();
            }
         }

         if(var4.method_465()) {
            this.field_563.remove(var2);
         }
      }

   }

   // $FF: renamed from: a () void
   private void method_1015() {
      this.field_562 = new HashMap();
      this.method_1017(1);
      class_135 var10001 = new class_135;
      var10001.method_582(this);
      this.method_1018(var10001, 1);
      class_115 var1 = this.field_565.method_951();
      boolean var2 = false;
      Iterator var4 = this.field_564.method_63().iterator();

      while(var4.hasNext()) {
         class_46 var3;
         if((var3 = (class_46)var4.next()).method_58(1073741824).isEmpty() && !var3.method_58(2).isEmpty()) {
            var1.method_457(var3.field_14);
            var2 = true;
         }
      }

      if(var2) {
         var4 = this.field_563.values().iterator();

         while(var4.hasNext()) {
            ((class_115)var4.next()).method_464(var1);
         }
      }

   }

   // $FF: renamed from: b () void
   private void method_1016() {
      this.method_1017(3);
      Iterator var2 = this.field_564.method_63().iterator();

      while(var2.hasNext()) {
         class_46 var1 = (class_46)var2.next();
         this.field_563.put(var1.field_14, this.field_565.method_951());
      }

      class_133 var10001 = new class_133;
      var10001.method_578(this);
      this.method_1018(var10001, 3);
   }

   // $FF: renamed from: a (int) void
   private void method_1017(int var1) {
      class_140 var10001 = new class_140;
      var10001.method_624(this, var1);
      this.method_1018(var10001, var1);
   }

   // $FF: renamed from: a (y, int) void
   private void method_1018(class_0 var1, int var2) {
      boolean var3;
      do {
         var3 = false;
         HashMap var4 = new HashMap();
         Iterator var6 = this.field_561.iterator();

         while(var6.hasNext()) {
            class_46 var5 = (class_46)var6.next();
            class_115 var7;
            (var7 = this.field_565.method_951()).method_457(var5.field_14);
            Iterator var9 = var5.method_60().iterator();

            class_124 var8;
            class_46 var13;
            while(var9.hasNext()) {
               if(((var8 = (class_124)var9.next()).method_518() & var2) != 0) {
                  var13 = var8.method_520();
                  class_115 var10;
                  if((var10 = (class_115)var4.get(var13.field_14)) == null) {
                     var10 = (class_115)this.field_562.get(var13.field_14);
                  }

                  if(var10 != null) {
                     var7.method_462(var10);
                  }
               }
            }

            var4.put(var5.field_14, var7);
            var3 |= var1.method_0(var5, var4);
            var9 = var5.method_60().iterator();

            while(var9.hasNext()) {
               if(((var8 = (class_124)var9.next()).method_518() & var2) != 0) {
                  var13 = var8.method_520();
                  if(var4.containsKey(var13.field_14)) {
                     boolean var14 = true;
                     Iterator var12 = var13.method_59().iterator();

                     while(true) {
                        if(var12.hasNext()) {
                           class_124 var11;
                           if(((var11 = (class_124)var12.next()).method_518() & var2) == 0 || var4.containsKey(var11.method_522().field_14)) {
                              continue;
                           }

                           var14 = false;
                        }

                        if(var14) {
                           var4.put(var13.field_14, (Object)null);
                        }
                        break;
                     }
                  }
               }
            }
         }
      } while(var3);

   }
}
