import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// $FF: renamed from: bT
public final class class_191 implements class_4 {

   // $FF: renamed from: a int
   public int field_488;
   // $FF: renamed from: b int
   public int field_489;
   // $FF: renamed from: c cQ
   private class_61 field_490;
   // $FF: renamed from: d java.util.List
   private List field_491;
   // $FF: renamed from: e java.util.List
   private List field_492;
   // $FF: renamed from: f java.util.List
   private List field_493;
   // $FF: renamed from: g java.util.List
   private List field_494;
   // $FF: renamed from: h java.util.List
   private List field_495;


   // $FF: renamed from: <init> () void
   public void method_909() {
      super();
      this.field_488 = 0;
      this.field_489 = 0;
      class_62 var10001 = new class_62;
      var10001.method_165();
      this.field_490 = var10001;
      this.field_491 = new ArrayList();
      this.field_492 = new ArrayList();
      this.field_493 = new ArrayList();
      this.field_494 = new ArrayList();
      this.field_495 = new ArrayList();
   }

   // $FF: renamed from: <init> (int) void
   public void method_910(int var1) {
      super();
      this.field_488 = 0;
      this.field_489 = 0;
      class_62 var10001 = new class_62;
      var10001.method_165();
      this.field_490 = var10001;
      this.field_491 = new ArrayList();
      this.field_492 = new ArrayList();
      this.field_493 = new ArrayList();
      this.field_494 = new ArrayList();
      this.field_495 = new ArrayList();
      this.field_488 = var1;
   }

   public final Object clone() {
      class_191 var10000 = new class_191;
      var10000.method_909();
      class_191 var1 = var10000;
      var10000.field_488 = this.field_488;
      var1.field_490 = this.field_490.method_166();
      var1.field_493 = new ArrayList(this.field_493);
      return var1;
   }

   // $FF: renamed from: b () j
   public final class_5 method_911() {
      return this.field_490.method_171(0);
   }

   // $FF: renamed from: c () j
   public final class_5 method_912() {
      return this.field_490.method_177()?null:this.field_490.method_172();
   }

   // $FF: renamed from: a (bT) void
   public final void method_913(class_191 var1) {
      this.field_491.add(var1);
   }

   // $FF: renamed from: b (bT) void
   public final void method_914(class_191 var1) {
      while(this.field_491.remove(var1)) {
         ;
      }

   }

   // $FF: renamed from: c (bT) void
   public final void method_915(class_191 var1) {
      this.field_492.add(var1);
      var1.method_913(this);
   }

   // $FF: renamed from: d (bT) void
   public final void method_916(class_191 var1) {
      while(this.field_492.remove(var1)) {
         ;
      }

      var1.method_914(this);
   }

   // $FF: renamed from: a (bT, bT) void
   public final void method_917(class_191 var1, class_191 var2) {
      int var3;
      for(var3 = 0; var3 < this.field_492.size(); ++var3) {
         if(((class_191)this.field_492.get(var3)).field_488 == var1.field_488) {
            this.field_492.set(var3, var2);
            var1.method_914(this);
            var2.method_913(this);
         }
      }

      for(var3 = 0; var3 < this.field_495.size(); ++var3) {
         if(((class_191)this.field_495.get(var3)).field_488 == var1.field_488) {
            this.field_495.set(var3, var2);
            var1.method_919(this);
            var2.method_918(this);
         }
      }

   }

   // $FF: renamed from: h (bT) void
   private void method_918(class_191 var1) {
      this.field_494.add(var1);
   }

   // $FF: renamed from: i (bT) void
   private void method_919(class_191 var1) {
      while(this.field_494.remove(var1)) {
         ;
      }

   }

   // $FF: renamed from: e (bT) void
   public final void method_920(class_191 var1) {
      if(!this.field_495.contains(var1)) {
         this.field_495.add(var1);
         var1.method_918(this);
      }

   }

   // $FF: renamed from: f (bT) void
   public final void method_921(class_191 var1) {
      while(this.field_495.remove(var1)) {
         ;
      }

      var1.method_919(this);
   }

   public final String toString() {
      class_191 var10000 = this;
      boolean var1 = false;
      this = var10000;
      return this.field_488 + ":\r\n" + this.field_490.method_179(0);
   }

   // $FF: renamed from: g (bT) boolean
   public final boolean method_922(class_191 var1) {
      Iterator var2 = this.field_492.iterator();

      while(var2.hasNext()) {
         if(((class_191)var2.next()).field_488 == var1.field_488) {
            return true;
         }
      }

      return false;
   }

   // $FF: renamed from: a (java.util.List) void
   public final void method_923(List var1) {
      this.field_493 = var1;
   }

   // $FF: renamed from: a () java.util.List
   public final List method_5() {
      ArrayList var1;
      (var1 = new ArrayList(this.field_491)).addAll(this.field_494);
      return var1;
   }

   // $FF: renamed from: d () java.util.List
   public final List method_924() {
      return this.field_491;
   }

   // $FF: renamed from: e () cQ
   public final class_61 method_925() {
      return this.field_490;
   }

   // $FF: renamed from: a (cQ) void
   public final void method_926(class_61 var1) {
      this.field_490 = var1;
   }

   // $FF: renamed from: f () java.util.List
   public final List method_927() {
      return this.field_492;
   }

   // $FF: renamed from: g () java.util.List
   public final List method_928() {
      return this.field_495;
   }

   // $FF: renamed from: h () java.util.List
   public final List method_929() {
      return this.field_494;
   }
}
