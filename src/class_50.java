import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

// $FF: renamed from: cW
public final class class_50 extends class_46 {

   // $FF: renamed from: a java.util.List
   private List field_36;
   // $FF: renamed from: b java.util.List
   private List field_37;


   // $FF: renamed from: <init> () void
   private void method_99() {
      super.method_23();
      this.field_36 = new ArrayList();
      this.field_37 = new ArrayList();
      this.field_13 = 7;
   }

   // $FF: renamed from: <init> (ca, ca, java.util.HashSet) void
   private void method_100(class_46 var1, class_46 var2, HashSet var3) {
      this.method_99();
      this.field_21 = var1;
      this.field_19.method_655(this.field_21, this.field_21.field_14);
      Iterator var4 = var1.method_57(2).iterator();

      while(var4.hasNext()) {
         class_124 var6;
         class_46 var5 = (var6 = (class_124)var4.next()).method_522();
         if(var3.contains(var5)) {
            this.field_19.method_655(var5, var5.field_14);
            this.field_36.add(var6.method_524());
            List var10000 = this.field_37;
            class_88 var10001 = new class_88;
            int var10003 = class_181.method_853().method_814(2);
            class_83 var10004 = new class_83;
            var10004.method_237(8, 0, var6.method_524());
            var10001.method_276(var10003, var10004, (class_164)class_181.method_844("CURRENT_VAR_PROCESSOR"));
            var10000.add(var10001);
         }
      }

      if(var2 != null) {
         this.field_26 = var2;
      }

   }

   // $FF: renamed from: a (ca) ca
   public static class_46 method_101(class_46 var0) {
      if(var0.method_64() != 2) {
         return null;
      } else {
         HashSet var1;
         if(!(var1 = class_150.method_697(var0)).isEmpty()) {
            int var2 = 0;
            class_46 var3 = null;
            List var4;
            if(!(var4 = var0.method_57(1073741824)).isEmpty() && ((class_124)var4.get(0)).method_518() == 1) {
               var3 = ((class_124)var4.get(0)).method_522();
               var2 = 2;
            }

            Iterator var5 = var0.method_57(2).iterator();

            while(var5.hasNext()) {
               class_124 var8;
               class_46 var6 = (var8 = (class_124)var5.next()).method_522();
               boolean var7 = true;
               if(var8.method_524() != null && var1.contains(var6) && var6.method_64() == 2) {
                  if(!(var4 = var6.method_57(1073741824)).isEmpty() && ((class_124)var4.get(0)).method_518() == 1) {
                     class_46 var10 = ((class_124)var4.get(0)).method_522();
                     if(var3 == null) {
                        var3 = var10;
                     } else if(var3 != var10) {
                        var7 = false;
                     }

                     if(var7) {
                        ++var2;
                     }
                  }
               } else {
                  var7 = false;
               }

               if(!var7) {
                  var1.remove(var6);
               }
            }

            if(var2 != 1 && !var1.isEmpty()) {
               ArrayList var9;
               (var9 = new ArrayList()).add(var0);
               var9.addAll(var1);
               Iterator var11 = var9.iterator();

               while(var11.hasNext()) {
                  if(((class_46)var11.next()).method_67()) {
                     return null;
                  }
               }

               if(class_150.method_695(var9)) {
                  class_50 var10000 = new class_50;
                  var10000.method_100(var0, var3, var1);
                  return var10000;
               }
            }
         }

         return null;
      }
   }

   // $FF: renamed from: a (int) java.lang.String
   public final String method_43(int var1) {
      String var2 = class_129.method_557(var1);
      StringBuffer var3;
      (var3 = new StringBuffer()).append(class_209.method_1043(this.field_24, var1));
      if(this.method_69()) {
         var3.append(var2 + "label" + this.field_14 + ":\r\n");
      }

      var3.append(var2 + "try {\r\n");
      var3.append(class_209.method_1041(this.field_21, var1 + 1, true));
      var3.append(var2 + "}");

      for(int var4 = 1; var4 < this.field_19.size(); ++var4) {
         var3.append(" catch (" + ((class_88)this.field_37.get(var4 - 1)).method_262(var1) + ") {\r\n" + class_209.method_1041((class_46)this.field_19.get(var4), var1 + 1, true) + var2 + "}");
      }

      var3.append("\r\n");
      return var3.toString();
   }

   // $FF: renamed from: a () ca
   public final class_46 method_47() {
      class_50 var10000 = new class_50;
      var10000.method_99();
      class_50 var1 = var10000;
      Iterator var2 = this.field_36.iterator();

      while(var2.hasNext()) {
         String var3 = (String)var2.next();
         var1.field_36.add(var3);
         List var4 = var1.field_37;
         class_88 var10001 = new class_88;
         int var10003 = class_181.method_853().method_814(2);
         class_83 var10004 = new class_83;
         var10004.method_237(8, 0, var3);
         var10001.method_276(var10003, var10004, (class_164)class_181.method_844("CURRENT_VAR_PROCESSOR"));
         var4.add(var10001);
      }

      return var1;
   }

   // $FF: renamed from: e () java.util.List
   public final List method_102() {
      return this.field_37;
   }
}
