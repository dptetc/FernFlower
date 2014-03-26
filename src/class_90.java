import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

// $FF: renamed from: ax
public final class class_90 extends class_86 {

   // $FF: renamed from: c Q[]
   private static final class_83[] field_164;
   // $FF: renamed from: d java.lang.String[]
   private static final String[] field_165;
   // $FF: renamed from: e int[]
   private static final int[] field_166;
   // $FF: renamed from: f java.util.HashSet
   private static final HashSet field_167;
   // $FF: renamed from: g int
   private int field_168;
   // $FF: renamed from: h Q
   private class_83 field_169;
   // $FF: renamed from: i java.util.List
   private List field_170;


   // $FF: renamed from: <clinit> () void
   static void method_294() {
      field_164 = new class_83[]{class_83.field_120, class_83.field_119, class_83.field_121, class_83.field_118, class_83.field_119, class_83.field_121, class_83.field_118, class_83.field_120, class_83.field_121, class_83.field_118, class_83.field_120, class_83.field_119, class_83.field_122, class_83.field_123, class_83.field_124};
      field_165 = new String[]{" + ", " - ", " * ", " / ", " & ", " | ", " ^ ", " % ", " << ", " >> ", " >>> ", " == ", " != ", " < ", " >= ", " > ", " <= ", " && ", " || ", " + "};
      field_166 = new int[]{3, 3, 2, 2, 7, 9, 8, 2, 4, 4, 4, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 6, 0, 1, 1, 1, 1, 12, -1, -1, -1, -1, -1, 6, 6, 5, 5, 5, 5, 10, 11, 3};
      field_167 = new HashSet((Collection)Arrays.asList(new Integer[]{Integer.valueOf(0), Integer.valueOf(2), Integer.valueOf(4), Integer.valueOf(5), Integer.valueOf(6), Integer.valueOf(48), Integer.valueOf(49), Integer.valueOf(50)}));
   }

   // $FF: renamed from: <init> (int, cb) void
   public void method_295(int var1, class_118 var2) {
      super.method_252();
      this.field_170 = new ArrayList();
      this.field_148 = 6;
      this.field_168 = var1;
      if(var1 >= 11 && var1 <= 35 && var1 != 29 && var1 != 30) {
         this.field_170.add((class_86)var2.method_484());
      } else if(var1 == 36) {
         throw new RuntimeException("no direct instantiation possible");
      } else {
         class_86 var3 = (class_86)var2.method_484();
         this.field_170.add((class_86)var2.method_484());
         this.field_170.add(var3);
      }
   }

   // $FF: renamed from: <init> (int, java.util.List) void
   public void method_296(int var1, List var2) {
      super.method_252();
      this.field_170 = new ArrayList();
      this.field_148 = 6;
      this.field_168 = var1;
      this.field_170 = var2;
   }

   // $FF: renamed from: c () Q
   public final class_83 method_254() {
      class_83 var1 = null;
      if(this.field_168 > 13 && this.field_168 != 34 && this.field_168 != 35 && this.field_168 != 32 && this.field_168 != 33) {
         if(this.field_168 == 29) {
            var1 = ((class_86)this.field_170.get(1)).method_254();
         } else if(this.field_168 == 36) {
            class_86 var5 = (class_86)this.field_170.get(1);
            class_86 var6 = (class_86)this.field_170.get(2);
            class_83 var4 = class_83.method_245(var5.method_254(), var6.method_254());
            if(var5.field_148 == 3 && var6.field_148 == 3 && var4.field_133 != 7 && class_83.field_118.method_242(var4)) {
               var1 = class_83.field_118;
            } else {
               var1 = var4;
            }
         } else if(this.field_168 == 50) {
            var1 = class_83.field_129;
         } else if(this.field_168 >= 42) {
            var1 = class_83.field_125;
         } else if(this.field_168 == 30) {
            var1 = class_83.field_125;
         } else if(this.field_168 >= 31) {
            var1 = class_83.field_118;
         } else {
            var1 = field_164[this.field_168 - 14];
         }
      } else {
         class_83 var2 = ((class_86)this.field_170.get(0)).method_254();
         class_83 var3 = null;
         if(this.field_170.size() > 1) {
            var3 = ((class_86)this.field_170.get(1)).method_254();
         }

         switch(this.field_168) {
         case 0:
         case 1:
         case 2:
         case 3:
         case 7:
            var1 = method_300(new class_83[]{var2, var3});
            break;
         case 4:
         case 5:
         case 6:
            if(var2.field_133 == 7 & var3.field_133 == 7) {
               var1 = class_83.field_125;
            } else {
               var1 = method_300(new class_83[]{var2, var3});
            }
            break;
         case 8:
         case 9:
         case 10:
         case 11:
         case 13:
            var1 = method_300(new class_83[]{var2});
            break;
         case 12:
            var1 = class_83.field_125;
         case 14:
         case 15:
         case 16:
         case 17:
         case 18:
         case 19:
         case 20:
         case 21:
         case 22:
         case 23:
         case 24:
         case 25:
         case 26:
         case 27:
         case 28:
         case 29:
         case 30:
         case 31:
         default:
            break;
         case 32:
         case 33:
         case 34:
         case 35:
            var1 = this.field_169;
         }
      }

      return var1;
   }

   // $FF: renamed from: d_ () int
   public final int method_255() {
      if(this.field_168 >= 32 && this.field_168 <= 35) {
         return 0;
      } else {
         int var1 = 3;

         class_86 var3;
         for(Iterator var2 = this.field_170.iterator(); var2.hasNext(); var1 &= var3.method_255()) {
            var3 = (class_86)var2.next();
         }

         return var1;
      }
   }

   // $FF: renamed from: e () aM
   public final class_178 method_256() {
      class_178 var10000 = new class_178;
      var10000.method_817();
      class_178 var1 = var10000;
      class_86 var2;
      class_83 var3 = (var2 = (class_86)this.field_170.get(0)).method_254();
      class_86 var4 = null;
      class_83 var5 = null;
      if(this.field_170.size() > 1) {
         var5 = (var4 = (class_86)this.field_170.get(1)).method_254();
      }

      switch(this.field_168) {
      case 0:
      case 1:
      case 2:
      case 3:
      case 7:
      case 8:
      case 9:
      case 10:
      case 44:
      case 45:
      case 46:
      case 47:
         var1.method_819(var4, class_83.field_126);
      case 4:
      case 5:
      case 6:
         if(var3.field_133 == 7 && ((var3.field_138 & 1) != 0 || var5.field_133 != 7)) {
            var1.method_819(var2, class_83.field_126);
         }

         if(var5.field_133 == 7 && ((var5.field_138 & 1) != 0 || var3.field_133 != 7)) {
            var1.method_819(var4, class_83.field_126);
         }
         break;
      case 11:
      case 13:
         var1.method_819(var2, class_83.field_126);
      case 12:
      case 17:
      case 18:
      case 19:
      case 20:
      case 21:
      case 22:
      case 23:
      case 24:
      case 25:
      case 29:
      case 30:
      case 31:
      case 37:
      case 38:
      case 39:
      case 40:
      case 41:
      default:
         break;
      case 14:
      case 15:
      case 16:
      case 26:
      case 27:
      case 28:
         var1.method_819(var2, class_83.field_126);
         var1.method_818(var2, class_83.field_118);
         break;
      case 32:
      case 33:
      case 34:
      case 35:
         var1.method_819(var2, this.field_169);
         var1.method_818(var2, this.field_169);
         break;
      case 36:
         if((var3 = this.method_254()) == null) {
            var3 = this.method_254();
         }

         var1.method_819(var2, class_83.field_125);
         var1.method_819(var4, class_83.method_246(var3.field_134));
         var1.method_819((class_86)this.field_170.get(2), class_83.method_246(var3.field_134));
         break;
      case 42:
      case 43:
         if(var3.field_133 == 7 && (var5.method_243(var3) || var2.field_148 == 3 && !((class_87)var2).method_268() && (var4.field_148 != 3 || !((class_87)var4).method_268()))) {
            var1.method_819(var2, class_83.field_126);
         }

         if(var5.field_133 == 7 && (var3.method_243(var5) || var4.field_148 == 3 && !((class_87)var4).method_268() && (var2.field_148 != 3 || !((class_87)var2).method_268()))) {
            var1.method_819(var4, class_83.field_126);
         }
      }

      return var1;
   }

   // $FF: renamed from: b () java.util.List
   public final List method_260() {
      ArrayList var1;
      (var1 = new ArrayList()).addAll(this.field_170);
      return var1;
   }

   // $FF: renamed from: a () aJ
   public final class_86 method_261() {
      ArrayList var1 = new ArrayList();
      Iterator var3 = this.field_170.iterator();

      while(var3.hasNext()) {
         class_86 var2 = (class_86)var3.next();
         var1.add(var2.method_261());
      }

      class_90 var10000 = new class_90;
      var10000.method_296(this.field_168, var1);
      class_90 var4 = var10000;
      var10000.field_169 = this.field_169;
      return var4;
   }

   public final boolean equals(Object var1) {
      if(var1 != null && var1 instanceof class_90) {
         class_90 var2 = (class_90)var1;
         return this.field_168 == var2.field_168 && class_129.method_560(this.field_170, var2.field_170);
      } else {
         return false;
      }
   }

   // $FF: renamed from: a (aJ, aJ) void
   public final void method_263(class_86 var1, class_86 var2) {
      for(int var3 = 0; var3 < this.field_170.size(); ++var3) {
         if(var1 == this.field_170.get(var3)) {
            this.field_170.set(var3, var2);
         }
      }

   }

   // $FF: renamed from: a (int) java.lang.String
   public final String method_262(int var1) {
      if(this.field_168 <= 10) {
         return this.method_299((class_86)this.field_170.get(0), false, var1) + field_165[this.field_168] + this.method_299((class_86)this.field_170.get(1), true, var1);
      } else if(this.field_168 >= 42) {
         return this.method_299((class_86)this.field_170.get(0), false, var1) + field_165[this.field_168 - 42 + 11] + this.method_299((class_86)this.field_170.get(1), true, var1);
      } else {
         switch(this.field_168) {
         case 11:
            return "~" + this.method_299((class_86)this.field_170.get(0), true, var1);
         case 12:
            return "!" + this.method_299((class_86)this.field_170.get(0), true, var1);
         case 13:
            return "-" + this.method_299((class_86)this.field_170.get(0), true, var1);
         case 14:
         case 15:
         case 16:
         case 17:
         case 18:
         case 19:
         case 20:
         case 21:
         case 22:
         case 23:
         case 24:
         case 25:
         case 26:
         case 27:
         case 28:
         default:
            if(this.field_168 <= 28) {
               return "(" + class_209.method_1037(field_164[this.field_168 - 14]) + ")" + this.method_299((class_86)this.field_170.get(0), true, var1);
            }

            throw new RuntimeException("invalid function");
         case 29:
            return "(" + ((class_86)this.field_170.get(1)).method_262(var1) + ")" + this.method_299((class_86)this.field_170.get(0), true, var1);
         case 30:
            return this.method_299((class_86)this.field_170.get(0), true, var1) + " instanceof " + this.method_299((class_86)this.field_170.get(1), true, var1);
         case 31:
            class_86 var2 = (class_86)this.field_170.get(0);
            String var3 = this.method_299(var2, false, var1);
            if(var2.method_254().field_135 == 0) {
               class_83 var4;
               (var4 = class_83.field_131.method_241()).field_135 = 1;
               var3 = "((" + class_209.method_1039(var4) + ")" + var3 + ")";
            }

            return var3 + ".length";
         case 32:
            return this.method_299((class_86)this.field_170.get(0), true, var1) + "--";
         case 33:
            return "--" + this.method_299((class_86)this.field_170.get(0), true, var1);
         case 34:
            return this.method_299((class_86)this.field_170.get(0), true, var1) + "++";
         case 35:
            return "++" + this.method_299((class_86)this.field_170.get(0), true, var1);
         case 36:
            return this.method_299((class_86)this.field_170.get(0), true, var1) + "?" + this.method_299((class_86)this.field_170.get(1), true, var1) + ":" + this.method_299((class_86)this.field_170.get(2), true, var1);
         }
      }
   }

   // $FF: renamed from: c_ () int
   public final int method_253() {
      int var1 = this.field_168;
      return field_166[var1];
   }

   // $FF: renamed from: g () int
   public static int method_297() {
      return field_166[29];
   }

   // $FF: renamed from: h () Q
   public final class_83 method_298() {
      return field_164[this.field_168 - 14];
   }

   // $FF: renamed from: a (aJ, boolean, int) java.lang.String
   private String method_299(class_86 var1, boolean var2, int var3) {
      int var4 = this.method_253();
      int var5;
      boolean var6;
      if(!(var6 = (var5 = var1.method_253()) > var4) && var2 && (var6 = var5 == var4) && var1.field_148 == 6 && ((class_90)var1).field_168 == this.field_168) {
         var6 = !field_167.contains(Integer.valueOf(this.field_168));
      }

      String var7 = var1.method_262(var3);
      if(var6) {
         var7 = "(" + var7 + ")";
      }

      return var7;
   }

   // $FF: renamed from: a (Q[]) Q
   private static class_83 method_300(class_83[] var0) {
      int[] var1 = new int[]{2, 3, 5};
      class_83[] var2 = new class_83[]{class_83.field_121, class_83.field_119, class_83.field_120};

      for(int var3 = 0; var3 < var1.length; ++var3) {
         for(int var4 = 0; var4 < var0.length; ++var4) {
            if(var0[var4].field_133 == var1[var3]) {
               return var2[var3];
            }
         }
      }

      return class_83.field_118;
   }

   // $FF: renamed from: i () int
   public final int method_301() {
      return this.field_168;
   }

   // $FF: renamed from: b (int) void
   public final void method_302(int var1) {
      this.field_168 = var1;
   }

   // $FF: renamed from: j () java.util.List
   public final List method_303() {
      return this.field_170;
   }

   // $FF: renamed from: a (Q) void
   public final void method_304(class_83 var1) {
      this.field_169 = var1;
   }
}
