import java.util.Iterator;

// $FF: renamed from: cc
public final class class_166 {

   // $FF: renamed from: <init> () void
   public void method_763() {
      super();
   }

   // $FF: renamed from: a (v) void
   public static void method_764(class_109 var0) {
      class_198 var1;
      Iterator var3 = (var1 = var0.method_411()).method_976().iterator();

      String var6;
      while(var3.hasNext()) {
         class_128 var2;
         String var4 = (var2 = (class_128)var3.next()).method_549();
         byte var5 = 0;
         if("values".equals(var4)) {
            var5 = 1;
         } else if("valueOf".equals(var4)) {
            var5 = 2;
         }

         if(var5 > 0) {
            String[] var10000 = var2.method_548().split("[()]");
            var6 = null;
            var6 = var10000[1];
            if(var5 == 1 && var6.length() == 0 || var5 == 2 && "Ljava/lang/String;".equals(var6)) {
               var0.method_413().add(class_129.method_562(var4, var2.method_548()));
            }
         }
      }

      var3 = var0.method_412().iterator();

      while(true) {
         class_77 var8;
         class_120 var10;
         do {
            if(!var3.hasNext()) {
               var3 = var1.method_977().iterator();

               while(var3.hasNext()) {
                  class_168 var13;
                  class_86 var19;
                  class_95 var25;
                  if(((var13 = (class_168)var3.next()).field_423 & 16384) != 0 && (var19 = (class_86)var0.method_414().method_659(class_129.method_562(var13.method_775(), var13.method_774()))) != null && var19.field_148 == 10 && (var25 = (class_95)var19).method_333()) {
                     class_177 var12 = (class_177)class_181.method_855().method_588().get(var25.method_329().field_136);
                     var6 = null;
                     class_109 var15;
                     class_198 var23;
                     Iterator var22 = (var23 = (var15 = var12.field_439).method_411()).method_977().iterator();

                     while(var22.hasNext()) {
                        class_168 var24;
                        if(((var24 = (class_168)var22.next()).field_423 & 4096) != 0) {
                           class_206 var9 = class_206.method_1009(var24.method_774());
                           var8 = null;
                           class_83 var26;
                           if((var26 = var9.field_559).field_133 == 8 && var26.field_135 == 1 && var23.field_528.equals(var26.field_136)) {
                              var15.method_413().add(class_129.method_562(var24.method_775(), var24.method_774()));
                           }
                        }
                     }
                  }
               }

               return;
            }

            var10 = (class_120)var3.next();
         } while(!"<init>".equals(var10.field_279.method_549()));

         class_46 var18;
         if((var18 = method_765(var10.field_277)) == null || var18.method_75().isEmpty()) {
            return;
         }

         class_86 var21;
         if((var21 = (class_86)var18.method_75().get(0)).field_148 == 8) {
            boolean var14;
            label82: {
               class_97 var16 = (class_97)var21;
               var6 = null;
               class_120 var20 = var10;
               class_97 var11 = var16;
               if(var16.method_347() == 2 && var11.method_349().field_148 == 12) {
                  class_88 var7 = (class_88)var11.method_349();
                  class_77 var17 = new class_77;
                  var17.method_216(var7);
                  var8 = var17;
                  if((String)var20.field_278.method_757().get(var8) != null && !var0.method_411().field_528.equals(var11.method_345())) {
                     var14 = true;
                     break label82;
                  }
               }

               var14 = false;
            }

            if(var14) {
               var18.method_75().remove(0);
            }
         }
      }
   }

   // $FF: renamed from: a (ca) ca
   private static class_46 method_765(class_46 var0) {
      if(var0.method_75() != null) {
         return var0;
      } else if(var0.method_69()) {
         return null;
      } else {
         switch(var0.field_13) {
         case 2:
         case 6:
         case 10:
         case 13:
         case 15:
            return method_765(var0.method_61());
         default:
            return null;
         }
      }
   }
}
