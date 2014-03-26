import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

// $FF: renamed from: aO
public final class class_179 {

   // $FF: renamed from: a java.util.HashMap
   private HashMap field_450;
   // $FF: renamed from: b java.util.HashMap
   private HashMap field_451;
   // $FF: renamed from: c java.util.HashMap
   private HashMap field_452;
   // $FF: renamed from: d java.util.HashMap
   private HashMap field_453;
   // $FF: renamed from: e java.util.HashMap
   private HashMap field_454;
   // $FF: renamed from: f java.util.HashMap
   private HashMap field_455;
   // $FF: renamed from: g java.util.List
   private List field_456;
   // $FF: renamed from: h cM
   private class_132 field_457;


   // $FF: renamed from: <init> () void
   public void method_822() {
      super();
      this.field_450 = new HashMap();
      this.field_451 = new HashMap();
      this.field_452 = new HashMap();
      this.field_453 = new HashMap();
      this.field_454 = new HashMap();
      this.field_455 = new HashMap();
      this.field_456 = new ArrayList();
   }

   // $FF: renamed from: a (S, bn) void
   public final void method_823(class_54 var1, class_128 var2) {
      class_81 var10000 = new class_81;
      var10000.method_225();
      class_81 var3 = var10000;
      class_114 var4 = var10000.method_226(var1);
      HashSet var5 = new HashSet();

      for(int var6 = 0; var6 < 64; ++var6) {
         var5.add(Integer.valueOf(var6));
      }

      class_132 var10001 = new class_132;
      var10001.method_573(var5);
      this.field_457 = var10001;
      class_184 var8 = this.method_832(var2);
      this.field_453.put(var4.field_257.field_369, var8);
      this.method_831(var1, var4, var3);
      HashSet var7 = new HashSet();

      do {
         this.method_824(var4, var7);
      } while(!var7.isEmpty());

   }

   // $FF: renamed from: a (q, java.util.HashSet) void
   private void method_824(class_114 var1, HashSet var2) {
      Iterator var4 = var1.field_256.iterator();

      while(var4.hasNext()) {
         class_148 var3 = (class_148)var4.next();
         var2.remove(var3.field_369);
         class_114 var7 = var1;
         class_148 var6 = var3;
         class_179 var5 = this;
         class_184 var10000 = new class_184;
         var10000.method_865();
         class_184 var8 = var10000;
         Iterator var10 = var3.field_374.iterator();

         class_184 var17;
         while(var10.hasNext()) {
            class_148 var9 = (class_148)var10.next();
            var17 = var5.method_827(var6.field_369, var9.field_369, var7, var6.field_369);
            if(var8.method_870()) {
               var8 = var17.method_868();
            } else {
               method_828(var8, var17);
            }
         }

         if(var5.field_453.containsKey(var6.field_369)) {
            var17 = (class_184)var5.field_453.get(var6.field_369);
            if(var8.method_870()) {
               var8 = var17.method_868();
            } else {
               method_828(var8, var17);
            }
         }

         var5.field_450.put(var6.field_369, var8);
         class_184 var12 = (class_184)this.field_450.get(var3.field_369);
         var10000 = new class_184;
         var10000.method_867(var12);
         var12 = var10000;
         class_184[] var13 = new class_184[]{var12, null};
         if(var3.field_372 != null) {
            Iterator var15 = var3.field_372.iterator();

            while(var15.hasNext()) {
               class_86 var14 = (class_86)var15.next();
               this.method_825(var14, var13);
            }
         }

         if(var13[1] == null) {
            var13[1] = var13[0];
         }

         if(!method_829(var13[0], (class_184)this.field_451.get(var3.field_369)) || this.field_452.containsKey(var3.field_369) && !method_829(var13[1], (class_184)this.field_452.get(var3.field_369))) {
            this.field_451.put(var3.field_369, var13[0]);
            if(var1.field_260.containsKey(var3.field_369)) {
               this.field_452.put(var3.field_369, var13[1]);
            }

            Iterator var11 = var3.field_373.iterator();

            while(var11.hasNext()) {
               class_148 var16 = (class_148)var11.next();
               var2.add(var16.field_369);
            }
         }
      }

   }

   // $FF: renamed from: a (aJ, bZ[]) void
   private void method_825(class_86 var1, class_184[] var2) {
      if(var1 != null) {
         class_88 var3 = null;
         boolean var4 = false;
         class_86 var17;
         switch(var1.field_148) {
         case 2:
            class_93 var14;
            if((var14 = (class_93)var1).method_319() == -1 && (var17 = var14.method_316()).field_148 == 12) {
               var3 = (class_88)var17;
            }
         case 3:
         case 4:
         case 5:
         default:
            break;
         case 6:
            class_90 var5;
            class_184[] var10000;
            class_184 var10003;
            switch((var5 = (class_90)var1).method_301()) {
            case 36:
               this.method_825((class_86)var5.method_303().get(0), var2);
               class_184 var15;
               if(var2[1] == null) {
                  class_184 var13 = new class_184;
                  var13.method_867(var2[0]);
                  var15 = var13;
               } else {
                  var15 = var2[1];
                  var2[1] = null;
               }

               this.method_825((class_86)var5.method_303().get(1), var2);
               class_184[] var6 = new class_184[]{var15, null};
               this.method_825((class_86)var5.method_303().get(2), var6);
               method_828(var2[0], var6[0]);
               var2[1] = null;
               var4 = true;
               break;
            case 48:
               this.method_825((class_86)var5.method_303().get(0), var2);
               var10000 = new class_184[2];
               var10003 = new class_184;
               var10003.method_867(var2[0]);
               var10000[0] = var10003;
               class_184[] var7 = var10000;
               this.method_825((class_86)var5.method_303().get(1), var7);
               var2[1] = method_828(var2[var2[1] == null?0:1], var7[var7[1] == null?0:1]);
               var2[0] = var7[0];
               var4 = true;
               break;
            case 49:
               this.method_825((class_86)var5.method_303().get(0), var2);
               var10000 = new class_184[2];
               var10003 = new class_184;
               var10003.method_867(var2[var2[1] == null?0:1]);
               var10000[0] = var10003;
               class_184[] var8 = var10000;
               this.method_825((class_86)var5.method_303().get(1), var8);
               var2[1] = var8[var8[1] == null?0:1];
               var2[0] = method_828(var2[0], var8[0]);
               var4 = true;
            }
         }

         if(!var4) {
            List var16;
            (var16 = var1.method_260()).remove(var3);
            Iterator var18 = var16.iterator();

            while(var18.hasNext()) {
               var17 = (class_86)var18.next();
               this.method_825(var17, var2);
            }

            class_184 var19 = var2[0];
            Integer var20;
            if(var3 != null) {
               Integer var21 = Integer.valueOf(var3.method_277());
               if(var3.method_284() == 0) {
                  var20 = this.method_826(var21);
                  var3.method_285(var20.intValue());
                  this.method_830(var19, var21, var20);
               } else {
                  this.method_830(var19, var21, Integer.valueOf(var3.method_284()));
               }
            } else {
               if(var1.field_148 == 12) {
                  class_88 var23;
                  var20 = Integer.valueOf((var23 = (class_88)var1).method_277());
                  Integer var9;
                  class_141 var22;
                  int var24;
                  if((var24 = (var22 = var19.method_875(var20.intValue())).method_636()) == 1) {
                     var9 = (Integer)var22.iterator().next();
                     var23.method_285(var9.intValue());
                     return;
                  }

                  if(var24 == 2) {
                     var9 = Integer.valueOf(var23.method_284());
                     class_77 var11 = new class_77;
                     var11.method_215(var20, var9);
                     class_77 var10 = var11;
                     if(var9.intValue() != 0 && this.field_454.containsKey(var10)) {
                        this.method_830(var19, var20, var9);
                        ((class_141)this.field_454.get(var10)).method_633(var22);
                        return;
                     }

                     var9 = this.method_826(var20);
                     var23.method_285(var9.intValue());
                     this.method_830(var19, var20, var9);
                     HashMap var12 = this.field_454;
                     class_77 var10001 = new class_77;
                     var10001.method_215(var20, var9);
                     var12.put(var10001, var22);
                  }
               }

            }
         }
      }
   }

   // $FF: renamed from: a (java.lang.Integer) java.lang.Integer
   private Integer method_826(Integer var1) {
      Integer var2;
      if((var2 = (Integer)this.field_455.get(var1)) == null) {
         var2 = new Integer(1);
      } else {
         var2 = new Integer(var2.intValue() + 1);
      }

      this.field_455.put(var1, var2);
      return var2;
   }

   // $FF: renamed from: a (java.lang.String, java.lang.String, q, java.lang.String) bZ
   private class_184 method_827(String var1, String var2, class_114 var3, String var4) {
      class_184 var10000 = new class_184;
      var10000.method_865();
      class_184 var5 = var10000;
      if(var1.equals(var3.field_260.get(var2))) {
         if(this.field_452.containsKey(var2)) {
            var5 = ((class_184)this.field_452.get(var2)).method_868();
         }
      } else if(this.field_451.containsKey(var2)) {
         var5 = ((class_184)this.field_451.get(var2)).method_868();
      }

      boolean var15 = var3.field_258.containsKey(var2);
      boolean var6 = false;
      if(var15 && !var5.method_870()) {
         class_184 var16 = var5.method_868();
         var10000 = new class_184;
         var10000.method_865();
         class_184 var7 = var10000;
         String var8;
         boolean var17 = (var8 = (String)var3.field_261.get(var2)) != null && !var1.equals(var8);
         HashSet var9 = new HashSet();
         Iterator var11 = ((List)var3.field_259.get(var2)).iterator();

         class_104 var10;
         while(var11.hasNext()) {
            var10 = (class_104)var11.next();
            var9.add(var10.field_217 + "##" + var10.field_216);
         }

         var11 = ((List)var3.field_258.get(var2)).iterator();

         while(var11.hasNext()) {
            var10 = (class_104)var11.next();
            boolean var12;
            class_184 var14;
            if(var12 = var3.field_258.containsKey(var10.field_216)) {
               var14 = this.method_827(var10.field_218, var10.field_216, var3, var4);
            } else if(var10.field_218.equals(var3.field_260.get(var10.field_216))) {
               var14 = (class_184)this.field_452.get(var10.field_216);
            } else {
               var14 = (class_184)this.field_451.get(var10.field_216);
            }

            boolean var13 = false;
            if(var12) {
               var13 = !var10.field_217.equals(var1);
            } else {
               var13 = !var9.contains(var4 + "##" + var10.field_216);
            }

            if(var13) {
               var16.method_876(var14);
            } else if(var7.method_870()) {
               if(var14 != null) {
                  var7 = var14.method_868();
               }
            } else {
               method_828(var7, var14);
            }
         }

         if(var17) {
            var5 = var7;
         } else {
            var16.method_878(var7);
            class_184 var18;
            if((var18 = (class_184)this.field_450.get(var1)) != null) {
               var16.method_878(var18);
            }

            var5.method_877(var16);
         }
      }

      return var5;
   }

   // $FF: renamed from: a (bZ, bZ) bZ
   private static class_184 method_828(class_184 var0, class_184 var1) {
      if(var1 != null && !var1.method_870()) {
         var0.method_878(var1);
      }

      return var0;
   }

   // $FF: renamed from: b (bZ, bZ) boolean
   private static boolean method_829(class_184 var0, class_184 var1) {
      if(var0 == null) {
         return var1 == null;
      } else if(var1 == null) {
         return false;
      } else if(var0.method_869() != var1.method_869()) {
         return false;
      } else {
         Iterator var2 = var1.method_879().iterator();

         while(var2.hasNext()) {
            Entry var3 = (Entry)var2.next();
            if(!class_129.method_558(var0.method_875(((Integer)var3.getKey()).intValue()), var3.getValue())) {
               return false;
            }
         }

         return true;
      }
   }

   // $FF: renamed from: a (bZ, java.lang.Integer, java.lang.Integer) void
   private void method_830(class_184 var1, Integer var2, Integer var3) {
      class_141 var4;
      (var4 = this.field_457.method_574()).method_629(var3);
      var1.method_871(var2.intValue(), var4);
   }

   // $FF: renamed from: a (ca, q, dd) void
   private void method_831(class_46 var1, class_114 var2, class_81 var3) {
      switch(var1.field_13) {
      case 7:
      case 12:
         List var5;
         if(var1.field_13 == 12) {
            var5 = ((class_51)var1).method_111();
         } else {
            var5 = ((class_50)var1).method_102();
         }

         for(int var6 = 1; var6 < var1.method_63().size(); ++var6) {
            int var7 = ((class_88)var5.get(var6 - 1)).method_277();
            int var8 = this.method_826(Integer.valueOf(var7)).intValue();
            class_184 var10000 = new class_184;
            var10000.method_865();
            class_184 var4 = var10000;
            this.method_830(var4, Integer.valueOf(var7), Integer.valueOf(var8));
            this.field_453.put(((class_148)var2.field_256.method_659(((String[])var3.method_229().get(((class_46)var1.method_63().get(var6)).field_14))[0])).field_369, var4);
            List var9 = this.field_456;
            class_77 var10001 = new class_77;
            var10001.method_214(var7, var8);
            var9.add(var10001);
         }
      default:
         Iterator var11 = var1.method_63().iterator();

         while(var11.hasNext()) {
            class_46 var10 = (class_46)var11.next();
            this.method_831(var10, var2, var3);
         }

      }
   }

   // $FF: renamed from: a (bn) bZ
   private class_184 method_832(class_128 var1) {
      boolean var2 = (var1.method_550() & 8) == 0;
      class_197 var9;
      int var3 = (var9 = class_197.method_963(var1.method_548())).field_519.length + (var2?1:0);
      int var4 = 0;
      class_184 var10000 = new class_184;
      var10000.method_865();
      class_184 var5 = var10000;

      for(int var6 = 0; var6 < var3; ++var6) {
         int var7 = this.method_826(Integer.valueOf(var4)).intValue();
         class_141 var8;
         (var8 = this.field_457.method_574()).method_629(Integer.valueOf(var7));
         var5.method_871(var4, var8);
         List var10 = this.field_456;
         class_77 var10001 = new class_77;
         var10001.method_214(var4, var7);
         var10.add(var10001);
         if(var2) {
            if(var6 == 0) {
               ++var4;
            } else {
               var4 += var9.field_519[var6 - 1].field_137;
            }
         } else {
            var4 += var9.field_519[var6].field_137;
         }
      }

      return var5;
   }

   // $FF: renamed from: a () java.util.HashMap
   public final HashMap method_833() {
      return this.field_454;
   }
}
