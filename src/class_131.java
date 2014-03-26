import java.io.BufferedWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;

// $FF: renamed from: cL
public final class class_131 {

   // $FF: renamed from: a java.util.HashMap
   private HashMap field_333;
   // $FF: renamed from: b java.util.HashSet
   private HashSet field_334;
   // $FF: renamed from: c java.lang.String
   private String field_335;
   // $FF: renamed from: d java.lang.String
   private String field_336;


   // $FF: renamed from: <init> (aK) void
   public void method_570(class_177 var1) {
      super();
      this.field_333 = new HashMap();
      this.field_334 = new HashSet();
      this.field_335 = "";
      this.field_336 = "";
      int var2;
      String var3;
      if((var2 = (var3 = var1.field_438.field_528).lastIndexOf("/")) >= 0) {
         this.field_335 = var3.substring(0, var2);
         this.field_336 = this.field_335.replace('/', '.');
         this.field_335 = this.field_335 + "/";
      }

   }

   // $FF: renamed from: a (java.lang.String, boolean) java.lang.String
   public final String method_571(String var1, boolean var2) {
      class_136 var10000 = class_181.method_855();
      class_177 var3 = null;
      var3 = (class_177)var10000.method_588().get(var1.replace('.', '/'));
      String var4 = null;
      if(var3 != null && var3.field_438.method_979()) {
         for(var4 = var3.field_437; var3.field_447 != null && var3.field_435 == 1; var3 = var3.field_447) {
            var4 = var3.field_447.field_437 + "." + var4;
         }

         if(var3.field_435 != 0) {
            return var4;
         }

         var1 = var3.field_438.field_528.replace('/', '.');
      } else if(var3 == null || !var3.field_438.method_979()) {
         var1 = var1.replace('$', '.');
      }

      String var7 = var1;
      String var5 = "";
      int var6;
      if((var6 = var1.lastIndexOf(".")) >= 0) {
         var7 = var1.substring(var6 + 1);
         var5 = var1.substring(0, var6);
      }

      class_107 var8;
      if(((var8 = class_181.method_851()).method_393(this.field_335 + var7) == null || var5.equals(this.field_336)) && var8.method_393(var7) == null && (!this.field_333.containsKey(var7) || var5.equals(this.field_333.get(var7)))) {
         if(!this.field_333.containsKey(var7)) {
            this.field_333.put(var7, var5);
            if(!var2) {
               this.field_334.add(var7);
            }
         }

         return var4 == null?var7:var4;
      } else {
         return var1;
      }
   }

   // $FF: renamed from: a (java.io.BufferedWriter) void
   public final void method_572(BufferedWriter var1) {
      ArrayList var2;
      ArrayList var10000 = var2 = new ArrayList((Collection)this.field_333.entrySet());
      class_111 var10001 = new class_111;
      var10001.method_423();
      Collections.sort(var10000, var10001);
      ArrayList var3 = new ArrayList();
      Iterator var4 = var2.iterator();

      while(var4.hasNext()) {
         Entry var6 = (Entry)var4.next();
         if(!this.field_334.contains(var6.getKey()) && !"java.lang".equals(var6.getValue()) && ((String)var6.getValue()).length() > 0) {
            String var7 = (String)var6.getValue() + "." + (String)var6.getKey();
            var3.add(var7);
         }
      }

      Iterator var8 = var3.iterator();

      while(var8.hasNext()) {
         String var5 = (String)var8.next();
         var1.write("import " + var5 + ";");
         var1.newLine();
      }

   }
}
