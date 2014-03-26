import de.fernflower.main.extern.IDecompilatSaver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.jar.Manifest;

// $FF: renamed from: cZ
public final class class_122 {

   // $FF: renamed from: a int
   private int field_286;
   // $FF: renamed from: b java.lang.String
   private String field_287;
   // $FF: renamed from: c java.lang.String
   private String field_288;
   // $FF: renamed from: d java.util.List
   private List field_289;
   // $FF: renamed from: e java.util.List
   private List field_290;
   // $FF: renamed from: f java.util.List
   private List field_291;
   // $FF: renamed from: g java.util.List
   private List field_292;
   // $FF: renamed from: h java.util.jar.Manifest
   private Manifest field_293;
   // $FF: renamed from: i de.fernflower.main.extern.IDecompilatSaver
   private IDecompilatSaver field_294;
   // $FF: renamed from: j cl
   private class_161 field_295;
   // $FF: renamed from: k boolean
   private boolean field_296;


   // $FF: renamed from: <init> (int, java.lang.String, java.lang.String, boolean, de.fernflower.main.extern.IDecompilatSaver, cl) void
   public void method_497(int var1, String var2, String var3, boolean var4, IDecompilatSaver var5, class_161 var6) {
      super();
      this.field_289 = new ArrayList();
      this.field_290 = new ArrayList();
      this.field_291 = new ArrayList();
      this.field_292 = new ArrayList();
      this.field_296 = true;
      this.field_286 = var1;
      this.field_296 = var4;
      this.field_287 = var2;
      this.field_288 = var3;
      this.field_294 = var5;
      this.field_295 = var6;
   }

   // $FF: renamed from: a (bW, java.lang.String) void
   public final void method_498(class_198 var1, String var2) {
      this.field_289.add(var1);
      this.field_290.add(var2);
   }

   // $FF: renamed from: a (java.lang.String) void
   public final void method_499(String var1) {
      this.field_291.add(var1);
   }

   // $FF: renamed from: a (java.lang.String, java.lang.String) void
   public final void method_500(String var1, String var2) {
      this.field_292.add(new String[]{var1, var2});
   }

   // $FF: renamed from: a (cz) void
   public final void method_501(class_151 var1) {
      ArrayList var2 = new ArrayList();
      Iterator var4 = this.field_289.iterator();

      while(var4.hasNext()) {
         class_198 var3;
         String var5 = (var3 = (class_198)var4.next()).field_528;
         class_198 var10000 = new class_198;
         var10000.method_966(var1.method_706(var5), var3.method_979(), var1);
         var3 = var10000;
         var2.add(var3);
         class_200 var6 = var1.method_702(var5);
         var1.method_701(var5);
         var1.method_700(var3.field_528, var6);
      }

      this.field_289 = var2;
   }

   // $FF: renamed from: a () void
   public final void method_502() {
      Iterator var2;
      String var3;
      String var4;
      String[] var5;
      int var6;
      class_198 var7;
      switch(this.field_286) {
      case 0:
         this.field_294.saveFolder(this.field_288);
         var2 = this.field_292.iterator();

         while(var2.hasNext()) {
            var5 = (String[])var2.next();
            this.field_294.copyFile(var5[0], this.field_288, var5[1]);
         }

         for(var6 = 0; var6 < this.field_289.size(); ++var6) {
            var7 = (class_198)this.field_289.get(var6);
            var3 = (String)this.field_290.get(var6);
            if((var3 = this.field_295.method_732(var7, var3)) != null && (var4 = this.field_295.method_734(var7)) != null) {
               this.field_294.saveClassFile(this.field_288, var7.field_528, var3, var4);
            }
         }

         return;
      case 1:
      case 2:
         this.field_294.saveFolder(this.field_287);
         this.field_294.createArchive(this.field_287, this.field_288, this.field_293);
         var2 = this.field_291.iterator();

         while(var2.hasNext()) {
            String var1 = (String)var2.next();
            this.field_294.saveEntry(this.field_287, this.field_288, var1, (String)null);
         }

         var2 = this.field_292.iterator();

         while(var2.hasNext()) {
            var5 = (String[])var2.next();
            if(this.field_286 != 1 || !"META-INF/MANIFEST.MF".equalsIgnoreCase(var5[1])) {
               this.field_294.copyEntry(var5[0], this.field_287, this.field_288, var5[1]);
            }
         }

         for(var6 = 0; var6 < this.field_289.size(); ++var6) {
            var7 = (class_198)this.field_289.get(var6);
            var3 = (String)this.field_290.get(var6);
            if((var3 = this.field_295.method_732(var7, var3)) != null) {
               var4 = this.field_295.method_734(var7);
               this.field_294.saveClassEntry(this.field_287, this.field_288, var7.field_528, var3, var4);
            }
         }

         this.field_294.closeArchive(this.field_287, this.field_288);
      default:
      }
   }

   // $FF: renamed from: a (java.util.jar.Manifest) void
   public final void method_503(Manifest var1) {
      this.field_293 = var1;
   }

   // $FF: renamed from: b () boolean
   public final boolean method_504() {
      return this.field_296;
   }

   // $FF: renamed from: c () java.util.List
   public final List method_505() {
      return this.field_289;
   }
}
