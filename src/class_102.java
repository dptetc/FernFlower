import java.util.Iterator;
import java.util.List;
import java.util.Set;

// $FF: renamed from: c
public final class class_102 {

   // $FF: renamed from: a ak
   private class_3 field_212;
   // $FF: renamed from: b cE
   private class_146 field_213;
   // $FF: renamed from: c java.util.Set
   private Set field_214;


   // $FF: renamed from: <init> (ak) void
   public void method_379(class_3 var1) {
      super();
      class_146 var10001 = new class_146;
      var10001.method_653();
      this.field_213 = var10001;
      this.field_212 = var1;
   }

   // $FF: renamed from: a () void
   public final void method_380() {
      class_102 var5;
      class_102 var10000 = var5 = this = this;
      var10000.field_214 = var10000.field_212.method_4();
      Iterator var8 = var5.field_212.method_3().iterator();

      class_4 var6;
      while(var8.hasNext()) {
         var6 = (class_4)var8.next();
         var5.field_213.method_655((Object)null, var6);
      }

      List var1 = (List)this.field_213.method_665();

      boolean var2;
      do {
         var2 = false;
         Iterator var4 = var1.iterator();

         while(var4.hasNext()) {
            class_4 var3 = (class_4)var4.next();
            class_4 var13 = null;
            if(!this.field_214.contains(var3)) {
               Iterator var7 = var3.method_5().iterator();

               while(var7.hasNext()) {
                  var6 = (class_4)var7.next();
                  if(this.field_213.method_659(var6) != null) {
                     class_4 var12 = var13;
                     class_146 var14 = this.field_213;
                     var6 = var6;
                     var13 = var13;
                     if(var12 == null) {
                        var12 = var6;
                     } else if(var6 == null) {
                        var12 = var13;
                     } else {
                        int var10 = var14.method_660(var13);

                        label54:
                        while(true) {
                           for(int var11 = var14.method_660(var6); var10 != var11; var10 = var14.method_660(var13)) {
                              class_4 var9;
                              if(var10 <= var11) {
                                 var9 = var6;
                                 var6 = (class_4)var14.method_659(var6);
                                 if(var9 != var6) {
                                    continue label54;
                                 }

                                 var12 = null;
                                 break label54;
                              }

                              var9 = var13;
                              var13 = (class_4)var14.method_659(var13);
                              if(var9 == var13) {
                                 var12 = null;
                                 break label54;
                              }
                           }

                           var12 = var13;
                           break;
                        }
                     }

                     var13 = var12;
                     if(var12 == null) {
                        break;
                     }
                  }
               }
            }

            if(var13 == null) {
               var13 = var3;
            }

            var6 = (class_4)this.field_213.method_656(var13, var3);
            if(!var13.equals(var6)) {
               var2 = true;
            }
         }
      } while(var2);

   }

   // $FF: renamed from: a (ah, ah) boolean
   public final boolean method_381(class_4 var1, class_4 var2) {
      while(!var1.equals(var2)) {
         class_4 var3;
         if((var3 = (class_4)this.field_213.method_659(var1)) == var1) {
            return false;
         }

         if(var3 == null) {
            throw new RuntimeException("Inconsistent idom sequence discovered!");
         }

         var1 = var3;
      }

      return true;
   }
}
