import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

// $FF: renamed from: bL
public final class class_69 extends class_67 {

   // $FF: renamed from: c java.util.List
   private List field_87;


   // $FF: renamed from: <init> () void
   public void method_193() {
      super.method_193();
   }

   // $FF: renamed from: a (bK) void
   public final void method_194(class_203 var1) {
      super.method_194(var1);
      this.field_87 = new ArrayList();
      DataInputStream var2 = new DataInputStream(new ByteArrayInputStream(this.field_82, 2, this.field_82.length));
      int var3 = (this.field_82[0] & 255) << 8 | this.field_82[1] & 255;

      for(int var4 = 0; var4 < var3; ++var4) {
         this.field_87.add(method_201(var2, var1));
      }

   }

   // $FF: renamed from: a (java.io.DataInputStream, bK) ch
   public static class_96 method_201(DataInputStream var0, class_203 var1) {
      try {
         String var2 = (String)var1.method_995(var0.readUnsignedShort()).field_106;
         class_83 var10000 = new class_83;
         var10000.method_238(var2);
         class_83 var8 = var10000;
         int var3 = var0.readUnsignedShort();
         ArrayList var4 = new ArrayList();
         ArrayList var5 = new ArrayList();

         for(int var6 = 0; var6 < var3; ++var6) {
            var4.add((String)var1.method_995(var0.readUnsignedShort()).field_106);
            var5.add(method_202(var0, var1));
         }

         class_96 var9 = new class_96;
         var9.method_335(var8.field_136, var4, var5);
         return var9;
      } catch (IOException var7) {
         throw new RuntimeException(var7);
      }
   }

   // $FF: renamed from: b (java.io.DataInputStream, bK) aJ
   public static class_86 method_202(DataInputStream var0, class_203 var1) {
      try {
         int var2;
         ArrayList var3;
         class_83 var7;
         String var11;
         class_80 var10000;
         class_87 var13;
         switch(var2 = var0.readUnsignedByte()) {
         case 64:
            return method_201(var0, var1);
         case 91:
            var2 = var0.readUnsignedShort();
            var3 = new ArrayList();

            for(int var4 = 0; var4 < var2; ++var4) {
               var3.add(method_202(var0, var1));
            }

            class_83 var14;
            class_83 var16;
            if(var3.isEmpty()) {
               var14 = new class_83;
               var14.method_237(8, 1, "java/lang/Object");
               var16 = var14;
            } else {
               var7 = ((class_86)var3.get(0)).method_254();
               var14 = new class_83;
               var14.method_237(var7.field_133, 1, var7.field_136);
               var16 = var14;
            }

            class_95 var12 = new class_95;
            var12.method_323(var16, new ArrayList());
            class_95 var9 = var12;
            var12.method_332();
            var9.method_331(var3);
            return var9;
         case 99:
            var10000 = var1.method_995(var0.readUnsignedShort());
            var3 = null;
            if((var7 = class_206.method_1009((String)var10000.field_106).field_559).field_135 <= 0) {
               var11 = null;
               switch(var7.field_133) {
               case 0:
               case 1:
               case 2:
               case 3:
               case 4:
               case 5:
               case 6:
               case 7:
               case 10:
                  var11 = class_1.field_0[var7.field_133];
                  break;
               case 8:
                  var11 = var7.field_136;
                  break;
               case 9:
               default:
                  throw new RuntimeException("invalid class type!");
               }

               if(var11 != null) {
                  var13 = new class_87;
                  var13.method_266(class_83.field_130, var11);
                  return var13;
               }
            }

            throw new RuntimeException("unknown annotation type!");
         case 101:
            var10000 = var1.method_995(var0.readUnsignedShort());
            var3 = null;
            var11 = (String)var10000.field_106;
            String var6 = (String)var1.method_995(var0.readUnsignedShort()).field_106;
            class_206 var8 = class_206.method_1009(var11);
            class_92 var15 = new class_92;
            var15.method_308(var6, var8.field_559.field_136, true, (class_86)null, var8);
            return var15;
         default:
            class_80 var10 = var1.method_995(var0.readUnsignedShort());
            switch(var2) {
            case 66:
               var13 = new class_87;
               var13.method_266(class_83.field_122, var10.field_106);
               return var13;
            case 67:
               var13 = new class_87;
               var13.method_266(class_83.field_123, var10.field_106);
               return var13;
            case 68:
               var13 = new class_87;
               var13.method_266(class_83.field_121, var10.field_106);
               return var13;
            case 70:
               var13 = new class_87;
               var13.method_266(class_83.field_119, var10.field_106);
               return var13;
            case 73:
               var13 = new class_87;
               var13.method_266(class_83.field_118, var10.field_106);
               return var13;
            case 74:
               var13 = new class_87;
               var13.method_266(class_83.field_120, var10.field_106);
               return var13;
            case 83:
               var13 = new class_87;
               var13.method_266(class_83.field_124, var10.field_106);
               return var13;
            case 90:
               var13 = new class_87;
               var13.method_266(class_83.field_125, var10.field_106);
               return var13;
            case 115:
               var13 = new class_87;
               var13.method_266(class_83.field_129, var10.field_106);
               return var13;
            default:
               throw new RuntimeException("invalid element type!");
            }
         }
      } catch (IOException var5) {
         throw new RuntimeException(var5);
      }
   }

   // $FF: renamed from: a () java.util.List
   public final List method_203() {
      return this.field_87;
   }
}
