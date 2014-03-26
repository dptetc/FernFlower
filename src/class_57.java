import java.util.HashSet;
import java.util.Iterator;

// $FF: renamed from: F
public final class class_57 implements Runnable {

   // $FF: renamed from: a bn
   private class_128 field_59;
   // $FF: renamed from: b ce
   private class_164 field_60;
   // $FF: renamed from: c aD
   private class_181 field_61;
   // $FF: renamed from: d S
   private class_54 field_62;
   // $FF: renamed from: e java.lang.Throwable
   private Throwable field_63;


   // $FF: renamed from: <init> (bn, ce, aD) void
   public void method_144(class_128 var1, class_164 var2, class_181 var3) {
      super();
      this.field_59 = var1;
      this.field_60 = var2;
      this.field_61 = var3;
   }

   public final void run() {
      class_181.method_843(this.field_61);
      this.field_63 = null;
      this.field_62 = null;

      try {
         this.field_62 = method_145(this.field_59, this.field_60);
         synchronized(this) {
            this.notify();
         }
      } catch (ThreadDeath var3) {
         ;
      } catch (Throwable var4) {
         this.field_63 = var4;
      }
   }

   // $FF: renamed from: a (bn, ce) S
   public static class_54 method_145(class_128 var0, class_164 var1) {
      class_198 var2 = var0.method_553();
      boolean var3 = "<clinit>".equals(var0.method_549());
      var0.method_544();
      class_61 var4 = var0.method_547();
      class_139 var10000 = new class_139;
      var10000.method_601(var4);
      class_139 var12 = var10000;
      class_113.method_443(var10000);
      var12.method_603(var0);
      class_191 var5 = null;
      var5 = var12.method_622();
      Iterator var7 = (new HashSet(var5.method_924())).iterator();

      while(var7.hasNext()) {
         class_191 var6 = (class_191)var7.next();
         var5.method_914(var6);
         var6.method_915(var5);
      }

      class_113.method_447(var12);
      class_163.method_744(var12);
      class_163.method_741(var12);
      if(class_181.method_846("rer")) {
         class_163.method_743(var12);
      }

      if(class_181.method_846("ner")) {
         class_113.method_448(var12);
      }

      class_163.method_742(var12);
      class_113.method_449(var12);
      class_181.method_853().method_812(2, var0.method_551());
      if(class_163.method_745(var12)) {
         class_181.method_859().writeMessage("Heavily obfuscated exception ranges found!", 3);
      }

      class_54 var13 = class_175.method_804(var12);
      if(!class_181.method_846("FINALLY_CATCHALL")) {
         class_189 var10 = new class_189;
         var10.method_896(var1);

         for(class_189 var14 = var10; var14.method_897(var0, var13, var12); var13 = class_175.method_804(var12)) {
            ;
         }
      }

      class_175.method_805(var13);
      class_172.method_787(var13);
      class_156.method_724(var13);
      class_209 var11 = new class_209;
      var11.method_1027();
      var11.method_1028(var13, var2.method_973());

      class_165 var9;
      do {
         class_147 var8 = new class_147;
         var8.method_667();
         var8.method_668(var13, var0);
         var1.method_747(var13);
         var9 = new class_165;
         var9.method_759();
      } while(var9.method_760(var13));

      do {
         do {
            class_211.method_1051(var13);

            do {
               do {
                  class_142.method_643(var13);
               } while(class_126.method_532(var13));
            } while(class_138.method_593(var13));

            class_211.method_1052(var13);
         } while(class_180.method_835(var13));
      } while(!var3 && class_125.method_526(var13));

      class_125.method_530(var13);
      class_127.method_538(var13);
      var1.method_748(var13);
      class_211.method_1062(var13);
      var0.method_545();
      return var13;
   }

   // $FF: renamed from: a () S
   public final class_54 method_146() {
      return this.field_62;
   }

   // $FF: renamed from: b () java.lang.Throwable
   public final Throwable method_147() {
      return this.field_63;
   }
}
