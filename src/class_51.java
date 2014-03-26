import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

// $FF: renamed from: h
public final class class_51 extends class_46 {

   // $FF: renamed from: a ca
   private class_46 field_38;
   // $FF: renamed from: b boolean
   private boolean field_39;
   // $FF: renamed from: k aa
   private class_88 field_40;
   // $FF: renamed from: l java.util.List
   private List field_41;


   // $FF: renamed from: <init> () void
   private void method_103() {
      super.method_23();
      this.field_41 = new ArrayList();
      this.field_13 = 12;
   }

   // $FF: renamed from: <init> (ca, ca) void
   private void method_104(class_46 var1, class_46 var2) {
      this.method_103();
      this.field_21 = var1;
      this.field_19.method_655(var1, var1.field_14);
      this.field_38 = var2;
      this.field_19.method_655(var2, var2.field_14);
      List var3;
      class_124 var4;
      if(!(var3 = var1.method_57(1073741824)).isEmpty() && (var4 = (class_124)var3.get(0)).method_518() == 1) {
         this.field_26 = var4.method_522();
      }

      List var10000 = this.field_41;
      class_88 var10001 = new class_88;
      int var10003 = class_181.method_853().method_814(2);
      class_83 var10004 = new class_83;
      var10004.method_237(8, 0, "java/lang/Throwable");
      var10001.method_276(var10003, var10004, (class_164)class_181.method_844("CURRENT_VAR_PROCESSOR"));
      var10000.add(var10001);
   }

   // $FF: renamed from: a (ca) ca
   public static class_46 method_105(class_46 var0) {
      if(var0.method_64() != 2) {
         return null;
      } else {
         HashSet var1;
         if((var1 = class_150.method_697(var0)).size() != 1) {
            return null;
         } else {
            Iterator var3 = var0.method_57(2).iterator();

            class_46 var4;
            do {
               List var5;
               do {
                  do {
                     class_124 var2;
                     do {
                        do {
                           if(!var3.hasNext()) {
                              return null;
                           }

                           var4 = (var2 = (class_124)var3.next()).method_522();
                        } while(var2.method_524() != null);
                     } while(!var1.contains(var4));
                  } while(var4.method_64() != 2);
               } while(!(var5 = var4.method_57(1073741824)).isEmpty() && ((class_124)var5.get(0)).method_518() == 1);

               if(var0.method_67() || var4.method_67()) {
                  return null;
               }
            } while(!class_150.method_695(Arrays.asList(new class_46[]{var0, var4})));

            class_51 var10000 = new class_51;
            var10000.method_104(var0, var4);
            return var10000;
         }
      }
   }

   // $FF: renamed from: a (int) java.lang.String
   public final String method_43(int var1) {
      String var2 = class_129.method_557(var1);
      String var3 = null;
      StringBuffer var4;
      (var4 = new StringBuffer()).append(class_209.method_1043(this.field_24, var1));
      boolean var5;
      if(var5 = this.method_69()) {
         var4.append(var2 + "label" + this.field_14 + ":\r\n");
      }

      List var6 = this.field_21.method_57(1073741824);
      if(this.field_21.field_13 == 7 && this.field_21.field_24.isEmpty() && this.field_39 && !var5 && !this.field_21.method_69() && (var6.isEmpty() || !((class_124)var6.get(0)).field_305)) {
         String var7 = (var7 = class_209.method_1041(this.field_21, var1, true)).substring(0, var7.length() - 2);
         var4.append(var7);
      } else {
         var4.append(var2 + "try {\r\n");
         var4.append(class_209.method_1041(this.field_21, var1 + 1, true));
         var4.append(var2 + "}");
      }

      var4.append((this.field_39?" finally":" catch (" + ((class_88)this.field_41.get(0)).method_262(var1) + ")") + " {\r\n");
      if(this.field_40 != null) {
         var3 = class_129.method_557(var1 + 1);
         var4.append(var3 + "if(" + this.field_40.method_262(var1) + ") {\r\n");
      }

      var4.append(class_209.method_1041(this.field_38, var1 + 1 + (this.field_40 != null?1:0), true));
      if(this.field_40 != null) {
         var4.append(var3 + "}\r\n");
      }

      var4.append(var2 + "}\r\n");
      return var4.toString();
   }

   // $FF: renamed from: a (ca, ca) void
   public final void method_49(class_46 var1, class_46 var2) {
      if(this.field_38 == var1) {
         this.field_38 = var2;
      }

      super.method_49(var1, var2);
   }

   // $FF: renamed from: a () ca
   public final class_46 method_47() {
      class_51 var10000 = new class_51;
      var10000.method_103();
      class_51 var1 = var10000;
      var10000.field_39 = this.field_39;
      class_88 var10001;
      if(this.field_40 != null) {
         var10001 = new class_88;
         var10001.method_276(class_181.method_853().method_814(2), class_83.field_118, (class_164)class_181.method_844("CURRENT_VAR_PROCESSOR"));
         var1.field_40 = var10001;
      }

      if(!this.field_41.isEmpty()) {
         List var2 = this.field_41;
         var10001 = new class_88;
         int var10003 = class_181.method_853().method_814(2);
         class_83 var10004 = new class_83;
         var10004.method_237(8, 0, "java/lang/Throwable");
         var10001.method_276(var10003, var10004, (class_164)class_181.method_844("CURRENT_VAR_PROCESSOR"));
         var2.add(var10001);
      }

      return var1;
   }

   // $FF: renamed from: b () void
   public final void method_48() {
      this.field_21 = (class_46)this.field_19.get(0);
      this.field_38 = (class_46)this.field_19.get(1);
   }

   // $FF: renamed from: c () ca
   public final class_46 method_106() {
      return this.field_38;
   }

   // $FF: renamed from: a_ () boolean
   public final boolean method_107() {
      return this.field_39;
   }

   // $FF: renamed from: e () void
   public final void method_108() {
      this.field_39 = true;
   }

   // $FF: renamed from: f () aa
   public final class_88 method_109() {
      return this.field_40;
   }

   // $FF: renamed from: a (aa) void
   public final void method_110(class_88 var1) {
      this.field_40 = var1;
   }

   // $FF: renamed from: g () java.util.List
   public final List method_111() {
      return this.field_41;
   }
}
