import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// $FF: renamed from: aJ
public class class_86 {

   // $FF: renamed from: a int
   public int field_148;
   // $FF: renamed from: b int
   public int field_149;


   // $FF: renamed from: <init> () void
   public void method_252() {
      super();
      this.field_149 = class_181.method_853().method_814(1);
   }

   // $FF: renamed from: c_ () int
   public int method_253() {
      return 0;
   }

   // $FF: renamed from: c () Q
   public class_83 method_254() {
      return class_83.field_132;
   }

   // $FF: renamed from: d_ () int
   public int method_255() {
      return 0;
   }

   // $FF: renamed from: e () aM
   public class_178 method_256() {
      class_178 var10000 = new class_178;
      var10000.method_817();
      return var10000;
   }

   // $FF: renamed from: b (aJ) boolean
   public final boolean method_257(class_86 var1) {
      ArrayList var2;
      (var2 = new ArrayList(this.method_258(true))).add(this);
      Iterator var3 = var2.iterator();

      while(var3.hasNext()) {
         if(((class_86)var3.next()).equals(var1)) {
            return true;
         }
      }

      return false;
   }

   // $FF: renamed from: a (boolean) java.util.List
   public final List method_258(boolean var1) {
      List var2;
      for(int var3 = (var2 = this.method_260()).size() - 1; var3 >= 0; --var3) {
         var2.addAll(((class_86)var2.get(var3)).method_258(true));
      }

      return var2;
   }

   // $FF: renamed from: p () java.util.Set
   public final Set method_259() {
      HashSet var1 = new HashSet();
      List var2;
      (var2 = this.method_258(true)).add(this);
      Iterator var3 = var2.iterator();

      while(var3.hasNext()) {
         if((this = (class_86)var3.next()).field_148 == 12) {
            class_77 var10001 = new class_77;
            var10001.method_216((class_88)this);
            var1.add(var10001);
         }
      }

      return var1;
   }

   // $FF: renamed from: b () java.util.List
   public List method_260() {
      throw new RuntimeException("not implemented");
   }

   // $FF: renamed from: a () aJ
   public class_86 method_261() {
      throw new RuntimeException("not implemented");
   }

   // $FF: renamed from: a (int) java.lang.String
   public String method_262(int var1) {
      throw new RuntimeException("not implemented");
   }

   // $FF: renamed from: a (aJ, aJ) void
   public void method_263(class_86 var1, class_86 var2) {}
}
