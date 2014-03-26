import de.fernflower.main.extern.IFernflowerLogger;
import de.fernflower.main.extern.IIdentifierRenamer;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

// $FF: renamed from: dc
public class class_149 {

   // $FF: renamed from: a i
   private class_107 field_375;
   // $FF: renamed from: b de.fernflower.main.extern.IIdentifierRenamer
   private IIdentifierRenamer field_376;
   // $FF: renamed from: c u
   private class_110 field_377;
   // $FF: renamed from: d java.util.List
   private List field_378;
   // $FF: renamed from: e java.util.List
   private List field_379;
   // $FF: renamed from: f java.util.Map
   private Map field_380;
   // $FF: renamed from: g java.util.Map
   private Map field_381;
   // $FF: renamed from: h java.util.List
   private List field_382;
   // $FF: renamed from: i java.util.List
   private List field_383;


   // $FF: renamed from: <init> () void
   public void method_681() {
      super();
      this.field_378 = new ArrayList();
      this.field_379 = new ArrayList();
      this.field_380 = new HashMap();
      this.field_381 = new HashMap();
   }

   // $FF: renamed from: a (i) void
   public final void method_682(class_107 var1) {
      try {
         this.field_375 = var1;
         String var2;
         if((var2 = (String)class_181.method_844("urc")) != null) {
            IFernflowerLogger var3;
            (var3 = class_181.method_859()).writeMessage("User supplied renamer class " + var2 + " found. Loading...", 2, 0);

            try {
               this.field_376 = (IIdentifierRenamer)class_149.class.getClassLoader().loadClass(var2).newInstance();
               var3.writeMessage("Class " + var2 + " successfully loaded.", 2, 0);
            } catch (Exception var5) {
               var3.writeMessage("Class " + var2 + " couldn\'t be loaded.", 3, 0);
               if(var3.getShowStacktrace()) {
                  var5.printStackTrace();
               }
            }
         }

         if(this.field_376 == null) {
            class_167 var10001 = new class_167;
            var10001.method_767();
            this.field_376 = var10001;
         }

         class_110 var7 = new class_110;
         var7.method_416(this.field_376);
         this.field_377 = var7;
         this.method_693();
         this.field_382 = method_692(this.field_378);
         this.field_383 = method_692(this.field_379);
         this.method_689();
         this.method_683();
         this.method_688();
         this.method_686();
         class_181.method_858(this.field_377);
         var1.method_394();
      } catch (IOException var6) {
         throw new RuntimeException("Renaming failed!");
      }
   }

   // $FF: renamed from: a () void
   private void method_683() {
      ArrayList var1;
      (var1 = new ArrayList(this.field_383)).addAll(this.field_382);
      HashMap var2 = new HashMap();
      Iterator var3 = var1.iterator();

      while(var3.hasNext()) {
         class_82 var10000 = (class_82)var3.next();
         var1 = null;
         class_198 var8 = var10000.method_232();
         HashSet var4 = new HashSet();
         if(var8.field_527 != null) {
            Set var5 = null;
            if((var5 = (Set)var2.get((String)var8.field_527.field_106)) != null) {
               var4.addAll(var5);
            }
         }

         String[] var7;
         int var6 = (var7 = var8.method_975()).length;

         for(int var9 = 0; var9 < var6; ++var9) {
            String var12 = var7[var9];
            var4.addAll(this.method_684(var12, var2));
         }

         if(var4.size() > 1) {
            HashSet var11;
            (var11 = new HashSet(var4)).retainAll((Collection)this.field_381.keySet());
            if(!var11.isEmpty()) {
               var4.addAll((Collection)this.field_381.get(var11.iterator().next()));
            }

            Iterator var13 = var4.iterator();

            while(var13.hasNext()) {
               String var10 = (String)var13.next();
               this.field_381.put(var10, var4);
            }
         }
      }

   }

   // $FF: renamed from: a (java.lang.String, java.util.HashMap) java.util.Set
   private Set method_684(String var1, HashMap var2) {
      Object var3;
      if((var3 = (Set)var2.get(var1)) == null) {
         var3 = new HashSet();
         class_198 var4;
         if((var4 = this.field_375.method_393(var1)) != null) {
            String[] var8;
            int var7 = (var8 = var4.method_975()).length;

            for(int var6 = 0; var6 < var7; ++var6) {
               String var5 = var8[var6];
               ((Set)var3).addAll(this.method_684(var5, var2));
            }

            if(var4.method_979()) {
               ((Set)var3).add(var1);
            }
         }

         var2.put(var1, var3);
      }

      return (Set)var3;
   }

   // $FF: renamed from: a (V, java.util.Map, java.util.Set) java.util.Set
   private Set method_685(class_82 var1, Map var2, Set var3) {
      class_198 var4 = var1.method_232();
      HashSet var5 = new HashSet((Collection)Arrays.asList(var4.method_975()));
      HashSet var6 = new HashSet(var5);
      var5.addAll(var3);
      Iterator var8 = var1.method_233().iterator();

      while(var8.hasNext()) {
         var1 = (class_82)var8.next();
         var6.addAll(this.method_685(var1, var2, var5));
      }

      HashSet var7;
      (var7 = new HashSet(var5)).addAll(var6);
      var2.put(var4.field_528, var7);
      return var6;
   }

   // $FF: renamed from: b () void
   private void method_686() {
      HashMap var1 = new HashMap();
      HashMap var2 = new HashMap();
      Iterator var4 = this.field_382.iterator();

      while(var4.hasNext()) {
         class_82 var3;
         class_198 var5 = (var3 = (class_82)var4.next()).method_232();
         Set var6;
         if((var6 = (Set)var2.get(var5.field_528)) == null) {
            this.method_685(var3, var2 = new HashMap(), new HashSet());
            var6 = (Set)var2.get(var5.field_528);
         }

         HashMap var7 = new HashMap();
         HashMap var8 = new HashMap();
         if(var5.field_527 != null) {
            Map var9 = null;
            if((var9 = (Map)var1.get((String)var5.field_527.field_106)) != null) {
               var7.putAll(var9);
               var8.putAll(var9);
            }
         }

         Iterator var11 = var6.iterator();

         while(var11.hasNext()) {
            String var13 = (String)var11.next();
            Map var10;
            if((var10 = (Map)this.field_380.get(var13)) != null) {
               var8.putAll(var10);
            } else {
               class_198 var12;
               if((var12 = this.field_375.method_393(var13)) != null) {
                  var8.putAll(this.method_687(var12));
               }
            }
         }

         this.method_690(var5, var7, var8);
         if(!var3.method_233().isEmpty()) {
            var1.put(var5.field_528, var7);
         }
      }

   }

   // $FF: renamed from: a (bW) java.util.Map
   private Map method_687(class_198 var1) {
      HashMap var2 = new HashMap();
      String[] var6;
      int var5 = (var6 = var1.method_975()).length;

      for(int var4 = 0; var4 < var5; ++var4) {
         String var3 = var6[var4];
         Map var7;
         if((var7 = (Map)this.field_380.get(var3)) != null) {
            var2.putAll(var7);
         } else {
            class_198 var8;
            if((var8 = this.field_375.method_393(var3)) != null) {
               var2.putAll(this.method_687(var8));
            }
         }
      }

      this.method_690(var1, var2, var2);
      return var2;
   }

   // $FF: renamed from: c () void
   private void method_688() {
      HashMap var1 = new HashMap();
      Iterator var3 = this.field_383.iterator();

      while(var3.hasNext()) {
         class_82 var10000 = (class_82)var3.next();
         class_198 var2 = null;
         var2 = var10000.method_232();
         HashMap var4 = new HashMap();
         String[] var8;
         int var7 = (var8 = var2.method_975()).length;

         for(int var6 = 0; var6 < var7; ++var6) {
            String var5 = var8[var6];
            Map var9;
            if((var9 = (Map)var1.get(var5)) != null) {
               var4.putAll(var9);
            }
         }

         Set var10;
         if((var10 = (Set)this.field_381.get(var2.field_528)) != null) {
            Iterator var12 = var10.iterator();

            while(var12.hasNext()) {
               String var11 = (String)var12.next();
               Map var13;
               if((var13 = (Map)var1.get(var11)) != null) {
                  var4.putAll(var13);
               }
            }
         }

         this.method_690(var2, var4, var4);
         var1.put(var2.field_528, var4);
      }

      this.field_380 = var1;
   }

   // $FF: renamed from: d () void
   private void method_689() {
      ArrayList var1;
      (var1 = new ArrayList(this.field_383)).addAll(this.field_382);
      Iterator var2 = var1.iterator();

      while(var2.hasNext()) {
         class_198 var7;
         if((var7 = ((class_82)var2.next()).method_232()).method_979()) {
            String var3 = var7.field_528;
            String var4 = null;
            var4 = class_167.method_768(var3);
            if(this.field_376.toBeRenamed(1, var4, (String)null, (String)null)) {
               do {
                  var4 = class_167.method_769(var3, this.field_376.getNextClassname(var3, class_167.method_768(var3)));
               } while(this.field_375.method_399().containsKey(var4));

               this.field_377.method_418(var3, var4);
            }

            if(var7.field_527 != null) {
               this.field_377.method_417(var3, (String)var7.field_527.field_106);
            }

            String[] var6;
            int var5 = (var6 = var7.method_975()).length;

            for(int var9 = 0; var9 < var5; ++var9) {
               String var8 = var6[var9];
               this.field_377.method_417(var3, var8);
            }
         }
      }

   }

   // $FF: renamed from: a (bW, java.util.Map, java.util.Map) void
   private void method_690(class_198 var1, Map var2, Map var3) {
      String var4 = var1.field_528;
      String var5;
      if((var5 = this.field_377.method_419(1, var4, (String)null, (String)null)) == null) {
         var5 = var4;
      }

      HashSet var6 = new HashSet();
      Iterator var8 = var1.method_976().iterator();

      while(var8.hasNext()) {
         class_128 var7 = (class_128)var8.next();
         var6.add(var7.method_549());
      }

      class_146 var14 = var1.method_976();

      for(int var15 = 0; var15 < var14.size(); ++var15) {
         class_128 var9 = (class_128)var14.get(var15);
         String var10 = (String)var14.method_664(var15);
         int var11;
         boolean var12 = ((var11 = var9.method_550()) & 2) != 0;
         String var13 = var9.method_549();
         if(var1.method_979() && (var11 & 256) == 0) {
            if(this.field_376.toBeRenamed(3, var4, var13, var9.method_548())) {
               if(!var12 && var3.containsKey(var10)) {
                  var13 = (String)var3.get(var10);
               } else {
                  do {
                     var13 = this.field_376.getNextMethodname(var4, var13, var9.method_548());
                  } while(var6.contains(var13));

                  if(!var12) {
                     var2.put(var10, var13);
                  }
               }

               this.field_377.method_418(var4 + " " + var9.method_549() + " " + var9.method_548(), var5 + " " + var13 + " " + this.method_691(false, var9.method_548()));
            }
         } else if(!var12) {
            var2.put(var10, var13);
         }
      }

      if(var1.method_979()) {
         HashSet var17 = new HashSet();
         Iterator var19 = var1.method_977().iterator();

         class_168 var16;
         while(var19.hasNext()) {
            var16 = (class_168)var19.next();
            var17.add(var16.method_775());
         }

         var19 = var1.method_977().iterator();

         while(var19.hasNext()) {
            var16 = (class_168)var19.next();
            if(this.field_376.toBeRenamed(2, var4, var16.method_775(), var16.method_774())) {
               String var18;
               do {
                  var18 = this.field_376.getNextFieldname(var4, var16.method_775(), var16.method_774());
               } while(var17.contains(var18));

               this.field_377.method_418(var4 + " " + var16.method_775() + " " + var16.method_774(), var5 + " " + var18 + " " + this.method_691(true, var16.method_774()));
            }
         }

      }
   }

   // $FF: renamed from: a (boolean, java.lang.String) java.lang.String
   private String method_691(boolean var1, String var2) {
      boolean var3 = false;
      class_83 var4;
      if(var1) {
         String var5;
         class_206 var9;
         if((var4 = (var9 = class_206.method_1009(var2)).field_559).field_133 == 8 && (var5 = this.field_377.method_419(1, var4.field_136, (String)null, (String)null)) != null) {
            var4.field_136 = var5;
            var3 = true;
         }

         if(var3) {
            return var9.method_1010();
         }
      } else {
         class_83[] var7;
         class_197 var10;
         int var6 = (var7 = (var10 = class_197.method_963(var2)).field_519).length;

         for(int var12 = 0; var12 < var6; ++var12) {
            String var8;
            if((var4 = var7[var12]).field_133 == 8 && (var8 = this.field_377.method_419(1, var4.field_136, (String)null, (String)null)) != null) {
               var4.field_136 = var8;
               var3 = true;
            }
         }

         String var11;
         if(var10.field_520.field_133 == 8 && (var11 = this.field_377.method_419(1, var10.field_520.field_136, (String)null, (String)null)) != null) {
            var10.field_520.field_136 = var11;
            var3 = true;
         }

         if(var3) {
            return var10.method_964();
         }
      }

      return var2;
   }

   // $FF: renamed from: a (java.util.List) java.util.List
   private static List method_692(List var0) {
      ArrayList var1 = new ArrayList();
      LinkedList var2 = new LinkedList();
      LinkedList var3 = new LinkedList();
      HashSet var4 = new HashSet();
      Iterator var5 = var0.iterator();

      class_82 var8;
      while(var5.hasNext()) {
         var8 = (class_82)var5.next();
         var2.add(var8);
         var3.add(Integer.valueOf(0));
      }

      while(!var2.isEmpty()) {
         var8 = (class_82)var2.getLast();
         int var9 = ((Integer)var3.removeLast()).intValue();
         var4.add(var8);
         List var6 = var8.method_233();

         while(true) {
            if(var9 < var6.size()) {
               class_82 var7 = (class_82)var6.get(var9);
               if(var4.contains(var7)) {
                  ++var9;
                  continue;
               }

               var3.add(Integer.valueOf(var9 + 1));
               var2.add(var7);
               var3.add(Integer.valueOf(0));
            }

            if(var9 == var6.size()) {
               var1.add(0, var8);
               var2.removeLast();
            }
            break;
         }
      }

      return var1;
   }

   // $FF: renamed from: e () void
   private void method_693() {
      HashMap var1 = new HashMap();
      HashMap var2 = this.field_375.method_399();
      ArrayList var3 = new ArrayList();
      ArrayList var4 = new ArrayList();
      Iterator var6 = var2.values().iterator();

      while(var6.hasNext()) {
         class_198 var5;
         if((var5 = (class_198)var6.next()).method_979()) {
            LinkedList var7 = new LinkedList();
            LinkedList var8 = new LinkedList();
            var7.add(var5);
            var8.add((Object)null);

            while(!var7.isEmpty()) {
               var5 = (class_198)var7.removeFirst();
               class_82 var9 = (class_82)var8.removeFirst();
               class_82 var10;
               boolean var11;
               if(var11 = (var10 = (class_82)var1.get(var5.field_528)) == null) {
                  String var10001 = var5.field_528;
                  class_82 var10002 = new class_82;
                  var10002.method_230(var5);
                  var10 = var10002;
                  var1.put(var10001, var10002);
               }

               if(var9 != null) {
                  var10.method_231(var9);
               }

               if(!var11) {
                  break;
               }

               boolean var16 = (var5.field_523 & 512) != 0;
               var11 = false;
               if(var16) {
                  String[] var14;
                  int var13 = (var14 = var5.method_975()).length;

                  for(int var12 = 0; var12 < var13; ++var12) {
                     String var15 = var14[var12];
                     if((var5 = (class_198)var2.get(var15)) != null) {
                        var7.add(var5);
                        var8.add(var10);
                        var11 = true;
                     }
                  }
               } else if(var5.field_527 != null && (var5 = (class_198)var2.get((String)var5.field_527.field_106)) != null) {
                  var7.add(var5);
                  var8.add(var10);
                  var11 = true;
               }

               if(!var11) {
                  (var16?var4:var3).add(var10);
               }
            }
         }
      }

      this.field_378 = var3;
      this.field_379 = var4;
   }
}
