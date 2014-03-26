import de.fernflower.main.extern.IBytecodeProvider;
import de.fernflower.main.extern.IDecompilatSaver;
import java.io.BufferedWriter;
import java.io.StringWriter;
import java.util.HashMap;

// $FF: renamed from: cl
public final class class_161 {

   // $FF: renamed from: a i
   private class_107 field_407;
   // $FF: renamed from: b cG
   private class_136 field_408;


   // $FF: renamed from: <init> (de.fernflower.main.extern.IBytecodeProvider, de.fernflower.main.extern.IDecompilatSaver, java.util.HashMap) void
   public void method_730(IBytecodeProvider var1, IDecompilatSaver var2, HashMap var3) {
      super();
      class_107 var10000 = new class_107;
      class_151 var10004 = new class_151;
      var10004.method_699(var1);
      var10000.method_392(var2, this, var10004);
      class_107 var4 = var10000;
      this.field_407 = var4;
      class_181.method_841(var3);
      class_176 var5 = new class_176;
      var5.method_811();
      class_181.method_854(var5);
   }

   // $FF: renamed from: a () void
   public final void method_731() {
      if(class_181.method_846("ren")) {
         class_149 var10000 = new class_149;
         var10000.method_681();
         var10000.method_682(this.field_407);
      }

      class_136 var10001 = new class_136;
      var10001.method_583(this.field_407);
      this.field_408 = var10001;
      class_181.method_856(this.field_408);
      class_181.method_852(this.field_407);
      this.field_407.method_395();
   }

   // $FF: renamed from: a (bW, java.lang.String) java.lang.String
   public final String method_732(class_198 var1, String var2) {
      if(((class_177)this.field_408.method_588().get(var1.field_528)).field_435 != 0) {
         return null;
      } else if(class_181.method_846("ren")) {
         String var3 = var1.field_528.substring(var1.field_528.lastIndexOf(47) + 1);
         return var2.substring(0, var2.lastIndexOf(47) + 1) + var3 + ".java";
      } else {
         return var2.substring(0, var2.lastIndexOf(".class")) + ".java";
      }
   }

   // $FF: renamed from: b () i
   public final class_107 method_733() {
      return this.field_407;
   }

   // $FF: renamed from: a (bW) java.lang.String
   public final String method_734(class_198 var1) {
      String var2 = null;

      try {
         StringWriter var3 = new StringWriter();
         this.field_408.method_584(var1, new BufferedWriter(var3));
         var2 = var3.toString();
      } catch (ThreadDeath var4) {
         throw var4;
      } catch (Throwable var5) {
         var5.printStackTrace();
         class_181.method_859().writeMessage("Class " + var1.field_528 + " couldn\'t be fully decompiled.", 4);
      }

      return var2;
   }
}
