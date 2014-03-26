import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// $FF: renamed from: cS
public final class class_123 {

   // $FF: renamed from: a java.lang.String[]
   private static final String[] field_297;


   // $FF: renamed from: <clinit> () void
   static void method_506() {
      field_297 = new String[]{"byte", "char", "double", "float", "int", "long", "short", "boolean"};
   }

   // $FF: renamed from: <init> () void
   public void method_507() {
      super();
   }

   // $FF: renamed from: a (java.lang.String) cD
   public static class_144 method_508(String var0) {
      class_144 var10000 = new class_144;
      var10000.method_651();
      class_144 var1 = var10000;
      String var2 = class_108.method_404(var0 = method_511(var0, var1.field_362, var1.field_363));
      class_108 var10001 = new class_108;
      var10001.method_401(var2);
      var1.field_360 = var10001;

      for(var0 = var0.substring(var2.length()); var0.length() > 0; var0 = var0.substring(var2.length())) {
         var2 = class_108.method_404(var0);
         List var3 = var1.field_361;
         var10001 = new class_108;
         var10001.method_401(var2);
         var3.add(var10001);
      }

      return var1;
   }

   // $FF: renamed from: b (java.lang.String) bv
   public static class_121 method_509(String var0) {
      class_121 var10000 = new class_121;
      var10000.method_496();
      class_121 var1 = var10000;
      class_108 var10001 = new class_108;
      var10001.method_401(var0);
      var10000.field_285 = var10001;
      return var1;
   }

   // $FF: renamed from: c (java.lang.String) bQ
   public static class_205 method_510(String var0) {
      class_205 var10000 = new class_205;
      var10000.method_1006();
      class_205 var1 = var10000;
      int var2 = (var0 = method_511(var0, var1.field_550, var1.field_551)).indexOf(")");
      String var3 = var0.substring(1, var2);

      String var5;
      List var6;
      class_108 var10001;
      for(var0 = var0.substring(var2 + 1); var3.length() > 0; var3 = var3.substring(var5.length())) {
         var5 = class_108.method_404(var3);
         var6 = var1.field_552;
         var10001 = new class_108;
         var10001.method_401(var5);
         var6.add(var10001);
      }

      var5 = class_108.method_404(var0);
      var10001 = new class_108;
      var10001.method_401(var5);
      var1.field_553 = var10001;
      if((var0 = var0.substring(var5.length())).length() > 0) {
         String[] var4 = var0.split("\\^");

         for(var2 = 1; var2 < var4.length; ++var2) {
            var6 = var1.field_554;
            var10001 = new class_108;
            var10001.method_401(var4[var2]);
            var6.add(var10001);
         }
      }

      return var1;
   }

   // $FF: renamed from: a (java.lang.String, java.util.List, java.util.List) java.lang.String
   private static String method_511(String var0, List var1, List var2) {
      if(var0.charAt(0) != 60) {
         return var0;
      } else {
         int var3 = 1;

         int var4;
         label44:
         for(var4 = 1; var4 < var0.length(); ++var4) {
            switch(var0.charAt(var4)) {
            case 60:
               ++var3;
            case 61:
            default:
               break;
            case 62:
               --var3;
               if(var3 == 0) {
                  break label44;
               }
            }
         }

         String var7 = var0.substring(1, var4);
         var0 = var0.substring(var4 + 1);

         while(var7.length() > 0) {
            var4 = var7.indexOf(":");
            String var5 = var7.substring(0, var4);
            var7 = var7.substring(var4 + 1);
            ArrayList var8 = new ArrayList();

            while(true) {
               class_108 var10001;
               if(var7.charAt(0) == 58) {
                  var10001 = new class_108;
                  var10001.method_400(8, 0, "java/lang/Object");
                  var8.add(var10001);
                  var7 = var7.substring(1);
               }

               String var6 = class_108.method_404(var7);
               var10001 = new class_108;
               var10001.method_401(var6);
               var8.add(var10001);
               if((var7 = var7.substring(var6.length())).length() == 0 || var7.charAt(0) != 58) {
                  var1.add(var5);
                  var2.add(var8);
                  break;
               }

               var7 = var7.substring(1);
            }
         }

         return var0;
      }
   }

   // $FF: renamed from: a (w) java.lang.String
   public static String method_512(class_108 var0) {
      class_108 var1 = var0;
      int var2 = var0.field_228;
      String var10000;
      if(var0.field_228 <= 7) {
         var10000 = field_297[var2];
      } else if(var2 == 10) {
         var10000 = "void";
      } else if(var2 == 18) {
         var10000 = var0.field_230;
      } else {
         if(var2 != 8) {
            throw new RuntimeException("invalid type");
         }

         StringBuilder var7;
         StringBuilder var9 = var7 = new StringBuilder();
         class_131 var10001 = class_181.method_847();
         String var4 = method_513(var0);
         Object var3 = null;
         var9.append(var10001.method_571(var4, true));
         if(!var0.method_405().isEmpty()) {
            var7.append("<");

            for(int var10 = 0; var10 < var1.method_405().size(); ++var10) {
               if(var10 > 0) {
                  var7.append(", ");
               }

               int var11;
               if((var11 = ((Integer)var1.method_407().get(var10)).intValue()) != 4) {
                  var7.append("?");
                  switch(var11) {
                  case 1:
                     var7.append(" extends ");
                     break;
                  case 2:
                     var7.append(" super ");
                  }
               }

               class_108 var12;
               if((var12 = (class_108)var1.method_405().get(var10)) != null) {
                  var7.append(method_512(var12));
               }
            }

            var7.append(">");
         }

         var10000 = var7.toString();
      }

      String var6 = var10000;

      for(int var5 = var0.field_229; var5-- > 0; var6 = var6 + "[]") {
         ;
      }

      return var6;
   }

   // $FF: renamed from: b (w) java.lang.String
   private static String method_513(class_108 var0) {
      String var1 = "";

      class_108 var2;
      for(Iterator var3 = var0.method_406().iterator(); var3.hasNext(); var1 = var1 + var2.field_230 + "$") {
         var2 = (class_108)var3.next();
      }

      String var4;
      class_198 var5;
      if((var4 = (var1 = var1 + var0.field_230).replace('/', '.')).indexOf("$") >= 0 && ((var5 = class_181.method_851().method_393(var1)) == null || !var5.method_979())) {
         var4 = var4.replace('$', '.');
      }

      return var4;
   }
}
