import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

// $FF: renamed from: cK
public final class class_72 extends class_67 {

   // $FF: renamed from: c java.util.List
   private List field_90;


   // $FF: renamed from: <init> () void
   public void method_193() {
      super.method_193();
   }

   // $FF: renamed from: a (bK) void
   public final void method_194(class_203 var1) {
      super.method_194(var1);
      this.field_90 = new ArrayList();
      DataInputStream var2 = new DataInputStream(new ByteArrayInputStream(this.field_82));

      try {
         int var3 = var2.readUnsignedByte();

         for(int var4 = 0; var4 < var3; ++var4) {
            ArrayList var5 = new ArrayList();
            int var6 = var2.readUnsignedShort();

            for(int var7 = 0; var7 < var6; ++var7) {
               var5.add(class_69.method_201(var2, var1));
            }

            this.field_90.add(var5);
         }

      } catch (IOException var8) {
         throw new RuntimeException(var8);
      }
   }

   // $FF: renamed from: a () java.util.List
   public final List method_207() {
      return this.field_90;
   }
}
