import java.io.InputStream;

// $FF: renamed from: bW
public final class class_198 {

   // $FF: renamed from: a int
   public int field_521;
   // $FF: renamed from: b int
   public int field_522;
   // $FF: renamed from: c int
   public int field_523;
   // $FF: renamed from: d int
   public int field_524;
   // $FF: renamed from: g int
   private int field_525;
   // $FF: renamed from: h T
   private class_80 field_526;
   // $FF: renamed from: e T
   public class_80 field_527;
   // $FF: renamed from: f java.lang.String
   public String field_528;
   // $FF: renamed from: i bK
   private class_203 field_529;
   // $FF: renamed from: j int[]
   private int[] field_530;
   // $FF: renamed from: k java.lang.String[]
   private String[] field_531;
   // $FF: renamed from: l cE
   private class_146 field_532;
   // $FF: renamed from: m cE
   private class_146 field_533;
   // $FF: renamed from: n cE
   private class_146 field_534;
   // $FF: renamed from: o boolean
   private boolean field_535;
   // $FF: renamed from: p cz
   private class_151 field_536;


   // $FF: renamed from: <init> (java.io.InputStream, boolean, cz) void
   public void method_965(InputStream var1, boolean var2, class_151 var3) {
      class_153 var10001 = new class_153;
      var10001.method_710(var1);
      this.method_966(var10001, var2, var3);
   }

   // $FF: renamed from: <init> (cw, boolean, cz) void
   public void method_966(class_153 var1, boolean var2, class_151 var3) {
      super();
      class_146 var10001 = new class_146;
      var10001.method_653();
      this.field_532 = var10001;
      var10001 = new class_146;
      var10001.method_653();
      this.field_533 = var10001;
      var10001 = new class_146;
      var10001.method_653();
      this.field_534 = var10001;
      this.field_535 = true;
      this.field_535 = var2;
      this.field_536 = var3;
      this.method_971(var1);
   }

   // $FF: renamed from: a (java.lang.String, java.lang.String) bA
   public final class_168 method_967(String var1, String var2) {
      return (class_168)this.field_532.method_659(class_129.method_562(var1, var2));
   }

   // $FF: renamed from: b (java.lang.String, java.lang.String) bn
   public final class_128 method_968(String var1, String var2) {
      return (class_128)this.field_533.method_659(class_129.method_562(var1, var2));
   }

   // $FF: renamed from: a (int) java.lang.String
   public final String method_969(int var1) {
      return this.field_531[var1];
   }

   // $FF: renamed from: a () void
   public final void method_970() {
      if(this.field_536 != null) {
         this.field_529 = null;
      }

   }

   // $FF: renamed from: a (cw) void
   private void method_971(class_153 var1) {
      var1.skip(4L);
      this.field_521 = var1.readUnsignedShort();
      this.field_522 = var1.readUnsignedShort();
      class_203 var10001 = new class_203;
      var10001.method_992(var1);
      this.field_529 = var10001;
      this.field_523 = var1.readUnsignedShort();
      this.field_524 = var1.readUnsignedShort();
      this.field_526 = this.field_529.method_995(this.field_524);
      this.field_528 = (String)this.field_526.field_106;
      this.field_525 = var1.readUnsignedShort();
      this.field_527 = this.field_529.method_995(this.field_525);
      int var2;
      int[] var3 = new int[var2 = var1.readUnsignedShort()];
      String[] var4 = new String[var2];

      for(int var5 = 0; var5 < var2; ++var5) {
         var3[var5] = var1.readUnsignedShort();
         var4[var5] = (String)this.field_529.method_995(var3[var5]).field_106;
      }

      this.field_530 = var3;
      this.field_531 = var4;
      class_146 var10000 = new class_146;
      var10000.method_653();
      class_146 var11 = var10000;
      var2 = var1.readUnsignedShort();

      int var6;
      for(var6 = 0; var6 < var2; ++var6) {
         class_168 var7 = new class_168;
         var7.method_770();
         class_168 var9 = var7;
         var7.field_423 = var1.readUnsignedShort();
         var9.field_424 = var1.readUnsignedShort();
         var9.field_425 = var1.readUnsignedShort();
         var9.method_771(this.field_529, this.field_524);
         var9.method_773(this.method_972(var1));
         var11.method_655(var9, class_129.method_562(var9.method_775(), var9.method_774()));
      }

      this.field_532 = var11;
      var2 = var1.readUnsignedShort();

      for(var6 = 0; var6 < var2; ++var6) {
         class_128 var8 = new class_128;
         var8.method_541(var1, this.field_535, this);
         class_128 var10 = var8;
         this.field_533.method_655(var10, class_129.method_562(var10.method_549(), var10.method_548()));
      }

      this.field_534 = this.method_972(var1);
      if(this.field_536 != null) {
         this.field_529 = null;
      }

   }

   // $FF: renamed from: b (cw) cE
   private class_146 method_972(class_153 var1) {
      class_146 var10000 = new class_146;
      var10000.method_653();
      class_146 var2 = var10000;
      int var3 = var1.readUnsignedShort();

      for(int var4 = 0; var4 < var3; ++var4) {
         int var5 = var1.readUnsignedShort();
         class_80 var7 = this.field_529.method_995(var5);
         String var6 = null;
         var6 = (String)var7.field_106;
         class_67 var8;
         if((var8 = class_67.method_195(var5, var6)) != null) {
            byte[] var9 = new byte[var1.readInt()];
            var1.method_711(var9);
            var8.method_196(var9);
            var8.method_194(this.field_529);
            var2.method_655(var8, var8.method_197());
         } else {
            var1.skip((long)var1.readInt());
         }
      }

      return var2;
   }

   // $FF: renamed from: b () bK
   public final class_203 method_973() {
      if(this.field_529 == null && this.field_536 != null) {
         this.field_529 = this.field_536.method_703(this.field_528);
      }

      return this.field_529;
   }

   // $FF: renamed from: c () int[]
   public final int[] method_974() {
      return this.field_530;
   }

   // $FF: renamed from: d () java.lang.String[]
   public final String[] method_975() {
      return this.field_531;
   }

   // $FF: renamed from: e () cE
   public final class_146 method_976() {
      return this.field_533;
   }

   // $FF: renamed from: f () cE
   public final class_146 method_977() {
      return this.field_532;
   }

   // $FF: renamed from: g () cE
   public final class_146 method_978() {
      return this.field_534;
   }

   // $FF: renamed from: h () boolean
   public final boolean method_979() {
      return this.field_535;
   }

   // $FF: renamed from: i () cz
   public final class_151 method_980() {
      return this.field_536;
   }
}
