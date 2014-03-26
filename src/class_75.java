import java.io.ByteArrayInputStream;
import java.io.DataInputStream;

// $FF: renamed from: W
public final class class_75 extends class_67 {

   // $FF: renamed from: c aJ
   private class_86 field_94;


   // $FF: renamed from: <init> () void
   public void method_193() {
      super.method_193();
   }

   // $FF: renamed from: a (bK) void
   public final void method_194(class_203 var1) {
      this.field_83 = "AnnotationDefault";
      DataInputStream var2 = new DataInputStream(new ByteArrayInputStream(this.field_82));
      this.field_94 = class_69.method_202(var2, var1);
   }

   // $FF: renamed from: a () aJ
   public final class_86 method_211() {
      return this.field_94;
   }
}
