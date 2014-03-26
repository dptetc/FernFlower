import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// $FF: renamed from: aK
public final class class_177 {

   // $FF: renamed from: a int
   public int field_435;
   // $FF: renamed from: b int
   public int field_436;
   // $FF: renamed from: c java.lang.String
   public String field_437;
   // $FF: renamed from: d bW
   public class_198 field_438;
   // $FF: renamed from: e v
   public class_109 field_439;
   // $FF: renamed from: f java.lang.String
   public String field_440;
   // $FF: renamed from: g cR
   public class_97 field_441;
   // $FF: renamed from: h java.util.HashMap
   public HashMap field_442;
   // $FF: renamed from: i java.util.HashMap
   public HashMap field_443;
   // $FF: renamed from: j Q
   public class_83 field_444;
   // $FF: renamed from: k java.util.List
   public List field_445;
   // $FF: renamed from: l java.util.Set
   public Set field_446;
   // $FF: renamed from: m aK
   public class_177 field_447;


   // $FF: renamed from: <init> (bW) void
   public void method_815(class_198 var1) {
      super();
      this.field_442 = new HashMap();
      this.field_443 = new HashMap();
      this.field_445 = new ArrayList();
      this.field_446 = new HashSet();
      this.field_435 = 0;
      this.field_438 = var1;
      this.field_437 = var1.field_528.substring(var1.field_528.lastIndexOf(47) + 1);
   }

   // $FF: renamed from: a (java.lang.String) aK
   public final class_177 method_816(String var1) {
      Iterator var2 = this.field_445.iterator();

      while(var2.hasNext()) {
         this = (class_177)var2.next();
         if(var1.equals(this.field_438.field_528)) {
            return this;
         }
      }

      return null;
   }
}
