import java.util.ArrayList;
import java.util.List;

// $FF: renamed from: cF
public final class class_148 {

   // $FF: renamed from: a int
   public int field_368;
   // $FF: renamed from: b java.lang.String
   public String field_369;
   // $FF: renamed from: c ci
   public class_48 field_370;
   // $FF: renamed from: d ca
   public class_46 field_371;
   // $FF: renamed from: e java.util.List
   public List field_372;
   // $FF: renamed from: f java.util.List
   public List field_373;
   // $FF: renamed from: g java.util.List
   public List field_374;


   // $FF: renamed from: <init> (int, ca, java.lang.String) void
   public void method_679(int var1, class_46 var2, String var3) {
      super();
      this.field_372 = new ArrayList();
      this.field_373 = new ArrayList();
      this.field_374 = new ArrayList();
      this.field_368 = var1;
      this.field_371 = var2;
      this.field_369 = var3;
   }

   // $FF: renamed from: <init> (ca, ci) void
   public void method_680(class_46 var1, class_48 var2) {
      super();
      this.field_372 = new ArrayList();
      this.field_373 = new ArrayList();
      this.field_374 = new ArrayList();
      this.field_368 = 1;
      this.field_371 = var1;
      this.field_369 = var2.field_14.toString();
      this.field_370 = var2;
   }

   public final String toString() {
      return this.field_369;
   }
}
