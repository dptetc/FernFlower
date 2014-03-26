
// $FF: renamed from: bG
public final class class_213 {

   // $FF: renamed from: a java.lang.String[]
   private static String[] field_595;
   // $FF: renamed from: b java.lang.Class[]
   private static Class[] field_596;


   // $FF: renamed from: <clinit> () void
   static void method_1064() {
      field_595 = new String[]{"nop", "aconst_null", "iconst_m1", "iconst_0", "iconst_1", "iconst_2", "iconst_3", "iconst_4", "iconst_5", "lconst_0", "lconst_1", "fconst_0", "fconst_1", "fconst_2", "dconst_0", "dconst_1", "bipush", "sipush", "ldc", "ldc_w", "ldc2_w", "iload", "lload", "fload", "dload", "aload", "iload_0", "iload_1", "iload_2", "iload_3", "lload_0", "lload_1", "lload_2", "lload_3", "fload_0", "fload_1", "fload_2", "fload_3", "dload_0", "dload_1", "dload_2", "dload_3", "aload_0", "aload_1", "aload_2", "aload_3", "iaload", "laload", "faload", "daload", "aaload", "baload", "caload", "saload", "istore", "lstore", "fstore", "dstore", "astore", "istore_0", "istore_1", "istore_2", "istore_3", "lstore_0", "lstore_1", "lstore_2", "lstore_3", "fstore_0", "fstore_1", "fstore_2", "fstore_3", "dstore_0", "dstore_1", "dstore_2", "dstore_3", "astore_0", "astore_1", "astore_2", "astore_3", "iastore", "lastore", "fastore", "dastore", "aastore", "bastore", "castore", "sastore", "pop", "pop2", "dup", "dup_x1", "dup_x2", "dup2", "dup2_x1", "dup2_x2", "swap", "iadd", "ladd", "fadd", "dadd", "isub", "lsub", "fsub", "dsub", "imul", "lmul", "fmul", "dmul", "idiv", "ldiv", "fdiv", "ddiv", "irem", "lrem", "frem", "drem", "ineg", "lneg", "fneg", "dneg", "ishl", "lshl", "ishr", "lshr", "iushr", "lushr", "iand", "land", "ior", "lor", "ixor", "lxor", "iinc", "i2l", "i2f", "i2d", "l2i", "l2f", "l2d", "f2i", "f2l", "f2d", "d2i", "d2l", "d2f", "i2b", "i2c", "i2s", "lcmp", "fcmpl", "fcmpg", "dcmpl", "dcmpg", "ifeq", "ifne", "iflt", "ifge", "ifgt", "ifle", "if_icmpeq", "if_icmpne", "if_icmplt", "if_icmpge", "if_icmpgt", "if_icmple", "if_acmpeq", "if_acmpne", "goto", "jsr", "ret", "tableswitch", "lookupswitch", "ireturn", "lreturn", "freturn", "dreturn", "areturn", "return", "getstatic", "putstatic", "getfield", "putfield", "invokevirtual", "invokespecial", "invokestatic", "invokeinterface", "xxxunusedxxx", "new", "newarray", "anewarray", "arraylength", "athrow", "checkcast", "instanceof", "monitorenter", "monitorexit", "wide", "multianewarray", "ifnull", "ifnonnull", "goto_w", "jsr_w"};
      field_596 = new Class[]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, class_10.class, class_41.class, class_24.class, class_45.class, class_18.class, class_21.class, class_42.class, class_28.class, class_23.class, class_20.class, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, class_13.class, class_14.class, class_19.class, class_17.class, class_12.class, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, class_15.class, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, class_39.class, class_38.class, class_26.class, class_30.class, class_31.class, null, null, null, null, null, null, class_6.class, class_7.class, class_9.class, class_16.class, class_43.class, class_11.class, class_8.class, class_44.class, null, class_27.class, class_22.class, class_32.class, null, null, class_25.class, class_40.class, null, null, null, class_33.class, null, null, class_35.class, class_37.class};
   }

   // $FF: renamed from: <init> () void
   public void method_1065() {
      super();
   }

   // $FF: renamed from: a (int) java.lang.String
   public static String method_1066(int var0) {
      return field_595[var0];
   }

   // $FF: renamed from: a (int, boolean, int, int[]) j
   public static class_5 method_1067(int var0, boolean var1, int var2, int[] var3) {
      class_5 var4;
      (var4 = method_1068(var0)).field_7 = var1;
      var4.field_6 = var2;
      var4.method_19(var3);
      return var4;
   }

   // $FF: renamed from: b (int) j
   private static class_5 method_1068(int var0) {
      try {
         Object var1;
         if((var0 < 153 || var0 > 166) && var0 != 198 && var0 != 199) {
            Class var3;
            if((var3 = field_596[var0]) == null) {
               class_5 var4 = new class_5;
               var4.method_13();
               var1 = var4;
            } else {
               var1 = (class_5)var3.newInstance();
            }
         } else {
            class_36 var10000 = new class_36;
            var10000.method_13();
            var1 = var10000;
         }

         ((class_5)var1).field_5 = var0;
         return (class_5)var1;
      } catch (Exception var2) {
         return null;
      }
   }
}
