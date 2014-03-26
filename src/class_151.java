import de.fernflower.main.extern.IBytecodeProvider;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;

// $FF: renamed from: cz
public final class class_151 {

   // $FF: renamed from: a java.util.HashMap
   private HashMap field_384;
   // $FF: renamed from: b de.fernflower.main.extern.IBytecodeProvider
   private IBytecodeProvider field_385;


   // $FF: renamed from: <init> (de.fernflower.main.extern.IBytecodeProvider) void
   public void method_699(IBytecodeProvider var1) {
      super();
      this.field_384 = new HashMap();
      this.field_385 = var1;
   }

   // $FF: renamed from: a (java.lang.String, bM) void
   public final void method_700(String var1, class_200 var2) {
      this.field_384.put(var1, var2);
   }

   // $FF: renamed from: a (java.lang.String) void
   public final void method_701(String var1) {
      this.field_384.remove(var1);
   }

   // $FF: renamed from: b (java.lang.String) bM
   public final class_200 method_702(String var1) {
      return (class_200)this.field_384.get(var1);
   }

   // $FF: renamed from: c (java.lang.String) bK
   public final class_203 method_703(String var1) {
      try {
         class_153 var3;
         if((var3 = this.method_706(var1)) == null) {
            return null;
         } else {
            var3.skip(8L);
            class_203 var10000 = new class_203;
            var10000.method_992(var3);
            return var10000;
         }
      } catch (IOException var2) {
         throw new RuntimeException(var2);
      }
   }

   // $FF: renamed from: a (bn, int) byte[]
   public final byte[] method_704(class_128 var1, int var2) {
      try {
         class_153 var10;
         if((var10 = this.method_706(var1.method_553().field_528)) == null) {
            return null;
         } else {
            class_203 var3 = null;
            var10.skip(8L);
            int var5;
            int var6;
            if((var3 = var1.method_553().method_973()) == null) {
               class_203 var10000 = new class_203;
               var10000.method_992(var10);
               var3 = var10000;
            } else {
               class_153 var4 = var10;
               var5 = var10.readUnsignedShort();

               for(var6 = 1; var6 < var5; ++var6) {
                  switch(var4.readUnsignedByte()) {
                  case 1:
                     var4.readUTF();
                  case 2:
                  default:
                     break;
                  case 3:
                  case 4:
                  case 9:
                  case 10:
                  case 11:
                  case 12:
                     var4.skip(4L);
                     break;
                  case 5:
                  case 6:
                     var4.skip(8L);
                     ++var6;
                     break;
                  case 7:
                  case 8:
                     var4.skip(2L);
                  }
               }
            }

            var10.skip(2L);
            int var13 = var10.readUnsignedShort();
            var10.skip(2L);
            var10.skip((long)(var10.readUnsignedShort() << 1));
            var5 = var10.readUnsignedShort();

            for(var6 = 0; var6 < var5; ++var6) {
               var10.skip(6L);
               method_707(var10);
            }

            var5 = var10.readUnsignedShort();

            for(var6 = 0; var6 < var5; ++var6) {
               var10.skip(2L);
               int var7 = var10.readUnsignedShort();
               int var8 = var10.readUnsignedShort();
               String[] var16;
               String var18 = (var16 = var3.method_993(3, var13, var7, var8))[0];
               if(var1.method_549().equals(var18)) {
                  String var17 = var16[1];
                  if(var1.method_548().equals(var17)) {
                     int var11 = var10.readUnsignedShort();

                     for(var13 = 0; var13 < var11; ++var13) {
                        var5 = var10.readUnsignedShort();
                        class_80 var12 = var3.method_995(var5);
                        String var15 = null;
                        var15 = (String)var12.field_106;
                        if("Code".equals(var15)) {
                           var10.skip(12L);
                           byte[] var14 = new byte[var2];
                           var10.method_711(var14);
                           return var14;
                        }

                        var10.skip((long)var10.readInt());
                     }

                     return null;
                  }
               }

               method_707(var10);
            }

            return null;
         }
      } catch (IOException var9) {
         throw new RuntimeException(var9);
      }
   }

   // $FF: renamed from: a (java.lang.String, java.lang.String) cw
   public final class_153 method_705(String var1, String var2) {
      InputStream var3;
      if((var3 = this.field_385.getBytecodeStream(var1, var2)) == null) {
         return null;
      } else {
         class_153 var10000 = new class_153;
         var10000.method_710(var3);
         return var10000;
      }
   }

   // $FF: renamed from: d (java.lang.String) cw
   public final class_153 method_706(String var1) {
      class_200 var2;
      return (var2 = (class_200)this.field_384.get(var1)) == null?null:this.method_705(var2.field_543, var2.field_544);
   }

   // $FF: renamed from: a (cw) void
   private static void method_707(class_153 var0) {
      int var1 = var0.readUnsignedShort();

      for(int var2 = 0; var2 < var1; ++var2) {
         var0.skip(2L);
         var0.skip((long)var0.readInt());
      }

   }
}
