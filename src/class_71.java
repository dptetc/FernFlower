import java.util.ArrayList;
import java.util.List;

// $FF: renamed from: bi
public final class class_71 extends class_67 {

   // $FF: renamed from: c java.util.List
   private List field_89;


   // $FF: renamed from: <init> () void
   public void method_193() {
      super.method_193();
      this.field_89 = new ArrayList();
   }

   // $FF: renamed from: a (bK) void
   public final void method_194(class_203 var1) {
      this.field_83 = "Exceptions";
      int var4 = 2 + (((this.field_82[0] & 255) << 8 | this.field_82[1] & 255) << 1);

      for(int var2 = 2; var2 < var4; var2 += 2) {
         int var3 = (this.field_82[var2] & 255) << 8 | this.field_82[var2 + 1] & 255;
         this.field_89.add(Integer.valueOf(var3));
      }

   }

   // $FF: renamed from: a (int, bK) java.lang.String
   public final String method_205(int var1, class_203 var2) {
      return (String)var2.method_995(((Integer)this.field_89.get(var1)).intValue()).field_106;
   }

   // $FF: renamed from: a () java.util.List
   public final List method_206() {
      return this.field_89;
   }
}
