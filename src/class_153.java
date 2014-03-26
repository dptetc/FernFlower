import java.io.DataInputStream;
import java.io.InputStream;

// $FF: renamed from: cw
public final class class_153 extends DataInputStream {

   // $FF: renamed from: <init> (java.io.InputStream) void
   public void method_710(InputStream var1) {
      super(var1);
   }

   // $FF: renamed from: a (byte[]) int
   public final int method_711(byte[] var1) {
      int var2;
      byte[] var3 = new byte[var2 = var1.length];
      int var4 = 0;
      boolean var5 = false;

      int var6;
      while((var6 = this.read(var3, 0, var2 - var4)) != -1) {
         System.arraycopy(var3, 0, var1, var4, var6);
         if((var4 += var6) == var2) {
            return var2;
         }
      }

      return -1;
   }
}
