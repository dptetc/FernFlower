
// $FF: renamed from: af
public final class class_68 extends class_67 {

   // $FF: renamed from: c java.lang.String
   private String field_84;
   // $FF: renamed from: d java.lang.String
   private String field_85;
   // $FF: renamed from: e java.lang.String
   private String field_86;


   // $FF: renamed from: <init> () void
   public void method_193() {
      super.method_193();
   }

   // $FF: renamed from: a (bK) void
   public final void method_194(class_203 var1) {
      this.field_83 = "EnclosingMethod";
      int var2 = (this.field_82[0] & 255) << 8 | this.field_82[1] & 255;
      int var3 = (this.field_82[2] & 255) << 8 | this.field_82[3] & 255;
      this.field_84 = (String)var1.method_995(var2).field_106;
      if(var3 != 0) {
         class_79 var4 = var1.method_996(var3);
         this.field_85 = var4.field_103;
         this.field_86 = var4.field_104;
      }

   }

   // $FF: renamed from: a () java.lang.String
   public final String method_198() {
      return this.field_84;
   }

   // $FF: renamed from: b () java.lang.String
   public final String method_199() {
      return this.field_86;
   }

   // $FF: renamed from: c () java.lang.String
   public final String method_200() {
      return this.field_85;
   }
}
