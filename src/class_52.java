import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

// $FF: renamed from: e
public final class class_52 extends class_46 {

   // $FF: renamed from: <init> () void
   private void method_112() {
      super.method_23();
      this.field_13 = 0;
   }

   // $FF: renamed from: <init> (ca, java.util.Collection, ca) void
   public void method_113(class_46 var1, Collection var2, class_46 var3) {
      this.method_112();
      this.field_21 = var1;
      this.field_19.method_655(var1, var1.field_14);
      HashSet var4;
      (var4 = new HashSet(var2)).remove(var1);
      Iterator var5 = var4.iterator();

      while(var5.hasNext()) {
         var1 = (class_46)var5.next();
         this.field_19.method_655(var1, var1.field_14);
      }

      this.field_26 = var3;
   }

   // $FF: renamed from: a (int) java.lang.String
   public final String method_43(int var1) {
      String var2 = class_129.method_557(var1);
      StringBuffer var3 = new StringBuffer();
      if(this.method_69()) {
         var3.append(var2 + "label" + this.field_14 + ":\r\n");
      }

      var3.append(var2 + "abstract statement {\r\n");

      for(int var4 = 0; var4 < this.field_19.size(); ++var4) {
         var3.append(((class_46)this.field_19.get(var4)).method_43(var1 + 1));
      }

      var3.append(var2 + "}");
      return var3.toString();
   }
}
