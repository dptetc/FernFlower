import java.util.ArrayList;
import java.util.List;

// $FF: renamed from: E
public final class class_56 extends class_46 {

   // $FF: renamed from: a ca
   private class_46 field_57;
   // $FF: renamed from: b java.util.List
   private List field_58;


   // $FF: renamed from: <init> () void
   public void method_23() {
      super.method_23();
      this.field_58 = new ArrayList();
      this.field_13 = 10;
      this.field_58.add((Object)null);
   }

   // $FF: renamed from: <init> (ca, ca, ca) void
   public void method_140(class_46 var1, class_46 var2, class_46 var3) {
      this.method_23();
      this.field_21 = var1;
      this.field_19.method_655(var1, var1.field_14);
      this.field_57 = var2;
      this.field_19.method_655(var2, var2.field_14);
      this.field_19.method_655(var3, var3.field_14);
      List var4;
      class_124 var5;
      if(!(var4 = var2.method_57(1073741824)).isEmpty() && (var5 = (class_124)var4.get(0)).method_518() == 1) {
         this.field_26 = var5.method_522();
      }

   }

   // $FF: renamed from: a (int) java.lang.String
   public final String method_43(int var1) {
      String var2 = class_129.method_557(var1);
      StringBuffer var3;
      (var3 = new StringBuffer()).append(class_209.method_1043(this.field_24, var1));
      var3.append(this.field_21.method_43(var1));
      if(this.method_69()) {
         var3.append(var2 + "label" + this.field_14 + ":\r\n");
      }

      var3.append(var2 + ((class_86)this.field_58.get(0)).method_262(var1) + " {\r\n");
      var3.append(class_209.method_1041(this.field_57, var1 + 1, true));
      var3.append(var2 + "}\r\n");
      return var3.toString();
   }

   // $FF: renamed from: e_ () void
   public final void method_45() {
      this.field_58.set(0, (class_86)this.field_21.method_75().remove(this.field_21.method_75().size() - 1));
   }

   // $FF: renamed from: d () java.util.List
   public final List method_44() {
      ArrayList var1;
      (var1 = new ArrayList(this.field_19)).add(1, this.field_58.get(0));
      return var1;
   }

   // $FF: renamed from: a (aJ, aJ) void
   public final void method_46(class_86 var1, class_86 var2) {
      if(this.field_58.get(0) == var1) {
         this.field_58.set(0, var2);
      }

   }

   // $FF: renamed from: a (ca, ca) void
   public final void method_49(class_46 var1, class_46 var2) {
      if(this.field_57 == var1) {
         this.field_57 = var2;
      }

      super.method_49(var1, var2);
   }

   // $FF: renamed from: e () void
   public final void method_141() {
      class_46 var1;
      class_172.method_793(var1 = (class_46)this.field_19.get(2), true);
      this.field_19.method_658(var1.field_14);
   }

   // $FF: renamed from: a () ca
   public final class_46 method_47() {
      class_56 var10000 = new class_56;
      var10000.method_23();
      return var10000;
   }

   // $FF: renamed from: b () void
   public final void method_48() {
      this.field_21 = (class_46)this.field_19.get(0);
      this.field_57 = (class_46)this.field_19.get(1);
   }

   // $FF: renamed from: f () ca
   public final class_46 method_142() {
      return this.field_57;
   }

   // $FF: renamed from: g () java.util.List
   public final List method_143() {
      return this.field_58;
   }
}
