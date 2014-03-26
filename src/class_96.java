import java.util.List;

// $FF: renamed from: ch
public final class class_96 extends class_86 {

   // $FF: renamed from: c java.lang.String
   private String field_191;
   // $FF: renamed from: d java.util.List
   private List field_192;
   // $FF: renamed from: e java.util.List
   private List field_193;


   // $FF: renamed from: <init> (java.lang.String, java.util.List, java.util.List) void
   public void method_335(String var1, List var2, List var3) {
      super.method_252();
      this.field_148 = 13;
      this.field_191 = var1;
      this.field_192 = var2;
      this.field_193 = var3;
   }

   // $FF: renamed from: a (int) java.lang.String
   public final String method_262(int var1) {
      StringBuilder var2 = new StringBuilder();
      String var3 = class_129.method_557(var1);
      var2.append(var3);
      var2.append("@");
      class_131 var10001 = class_181.method_847();
      String var5 = class_209.method_1042(this.field_191);
      String var4 = null;
      var2.append(var10001.method_571(var5, true));
      if(!this.field_192.isEmpty()) {
         var2.append("(");
         if(this.field_192.size() == 1 && "value".equals(this.field_192.get(0))) {
            var2.append(((class_86)this.field_193.get(0)).method_262(var1 + 1));
         } else {
            var4 = class_129.method_557(var1 + 1);

            for(int var6 = 0; var6 < this.field_192.size(); ++var6) {
               var2.append("\r\n" + var4);
               var2.append((String)this.field_192.get(var6));
               var2.append(" = ");
               var2.append(((class_86)this.field_193.get(var6)).method_262(var1 + 2));
               if(var6 < this.field_192.size() - 1) {
                  var2.append(",");
               }
            }

            var2.append("\r\n" + var3);
         }

         var2.append(")");
      }

      return var2.toString();
   }

   // $FF: renamed from: g () int
   public final int method_336() {
      return this.field_192.isEmpty()?2:(this.field_192.size() == 1 && "value".equals(this.field_192.get(0))?3:1);
   }

   public final boolean equals(Object var1) {
      if(var1 != null && var1 instanceof class_96) {
         class_96 var2 = (class_96)var1;
         return this.field_191.equals(var2.field_191) && class_129.method_560(this.field_192, var2.field_192) && class_129.method_560(this.field_193, var2.field_193);
      } else {
         return false;
      }
   }

   // $FF: renamed from: h () java.lang.String
   public final String method_337() {
      return this.field_191;
   }
}
