import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

// $FF: renamed from: cf
public final class class_165 {

   // $FF: renamed from: a boolean
   private boolean field_417;


   // $FF: renamed from: <init> () void
   public void method_759() {
      super();
   }

   // $FF: renamed from: a (S) boolean
   public final boolean method_760(class_54 var1) {
      class_81 var10000 = new class_81;
      var10000.method_225();
      LinkedList var2 = null;
      class_114 var5 = var10000.method_226(var1);
      (var2 = new LinkedList()).add(var5.field_257);
      HashSet var6 = new HashSet();
      boolean var3 = false;

      while(!var2.isEmpty()) {
         class_148 var4 = (class_148)var2.removeFirst();
         if(!var6.contains(var4)) {
            var6.add(var4);
            var3 |= this.method_761(var4.field_372);
            var2.addAll(var4.field_373);
         }
      }

      return var3;
   }

   // $FF: renamed from: a (java.util.List) boolean
   private boolean method_761(List var1) {
      boolean var2 = false;

      for(int var3 = 0; var3 < var1.size(); ++var3) {
         class_86 var4 = (class_86)var1.get(var3);
         this.field_417 = false;
         if((var4 = this.method_762(var4)) != null) {
            var1.set(var3, var4);
            var2 = true;
            --var3;
         }

         var2 |= this.field_417;
      }

      return var2;
   }

   // $FF: renamed from: a (aJ) aJ
   private class_86 method_762(class_86 var1) {
      boolean var2 = true;

      while(var2) {
         var2 = false;
         Iterator var4 = var1.method_260().iterator();

         while(var4.hasNext()) {
            class_86 var3 = (class_86)var4.next();
            class_86 var5;
            if((var5 = this.method_762(var3)) != null) {
               var1.method_263(var3, var5);
               var2 = true;
               this.field_417 = true;
               break;
            }
         }
      }

      class_93 var8;
      if(var1.field_148 == 2 && (var8 = (class_93)var1).method_317().field_148 == 6) {
         class_90 var10 = (class_90)var8.method_317();
         class_83 var11 = null;
         if(var10.method_301() >= 14 && var10.method_301() <= 28) {
            var11 = var10.method_298();
            if(((class_86)var10.method_303().get(0)).field_148 != 6) {
               return null;
            }

            var10 = (class_90)var10.method_303().get(0);
         }

         if(var10.method_301() == 0 || var10.method_301() == 1) {
            var1 = (class_86)var10.method_303().get(0);
            class_86 var7;
            if((var7 = (class_86)var10.method_303().get(1)).field_148 != 3 && var1.field_148 == 3 && var10.method_301() == 0) {
               var1 = var7;
               var7 = (class_86)var10.method_303().get(0);
            }

            if(var7.field_148 == 3 && ((class_87)var7).method_269()) {
               var7 = var8.method_316();
               class_83 var9 = var1.method_254();
               if(var7.equals(var1) && (var11 == null || var11.equals(var9))) {
                  class_90 var10000 = new class_90;
                  var10000.method_296(var10.method_301() == 0?35:33, Arrays.asList(new class_86[]{var1}));
                  class_90 var6 = var10000;
                  var10000.method_304(var9);
                  this.field_417 = true;
                  return var6;
               }
            }
         }
      }

      return null;
   }
}
