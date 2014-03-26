import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// $FF: renamed from: cT
public final class class_73 extends class_67 {

   // $FF: renamed from: c java.util.List
   private List field_91;
   // $FF: renamed from: d java.util.List
   private List field_92;


   // $FF: renamed from: <init> () void
   public void method_193() {
      super.method_193();
      this.field_91 = new ArrayList();
      this.field_92 = new ArrayList();
   }

   // $FF: renamed from: a (bK) void
   public final void method_194(class_203 var1) {
      this.field_83 = "InnerClasses";
      int var2 = 2 + (((this.field_82[0] & 255) << 8 | this.field_82[1] & 255) << 3);
      int var3 = 2;

      while(var3 < var2) {
         int[] var4 = new int[4];

         for(int var5 = 0; var5 < 4; ++var5) {
            var4[var5] = (this.field_82[var3] & 255) << 8 | this.field_82[var3 + 1] & 255;
            var3 += 2;
         }

         this.field_91.add(var4);
      }

      String[] var6;
      for(Iterator var8 = this.field_91.iterator(); var8.hasNext(); this.field_92.add(var6)) {
         class_41[] var7 = (class_41[])var8.next();
         (var6 = new String[3])[0] = (String)var1.method_995((int)var7[0]).field_106;
         if(var7[1] != false) {
            var6[1] = (String)var1.method_995((int)var7[1]).field_106;
         }

         if(var7[2] != false) {
            var6[2] = (String)var1.method_995((int)var7[2]).field_106;
         }
      }

   }

   // $FF: renamed from: a () java.util.List
   public final List method_208() {
      return this.field_91;
   }

   // $FF: renamed from: b () java.util.List
   public final List method_209() {
      return this.field_92;
   }
}
