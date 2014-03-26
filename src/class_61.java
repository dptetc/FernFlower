
// $FF: renamed from: cQ
public abstract class class_61 {

   // $FF: renamed from: a cE
   protected class_146 field_72;
   // $FF: renamed from: c int
   private int field_73;
   // $FF: renamed from: b bf
   protected class_137 field_74;


   // $FF: renamed from: <init> () void
   public void method_165() {
      super();
      class_146 var10001 = new class_146;
      var10001.method_653();
      this.field_72 = var10001;
      this.field_73 = 0;
      class_137 var1 = new class_137;
      var1.method_589();
      this.field_74 = var1;
   }

   // $FF: renamed from: a () cQ
   public class_61 method_166() {
      return null;
   }

   // $FF: renamed from: b () void
   public final void method_167() {
      this.field_72.clear();
      this.field_73 = 0;
      class_137 var10001 = new class_137;
      var10001.method_589();
      this.field_74 = var10001;
   }

   // $FF: renamed from: a (j, int) void
   public final void method_168(class_5 var1, int var2) {
      this.field_72.method_655(var1, Integer.valueOf(var2));
   }

   // $FF: renamed from: a (j) void
   public final void method_169(class_5 var1) {
      this.field_72.method_657(0, var1, Integer.valueOf(-1));
   }

   // $FF: renamed from: a (int) void
   public void method_170(int var1) {
      this.field_72.remove(var1);
   }

   // $FF: renamed from: b (int) j
   public final class_5 method_171(int var1) {
      return (class_5)this.field_72.get(var1);
   }

   // $FF: renamed from: c () j
   public final class_5 method_172() {
      return (class_5)this.field_72.method_661();
   }

   // $FF: renamed from: c (int) int
   public final int method_173(int var1) {
      return ((Integer)this.field_72.method_664(var1)).intValue();
   }

   // $FF: renamed from: d (int) int
   public final int method_174(int var1) {
      Integer var2 = new Integer(var1);
      return this.field_72.method_662(var2)?this.field_72.method_660(var2):-1;
   }

   // $FF: renamed from: e (int) int
   public final int method_175(int var1) {
      Integer var2 = new Integer(((Integer)this.field_72.method_664(this.field_73)).intValue() + var1);
      return this.field_72.method_662(var2)?this.field_72.method_660(var2):-1;
   }

   // $FF: renamed from: d () int
   public final int method_176() {
      return this.field_72.size();
   }

   // $FF: renamed from: e () boolean
   public final boolean method_177() {
      return this.field_72.isEmpty();
   }

   // $FF: renamed from: f () void
   public final void method_178() {
      this.field_73 += -1;
   }

   public String toString() {
      return this.method_179(0);
   }

   // $FF: renamed from: f (int) java.lang.String
   public final String method_179(int var1) {
      StringBuffer var3 = new StringBuffer();

      for(int var2 = 0; var2 < this.field_72.size(); ++var2) {
         var3.append(class_129.method_557(0));
         var3.append(((Integer)this.field_72.method_664(var2)).intValue());
         var3.append(": ");
         var3.append(((class_5)this.field_72.get(var2)).toString());
         var3.append("\r\n");
      }

      return var3.toString();
   }

   // $FF: renamed from: g () int
   public final int method_180() {
      return this.field_73;
   }

   // $FF: renamed from: g (int) void
   public final void method_181(int var1) {
      this.field_73 = var1;
   }

   // $FF: renamed from: h () bf
   public final class_137 method_182() {
      return this.field_74;
   }
}
