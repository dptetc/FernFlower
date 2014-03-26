import java.util.Collection;
import java.util.Iterator;

// $FF: renamed from: aw
public final class class_195 {

   // $FF: renamed from: a cE
   private class_146 field_510;
   // $FF: renamed from: b int
   private int field_511;


   // $FF: renamed from: <init> (java.util.Collection) void
   public void method_950(Collection var1) {
      super();
      class_146 var10001 = new class_146;
      var10001.method_653();
      this.field_510 = var10001;
      this.field_511 = var1.size() / 32 + 1;
      int var2 = 0;
      int var3 = 1;

      for(Iterator var4 = var1.iterator(); var4.hasNext(); var3 <<= 1) {
         Object var6 = (Object)var4.next();
         int var5 = var2 / 32;
         if(var2 % 32 == 0) {
            var3 = 1;
         }

         this.field_510.method_656(new int[]{var5, var3}, var6);
         ++var2;
      }

   }

   // $FF: renamed from: a () p
   public final class_115 method_951() {
      class_115 var10000 = new class_115;
      var10000.method_470(this, (class_115)null);
      return var10000;
   }
}
