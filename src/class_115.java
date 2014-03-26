import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// $FF: renamed from: p
public final class class_115 implements Iterable {

   // $FF: renamed from: a aw
   private class_195 field_262;
   // $FF: renamed from: b cE
   private class_146 field_263;
   // $FF: renamed from: c int[]
   private int[] field_264;


   // $FF: renamed from: <init> (aw) void
   private void method_454(class_195 var1) {
      super();
      this.field_262 = var1;
      this.field_263 = class_195.method_952(var1);
      this.field_264 = new int[class_195.method_953(var1)];
   }

   // $FF: renamed from: a () p
   public final class_115 method_455() {
      class_115 var10000 = new class_115;
      var10000.method_454(this.field_262);
      class_115 var1 = var10000;
      int var2;
      int[] var3 = new int[var2 = this.field_264.length];
      System.arraycopy(this.field_264, 0, var3, 0, var2);
      var1.field_264 = var3;
      return var1;
   }

   // $FF: renamed from: b () void
   public final void method_456() {
      class_41[] var1;
      for(int var2 = (var1 = (class_41[])this.field_263.get(this.field_263.size() - 1))[0] - 1; var2 >= 0; --var2) {
         this.field_264[var2] = -1;
      }

      this.field_264[var1[0]] = var1[1] | var1[1] - 1;
   }

   // $FF: renamed from: a (java.lang.Object) void
   public final void method_457(Object var1) {
      class_41[] var2 = (class_41[])this.field_263.method_659(var1);
      this.field_264[var2[0]] |= var2[1];
   }

   // $FF: renamed from: a (java.util.Collection) void
   public final void method_458(Collection var1) {
      Iterator var2 = var1.iterator();

      while(var2.hasNext()) {
         Object var3 = (Object)var2.next();
         this.method_457(var3);
      }

   }

   // $FF: renamed from: b (java.lang.Object) void
   public final void method_459(Object var1) {
      class_41[] var2 = (class_41[])this.field_263.method_659(var1);
      this.field_264[var2[0]] &= ~var2[1];
   }

   // $FF: renamed from: c (java.lang.Object) boolean
   public final boolean method_460(Object var1) {
      class_41[] var2 = (class_41[])this.field_263.method_659(var1);
      return (this.field_264[var2[0]] & var2[1]) != 0;
   }

   // $FF: renamed from: a (p) boolean
   public final boolean method_461(class_115 var1) {
      int[] var4 = var1.field_264;

      int[] var3;
      for(int var2 = (var3 = this.field_264).length - 1; var2 >= 0; --var2) {
         if((var4[var2] & ~var3[var2]) != 0) {
            return false;
         }
      }

      return true;
   }

   // $FF: renamed from: b (p) void
   public final void method_462(class_115 var1) {
      int[] var4 = var1.field_264;

      int[] var3;
      for(int var2 = (var3 = this.field_264).length - 1; var2 >= 0; --var2) {
         var3[var2] |= var4[var2];
      }

   }

   // $FF: renamed from: c (p) void
   public final void method_463(class_115 var1) {
      int[] var4 = var1.field_264;

      int[] var3;
      for(int var2 = (var3 = this.field_264).length - 1; var2 >= 0; --var2) {
         var3[var2] &= var4[var2];
      }

   }

   // $FF: renamed from: d (p) void
   public final void method_464(class_115 var1) {
      int[] var4 = var1.field_264;

      int[] var3;
      for(int var2 = (var3 = this.field_264).length - 1; var2 >= 0; --var2) {
         var3[var2] &= ~var4[var2];
      }

   }

   public final boolean equals(Object var1) {
      if(!(var1 instanceof class_115)) {
         return false;
      } else {
         int[] var4 = ((class_115)var1).field_264;

         int[] var3;
         for(int var2 = (var3 = this.field_264).length - 1; var2 >= 0; --var2) {
            if(var3[var2] != var4[var2]) {
               return false;
            }
         }

         return true;
      }
   }

   // $FF: renamed from: c () boolean
   public final boolean method_465() {
      int[] var2;
      for(int var1 = (var2 = this.field_264).length - 1; var1 >= 0; --var1) {
         if(var2[var1] != 0) {
            return false;
         }
      }

      return true;
   }

   public final Iterator iterator() {
      class_210 var10000 = new class_210;
      var10000.method_1049(this, (class_210)null);
      return var10000;
   }

   // $FF: renamed from: d () java.util.Set
   public final Set method_466() {
      return (Set)this.method_467(new HashSet());
   }

   // $FF: renamed from: b (java.util.Collection) java.util.Collection
   private Collection method_467(Collection var1) {
      int[] var2 = this.field_264;

      for(int var3 = 0; var3 < var2.length; ++var3) {
         int var4;
         if((var4 = var2[var3]) != 0) {
            int var5 = var3 << 5;

            for(int var6 = 31; var6 >= 0; --var6) {
               if((var4 & 1) != 0) {
                  var1.add(this.field_263.method_664(var5));
               }

               ++var5;
               var4 >>>= 1;
            }
         }
      }

      return var1;
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder("{");
      int[] var2 = this.field_264;
      boolean var3 = true;

      for(int var4 = this.field_263.size() - 1; var4 >= 0; --var4) {
         class_41[] var5 = (class_41[])this.field_263.get(var4);
         if((var2[var5[0]] & var5[1]) != 0) {
            if(var3) {
               var3 = false;
            } else {
               var1.append(",");
            }

            var1.append(this.field_263.method_664(var4));
         }
      }

      var1.append("}");
      return var1.toString();
   }

   // $FF: renamed from: e () aw
   public final class_195 method_468() {
      return this.field_262;
   }
}
