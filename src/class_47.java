import java.util.ArrayList;
import java.util.List;

// $FF: renamed from: au
public final class class_47 extends class_46 {

   // $FF: renamed from: a int
   private int field_31;
   // $FF: renamed from: b java.util.List
   private List field_32;
   // $FF: renamed from: k java.util.List
   private List field_33;
   // $FF: renamed from: l java.util.List
   private List field_34;


   // $FF: renamed from: <init> () void
   private void method_79() {
      super.method_23();
      this.field_32 = new ArrayList();
      this.field_33 = new ArrayList();
      this.field_34 = new ArrayList();
      this.field_13 = 5;
      this.field_31 = 0;
      this.field_32.add((Object)null);
      this.field_33.add((Object)null);
      this.field_34.add((Object)null);
   }

   // $FF: renamed from: <init> (ca) void
   private void method_80(class_46 var1) {
      this.method_79();
      this.field_21 = var1;
      this.field_19.method_655(this.field_21, this.field_21.field_14);
   }

   // $FF: renamed from: a (ca) ca
   public static class_46 method_81(class_46 var0) {
      if(var0.method_64() == 2 && !var0.method_67()) {
         class_124 var1 = null;
         List var2;
         if(!(var2 = var0.method_57(1073741824)).isEmpty()) {
            var1 = (class_124)var2.get(0);
         }

         class_47 var10000;
         if(var1 != null && var1.method_518() == 1 && var1.method_522() == var0) {
            var10000 = new class_47;
            var10000.method_80(var0);
            return var10000;
         }

         if(var0.field_13 != 5 && (var1 == null || var1.method_518() != 1) && var0.method_65().contains(var0.method_68())) {
            var10000 = new class_47;
            var10000.method_80(var0);
            return var10000;
         }
      }

      return null;
   }

   // $FF: renamed from: a (int) java.lang.String
   public final String method_43(int var1) {
      String var2 = class_129.method_557(var1);
      StringBuffer var3;
      (var3 = new StringBuffer()).append(class_209.method_1043(this.field_24, var1));
      if(this.method_69()) {
         var3.append(var2 + "label" + this.field_14 + ":\r\n");
      }

      switch(this.field_31) {
      case 0:
         var3.append(var2 + "while(true) {\r\n");
         var3.append(class_209.method_1041(this.field_21, var1 + 1, true));
         var3.append(var2 + "}\r\n");
         break;
      case 1:
         var3.append(var2 + "do {\r\n");
         var3.append(class_209.method_1041(this.field_21, var1 + 1, true));
         var3.append(var2 + "} while(" + ((class_86)this.field_33.get(0)).method_262(var1) + ");\r\n");
         break;
      case 2:
         var3.append(var2 + "while(" + ((class_86)this.field_33.get(0)).method_262(var1) + ") {\r\n");
         var3.append(class_209.method_1041(this.field_21, var1 + 1, true));
         var3.append(var2 + "}\r\n");
         break;
      case 3:
         var3.append(var2 + "for(" + (this.field_32.get(0) == null?"":((class_86)this.field_32.get(0)).method_262(var1)) + "; " + ((class_86)this.field_33.get(0)).method_262(var1) + "; " + ((class_86)this.field_34.get(0)).method_262(var1) + ") {\r\n");
         var3.append(class_209.method_1041(this.field_21, var1 + 1, true));
         var3.append(var2 + "}\r\n");
      }

      return var3.toString();
   }

   // $FF: renamed from: d () java.util.List
   public final List method_44() {
      ArrayList var1 = new ArrayList();
      switch(this.field_31) {
      case 3:
         if(this.method_89() != null) {
            var1.add(this.method_89());
         }
      case 2:
         var1.add(this.method_85());
      default:
         var1.add(this.field_21);
         switch(this.field_31) {
         case 1:
            var1.add(this.method_85());
         case 2:
         default:
            break;
         case 3:
            var1.add(this.method_87());
         }

         return var1;
      }
   }

   // $FF: renamed from: a (aJ, aJ) void
   public final void method_46(class_86 var1, class_86 var2) {
      if(this.field_32.get(0) == var1) {
         this.field_32.set(0, var2);
      }

      if(this.field_33.get(0) == var1) {
         this.field_33.set(0, var2);
      }

      if(this.field_34.get(0) == var1) {
         this.field_34.set(0, var2);
      }

   }

   // $FF: renamed from: a () ca
   public final class_46 method_47() {
      class_47 var10000 = new class_47;
      var10000.method_79();
      return var10000;
   }

   // $FF: renamed from: e () java.util.List
   public final List method_82() {
      return this.field_32;
   }

   // $FF: renamed from: f () java.util.List
   public final List method_83() {
      return this.field_33;
   }

   // $FF: renamed from: g () java.util.List
   public final List method_84() {
      return this.field_34;
   }

   // $FF: renamed from: h () aJ
   public final class_86 method_85() {
      return (class_86)this.field_33.get(0);
   }

   // $FF: renamed from: a (aJ) void
   public final void method_86(class_86 var1) {
      this.field_33.set(0, var1);
   }

   // $FF: renamed from: i () aJ
   public final class_86 method_87() {
      return (class_86)this.field_34.get(0);
   }

   // $FF: renamed from: b (aJ) void
   public final void method_88(class_86 var1) {
      this.field_34.set(0, var1);
   }

   // $FF: renamed from: j () aJ
   public final class_86 method_89() {
      return (class_86)this.field_32.get(0);
   }

   // $FF: renamed from: c (aJ) void
   public final void method_90(class_86 var1) {
      this.field_32.set(0, var1);
   }

   // $FF: renamed from: k () int
   public final int method_91() {
      return this.field_31;
   }

   // $FF: renamed from: b (int) void
   public final void method_92(int var1) {
      this.field_31 = var1;
   }
}
