import de.fernflower.main.extern.IIdentifierRenamer;
import java.util.HashSet;

// $FF: renamed from: aZ
public final class class_167 implements IIdentifierRenamer {

   // $FF: renamed from: a java.util.HashSet
   private static HashSet field_418;
   // $FF: renamed from: b int
   private int field_419;
   // $FF: renamed from: c int
   private int field_420;
   // $FF: renamed from: d int
   private int field_421;
   // $FF: renamed from: e java.util.HashSet
   private HashSet field_422;


   // $FF: renamed from: <clinit> () void
   static void method_766() {
      (field_418 = new HashSet()).add("abstract");
      field_418.add("do");
      field_418.add("if");
      field_418.add("package");
      field_418.add("synchronized");
      field_418.add("boolean");
      field_418.add("double");
      field_418.add("implements");
      field_418.add("private");
      field_418.add("this");
      field_418.add("break");
      field_418.add("else");
      field_418.add("import");
      field_418.add("protected");
      field_418.add("throw");
      field_418.add("byte");
      field_418.add("extends");
      field_418.add("instanceof");
      field_418.add("public");
      field_418.add("throws");
      field_418.add("case");
      field_418.add("false");
      field_418.add("int");
      field_418.add("return");
      field_418.add("transient");
      field_418.add("catch");
      field_418.add("final");
      field_418.add("interface");
      field_418.add("short");
      field_418.add("true");
      field_418.add("char");
      field_418.add("finally");
      field_418.add("long");
      field_418.add("static");
      field_418.add("try");
      field_418.add("class");
      field_418.add("float");
      field_418.add("native");
      field_418.add("strictfp");
      field_418.add("void");
      field_418.add("const");
      field_418.add("for");
      field_418.add("new");
      field_418.add("super");
      field_418.add("volatile");
      field_418.add("continue");
      field_418.add("goto");
      field_418.add("null");
      field_418.add("switch");
      field_418.add("while");
      field_418.add("default");
      field_418.add("assert");
      field_418.add("enum");
   }

   // $FF: renamed from: <init> () void
   public void method_767() {
      super();
      this.field_419 = 0;
      this.field_420 = 0;
      this.field_421 = 0;
      this.field_422 = new HashSet();
   }

   public final boolean toBeRenamed(int var1, String var2, String var3, String var4) {
      String var5;
      return (var5 = var1 == 1?var2:var3) == null || var5.length() == 0 || var5.length() <= 2 || field_418.contains(var5) || !Character.isJavaIdentifierStart(var5.charAt(0));
   }

   public final String getNextClassname(String var1, String var2) {
      if(var2 == null) {
         return "class_" + this.field_419++;
      } else {
         int var3;
         for(var3 = 0; Character.isDigit(var2.charAt(var3)); ++var3) {
            ;
         }

         if(var3 != 0 && var3 != var2.length()) {
            var1 = var2.substring(var3);
            if(this.field_422.contains(var1)) {
               return "Inner" + var1 + "_" + this.field_419++;
            } else {
               this.field_422.add(var1);
               return "Inner" + var1;
            }
         } else {
            return "class_" + this.field_419++;
         }
      }
   }

   public final String getNextFieldname(String var1, String var2, String var3) {
      return "field_" + this.field_420++;
   }

   public final String getNextMethodname(String var1, String var2, String var3) {
      return "method_" + this.field_421++;
   }

   // $FF: renamed from: a (java.lang.String) java.lang.String
   public static String method_768(String var0) {
      return var0.substring(var0.lastIndexOf(47) + 1);
   }

   // $FF: renamed from: a (java.lang.String, java.lang.String) java.lang.String
   public static String method_769(String var0, String var1) {
      return var0.substring(0, var0.lastIndexOf(47) + 1) + var1;
   }
}
