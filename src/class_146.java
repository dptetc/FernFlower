import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

// $FF: renamed from: cE
public final class class_146 extends ArrayList {

   // $FF: renamed from: a java.util.HashMap
   private HashMap field_366;
   // $FF: renamed from: b java.util.ArrayList
   private ArrayList field_367;


   // $FF: renamed from: <init> () void
   public void method_653() {
      super();
      this.field_366 = new HashMap();
      this.field_367 = new ArrayList();
   }

   public final boolean add(Object var1) {
      this.field_367.add((Object)null);
      super.add(var1);
      return true;
   }

   public final boolean remove(Object var1) {
      throw new RuntimeException("not implemented!");
   }

   public final boolean addAll(Collection var1) {
      for(int var2 = var1.size() - 1; var2 >= 0; --var2) {
         this.field_367.add((Object)null);
      }

      return super.addAll(var1);
   }

   // $FF: renamed from: a (java.util.Collection, java.util.Collection) void
   public final void method_654(Collection var1, Collection var2) {
      int var3 = super.size();
      Iterator var5 = var2.iterator();

      while(var5.hasNext()) {
         Object var4 = (Object)var5.next();
         this.field_366.put(var4, Integer.valueOf(var3++));
      }

      super.addAll(var1);
      this.field_367.addAll(var2);
   }

   // $FF: renamed from: a (java.lang.Object, java.lang.Object) void
   public final void method_655(Object var1, Object var2) {
      this.field_366.put(var2, Integer.valueOf(super.size()));
      super.add(var1);
      this.field_367.add(var2);
   }

   // $FF: renamed from: b (java.lang.Object, java.lang.Object) java.lang.Object
   public final Object method_656(Object var1, Object var2) {
      Integer var3;
      if((var3 = (Integer)this.field_366.get(var2)) == null) {
         this.method_655(var1, var2);
         return null;
      } else {
         return super.set(var3.intValue(), var1);
      }
   }

   public final void add(int var1, Object var2) {
      this.method_666(var1, 1);
      this.field_367.add(var1, (Object)null);
      super.add(var1, var2);
   }

   // $FF: renamed from: a (int, java.lang.Object, java.lang.Object) void
   public final void method_657(int var1, Object var2, Object var3) {
      this.method_666(var1, 1);
      this.field_366.put(var3, new Integer(var1));
      super.add(var1, var2);
      this.field_367.add(var1, var3);
   }

   // $FF: renamed from: a (java.lang.Object) void
   public final void method_658(Object var1) {
      int var2 = ((Integer)this.field_366.get(var1)).intValue();
      this.method_666(var2 + 1, -1);
      super.remove(var2);
      this.field_367.remove(var2);
      this.field_366.remove(var1);
   }

   public final Object remove(int var1) {
      this.method_666(var1 + 1, -1);
      Object var2;
      if((var2 = this.field_367.get(var1)) != null) {
         this.field_366.remove(var2);
      }

      this.field_367.remove(var1);
      return super.remove(var1);
   }

   // $FF: renamed from: b (java.lang.Object) java.lang.Object
   public final Object method_659(Object var1) {
      Integer var2;
      return (var2 = (Integer)this.field_366.get(var1)) == null?null:super.get(var2.intValue());
   }

   // $FF: renamed from: c (java.lang.Object) int
   public final int method_660(Object var1) {
      return ((Integer)this.field_366.get(var1)).intValue();
   }

   // $FF: renamed from: a () java.lang.Object
   public final Object method_661() {
      return super.get(super.size() - 1);
   }

   // $FF: renamed from: d (java.lang.Object) boolean
   public final boolean method_662(Object var1) {
      return this.field_366.containsKey(var1);
   }

   public final void clear() {
      this.field_366.clear();
      this.field_367.clear();
      super.clear();
   }

   // $FF: renamed from: b () cE
   public final class_146 method_663() {
      class_146 var10000 = new class_146;
      var10000.method_653();
      class_146 var1 = var10000;
      var10000.addAll(new ArrayList(this));
      var1.field_366 = new HashMap(this.field_366);
      var1.field_367 = new ArrayList(this.field_367);
      return var1;
   }

   // $FF: renamed from: a (int) java.lang.Object
   public final Object method_664(int var1) {
      return this.field_367.get(var1);
   }

   // $FF: renamed from: c () java.util.ArrayList
   public final ArrayList method_665() {
      return this.field_367;
   }

   // $FF: renamed from: a (int, int) void
   private void method_666(int var1, int var2) {
      for(int var3 = this.field_367.size() - 1; var3 >= var1; --var3) {
         Object var4;
         if((var4 = this.field_367.get(var3)) != null) {
            this.field_366.put(var4, new Integer(var3 + var2));
         }
      }

   }
}
