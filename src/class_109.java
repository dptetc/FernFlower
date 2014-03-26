import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

// $FF: renamed from: v
public final class class_109 {

   // $FF: renamed from: a bW
   private class_198 field_234;
   // $FF: renamed from: b java.util.HashSet
   private HashSet field_235;
   // $FF: renamed from: c cE
   private class_146 field_236;
   // $FF: renamed from: d cE
   private class_146 field_237;
   // $FF: renamed from: e cE
   private class_146 field_238;


   // $FF: renamed from: <init> (bW) void
   public void method_408(class_198 var1) {
      super();
      this.field_235 = new HashSet();
      class_146 var10001 = new class_146;
      var10001.method_653();
      this.field_236 = var10001;
      var10001 = new class_146;
      var10001.method_653();
      this.field_237 = var10001;
      var10001 = new class_146;
      var10001.method_653();
      this.field_238 = var10001;
      this.field_234 = var1;
   }

   // $FF: renamed from: a () void
   public final void method_409() {
      class_181.method_845("CURRENT_CLASS", this.field_234);
      class_181.method_859().startClass(this.field_234.field_528);
      HashSet var1 = new HashSet();
      Iterator var3 = this.field_234.method_977().iterator();

      while(var3.hasNext()) {
         class_168 var2 = (class_168)var3.next();
         var1.add(var2.method_775());
      }

      for(var3 = this.field_234.method_976().iterator(); var3.hasNext(); class_181.method_859().endMethod()) {
         class_128 var21 = (class_128)var3.next();
         class_181.method_859().startMethod(var21.method_549() + " " + var21.method_548());
         class_193 var10000 = new class_193;
         var10000.method_936();
         class_193 var4 = var10000;
         class_181.method_850(var10000);
         class_176 var24 = new class_176;
         var24.method_811();
         class_176 var5 = var24;
         class_181.method_854(var24);
         class_181.method_845("CURRENT_METHOD", var21);
         class_181.method_845("CURRENT_METHOD_DESCRIPTOR", class_197.method_963(var21.method_548()));
         class_164 var25 = new class_164;
         var25.method_746();
         class_164 var6 = var25;
         class_181.method_845("CURRENT_VAR_PROCESSOR", var6);
         Thread var7 = null;
         class_54 var8 = null;
         boolean var9 = false;

         try {
            int var12;
            if((var21.method_550() & 1280) == 0) {
               int var10;
               if((var10 = 10 * Integer.parseInt(class_181.method_844("mpm").toString())) == 0) {
                  var8 = class_57.method_145(var21, var6);
               } else {
                  class_57 var22 = new class_57;
                  var22.method_144(var21, var6, class_181.method_842());
                  class_57 var11 = var22;
                  (var7 = new Thread(var11)).start();
                  var12 = 0;

                  while(var7.isAlive()) {
                     synchronized(var11) {
                        var11.wait(100L);
                     }

                     if(var10 > 0) {
                        ++var12;
                        if(var12 > var10) {
                           class_181.method_859().writeMessage("Processing time limit (" + var10 + " sec.) for method " + var21.method_549() + " " + var21.method_548() + " exceeded, execution interrupted.", 4, 0);
                           var7.stop();
                           var9 = true;
                           break;
                        }
                     }
                  }

                  if(!var9) {
                     if(var11.method_147() != null) {
                        throw var11.method_147();
                     }

                     var8 = var11.method_146();
                  }
               }
            } else {
               boolean var27 = (var21.method_550() & 8) == 0;
               class_197 var26 = class_197.method_963(var21.method_548());
               byte var29 = 0;
               class_77 var10001;
               if(var27) {
                  HashMap var23 = var6.method_757();
                  var10001 = new class_77;
                  var10001.method_214(0, 0);
                  var23.put(var10001, this.field_234.field_528);
                  var29 = 1;
               }

               var12 = var29 + var26.field_519.length;
               int var13 = 0;

               for(int var14 = 0; var14 < var12; ++var14) {
                  var10001 = new class_77;
                  var10001.method_214(var13, 0);
                  var6.method_754(var10001, var4.method_939(var13));
                  if(var27) {
                     if(var14 == 0) {
                        ++var13;
                     } else {
                        var13 += var26.field_519[var14 - 1].field_137;
                     }
                  } else {
                     var13 += var26.field_519[var14].field_137;
                  }
               }
            }
         } catch (ThreadDeath var17) {
            try {
               if(var7 != null) {
                  var7.stop();
               }
            } catch (Throwable var15) {
               ;
            }

            throw var17;
         } catch (Throwable var18) {
            if(class_181.method_859().getShowStacktrace()) {
               var18.printStackTrace();
            }

            class_181.method_859().writeMessage("Method " + var21.method_549() + " " + var21.method_548() + " couldn\'t be decompiled.", 4);
            var9 = true;
         }

         class_120 var20 = new class_120;
         var20.method_494(var8, var6, var21, var5);
         class_120 var28 = var20;
         var20.field_283 = var9;
         this.field_238.method_655(var28, class_129.method_562(var21.method_549(), var21.method_548()));
         class_193 var19 = new class_193;
         var19.method_937(var1);
         var6.method_750(var19);
         class_76 var30;
         if(class_181.method_846("udv") && (var30 = (class_76)var21.method_552().method_659("LocalVariableTable")) != null) {
            var6.method_749(var30.method_213());
         }
      }

      class_181.method_859().endClass();
   }

   // $FF: renamed from: a (java.lang.String, java.lang.String) cX
   public final class_120 method_410(String var1, String var2) {
      return (class_120)this.field_238.method_659(class_129.method_562(var1, var2));
   }

   // $FF: renamed from: b () bW
   public final class_198 method_411() {
      return this.field_234;
   }

   // $FF: renamed from: c () cE
   public final class_146 method_412() {
      return this.field_238;
   }

   // $FF: renamed from: d () java.util.HashSet
   public final HashSet method_413() {
      return this.field_235;
   }

   // $FF: renamed from: e () cE
   public final class_146 method_414() {
      return this.field_236;
   }

   // $FF: renamed from: f () cE
   public final class_146 method_415() {
      return this.field_237;
   }
}
