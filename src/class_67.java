
// $FF: renamed from: bz
public class class_67 {

   // $FF: renamed from: c int
   private int field_81;
   // $FF: renamed from: a byte[]
   protected byte[] field_82;
   // $FF: renamed from: b java.lang.String
   protected String field_83;


   // $FF: renamed from: <init> () void
   public void method_193() {
      super();
   }

   // $FF: renamed from: a (bK) void
   public void method_194(class_203 var1) {
      this.field_83 = (String)var1.method_995(this.field_81).field_106;
   }

   // $FF: renamed from: a (int, java.lang.String) bz
   public static class_67 method_195(int var0, String var1) {
      Object var2;
      if("InnerClasses".equals(var1)) {
         class_73 var10000 = new class_73;
         var10000.method_193();
         var2 = var10000;
      } else if("ConstantValue".equals(var1)) {
         class_74 var9 = new class_74;
         var9.method_193();
         var2 = var9;
      } else if("Signature".equals(var1)) {
         class_70 var10 = new class_70;
         var10.method_193();
         var2 = var10;
      } else if("AnnotationDefault".equals(var1)) {
         class_75 var7 = new class_75;
         var7.method_193();
         var2 = var7;
      } else if("Exceptions".equals(var1)) {
         class_71 var8 = new class_71;
         var8.method_193();
         var2 = var8;
      } else if("EnclosingMethod".equals(var1)) {
         class_68 var5 = new class_68;
         var5.method_193();
         var2 = var5;
      } else if(!"RuntimeVisibleAnnotations".equals(var1) && !"RuntimeInvisibleAnnotations".equals(var1)) {
         if(!"RuntimeVisibleParameterAnnotations".equals(var1) && !"RuntimeInvisibleParameterAnnotations".equals(var1)) {
            if(!"LocalVariableTable".equals(var1)) {
               return null;
            }

            class_76 var4 = new class_76;
            var4.method_193();
            var2 = var4;
         } else {
            class_72 var3 = new class_72;
            var3.method_193();
            var2 = var3;
         }
      } else {
         class_69 var6 = new class_69;
         var6.method_193();
         var2 = var6;
      }

      ((class_67)var2).field_81 = var0;
      return (class_67)var2;
   }

   // $FF: renamed from: a (byte[]) void
   public final void method_196(byte[] var1) {
      this.field_82 = var1;
   }

   // $FF: renamed from: d () java.lang.String
   public final String method_197() {
      return this.field_83;
   }
}
