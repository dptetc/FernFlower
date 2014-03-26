import java.util.List;

// $FF: renamed from: aW
public final class class_94 extends class_86 {

   // $FF: renamed from: c java.util.List
   private List field_183;


   // $FF: renamed from: <init> (java.util.List) void
   public void method_321(List var1) {
      super.method_252();
      this.field_148 = 14;
      this.field_183 = var1;
   }

   // $FF: renamed from: a (int) java.lang.String
   public final String method_262(int var1) {
      StringBuilder var2;
      (var2 = new StringBuilder()).append("assert ");
      if(this.field_183.get(0) == null) {
         var2.append("false");
      } else {
         var2.append(((class_86)this.field_183.get(0)).method_262(var1));
      }

      if(this.field_183.size() > 1) {
         var2.append(" : ");
         var2.append(((class_86)this.field_183.get(1)).method_262(var1));
      }

      return var2.toString();
   }
}
