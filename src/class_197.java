import java.util.ArrayList;

// $FF: renamed from: av
public final class class_197 {

   // $FF: renamed from: a Q[]
   public class_83[] field_519;
   // $FF: renamed from: b Q
   public class_83 field_520;


   // $FF: renamed from: <init> () void
   public void method_962() {
      super();
   }

   // $FF: renamed from: a (java.lang.String) av
   public static class_197 method_963(String var0) {
      class_197 var10000 = new class_197;
      var10000.method_962();
      class_197 var1 = var10000;
      ArrayList var2 = new ArrayList();
      String[] var8;
      String var3 = (var8 = var0.split("[()]"))[1];
      int var4 = -1;
      int var6 = 0;

      for(int var7 = var3.length(); var6 < var7; ++var6) {
         switch(var3.charAt(var6)) {
         case 76:
            int var5 = var3.indexOf(";", var6);
            var2.add(var3.substring(var4 < 0?var6:var4, var5 + 1));
            var6 = var5;
            var4 = -1;
            break;
         case 91:
            if(var4 < 0) {
               var4 = var6;
            }
            break;
         default:
            var2.add(var3.substring(var4 < 0?var6:var4, var6 + 1));
            var4 = -1;
         }
      }

      var2.add(var8[2]);
      var1.field_519 = new class_83[var2.size() - 1];

      int var9;
      for(var9 = 0; var9 < var2.size() - 1; ++var9) {
         class_83[] var10 = var1.field_519;
         class_83 var10002 = new class_83;
         var10002.method_238((String)var2.get(var9));
         var10[var9] = var10002;
      }

      class_83 var10001 = new class_83;
      var10001.method_238((String)var2.get(var9));
      var1.field_520 = var10001;
      return var1;
   }

   // $FF: renamed from: a () java.lang.String
   public final String method_964() {
      String var1 = "(";

      for(int var2 = 0; var2 < this.field_519.length; ++var2) {
         var1 = var1 + this.field_519[var2].toString();
      }

      return var1 + ")" + this.field_520.toString();
   }

   public final boolean equals(Object var1) {
      if(var1 != null && var1 instanceof class_197) {
         class_197 var3 = (class_197)var1;
         if(this.field_520.equals(var3.field_520) && this.field_519.length == var3.field_519.length) {
            for(int var2 = 0; var2 < this.field_519.length; ++var2) {
               if(!this.field_519[var2].equals(var3.field_519[var2])) {
                  return false;
               }
            }

            return true;
         }
      }

      return false;
   }

   public final int hashCode() {
      return this.field_520.hashCode();
   }
}
