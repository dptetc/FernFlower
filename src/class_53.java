import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

// $FF: renamed from: R
public final class class_53 extends class_46 {

   // $FF: renamed from: a java.util.List
   private List field_42;
   // $FF: renamed from: b java.util.List
   private List field_43;
   // $FF: renamed from: k java.util.List
   private List field_44;
   // $FF: renamed from: l cV
   private class_124 field_45;
   // $FF: renamed from: m java.util.List
   private List field_46;


   // $FF: renamed from: <init> () void
   private void method_114() {
      super.method_23();
      this.field_42 = new ArrayList();
      this.field_43 = new ArrayList();
      this.field_44 = new ArrayList();
      this.field_46 = new ArrayList();
      this.field_13 = 6;
      this.field_46.add((Object)null);
   }

   // $FF: renamed from: <init> (ca, ca) void
   private void method_115(class_46 var1, class_46 var2) {
      this.method_114();
      this.field_21 = var1;
      this.field_19.method_655(var1, var1.field_14);
      HashSet var3 = new HashSet(var1.method_55(1, 1));
      if(var2 != null) {
         this.field_26 = var2;
         var3.remove(this.field_26);
      }

      this.field_45 = (class_124)var1.method_57(1073741824).get(0);
      Iterator var4 = var3.iterator();

      while(var4.hasNext()) {
         var1 = (class_46)var4.next();
         this.field_19.method_655(var1, var1.field_14);
      }

   }

   // $FF: renamed from: a (ca) ca
   public static class_46 method_116(class_46 var0) {
      if(var0.field_13 == 8 && var0.method_64() == 1) {
         ArrayList var1 = new ArrayList();
         if(class_150.method_696(var0, var1)) {
            class_46 var2 = (class_46)var1.remove(0);
            Iterator var3 = var1.iterator();

            while(var3.hasNext()) {
               if(((class_46)var3.next()).method_67()) {
                  return null;
               }
            }

            if(class_150.method_695(var1)) {
               class_53 var10000 = new class_53;
               var10000.method_115(var0, var2);
               return var10000;
            }
         }
      }

      return null;
   }

   // $FF: renamed from: a (int) java.lang.String
   public final String method_43(int var1) {
      String var2 = class_129.method_557(var1);
      StringBuilder var3;
      (var3 = new StringBuilder()).append(class_209.method_1043(this.field_24, var1));
      var3.append(this.field_21.method_43(var1));
      if(this.method_69()) {
         var3.append(var2 + "label" + this.field_14 + ":\r\n");
      }

      var3.append(var2 + ((class_86)this.field_46.get(0)).method_262(var1) + " {\r\n");

      for(int var4 = 0; var4 < this.field_42.size(); ++var4) {
         class_46 var5 = (class_46)this.field_42.get(var4);
         List var6 = (List)this.field_43.get(var4);
         List var7 = (List)this.field_44.get(var4);

         for(int var8 = 0; var8 < var6.size(); ++var8) {
            if(var6.get(var8) == this.field_45) {
               var3.append(var2 + "default:\r\n");
            } else {
               var3.append(var2 + "case " + ((class_87)var7.get(var8)).method_262(var1) + ":\r\n");
            }
         }

         var3.append(class_209.method_1041(var5, var1 + 1, false));
      }

      var3.append(var2 + "}\r\n");
      return var3.toString();
   }

   // $FF: renamed from: e_ () void
   public final void method_45() {
      class_91 var1;
      (var1 = (class_91)this.field_21.method_75().remove(this.field_21.method_75().size() - 1)).method_306(this.field_44);
      this.field_46.set(0, var1);
   }

   // $FF: renamed from: d () java.util.List
   public final List method_44() {
      ArrayList var1;
      (var1 = new ArrayList(this.field_19)).add(1, this.field_46.get(0));
      return var1;
   }

   // $FF: renamed from: a (aJ, aJ) void
   public final void method_46(class_86 var1, class_86 var2) {
      if(this.field_46.get(0) == var1) {
         this.field_46.set(0, var2);
      }

   }

   // $FF: renamed from: a (ca, ca) void
   public final void method_49(class_46 var1, class_46 var2) {
      for(int var3 = 0; var3 < this.field_42.size(); ++var3) {
         if(this.field_42.get(var3) == var1) {
            this.field_42.set(var3, var2);
         }
      }

      super.method_49(var1, var2);
   }

   // $FF: renamed from: a () ca
   public final class_46 method_47() {
      class_53 var10000 = new class_53;
      var10000.method_114();
      return var10000;
   }

   // $FF: renamed from: b () void
   public final void method_48() {
      this.field_21 = (class_46)this.field_19.get(0);
      this.field_45 = (class_124)this.field_21.method_57(1073741824).get(0);
      this.method_117();
   }

   // $FF: renamed from: e () void
   public final void method_117() {
      HashMap var1 = new HashMap();
      List var2 = this.field_21.method_57(1073741824);

      for(int var3 = 0; var3 < var2.size(); ++var3) {
         var1.put((class_124)var2.get(var3), Integer.valueOf(var3 == 0?var2.size():var3));
      }

      class_48 var10000 = (class_48)this.field_21;
      ArrayList var16 = null;
      int[] var13 = ((class_29)var10000.method_94().method_912()).method_22();
      var16 = new ArrayList();
      ArrayList var4 = new ArrayList();

      ArrayList var7;
      Iterator var9;
      for(int var5 = 1; var5 < this.field_19.size(); ++var5) {
         class_46 var6 = (class_46)this.field_19.get(var5);
         var7 = new ArrayList();
         var9 = var6.method_58(1).iterator();

         while(var9.hasNext()) {
            class_124 var8;
            if((var8 = (class_124)var9.next()).method_520() == this.field_21) {
               var7.add((Integer)var1.get(var8));
            }
         }

         Collections.sort(var7);
         var16.add(var6);
         var4.add(var7);
      }

      List var18 = this.field_21.method_57(12);

      int var25;
      while(!var18.isEmpty()) {
         class_124 var20 = (class_124)var18.get(0);
         var7 = new ArrayList();

         for(var25 = var18.size() - 1; var25 >= 0; --var25) {
            class_124 var26;
            if((var26 = (class_124)var18.get(var25)).method_522() == var20.method_522() && var26.method_518() == var20.method_518()) {
               var7.add((Integer)var1.get(var26));
               var18.remove(var25);
            }
         }

         Collections.sort(var7);
         var16.add((Object)null);
         var4.add(var7);
      }

      int var19;
      for(var19 = 0; var19 < var4.size() - 1; ++var19) {
         for(int var22 = var4.size() - 1; var22 > var19; --var22) {
            if(((Integer)((List)var4.get(var22 - 1)).get(0)).intValue() > ((Integer)((List)var4.get(var22)).get(0)).intValue()) {
               var4.set(var22, (List)var4.set(var22 - 1, (List)var4.get(var22)));
               var16.set(var22, (class_46)var16.set(var22 - 1, (class_46)var16.get(var22)));
            }
         }
      }

      for(var19 = 0; var19 < var16.size(); ++var19) {
         class_46 var24;
         if((var24 = (class_46)var16.get(var19)) != null) {
            HashSet var28;
            (var28 = new HashSet(var24.method_55(1, 0))).remove(this.field_21);
            if(!var28.isEmpty()) {
               class_46 var29 = (class_46)var28.iterator().next();

               for(int var11 = var19 + 1; var11 < var16.size(); ++var11) {
                  if(var16.get(var11) == var29) {
                     var16.add(var11 + 1, var24);
                     var4.add(var11 + 1, (List)var4.get(var19));
                     var16.remove(var19);
                     var4.remove(var19);
                     --var19;
                     break;
                  }
               }
            }
         }
      }

      ArrayList var23 = new ArrayList();
      var7 = new ArrayList();
      var9 = var4.iterator();

      while(var9.hasNext()) {
         List var27 = (List)var9.next();
         ArrayList var12 = new ArrayList();
         var4 = new ArrayList();
         var18 = this.field_21.method_57(1073741824);

         class_87 var10001;
         for(Iterator var10 = var27.iterator(); var10.hasNext(); var4.add(var10001)) {
            Integer var30;
            var25 = (var30 = (Integer)var10.next()).intValue() == var18.size()?0:var30.intValue();
            var12.add((class_124)var18.get(var25));
            if(var25 == 0) {
               var10001 = null;
            } else {
               var10001 = new class_87;
               var10001.method_265(var13[var25 - 1], false);
            }
         }

         var23.add(var12);
         var7.add(var4);
      }

      for(var25 = 0; var25 < var16.size(); ++var25) {
         if(var16.get(var25) == null) {
            var10000 = new class_48;
            class_191 var10002 = new class_191;
            var10002.method_910(class_181.method_853().method_814(0));
            var10000.method_93(var10002);
            class_48 var31 = var10000;
            class_124 var14 = (class_124)((List)var23.get(var25)).get(0);
            class_124 var15 = new class_124;
            var15.method_515(var14.method_518(), var31, var14.method_522(), var14.field_303);
            var31.method_34(var15);
            Iterator var21 = ((List)var23.get(var25)).iterator();

            while(var21.hasNext()) {
               class_124 var17;
               (var17 = (class_124)var21.next()).method_520().method_53(1, var17, 1);
               var17.field_303.method_73().remove(var17);
               var17.method_522().method_33(var17);
               var17.method_520().method_52(1, var17, var31);
               var31.method_32(var17);
            }

            var16.set(var25, var31);
            this.field_19.method_655(var31, var31.field_14);
            var31.method_72(this);
         }
      }

      this.field_42 = var16;
      this.field_43 = var23;
      this.field_44 = var7;
   }

   // $FF: renamed from: f () java.util.List
   public final List method_118() {
      return this.field_46;
   }

   // $FF: renamed from: g () java.util.List
   public final List method_119() {
      return this.field_43;
   }

   // $FF: renamed from: h () java.util.List
   public final List method_120() {
      return this.field_42;
   }

   // $FF: renamed from: i () cV
   public final class_124 method_121() {
      return this.field_45;
   }
}
