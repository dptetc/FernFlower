import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// $FF: renamed from: da
public final class class_150 {

   // $FF: renamed from: <init> () void
   public void method_694() {
      super();
   }

   // $FF: renamed from: a (java.util.List) boolean
   public static boolean method_695(List var0) {
      HashSet var1 = new HashSet(var0);
      HashSet var2 = new HashSet();
      Set var3 = null;
      Iterator var5 = var0.iterator();

      while(var5.hasNext()) {
         class_46 var10000 = (class_46)var5.next();
         Set var4 = null;
         var4 = var10000.method_56(2, 1);
         if(var3 == null) {
            var3 = var4;
         } else {
            HashSet var6;
            (var6 = new HashSet(var3)).removeAll(var4);
            var3.retainAll(var4);
            var4.removeAll(var3);
            var2.addAll(var6);
            var2.addAll(var4);
         }
      }

      var5 = var2.iterator();

      class_46 var7;
      do {
         if(!var5.hasNext()) {
            for(int var8 = 1; var8 < var0.size(); ++var8) {
               class_46 var9;
               if(!(var9 = (class_46)var0.get(var8)).method_58(2).isEmpty() && !var2.contains(var9)) {
                  return false;
               }
            }

            return true;
         }

         var7 = (class_46)var5.next();
      } while(var1.contains(var7) && var1.containsAll(var7.method_55(2, 0)));

      return false;
   }

   // $FF: renamed from: a (ca, java.util.List) boolean
   public static boolean method_696(class_46 var0, List var1) {
      class_46 var2 = null;
      Set var3;
      if((var3 = var0.method_56(1, 1)).contains(var0)) {
         return false;
      } else {
         while(true) {
            var1.clear();
            boolean var4 = false;
            var3.remove(var2);
            Iterator var5 = var3.iterator();

            while(true) {
               if(var5.hasNext()) {
                  class_46 var6;
                  if((var6 = (class_46)var5.next()).method_64() != 2) {
                     if(var2 != null) {
                        return false;
                     }

                     var2 = var6;
                     var4 = true;
                  } else {
                     Set var7;
                     (var7 = var6.method_56(1, 0)).remove(var0);
                     if(var7.contains(var6)) {
                        return false;
                     }

                     if(var3.containsAll(var7) && var7.size() <= 1) {
                        class_46 var8;
                        if(var7.size() == 1) {
                           var8 = (class_46)var7.iterator().next();

                           while(var1.contains(var8)) {
                              (var7 = var8.method_56(1, 0)).remove(var0);
                              if(var7.isEmpty()) {
                                 break;
                              }

                              if((var8 = (class_46)var7.iterator().next()) == var6) {
                                 return false;
                              }
                           }
                        }

                        List var9;
                        if((var9 = var6.method_57(1073741824)).size() > 1) {
                           (var7 = var6.method_56(1073741824, 1)).retainAll(var3);
                           if(var7.size() > 0) {
                              return false;
                           }

                           if(var2 != null) {
                              return false;
                           }

                           var2 = var6;
                           var4 = true;
                        } else {
                           label99: {
                              class_124 var10;
                              if(var9.size() == 1 && (var10 = (class_124)var9.get(0)).method_518() == 1) {
                                 var8 = var10.method_522();
                                 if(var0 == var8) {
                                    return false;
                                 }

                                 if(!var3.contains(var8) && var2 != var8) {
                                    if(var2 != null) {
                                       return false;
                                    }

                                    if(var8.method_56(1, 0).size() <= 1) {
                                       return false;
                                    }

                                    var2 = var8;
                                    var4 = true;
                                    break label99;
                                 }
                              }

                              var1.add(var6);
                              continue;
                           }
                        }
                     } else {
                        if(var2 != null) {
                           return false;
                        }

                        var2 = var6;
                        var4 = true;
                     }
                  }
               }

               if(!var4) {
                  var1.add(var0);
                  var1.remove(var2);
                  var1.add(0, var2);
                  return true;
               }
               break;
            }
         }
      }
   }

   // $FF: renamed from: a (ca) java.util.HashSet
   public static HashSet method_697(class_46 var0) {
      HashSet var2;
      Iterator var1 = (var2 = new HashSet(var0.method_55(2, 1))).iterator();

      while(var1.hasNext()) {
         if(((class_46)var1.next()).method_58(2).size() > 1) {
            var1.remove();
         }
      }

      return var2;
   }

   // $FF: renamed from: b (java.util.List) java.util.List
   public static List method_698(List var0) {
      ArrayList var1 = new ArrayList();
      Iterator var2 = var0.iterator();

      while(var2.hasNext()) {
         class_86 var3 = (class_86)var2.next();
         var1.add(var3.method_261());
      }

      return var1;
   }
}
