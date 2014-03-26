import de.fernflower.main.extern.IDecompilatSaver;
import java.io.File;
import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.jar.JarFile;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

// $FF: renamed from: i
public final class class_107 {

   // $FF: renamed from: a cz
   private class_151 field_222;
   // $FF: renamed from: b java.util.HashMap
   private HashMap field_223;
   // $FF: renamed from: c java.util.HashMap
   private HashMap field_224;
   // $FF: renamed from: d cZ
   private class_122 field_225;
   // $FF: renamed from: e de.fernflower.main.extern.IDecompilatSaver
   private IDecompilatSaver field_226;
   // $FF: renamed from: f cl
   private class_161 field_227;


   // $FF: renamed from: <init> (de.fernflower.main.extern.IDecompilatSaver, cl, cz) void
   public void method_392(IDecompilatSaver var1, class_161 var2, class_151 var3) {
      super();
      this.field_223 = new HashMap();
      this.field_224 = new HashMap();
      this.field_226 = var1;
      this.field_227 = var2;
      this.field_222 = var3;
      class_122 var10001 = new class_122;
      var10001.method_497(0, (String)null, "", true, var1, var2);
      this.field_225 = var10001;
      this.field_224.put("", this.field_225);
   }

   // $FF: renamed from: a (java.lang.String) bW
   public final class_198 method_393(String var1) {
      return (class_198)this.field_223.get(var1);
   }

   // $FF: renamed from: a () void
   public final void method_394() {
      Iterator var2 = this.field_224.values().iterator();

      while(var2.hasNext()) {
         class_122 var1;
         Iterator var4 = (var1 = (class_122)var2.next()).method_505().iterator();

         class_198 var3;
         while(var4.hasNext()) {
            var3 = (class_198)var4.next();
            this.field_223.remove(var3.field_528);
         }

         var1.method_501(this.field_222);
         var4 = var1.method_505().iterator();

         while(var4.hasNext()) {
            var3 = (class_198)var4.next();
            this.field_223.put(var3.field_528, var3);
         }
      }

   }

   // $FF: renamed from: b () void
   public final void method_395() {
      Iterator var1 = this.field_224.values().iterator();

      while(var1.hasNext()) {
         class_122 var2;
         if((var2 = (class_122)var1.next()).method_504()) {
            var2.method_502();
         }
      }

   }

   // $FF: renamed from: a (java.io.File, boolean) void
   public final void method_396(File var1, boolean var2) {
      this.method_397("", var1, var2);
   }

   // $FF: renamed from: a (java.lang.String, java.io.File, boolean) void
   private void method_397(String var1, File var2, boolean var3) {
      if(var2.isDirectory()) {
         File[] var12 = var2.listFiles();
         var1 = var1 + "/" + (var1.length() == 0?"":var2.getName());

         for(int var14 = var12.length - 1; var14 >= 0; --var14) {
            this.method_397(var1, var12[var14], var3);
         }

      } else {
         String var4 = var2.getName();
         boolean var5 = false;

         try {
            if(var4.endsWith(".jar")) {
               this.method_398(var1, var2, 1, var3);
               var5 = true;
            } else if(var4.endsWith(".zip")) {
               this.method_398(var1, var2, 2, var3);
               var5 = true;
            }
         } catch (IOException var8) {
            class_181.method_859().writeMessage("Archive file or some parts of its content invalid: " + (var1.length() > 0?var1 + "/":"") + var4, 4);
         }

         if(!var5) {
            class_122 var13;
            if((var13 = (class_122)this.field_224.get(var1)) == null) {
               class_122 var10000 = new class_122;
               var10000.method_497(0, (String)null, var1, var3, this.field_226, this.field_227);
               var13 = var10000;
               this.field_224.put(var1, var13);
            }

            boolean var6 = false;
            if(var4.endsWith(".class")) {
               try {
                  class_198 var10 = new class_198;
                  var10.method_966(this.field_222.method_705(var2.getAbsolutePath(), (String)null), var3, this.field_222);
                  class_198 var9 = var10;
                  this.field_223.put(var9.field_528, var9);
                  var13.method_498(var9, var4);
                  class_151 var11 = this.field_222;
                  String var10001 = var9.field_528;
                  class_200 var10002 = new class_200;
                  var10002.method_984(var2.getAbsolutePath(), (String)null);
                  var11.method_700(var10001, var10002);
                  var6 = true;
               } catch (IOException var7) {
                  class_181.method_859().writeMessage("Invalid class file: " + (var1.length() > 0?var1 + "/":"") + var4, 4);
               }
            }

            if(!var6) {
               var13.method_500(var2.getAbsolutePath(), var4);
            }
         }

      }
   }

   // $FF: renamed from: a (java.lang.String, java.io.File, int, boolean) void
   private void method_398(String var1, File var2, int var3, boolean var4) {
      Object var5;
      if(var3 == 1) {
         var5 = new JarFile(var2);
      } else {
         var5 = new ZipFile(var2);
      }

      Enumeration var6 = ((ZipFile)var5).entries();

      while(var6.hasMoreElements()) {
         ZipEntry var7 = (ZipEntry)var6.nextElement();
         class_122 var8;
         if((var8 = (class_122)this.field_224.get(var1 + "/" + var2.getName())) == null) {
            class_122 var10000 = new class_122;
            var10000.method_497(var3, var1, var2.getName(), var4, this.field_226, this.field_227);
            var8 = var10000;
            if(var3 == 1) {
               var8.method_503(((JarFile)var5).getManifest());
            }

            this.field_224.put(var1 + "/" + var2.getName(), var8);
         }

         String var9 = var7.getName();
         if(!var7.isDirectory()) {
            if(var9.endsWith(".class")) {
               class_198 var10 = new class_198;
               var10.method_965(((ZipFile)var5).getInputStream(var7), var4, this.field_222);
               class_198 var12 = var10;
               this.field_223.put(var12.field_528, var12);
               var8.method_498(var12, var9);
               if(this.field_222 != null) {
                  class_151 var11 = this.field_222;
                  String var10001 = var12.field_528;
                  class_200 var10002 = new class_200;
                  var10002.method_984(var2.getAbsolutePath(), var9);
                  var11.method_700(var10001, var10002);
               }
            } else {
               var8.method_500(var2.getAbsolutePath(), var9);
            }
         } else if(var7.isDirectory()) {
            var8.method_499(var9);
         }
      }

   }

   // $FF: renamed from: c () java.util.HashMap
   public final HashMap method_399() {
      return this.field_223;
   }
}
