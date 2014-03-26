import de.fernflower.main.extern.IIdentifierRenamer;
import java.io.BufferedWriter;
import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map.Entry;

// $FF: renamed from: cG
public final class class_136 {

   // $FF: renamed from: a java.util.HashMap
   private HashMap field_344;


   // $FF: renamed from: <init> (i) void
   public void method_583(class_107 var1) {
      super();
      this.field_344 = new HashMap();
      HashMap var2 = new HashMap();
      HashMap var3 = new HashMap();
      HashMap var4 = new HashMap();
      HashMap var5 = new HashMap();
      boolean var6 = class_181.method_846("din");
      Iterator var8 = var1.method_399().values().iterator();

      String var14;
      class_198 var22;
      while(var8.hasNext()) {
         class_198 var7;
         if((var7 = (class_198)var8.next()).method_979() && !this.field_344.containsKey(var7.field_528)) {
            class_73 var9;
            if(var6 && (var9 = (class_73)var7.method_978().method_659("InnerClasses")) != null) {
               for(int var10 = 0; var10 < var9.method_208().size(); ++var10) {
                  class_41[] var11 = (class_41[])var9.method_208().get(var10);
                  String[] var12 = (String[])var9.method_209().get(var10);
                  Object[] var13 = new Object[4];
                  var14 = var12[0];
                  var13[2] = Integer.valueOf(var11[1] == false?(var11[2] == false?2:4):1);
                  String var15 = var12[2];
                  IIdentifierRenamer var17;
                  String var16;
                  if((var16 = (String)var5.get(var14)) != null) {
                     var15 = var16;
                  } else if(var15 != null && class_181.method_846("ren") && (var17 = class_181.method_857().method_422()).toBeRenamed(1, var15, (String)null, (String)null)) {
                     var15 = var17.getNextClassname(var14, var15);
                     var5.put(var14, var15);
                  }

                  var13[1] = var15;
                  var13[3] = Integer.valueOf((int)var11[3]);
                  var17 = null;
                  String var30;
                  if(var11[1] != false) {
                     var30 = var12[1];
                  } else {
                     var30 = var7.field_528;
                  }

                  if(!var14.equals(var30) && (var22 = (class_198)var1.method_399().get(var30)) != null && var22.method_979()) {
                     Object[] var18;
                     if((var18 = (Object[])var2.get(var14)) == null) {
                        var2.put(var14, var13);
                     } else if(!class_129.method_559(var18, var13)) {
                        class_181.method_859().writeMessage("Inconsistent inner class entries for " + var14 + "!", 3);
                     }

                     HashSet var25;
                     if((var25 = (HashSet)var3.get(var30)) == null) {
                        var3.put(var30, var25 = new HashSet());
                     }

                     var25.add(var14);
                     if((var25 = (HashSet)var4.get(var14)) == null) {
                        var4.put(var14, var25 = new HashSet());
                     }

                     var25.add(var30);
                  }
               }
            }

            class_177 var10000 = new class_177;
            var10000.method_815(var7);
            class_177 var20 = var10000;
            var10000.field_436 = var7.field_523;
            this.field_344.put(var7.field_528, var20);
         }
      }

      if(var6) {
         var8 = this.field_344.entrySet().iterator();

         while(var8.hasNext()) {
            Entry var19 = (Entry)var8.next();
            if(!var2.containsKey(var19.getKey())) {
               HashSet var21 = new HashSet();
               LinkedList var23;
               (var23 = new LinkedList()).add((String)var19.getKey());
               var21.add((String)var19.getKey());

               while(!var23.isEmpty()) {
                  String var26 = (String)var23.removeFirst();
                  class_177 var24 = (class_177)this.field_344.get(var26);
                  HashSet var27;
                  if((var27 = (HashSet)var3.get(var26)) != null) {
                     Iterator var28 = var27.iterator();

                     while(var28.hasNext()) {
                        var14 = (String)var28.next();
                        if(!var21.contains(var14)) {
                           var21.add(var14);
                           class_177 var29;
                           if((var29 = (class_177)this.field_344.get(var14)) == null) {
                              class_181.method_859().writeMessage("Nested class " + var14 + " missing!", 3);
                           } else {
                              Object[] var31 = (Object[])var2.get(var14);
                              var29.field_435 = ((Integer)var31[2]).intValue();
                              var29.field_437 = (String)var31[1];
                              var29.field_436 = ((Integer)var31[3]).intValue();
                              if(var29.field_435 == 2) {
                                 var22 = var29.field_438;
                                 var29.field_436 &= -9;
                                 int[] var32;
                                 class_83 var10001;
                                 if((var32 = var22.method_974()).length > 0) {
                                    if(var32.length > 1) {
                                       throw new RuntimeException("Inconsistent anonymous class definition: " + var22.field_528);
                                    }

                                    var10001 = new class_83;
                                    var10001.method_239(var22.method_969(0), true);
                                    var29.field_444 = var10001;
                                 } else {
                                    var10001 = new class_83;
                                    var10001.method_239((String)var22.field_527.field_106, true);
                                    var29.field_444 = var10001;
                                 }
                              } else if(var29.field_435 == 4) {
                                 var29.field_436 &= 1040;
                              }

                              var24.field_445.add(var29);
                              var29.field_447 = var24;
                              var29.field_446.addAll((Collection)var4.get(var14));
                              var23.add(var14);
                           }
                        }
                     }
                  }
               }
            }
         }
      }

   }

   // $FF: renamed from: a (bW, java.io.BufferedWriter) void
   public final void method_584(class_198 var1, BufferedWriter var2) {
      class_177 var3;
      if((var3 = (class_177)this.field_344.get(var1.field_528)).field_435 == 0) {
         try {
            class_131 var10000 = new class_131;
            var10000.method_570(var3);
            class_181.method_848(var10000);
            class_176 var11 = new class_176;
            var11.method_811();
            class_181.method_854(var11);
            this.method_586(var3, class_181.method_847());
            this.method_585(var3);
            class_59 var12 = new class_59;
            var12.method_152();
            class_194 var4 = null;
            var12.method_153(var3, var3);
            class_188 var9 = new class_188;
            var9.method_887();
            var9.method_888(var3);
            class_194 var10 = new class_194;
            var10.method_942();
            var4 = var10;
            StringWriter var5 = new StringWriter();
            var4.method_943(var3, new BufferedWriter(var5), 0);
            if(class_181.method_846("occ")) {
               var2.write("// Decompiled by:       Fernflower v0.8.6");
               var2.newLine();
               var2.write("// Date:                " + (new SimpleDateFormat("dd.MM.yyyy HH:mm:ss")).format(new Date()));
               var2.newLine();
               var2.write("// Copyright:           2008-2010, Stiver");
               var2.newLine();
               var2.write("// Home page:           http://www.reversed-java.com");
               var2.newLine();
               var2.newLine();
            }

            int var13;
            if((var13 = var1.field_528.lastIndexOf("/")) >= 0) {
               String var8 = var1.field_528.substring(0, var13).replaceAll("/", ".");
               var2.write("package " + var8 + ";");
               var2.newLine();
               var2.newLine();
            }

            class_181.method_845("CURRENT_CLASSNODE", var3);
            class_181.method_847().method_572(var2);
            var2.newLine();
            var2.write(var5.toString());
            var2.flush();
         } finally {
            this.method_587(var3);
         }

      }
   }

   // $FF: renamed from: a (aK) void
   private void method_585(class_177 var1) {
      class_109 var10000 = new class_109;
      var10000.method_408(var1.field_438);
      class_109 var2 = var10000;
      var10000.method_409();
      var1.field_439 = var2;
      Iterator var3 = var1.field_445.iterator();

      while(var3.hasNext()) {
         var1 = (class_177)var3.next();
         this.method_585(var1);
      }

   }

   // $FF: renamed from: a (aK, cL) void
   private void method_586(class_177 var1, class_131 var2) {
      if(var1.field_437 != null && var1.field_437.length() > 0) {
         var2.method_571(var1.field_435 == 0?var1.field_438.field_528:var1.field_437, false);
      }

      Iterator var3 = var1.field_445.iterator();

      while(var3.hasNext()) {
         var1 = (class_177)var3.next();
         this.method_586(var1, var2);
      }

   }

   // $FF: renamed from: b (aK) void
   private void method_587(class_177 var1) {
      var1.field_439 = null;
      var1.field_438.method_970();
      Iterator var2 = var1.field_445.iterator();

      while(var2.hasNext()) {
         var1 = (class_177)var2.next();
         this.method_587(var1);
      }

   }

   // $FF: renamed from: a () java.util.HashMap
   public final HashMap method_588() {
      return this.field_344;
   }
}
