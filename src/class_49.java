import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

// $FF: renamed from: cx
public final class class_49 extends class_46 {

   // $FF: renamed from: <init> () void
   private void method_95() {
      super.method_23();
      this.field_13 = 15;
   }

   // $FF: renamed from: <init> (java.util.List) void
   public void method_96(List var1) {
      this.method_95();
      this.field_27 = ((class_46)var1.get(var1.size() - 1)).method_64();
      Iterator var2 = var1.iterator();

      while(var2.hasNext()) {
         class_46 var3 = (class_46)var2.next();
         this.field_19.method_655(var3, var3.field_14);
      }

      this.field_21 = (class_46)this.field_19.get(0);
   }

   // $FF: renamed from: <init> (ca, ca) void
   private void method_97(class_46 var1, class_46 var2) {
      this.method_96(Arrays.asList(new class_46[]{var1, var2}));
      List var3;
      class_124 var4;
      if(!(var3 = var2.method_57(1073741824)).isEmpty() && (var4 = (class_124)var3.get(0)).method_518() == 1 && var4.method_522() != var1) {
         this.field_26 = var4.method_522();
      }

   }

   // $FF: renamed from: a (ca) ca
   public static class_46 method_98(class_46 var0) {
      if(var0.method_64() != 2) {
         return null;
      } else {
         class_124 var1 = null;
         List var2;
         if(!(var2 = var0.method_57(1073741824)).isEmpty()) {
            var1 = (class_124)var2.get(0);
         }

         class_46 var3;
         if(var1 != null && var1.method_518() == 1 && (var3 = var1.method_522()) != var0 && var3.method_58(1).size() == 1 && !var3.method_67() && var3.method_64() == 2 && class_150.method_695(Arrays.asList(new class_46[]{var0, var3}))) {
            class_49 var10000 = new class_49;
            var10000.method_97(var0, var3);
            return var10000;
         } else {
            return null;
         }
      }
   }

   // $FF: renamed from: a (int) java.lang.String
   public final String method_43(int var1) {
      StringBuilder var2 = new StringBuilder();
      String var3 = null;
      boolean var4 = this.method_69();
      var2.append(class_209.method_1043(this.field_24, var1));
      if(var4) {
         var3 = class_129.method_557(var1);
         ++var1;
         var2.append(var3 + "label" + this.field_14 + ": {\r\n");
      }

      boolean var5 = false;

      for(int var6 = 0; var6 < this.field_19.size(); ++var6) {
         class_46 var7 = (class_46)this.field_19.get(var6);
         if(var6 > 0 && var5) {
            var2.append("\r\n");
         }

         String var8 = class_209.method_1041(var7, var1, false);
         var2.append(var8);
         var5 = var8.trim().length() > 0;
      }

      if(var4) {
         var2.append(var3 + "}\r\n");
      }

      return var2.toString();
   }

   // $FF: renamed from: a () ca
   public final class_46 method_47() {
      class_49 var10000 = new class_49;
      var10000.method_95();
      return var10000;
   }
}
