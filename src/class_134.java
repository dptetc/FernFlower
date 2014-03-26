import java.util.ArrayList;

// $FF: renamed from: cN
public final class class_134 {

   // $FF: renamed from: a Q
   private static final class_83 field_341;
   // $FF: renamed from: b Q
   private static final class_83 field_342;


   // $FF: renamed from: <clinit> () void
   static void method_579() {
      class_83 var10000 = new class_83;
      var10000.method_237(8, 0, "java/lang/StringBuilder");
      field_341 = var10000;
      var10000 = new class_83;
      var10000.method_237(8, 0, "java/lang/StringBuffer");
      field_342 = var10000;
   }

   // $FF: renamed from: <init> () void
   public void method_580() {
      super();
   }

   // $FF: renamed from: a (aJ) aJ
   public static class_86 method_581(class_86 var0) {
      class_86 var1 = null;
      class_83 var2 = null;
      if(var0.field_148 == 8) {
         class_97 var3 = (class_97)var0;
         if("toString".equals(var3.method_353())) {
            if("java/lang/StringBuilder".equals(var3.method_345())) {
               var2 = field_341;
            } else if("java/lang/StringBuffer".equals(var3.method_345())) {
               var2 = field_342;
            }

            if(var2 != null) {
               var1 = var3.method_349();
            }
         }
      }

      if(var1 == null) {
         return var0;
      } else {
         ArrayList var13 = new ArrayList();

         byte var4;
         class_83 var21;
         class_197 var22;
         do {
            var4 = 0;
            switch(var1.field_148) {
            case 8:
               boolean var10000;
               class_97 var15;
               label163: {
                  class_97 var18 = var15 = (class_97)var1;
                  if("append".equals(var18.method_353()) && (var22 = var18.method_343()).field_520.equals(var2) && var22.field_519.length == 1) {
                     switch((var21 = var22.field_519[0]).field_133) {
                     case 6:
                     default:
                        break;
                     case 8:
                        if(!var21.equals(class_83.field_129) && !var21.equals(class_83.field_131)) {
                           break;
                        }
                     case 1:
                     case 2:
                     case 3:
                     case 4:
                     case 5:
                     case 7:
                        var10000 = true;
                        break label163;
                     }
                  }

                  var10000 = false;
               }

               if(var10000) {
                  var13.add(0, (class_86)var15.method_341().get(0));
                  var1 = var15.method_349();
                  var4 = 1;
               }
            case 9:
            default:
               break;
            case 10:
               class_95 var5;
               class_95 var6;
               class_83[] var8;
               if((var6 = var5 = (class_95)var1).method_329().equals(var2) && ((var8 = var6.method_326().method_343().field_519).length == 0 || var8.length == 1 && var8[0].equals(class_83.field_129))) {
                  if(var5.method_326().method_343().field_519.length == 1) {
                     var13.add(0, (class_86)var5.method_326().method_341().get(0));
                  }

                  var4 = 2;
               }
            }

            if(var4 == 0) {
               return var0;
            }
         } while(var4 != 2);

         int var14 = 0;

         int var16;
         for(var16 = 0; var16 < var13.size() && var16 < 2; ++var16) {
            if(((class_86)var13.get(var16)).method_254().equals(class_83.field_129)) {
               var14 |= var16 + 1;
            }
         }

         if(var14 == 0) {
            class_87 var10002 = new class_87;
            var10002.method_266(class_83.field_129, "");
            var13.add(0, var10002);
         }

         for(var16 = 0; var16 < var13.size(); ++var16) {
            class_86 var12;
            class_86 var17;
            label122: {
               if((var17 = (class_86)var13.get(var16)).field_148 == 8) {
                  class_97 var7 = (class_97)var17;
                  if("valueOf".equals(var7.method_353()) && "java/lang/String".equals(var7.method_345()) && (var22 = var7.method_343()).field_519.length == 1) {
                     switch((var21 = var22.field_519[0]).field_133) {
                     case 6:
                     default:
                        break;
                     case 8:
                        if(!var21.equals(class_83.field_131)) {
                           break;
                        }
                     case 1:
                     case 2:
                     case 3:
                     case 4:
                     case 5:
                     case 7:
                        var12 = (class_86)var7.method_341().get(0);
                        break label122;
                     }
                  }
               }

               var12 = var17;
            }

            var17 = var12;
            boolean var9;
            if(!(var9 = var16 > 1)) {
               var9 = var17.method_254().equals(class_83.field_129) || var14 != var16 + 1;
               if(var16 == 0) {
                  var14 &= 2;
               }
            }

            if(var9) {
               var13.set(var16, var17);
            }
         }

         Object var20 = (class_86)var13.get(0);

         for(int var19 = 1; var19 < var13.size(); ++var19) {
            ArrayList var10;
            (var10 = new ArrayList()).add(var20);
            var10.add((class_86)var13.get(var19));
            class_90 var11 = new class_90;
            var11.method_296(50, var10);
            var20 = var11;
         }

         return (class_86)var20;
      }
   }
}
