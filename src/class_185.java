import java.util.Iterator;
import java.util.List;

// $FF: renamed from: ay
public final class class_185 {

   // $FF: renamed from: a ca
   private class_46 field_476;
   // $FF: renamed from: b cE
   private class_146 field_477;


   // $FF: renamed from: <init> (ca) void
   public void method_881(class_46 var1) {
      super();
      class_146 var10001 = new class_146;
      var10001.method_653();
      this.field_477 = var10001;
      this.field_476 = var1;
   }

   // $FF: renamed from: a () void
   public final void method_882() {
      class_185 var5;
      Iterator var8 = (var5 = this = this).field_476.method_39().iterator();

      while(var8.hasNext()) {
         class_46 var6 = (class_46)var8.next();
         var5.field_477.method_655((Object)null, var6.field_14);
      }

      this.field_477.method_656(this.field_476.method_61().field_14, this.field_476.method_61().field_14);
      List var1 = this.field_477.method_665().subList(1, this.field_477.method_665().size());

      boolean var2;
      do {
         var2 = false;
         Iterator var4 = var1.iterator();

         while(var4.hasNext()) {
            Integer var3 = (Integer)var4.next();
            class_46 var11 = (class_46)this.field_476.method_63().method_659(var3);
            Integer var14 = null;
            Iterator var7 = var11.method_60().iterator();

            Integer var12;
            while(var7.hasNext()) {
               class_124 var13 = (class_124)var7.next();
               if(this.field_477.method_659(var13.method_520().field_14) != null) {
                  Integer var10000 = var14;
                  class_146 var15 = this.field_477;
                  var14 = var13.method_520().field_14;
                  var12 = var10000;
                  if(var10000 == null) {
                     var10000 = var14;
                  } else if(var14 == null) {
                     var10000 = var12;
                  } else {
                     int var9 = var15.method_660(var12);
                     int var10 = var15.method_660(var14);

                     while(var9 != var10) {
                        if(var9 > var10) {
                           var12 = (Integer)var15.method_659(var12);
                           var9 = var15.method_660(var12);
                        } else {
                           var14 = (Integer)var15.method_659(var14);
                           var10 = var15.method_660(var14);
                        }
                     }

                     var10000 = var12;
                  }

                  var14 = var10000;
               }
            }

            var12 = (Integer)this.field_477.method_656(var14, var3);
            if(!var14.equals(var12)) {
               var2 = true;
            }
         }
      } while(var2);

   }

   // $FF: renamed from: b () cE
   public final class_146 method_883() {
      return this.field_477;
   }

   // $FF: renamed from: a (java.lang.Integer, java.lang.Integer) boolean
   public final boolean method_884(Integer var1, Integer var2) {
      while(!var1.equals(var2)) {
         Integer var3;
         if((var3 = (Integer)this.field_477.method_659(var1)).equals(var1)) {
            return false;
         }

         var1 = var3;
      }

      return true;
   }
}
