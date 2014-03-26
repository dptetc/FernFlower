
// $FF: renamed from: P
public final class class_84 {

   // $FF: renamed from: a int
   public int field_139;
   // $FF: renamed from: b int
   public int field_140;
   // $FF: renamed from: c int
   public int field_141;
   // $FF: renamed from: d int
   public int field_142;
   // $FF: renamed from: e int
   public int field_143;
   // $FF: renamed from: f int
   public int field_144;
   // $FF: renamed from: g java.lang.String
   public String field_145;


   // $FF: renamed from: <init> () void
   public void method_250() {
      super();
      this.field_139 = 0;
      this.field_140 = 0;
      this.field_141 = 0;
      this.field_142 = 0;
      this.field_143 = 0;
      this.field_144 = 0;
      this.field_145 = null;
   }

   public final String toString() {
      StringBuffer var1;
      (var1 = new StringBuffer()).append("from: " + this.field_139 + " to: " + this.field_140 + " handler: " + this.field_141 + "\n");
      var1.append("from_instr: " + this.field_142 + " to_instr: " + this.field_143 + " handler_instr: " + this.field_144 + "\n");
      var1.append("exceptionClass: " + this.field_145 + "\n");
      return var1.toString();
   }
}
