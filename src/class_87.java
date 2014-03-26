import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

// $FF: renamed from: bI
public final class class_87 extends class_86 {

   // $FF: renamed from: c java.util.HashMap
   private static final HashMap field_150;
   // $FF: renamed from: d Q
   private class_83 field_151;
   // $FF: renamed from: e java.lang.Object
   private Object field_152;
   // $FF: renamed from: f boolean
   private boolean field_153;


   // $FF: renamed from: <clinit> () void
   static void method_264() {
      (field_150 = new HashMap()).put(new Integer(8), "\\b");
      field_150.put(new Integer(9), "\\t");
      field_150.put(new Integer(10), "\\n");
      field_150.put(new Integer(12), "\\f");
      field_150.put(new Integer(13), "\\r");
      field_150.put(new Integer(34), "\\\"");
      field_150.put(new Integer(39), "\\\'");
      field_150.put(new Integer(92), "\\\\");
   }

   // $FF: renamed from: <init> (int, boolean) void
   public void method_265(int var1, boolean var2) {
      super.method_252();
      this.field_148 = 3;
      this.field_153 = var2;
      if(var2) {
         this.field_151 = class_83.field_125;
         if(var1 != 0 && var1 != 1) {
            this.field_151 = this.field_151.method_241();
            this.field_151.field_138 |= 1;
         }
      } else if(var1 >= 0 && var1 <= 127) {
         this.field_151 = class_83.field_126;
      } else if(-128 <= var1 && var1 <= 127) {
         this.field_151 = class_83.field_122;
      } else if(var1 >= 0 && var1 <= 32767) {
         this.field_151 = class_83.field_127;
      } else if(-32768 <= var1 && var1 <= 32767) {
         this.field_151 = class_83.field_124;
      } else if(var1 >= 0 && var1 <= '\uffff') {
         this.field_151 = class_83.field_123;
      } else {
         this.field_151 = class_83.field_118;
      }

      this.field_152 = new Integer(var1);
   }

   // $FF: renamed from: <init> (Q, java.lang.Object) void
   public void method_266(class_83 var1, Object var2) {
      super.method_252();
      this.field_148 = 3;
      this.field_151 = var1;
      this.field_152 = var2;
   }

   // $FF: renamed from: a () aJ
   public final class_86 method_261() {
      class_87 var10000 = new class_87;
      var10000.method_266(this.field_151, this.field_152);
      return var10000;
   }

   // $FF: renamed from: c () Q
   public final class_83 method_254() {
      return this.field_151;
   }

   // $FF: renamed from: d_ () int
   public final int method_255() {
      return 3;
   }

   // $FF: renamed from: b () java.util.List
   public final List method_260() {
      return new ArrayList();
   }

   // $FF: renamed from: a (int) java.lang.String
   public final String method_262(int var1) {
      if(this.field_151.field_133 != 13 && this.field_152 == null) {
         return class_209.method_1039(this.field_151);
      } else {
         String var6;
         class_92 var10;
         switch(this.field_151.field_133) {
         case 0:
         case 4:
         case 6:
         case 15:
         case 16:
            if((var1 = ((Integer)this.field_152).intValue()) == Integer.MAX_VALUE) {
               var6 = "MAX_VALUE";
            } else {
               if(var1 != Integer.MIN_VALUE) {
                  return this.field_152.toString();
               }

               var6 = "MIN_VALUE";
            }

            var10 = new class_92;
            var10.method_308(var6, "java/lang/Integer", true, (class_86)null, class_206.field_555);
            return var10.method_262(0);
         case 1:
            Integer var11 = (Integer)this.field_152;
            String var9;
            if((var9 = (String)field_150.get(var11)) == null) {
               if(var11.intValue() >= 32 && var11.intValue() < 127) {
                  var9 = String.valueOf((char)var11.intValue());
               } else {
                  var9 = class_129.method_561(var11.intValue());
               }
            }

            return "\'" + var9 + "\'";
         case 2:
            double var4;
            if(Double.isNaN(var4 = ((Double)this.field_152).doubleValue())) {
               var6 = "NaN";
            } else if(var4 == Double.POSITIVE_INFINITY) {
               var6 = "POSITIVE_INFINITY";
            } else if(var4 == Double.NEGATIVE_INFINITY) {
               var6 = "NEGATIVE_INFINITY";
            } else if(var4 == Double.MAX_VALUE) {
               var6 = "MAX_VALUE";
            } else {
               if(var4 != Double.MIN_VALUE) {
                  return this.field_152.toString() + "D";
               }

               var6 = "MIN_VALUE";
            }

            var10 = new class_92;
            var10.method_308(var6, "java/lang/Double", true, (class_86)null, class_206.field_558);
            return var10.method_262(0);
         case 3:
            float var8;
            if(Float.isNaN(var8 = ((Float)this.field_152).floatValue())) {
               var6 = "NaN";
            } else if(var8 == Float.POSITIVE_INFINITY) {
               var6 = "POSITIVE_INFINITY";
            } else if(var8 == Float.NEGATIVE_INFINITY) {
               var6 = "NEGATIVE_INFINITY";
            } else if(var8 == Float.MAX_VALUE) {
               var6 = "MAX_VALUE";
            } else {
               if(var8 != Float.MIN_VALUE) {
                  return this.field_152.toString() + "F";
               }

               var6 = "MIN_VALUE";
            }

            var10 = new class_92;
            var10.method_308(var6, "java/lang/Float", true, (class_86)null, class_206.field_557);
            return var10.method_262(0);
         case 5:
            long var2;
            if((var2 = ((Long)this.field_152).longValue()) == Long.MAX_VALUE) {
               var6 = "MAX_VALUE";
            } else {
               if(var2 != Long.MIN_VALUE) {
                  return this.field_152.toString() + "L";
               }

               var6 = "MIN_VALUE";
            }

            var10 = new class_92;
            var10.method_308(var6, "java/lang/Long", true, (class_86)null, class_206.field_556);
            return var10.method_262(0);
         case 7:
            return (new Boolean(((Integer)this.field_152).intValue() != 0)).toString();
         case 8:
            if(this.field_151.equals(class_83.field_129)) {
               return "\"" + method_267(this.field_152.toString()) + "\"";
            } else if(this.field_151.equals(class_83.field_130)) {
               class_83 var7;
               class_83 var10000;
               if((var6 = this.field_152.toString()).startsWith("[")) {
                  var10000 = new class_83;
                  var10000.method_239(var6, false);
                  var7 = var10000;
               } else {
                  var10000 = new class_83;
                  var10000.method_239(var6, true);
                  var7 = var10000;
               }

               return class_209.method_1039(var7) + ".class";
            }
         case 9:
         case 10:
         case 11:
         case 12:
         case 14:
         default:
            throw new RuntimeException("invalid constant type");
         case 13:
            return "null";
         }
      }
   }

   // $FF: renamed from: a (java.lang.String) java.lang.String
   private static String method_267(String var0) {
      char[] var5 = var0.toCharArray();
      StringBuilder var1 = new StringBuilder(var5.length);
      char[] var4 = var5;
      int var3 = var5.length;

      for(int var2 = 0; var2 < var3; ++var2) {
         char var6;
         switch(var6 = var4[var2]) {
         case 8:
            var1.append("\\b");
            break;
         case 9:
            var1.append("\\t");
            break;
         case 10:
            var1.append("\\n");
            break;
         case 12:
            var1.append("\\f");
            break;
         case 13:
            var1.append("\\r");
            break;
         case 34:
            var1.append("\\\"");
            break;
         case 39:
            var1.append("\\\'");
            break;
         case 92:
            var1.append("\\\\");
            break;
         default:
            if(class_181.method_846("asc") && (var6 < 32 || var6 >= 127)) {
               var1.append(class_129.method_561(var6));
            } else {
               var1.append(var6);
            }
         }
      }

      return var1.toString();
   }

   public final boolean equals(Object var1) {
      if(var1 != null && var1 instanceof class_87) {
         class_87 var2 = (class_87)var1;
         return class_129.method_558(this.field_151, var2.field_151) && class_129.method_558(this.field_152, var2.field_152);
      } else {
         return false;
      }
   }

   // $FF: renamed from: g () boolean
   public final boolean method_268() {
      switch(this.field_151.field_133) {
      case 0:
      case 1:
      case 4:
      case 6:
      case 7:
      case 15:
      case 16:
         Integer var1;
         return (var1 = (Integer)this.field_152).intValue() == 0 || class_181.method_846("bto") && var1.intValue() == 1;
      case 2:
      case 3:
      case 5:
      case 8:
      case 9:
      case 10:
      case 11:
      case 12:
      case 13:
      case 14:
      default:
         return false;
      }
   }

   // $FF: renamed from: h () boolean
   public final boolean method_269() {
      switch(this.field_151.field_133) {
      case 0:
      case 1:
      case 4:
      case 6:
      case 7:
      case 15:
      case 16:
         if(((Integer)this.field_152).intValue() == 1) {
            return true;
         }

         return false;
      case 2:
         if(((Double)this.field_152).intValue() == 1) {
            return true;
         }

         return false;
      case 3:
         if(((Float)this.field_152).intValue() == 1) {
            return true;
         }

         return false;
      case 5:
         if(((Long)this.field_152).intValue() == 1) {
            return true;
         }

         return false;
      case 8:
      case 9:
      case 10:
      case 11:
      case 12:
      case 13:
      case 14:
      default:
         return false;
      }
   }

   // $FF: renamed from: b (int) bI
   public static class_87 method_270(int var0) {
      class_87 var10000;
      switch(var0) {
      case 2:
         var10000 = new class_87;
         var10000.method_266(class_83.field_121, new Double(0.0D));
         return var10000;
      case 3:
         var10000 = new class_87;
         var10000.method_266(class_83.field_119, new Float(0.0F));
         return var10000;
      case 4:
         var10000 = new class_87;
         var10000.method_266(class_83.field_118, new Integer(0));
         return var10000;
      case 5:
         var10000 = new class_87;
         var10000.method_266(class_83.field_120, new Long(0L));
         return var10000;
      default:
         throw new RuntimeException("Invalid argument!");
      }
   }

   // $FF: renamed from: i () Q
   public final class_83 method_271() {
      return this.field_151;
   }

   // $FF: renamed from: a (Q) void
   public final void method_272(class_83 var1) {
      this.field_151 = var1;
   }

   // $FF: renamed from: j () java.lang.Object
   public final Object method_273() {
      return this.field_152;
   }

   // $FF: renamed from: k () int
   public final int method_274() {
      return ((Integer)this.field_152).intValue();
   }

   // $FF: renamed from: l () boolean
   public final boolean method_275() {
      return this.field_153;
   }
}
