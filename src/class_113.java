import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

// $FF: renamed from: r
public final class class_113 {

   // $FF: renamed from: <init> () void
   public void method_442() {
      super();
   }

   // $FF: renamed from: a (cI) void
   public static void method_443(class_139 var0) {
      LinkedList var1 = new LinkedList();
      HashSet var2 = new HashSet();
      var1.add(var0.method_619());
      var2.add(var0.method_619());

      while(!var1.isEmpty()) {
         class_191 var3 = (class_191)var1.removeFirst();
         ArrayList var4;
         (var4 = new ArrayList(var3.method_927())).addAll(var3.method_928());
         Iterator var7 = var4.iterator();

         while(var7.hasNext()) {
            var3 = (class_191)var7.next();
            if(!var2.contains(var3)) {
               var1.add(var3);
               var2.add(var3);
            }
         }
      }

      HashSet var5;
      (var5 = new HashSet(var0.method_618())).removeAll(var2);
      Iterator var6 = var5.iterator();

      while(var6.hasNext()) {
         class_191 var8 = (class_191)var6.next();
         var0.method_604(var8);
      }

   }

   // $FF: renamed from: b (cI) void
   public static void method_444(class_139 var0) {
      class_146 var1 = var0.method_618();

      while(true) {
         boolean var2 = false;
         int var3 = var1.size() - 1;

         while(true) {
            if(var3 >= 0) {
               class_191 var4 = (class_191)var1.get(var3);
               if(!method_445(var0, var4, false)) {
                  --var3;
                  continue;
               }

               var2 = true;
            }

            if(!var2) {
               return;
            }
            break;
         }
      }
   }

   // $FF: renamed from: a (cI, bT, boolean) boolean
   private static boolean method_445(class_139 var0, class_191 var1, boolean var2) {
      boolean var3 = false;
      if(var1.method_925().method_177()) {
         if(var1.method_927().size() > 1) {
            if(var1.method_924().size() > 1) {
               throw new RuntimeException("ERROR: empty block with multiple predecessors and successors found");
            }

            if(!var2) {
               throw new RuntimeException("ERROR: empty block with multiple successors found");
            }
         }

         HashSet var4 = new HashSet(var0.method_622().method_924());
         if(var1.method_929().isEmpty() && (!var4.contains(var1) || var1.method_924().size() == 1)) {
            class_191 var10;
            if(var4.contains(var1) && ((var10 = (class_191)var1.method_924().get(0)).method_927().size() != 1 || !var10.method_925().method_177() && var10.method_925().method_172().field_6 == 3)) {
               return false;
            }

            List var11;
            for(int var5 = (var11 = var0.method_621()).size() - 1; var5 >= 0; --var5) {
               class_201 var6;
               List var7;
               if((var7 = (var6 = (class_201)var11.get(var5)).method_989()).size() == 1 && var7.get(0) == var1) {
                  if(!class_181.method_846("rer")) {
                     return false;
                  }

                  var1.method_921(var6.method_987());
                  var11.remove(var5);
                  var3 = true;
               }
            }

            HashSet var12 = new HashSet(var1.method_927());
            HashSet var13 = new HashSet(var1.method_924());
            Iterator var8;
            Iterator var9;
            class_191 var14;
            if(var2) {
               (var14 = (class_191)var1.method_924().get(0)).method_916(var1);
               ArrayList var10000 = new ArrayList(var1.method_927());
               var9 = null;
               var8 = var10000.iterator();

               while(var8.hasNext()) {
                  var10 = (class_191)var8.next();
                  var1.method_916(var10);
                  var14.method_915(var10);
               }
            } else {
               var9 = var13.iterator();

               while(var9.hasNext()) {
                  var14 = (class_191)var9.next();
                  var8 = var12.iterator();

                  while(var8.hasNext()) {
                     var10 = (class_191)var8.next();
                     var14.method_917(var1, var10);
                  }
               }
            }

            HashSet var15;
            if((var15 = var0.method_623()).contains(var1)) {
               var15.remove(var1);
               var15.add((class_191)var13.iterator().next());
            }

            if(var0.method_619() == var1) {
               if(var12.size() != 1) {
                  throw new RuntimeException("multiple or no entry blocks!");
               }

               var0.method_620((class_191)var12.iterator().next());
            }

            var0.method_604(var1);
            if(var3) {
               method_443(var0);
            }
         }
      }

      return var3;
   }

   // $FF: renamed from: a (cI, bT, bT) boolean
   public static boolean method_446(class_139 var0, class_191 var1, class_191 var2) {
      HashSet var3 = new HashSet();
      if(var1 == var2) {
         return true;
      } else {
         LinkedList var4;
         (var4 = new LinkedList()).add(var1);

         while(!var4.isEmpty()) {
            var1 = (class_191)var4.remove(0);
            if(!var3.contains(var1)) {
               var3.add(var1);
               if(var1 == var0.method_619()) {
                  return false;
               }

               int var5;
               class_191 var6;
               for(var5 = 0; var5 < var1.method_924().size(); ++var5) {
                  var6 = (class_191)var1.method_924().get(var5);
                  if(!var3.contains(var6) && var6 != var2) {
                     var4.add(var6);
                  }
               }

               for(var5 = 0; var5 < var1.method_929().size(); ++var5) {
                  var6 = (class_191)var1.method_929().get(var5);
                  if(!var3.contains(var6) && var6 != var2) {
                     var4.add(var6);
                  }
               }
            }
         }

         return true;
      }
   }

   // $FF: renamed from: c (cI) void
   public static void method_447(class_139 var0) {
      Iterator var2 = var0.method_618().iterator();

      while(var2.hasNext()) {
         class_191 var1;
         class_5 var3;
         if((var3 = (var1 = (class_191)var2.next()).method_912()) != null && var3.field_5 == 167) {
            var1.method_925().method_170(var1.method_925().method_176() - 1);
         }
      }

      method_444(var0);
   }

   // $FF: renamed from: d (cI) void
   public static void method_448(class_139 var0) {
      Iterator var2 = var0.method_618().iterator();

      while(var2.hasNext()) {
         class_191 var1;
         class_61 var3;
         int var4;
         if((var4 = (var3 = (var1 = (class_191)var2.next()).method_925()).method_176()) > 0 && var4 < 3) {
            boolean var5 = false;
            if(var3.method_172().field_5 >= 172 && var3.method_172().field_5 <= 177) {
               label58: {
                  if(var4 != 1) {
                     if(var3.method_172().field_5 == 177) {
                        break label58;
                     }

                     switch(var3.method_171(0).field_5) {
                     case 1:
                     case 9:
                     case 10:
                     case 11:
                     case 12:
                     case 13:
                     case 14:
                     case 15:
                     case 16:
                     case 17:
                     case 18:
                     case 19:
                     case 20:
                     case 21:
                     case 22:
                     case 23:
                     case 24:
                     case 25:
                        break;
                     case 2:
                     case 3:
                     case 4:
                     case 5:
                     case 6:
                     case 7:
                     case 8:
                     default:
                        break label58;
                     }
                  }

                  var5 = true;
               }
            }

            if(var5) {
               class_191 var6;
               class_191 var13;
               class_201 var10000;
               Iterator var14;
               if(!var1.method_924().isEmpty()) {
                  HashSet var8 = new HashSet();
                  HashSet var11 = new HashSet();
                  var5 = true;

                  for(Iterator var7 = var1.method_924().iterator(); var7.hasNext(); var8.addAll(var6.method_928())) {
                     var6 = (class_191)var7.next();
                     if(var5) {
                        var11.addAll(var6.method_928());
                        var5 = false;
                     } else {
                        var11.retainAll(var6.method_928());
                     }
                  }

                  var11.removeAll(var1.method_928());
                  var6 = (class_191)var1.method_924().get(0);
                  Iterator var12 = var11.iterator();

                  while(var12.hasNext()) {
                     class_191 var15 = (class_191)var12.next();
                     var10000 = var0.method_605(var15, var6);
                     var14 = null;
                     var10000.method_989().add(var1);
                     var1.method_920(var15);
                  }

                  HashSet var17;
                  (var17 = new HashSet(var1.method_928())).removeAll(var8);
                  var14 = var17.iterator();

                  while(var14.hasNext()) {
                     var13 = (class_191)var14.next();
                     class_201 var9;
                     if((var9 = var0.method_605(var13, var1)).method_989().size() > 1) {
                        var9.method_989().remove(var1);
                        var1.method_921(var13);
                     }
                  }
               }

               class_191 var10;
               if(var1.method_924().size() == 1 && var1.method_929().isEmpty() && (var10 = (class_191)var1.method_924().get(0)).method_927().size() == 1) {
                  var14 = var10.method_928().iterator();

                  while(var14.hasNext()) {
                     var13 = (class_191)var14.next();
                     if(!var1.method_928().contains(var13)) {
                        var10000 = var0.method_605(var13, var10);
                        var6 = null;
                        var10000.method_989().add(var1);
                        var1.method_920(var13);
                     }
                  }

                  var14 = (new HashSet(var1.method_928())).iterator();

                  while(var14.hasNext()) {
                     var13 = (class_191)var14.next();
                     class_201 var16;
                     if(!var10.method_928().contains(var13) && (var16 = var0.method_605(var13, var1)).method_989().size() > 1) {
                        var16.method_989().remove(var1);
                        var1.method_921(var13);
                     }
                  }
               }
            }
         }
      }

   }

   // $FF: renamed from: e (cI) void
   public static void method_449(class_139 var0) {
      boolean var1;
      do {
         var1 = false;
         Iterator var3 = var0.method_618().iterator();

         while(var3.hasNext()) {
            class_191 var2;
            class_61 var4 = (var2 = (class_191)var3.next()).method_925();
            class_191 var5;
            if(var2.method_927().size() == 1 && (var5 = (class_191)var2.method_927().get(0)) != var0.method_622() && (var4.method_177() || var4.method_172().field_6 != 3) && var5.method_924().size() == 1 && var5.method_929().isEmpty() && var5 != var0.method_619()) {
               boolean var6 = true;
               Iterator var8 = var0.method_621().iterator();

               while(var8.hasNext()) {
                  class_201 var7;
                  if((var7 = (class_201)var8.next()).method_989().contains(var2) ^ var7.method_989().contains(var5)) {
                     var6 = false;
                     break;
                  }
               }

               if(var6) {
                  class_61 var10 = var5.method_925();
                  class_61 var9 = var4;

                  for(int var11 = 0; var11 < var10.method_176(); ++var11) {
                     var9.method_168(var10.method_171(var11), -1);
                  }

                  var5.method_925().method_167();
                  method_445(var0, var5, true);
                  var1 = true;
                  break;
               }
            }
         }
      } while(var1);

   }
}
