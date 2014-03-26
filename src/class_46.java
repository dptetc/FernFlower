import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

// $FF: renamed from: ca
public class class_46 {

   // $FF: renamed from: c int
   public int field_13;
   // $FF: renamed from: d java.lang.Integer
   public Integer field_14;
   // $FF: renamed from: a java.util.Map
   private Map field_15;
   // $FF: renamed from: b java.util.Map
   private Map field_16;
   // $FF: renamed from: k java.util.Map
   private Map field_17;
   // $FF: renamed from: l java.util.Map
   private Map field_18;
   // $FF: renamed from: e cE
   protected class_146 field_19;
   // $FF: renamed from: m ca
   private class_46 field_20;
   // $FF: renamed from: f ca
   protected class_46 field_21;
   // $FF: renamed from: g java.util.List
   protected List field_22;
   // $FF: renamed from: n java.util.HashSet
   private HashSet field_23;
   // $FF: renamed from: h java.util.List
   protected List field_24;
   // $FF: renamed from: o boolean
   private boolean field_25;
   // $FF: renamed from: i ca
   protected class_46 field_26;
   // $FF: renamed from: j int
   protected int field_27;
   // $FF: renamed from: p boolean
   private boolean field_28;
   // $FF: renamed from: q boolean
   private boolean field_29;
   // $FF: renamed from: r java.util.HashSet
   private HashSet field_30;


   // $FF: renamed from: <init> () void
   public void method_23() {
      super();
      this.field_15 = new HashMap();
      this.field_16 = new HashMap();
      this.field_17 = new HashMap();
      this.field_18 = new HashMap();
      class_146 var10001 = new class_146;
      var10001.method_653();
      this.field_19 = var10001;
      this.field_23 = new HashSet();
      this.field_24 = new ArrayList();
      this.field_25 = false;
      this.field_27 = 2;
      this.field_30 = new HashSet();
      this.field_14 = Integer.valueOf(class_181.method_853().method_814(0));
   }

   // $FF: renamed from: l () void
   public final void method_24() {
      this.field_26 = null;
      this.field_30 = null;
      this.field_25 = false;
      this.field_28 = false;
      this.field_29 = false;
      Map[] var4;
      int var3 = (var4 = new Map[]{this.field_15, this.field_16}).length;

      Map var1;
      int var2;
      List var5;
      for(var2 = 0; var2 < var3; ++var2) {
         (var1 = var4[var2]).remove(Integer.valueOf(2));
         if((var5 = (List)var1.get(Integer.valueOf(1073741824))) != null) {
            var1.put(Integer.valueOf(Integer.MIN_VALUE), new ArrayList(var5));
         } else {
            var1.remove(Integer.valueOf(Integer.MIN_VALUE));
         }
      }

      var3 = (var4 = new Map[]{this.field_17, this.field_18}).length;

      for(var2 = 0; var2 < var3; ++var2) {
         (var1 = var4[var2]).remove(Integer.valueOf(2));
         if((var5 = (List)var1.get(Integer.valueOf(1073741824))) != null) {
            var1.put(Integer.valueOf(Integer.MIN_VALUE), new ArrayList(var5));
         } else {
            var1.remove(Integer.valueOf(Integer.MIN_VALUE));
         }
      }

   }

   // $FF: renamed from: d (ca) void
   public final void method_25(class_46 var1) {
      class_124 var5 = null;
      class_46 var2 = var1.field_21;
      class_46 var3 = null;
      var3 = var1.field_26;
      class_146 var4 = var1.field_19;
      Iterator var6;
      if(var3 != null) {
         var6 = var3.method_54(1073741824, 0).iterator();

         while(var6.hasNext()) {
            var5 = (class_124)var6.next();
            if(var1.method_42(var5.method_520())) {
               var5.method_520().method_53(1, var5, 4);
               var1.method_27(var5);
            }
         }
      }

      var6 = var2.method_54(Integer.MIN_VALUE, 0).iterator();

      while(var6.hasNext()) {
         if((var5 = (class_124)var6.next()).method_518() != 2 && var1.method_42(var5.method_520())) {
            var5.method_520().method_53(1, var5, 8);
            var1.method_27(var5);
         }

         var2.method_33(var5);
         var5.method_520().method_52(1, var5, var1);
         var1.method_29(0, var5);
      }

      if(var4.method_662(this.field_21.field_14)) {
         this.field_21 = var1;
      }

      HashSet var10 = new HashSet(var2.method_55(2, 1));
      Iterator var7 = var4.iterator();

      class_46 var11;
      while(var7.hasNext()) {
         var11 = (class_46)var7.next();
         var10.retainAll(var11.method_55(2, 1));
      }

      class_124 var10001;
      if(!var10.isEmpty()) {
         var7 = var2.method_54(2, 1).iterator();

         while(var7.hasNext()) {
            class_124 var12;
            var2 = (var12 = (class_124)var7.next()).method_522();
            if(var10.contains(var2) && !var4.method_662(var2.field_14)) {
               var10001 = new class_124;
               var10001.method_517(var1, var2, var12.method_524());
               var1.method_34(var10001);
            }
         }

         var7 = var4.iterator();

         while(var7.hasNext()) {
            Iterator var8 = (var11 = (class_46)var7.next()).method_54(2, 1).iterator();

            while(var8.hasNext()) {
               class_124 var9 = (class_124)var8.next();
               if(var10.contains(var9.method_522())) {
                  var11.method_35(var9);
               }
            }
         }
      }

      if(var3 != null && !var1.method_55(2, 1).contains(var3)) {
         var10001 = new class_124;
         var10001.method_516(1, var1, var3);
         var1.method_34(var10001);
      }

      var7 = var4.iterator();

      while(var7.hasNext()) {
         var11 = (class_46)var7.next();
         this.field_19.method_658(var11.field_14);
      }

      this.field_19.method_655(var1, var1.field_14);
      var1.method_26();
      var1.field_20 = this;
      var1.method_37();
      var1.method_38();
      if(var1.field_13 == 6) {
         ((class_53)var1).method_117();
      }

   }

   // $FF: renamed from: m () void
   public final void method_26() {
      for(Iterator var1 = this.field_19.iterator(); var1.hasNext(); ((class_46)var1.next()).field_20 = this) {
         ;
      }

   }

   // $FF: renamed from: c (cV) void
   public final void method_27(class_124 var1) {
      if(var1.field_303 != null) {
         var1.field_303.field_23.remove(var1);
      }

      var1.field_303 = this;
      this.field_23.add(var1);
   }

   // $FF: renamed from: b (int, cV, int) void
   private void method_28(int var1, class_124 var2, int var3) {
      Map var4 = var1 == 0?this.field_16:this.field_15;
      Map var6 = var1 == 0?this.field_18:this.field_17;
      Object var5;
      if((var5 = (List)var4.get(Integer.valueOf(var3))) == null) {
         var4.put(Integer.valueOf(var3), var5 = new ArrayList());
      }

      ((List)var5).add(var2);
      Object var7;
      if((var7 = (List)var6.get(Integer.valueOf(var3))) == null) {
         var6.put(Integer.valueOf(var3), var7 = new ArrayList());
      }

      ((List)var7).add(var1 == 0?var2.method_520():var2.method_522());
   }

   // $FF: renamed from: a (int, cV) void
   private void method_29(int var1, class_124 var2) {
      int var3;
      int[] var7;
      if((var3 = var2.method_518()) == 2) {
         var7 = new int[]{Integer.MIN_VALUE, 2};
      } else {
         var7 = new int[]{Integer.MIN_VALUE, 1073741824, var3};
      }

      int[] var6 = var7;
      int var5 = var7.length;

      for(int var4 = 0; var4 < var5; ++var4) {
         var3 = var6[var4];
         this.method_28(var1, var2, var3);
      }

   }

   // $FF: renamed from: c (int, cV, int) void
   private void method_30(int var1, class_124 var2, int var3) {
      Map var4 = var1 == 0?this.field_16:this.field_15;
      Map var5 = var1 == 0?this.field_18:this.field_17;
      List var6;
      int var7;
      if((var6 = (List)var4.get(Integer.valueOf(var3))) != null && (var7 = var6.indexOf(var2)) >= 0) {
         var6.remove(var7);
         ((List)var5.get(Integer.valueOf(var3))).remove(var7);
      }

   }

   // $FF: renamed from: b (int, cV) void
   private void method_31(int var1, class_124 var2) {
      int var3;
      int[] var7;
      if((var3 = var2.method_518()) == 2) {
         var7 = new int[]{Integer.MIN_VALUE, 2};
      } else {
         var7 = new int[]{Integer.MIN_VALUE, 1073741824, var3};
      }

      int[] var6 = var7;
      int var5 = var7.length;

      for(int var4 = 0; var4 < var5; ++var4) {
         var3 = var6[var4];
         this.method_30(var1, var2, var3);
      }

   }

   // $FF: renamed from: d (cV) void
   public final void method_32(class_124 var1) {
      this.method_29(0, var1);
   }

   // $FF: renamed from: e (cV) void
   public final void method_33(class_124 var1) {
      if(var1 != null) {
         this.method_31(0, var1);
      }
   }

   // $FF: renamed from: f (cV) void
   public final void method_34(class_124 var1) {
      this.method_29(1, var1);
      if(var1.field_303 != null) {
         var1.field_303.field_23.add(var1);
      }

      var1.method_522().method_29(0, var1);
   }

   // $FF: renamed from: g (cV) void
   public final void method_35(class_124 var1) {
      if(var1 != null) {
         this.method_31(1, var1);
         if(var1.field_303 != null) {
            var1.field_303.field_23.remove(var1);
         }

         if(var1.method_522() != null) {
            var1.method_522().method_33(var1);
         }

      }
   }

   // $FF: renamed from: e (ca) void
   public final void method_36(class_46 var1) {
      if(var1 != null) {
         class_124 var2 = null;
         Iterator var3 = this.method_54(Integer.MIN_VALUE, 1).iterator();

         while(var3.hasNext()) {
            if((var2 = (class_124)var3.next()).method_522() == var1) {
               this.method_35(var2);
            }
         }

      }
   }

   // $FF: renamed from: n () java.util.HashSet
   public final HashSet method_37() {
      this.field_30.clear();
      Iterator var2 = this.field_19.iterator();

      while(var2.hasNext()) {
         class_46 var1 = (class_46)var2.next();
         this.field_30.addAll(var1.method_37());
         if(var1 != this.field_21) {
            this.field_30.remove(var1.method_68());
         }
      }

      var2 = this.method_54(8, 1).iterator();

      while(var2.hasNext()) {
         class_124 var3 = (class_124)var2.next();
         this.field_30.add(var3.method_522().method_68());
      }

      if(this.field_13 == 5) {
         this.field_30.remove(this.field_21.method_68());
      }

      return this.field_30;
   }

   // $FF: renamed from: o () void
   public final void method_38() {
      Iterator var2 = this.field_19.iterator();

      class_46 var1;
      while(var2.hasNext()) {
         class_46 var10000 = (class_46)var2.next();
         var1 = null;
         var10000.method_38();
      }

      switch(this.field_13) {
      case 0:
      case 10:
      case 13:
         return;
      case 2:
      case 15:
         this.field_29 = false;

         for(var2 = this.field_19.iterator(); var2.hasNext(); this.field_29 |= var1.field_29) {
            var1 = (class_46)var2.next();
         }

         return;
      case 8:
         class_48 var5 = (class_48)this;
         var1 = null;
         class_61 var4;
         if((var4 = var5.method_94().method_925()) != null && var4.method_176() > 0) {
            for(int var3 = 0; var3 < var4.method_176(); ++var3) {
               if(var4.method_171(var3).field_5 == 195) {
                  this.field_29 = true;
                  break;
               }
            }

            this.field_28 = var4.method_172().field_5 == 194;
            return;
         }
         break;
      default:
         this.field_29 = false;

         for(var2 = this.field_19.iterator(); var2.hasNext(); this.field_29 |= var1.field_29) {
            var1 = (class_46)var2.next();
         }
      }

   }

   // $FF: renamed from: p () java.util.List
   public final List method_39() {
      class_46 var1 = this.field_21;
      ArrayList var2 = new ArrayList();
      method_50(var1, var2);
      return var2;
   }

   // $FF: renamed from: a (java.util.List) java.util.List
   public final List method_40(List var1) {
      ArrayList var2 = new ArrayList();
      HashSet var3;
      if(var1 == null) {
         class_196 var10000 = new class_196;
         var10000.method_955(this);
         var3 = null;
         var1 = class_196.method_958(var10000.method_961());
      }

      var3 = new HashSet();
      Iterator var4 = var1.iterator();

      while(var4.hasNext()) {
         class_46 var5 = (class_46)var4.next();
         this.method_51(var5, var2, var3);
      }

      if(var2.size() != this.field_19.size()) {
         class_181.method_859().writeMessage("computing post reverse post order failed!", 4);
         throw new RuntimeException("parsing failure!");
      } else {
         return var2;
      }
   }

   // $FF: renamed from: f (ca) boolean
   public final boolean method_41(class_46 var1) {
      return this == var1 || this.method_42(var1);
   }

   // $FF: renamed from: g (ca) boolean
   public final boolean method_42(class_46 var1) {
      if(this.field_19.contains(var1)) {
         return true;
      } else {
         for(int var2 = 0; var2 < this.field_19.size(); ++var2) {
            if(((class_46)this.field_19.get(var2)).method_42(var1)) {
               return true;
            }
         }

         return false;
      }
   }

   // $FF: renamed from: a (int) java.lang.String
   public String method_43(int var1) {
      throw new RuntimeException("not implemented");
   }

   // $FF: renamed from: d () java.util.List
   public List method_44() {
      return new ArrayList(this.field_19);
   }

   // $FF: renamed from: e_ () void
   public void method_45() {}

   // $FF: renamed from: a (aJ, aJ) void
   public void method_46(class_86 var1, class_86 var2) {}

   // $FF: renamed from: a () ca
   public class_46 method_47() {
      throw new RuntimeException("not implemented");
   }

   // $FF: renamed from: b () void
   public void method_48() {
      if(!this.field_19.isEmpty()) {
         this.field_21 = (class_46)this.field_19.get(0);
      }

   }

   // $FF: renamed from: a (ca, ca) void
   public void method_49(class_46 var1, class_46 var2) {
      class_124 var3 = null;
      Iterator var4 = var1.method_54(Integer.MIN_VALUE, 0).iterator();

      while(var4.hasNext()) {
         var3 = (class_124)var4.next();
         var1.method_33(var3);
         var3.method_520().method_52(1, var3, var2);
         var2.method_29(0, var3);
      }

      var4 = var1.method_54(Integer.MIN_VALUE, 1).iterator();

      while(var4.hasNext()) {
         var3 = (class_124)var4.next();
         var1.method_35(var3);
         var3.method_521(var2);
         var2.method_34(var3);
      }

      int var6 = this.field_19.method_660(var1.field_14);
      this.field_19.method_658(var1.field_14);
      this.field_19.method_657(var6, var2, var2.field_14);
      var3 = null;
      var2.field_20 = this;
      var2.field_26 = var1.field_26;
      if(this.field_21 == var1) {
         this.field_21 = var2;
      }

      ArrayList var7;
      for(var6 = (var7 = new ArrayList(var1.field_23)).size() - 1; var6 >= 0; --var6) {
         class_124 var5;
         if((var5 = (class_124)var7.get(var6)).method_520() != var2) {
            var2.method_27(var5);
         } else if(this != var5.method_522() && !this.method_42(var5.method_522())) {
            this.method_27(var5);
         } else {
            var5.field_303 = null;
         }
      }

      var1.field_23.clear();
   }

   // $FF: renamed from: a (ca, java.util.List) void
   private static void method_50(class_46 var0, List var1) {
      LinkedList var2 = new LinkedList();
      LinkedList var3 = new LinkedList();
      HashSet var4 = new HashSet();
      var2.add(var0);
      var3.add(Integer.valueOf(0));

      while(!var2.isEmpty()) {
         var0 = (class_46)var2.getLast();
         int var5 = ((Integer)var3.removeLast()).intValue();
         var4.add(var0);
         List var6 = null;
         var6 = var0.method_54(Integer.MIN_VALUE, 1);

         while(true) {
            if(var5 < var6.size()) {
               class_124 var7;
               class_46 var8 = (var7 = (class_124)var6.get(var5)).method_522();
               if(var4.contains(var8) || var7.method_518() != 1 && var7.method_518() != 2) {
                  ++var5;
                  continue;
               }

               var3.add(Integer.valueOf(var5 + 1));
               var2.add(var8);
               var3.add(Integer.valueOf(0));
            }

            if(var5 == var6.size()) {
               var1.add(0, var0);
               var2.removeLast();
            }
            break;
         }
      }

   }

   // $FF: renamed from: a (ca, java.util.List, java.util.HashSet) void
   private void method_51(class_46 var1, List var2, HashSet var3) {
      if(!var3.contains(var1)) {
         var3.add(var1);
         Iterator var5 = var1.method_54(3, 0).iterator();

         while(var5.hasNext()) {
            class_124 var10000 = (class_124)var5.next();
            class_46 var4 = null;
            var4 = var10000.method_520();
            if(!var3.contains(var4)) {
               this.method_51(var4, var2, var3);
            }
         }

         var2.add(0, var1);
      }
   }

   // $FF: renamed from: a (int, cV, ca) void
   public final void method_52(int var1, class_124 var2, class_46 var3) {
      Map var10 = this.field_15;
      Map var9 = this.field_17;
      int var4;
      int[] var11;
      if((var4 = var2.method_518()) == 2) {
         var11 = new int[]{Integer.MIN_VALUE, 2};
      } else {
         var11 = new int[]{Integer.MIN_VALUE, 1073741824, var4};
      }

      int[] var7 = var11;
      int var6 = var11.length;

      for(int var5 = 0; var5 < var6; ++var5) {
         var4 = var7[var5];
         List var8;
         int var12;
         if((var8 = (List)var10.get(Integer.valueOf(var4))) != null && (var12 = var8.indexOf(var2)) >= 0) {
            ((List)var9.get(Integer.valueOf(var4))).set(var12, var3);
         }
      }

      var2.method_523(var3);
   }

   // $FF: renamed from: a (int, cV, int) void
   public final void method_53(int var1, class_124 var2, int var3) {
      int var4;
      if((var4 = var2.method_518()) != var3) {
         if(var4 != 2 && var3 != 2) {
            this.method_30(var1, var2, var4);
            this.method_28(var1, var2, var3);
            if(var1 == 1) {
               var2.method_522().method_53(0, var2, var3);
            }

            var2.method_519(var3);
         } else {
            throw new RuntimeException("Invalid edge type!");
         }
      }
   }

   // $FF: renamed from: c (int, int) java.util.List
   private List method_54(int var1, int var2) {
      Map var7 = var2 == 0?this.field_16:this.field_15;
      ArrayList var9;
      if((var1 & var1 - 1) == 0) {
         List var8;
         var9 = (var8 = (List)var7.get(Integer.valueOf(var1))) == null?new ArrayList():new ArrayList(var8);
      } else {
         var9 = new ArrayList();
         int[] var6 = class_124.field_298;
         int var5 = class_124.field_298.length;

         for(int var4 = 0; var4 < var5; ++var4) {
            int var3 = var6[var4];
            List var10;
            if((var1 & var3) != 0 && (var10 = (List)var7.get(Integer.valueOf(var3))) != null) {
               var9.addAll(var10);
            }
         }
      }

      return var9;
   }

   // $FF: renamed from: a (int, int) java.util.List
   public final List method_55(int var1, int var2) {
      Map var7 = var2 == 0?this.field_18:this.field_17;
      ArrayList var9;
      if((var1 & var1 - 1) == 0) {
         List var8;
         var9 = (var8 = (List)var7.get(Integer.valueOf(var1))) == null?new ArrayList():new ArrayList(var8);
      } else {
         var9 = new ArrayList();
         int[] var6 = class_124.field_298;
         int var5 = class_124.field_298.length;

         for(int var4 = 0; var4 < var5; ++var4) {
            int var3 = var6[var4];
            List var10;
            if((var1 & var3) != 0 && (var10 = (List)var7.get(Integer.valueOf(var3))) != null) {
               var9.addAll(var10);
            }
         }
      }

      return var9;
   }

   // $FF: renamed from: b (int, int) java.util.Set
   public final Set method_56(int var1, int var2) {
      return new HashSet(this.method_55(var1, var2));
   }

   // $FF: renamed from: c (int) java.util.List
   public final List method_57(int var1) {
      return this.method_54(var1, 1);
   }

   // $FF: renamed from: d (int) java.util.List
   public final List method_58(int var1) {
      return this.method_54(var1, 0);
   }

   // $FF: renamed from: q () java.util.List
   public final List method_59() {
      return this.method_54(Integer.MIN_VALUE, 1);
   }

   // $FF: renamed from: r () java.util.List
   public final List method_60() {
      return this.method_54(Integer.MIN_VALUE, 0);
   }

   // $FF: renamed from: s () ca
   public final class_46 method_61() {
      return this.field_21;
   }

   // $FF: renamed from: h (ca) void
   public final void method_62(class_46 var1) {
      this.field_21 = var1;
   }

   // $FF: renamed from: t () cE
   public final class_146 method_63() {
      return this.field_19;
   }

   // $FF: renamed from: u () int
   public final int method_64() {
      return this.field_27;
   }

   // $FF: renamed from: v () java.util.HashSet
   public final HashSet method_65() {
      return this.field_30;
   }

   // $FF: renamed from: w () boolean
   public final boolean method_66() {
      return this.field_29;
   }

   // $FF: renamed from: x () boolean
   public final boolean method_67() {
      return this.field_28;
   }

   // $FF: renamed from: y () ci
   public final class_48 method_68() {
      return this.field_13 == 8?(class_48)this:this.field_21.method_68();
   }

   // $FF: renamed from: z () boolean
   public final boolean method_69() {
      Iterator var1 = this.field_23.iterator();

      class_124 var2;
      do {
         if(!var1.hasNext()) {
            return false;
         }
      } while(!(var2 = (class_124)var1.next()).field_304 || !var2.field_305);

      return true;
   }

   // $FF: renamed from: A () boolean
   public final boolean method_70() {
      return this.field_13 == 8 || this.field_13 == 2 && ((class_55)this).field_49 == 0 || this.field_13 == 5 && ((class_47)this).method_91() != 0;
   }

   // $FF: renamed from: B () ca
   public final class_46 method_71() {
      return this.field_20;
   }

   // $FF: renamed from: i (ca) void
   public final void method_72(class_46 var1) {
      this.field_20 = var1;
   }

   // $FF: renamed from: C () java.util.HashSet
   public final HashSet method_73() {
      return this.field_23;
   }

   // $FF: renamed from: D () java.util.List
   public final List method_74() {
      return this.field_24;
   }

   // $FF: renamed from: E () java.util.List
   public final List method_75() {
      return this.field_22;
   }

   // $FF: renamed from: b (java.util.List) void
   public final void method_76(List var1) {
      this.field_22 = var1;
   }

   // $FF: renamed from: F () boolean
   public final boolean method_77() {
      return this.field_25;
   }

   // $FF: renamed from: G () void
   public final void method_78() {
      this.field_25 = true;
   }
}
