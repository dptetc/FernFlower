import de.fernflower.main.extern.IIdentifierRenamer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

// $FF: renamed from: u
public final class class_110 {

   // $FF: renamed from: a de.fernflower.main.extern.IIdentifierRenamer
   private IIdentifierRenamer field_239;
   // $FF: renamed from: b java.util.HashMap
   private HashMap field_240;
   // $FF: renamed from: c java.util.HashMap
   private HashMap field_241;
   // $FF: renamed from: d java.util.HashMap
   private HashMap field_242;


   // $FF: renamed from: <init> (de.fernflower.main.extern.IIdentifierRenamer) void
   public void method_416(IIdentifierRenamer var1) {
      super();
      this.field_240 = new HashMap();
      this.field_241 = new HashMap();
      this.field_242 = new HashMap();
      this.field_239 = var1;
   }

   // $FF: renamed from: a (java.lang.String, java.lang.String) void
   public final void method_417(String var1, String var2) {
      Object var3;
      if((var3 = (List)this.field_242.get(var1)) == null) {
         this.field_242.put(var1, var3 = new ArrayList());
      }

      ((List)var3).add(var2);
   }

   // $FF: renamed from: b (java.lang.String, java.lang.String) void
   public final void method_418(String var1, String var2) {
      this.field_240.put(var1, var2);
      this.field_241.put(var2, var1);
   }

   // $FF: renamed from: a (int, java.lang.String, java.lang.String, java.lang.String) java.lang.String
   public final String method_419(int var1, String var2, String var3, String var4) {
      String var5;
      if((var5 = (String)this.field_240.get(var1 == 1?var2:var2 + " " + var3 + " " + var4)) == null && (var1 == 2 || var1 == 3) && this.field_239.toBeRenamed(var1, var2, var3, var4)) {
         var5 = this.method_420(var2, var3, var4);
      }

      return var5;
   }

   // $FF: renamed from: a (java.lang.String, java.lang.String, java.lang.String) java.lang.String
   private String method_420(String var1, String var2, String var3) {
      String var4 = null;
      List var6;
      if((var6 = (List)this.field_242.get(var1)) != null) {
         Iterator var5 = var6.iterator();

         while(var5.hasNext()) {
            var1 = (String)var5.next();
            if((var4 = (String)this.field_240.get(var1 + " " + var2 + " " + var3)) == null) {
               var4 = this.method_420(var1, var2, var3);
            }

            if(var4 != null) {
               break;
            }
         }
      }

      return var4;
   }

   // $FF: renamed from: a (java.lang.String) java.lang.String
   public final String method_421(String var1) {
      return (String)this.field_241.get(var1);
   }

   // $FF: renamed from: a () de.fernflower.main.extern.IIdentifierRenamer
   public final IIdentifierRenamer method_422() {
      return this.field_239;
   }
}
