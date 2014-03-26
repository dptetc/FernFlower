import java.util.LinkedList;

// $FF: renamed from: cr
public final class class_156 {

   // $FF: renamed from: <init> () void
   public void method_723() {
      super();
   }

   // $FF: renamed from: a (S) void
   public static void method_724(class_54 var0) {
      LinkedList var1;
      (var1 = new LinkedList()).add(var0);

      while(!var1.isEmpty()) {
         class_46 var2;
         (var2 = (class_46)var1.removeFirst()).method_24();
         var1.addAll(var2.method_63());
      }

   }
}
