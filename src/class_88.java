import java.io.BufferedWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

// $FF: renamed from: aa
public final class class_88 extends class_86 {

   // $FF: renamed from: c int
   private int field_154;
   // $FF: renamed from: d Q
   private class_83 field_155;
   // $FF: renamed from: e boolean
   private boolean field_156;
   // $FF: renamed from: f ce
   private class_164 field_157;
   // $FF: renamed from: g int
   private int field_158;
   // $FF: renamed from: h boolean
   private boolean field_159;
   // $FF: renamed from: i boolean
   private boolean field_160;


   // $FF: renamed from: <init> (int, Q, ce) void
   public void method_276(int var1, class_83 var2, class_164 var3) {
      super.method_252();
      this.field_156 = false;
      this.field_158 = 0;
      this.field_159 = false;
      this.field_160 = false;
      this.field_148 = 12;
      this.field_154 = var1;
      this.field_155 = var2;
      this.field_157 = var3;
   }

   // $FF: renamed from: c () Q
   public final class_83 method_254() {
      return this.method_279();
   }

   // $FF: renamed from: d_ () int
   public final int method_255() {
      return 3;
   }

   // $FF: renamed from: b () java.util.List
   public final List method_260() {
      return new ArrayList();
   }

   // $FF: renamed from: a () aJ
   public final class_86 method_261() {
      class_88 var10000 = new class_88;
      var10000.method_276(this.field_154, this.method_279(), this.field_157);
      class_88 var1 = var10000;
      var10000.field_156 = this.field_156;
      var1.field_158 = this.field_158;
      var1.field_159 = this.field_159;
      var1.field_160 = this.field_160;
      return var1;
   }

   // $FF: renamed from: a (int) java.lang.String
   public final String method_262(int var1) {
      if(this.field_159) {
         class_177 var7 = (class_177)class_181.method_855().method_588().get(this.field_155.field_136);
         StringWriter var8 = new StringWriter();
         BufferedWriter var6 = new BufferedWriter(var8);
         class_194 var9 = new class_194;
         var9.method_942();
         class_194 var4 = var9;

         try {
            var4.method_943(var7, var6, var1);
            var6.flush();
         } catch (IOException var5) {
            throw new RuntimeException(var5);
         }

         return var8.toString();
      } else {
         String var2 = null;
         class_77 var10001;
         class_164 var10000;
         if(this.field_157 != null) {
            var10000 = this.field_157;
            var10001 = new class_77;
            var10001.method_214(this.field_154, this.field_158);
            var2 = var10000.method_753(var10001);
         }

         StringBuilder var3 = new StringBuilder();
         if(this.field_156) {
            if(this.field_157 != null) {
               var10000 = this.field_157;
               var10001 = new class_77;
               var10001.method_214(this.field_154, this.field_158);
               if(var10000.method_755(var10001) == 2) {
                  var3.append("final ");
               }
            }

            var3.append(class_209.method_1039(this.method_279()) + " ");
         }

         var3.append(var2 == null?"var" + this.field_154 + (this.field_158 == 0?"":"_" + this.field_158):var2);
         return var3.toString();
      }
   }

   public final boolean equals(Object var1) {
      if(var1 != null && var1 instanceof class_88) {
         class_88 var2 = (class_88)var1;
         return this.field_154 == var2.field_154 && this.field_158 == var2.field_158 && class_129.method_558(this.method_279(), var2.method_279());
      } else {
         return false;
      }
   }

   // $FF: renamed from: f () int
   public final int method_277() {
      return this.field_154;
   }

   // $FF: renamed from: b (int) void
   public final void method_278(int var1) {
      this.field_154 = var1;
   }

   // $FF: renamed from: g () Q
   public final class_83 method_279() {
      class_83 var1 = null;
      if(this.field_157 != null) {
         class_164 var10000 = this.field_157;
         class_77 var10001 = new class_77;
         var10001.method_214(this.field_154, this.field_158);
         var1 = var10000.method_751(var10001);
      }

      if(var1 == null || this.field_155 != null && this.field_155.field_133 != 17) {
         var1 = this.field_155;
      }

      return var1 == null?class_83.field_117:var1;
   }

   // $FF: renamed from: a (Q) void
   public final void method_280(class_83 var1) {
      this.field_155 = var1;
   }

   // $FF: renamed from: h () boolean
   public final boolean method_281() {
      return this.field_156;
   }

   // $FF: renamed from: i () void
   public final void method_282() {
      this.field_156 = true;
   }

   // $FF: renamed from: j () ce
   public final class_164 method_283() {
      return this.field_157;
   }

   // $FF: renamed from: k () int
   public final int method_284() {
      return this.field_158;
   }

   // $FF: renamed from: c (int) void
   public final void method_285(int var1) {
      this.field_158 = var1;
   }

   // $FF: renamed from: l () boolean
   public final boolean method_286() {
      return this.field_159;
   }

   // $FF: renamed from: m () void
   public final void method_287() {
      this.field_159 = true;
   }

   // $FF: renamed from: n () boolean
   public final boolean method_288() {
      return this.field_160;
   }

   // $FF: renamed from: o () void
   public final void method_289() {
      this.field_160 = true;
   }
}
