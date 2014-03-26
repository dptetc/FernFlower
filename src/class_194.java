import java.io.BufferedWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

// $FF: renamed from: bR
public final class class_194 {

   // $FF: renamed from: a int[]
   private static final int[] field_499;
   // $FF: renamed from: b java.lang.String[]
   private static final String[] field_500;
   // $FF: renamed from: c int[]
   private static final int[] field_501;
   // $FF: renamed from: d java.lang.String[]
   private static final String[] field_502;
   // $FF: renamed from: e int[]
   private static final int[] field_503;
   // $FF: renamed from: f java.lang.String[]
   private static final String[] field_504;
   // $FF: renamed from: g java.util.HashSet
   private static final HashSet field_505;
   // $FF: renamed from: h java.util.HashSet
   private static final HashSet field_506;
   // $FF: renamed from: i java.util.HashSet
   private static final HashSet field_507;
   // $FF: renamed from: j x
   private class_117 field_508;
   // $FF: renamed from: k u
   private class_110 field_509;


   // $FF: renamed from: <clinit> () void
   static void method_941() {
      field_499 = new int[]{1, 4, 2, 1024, 8, 16, 2048};
      field_500 = new String[]{"public ", "protected ", "private ", "abstract ", "static ", "final ", "strictfp "};
      field_501 = new int[]{1, 4, 2, 8, 16, 128, 64};
      field_502 = new String[]{"public ", "protected ", "private ", "static ", "final ", "transient ", "volatile "};
      field_503 = new int[]{1, 4, 2, 1024, 8, 16, 32, 256, 2048};
      field_504 = new String[]{"public ", "protected ", "private ", "abstract ", "static ", "final ", "synchronized ", "native ", "strictfp "};
      field_505 = new HashSet((Collection)Arrays.asList(new Integer[]{Integer.valueOf(1024), Integer.valueOf(8)}));
      field_506 = new HashSet((Collection)Arrays.asList(new Integer[]{Integer.valueOf(1), Integer.valueOf(8), Integer.valueOf(16)}));
      field_507 = new HashSet((Collection)Arrays.asList(new Integer[]{Integer.valueOf(1), Integer.valueOf(1024)}));
   }

   // $FF: renamed from: <init> () void
   public void method_942() {
      super();
      class_117 var10001 = new class_117;
      var10001.method_473();
      this.field_508 = var10001;
      this.field_509 = class_181.method_857();
   }

   // $FF: renamed from: a (aK, java.io.BufferedWriter, int) void
   public final void method_943(class_177 var1, BufferedWriter var2, int var3) {
      class_109 var4 = var1.field_439;
      class_198 var5 = var1.field_439.method_411();
      class_177 var6 = (class_177)class_181.method_844("CURRENT_CLASSNODE");
      class_181.method_845("CURRENT_CLASSNODE", var1);
      class_109 var9 = var1.field_439;
      class_198 var10 = var1.field_439.method_411();
      class_204.method_1000(var9);
      if(var1.field_435 == 0 && class_181.method_846("dc4")) {
         this.field_508.method_474(var1);
      }

      if(class_181.method_846("den") && (var10.field_523 & 16384) != 0) {
         class_166.method_764(var9);
      }

      if(class_181.method_846("das")) {
         class_103.method_384(var9);
      }

      class_181.method_859().startWriteClass(var5.field_528);
      int var32 = var3;
      BufferedWriter var24 = var2;
      int var13;
      boolean var14;
      boolean var15;
      if(var1.field_435 == 2) {
         var2.write(" {");
         var2.newLine();
      } else {
         String var11 = class_129.method_557(var3);
         class_198 var12 = null;
         var12 = var1.field_439.method_411();
         var14 = ((var13 = var1.field_435 == 0?var12.field_523:var1.field_436) & 512) != 0;
         var15 = (var13 & 8192) != 0;
         boolean var16 = class_181.method_846("den") && (var13 & 16384) != 0;
         boolean var17 = var12.method_978().method_662("Deprecated");
         String var18;
         if(this.field_509 != null && (var18 = this.field_509.method_421(var12.field_528)) != null) {
            var2.write(var11);
            var2.write("// $FF: renamed from: " + this.method_948(var18, 0));
            var2.newLine();
         }

         List var10000 = method_946(var12.method_978());
         var18 = null;
         Iterator var41 = var10000.iterator();

         class_96 var7;
         while(var41.hasNext()) {
            var7 = (class_96)var41.next();
            if("java/lang/Deprecated".equals(var7.method_337())) {
               var17 = false;
            }

            var24.write(var7.method_262(var32));
            var24.newLine();
         }

         boolean var43 = (var13 & 4096) != 0 || var12.method_978().method_662("Synthetic");
         boolean var19 = false;
         if(var43) {
            var24.write(var11);
            var24.write("// $FF: synthetic class");
            var24.newLine();
         }

         if(var17) {
            var24.write(var11);
            var24.write("@Deprecated");
            var24.newLine();
         }

         var24.write(var11);
         if(var16) {
            var13 = var13 & -1025 & -17;
         }

         for(int var40 = 0; var40 < field_499.length; ++var40) {
            if((!var14 || !field_505.contains(Integer.valueOf(field_499[var40]))) && (var13 & field_499[var40]) != 0) {
               var24.write(field_500[var40]);
            }
         }

         if(var16) {
            var24.write("enum ");
         } else if(var14) {
            if(var15) {
               var24.write("@");
            }

            var24.write("interface ");
         } else {
            var24.write("class ");
         }

         class_144 var42 = null;
         class_70 var21;
         if(class_181.method_846("dgs") && (var21 = (class_70)var12.method_978().method_659("Signature")) != null) {
            var42 = class_123.method_508(var21.method_204());
         }

         var24.write(var1.field_437);
         if(var42 != null && !var42.field_362.isEmpty()) {
            var24.write("<");

            for(int var20 = 0; var20 < var42.field_362.size(); ++var20) {
               if(var20 > 0) {
                  var24.write(", ");
               }

               var24.write((String)var42.field_362.get(var20) + " extends ");
               List var8 = (List)var42.field_363.get(var20);
               var24.write(class_123.method_512((class_108)var8.get(0)));

               for(var32 = 1; var32 < var8.size(); ++var32) {
                  var24.write(" & " + class_123.method_512((class_108)var8.get(var32)));
               }
            }

            var24.write(">");
         }

         var24.write(" ");
         if(!var16 && !var14 && var12.field_527 != null) {
            class_83 var44 = new class_83;
            var7 = null;
            var44.method_239((String)var12.field_527.field_106, true);
            class_83 var27 = var44;
            if(!class_83.field_131.equals(var27)) {
               var24.write("extends ");
               if(var42 != null) {
                  var24.write(class_123.method_512(var42.field_360));
               } else {
                  var24.write(class_209.method_1039(var27));
               }

               var24.write(" ");
            }
         }

         int[] var25;
         if(!var15 && (var25 = var12.method_974()).length > 0) {
            var24.write(var14?"extends ":"implements ");

            for(int var22 = 0; var22 < var25.length; ++var22) {
               if(var22 > 0) {
                  var24.write(", ");
               }

               if(var42 != null) {
                  var24.write(class_123.method_512((class_108)var42.field_361.get(var22)));
               } else {
                  class_83 var10001 = new class_83;
                  var10001.method_239(var12.method_969(var22), true);
                  var24.write(class_209.method_1039(var10001));
               }
            }

            var24.write(" ");
         }

         var24.write("{");
         var24.newLine();
      }

      StringWriter var28 = new StringWriter();
      BufferedWriter var26 = new BufferedWriter(var28);
      boolean var29 = true;
      boolean var31 = false;
      Iterator var35 = var5.method_976().iterator();

      while(var35.hasNext()) {
         class_128 var30;
         var14 = ((var13 = (var30 = (class_128)var35.next()).method_550()) & 4096) != 0 || var30.method_552().method_662("Synthetic");
         var15 = (var13 & 64) != 0;
         if((!var14 || !class_181.method_846("rsy")) && (!var15 || !class_181.method_846("rbr")) && !var4.method_413().contains(class_129.method_562(var30.method_549(), var30.method_548()))) {
            if(!var31 && (!var29 || var1.field_435 != 2)) {
               var26.newLine();
               var29 = false;
            }

            var31 = !this.method_945(var1, var30, var26, var3 + 1);
         }
      }

      var26.flush();
      StringWriter var36 = new StringWriter();
      BufferedWriter var37 = new BufferedWriter(var36);
      var13 = 0;
      var14 = false;
      Iterator var23 = var5.method_977().iterator();

      while(var23.hasNext()) {
         int var33;
         class_168 var39;
         if((((var33 = (var39 = (class_168)var23.next()).field_423) & 4096) == 0 && !var39.method_772().method_662("Synthetic") || !class_181.method_846("rsy")) && !var4.method_413().contains(class_129.method_562(var39.method_775(), var39.method_774()))) {
            if(class_181.method_846("den") && (var33 & 16384) != 0) {
               if(var14) {
                  var37.write(",");
                  var37.newLine();
               } else {
                  var14 = true;
               }
            } else if(var14) {
               var37.write(";");
               var37.newLine();
               var14 = false;
            }

            this.method_944(var4, var5, var39, var37, var3 + 1);
            ++var13;
         }
      }

      if(var14) {
         var37.write(";");
         var37.newLine();
      }

      var37.flush();
      if(var13 > 0) {
         var2.newLine();
         var2.write(var36.toString());
         var2.newLine();
      }

      var2.write(var28.toString());
      var23 = var1.field_445.iterator();

      while(var23.hasNext()) {
         class_177 var38;
         if((var38 = (class_177)var23.next()).field_435 == 1) {
            class_198 var34 = var38.field_438;
            if(((var38.field_438.field_523 & 4096) == 0 && !var34.method_978().method_662("Synthetic") || !class_181.method_846("rsy")) && !var4.method_413().contains(var34.field_528)) {
               var2.newLine();
               this.method_943(var38, var2, var3 + 1);
            }
         }
      }

      var2.write(class_129.method_557(var3));
      var2.write("}");
      if(var1.field_435 != 2) {
         var2.newLine();
      }

      var2.flush();
      class_181.method_845("CURRENT_CLASSNODE", var6);
      class_181.method_859().endWriteClass();
   }

   // $FF: renamed from: a (v, bW, bA, java.io.BufferedWriter, int) void
   private void method_944(class_109 var1, class_198 var2, class_168 var3, BufferedWriter var4, int var5) {
      String var6 = class_129.method_557(var5);
      boolean var7 = (var2.field_523 & 512) != 0;
      int var8 = var3.field_423;
      String var9;
      String[] var10;
      if(this.field_509 != null && (var9 = this.field_509.method_421(var2.field_528 + " " + var3.method_775() + " " + var3.method_774())) != null) {
         var10 = var9.split(" ");
         var4.write(var6);
         var4.write("// $FF: renamed from: " + var10[1] + " " + this.method_948(var10[2], 1));
         var4.newLine();
      }

      boolean var22 = var3.method_772().method_662("Deprecated");
      List var10000 = method_946(var3.method_772());
      var10 = null;
      Iterator var24 = var10000.iterator();

      while(var24.hasNext()) {
         class_96 var11 = (class_96)var24.next();
         if("java/lang/Deprecated".equals(var11.method_337())) {
            var22 = false;
         }

         var4.write(var11.method_262(var5));
         var4.newLine();
      }

      boolean var12 = (var8 & 4096) != 0 || var3.method_772().method_662("Synthetic");
      boolean var23 = class_181.method_846("den") && (var8 & 16384) != 0;
      if(var12) {
         var4.write(var6);
         var4.write("// $FF: synthetic field");
         var4.newLine();
      }

      if(var22) {
         var4.write(var6);
         var4.write("@Deprecated");
         var4.newLine();
      }

      var4.write(var6);
      if(!var23) {
         for(int var13 = 0; var13 < field_501.length; ++var13) {
            if((!var7 || !field_506.contains(Integer.valueOf(field_501[var13]))) && (var8 & field_501[var13]) != 0) {
               var4.write(field_502[var13]);
            }
         }
      }

      class_83 var18 = new class_83;
      var18.method_239(var3.method_774(), false);
      class_83 var15 = var18;
      class_121 var19 = null;
      class_70 var20;
      if(class_181.method_846("dgs") && (var20 = (class_70)var3.method_772().method_659("Signature")) != null) {
         var19 = class_123.method_509(var20.method_204());
      }

      if(!var23) {
         if(var19 != null) {
            var4.write(class_123.method_512(var19.field_285));
         } else {
            var4.write(class_209.method_1039(var15));
         }

         var4.write(" ");
      }

      var4.write(var3.method_775());
      class_86 var21;
      if((var8 & 8) != 0) {
         var21 = (class_86)var1.method_414().method_659(class_129.method_562(var3.method_775(), var3.method_774()));
      } else {
         var21 = (class_86)var1.method_415().method_659(class_129.method_562(var3.method_775(), var3.method_774()));
      }

      if(var21 != null) {
         if(var23 && var21.field_148 == 10) {
            class_95 var14;
            (var14 = (class_95)var21).method_334();
            var4.write(var14.method_262(var5));
         } else {
            var4.write(" = ");
            var4.write(var21.method_262(var5));
         }
      } else {
         class_74 var16;
         if((var8 & 16) != 0 && (var8 & 8) != 0 && (var16 = (class_74)var3.method_772().method_659("ConstantValue")) != null) {
            class_80 var17 = var2.method_973().method_995(var16.method_210());
            var4.write(" = ");
            class_87 var10001 = new class_87;
            var10001.method_266(var15, var17.field_106);
            var4.write(var10001.method_262(var5));
         }
      }

      if(!var23) {
         var4.write(";");
         var4.newLine();
      }

   }

   // $FF: renamed from: a (aK, bn, java.io.BufferedWriter, int) boolean
   private boolean method_945(class_177 var1, class_128 var2, BufferedWriter var3, int var4) {
      class_109 var5 = var1.field_439;
      class_198 var6 = var1.field_439.method_411();
      class_120 var7 = var5.method_410(var2.method_549(), var2.method_548());
      class_120 var8 = (class_120)class_181.method_844("CURRENT_METHOD_WRAPPER");
      class_181.method_845("CURRENT_METHOD_WRAPPER", var7);
      boolean var9 = (var6.field_523 & 512) != 0;
      boolean var10 = (var6.field_523 & 8192) != 0;
      boolean var11 = var2.method_552().method_662("Deprecated");
      String var12 = class_129.method_557(var4);
      boolean var13 = false;
      boolean var14 = false;
      boolean var15 = false;
      class_197 var16 = class_197.method_963(var2.method_548());
      StringWriter var17 = new StringWriter();
      BufferedWriter var18 = new BufferedWriter(var17);
      int var19;
      if(((var19 = var2.method_550()) & 256) != 0) {
         var19 &= -2049;
      }

      if("<clinit>".equals(var2.method_549())) {
         var19 &= 8;
      }

      String var20;
      if(this.field_509 != null && (var20 = this.field_509.method_421(var6.field_528 + " " + var2.method_549() + " " + var2.method_548())) != null) {
         String[] var39 = var20.split(" ");
         var18.write(var12);
         var18.write("// $FF: renamed from: " + var39[1] + " " + this.method_948(var39[2], 2));
         var18.newLine();
      }

      List var10000 = method_946(var2.method_552());
      var20 = null;
      Iterator var29 = var10000.iterator();

      while(var29.hasNext()) {
         class_96 var42 = (class_96)var29.next();
         if("java/lang/Deprecated".equals(var42.method_337())) {
            var11 = false;
         }

         var18.write(var42.method_262(var4));
         var18.newLine();
      }

      boolean var43 = (var19 & 4096) != 0 || var2.method_552().method_662("Synthetic");
      boolean var30 = (var19 & 64) != 0;
      if(var43) {
         var18.write(var12);
         var18.write("// $FF: synthetic method");
         var18.newLine();
      }

      if(var30) {
         var18.write(var12);
         var18.write("// $FF: bridge method");
         var18.newLine();
      }

      if(var11) {
         var18.write(var12);
         var18.write("@Deprecated");
         var18.newLine();
      }

      var18.write(var12);

      for(int var31 = 0; var31 < field_503.length; ++var31) {
         if((!var9 || !field_507.contains(Integer.valueOf(field_503[var31]))) && (var19 & field_503[var31]) != 0) {
            var18.write(field_504[var31]);
         }
      }

      class_205 var33 = null;
      class_70 var34;
      if(class_181.method_846("dgs") && (var34 = (class_70)var2.method_552().method_659("Signature")) != null) {
         var33 = class_123.method_510(var34.method_204());
         if(var16.field_519.length != var33.field_552.size()) {
            class_181.method_859().writeMessage("Inconsistent generic signature in method " + var2.method_549() + " " + var2.method_548(), 3);
            var33 = null;
         }
      }

      String var35 = var2.method_549();
      if("<init>".equals(var35)) {
         if(var1.field_435 == 2) {
            var35 = "";
            var15 = true;
         } else {
            var35 = var1.field_437;
            var14 = true;
         }
      } else if("<clinit>".equals(var35)) {
         var35 = "";
         var13 = true;
      }

      boolean var32 = false;
      int var38 = 0;
      int var25;
      if(!var13 && !var15) {
         var43 = (var2.method_550() & 8) == 0;
         int var23;
         List var22;
         if(var33 != null && !var33.field_550.isEmpty()) {
            var18.write("<");

            for(int var21 = 0; var21 < var33.field_550.size(); ++var21) {
               if(var21 > 0) {
                  var18.write(", ");
               }

               var18.write((String)var33.field_550.get(var21) + " extends ");
               var22 = (List)var33.field_551.get(var21);
               var18.write(class_123.method_512((class_108)var22.get(0)));

               for(var23 = 1; var23 < var22.size(); ++var23) {
                  var18.write(" & " + class_123.method_512((class_108)var22.get(var23)));
               }
            }

            var18.write("> ");
         }

         if(!var14) {
            if(var33 != null) {
               var18.write(class_123.method_512(var33.field_553));
            } else {
               var18.write(class_209.method_1039(var16.field_520));
            }

            var18.write(" ");
         }

         var18.write(var35);
         var18.write("(");
         List var44 = method_947(var2.method_552());
         var22 = var7.field_282;
         var23 = -1;

         for(int var36 = 0; var36 < var16.field_519.length; ++var36) {
            if(var22 == null || var22.get(var36) == null) {
               var23 = var36;
            }
         }

         var9 = true;
         int var24 = var43?1:0;

         for(var25 = 0; var25 < var16.field_519.length; ++var25) {
            if(var22 == null || var22.get(var25) == null) {
               if(!var9) {
                  var18.write(", ");
               }

               if(var44.size() > var25) {
                  List var26 = (List)var44.get(var25);

                  for(int var27 = 0; var27 < var26.size(); ++var27) {
                     class_96 var37;
                     if((var37 = (class_96)var26.get(var27)).method_336() == 1) {
                        var18.newLine();
                        var18.write(var37.method_262(var4 + 1));
                     } else {
                        var18.write(var37.method_262(0));
                     }

                     var18.write(" ");
                  }
               }

               class_164 var58 = var7.field_278;
               class_77 var10001 = new class_77;
               var10001.method_214(var24, 0);
               if(var58.method_755(var10001) == 2) {
                  var18.write("final ");
               }

               boolean var50;
               if(var33 != null) {
                  class_108 var54 = (class_108)var33.field_552.get(var25);
                  if(var50 = var25 == var23 && (var2.method_550() & 128) != 0 && var54.field_229 > 0) {
                     --var54.field_229;
                  }

                  var35 = class_123.method_512(var54);
                  if("<undefinedtype>".equals(var35) && class_181.method_846("uto")) {
                     var35 = class_209.method_1039(class_83.field_131);
                  }

                  var18.write(var35);
                  if(var50) {
                     var18.write(" ...");
                  }
               } else {
                  class_83 var53 = var16.field_519[var25].method_241();
                  if(var50 = var25 == var23 && (var2.method_550() & 128) != 0 && var53.field_135 > 0) {
                     var53.method_240();
                  }

                  var35 = class_209.method_1039(var53);
                  if("<undefinedtype>".equals(var35) && class_181.method_846("uto")) {
                     var35 = class_209.method_1039(class_83.field_131);
                  }

                  var18.write(var35);
                  if(var50) {
                     var18.write(" ...");
                  }
               }

               var18.write(" ");
               var58 = var7.field_278;
               var10001 = new class_77;
               var10001.method_214(var24, 0);
               String var56 = var58.method_753(var10001);
               var18.write(var56 == null?"param" + var24:var56);
               var9 = false;
               ++var38;
            }

            var24 += var16.field_519[var25].field_137;
         }

         var18.write(")");
         class_71 var46 = (class_71)var2.method_552().method_659("Exceptions");
         if(var33 != null && !var33.field_554.isEmpty() || var46 != null) {
            var32 = true;
            var18.write(" throws ");

            for(int var55 = 0; var55 < var46.method_206().size(); ++var55) {
               if(var55 > 0) {
                  var18.write(", ");
               }

               if(var33 != null && !var33.field_554.isEmpty()) {
                  var18.write(class_123.method_512((class_108)var33.field_554.get(var55)));
               } else {
                  class_83 var57 = new class_83;
                  var57.method_239(var46.method_205(var55, var6.method_973()), true);
                  class_83 var52 = var57;
                  var18.write(class_209.method_1039(var52));
               }
            }
         }
      }

      var43 = false;
      if((var19 & 1280) != 0) {
         class_75 var45;
         if(var10 && (var45 = (class_75)var2.method_552().method_659("AnnotationDefault")) != null) {
            var18.write(" default ");
            var18.write(var45.method_211().method_262(var4 + 1));
         }

         var18.write(";");
         var18.newLine();
      } else {
         if(!var13 && !var15) {
            var18.write(" ");
         }

         var18.write("{");
         class_54 var40 = var5.method_410(var2.method_549(), var2.method_548()).field_277;
         StringWriter var41 = new StringWriter();
         BufferedWriter var47 = new BufferedWriter(var41);
         if(var40 != null && !var7.field_283) {
            try {
               var35 = var40.method_43(var4 + 1);
               boolean var48 = false;
               if(var14 && var38 == 0 && !var32 && class_181.method_846("hdc")) {
                  var25 = 0;
                  Iterator var51 = var5.method_412().iterator();

                  while(var51.hasNext()) {
                     class_120 var49 = (class_120)var51.next();
                     if("<init>".equals(var49.field_279.method_549())) {
                        ++var25;
                     }
                  }

                  var48 = var25 == 1;
               }

               var43 = (var13 || var15 || var48) && var35.length() == 0;
               var47.write(var35);
            } catch (Throwable var28) {
               if(class_181.method_859().getShowStacktrace()) {
                  var28.printStackTrace();
               }

               class_181.method_859().writeMessage("Method " + var2.method_549() + " " + var2.method_548() + " couldn\'t be written.", 4);
               var7.field_283 = true;
            }
         }

         if(var7.field_283) {
            var47.write(class_129.method_557(var4 + 1));
            var47.write("// $FF: Couldn\'t be decompiled");
            var47.newLine();
         }

         var47.flush();
         if((var35 = var41.toString()).isEmpty()) {
            var18.write("}");
         } else {
            var18.newLine();
            var18.write(var35);
            var18.write(var12 + "}");
         }

         var18.newLine();
      }

      var18.flush();
      if(!var43) {
         var3.write(var17.toString());
      }

      class_181.method_845("CURRENT_METHOD_WRAPPER", var8);
      if(var43) {
         return false;
      } else {
         return true;
      }
   }

   // $FF: renamed from: a (cE) java.util.List
   private static List method_946(class_146 var0) {
      String[] var1 = new String[]{"RuntimeVisibleAnnotations", "RuntimeInvisibleAnnotations"};
      ArrayList var2 = new ArrayList();
      String[] var5 = var1;
      int var4 = var1.length;

      for(int var3 = 0; var3 < var4; ++var3) {
         String var6 = var5[var3];
         class_69 var7;
         if((var7 = (class_69)var0.method_659(var6)) != null) {
            var2.addAll(var7.method_203());
         }
      }

      return var2;
   }

   // $FF: renamed from: b (cE) java.util.List
   private static List method_947(class_146 var0) {
      String[] var1 = new String[]{"RuntimeVisibleParameterAnnotations", "RuntimeInvisibleParameterAnnotations"};
      ArrayList var2 = new ArrayList();
      String[] var5 = var1;
      int var4 = var1.length;

      for(int var3 = 0; var3 < var4; ++var3) {
         String var9 = var5[var3];
         class_72 var10;
         if((var10 = (class_72)var0.method_659(var9)) != null) {
            for(int var6 = 0; var6 < var10.method_207().size(); ++var6) {
               Object var7 = new ArrayList();
               boolean var8;
               if(!(var8 = var2.size() <= var6)) {
                  var7 = (List)var2.get(var6);
               }

               ((List)var7).addAll((Collection)var10.method_207().get(var6));
               if(var8) {
                  var2.add(var7);
               } else {
                  var2.set(var6, var7);
               }
            }
         }
      }

      return var2;
   }

   // $FF: renamed from: a (java.lang.String, int) java.lang.String
   private String method_948(String var1, int var2) {
      switch(var2) {
      case 0:
         return class_209.method_1042(var1);
      case 1:
         return method_949(class_206.method_1009(var1).field_559);
      case 2:
      default:
         class_197 var7 = class_197.method_963(var1);
         StringBuilder var8 = new StringBuilder("(");
         boolean var9 = true;
         class_83[] var6 = var7.field_519;
         int var5 = var7.field_519.length;

         for(int var4 = 0; var4 < var5; ++var4) {
            class_83 var3 = var6[var4];
            if(var9) {
               var9 = false;
            } else {
               var8.append(", ");
            }

            var8.append(method_949(var3));
         }

         var8.append(") ");
         var8.append(method_949(var7.field_520));
         return var8.toString();
      }
   }

   // $FF: renamed from: a (Q) java.lang.String
   private static String method_949(class_83 var0) {
      String var1 = class_209.method_1040(var0, false);
      if("<undefinedtype>".equals(var1) && class_181.method_846("uto")) {
         var1 = class_209.method_1040(class_83.field_131, false);
      }

      return var1;
   }
}
