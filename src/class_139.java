import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

// $FF: renamed from: cI
public final class class_139 implements class_1 {

   // $FF: renamed from: a int
   public int field_346;
   // $FF: renamed from: b cE
   private class_146 field_347;
   // $FF: renamed from: c bT
   private class_191 field_348;
   // $FF: renamed from: d bT
   private class_191 field_349;
   // $FF: renamed from: f java.util.List
   private List field_350;
   // $FF: renamed from: g java.util.HashMap
   private HashMap field_351;
   // $FF: renamed from: h java.util.HashSet
   private HashSet field_352;


   // $FF: renamed from: <init> (cQ) void
   public void method_601(class_61 var1) {
      super();
      this.field_346 = 0;
      this.field_352 = new HashSet();
      short[] var2 = method_606(var1);
      HashMap var3 = new HashMap();
      class_146 var4 = this.method_607(var2, var1, var3);
      this.field_347 = var4;
      method_608(var4, var3);
      this.method_609(var1, var3);
      this.method_610();
      this.method_615();
   }

   // $FF: renamed from: g () void
   private void method_602() {
      for(Iterator var1 = this.field_347.iterator(); var1.hasNext(); ((class_191)var1.next()).field_489 = 0) {
         ;
      }

   }

   public final String toString() {
      StringBuffer var1 = new StringBuffer();
      Iterator var3 = this.field_347.iterator();

      while(var3.hasNext()) {
         class_191 var2 = (class_191)var3.next();
         var1.append("----- Block " + var2.field_488 + " -----\r\n");
         var1.append(var2.toString());
         var1.append("----- Edges -----\r\n");
         List var4 = var2.method_927();

         int var5;
         for(var5 = 0; var5 < var4.size(); ++var5) {
            var1.append(">>>>>>>>(regular) Block " + ((class_191)var4.get(var5)).field_488 + "\r\n");
         }

         var4 = var2.method_928();

         for(var5 = 0; var5 < var4.size(); ++var5) {
            class_191 var6 = (class_191)var4.get(var5);
            class_201 var7 = this.method_605(var6, var2);
            var1.append(">>>>>>>>(exception) Block " + var6.field_488 + "\t" + (var7 == null?"ERROR: range not found!":var7.method_990()) + "\r\n");
         }

         var1.append("----- ----- -----\r\n");
      }

      return var1.toString();
   }

   // $FF: renamed from: a (bn) void
   public final void method_603(class_128 var1) {
      class_139 var2 = this;

      while(true) {
         class_139 var3 = var2;
         ArrayList var4 = new ArrayList();
         Iterator var6 = var2.field_351.entrySet().iterator();

         while(var6.hasNext()) {
            Entry var5;
            class_191 var7 = (class_191)(var5 = (Entry)var6.next()).getKey();
            class_191 var8 = (class_191)var5.getValue();
            var4.add(new Object[]{var7, var3.method_611(var7, var8), var8});
         }

         ArrayList var12 = new ArrayList();
         Iterator var15 = var4.iterator();

         while(var15.hasNext()) {
            Object[] var14 = (Object[])var15.next();

            int var17;
            for(var17 = 0; var17 < var12.size() && !((HashSet)((Object[])var12.get(var17))[1]).contains(var14[0]); ++var17) {
               ;
            }

            var12.add(var17, var14);
         }

         int var13 = 0;

         label42:
         while(true) {
            boolean var10000;
            if(var13 >= var12.size()) {
               var10000 = false;
            } else {
               Object[] var16;
               HashSet var19 = (HashSet)(var16 = (Object[])var12.get(var13))[1];
               int var11 = var13 + 1;

               while(true) {
                  if(var11 >= var12.size()) {
                     ++var13;
                     continue label42;
                  }

                  Object[] var9;
                  HashSet var10 = (HashSet)(var9 = (Object[])var12.get(var11))[1];
                  if(!var19.contains(var9[0]) && !var10.contains(var16[0])) {
                     HashSet var18;
                     (var18 = new HashSet(var19)).retainAll(var10);
                     if(!var18.isEmpty()) {
                        var3.method_612((class_191)var16[0], (class_191)var16[2], var18);
                        var10000 = true;
                        break;
                     }
                  }

                  ++var11;
               }
            }

            if(!var10000) {
               this.method_614(var1.method_553().method_973(), this.field_348, class_169.method_780(var1));
               this.method_602();
               class_113.method_444(this);
               return;
            }
            break;
         }
      }
   }

   // $FF: renamed from: a (bT) void
   public final void method_604(class_191 var1) {
      while(var1.method_927().size() > 0) {
         var1.method_916((class_191)var1.method_927().get(0));
      }

      while(var1.method_928().size() > 0) {
         var1.method_921((class_191)var1.method_928().get(0));
      }

      while(var1.method_924().size() > 0) {
         ((class_191)var1.method_924().get(0)).method_916(var1);
      }

      while(var1.method_929().size() > 0) {
         ((class_191)var1.method_929().get(0)).method_921(var1);
      }

      this.field_349.method_914(var1);
      this.field_347.method_658(Integer.valueOf(var1.field_488));

      for(int var2 = this.field_350.size() - 1; var2 >= 0; --var2) {
         class_201 var3;
         if((var3 = (class_201)this.field_350.get(var2)).method_987() == var1) {
            this.field_350.remove(var2);
         } else {
            List var5;
            (var5 = var3.method_989()).remove(var1);
            if(var5.isEmpty()) {
               this.field_350.remove(var2);
            }
         }
      }

      Iterator var4 = this.field_351.entrySet().iterator();

      while(var4.hasNext()) {
         Entry var6;
         if((var6 = (Entry)var4.next()).getKey() == var1 || var6.getValue() == var1) {
            var4.remove();
         }
      }

   }

   // $FF: renamed from: a (bT, bT) ai
   public final class_201 method_605(class_191 var1, class_191 var2) {
      for(int var3 = this.field_350.size() - 1; var3 >= 0; --var3) {
         class_201 var4;
         if((var4 = (class_201)this.field_350.get(var3)).method_987() == var1 && var4.method_989().contains(var2)) {
            return var4;
         }
      }

      return null;
   }

   // $FF: renamed from: a (cQ) short[]
   private static short[] method_606(class_61 var0) {
      int var1;
      short[] var2 = new short[var1 = var0.method_176()];
      HashSet var3 = new HashSet();
      Iterator var5 = var0.method_182().method_591().iterator();

      while(var5.hasNext()) {
         class_84 var4 = (class_84)var5.next();
         var3.add(Integer.valueOf(var4.field_142));
         var3.add(Integer.valueOf(var4.field_143));
         var3.add(Integer.valueOf(var4.field_144));
      }

      for(int var8 = 0; var8 < var1; ++var8) {
         if(var3.contains(new Integer(var8))) {
            var2[var8] = 1;
         }

         class_5 var9;
         switch((var9 = var0.method_171(var8)).field_6) {
         case 2:
            var2[((class_34)var9).field_12] = 1;
         case 3:
            int[] var6;
            class_29 var10;
            for(int var7 = (var6 = (var10 = (class_29)var9).method_20()).length - 1; var7 >= 0; --var7) {
               var2[var6[var7]] = 1;
            }

            var2[var10.method_21()] = 1;
            if(var8 + 1 < var1) {
               var2[var8 + 1] = 1;
            }
         case 4:
         case 5:
         default:
            break;
         case 6:
            if(var8 + 1 < var1) {
               var2[var8 + 1] = 1;
            }
         }
      }

      var2[0] = 1;
      return var2;
   }

   // $FF: renamed from: a (short[], cQ, java.util.HashMap) cE
   private class_146 method_607(short[] var1, class_61 var2, HashMap var3) {
      class_146 var10000 = new class_146;
      var10000.method_653();
      class_146 var4 = var10000;
      class_62 var5 = null;
      ArrayList var6 = null;
      int var7 = var1.length;
      short var8 = 0;
      int var9 = 0;
      class_191 var10 = null;

      for(int var11 = 0; var11 < var7; ++var11) {
         if(var1[var11] == 1) {
            class_191 var12 = new class_191;
            var12.method_909();
            var10 = var12;
            var12.field_488 = ++var8;
            class_62 var13 = new class_62;
            var13.method_165();
            var5 = var13;
            var6 = new ArrayList();
            var10.method_926(var5);
            var10.method_923(var6);
            var4.method_655(var10, Integer.valueOf(var10.field_488));
            var9 = var2.method_173(var11);
         }

         var1[var11] = var8;
         var3.put(Integer.valueOf(var11), var10);
         var5.method_168(var2.method_171(var11), var2.method_173(var11) - var9);
         var6.add(Integer.valueOf(var2.method_173(var11)));
      }

      this.field_346 = var8;
      return var4;
   }

   // $FF: renamed from: a (java.util.List, java.util.HashMap) void
   private static void method_608(List var0, HashMap var1) {
      for(int var2 = 0; var2 < var0.size(); ++var2) {
         class_191 var3;
         class_5 var4;
         class_5 var5;
         boolean var9 = (var5 = var4 = (var3 = (class_191)var0.get(var2)).method_912()).field_5 != 167 && var5.field_5 != 200 && var5.field_5 != 169 && (var5.field_5 < 172 || var5.field_5 > 177) && var5.field_5 != 191 && var5.field_5 != 168 && var5.field_5 != 170 && var5.field_5 != 171;
         class_191 var8;
         switch(var4.field_6) {
         case 2:
            int var10 = ((class_34)var4).field_12;
            var8 = (class_191)var1.get(Integer.valueOf(var10));
            var3.method_915(var8);
            break;
         case 3:
            class_29 var10000 = (class_29)var4;
            Object var6 = null;
            int[] var11 = var10000.method_20();
            var8 = (class_191)var1.get(Integer.valueOf(((class_29)var4).method_21()));
            var3.method_915(var8);

            for(int var7 = 0; var7 < var11.length; ++var7) {
               var8 = (class_191)var1.get(Integer.valueOf(var11[var7]));
               var3.method_915(var8);
            }
         }

         if(var9 && var2 < var0.size() - 1) {
            var8 = (class_191)var0.get(var2 + 1);
            var3.method_915(var8);
         }
      }

   }

   // $FF: renamed from: a (cQ, java.util.HashMap) void
   private void method_609(class_61 var1, HashMap var2) {
      this.field_350 = new ArrayList();
      Iterator var3 = var1.method_182().method_591().iterator();

      while(var3.hasNext()) {
         class_84 var9 = (class_84)var3.next();
         class_191 var4 = (class_191)var2.get(Integer.valueOf(var9.field_142));
         class_191 var5 = (class_191)var2.get(Integer.valueOf(var9.field_143));
         class_191 var6 = (class_191)var2.get(Integer.valueOf(var9.field_144));
         ArrayList var7 = new ArrayList();

         for(int var10 = var4.field_488; var10 < var5.field_488; ++var10) {
            class_191 var8 = (class_191)this.field_347.method_659(Integer.valueOf(var10));
            var7.add(var8);
            var8.method_920(var6);
         }

         List var10000 = this.field_350;
         class_201 var10001 = new class_201;
         var10001.method_985(var7, var6, var9.field_145);
         var10000.add(var10001);
      }

   }

   // $FF: renamed from: h () void
   private void method_610() {
      HashMap var1 = new HashMap();
      Iterator var3 = this.field_347.iterator();

      while(var3.hasNext()) {
         class_191 var2;
         if((var2 = (class_191)var3.next()).method_925().method_172().field_5 == 168) {
            LinkedList var4 = new LinkedList();
            LinkedList var5 = new LinkedList();
            HashSet var6 = new HashSet();
            var4.add(var2);
            var5.add(new LinkedList());

            while(!var4.isEmpty()) {
               var2 = (class_191)var4.removeFirst();
               LinkedList var7 = (LinkedList)var5.removeFirst();
               var6.add(var2);
               class_191 var8;
               switch(var2.method_925().method_172().field_5) {
               case 168:
                  var7.add(var2);
                  break;
               case 169:
                  var8 = (class_191)var7.getLast();
                  class_191 var9;
                  if((var9 = (class_191)this.field_347.method_659(Integer.valueOf(var8.field_488 + 1))) == null) {
                     throw new RuntimeException("ERROR: last instruction jsr");
                  }

                  if(!var2.method_922(var9)) {
                     var2.method_915(var9);
                  }

                  var7.removeLast();
                  var1.put(var8, var9);
               }

               if(!var7.isEmpty()) {
                  Iterator var10 = var2.method_927().iterator();

                  while(var10.hasNext()) {
                     var8 = (class_191)var10.next();
                     if(!var6.contains(var8)) {
                        var4.add(var8);
                        var5.add(new LinkedList(var7));
                     }
                  }
               }
            }
         }
      }

      this.field_351 = var1;
   }

   // $FF: renamed from: b (bT, bT) java.util.HashSet
   private HashSet method_611(class_191 var1, class_191 var2) {
      HashSet var3 = new HashSet();
      LinkedList var4;
      (var4 = new LinkedList()).add(var1);
      class_191 var5 = (class_191)var1.method_927().get(0);

      while(!var4.isEmpty()) {
         class_191 var6 = (class_191)var4.remove(0);

         for(int var7 = 0; var7 < 2; ++var7) {
            List var8;
            if(var7 == 0) {
               if(var6.method_912().field_5 == 169 && var6.method_927().contains(var2)) {
                  continue;
               }

               var8 = var6.method_927();
            } else {
               if(var6 == var1) {
                  continue;
               }

               var8 = var6.method_928();
            }

            label60:
            for(int var9 = var8.size() - 1; var9 >= 0; --var9) {
               class_191 var10 = (class_191)var8.get(var9);
               if(!var3.contains(var10)) {
                  if(var6 != var1) {
                     int var11;
                     for(var11 = 0; var11 < var10.method_924().size(); ++var11) {
                        if(!class_113.method_446(this, (class_191)var10.method_924().get(var11), var5)) {
                           continue label60;
                        }
                     }

                     for(var11 = 0; var11 < var10.method_929().size(); ++var11) {
                        if(!class_113.method_446(this, (class_191)var10.method_929().get(var11), var5)) {
                           continue label60;
                        }
                     }
                  }

                  if(var10 != this.field_349) {
                     var3.add(var10);
                  }

                  var4.add(var10);
               }
            }
         }
      }

      return var3;
   }

   // $FF: renamed from: a (bT, bT, java.util.HashSet) void
   private void method_612(class_191 var1, class_191 var2, HashSet var3) {
      LinkedList var4 = new LinkedList();
      HashMap var5 = new HashMap();
      var4.add(var1);
      var5.put(Integer.valueOf(var1.field_488), var1);

      while(!var4.isEmpty()) {
         class_191 var6 = (class_191)var4.remove(0);

         for(int var7 = 0; var7 < 2; ++var7) {
            List var8;
            if(var7 == 0) {
               if(var6.method_912().field_5 == 169 && var6.method_927().contains(var2)) {
                  continue;
               }

               var8 = var6.method_927();
            } else {
               if(var6 == var1) {
                  continue;
               }

               var8 = var6.method_928();
            }

            for(int var9 = var8.size() - 1; var9 >= 0; --var9) {
               class_191 var10;
               Integer var11 = Integer.valueOf((var10 = (class_191)var8.get(var9)).field_488);
               if(var5.containsKey(var11)) {
                  var6.method_917(var10, (class_191)var5.get(var11));
               } else if(var3.contains(var10)) {
                  class_191 var12;
                  (var12 = (class_191)var10.clone()).field_488 = ++this.field_346;
                  int var13;
                  if(var12.method_912().field_5 == 169 && var10.method_927().contains(var2)) {
                     var12.method_915(var2);
                     var10.method_916(var2);
                  } else {
                     for(var13 = 0; var13 < var10.method_927().size(); ++var13) {
                        var12.method_915((class_191)var10.method_927().get(var13));
                     }
                  }

                  for(var13 = 0; var13 < var10.method_928().size(); ++var13) {
                     var12.method_920((class_191)var10.method_928().get(var13));
                  }

                  var4.add(var12);
                  var5.put(var11, var12);
                  if(this.field_349.method_924().contains(var10)) {
                     this.field_349.method_913(var12);
                  }

                  var6.method_917(var10, var12);
                  this.field_347.method_655(var12, Integer.valueOf(var12.field_488));
               } else {
                  var5.put(var11, var10);
               }
            }
         }
      }

      this.method_613(var3, var5);
   }

   // $FF: renamed from: a (java.util.HashSet, java.util.HashMap) void
   private void method_613(HashSet var1, HashMap var2) {
      for(int var3 = this.field_350.size() - 1; var3 >= 0; --var3) {
         class_201 var4;
         Object var5 = (var4 = (class_201)this.field_350.get(var3)).method_989();
         HashSet var6;
         (var6 = new HashSet(var1)).retainAll((Collection)var5);
         if(var6.size() > 0) {
            if(var6.size() == ((List)var5).size()) {
               var5 = new ArrayList();
               class_201 var10000 = new class_201;
               var10000.method_985((List)var5, (class_191)var2.get(Integer.valueOf(var4.method_987().field_488)), var4.method_990());
               var4 = var10000;
               this.field_350.add(var4);
            }

            Iterator var8 = var6.iterator();

            while(var8.hasNext()) {
               class_191 var7 = (class_191)var8.next();
               ((List)var5).add((class_191)var2.get(Integer.valueOf(var7.field_488)));
            }
         }
      }

   }

   // $FF: renamed from: a (bK, bT, aR) void
   private void method_614(class_203 var1, class_191 var2, class_169 var3) {
      class_118 var4 = var3.method_783();
      class_61 var5 = var2.method_925();

      int var6;
      for(var6 = 0; var6 < var5.method_176(); ++var6) {
         class_5 var7 = var5.method_171(var6);
         class_83 var8 = null;
         if(var7.field_5 == 58 || var7.field_5 == 87) {
            var8 = (class_83)var4.method_488(-1);
         }

         class_182.method_863(var3, var7, var1);
         switch(var7.field_5) {
         case 58:
         case 87:
            if(var8.field_133 == 9) {
               var5.method_170(var6);
               --var6;
            }
            break;
         case 168:
         case 169:
            var5.method_170(var6);
            --var6;
         }
      }

      var2.field_489 = 1;

      class_191 var10;
      for(var6 = 0; var6 < var2.method_927().size(); ++var6) {
         if((var10 = (class_191)var2.method_927().get(var6)).field_489 != 1) {
            this.method_614(var1, var10, var3.method_779());
         }
      }

      for(var6 = 0; var6 < var2.method_928().size(); ++var6) {
         if((var10 = (class_191)var2.method_928().get(var6)).field_489 != 1) {
            class_169 var10000 = new class_169;
            var10000.method_776();
            class_169 var11 = var10000;
            var10000.method_782(new ArrayList(var3.method_781()));
            class_118 var9 = var11.method_783();
            class_83 var10001 = new class_83;
            var10001.method_237(8, 0, (String)null);
            var9.method_483(var10001);
            this.method_614(var1, var10, var11);
         }
      }

   }

   // $FF: renamed from: i () void
   private void method_615() {
      this.field_348 = (class_191)this.field_347.get(0);
      class_191 var10001 = new class_191;
      var10001.method_909();
      this.field_349 = var10001;
      this.field_349.field_488 = ++this.field_346;
      class_191 var10000 = this.field_349;
      class_62 var3 = new class_62;
      var3.method_165();
      var10000.method_926(var3);
      Iterator var2 = this.field_347.iterator();

      while(var2.hasNext()) {
         class_191 var1;
         if((var1 = (class_191)var2.next()).method_927().isEmpty()) {
            this.field_349.method_913(var1);
         }
      }

   }

   // $FF: renamed from: a () java.util.List
   public final List method_616() {
      LinkedList var1 = new LinkedList();
      method_617(this.field_348, var1);
      return var1;
   }

   // $FF: renamed from: a (bT, java.util.List) void
   private static void method_617(class_191 var0, List var1) {
      LinkedList var2 = new LinkedList();
      LinkedList var3 = new LinkedList();
      HashSet var4 = new HashSet();
      var2.add(var0);
      var3.add(Integer.valueOf(0));

      while(!var2.isEmpty()) {
         var0 = (class_191)var2.getLast();
         int var5 = ((Integer)var3.removeLast()).intValue();
         var4.add(var0);
         ArrayList var6;
         (var6 = new ArrayList(var0.method_927())).addAll(var0.method_928());

         while(true) {
            if(var5 < var6.size()) {
               class_191 var7 = (class_191)var6.get(var5);
               if(var4.contains(var7)) {
                  ++var5;
                  continue;
               }

               var3.add(Integer.valueOf(var5 + 1));
               var2.add(var7);
               var3.add(Integer.valueOf(0));
            }

            if(var5 == var6.size()) {
               var1.add(0, var0);
               var2.removeLast();
            }
            break;
         }
      }

   }

   // $FF: renamed from: b () cE
   public final class_146 method_618() {
      return this.field_347;
   }

   // $FF: renamed from: c () bT
   public final class_191 method_619() {
      return this.field_348;
   }

   // $FF: renamed from: b (bT) void
   public final void method_620(class_191 var1) {
      this.field_348 = var1;
   }

   // $FF: renamed from: d () java.util.List
   public final List method_621() {
      return this.field_350;
   }

   // $FF: renamed from: e () bT
   public final class_191 method_622() {
      return this.field_349;
   }

   // $FF: renamed from: f () java.util.HashSet
   public final HashSet method_623() {
      return this.field_352;
   }
}
