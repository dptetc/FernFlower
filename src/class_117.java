import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;

// $FF: renamed from: x
public final class class_117 {

   // $FF: renamed from: a ao
   private class_89 field_274;
   // $FF: renamed from: b ao
   private class_89 field_275;


   // $FF: renamed from: <init> () void
   public void method_473() {
      super();
      class_97 var10000 = new class_97;
      var10000.method_252();
      class_97 var1 = var10000;
      var10000.method_354("forName");
      var1.method_346("java/lang/Class");
      var1.method_356("(Ljava/lang/String;)Ljava/lang/Class;");
      var1.method_344(class_197.method_963("(Ljava/lang/String;)Ljava/lang/Class;"));
      var1.method_352();
      class_86[] var10001 = new class_86[1];
      class_88 var10004 = new class_88;
      var10004.method_276(0, class_83.field_129, (class_164)null);
      var10001[0] = var10004;
      var1.method_342(Arrays.asList(var10001));
      class_89 var3 = new class_89;
      var3.method_290(0, var1, class_83.field_130);
      this.field_274 = var3;
      var10000 = new class_97;
      var10000.method_252();
      var1 = var10000;
      var10000.method_354("<init>");
      var1.method_346("java/lang/NoClassDefFoundError");
      var1.method_356("()V");
      var1.method_348();
      var1.method_344(class_197.method_963("()V"));
      class_95 var4 = new class_95;
      class_83 var10002 = new class_83;
      var10002.method_237(8, 0, "java/lang/NoClassDefFoundError");
      var4.method_323(var10002, new ArrayList());
      class_95 var2 = var4;
      var4.method_327(var1);
      var10000 = new class_97;
      var10000.method_252();
      var1 = var10000;
      var10000.method_354("initCause");
      var1.method_346("java/lang/NoClassDefFoundError");
      var1.method_356("(Ljava/lang/Throwable;)Ljava/lang/Throwable;");
      var1.method_344(class_197.method_963("(Ljava/lang/Throwable;)Ljava/lang/Throwable;"));
      var1.method_350(var2);
      var10001 = new class_86[1];
      var10004 = new class_88;
      class_83 var10007 = new class_83;
      var10007.method_237(8, 0, "java/lang/ClassNotFoundException");
      var10004.method_276(2, var10007, (class_164)null);
      var10001[0] = var10004;
      var1.method_342(Arrays.asList(var10001));
      var3 = new class_89;
      var3.method_290(1, var1, (class_83)null);
      this.field_275 = var3;
   }

   // $FF: renamed from: a (aK) void
   public final void method_474(class_177 var1) {
      class_109 var2 = var1.field_439;
      int var3 = var1.field_439.method_411().field_522;
      int var6 = var2.method_411().field_521;
      if(var3 <= 48 && (var3 != 48 || var6 <= 0)) {
         HashMap var7 = new HashMap();
         this.method_476(var1, var7);
         if(!var7.isEmpty()) {
            HashSet var8 = new HashSet();
            this.method_475(var1, var7, var8);
            if(!var8.isEmpty()) {
               Iterator var5 = var8.iterator();

               while(var5.hasNext()) {
                  class_109 var4 = (class_109)var5.next();
                  class_128 var9 = ((class_120)var7.get(var4)).field_279;
                  var4.method_413().add(class_129.method_562(var9.method_549(), var9.method_548()));
               }
            }

         }
      }
   }

   // $FF: renamed from: a (aK, java.util.HashMap, java.util.HashSet) void
   private void method_475(class_177 var1, HashMap var2, HashSet var3) {
      class_109 var4 = var1.field_439;
      Iterator var6 = var1.field_439.method_412().iterator();

      Entry var8;
      while(var6.hasNext()) {
         Object var7 = null;
         class_120 var5;
         if((var5 = (class_120)var6.next()).field_277 != null) {
            class_114 var10000 = var5.method_495();
            var8 = null;
            class_66 var10001 = new class_66;
            var10001.method_192(this, var2, var3);
            var10000.method_453(var10001);
         }
      }

      for(int var11 = 0; var11 < 2; ++var11) {
         class_146 var13 = var11 == 0?var4.method_414():var4.method_415();

         for(int var14 = 0; var14 < var13.size(); ++var14) {
            Iterator var9 = var2.entrySet().iterator();

            while(var9.hasNext()) {
               var8 = (Entry)var9.next();
               class_86 var10 = (class_86)var13.get(var14);
               if(this.method_477(var10, (class_109)var8.getKey(), (class_120)var8.getValue())) {
                  var3.add((class_109)var8.getKey());
               }

               String var15;
               if((var15 = method_478(var10, (class_109)var8.getKey(), (class_120)var8.getValue())) != null) {
                  class_87 var10002 = new class_87;
                  var10002.method_266(class_83.field_130, var15.replace('.', '/'));
                  var13.set(var14, var10002);
                  var3.add((class_109)var8.getKey());
               }
            }
         }
      }

      var6 = var1.field_445.iterator();

      while(var6.hasNext()) {
         class_177 var12 = (class_177)var6.next();
         this.method_475(var12, var2, var3);
      }

   }

   // $FF: renamed from: a (aK, java.util.HashMap) void
   private void method_476(class_177 var1, HashMap var2) {
      boolean var3 = class_181.method_846("nns");
      class_109 var4 = var1.field_439;
      Iterator var6 = var1.field_439.method_412().iterator();

      while(var6.hasNext()) {
         class_120 var5;
         class_128 var7;
         if((((var7 = (var5 = (class_120)var6.next()).field_279).method_550() & 4096) != 0 || var7.method_552().method_662("Synthetic") || var3) && var7.method_548().equals("(Ljava/lang/String;)Ljava/lang/Class;") && (var7.method_550() & 8) != 0) {
            class_54 var10 = var5.field_277;
            class_50 var12;
            if(var5.field_277 != null && var10.method_61().field_13 == 7 && (var12 = (class_50)var10.method_61()).method_63().size() == 2 && var12.method_61().field_13 == 8 && ((class_46)var12.method_63().get(1)).field_13 == 8) {
               class_83 var10000 = ((class_88)var12.method_102().get(0)).method_279();
               class_83 var10001 = new class_83;
               var10001.method_237(8, 0, "java/lang/ClassNotFoundException");
               if(var10000.equals(var10001)) {
                  class_48 var8 = (class_48)var12.method_61();
                  class_48 var11 = (class_48)var12.method_63().get(1);
                  if(var8.method_75().size() == 1 && var11.method_75().size() == 1 && this.field_274.equals(var8.method_75().get(0)) && this.field_275.equals(var11.method_75().get(0))) {
                     var2.put(var4, var5);
                     break;
                  }
               }
            }
         }
      }

      var6 = var1.field_445.iterator();

      while(var6.hasNext()) {
         class_177 var9 = (class_177)var6.next();
         this.method_476(var9, var2);
      }

   }

   // $FF: renamed from: a (aJ, v, cX) boolean
   private boolean method_477(class_86 var1, class_109 var2, class_120 var3) {
      boolean var4 = false;

      while(true) {
         boolean var5 = false;
         Iterator var7 = var1.method_260().iterator();

         while(true) {
            if(var7.hasNext()) {
               class_86 var6;
               String var8;
               if((var8 = method_478(var6 = (class_86)var7.next(), var2, var3)) == null) {
                  var4 |= this.method_477(var6, var2, var3);
                  continue;
               }

               class_87 var10002 = new class_87;
               var10002.method_266(class_83.field_130, var8.replace('.', '/'));
               var1.method_263(var6, var10002);
               var5 = true;
               var4 = true;
            }

            if(!var5) {
               return var4;
            }
            break;
         }
      }
   }

   // $FF: renamed from: b (aJ, v, cX) java.lang.String
   private static String method_478(class_86 var0, class_109 var1, class_120 var2) {
      class_90 var3;
      class_90 var5;
      if(var0.field_148 == 6 && (var5 = (class_90)var0).method_301() == 36 && ((class_86)var5.method_303().get(0)).field_148 == 6 && (var3 = (class_90)var5.method_303().get(0)).method_301() == 42 && ((class_86)var3.method_303().get(0)).field_148 == 5 && ((class_86)var3.method_303().get(1)).field_148 == 3 && ((class_87)var3.method_303().get(1)).method_271().equals(class_83.field_128)) {
         class_92 var8 = (class_92)var3.method_303().get(0);
         class_177 var4;
         class_93 var6;
         class_97 var7;
         class_168 var9;
         if((var4 = (class_177)class_181.method_855().method_588().get(var8.method_309())) != null && var4.field_438.field_528.equals(var1.method_411().field_528) && (var9 = var1.method_411().method_967(var8.method_313(), var8.method_310())) != null && (var9.field_423 & 8) != 0 && ((var9.field_423 & 4096) != 0 || var9.method_772().method_662("Synthetic") || class_181.method_846("nns")) && ((class_86)var5.method_303().get(1)).field_148 == 2 && ((class_86)var5.method_303().get(2)).equals(var8) && (var6 = (class_93)var5.method_303().get(1)).method_316().equals(var8) && var6.method_317().field_148 == 8 && (var7 = (class_97)var6.method_317()).method_345().equals(var1.method_411().field_528) && var7.method_353().equals(var2.field_279.method_549()) && var7.method_355().equals(var2.field_279.method_548()) && ((class_86)var7.method_341().get(0)).field_148 == 3) {
            var1.method_413().add(class_129.method_562(var9.method_775(), var9.method_774()));
            return ((class_87)var7.method_341().get(0)).method_273().toString();
         }
      }

      return null;
   }
}
