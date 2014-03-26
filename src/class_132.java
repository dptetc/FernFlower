import java.util.Collection;
import java.util.Iterator;

// $FF: renamed from: cM
public final class class_132 {

   // $FF: renamed from: a cE
   private class_146 field_337;
   // $FF: renamed from: b int
   private int field_338;
   // $FF: renamed from: c int
   private int field_339;


   // $FF: renamed from: <init> (java.util.Collection) void
   public void method_573(Collection var1) {
      super();
      class_146 var10001 = new class_146;
      var10001.method_653();
      this.field_337 = var10001;
      int var2 = -1;
      int var3 = -1;
      int var4 = 0;

      for(Iterator var5 = var1.iterator(); var5.hasNext(); ++var4) {
         Object var6 = (Object)var5.next();
         var2 = var4 / 32;
         if(var4 % 32 == 0) {
            var3 = 1;
         } else {
            var3 <<= 1;
         }

         this.field_337.method_656(new int[]{var2, var3}, var6);
      }

      this.field_338 = var2;
      this.field_339 = var3;
   }

   // $FF: renamed from: a () cJ
   public final class_141 method_574() {
      class_141 var10000 = new class_141;
      var10000.method_641(this, (class_141)null);
      return var10000;
   }

   // $FF: renamed from: b () int
   public final int method_575() {
      return this.field_338;
   }
}
