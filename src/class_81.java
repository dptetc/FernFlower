import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

// $FF: renamed from: dd
public final class class_81 {

   // $FF: renamed from: a java.util.HashMap
   private HashMap field_108;
   // $FF: renamed from: b java.util.List
   private List field_109;
   // $FF: renamed from: c java.util.HashMap
   private HashMap field_110;
   // $FF: renamed from: d java.util.HashMap
   private HashMap field_111;
   // $FF: renamed from: e java.util.HashMap
   private HashMap field_112;
   // $FF: renamed from: f q
   private class_114 field_113;
   // $FF: renamed from: g S
   private class_54 field_114;


   // $FF: renamed from: <init> () void
   public void method_225() {
      super();
      this.field_108 = new HashMap();
      this.field_109 = new ArrayList();
      this.field_110 = new HashMap();
      this.field_111 = new HashMap();
      this.field_112 = new HashMap();
   }

   // $FF: renamed from: a (S) q
   public final class_114 method_226(class_54 var1) {
      this.field_114 = var1;
      class_114 var10001 = new class_114;
      var10001.method_450();
      this.field_113 = var10001;
      class_81 var2 = this;
      LinkedList var3;
      LinkedList var10000 = var3 = new LinkedList();
      class_60 var45 = new class_60;
      var45.method_164(this.field_114, new LinkedList(), (List)null);
      var10000.add(var45);

      class_148 var46;
      label223:
      while(!var3.isEmpty()) {
         class_60 var4;
         class_46 var5 = (var4 = (class_60)var3.removeFirst()).field_66;
         LinkedList var6 = var4.field_67;
         int var7 = var4.field_69;
         class_148 var8 = null;
         class_148 var9 = null;
         Object var10 = new ArrayList();
         class_148 var11 = null;
         class_148 var15;
         LinkedList var25;
         class_148 var32;
         class_116 var42;
         if(var4.field_71 == null) {
            label219: {
               class_105 var43;
               List var44;
               label216:
               switch(var5.field_13) {
               case 2:
               case 6:
               case 10:
               case 13:
               case 15:
                  int var36 = var5.method_63().size();
                  if(var5.field_13 == 10) {
                     var36 = 2;
                  }

                  if(var7 <= var36) {
                     List var38 = null;
                     switch(var5.field_13) {
                     case 2:
                        var38 = ((class_55)var5).method_134();
                        break;
                     case 6:
                        var38 = ((class_53)var5).method_118();
                        break;
                     case 10:
                        var38 = ((class_56)var5).method_143();
                     }

                     if(var7 < var36) {
                        var4.field_69 = var7 + 1;
                        var3.addFirst(var4);
                        var45 = new class_60;
                        var45.method_164((class_46)var5.method_63().get(var7), var6, var7 == 0 && var38 != null && var38.get(0) != null?var38:null);
                        var3.addFirst(var45);
                        continue;
                     }

                     var8 = (class_148)var2.field_113.field_256.method_659(((String[])var2.field_108.get(var5.method_61().field_14))[0]);
                     var2.field_108.put(var5.field_14, new String[]{var8.field_369, null});
                     if(var5.field_13 == 2 && ((class_55)var5).field_49 == 0) {
                        ((List)var10).add((class_124)var5.method_57(1073741824).get(0));
                        var46 = var38.get(0) == null?var8:(class_148)var2.field_113.field_256.method_659(var8.field_369 + "_tail");
                        break;
                     }
                  }
               case 3:
               case 4:
               case 9:
               case 11:
               case 14:
               default:
                  break label219;
               case 5:
                  if(var7 == 0) {
                     var4.field_69 = 1;
                     var3.addFirst(var4);
                     var45 = new class_60;
                     var45.method_164(var5.method_61(), var6, (List)null);
                     var3.addFirst(var45);
                     continue;
                  }

                  var9 = (class_148)var2.field_113.field_256.method_659(((String[])var2.field_108.get(var5.method_61().field_14))[0]);
                  class_47 var28;
                  int var31;
                  if((var31 = (var28 = (class_47)var5).method_91()) == 0) {
                     var2.field_108.put(var5.field_14, new String[]{var9.field_369, var9.field_369});
                     break label219;
                  }

                  ((List)var10).add((class_124)var5.method_57(1073741824).get(0));
                  switch(var31) {
                  case 1:
                  case 2:
                     var46 = new class_148;
                     var46.method_679(4, var5, var5.field_14 + "_cond");
                     var8 = var46;
                     var46.field_372 = var28.method_83();
                     var2.field_113.field_256.method_656(var8, var8.field_369);
                     var44 = var2.field_109;
                     var43 = new class_105;
                     var43.method_390(var8.field_369, var5.method_61().field_14, 1);
                     var44.add(var43);
                     if(var31 == 2) {
                        var2.field_108.put(var5.field_14, new String[]{var8.field_369, var8.field_369});
                     } else {
                        var2.field_108.put(var5.field_14, new String[]{var9.field_369, var8.field_369});
                        boolean var33 = false;
                        Iterator var37 = var2.field_109.iterator();

                        while(var37.hasNext()) {
                           class_105 var34;
                           if((var34 = (class_105)var37.next()).field_220.equals(var5.field_14) && var34.field_221 == 8) {
                              var33 = true;
                              break;
                           }
                        }

                        if(!var33) {
                           var44 = var2.field_109;
                           var43 = new class_105;
                           var43.method_390(var9.field_369, var5.field_14, 8);
                           var44.add(var43);
                        }
                     }

                     var46 = var8;
                     break label216;
                  case 3:
                     var46 = new class_148;
                     var46.method_679(3, var5, var5.field_14 + "_init");
                     var32 = var46;
                     if(var28.method_89() != null) {
                        var32.field_372 = var28.method_82();
                     }

                     var2.field_113.field_256.method_656(var32, var32.field_369);
                     var46 = new class_148;
                     var46.method_679(4, var5, var5.field_14 + "_cond");
                     var15 = var46;
                     var46.field_372 = var28.method_83();
                     var2.field_113.field_256.method_656(var15, var15.field_369);
                     var46 = new class_148;
                     var46.method_679(5, var5, var5.field_14 + "_inc");
                     class_148 var16 = var46;
                     var46.field_372 = var28.method_84();
                     var2.field_113.field_256.method_656(var16, var16.field_369);
                     var2.field_108.put(var5.field_14, new String[]{var32.field_369, var16.field_369});
                     var2.field_108.put(Integer.valueOf(-var5.field_14.intValue()), new String[]{var15.field_369, null});
                     var44 = var2.field_109;
                     var43 = new class_105;
                     var43.method_390(var15.field_369, var5.method_61().field_14, 1);
                     var44.add(var43);
                     var44 = var2.field_109;
                     var43 = new class_105;
                     var43.method_390(var32.field_369, Integer.valueOf(-var5.field_14.intValue()), 1);
                     var44.add(var43);
                     var44 = var2.field_109;
                     var43 = new class_105;
                     var43.method_390(var16.field_369, Integer.valueOf(-var5.field_14.intValue()), 1);
                     var44.add(var43);
                     boolean var17 = false;
                     Iterator var19 = var2.field_109.iterator();

                     while(var19.hasNext()) {
                        class_105 var18;
                        if((var18 = (class_105)var19.next()).field_220.equals(var5.field_14) && var18.field_221 == 8) {
                           var17 = true;
                           break;
                        }
                     }

                     if(!var17) {
                        var44 = var2.field_109;
                        var43 = new class_105;
                        var43.method_390(var9.field_369, var5.field_14, 8);
                        var44.add(var43);
                     }

                     var11 = var15;
                  default:
                     break label219;
                  }
               case 7:
               case 12:
                  var46 = new class_148;
                  var46.method_679(6, var5, var5.field_14 + "_try");
                  var9 = var46;
                  var2.field_108.put(var5.field_14, new String[]{var9.field_369, null});
                  var2.field_113.field_256.method_656(var9, var9.field_369);
                  var25 = new LinkedList();
                  Iterator var13 = var5.method_63().iterator();

                  while(var13.hasNext()) {
                     class_46 var12 = (class_46)var13.next();
                     var44 = var2.field_109;
                     var43 = new class_105;
                     var43.method_390(var9.field_369, var12.field_14, 1);
                     var44.add(var43);
                     LinkedList var14 = var6;
                     if(var5.field_13 == 12 && ((class_51)var5).method_107()) {
                        var14 = new LinkedList(var6);
                        if(var12 == var5.method_61()) {
                           var42 = new class_116;
                           var42.method_472((class_51)var5, Boolean.FALSE.booleanValue());
                           var14.add(var42);
                        } else {
                           var42 = new class_116;
                           var42.method_471((class_51)var5, Boolean.TRUE.booleanValue(), 4, var2.field_114.method_123(), var12, var12, var9, var9, true);
                           var14.add(var42);
                        }
                     }

                     var45 = new class_60;
                     var45.method_164(var12, var14, (List)null);
                     var25.add(var45);
                  }

                  var3.addAll(0, var25);
                  break label219;
               case 8:
                  var46 = new class_148;
                  var46.method_680(var5, (class_48)var5);
                  var8 = var46;
                  if(var5.method_75() != null) {
                     var8.field_372 = var5.method_75();
                  }

                  var2.field_113.field_256.method_656(var8, var8.field_369);
                  var2.field_108.put(var5.field_14, new String[]{var8.field_369, null});
                  ((List)var10).addAll(var5.method_57(1073741824));
                  var11 = var8;
                  List var24 = var4.field_68;
                  if(var4.field_68 != null) {
                     var46 = new class_148;
                     var46.method_679(2, var5, var5.field_14 + "_tail");
                     var9 = var46;
                     var46.field_372 = var24;
                     var2.field_113.field_256.method_656(var9, var9.field_369);
                     var2.field_108.put(Integer.valueOf(-var5.field_14.intValue()), new String[]{var9.field_369, null});
                     var44 = var2.field_109;
                     var43 = new class_105;
                     var43.method_390(var8.field_369, Integer.valueOf(-var5.field_14.intValue()), 1);
                     var44.add(var43);
                     var11 = var9;
                  }

                  if(var5.method_64() == 0) {
                     var2.field_112.put(var11.field_369, ((class_124)((List)var10).get(0)).method_522().field_14.toString());
                  }
                  break label219;
               }

               var11 = var46;
            }
         }

         if(var11 != null) {
            if(var4.field_71 != null) {
               var10 = var4.field_71;
            }

            for(var7 = var4.field_70; var7 < ((List)var10).size(); ++var7) {
               class_124 var26 = (class_124)((List)var10).get(var7);
               var25 = new LinkedList(var6);
               int var29 = var26.method_518();
               class_46 var30 = var26.method_522();
               var32 = var11;
               var15 = var11;
               class_46 var35 = null;
               class_46 var39 = null;
               boolean var41 = false;
               boolean var40 = false;

               boolean var27;
               do {
                  class_116 var23 = null;
                  if(!var25.isEmpty()) {
                     var23 = (class_116)var25.getLast();
                  }

                  var27 = true;
                  if(var23 == null) {
                     var2.method_227(var11, var30, var29, var40?var32:null, var15, var35, var39, var41);
                  } else {
                     class_51 var20 = var23.field_265;
                     if(var23.field_266) {
                        if(var29 == 32) {
                           var25.removeLast();
                           var30 = var23.field_269;
                           var29 = var23.field_267;
                           var32 = var23.field_272;
                           var15 = var23.field_273;
                           var35 = var23.field_270;
                           var39 = var23.field_271;
                           var40 = true;
                           var41 = var20.method_109() != null & var23.field_268;
                           var27 = false;
                        } else if(!var20.method_42(var30)) {
                           var25.removeLast();
                           var27 = false;
                        } else {
                           var2.method_227(var11, var30, var29, var40?var32:null, var15, var35, var39, var41);
                        }
                     } else {
                        if(!var20.method_42(var30)) {
                           var2.method_227(var11, var20.method_106(), 1, var40?var32:null, var15, var35, var39, var41);
                           var25.removeLast();
                           var42 = new class_116;
                           var42.method_471(var20, Boolean.TRUE.booleanValue(), var29, var30, var20.method_106(), var39 == null?var20.method_106():var39, var11, var15, false);
                           var25.add(var42);
                           var4.field_70 = var7 + 1;
                           var4.field_71 = (List)var10;
                           var3.addFirst(var4);
                           var45 = new class_60;
                           var45.method_164(var20.method_106(), var25, (List)null);
                           var3.addFirst(var45);
                           continue label223;
                        }

                        var2.method_227(var11, var30, var29, var40?var32:null, var15, var35, var39, var41);
                     }
                  }
               } while(!var27);
            }
         }
      }

      class_46 var21 = var1.method_123();
      var46 = new class_148;
      var46.method_679(1, var21, var21.field_14.toString());
      class_148 var22 = var46;
      var46.field_372 = new ArrayList();
      this.field_113.field_256.method_655(var22, var22.field_369);
      this.field_108.put(var21.field_14, new String[]{var22.field_369, null});
      this.method_228();
      this.field_113.field_257 = (class_148)this.field_113.field_256.method_659(((String[])this.field_108.get(var1.field_14))[0]);
      this.field_113.method_451();
      return this.field_113;
   }

   // $FF: renamed from: a (cF, ca, int, cF, cF, ca, ca, boolean) void
   private void method_227(class_148 var1, class_46 var2, int var3, class_148 var4, class_148 var5, class_46 var6, class_46 var7, boolean var8) {
      if(var3 != 32) {
         List var10000 = this.field_109;
         class_105 var10001 = new class_105;
         var10001.method_390(var1.field_369, var2.field_14, var3);
         var10000.add(var10001);
      }

      if(var4 != null) {
         Object var9;
         if((var9 = (List)this.field_110.get(var1.field_369)) == null) {
            this.field_110.put(var1.field_369, var9 = new ArrayList());
         }

         ((List)var9).add(new String[]{var4.field_369, var2.field_14.toString(), var6.field_14.toString(), var8?"1":null});
         if((var9 = (List)this.field_111.get(var1.field_369)) == null) {
            this.field_111.put(var1.field_369, var9 = new ArrayList());
         }

         ((List)var9).add(new String[]{var5.field_369, var2.field_14.toString(), var7.field_14.toString()});
      }

   }

   // $FF: renamed from: b () void
   private void method_228() {
      Iterator var2 = this.field_109.iterator();

      class_148 var5;
      while(var2.hasNext()) {
         class_105 var1;
         String var3 = (var1 = (class_105)var2.next()).field_219;
         Integer var4 = var1.field_220;
         var5 = (class_148)this.field_113.field_256.method_659(var3);
         class_148 var6 = (class_148)this.field_113.field_256.method_659(((String[])this.field_108.get(var4))[var1.field_221 == 8?1:0]);
         if(!var5.field_373.contains(var6)) {
            var5.field_373.add(var6);
         }

         if(!var6.field_374.contains(var5)) {
            var6.field_374.add(var5);
         }

         if(this.field_112.containsKey(var3) && !var4.equals(this.field_112.get(var3))) {
            this.field_113.field_260.put(var3, var6.field_369);
         }
      }

      for(int var9 = 0; var9 < 2; ++var9) {
         Iterator var11 = (var9 == 0?this.field_110:this.field_111).entrySet().iterator();

         while(var11.hasNext()) {
            Entry var10 = (Entry)var11.next();
            ArrayList var12 = new ArrayList();
            List var10000 = (List)var10.getValue();
            var5 = null;
            Iterator var13 = var10000.iterator();

            while(var13.hasNext()) {
               String[] var14 = (String[])var13.next();
               class_148 var7 = (class_148)this.field_113.field_256.method_659(((String[])this.field_108.get(Integer.valueOf(Integer.parseInt(var14[1]))))[0]);
               class_148 var8 = (class_148)this.field_113.field_256.method_659(((String[])this.field_108.get(Integer.valueOf(Integer.parseInt(var14[2]))))[0]);
               class_104 var10001 = new class_104;
               var10001.method_389(var14[0], var7.field_369, var8.field_369, (class_104)null);
               var12.add(var10001);
               if(var9 == 0 && var14[3] != null) {
                  this.field_113.field_261.put((String)var10.getKey(), var7.field_369);
               }
            }

            if(!var12.isEmpty()) {
               (var9 == 0?this.field_113.field_258:this.field_113.field_259).put((String)var10.getKey(), new ArrayList(new HashSet(var12)));
            }
         }
      }

   }

   // $FF: renamed from: a () java.util.HashMap
   public final HashMap method_229() {
      return this.field_108;
   }
}
