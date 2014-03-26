import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// $FF: renamed from: bt
public final class class_125 {

   // $FF: renamed from: <init> () void
   public void method_525() {
      super();
   }

   // $FF: renamed from: a (S) boolean
   public static boolean method_526(class_54 var0) {
      int var1;
      if((var1 = method_528(var0)) > 0) {
         method_527(var0);
         class_172.method_787(var0);
      }

      return var1 > 0;
   }

   // $FF: renamed from: a (ca) void
   private static void method_527(class_46 var0) {
      boolean var1;
      do {
         var1 = false;

         for(int var2 = 0; var2 < var0.method_63().size(); ++var2) {
            class_46 var3;
            method_527(var3 = (class_46)var0.method_63().get(var2));
            if(var3.field_13 == 15 && var3.method_63().size() > 1) {
               class_46 var4 = (class_46)var3.method_63().method_661();
               var3 = (class_46)var3.method_63().get(var3.method_63().size() - 2);
               if((var4.method_75() == null || !var4.method_75().isEmpty()) && !var3.method_70()) {
                  Set var5;
                  (var5 = var4.method_56(1073741824, 0)).remove(var3);
                  if(var5.isEmpty()) {
                     var4.method_76(new ArrayList());
                     var1 = true;
                     break;
                  }
               }
            }
         }
      } while(var1);

   }

   // $FF: renamed from: b (ca) int
   private static int method_528(class_46 var0) {
      byte var1 = 0;
      class_46 var2 = null;
      class_124 var4;
      class_124 var6;
      class_48 var9;
      class_124 var11;
      class_48 var14;
      class_191 var10002;
      if(var0.method_75() == null) {
         int var3;
         do {
            var3 = 0;
            Iterator var5 = var0.method_63().iterator();

            while(var5.hasNext()) {
               class_46 var10000 = (class_46)var5.next();
               var4 = null;
               if((var3 = method_528(var10000)) > 0) {
                  var1 = 1;
                  break;
               }
            }
         } while(var3 != 0);

         switch(var0.field_13) {
         case 2:
            class_55 var10;
            if((var10 = (class_55)var0).method_130() == null && (var2 = method_529(var4 = var10.method_138())) != null) {
               var9 = new class_48;
               var10002 = new class_191;
               var10002.method_910(class_181.method_853().method_814(0));
               var9.method_93(var10002);
               var14 = var9;
               var9.method_76(class_150.method_698(var2.method_75()));
               var10.method_61().method_35(var4);
               var11 = new class_124;
               var11.method_516(1, var10.method_61(), var14);
               var6 = var11;
               var10.method_61().method_34(var6);
               var10.method_137(var6);
               var10.method_131(var14);
               var10.method_63().method_655(var14, var14.field_14);
               var14.method_72(var10);
               var4 = (class_124)var2.method_59().get(0);
               var11 = new class_124;
               var11.method_516(4, var14, var4.method_522());
               var6 = var11;
               var14.method_34(var6);
               var4.field_303.method_27(var6);
               var1 = 1;
            }
         }
      }

      if(var0.method_59().size() == 1 && ((class_124)var0.method_59().get(0)).method_518() == 4 && var0.method_73().isEmpty()) {
         class_46 var12 = var0.method_71();
         if((var0 != var12.method_61() || var12.field_13 != 2 && var12.field_13 != 6) && (var2 = method_529(var4 = (class_124)var0.method_59().get(0))) != null) {
            var0.method_35(var4);
            var9 = new class_48;
            var10002 = new class_191;
            var10002.method_910(class_181.method_853().method_814(0));
            var9.method_93(var10002);
            var14 = var9;
            var9.method_76(class_150.method_698(var2.method_75()));
            var6 = (class_124)var2.method_59().get(0);
            var11 = new class_124;
            var11.method_516(4, var14, var6.method_522());
            var4 = var11;
            var14.method_34(var4);
            var6.field_303.method_27(var4);
            class_49 var7 = new class_49;
            var7.method_96(Arrays.asList(new class_46[]{var0, var14}));
            class_49 var8 = var7;
            var7.method_26();
            var12.method_49(var0, var8);
            Iterator var15 = var8.method_58(8).iterator();

            class_124 var13;
            while(var15.hasNext()) {
               var13 = (class_124)var15.next();
               var8.method_33(var13);
               var13.method_520().method_52(1, var13, var0);
               var0.method_32(var13);
               var0.method_27(var13);
            }

            class_124 var10001 = new class_124;
            var10001.method_516(1, var0, var14);
            var0.method_34(var10001);
            var15 = var2.method_60().iterator();

            while(var15.hasNext()) {
               if(!(var13 = (class_124)var15.next()).field_305 && var0.method_42(var13.method_520()) && class_142.method_646(var13.method_520().method_71(), var14)) {
                  var2.method_33(var13);
                  var13.method_520().method_52(1, var13, var14);
                  var14.method_32(var13);
                  if(!var0.method_42(var13.field_303)) {
                     var0.method_27(var13);
                  }
               }
            }

            var1 = 2;
         }
      }

      return var1;
   }

   // $FF: renamed from: a (cV) ca
   private static class_46 method_529(class_124 var0) {
      class_46 var1 = var0.method_522();
      if(var0.method_518() == 4 && var1.field_13 == 8 && var0.field_305) {
         if(!var0.field_304) {
            class_46 var10000 = (var0 = var0).method_522();
            class_124 var2 = null;
            Iterator var3 = var10000.method_60().iterator();

            boolean var6;
            while(true) {
               if(!var3.hasNext()) {
                  var6 = true;
                  break;
               }

               if((var2 = (class_124)var3.next()) != var0) {
                  if(var2.method_518() != 1) {
                     var6 = false;
                     break;
                  }

                  class_46 var5;
                  if((var5 = var2.method_520()).field_13 == 8 || var5.field_13 == 2 && ((class_55)var5).field_49 == 0 || var5.field_13 == 5 && ((class_47)var5).method_91() != 0) {
                     var6 = false;
                     break;
                  }
               }
            }

            if(!var6) {
               return null;
            }
         }

         List var4;
         if((var4 = var1.method_75()).size() == 1 && ((class_86)var4.get(0)).field_148 == 4) {
            return var1;
         }
      }

      return null;
   }

   // $FF: renamed from: b (S) boolean
   public static boolean method_530(class_54 var0) {
      boolean var1 = false;
      Iterator var2 = var0.method_123().method_60().iterator();

      while(var2.hasNext()) {
         class_124 var4;
         class_46 var5;
         if(!(var4 = (class_124)var2.next()).field_305 && (var5 = var4.method_520()).method_75() != null && !var5.method_75().isEmpty()) {
            List var6;
            List var10000 = var6 = var5.method_75();
            class_86 var3;
            class_89 var7;
            if((var3 = (class_86)var10000.get(var10000.size() - 1)).field_148 == 4 && (var7 = (class_89)var3).method_291() == 0 && var7.method_292() == null) {
               var6.remove(var6.size() - 1);
               var1 = true;
            }
         }
      }

      return var1;
   }
}
