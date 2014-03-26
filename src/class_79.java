
// $FF: renamed from: g
public final class class_79 extends class_78 {

   // $FF: renamed from: f int
   private int field_100;
   // $FF: renamed from: g int
   private int field_101;
   // $FF: renamed from: a java.lang.String
   public String field_102;
   // $FF: renamed from: b java.lang.String
   public String field_103;
   // $FF: renamed from: c java.lang.String
   public String field_104;


   // $FF: renamed from: <init> (int, java.lang.String, java.lang.String, java.lang.String) void
   public void method_219(int var1, String var2, String var3, String var4) {
      super.method_217();
      this.field_99 = var1;
      this.field_102 = var2;
      this.field_103 = var3;
      this.field_104 = var4;
      this.method_221();
   }

   // $FF: renamed from: <init> (int, int, int) void
   public void method_220(int var1, int var2, int var3) {
      super.method_217();
      this.field_99 = var1;
      this.field_100 = var2;
      this.field_101 = var3;
   }

   // $FF: renamed from: a (bK) void
   public final void method_218(class_203 var1) {
      if(this.field_99 == 12) {
         this.field_103 = (String)var1.method_995(this.field_100).field_106;
         this.field_104 = (String)var1.method_995(this.field_101).field_106;
      } else {
         this.field_102 = (String)var1.method_995(this.field_100).field_106;
         class_79 var2 = var1.method_996(this.field_101);
         this.field_103 = var2.field_103;
         this.field_104 = var2.field_104;
      }

      this.method_221();
   }

   public final boolean equals(Object var1) {
      if(var1 != null && var1 instanceof class_79) {
         class_79 var2 = (class_79)var1;
         return this.field_99 == var2.field_99 && this.field_103.equals(var2.field_103) && this.field_104.equals(var2.field_104)?(this.field_99 == 12?this.field_102.equals(var2.field_102):true):false;
      } else {
         return false;
      }
   }

   // $FF: renamed from: a () void
   private void method_221() {
      if(this.field_99 != 10 && this.field_99 != 11) {
         if(this.field_99 == 9 && !"D".equals(this.field_104)) {
            "J".equals(this.field_104);
         }

      } else {
         String var1 = null;
         String[] var4;
         var1 = (var4 = this.field_104.split("[()]"))[1];
         int var2 = 0;

         for(int var3 = var1.length(); var2 < var3; ++var2) {
            if(var1.charAt(var2) == 76) {
               var2 = var1.indexOf(";", var2);
            }
         }

         "V".equals(var4[2]);
         if(!"D".equals(var4[2])) {
            "J".equals(var4[2]);
         }

      }
   }
}
