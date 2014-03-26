
// $FF: renamed from: Q
public final class class_83 {

   // $FF: renamed from: a Q
   public static final class_83 field_117;
   // $FF: renamed from: b Q
   public static final class_83 field_118;
   // $FF: renamed from: c Q
   public static final class_83 field_119;
   // $FF: renamed from: d Q
   public static final class_83 field_120;
   // $FF: renamed from: e Q
   public static final class_83 field_121;
   // $FF: renamed from: f Q
   public static final class_83 field_122;
   // $FF: renamed from: g Q
   public static final class_83 field_123;
   // $FF: renamed from: h Q
   public static final class_83 field_124;
   // $FF: renamed from: i Q
   public static final class_83 field_125;
   // $FF: renamed from: j Q
   public static final class_83 field_126;
   // $FF: renamed from: k Q
   public static final class_83 field_127;
   // $FF: renamed from: l Q
   public static final class_83 field_128;
   // $FF: renamed from: m Q
   public static final class_83 field_129;
   // $FF: renamed from: n Q
   public static final class_83 field_130;
   // $FF: renamed from: o Q
   public static final class_83 field_131;
   // $FF: renamed from: p Q
   public static final class_83 field_132;
   // $FF: renamed from: q int
   public int field_133;
   // $FF: renamed from: r int
   public int field_134;
   // $FF: renamed from: s int
   public int field_135;
   // $FF: renamed from: t java.lang.String
   public String field_136;
   // $FF: renamed from: u int
   public int field_137;
   // $FF: renamed from: v int
   public int field_138;


   // $FF: renamed from: <clinit> () void
   static void method_234() {
      class_83 var10000 = new class_83;
      var10000.method_235(17);
      field_117 = var10000;
      var10000 = new class_83;
      var10000.method_235(4);
      field_118 = var10000;
      var10000 = new class_83;
      var10000.method_235(3);
      field_119 = var10000;
      var10000 = new class_83;
      var10000.method_235(5);
      field_120 = var10000;
      var10000 = new class_83;
      var10000.method_235(2);
      field_121 = var10000;
      var10000 = new class_83;
      var10000.method_235(0);
      field_122 = var10000;
      var10000 = new class_83;
      var10000.method_235(1);
      field_123 = var10000;
      var10000 = new class_83;
      var10000.method_235(6);
      field_124 = var10000;
      var10000 = new class_83;
      var10000.method_235(7);
      field_125 = var10000;
      var10000 = new class_83;
      var10000.method_235(15);
      field_126 = var10000;
      var10000 = new class_83;
      var10000.method_235(16);
      field_127 = var10000;
      var10000 = new class_83;
      var10000.method_237(13, 0, (String)null);
      field_128 = var10000;
      (new class_83).method_235(12);
      var10000 = new class_83;
      var10000.method_237(8, 0, "java/lang/String");
      field_129 = var10000;
      var10000 = new class_83;
      var10000.method_237(8, 0, "java/lang/Class");
      field_130 = var10000;
      var10000 = new class_83;
      var10000.method_237(8, 0, "java/lang/Object");
      field_131 = var10000;
      var10000 = new class_83;
      var10000.method_235(10);
      field_132 = var10000;
   }

   // $FF: renamed from: <init> (int) void
   public void method_235(int var1) {
      super();
      this.field_133 = var1;
      this.field_135 = 0;
      String var10001;
      switch(var1) {
      case 0:
         var10001 = "B";
         break;
      case 1:
         var10001 = "C";
         break;
      case 2:
         var10001 = "D";
         break;
      case 3:
         var10001 = "F";
         break;
      case 4:
         var10001 = "I";
         break;
      case 5:
         var10001 = "J";
         break;
      case 6:
         var10001 = "S";
         break;
      case 7:
         var10001 = "Z";
         break;
      case 8:
      case 13:
         var10001 = null;
         break;
      case 9:
         var10001 = "A";
         break;
      case 10:
         var10001 = "V";
         break;
      case 11:
      default:
         throw new RuntimeException("Invalid type");
      case 12:
         var10001 = "G";
         break;
      case 14:
         var10001 = "N";
         break;
      case 15:
         var10001 = "X";
         break;
      case 16:
         var10001 = "Y";
         break;
      case 17:
         var10001 = "U";
      }

      this.field_136 = var10001;
      this.method_248(var1);
      this.method_249();
   }

   // $FF: renamed from: <init> (int, int) void
   public void method_236(int var1, int var2) {
      this.method_235(var1);
      this.field_135 = 1;
      this.method_249();
   }

   // $FF: renamed from: <init> (int, int, java.lang.String) void
   public void method_237(int var1, int var2, String var3) {
      this.method_235(var1);
      this.field_135 = var2;
      this.field_136 = var3;
      this.method_249();
   }

   // $FF: renamed from: <init> (java.lang.String) void
   public void method_238(String var1) {
      this.method_239(var1, false);
   }

   // $FF: renamed from: <init> (java.lang.String, boolean) void
   public void method_239(String var1, boolean var2) {
      super();
      this.method_247(var1, var2);
      this.method_248(this.field_133);
      this.method_249();
   }

   // $FF: renamed from: a () void
   public final void method_240() {
      if(this.field_135 > 0) {
         --this.field_135;
         this.method_249();
      }

   }

   public final String toString() {
      String var1 = "";

      for(int var2 = 0; var2 < this.field_135; ++var2) {
         var1 = var1 + "[";
      }

      if(this.field_133 == 8) {
         var1 = var1 + "L" + this.field_136 + ";";
      } else {
         var1 = var1 + this.field_136;
      }

      return var1;
   }

   // $FF: renamed from: b () Q
   public final class_83 method_241() {
      class_83 var10000 = new class_83;
      var10000.method_237(this.field_133, this.field_135, this.field_136);
      class_83 var1 = var10000;
      var10000.field_138 = this.field_138;
      return var1;
   }

   // $FF: renamed from: a (Q) boolean
   public final boolean method_242(class_83 var1) {
      return this.equals(var1) || this.method_243(var1);
   }

   // $FF: renamed from: b (Q) boolean
   public final boolean method_243(class_83 var1) {
      int var2 = var1.field_133;
      if(var1.field_133 == 17 && this.field_133 != 17) {
         return true;
      } else if(var1.field_135 > 0) {
         return this.equals(field_131);
      } else if(this.field_135 > 0) {
         return var2 == 13;
      } else {
         boolean var3 = false;
         switch(this.field_133) {
         case 2:
         case 3:
         case 5:
         case 7:
         case 9:
         case 10:
         case 11:
         case 12:
         case 13:
         case 14:
         default:
            break;
         case 4:
            var3 = false | (var2 == 6 || var2 == 1);
         case 6:
            var3 |= var2 == 0;
         case 1:
            var3 |= var2 == 16;
         case 0:
         case 16:
            var3 |= var2 == 15;
         case 8:
            if(var2 == 13) {
               return true;
            }

            if(this.equals(field_131)) {
               if(var2 == 8 && !var1.equals(field_131)) {
                  return true;
               }

               return false;
            }
            break;
         case 15:
            var3 |= var2 == 7;
         }

         return var3;
      }
   }

   // $FF: renamed from: a (Q, Q) Q
   public static class_83 method_244(class_83 var0, class_83 var1) {
      if(var0.method_242(var1)) {
         return var1;
      } else if(var1.method_242(var0)) {
         return var0;
      } else {
         if(var0.field_134 == var1.field_134) {
            switch(var0.field_134) {
            case 2:
               if((var0.field_133 != 1 || var1.field_133 != 6) && (var0.field_133 != 6 || var1.field_133 != 1)) {
                  return field_126;
               }

               return field_127;
            case 3:
            case 4:
            case 5:
            default:
               break;
            case 6:
               return field_128;
            }
         }

         return null;
      }
   }

   // $FF: renamed from: b (Q, Q) Q
   public static class_83 method_245(class_83 var0, class_83 var1) {
      if(var0.method_242(var1)) {
         return var0;
      } else if(var1.method_242(var0)) {
         return var1;
      } else {
         if(var0.field_134 == var1.field_134) {
            switch(var0.field_134) {
            case 2:
               if((var0.field_133 != 16 || var1.field_133 != 0) && (var0.field_133 != 0 || var1.field_133 != 16)) {
                  return field_118;
               }

               return field_124;
            case 3:
            case 4:
            case 5:
            default:
               break;
            case 6:
               return field_131;
            }
         }

         return null;
      }
   }

   // $FF: renamed from: a (int) Q
   public static class_83 method_246(int var0) {
      switch(var0) {
      case 0:
         return field_117;
      case 1:
         return field_125;
      case 2:
         return field_126;
      case 3:
         return field_119;
      case 4:
         return field_120;
      case 5:
         return field_121;
      case 6:
         return field_128;
      default:
         throw new RuntimeException("invalid type family!");
      }
   }

   public final boolean equals(Object var1) {
      if(var1 != null && var1 instanceof class_83) {
         class_83 var2 = (class_83)var1;
         return this.field_133 == var2.field_133 && this.field_135 == var2.field_135 && class_129.method_558(this.field_136, var2.field_136);
      } else {
         return false;
      }
   }

   // $FF: renamed from: a (java.lang.String, boolean) void
   private void method_247(String var1, boolean var2) {
      int var3 = 0;

      while(var3 < var1.length()) {
         switch(var1.charAt(var3)) {
         case 76:
            if(var1.charAt(var1.length() - 1) == 59) {
               this.field_133 = 8;
               this.field_136 = var1.substring(var3 + 1, var1.length() - 1);
               return;
            }
         case 91:
            ++this.field_135;
            ++var3;
            break;
         default:
            this.field_136 = var1.substring(var3, var1.length());
            byte var10001;
            class_83 var10000;
            if((!var2 || var3 != 0) && this.field_136.length() <= 1) {
               var10000 = this;
               switch(this.field_136.charAt(0)) {
               case 65:
                  var10001 = 9;
                  break;
               case 66:
                  var10001 = 0;
                  break;
               case 67:
                  var10001 = 1;
                  break;
               case 68:
                  var10001 = 2;
                  break;
               case 69:
               case 72:
               case 75:
               case 76:
               case 77:
               case 79:
               case 80:
               case 81:
               case 82:
               case 84:
               case 87:
               default:
                  throw new RuntimeException("Invalid type");
               case 70:
                  var10001 = 3;
                  break;
               case 71:
                  var10001 = 12;
                  break;
               case 73:
                  var10001 = 4;
                  break;
               case 74:
                  var10001 = 5;
                  break;
               case 78:
                  var10001 = 14;
                  break;
               case 83:
                  var10001 = 6;
                  break;
               case 85:
                  var10001 = 17;
                  break;
               case 86:
                  var10001 = 10;
                  break;
               case 88:
                  var10001 = 15;
                  break;
               case 89:
                  var10001 = 16;
                  break;
               case 90:
                  var10001 = 7;
               }
            } else {
               var10000 = this;
               var10001 = 8;
            }

            var10000.field_133 = var10001;
            return;
         }
      }

   }

   // $FF: renamed from: b (int) void
   private void method_248(int var1) {
      byte var10001;
      class_83 var10000;
      label25: {
         if(this.field_135 > 0) {
            var10000 = this;
         } else {
            var10000 = this;
            if(var1 == 2 || var1 == 5) {
               var10001 = 2;
               break label25;
            }

            if(var1 == 10 || var1 == 12) {
               var10001 = 0;
               break label25;
            }
         }

         var10001 = 1;
      }

      var10000.field_137 = var10001;
   }

   // $FF: renamed from: c () void
   private void method_249() {
      if(this.field_135 > 0) {
         this.field_134 = 6;
      } else {
         switch(this.field_133) {
         case 0:
         case 1:
         case 4:
         case 6:
         case 15:
         case 16:
            this.field_134 = 2;
            return;
         case 2:
            this.field_134 = 5;
            return;
         case 3:
            this.field_134 = 3;
            return;
         case 5:
            this.field_134 = 4;
            return;
         case 7:
            this.field_134 = 1;
            return;
         case 8:
         case 13:
            this.field_134 = 6;
            return;
         case 9:
         case 10:
         case 11:
         case 12:
         case 14:
         default:
            this.field_134 = 0;
         }
      }
   }
}
