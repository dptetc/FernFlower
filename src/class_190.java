import de.fernflower.main.extern.IFernflowerLogger;
import java.io.PrintStream;

// $FF: renamed from: at
public final class class_190 implements IFernflowerLogger {

   // $FF: renamed from: a int
   private int field_485;
   // $FF: renamed from: b int
   private int field_486;
   // $FF: renamed from: c java.io.PrintStream
   private PrintStream field_487;


   // $FF: renamed from: <init> (int, java.io.PrintStream) void
   public void method_908(int var1, PrintStream var2) {
      super();
      this.field_485 = var1;
      this.field_486 = 0;
      this.field_487 = var2;
   }

   public final void writeMessage(String var1, int var2) {
      this.writeMessage(var1, var2, this.field_486);
   }

   public final void writeMessage(String var1, int var2, int var3) {
      if(var2 >= this.field_485) {
         this.field_487.println(class_129.method_557(var3) + names[var2] + ": " + var1);
      }

   }

   public final void startClass(String var1) {
      this.field_487.println(class_129.method_557(this.field_486++) + "Processing class " + var1 + " ...");
   }

   public final void endClass() {
      this.field_487.println(class_129.method_557(--this.field_486) + "... proceeded.");
   }

   public final void startWriteClass(String var1) {
      this.field_487.println(class_129.method_557(this.field_486++) + "Writing class " + var1 + " ...");
   }

   public final void endWriteClass() {
      this.field_487.println(class_129.method_557(--this.field_486) + "... written.");
   }

   public final void startMethod(String var1) {
      if(this.field_485 <= 2) {
         this.field_487.println(class_129.method_557(this.field_486) + "Processing method " + var1 + " ...");
      }

   }

   public final void endMethod() {
      if(this.field_485 <= 2) {
         this.field_487.println(class_129.method_557(this.field_486) + "... proceeded.");
      }

   }

   public final int getSeverity() {
      return this.field_485;
   }

   public final void setSeverity(int var1) {
      this.field_485 = var1;
   }

   public final boolean getShowStacktrace() {
      return false;
   }
}
