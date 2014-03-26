
// $FF: renamed from: ci
public final class class_48 extends class_46 {

   // $FF: renamed from: a bT
   private class_191 field_35;


   // $FF: renamed from: <init> (bT) void
   public void method_93(class_191 var1) {
      super.method_23();
      this.field_13 = 8;
      this.field_35 = var1;
      this.field_14 = Integer.valueOf(var1.field_488);
      class_176 var2 = class_181.method_853();
      if(this.field_14.intValue() >= var2.method_813()) {
         var2.method_812(0, this.field_14.intValue() + 1);
      }

      class_5 var3;
      if((var3 = var1.method_912()) != null) {
         if(var3.field_6 == 2 && var3.field_5 != 167) {
            this.field_27 = 0;
         } else if(var3.field_6 == 3) {
            this.field_27 = 1;
         }
      }

      this.method_38();
   }

   // $FF: renamed from: a (int) java.lang.String
   public final String method_43(int var1) {
      return class_209.method_1043(this.field_24, var1) + class_209.method_1043(this.field_22, var1);
   }

   // $FF: renamed from: a () ca
   public final class_46 method_47() {
      class_191 var10000 = new class_191;
      var10000.method_910(class_181.method_853().method_814(0));
      class_191 var1 = var10000;
      class_62 var4 = new class_62;
      var4.method_165();
      class_62 var2 = var4;

      for(int var3 = 0; var3 < this.field_35.method_925().method_176(); ++var3) {
         var2.method_168(this.field_35.method_925().method_171(var3).method_16(), -1);
      }

      var1.method_926(var2);
      class_48 var5 = new class_48;
      var5.method_93(var1);
      return var5;
   }

   // $FF: renamed from: e () bT
   public final class_191 method_94() {
      return this.field_35;
   }
}
