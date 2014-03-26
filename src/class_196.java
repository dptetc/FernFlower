import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

// $FF: renamed from: bX
public final class class_196 {

   // $FF: renamed from: a cb
   private class_118 field_512;
   // $FF: renamed from: b int
   private int field_513;
   // $FF: renamed from: c java.util.HashSet
   private HashSet field_514;
   // $FF: renamed from: d java.util.HashMap
   private HashMap field_515;
   // $FF: renamed from: e java.util.HashMap
   private HashMap field_516;
   // $FF: renamed from: f java.util.List
   private List field_517;
   // $FF: renamed from: g java.util.HashSet
   private HashSet field_518;


   // $FF: renamed from: <init> () void
   public void method_954() {
      super();
   }

   // $FF: renamed from: <init> (ca) void
   public void method_955(class_46 var1) {
      super();
      this.method_956(var1);
   }

   // $FF: renamed from: a (ca) java.util.List
   private List method_956(class_46 var1) {
      this.field_517 = new ArrayList();
      this.field_518 = new HashSet();
      this.method_959(var1.method_61());
      Iterator var3 = var1.method_63().iterator();

      class_46 var2;
      while(var3.hasNext()) {
         var2 = (class_46)var3.next();
         if(!this.field_518.contains(var2) && var2.method_58(1073741824).isEmpty()) {
            this.method_959(var2);
         }
      }

      var3 = var1.method_63().iterator();

      while(var3.hasNext()) {
         var2 = (class_46)var3.next();
         if(!this.field_518.contains(var2)) {
            this.method_959(var2);
         }
      }

      return this.field_517;
   }

   // $FF: renamed from: a (java.util.List) boolean
   public static boolean method_957(List var0) {
      HashSet var1 = new HashSet();
      Iterator var3 = var0.iterator();

      while(var3.hasNext()) {
         class_46 var2 = (class_46)var3.next();
         var1.addAll(var2.method_55(1, 1));
      }

      var1.removeAll(var0);
      return var1.size() == 0;
   }

   // $FF: renamed from: b (java.util.List) java.util.List
   public static List method_958(List var0) {
      ArrayList var1 = new ArrayList();
      Iterator var2 = var0.iterator();

      while(var2.hasNext()) {
         if(method_957(var0 = (List)var2.next())) {
            var1.add((class_46)var0.get(0));
         }
      }

      return var1;
   }

   // $FF: renamed from: b (ca) void
   private void method_959(class_46 var1) {
      class_118 var10001 = new class_118;
      var10001.method_480();
      this.field_512 = var10001;
      this.field_513 = 0;
      this.field_514 = new HashSet();
      this.field_515 = new HashMap();
      this.field_516 = new HashMap();
      this.method_960(var1);
      this.field_518.addAll(this.field_514);
      this.field_518.add(var1);
   }

   // $FF: renamed from: c (ca) void
   private void method_960(class_46 var1) {
      this.field_512.method_483(var1);
      this.field_515.put(var1, Integer.valueOf(this.field_513));
      this.field_516.put(var1, Integer.valueOf(this.field_513));
      ++this.field_513;
      List var2;
      (var2 = var1.method_55(1, 1)).removeAll(this.field_518);

      class_46 var4;
      for(int var3 = 0; var3 < var2.size(); ++var3) {
         var4 = (class_46)var2.get(var3);
         int var6;
         if(this.field_514.contains(var4)) {
            var6 = ((Integer)this.field_515.get(var4)).intValue();
         } else {
            this.field_514.add(var4);
            this.method_960(var4);
            var6 = ((Integer)this.field_516.get(var4)).intValue();
         }

         this.field_516.put(var1, Integer.valueOf(Math.min(((Integer)this.field_516.get(var1)).intValue(), var6)));
      }

      if(((Integer)this.field_516.get(var1)).intValue() == ((Integer)this.field_515.get(var1)).intValue()) {
         ArrayList var5 = new ArrayList();

         do {
            var4 = (class_46)this.field_512.method_484();
            var5.add(var4);
         } while(var4 != var1);

         this.field_517.add(var5);
      }

   }

   // $FF: renamed from: a () java.util.List
   public final List method_961() {
      return this.field_517;
   }
}
