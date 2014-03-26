import java.util.ArrayList;
import java.util.List;

// $FF: renamed from: w
public final class class_108 {

   // $FF: renamed from: a int
   public int field_228;
   // $FF: renamed from: b int
   public int field_229;
   // $FF: renamed from: c java.lang.String
   public String field_230;
   // $FF: renamed from: d java.util.List
   private List field_231;
   // $FF: renamed from: e java.util.List
   private List field_232;
   // $FF: renamed from: f java.util.List
   private List field_233;


   // $FF: renamed from: <init> (int, int, java.lang.String) void
   public void method_400(int var1, int var2, String var3) {
      super();
      this.field_231 = new ArrayList();
      this.field_232 = new ArrayList();
      this.field_233 = new ArrayList();
      this.field_228 = 8;
      this.field_229 = 0;
      this.field_230 = var3;
   }

   // $FF: renamed from: <init> (java.lang.String) void
   public void method_401(String var1) {
      super();
      this.field_231 = new ArrayList();
      this.field_232 = new ArrayList();
      this.field_233 = new ArrayList();
      this.method_402(var1);
   }

   // $FF: renamed from: b (java.lang.String) void
   private void method_402(String var1) {
      for(int var2 = 0; var2 < var1.length(); ++var2) {
         switch(var1.charAt(var2)) {
         case 76:
            this.field_228 = 8;
            var1 = var1.substring(var2 + 1, var1.length() - 1);

            while(true) {
               String var3 = var1;
               var2 = 0;
               int var4 = 0;

               while(true) {
                  if(var4 < var3.length()) {
                     label55: {
                        switch(var3.charAt(var4)) {
                        case 46:
                           if(var2 == 0) {
                              break label55;
                           }
                           break;
                        case 60:
                           ++var2;
                           break;
                        case 62:
                           --var2;
                        }

                        ++var4;
                        continue;
                     }
                  }

                  String var6;
                  var3 = var6 = var3.substring(0, var4);
                  String var8 = null;
                  int var5;
                  if((var5 = var6.indexOf("<")) >= 0) {
                     var3 = var6.substring(0, var5);
                     var8 = var6.substring(var5 + 1, var6.length() - 1);
                  }

                  if(var6.length() >= var1.length()) {
                     this.field_230 = var3;
                     method_403(var8, this);
                     return;
                  }

                  var1 = var1.substring(var6.length() + 1);
                  class_108 var10000 = new class_108;
                  var10000.method_400(8, 0, var3);
                  class_108 var7 = var10000;
                  method_403(var8, var7);
                  this.field_231.add(var7);
                  break;
               }
            }
         case 84:
            this.field_228 = 18;
            this.field_230 = var1.substring(var2 + 1, var1.length() - 1);
            return;
         case 91:
            ++this.field_229;
            break;
         default:
            this.field_230 = var1.substring(var2, var2 + 1);
            byte var10001;
            switch(this.field_230.charAt(0)) {
            case 65:
               var10001 = 9;
               break;
            case 66:
               var10001 = 0;
               break;
            case 67:
               var10001 = 1;
               break;
            case 68:
               var10001 = 2;
               break;
            case 69:
            case 72:
            case 75:
            case 76:
            case 77:
            case 79:
            case 80:
            case 81:
            case 82:
            case 84:
            case 87:
            default:
               throw new RuntimeException("Invalid type");
            case 70:
               var10001 = 3;
               break;
            case 71:
               var10001 = 12;
               break;
            case 73:
               var10001 = 4;
               break;
            case 74:
               var10001 = 5;
               break;
            case 78:
               var10001 = 14;
               break;
            case 83:
               var10001 = 6;
               break;
            case 85:
               var10001 = 17;
               break;
            case 86:
               var10001 = 10;
               break;
            case 88:
               var10001 = 15;
               break;
            case 89:
               var10001 = 16;
               break;
            case 90:
               var10001 = 7;
            }

            this.field_228 = var10001;
         }
      }

   }

   // $FF: renamed from: a (java.lang.String, w) void
   private static void method_403(String var0, class_108 var1) {
      if(var0 != null) {
         while(var0.length() > 0) {
            String var2;
            int var3 = (var2 = method_404(var0)).length();
            byte var4 = 4;
            switch(var2.charAt(0)) {
            case 42:
               var4 = 3;
               break;
            case 43:
               var4 = 1;
            case 44:
            default:
               break;
            case 45:
               var4 = 2;
            }

            var1.field_233.add(Integer.valueOf(var4));
            if(var4 != 4) {
               var2 = var2.substring(1);
            }

            List var10000 = var1.field_232;
            class_108 var10001;
            if(var2.length() == 0) {
               var10001 = null;
            } else {
               var10001 = new class_108;
               var10001.method_401(var2);
            }

            var10000.add(var10001);
            var0 = var0.substring(var3);
         }

      }
   }

   // $FF: renamed from: a (java.lang.String) java.lang.String
   public static String method_404(String var0) {
      int var1 = 0;
      int var2 = 0;

      for(boolean var3 = false; var2 < var0.length(); ++var2) {
         switch(var0.charAt(var2)) {
         case 42:
            if(!var3) {
               return var0.substring(0, var2 + 1);
            }
         case 43:
         case 45:
         case 91:
            break;
         case 59:
            if(var1 == 0) {
               return var0.substring(0, var2 + 1);
            }
            break;
         case 60:
            ++var1;
            break;
         case 62:
            --var1;
            break;
         case 76:
         case 84:
            if(!var3) {
               var3 = true;
            }
            break;
         default:
            if(!var3) {
               return var0.substring(0, var2 + 1);
            }
         }
      }

      return var0.substring(0, var2 + 1);
   }

   // $FF: renamed from: a () java.util.List
   public final List method_405() {
      return this.field_232;
   }

   // $FF: renamed from: b () java.util.List
   public final List method_406() {
      return this.field_231;
   }

   // $FF: renamed from: c () java.util.List
   public final List method_407() {
      return this.field_233;
   }
}
