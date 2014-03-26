import java.io.DataInputStream;
import java.util.ArrayList;
import java.util.List;

// $FF: renamed from: bK
public final class class_203 {

   // $FF: renamed from: a java.util.List
   private List field_548;
   // $FF: renamed from: b u
   private class_110 field_549;


   // $FF: renamed from: <init> (java.io.DataInputStream) void
   public void method_992(DataInputStream var1) {
      super();
      this.field_548 = new ArrayList();
      int var2;
      int[] var3 = new int[var2 = var1.readUnsignedShort()];
      this.field_548.add((Object)null);

      int var4;
      for(var4 = 1; var4 < var2; ++var4) {
         byte var5;
         class_80 var6;
         List var10000;
         switch(var5 = (byte)var1.readUnsignedByte()) {
         case 1:
            var10000 = this.field_548;
            var6 = new class_80;
            var6.method_222(1, var1.readUTF());
            var10000.add(var6);
         case 2:
         default:
            break;
         case 3:
            var10000 = this.field_548;
            var6 = new class_80;
            var6.method_222(3, new Integer(var1.readInt()));
            var10000.add(var6);
            break;
         case 4:
            var10000 = this.field_548;
            var6 = new class_80;
            var6.method_222(4, new Float(var1.readFloat()));
            var10000.add(var6);
            break;
         case 5:
            var10000 = this.field_548;
            var6 = new class_80;
            var6.method_222(5, new Long(var1.readLong()));
            var10000.add(var6);
            this.field_548.add((Object)null);
            ++var4;
            break;
         case 6:
            var10000 = this.field_548;
            var6 = new class_80;
            var6.method_222(6, new Double(var1.readDouble()));
            var10000.add(var6);
            this.field_548.add((Object)null);
            ++var4;
            break;
         case 7:
         case 8:
            var10000 = this.field_548;
            var6 = new class_80;
            var6.method_223(var5, var1.readUnsignedShort());
            var10000.add(var6);
            var3[var4] = 1;
            break;
         case 9:
         case 10:
         case 11:
         case 12:
            var10000 = this.field_548;
            class_79 var10001 = new class_79;
            var10001.method_220(var5, var1.readUnsignedShort(), var1.readUnsignedShort());
            var10000.add(var10001);
            if(var5 == 12) {
               var3[var4] = 1;
            } else {
               var3[var4] = 2;
            }
         }
      }

      for(var4 = 1; var4 < var2; ++var4) {
         if(var3[var4] == 1) {
            ((class_78)this.field_548.get(var4)).method_218(this);
         }
      }

      for(var4 = 1; var4 < var2; ++var4) {
         if(var3[var4] == 2) {
            ((class_78)this.field_548.get(var4)).method_218(this);
         }
      }

      this.field_549 = class_181.method_857();
   }

   // $FF: renamed from: a (int, int, int, int) java.lang.String[]
   public final String[] method_993(int var1, int var2, int var3, int var4) {
      String var6 = (String)((class_80)this.method_994(var2)).field_106;
      String var7 = (String)((class_80)this.method_994(var3)).field_106;
      String var8 = (String)((class_80)this.method_994(var4)).field_106;
      if(this.field_549 != null) {
         if((var6 = this.field_549.method_419(var1, var6, var7, var8)) != null) {
            var7 = var6.split(" ")[1];
         }

         String var5;
         if((var5 = this.method_998(var1 == 2?9:10, var8)) != null) {
            var8 = var5;
         }
      }

      return new String[]{var7, var8};
   }

   // $FF: renamed from: c (int) by
   private class_78 method_994(int var1) {
      return (class_78)this.field_548.get(var1);
   }

   // $FF: renamed from: a (int) T
   public final class_80 method_995(int var1) {
      String var2;
      class_80 var3;
      if((var3 = (class_80)this.method_994(var1)) != null && this.field_549 != null && var3.field_99 == 7 && (var2 = this.method_997((String)var3.field_106)) != null) {
         class_80 var10000 = new class_80;
         var10000.method_222(7, var2);
         var3 = var10000;
      }

      return var3;
   }

   // $FF: renamed from: b (int) g
   public final class_79 method_996(int var1) {
      class_79 var5;
      if((var5 = (class_79)this.method_994(var1)) != null && this.field_549 != null && (var5.field_99 == 9 || var5.field_99 == 10 || var5.field_99 == 11)) {
         String var2 = this.method_997(var5.field_102);
         String var3 = this.field_549.method_419(var5.field_99 == 9?2:3, var5.field_102, var5.field_103, var5.field_104);
         String var4 = this.method_998(var5.field_99, var5.field_104);
         if(var2 != null || var3 != null || var4 != null) {
            class_79 var10000 = new class_79;
            var10000.method_219(var5.field_99, var2 == null?var5.field_102:var2, var3 == null?var5.field_103:var3.split(" ")[1], var4 == null?var5.field_104:var4);
            var5 = var10000;
         }
      }

      return var5;
   }

   // $FF: renamed from: a (java.lang.String) java.lang.String
   private String method_997(String var1) {
      class_83 var10000 = new class_83;
      var10000.method_239(var1, true);
      class_83 var5 = var10000;
      String var4;
      if((var4 = this.field_549.method_419(1, var5.field_136, (String)null, (String)null)) == null) {
         return null;
      } else {
         StringBuilder var2 = new StringBuilder();
         if(var5.field_135 > 0) {
            for(int var3 = 0; var3 < var5.field_135; ++var3) {
               var2.append("[");
            }

            var2.append("L" + var4 + ";");
         } else {
            var2.append(var4);
         }

         return var2.toString();
      }
   }

   // $FF: renamed from: a (int, java.lang.String) java.lang.String
   private String method_998(int var1, String var2) {
      boolean var3 = false;
      class_83 var10;
      if(var1 == 9) {
         String var4;
         class_206 var8;
         if((var10 = (var8 = class_206.method_1009(var2)).field_559).field_133 == 8 && (var4 = this.method_997(var10.field_136)) != null) {
            var10.field_136 = var4;
            var3 = true;
         }

         if(var3) {
            return var8.method_1010();
         }
      } else {
         class_83[] var6;
         class_197 var9;
         int var5 = (var6 = (var9 = class_197.method_963(var2)).field_519).length;

         for(int var11 = 0; var11 < var5; ++var11) {
            String var7;
            if((var10 = var6[var11]).field_133 == 8 && (var7 = this.method_997(var10.field_136)) != null) {
               var10.field_136 = var7;
               var3 = true;
            }
         }

         if(var9.field_520.field_133 == 8 && (var2 = this.method_997(var9.field_520.field_136)) != null) {
            var9.field_520.field_136 = var2;
            var3 = true;
         }

         if(var3) {
            return var9.method_964();
         }
      }

      return null;
   }
}
