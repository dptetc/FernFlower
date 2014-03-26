import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// $FF: renamed from: G
public final class class_55 extends class_46 {

   // $FF: renamed from: a int
   public static int field_48;
   // $FF: renamed from: b int
   public int field_49;
   // $FF: renamed from: k ca
   private class_46 field_50;
   // $FF: renamed from: l ca
   private class_46 field_51;
   // $FF: renamed from: m cV
   private class_124 field_52;
   // $FF: renamed from: n cV
   private class_124 field_53;
   // $FF: renamed from: o boolean
   private boolean field_54;
   // $FF: renamed from: p boolean
   private boolean field_55;
   // $FF: renamed from: q java.util.List
   private List field_56;


   // $FF: renamed from: <clinit> () void
   static void method_124() {
      field_48 = 1;
   }

   // $FF: renamed from: <init> () void
   private void method_125() {
      super.method_23();
      this.field_54 = false;
      this.field_56 = new ArrayList();
      this.field_13 = 2;
      this.field_56.add((Object)null);
   }

   // $FF: renamed from: <init> (ca, int, ca) void
   private void method_126(class_46 var1, int var2, class_46 var3) {
      this.method_125();
      this.field_21 = var1;
      this.field_19.method_655(var1, var1.field_14);
      List var4 = var1.method_57(1073741824);
      class_124 var7;
      switch(var2) {
      case 0:
         this.field_50 = null;
         this.field_51 = null;
         break;
      case 1:
         this.field_50 = null;
         this.field_51 = null;
         if((var7 = (class_124)var4.get(1)).method_518() != 1) {
            this.field_26 = ((class_124)var4.get(0)).method_522();
         } else {
            this.field_26 = var7.method_522();
            this.field_54 = true;
         }
         break;
      case 2:
         this.field_51 = ((class_124)var4.get(0)).method_522();
         this.field_50 = ((class_124)var4.get(1)).method_522();
         List var5 = this.field_50.method_57(1);
         List var6 = this.field_51.method_57(1);
         if(this.field_50.method_58(1).size() <= 1 && var5.size() <= 1) {
            if(this.field_51.method_58(1).size() <= 1 && var6.size() <= 1) {
               if(var5.size() == 0) {
                  this.field_26 = this.field_51;
               } else if(var6.size() == 0) {
                  this.field_26 = this.field_50;
               }
            } else {
               this.field_26 = this.field_51;
            }
         } else {
            this.field_26 = this.field_50;
         }

         if(this.field_50 == this.field_26) {
            if(this.field_51 != this.field_26) {
               this.field_50 = this.field_51;
               this.field_54 = true;
            } else {
               this.field_50 = null;
            }

            this.field_51 = null;
         } else if(this.field_51 == this.field_26) {
            this.field_51 = null;
         } else {
            this.field_26 = var3;
         }

         if(this.field_51 == null) {
            var2 = 1;
         }
      }

      this.field_52 = (class_124)var4.get(this.field_54?0:1);
      this.field_53 = var2 == 2?(class_124)var4.get(this.field_54?1:0):null;
      this.field_49 = var2 == 2?field_48:0;
      if(this.field_49 == 0) {
         if(var2 == 0) {
            var7 = (class_124)var4.get(0);
            var1.method_35(var7);
            var7.method_521(this);
            this.method_34(var7);
         } else if(var2 == 1) {
            var7 = (class_124)var4.get(this.field_54?1:0);
            var1.method_35(var7);
         }
      }

      if(this.field_50 != null) {
         this.field_19.method_655(this.field_50, this.field_50.field_14);
      }

      if(this.field_51 != null) {
         this.field_19.method_655(this.field_51, this.field_51.field_14);
      }

      if(this.field_26 == var1) {
         this.field_26 = this;
      }

   }

   // $FF: renamed from: a (ca) ca
   public static class_46 method_127(class_46 var0) {
      if(var0.field_13 == 8 && var0.method_64() == 0) {
         int var1 = var0.method_57(1).size();
         class_46 var2 = null;
         boolean var3;
         if(!(var3 = var1 < 2)) {
            ArrayList var4 = new ArrayList();
            if(class_150.method_696(var0, var4)) {
               var2 = (class_46)var4.remove(0);
               Iterator var5 = var4.iterator();

               while(var5.hasNext()) {
                  class_46 var10000 = (class_46)var5.next();
                  Object var6 = null;
                  if(var10000.method_67()) {
                     return null;
                  }
               }

               var3 = class_150.method_695(var4);
            }
         }

         if(var3) {
            class_55 var7 = new class_55;
            var7.method_126(var0, var1, var2);
            return var7;
         }
      }

      return null;
   }

   // $FF: renamed from: a (int) java.lang.String
   public final String method_43(int var1) {
      String var2 = class_129.method_557(var1);
      StringBuffer var3;
      (var3 = new StringBuffer()).append(class_209.method_1043(this.field_24, var1));
      var3.append(this.field_21.method_43(var1));
      if(this.method_69()) {
         var3.append(var2 + "label" + this.field_14 + ":\r\n");
      }

      var3.append(var2 + ((class_86)this.field_56.get(0)).method_262(var1) + " {\r\n");
      if(this.field_50 == null) {
         var3.append(class_129.method_557(var1 + 1));
         if(this.field_52.field_305) {
            if(this.field_52.method_518() == 4) {
               var3.append("break");
            } else {
               var3.append("continue");
            }

            if(this.field_52.field_304) {
               var3.append(" label" + this.field_52.field_303.field_14);
            }
         }

         var3.append(";\r\n");
      } else {
         var3.append(class_209.method_1041(this.field_50, var1 + 1, true));
      }

      boolean var4 = false;
      if(this.field_51 != null) {
         String var5;
         if(this.field_51.field_13 == 2 && this.field_51.field_24.isEmpty() && this.field_51.method_61().method_75().isEmpty() && !this.field_51.method_69() && (this.field_51.method_57(1073741824).isEmpty() || !((class_124)this.field_51.method_57(1073741824).get(0)).field_305)) {
            var5 = class_209.method_1041(this.field_51, var1, false).substring(var2.length());
            var3.append(var2 + "} else ");
            var3.append(var5);
            var4 = true;
         } else if((var5 = class_209.method_1041(this.field_51, var1 + 1, false)).length() > 0) {
            var3.append(var2 + "} else {\r\n");
            var3.append(var5);
         }
      }

      if(!var4) {
         var3.append(var2 + "}\r\n");
      }

      return var3.toString();
   }

   // $FF: renamed from: e_ () void
   public final void method_45() {
      class_99 var1 = (class_99)this.field_21.method_75().remove(this.field_21.method_75().size() - 1);
      if(this.field_54) {
         (var1 = (class_99)var1.method_261()).method_363();
      }

      this.field_56.set(0, var1);
   }

   // $FF: renamed from: d () java.util.List
   public final List method_44() {
      ArrayList var1;
      (var1 = new ArrayList(this.field_19)).add(1, this.field_56.get(0));
      return var1;
   }

   // $FF: renamed from: a (aJ, aJ) void
   public final void method_46(class_86 var1, class_86 var2) {
      if(this.field_56.get(0) == var1) {
         this.field_56.set(0, var2);
      }

   }

   // $FF: renamed from: a (ca, ca) void
   public final void method_49(class_46 var1, class_46 var2) {
      super.method_49(var1, var2);
      if(this.field_50 == var1) {
         this.field_50 = var2;
      }

      if(this.field_51 == var1) {
         this.field_51 = var2;
      }

      List var3 = this.field_21.method_57(1073741824);
      if(this.field_49 == 0) {
         this.field_52 = (class_124)var3.get(0);
         this.field_53 = null;
      } else {
         class_124 var5 = (class_124)var3.get(0);
         class_124 var4 = (class_124)var3.get(1);
         if(var5.method_522() == this.field_50) {
            this.field_52 = var5;
            this.field_53 = var4;
         } else {
            this.field_52 = var4;
            this.field_53 = var5;
         }
      }
   }

   // $FF: renamed from: a () ca
   public final class_46 method_47() {
      class_55 var10000 = new class_55;
      var10000.method_125();
      class_55 var1 = var10000;
      var10000.field_49 = this.field_49;
      var1.field_54 = this.field_54;
      var1.field_55 = this.field_55;
      return var1;
   }

   // $FF: renamed from: b () void
   public final void method_48() {
      this.field_21 = (class_46)this.field_19.get(0);
      List var1 = this.field_21.method_57(1073741824);
      this.field_52 = (class_124)var1.get(this.field_49 != 0 && !this.field_54?1:0);
      if(this.field_19.size() > 1) {
         this.field_50 = (class_46)this.field_19.get(1);
      }

      if(this.field_49 == field_48) {
         this.field_53 = (class_124)var1.get(this.field_54?1:0);
         this.field_51 = (class_46)this.field_19.get(2);
      }

   }

   // $FF: renamed from: e () ca
   public final class_46 method_128() {
      return this.field_51;
   }

   // $FF: renamed from: b (ca) void
   public final void method_129(class_46 var1) {
      this.field_51 = var1;
   }

   // $FF: renamed from: f () ca
   public final class_46 method_130() {
      return this.field_50;
   }

   // $FF: renamed from: c (ca) void
   public final void method_131(class_46 var1) {
      this.field_50 = var1;
   }

   // $FF: renamed from: g () boolean
   public final boolean method_132() {
      return this.field_54;
   }

   // $FF: renamed from: a (boolean) void
   public final void method_133(boolean var1) {
      this.field_54 = var1;
   }

   // $FF: renamed from: h () java.util.List
   public final List method_134() {
      return this.field_56;
   }

   // $FF: renamed from: i () o
   public final class_99 method_135() {
      return (class_99)this.field_56.get(0);
   }

   // $FF: renamed from: a (cV) void
   public final void method_136(class_124 var1) {
      this.field_53 = var1;
   }

   // $FF: renamed from: b (cV) void
   public final void method_137(class_124 var1) {
      this.field_52 = var1;
   }

   // $FF: renamed from: j () cV
   public final class_124 method_138() {
      return this.field_52;
   }

   // $FF: renamed from: k () cV
   public final class_124 method_139() {
      return this.field_53;
   }
}
