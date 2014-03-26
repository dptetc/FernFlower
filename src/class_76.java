import java.util.HashMap;

// $FF: renamed from: U
public final class class_76 extends class_67 {

   // $FF: renamed from: c java.util.HashMap
   private HashMap field_95;


   // $FF: renamed from: <init> () void
   public void method_193() {
      super.method_193();
      this.field_95 = new HashMap();
   }

   // $FF: renamed from: a (bK) void
   public final void method_194(class_203 var1) {
      this.field_83 = "LocalVariableTable";
      int var2 = (this.field_82[0] & 255) << 8 | this.field_82[1] & 255;
      int var3 = 6;

      for(int var4 = 0; var4 < var2; var3 += 10) {
         int var5 = (this.field_82[var3] & 255) << 8 | this.field_82[var3 + 1] & 255;
         int var6 = (this.field_82[var3 + 4] & 255) << 8 | this.field_82[var3 + 5] & 255;
         this.field_95.put(Integer.valueOf(var6), (String)var1.method_995(var5).field_106);
         ++var4;
      }

   }

   // $FF: renamed from: a (U) void
   public final void method_212(class_76 var1) {
      this.field_95.putAll(var1.field_95);
   }

   // $FF: renamed from: a () java.util.HashMap
   public final HashMap method_213() {
      return this.field_95;
   }
}
