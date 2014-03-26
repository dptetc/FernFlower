import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

// $FF: renamed from: q
public final class class_114 {

   // $FF: renamed from: a cE
   public class_146 field_256;
   // $FF: renamed from: b cF
   public class_148 field_257;
   // $FF: renamed from: c java.util.HashMap
   public HashMap field_258;
   // $FF: renamed from: d java.util.HashMap
   public HashMap field_259;
   // $FF: renamed from: e java.util.HashMap
   public HashMap field_260;
   // $FF: renamed from: f java.util.HashMap
   public HashMap field_261;


   // $FF: renamed from: <init> () void
   public void method_450() {
      super();
      class_146 var10001 = new class_146;
      var10001.method_653();
      this.field_256 = var10001;
      this.field_258 = new HashMap();
      this.field_259 = new HashMap();
      this.field_260 = new HashMap();
      this.field_261 = new HashMap();
   }

   // $FF: renamed from: a () void
   public final void method_451() {
      LinkedList var1 = new LinkedList();
      method_452(this.field_257, var1);
      this.field_256.clear();
      Iterator var2 = var1.iterator();

      while(var2.hasNext()) {
         class_148 var3 = (class_148)var2.next();
         this.field_256.method_655(var3, var3.field_369);
      }

   }

   // $FF: renamed from: a (cF, java.util.List) void
   private static void method_452(class_148 var0, List var1) {
      LinkedList var2 = new LinkedList();
      LinkedList var3 = new LinkedList();
      HashSet var4 = new HashSet();
      var2.add(var0);
      var3.add(Integer.valueOf(0));

      while(!var2.isEmpty()) {
         var0 = (class_148)var2.getLast();
         int var5 = ((Integer)var3.removeLast()).intValue();
         var4.add(var0);

         while(true) {
            if(var5 < var0.field_373.size()) {
               class_148 var6 = (class_148)var0.field_373.get(var5);
               if(var4.contains(var6)) {
                  ++var5;
                  continue;
               }

               var3.add(Integer.valueOf(var5 + 1));
               var2.add(var6);
               var3.add(Integer.valueOf(0));
            }

            if(var5 == var0.field_373.size()) {
               var1.add(0, var0);
               var2.removeLast();
            }
            break;
         }
      }

   }

   // $FF: renamed from: a (bV) boolean
   public final boolean method_453(class_2 var1) {
      LinkedList var2;
      (var2 = new LinkedList()).add(this.field_257);
      HashSet var6 = new HashSet();

      while(!var2.isEmpty()) {
         class_148 var3 = (class_148)var2.removeFirst();
         if(!var6.contains(var3)) {
            var6.add(var3);

            for(int var4 = 0; var4 < var3.field_372.size(); ++var4) {
               int var5;
               if((var5 = var1.method_2((class_86)var3.field_372.get(var4))) == 1) {
                  return false;
               }

               if(var5 == 2) {
                  var3.field_372.remove(var4);
                  --var4;
               }
            }

            var2.addAll(var3.field_373);
         }
      }

      return true;
   }
}
