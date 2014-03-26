import java.util.HashSet;

// $FF: renamed from: bS
public final class class_193 {

   // $FF: renamed from: a java.util.HashSet
   private HashSet field_498;


   // $FF: renamed from: <init> () void
   public void method_936() {
      super();
      this.field_498 = new HashSet();
   }

   // $FF: renamed from: <init> (java.util.HashSet) void
   public void method_937(HashSet var1) {
      super();
      this.field_498 = new HashSet();
      this.field_498.addAll(var1);
   }

   // $FF: renamed from: a (java.lang.String) void
   public final void method_938(String var1) {
      this.field_498.add(var1);
   }

   // $FF: renamed from: a (int) java.lang.String
   public final String method_939(int var1) {
      return this.method_940("var" + var1);
   }

   // $FF: renamed from: b (java.lang.String) java.lang.String
   public final String method_940(String var1) {
      while(this.field_498.contains(var1)) {
         var1 = var1 + "x";
      }

      this.field_498.add(var1);
      return var1;
   }
}
