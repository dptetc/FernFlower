import java.util.ArrayList;

// $FF: renamed from: cb
public class class_118 extends ArrayList {

   // $FF: renamed from: a int
   protected int field_276;


   // $FF: renamed from: <init> () void
   public void method_480() {
      super();
      this.field_276 = 0;
   }

   // $FF: renamed from: <init> (java.util.ArrayList) void
   public void method_481(ArrayList var1) {
      super(var1);
      this.field_276 = 0;
   }

   // $FF: renamed from: c () cb
   public class_118 method_482() {
      class_118 var10000 = new class_118;
      var10000.method_481(this);
      class_118 var1 = var10000;
      var10000.field_276 = this.field_276;
      return var1;
   }

   // $FF: renamed from: a (java.lang.Object) java.lang.Object
   public Object method_483(Object var1) {
      this.add(var1);
      ++this.field_276;
      return var1;
   }

   // $FF: renamed from: d () java.lang.Object
   public Object method_484() {
      --this.field_276;
      Object var1 = this.get(this.field_276);
      this.remove(this.field_276);
      return var1;
   }

   // $FF: renamed from: a (int) java.lang.Object
   public final Object method_485(int var1) {
      Object var2;
      for(var2 = null; var1 > 0; --var1) {
         var2 = this.method_484();
      }

      return var2;
   }

   // $FF: renamed from: b (int) void
   public final void method_486(int var1) {
      while(var1 > 0) {
         --this.field_276;
         this.remove(this.field_276);
         --var1;
      }

   }

   // $FF: renamed from: e () int
   public final int method_487() {
      return this.field_276;
   }

   public Object get(int var1) {
      return super.get(var1);
   }

   public Object set(int var1, Object var2) {
      return super.set(var1, var2);
   }

   // $FF: renamed from: c (int) java.lang.Object
   public final Object method_488(int var1) {
      return this.get(this.field_276 + var1);
   }

   // $FF: renamed from: a (int, java.lang.Object) void
   public final void method_489(int var1, Object var2) {
      this.add(this.field_276 + var1, var2);
      ++this.field_276;
   }

   public void clear() {
      super.clear();
      this.field_276 = 0;
   }
}
