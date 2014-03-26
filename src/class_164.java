import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;

// $FF: renamed from: ce
public final class class_164 {

   // $FF: renamed from: a java.util.HashMap
   private HashMap field_413;
   // $FF: renamed from: b d
   private class_101 field_414;
   // $FF: renamed from: c java.util.HashMap
   private HashMap field_415;
   // $FF: renamed from: d java.util.HashSet
   private HashSet field_416;


   // $FF: renamed from: <init> () void
   public void method_746() {
      super();
      this.field_413 = new HashMap();
      this.field_415 = new HashMap();
      this.field_416 = new HashSet();
   }

   // $FF: renamed from: a (S) void
   public final void method_747(class_54 var1) {
      class_101 var10001 = new class_101;
      var10001.method_369();
      this.field_414 = var10001;
      this.field_414.method_370(var1);
   }

   // $FF: renamed from: a (ca) void
   public final void method_748(class_46 var1) {
      this.field_413 = new HashMap();
      class_162 var10000 = new class_162;
      var10000.method_735(var1, (class_128)class_181.method_844("CURRENT_METHOD"), this);
      var10000.method_736();
   }

   // $FF: renamed from: a (java.util.HashMap) void
   public final void method_749(HashMap var1) {
      if(this.field_414 != null) {
         HashMap var2 = this.field_414.method_378();
         ArrayList var3;
         ArrayList var10000 = var3 = new ArrayList((Collection)this.field_413.keySet());
         class_202 var10001 = new class_202;
         var10001.method_991();
         Collections.sort(var10000, var10001);
         HashMap var4 = new HashMap();

         String var6;
         class_77 var8;
         for(Iterator var5 = var3.iterator(); var5.hasNext(); this.field_413.put(var8, var6)) {
            var8 = (class_77)var5.next();
            var6 = (String)this.field_413.get(var8);
            Integer var7;
            if((var7 = (Integer)var2.get(Integer.valueOf(var8.field_96))) != null && var1.containsKey(var7)) {
               var6 = (String)var1.get(var7);
            }

            var7 = (Integer)var4.get(var6);
            var4.put(var6, var7 == null?(var7 = new Integer(0)):(var7 = Integer.valueOf(var7.intValue() + 1)));
            if(var7.intValue() > 0) {
               var6 = var6 + String.valueOf(var7);
            }
         }

      }
   }

   // $FF: renamed from: a (bS) void
   public final void method_750(class_193 var1) {
      HashMap var10000 = new HashMap(this.field_413);
      Entry var2 = null;
      Iterator var3 = var10000.entrySet().iterator();

      while(var3.hasNext()) {
         var2 = (Entry)var3.next();
         this.field_413.put((class_77)var2.getKey(), var1.method_940((String)var2.getValue()));
      }

   }

   // $FF: renamed from: a (de) Q
   public final class_83 method_751(class_77 var1) {
      return this.field_414 == null?null:this.field_414.method_374(var1);
   }

   // $FF: renamed from: a (de, Q) void
   public final void method_752(class_77 var1, class_83 var2) {
      this.field_414.method_375(var1, var2);
   }

   // $FF: renamed from: b (de) java.lang.String
   public final String method_753(class_77 var1) {
      return this.field_413 == null?null:(String)this.field_413.get(var1);
   }

   // $FF: renamed from: a (de, java.lang.String) void
   public final void method_754(class_77 var1, String var2) {
      this.field_413.put(var1, var2);
   }

   // $FF: renamed from: c (de) int
   public final int method_755(class_77 var1) {
      return this.field_414 == null?3:this.field_414.method_376(var1);
   }

   // $FF: renamed from: d (de) void
   public final void method_756(class_77 var1) {
      this.field_414.method_377(var1);
   }

   // $FF: renamed from: a () java.util.HashMap
   public final HashMap method_757() {
      return this.field_415;
   }

   // $FF: renamed from: b () java.util.HashSet
   public final HashSet method_758() {
      return this.field_416;
   }
}
