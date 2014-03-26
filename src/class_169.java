import java.util.ArrayList;
import java.util.List;

// $FF: renamed from: aR
public final class class_169 {

   // $FF: renamed from: a java.util.List
   private List field_429;
   // $FF: renamed from: b cb
   private class_118 field_430;


   // $FF: renamed from: <init> () void
   public void method_776() {
      super();
      this.field_429 = new ArrayList();
      class_118 var10001 = new class_118;
      var10001.method_480();
      this.field_430 = var10001;
   }

   // $FF: renamed from: a (int, Q) void
   public final void method_777(int var1, class_83 var2) {
      if(var1 >= this.field_429.size()) {
         for(int var3 = this.field_429.size(); var3 <= var1; ++var3) {
            List var10000 = this.field_429;
            class_83 var10001 = new class_83;
            var10001.method_235(14);
            var10000.add(var10001);
         }
      }

      this.field_429.set(var1, var2);
   }

   // $FF: renamed from: a (int) Q
   public final class_83 method_778(int var1) {
      if(var1 < this.field_429.size()) {
         return (class_83)this.field_429.get(var1);
      } else if(var1 < 0) {
         throw new IndexOutOfBoundsException();
      } else {
         class_83 var10000 = new class_83;
         var10000.method_235(14);
         return var10000;
      }
   }

   // $FF: renamed from: a () aR
   public final class_169 method_779() {
      class_169 var10000 = new class_169;
      var10000.method_776();
      class_169 var1 = var10000;
      var10000.field_429 = new ArrayList(this.field_429);
      var1.field_430 = this.field_430.method_482();
      return var1;
   }

   // $FF: renamed from: a (bn) aR
   public static class_169 method_780(class_128 var0) {
      class_169 var10000 = new class_169;
      var10000.method_776();
      class_169 var1 = var10000;
      class_197 var2 = class_197.method_963(var0.method_548());
      int var3 = 0;
      class_83 var10002;
      if((var0.method_550() & 8) == 0) {
         ++var3;
         var10002 = new class_83;
         var10002.method_237(8, 0, (String)null);
         var1.method_777(0, var10002);
      }

      for(int var5 = 0; var5 < var2.field_519.length; ++var5) {
         class_83 var4 = var2.field_519[var5];
         var1.method_777(var3++, var4);
         if(var4.field_137 == 2) {
            int var10001 = var3++;
            var10002 = new class_83;
            var10002.method_235(12);
            var1.method_777(var10001, var10002);
         }
      }

      return var1;
   }

   // $FF: renamed from: b () java.util.List
   public final List method_781() {
      return this.field_429;
   }

   // $FF: renamed from: a (java.util.List) void
   public final void method_782(List var1) {
      this.field_429 = var1;
   }

   // $FF: renamed from: c () cb
   public final class_118 method_783() {
      return this.field_430;
   }
}
