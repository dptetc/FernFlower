import java.util.ArrayList;
import java.util.List;

// $FF: renamed from: ai
public final class class_201 {

   // $FF: renamed from: a java.util.List
   private List field_545;
   // $FF: renamed from: b bT
   private class_191 field_546;
   // $FF: renamed from: c java.lang.String
   private String field_547;


   // $FF: renamed from: <init> (java.util.List, bT, java.lang.String) void
   public void method_985(List var1, class_191 var2, String var3) {
      super();
      this.field_545 = new ArrayList();
      this.field_545 = var1;
      this.field_546 = var2;
      this.field_547 = var3;
   }

   // $FF: renamed from: a () boolean
   public final boolean method_986() {
      return this.field_545.contains(this.field_546);
   }

   public final String toString() {
      StringBuffer var1;
      (var1 = new StringBuffer()).append("exceptionType: " + this.field_547 + "\n");
      var1.append("handler: " + this.field_546.field_488 + "\n");
      var1.append("range: ");

      for(int var2 = 0; var2 < this.field_545.size(); ++var2) {
         var1.append(((class_191)this.field_545.get(var2)).field_488 + " ");
      }

      var1.append("\n");
      return var1.toString();
   }

   // $FF: renamed from: b () bT
   public final class_191 method_987() {
      return this.field_546;
   }

   // $FF: renamed from: a (bT) void
   public final void method_988(class_191 var1) {
      this.field_546 = var1;
   }

   // $FF: renamed from: c () java.util.List
   public final List method_989() {
      return this.field_545;
   }

   // $FF: renamed from: d () java.lang.String
   public final String method_990() {
      return this.field_547;
   }
}
