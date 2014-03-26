import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

// $FF: renamed from: cg
public final class class_163 {

   // $FF: renamed from: <init> () void
   public void method_740() {
      super();
   }

   // $FF: renamed from: a (cI) void
   public static void method_741(class_139 var0) {
      ArrayList var1 = new ArrayList();
      Iterator var3 = var0.method_621().iterator();

      Iterator var6;
      while(var3.hasNext()) {
         class_201 var2 = (class_201)var3.next();
         boolean var4 = false;
         var6 = var1.iterator();

         while(true) {
            if(var6.hasNext()) {
               Object[] var5;
               if((var5 = (Object[])var6.next())[0] != var2.method_987() || !class_129.method_558(var2.method_990(), var5[1])) {
                  continue;
               }

               ((HashSet)var5[2]).addAll(var2.method_989());
               var4 = true;
            }

            if(!var4) {
               var1.add(new Object[]{var2.method_987(), var2.method_990(), new HashSet(var2.method_989()), var2});
            }
            break;
         }
      }

      var3 = var1.iterator();

      while(var3.hasNext()) {
         Object[] var13;
         if((var13 = (Object[])var3.next())[1] != null) {
            class_191 var16;
            class_61 var15 = (var16 = (class_191)var13[0]).method_925();
            var6 = null;
            class_5 var17;
            if(var15.method_176() > 0 && ((var17 = var15.method_171(0)).field_5 == 87 || var17.field_5 == 58)) {
               HashSet var7 = new HashSet((HashSet)var13[2]);
               Iterator var9 = var1.iterator();

               while(var9.hasNext()) {
                  Object[] var8 = (Object[])var9.next();
                  if(var13 != var8) {
                     HashSet var10 = new HashSet((HashSet)var8[2]);
                     if(!var7.contains(var8[0]) && !var10.contains(var16) && (var8[1] == null || var10.containsAll(var7))) {
                        if(var8[1] == null) {
                           var10.retainAll(var7);
                        } else {
                           var10.removeAll(var7);
                        }

                        if(!var10.isEmpty()) {
                           class_191 var19 = var16;
                           if(var15.method_176() > 1) {
                              class_191 var10000 = new class_191;
                              var10000.method_910(++var0.field_346);
                              var19 = var10000;
                              class_62 var14 = new class_62;
                              var14.method_165();
                              class_62 var11 = var14;
                              var14.method_168(var17.method_16(), -1);
                              var19.method_926(var11);
                              var0.method_618().method_655(var19, Integer.valueOf(var19.field_488));
                              ArrayList var18;
                              (var18 = new ArrayList()).addAll(var16.method_924());
                              var18.addAll(var16.method_929());
                              Iterator var12 = var18.iterator();

                              while(var12.hasNext()) {
                                 ((class_191)var12.next()).method_917(var16, var19);
                              }

                              var12 = var0.method_621().iterator();

                              while(var12.hasNext()) {
                                 class_201 var20;
                                 if((var20 = (class_201)var12.next()).method_987() == var16) {
                                    var20.method_988(var19);
                                 } else if(var20.method_989().contains(var16)) {
                                    var19.method_920(var20.method_987());
                                    var20.method_989().add(var19);
                                 }
                              }

                              var19.method_915(var16);
                              if(var0.method_619() == var16) {
                                 var0.method_620(var19);
                              }

                              var15.method_170(0);
                           }

                           var19.method_920((class_191)var8[0]);
                           ((class_201)var8[3]).method_989().add(var19);
                           var15 = (var16 = ((class_201)var13[3]).method_987()).method_925();
                        }
                     }
                  }
               }
            }
         }
      }

   }

   // $FF: renamed from: b (cI) void
   public static void method_742(class_139 var0) {
      HashSet var1 = new HashSet();
      Iterator var3 = var0.method_621().iterator();

      while(var3.hasNext()) {
         class_201 var10000 = (class_201)var3.next();
         class_191 var2 = null;
         var2 = var10000.method_987();
         if(!var1.contains(var2)) {
            var1.add(var2);
            class_191 var7 = new class_191;
            var7.method_910(++var0.field_346);
            class_191 var4 = var7;
            var0.method_618().method_655(var4, Integer.valueOf(var4.field_488));
            ArrayList var5;
            (var5 = new ArrayList()).addAll(var2.method_929());
            Iterator var6 = var5.iterator();

            while(var6.hasNext()) {
               ((class_191)var6.next()).method_917(var2, var4);
            }

            var6 = var0.method_621().iterator();

            while(var6.hasNext()) {
               class_201 var8;
               if((var8 = (class_201)var6.next()).method_987() == var2) {
                  var8.method_988(var4);
               } else if(var8.method_989().contains(var2)) {
                  var4.method_920(var8.method_987());
                  var8.method_989().add(var4);
               }
            }

            var4.method_915(var2);
            if(var0.method_619() == var2) {
               var0.method_620(var4);
            }
         }
      }

   }

   // $FF: renamed from: c (cI) void
   public static void method_743(class_139 var0) {
      List var5;
      int var1 = (var5 = var0.method_621()).size() - 1;

      while(var1 >= 0) {
         class_201 var2 = (class_201)var5.get(var1);
         boolean var3 = true;
         Iterator var4 = var2.method_989().iterator();

         while(true) {
            if(var4.hasNext()) {
               if(((class_191)var4.next()).method_925().method_177()) {
                  continue;
               }

               var3 = false;
            }

            if(var3) {
               var4 = var2.method_989().iterator();

               while(var4.hasNext()) {
                  ((class_191)var4.next()).method_921(var2.method_987());
               }

               var5.remove(var1);
            }

            --var1;
            break;
         }
      }

   }

   // $FF: renamed from: d (cI) void
   public static void method_744(class_139 var0) {
      class_102 var10000 = new class_102;
      class_174 var10002 = new class_174;
      var10002.method_801(var0);
      var10000.method_379(var10002);
      class_102 var1 = var10000;
      var10000.method_380();

      List var13;
      for(int var2 = (var13 = var0.method_621()).size() - 1; var2 >= 0; --var2) {
         class_201 var3;
         class_191 var4 = (var3 = (class_201)var13.get(var2)).method_987();
         List var5;
         if((var5 = var3.method_989()).contains(var4)) {
            class_102 var6 = var1;
            var3 = var3;
            ArrayList var7 = new ArrayList();
            LinkedList var8 = new LinkedList();
            HashSet var9 = new HashSet();
            class_191 var10 = var3.method_987();
            var8.addFirst(var10);

            while(!var8.isEmpty()) {
               class_191 var11 = (class_191)var8.removeFirst();
               var9.add(var11);
               if(var3.method_989().contains(var11) && var6.method_381(var11, var10)) {
                  var7.add(var11);
                  ArrayList var12;
                  (var12 = new ArrayList(var11.method_927())).addAll(var11.method_928());
                  Iterator var16 = var12.iterator();

                  while(var16.hasNext()) {
                     var11 = (class_191)var16.next();
                     if(!var9.contains(var11)) {
                        var8.add(var11);
                     }
                  }
               }
            }

            if(var7.size() < var5.size() || var5.size() == 1) {
               Iterator var15 = var7.iterator();

               while(var15.hasNext()) {
                  class_191 var14;
                  (var14 = (class_191)var15.next()).method_921(var4);
                  var5.remove(var14);
               }
            }

            if(var5.isEmpty()) {
               var13.remove(var2);
            }
         }
      }

   }

   // $FF: renamed from: e (cI) boolean
   public static boolean method_745(class_139 var0) {
      class_191 var1 = var0.method_619();
      HashMap var2 = new HashMap();

      Iterator var3;
      HashSet var4;
      class_201 var7;
      for(var3 = var0.method_621().iterator(); var3.hasNext(); var4.addAll(var7.method_989())) {
         var7 = (class_201)var3.next();
         if((var4 = (HashSet)var2.get(var7.method_987())) == null) {
            var2.put(var7.method_987(), var4 = new HashSet());
         }
      }

      var3 = var2.entrySet().iterator();

      Entry var8;
      do {
         do {
            if(!var3.hasNext()) {
               return false;
            }

            var8 = (Entry)var3.next();
            var4 = new HashSet();
            Iterator var5 = ((HashSet)var8.getValue()).iterator();

            while(var5.hasNext()) {
               class_191 var9 = (class_191)var5.next();
               HashSet var6;
               (var6 = new HashSet(var9.method_924())).removeAll((Collection)var8.getValue());
               if(!var6.isEmpty()) {
                  var4.add(var9);
               }
            }
         } while(var4.isEmpty());
      } while(var4.size() <= 1 && !((HashSet)var8.getValue()).contains(var1));

      return true;
   }
}
