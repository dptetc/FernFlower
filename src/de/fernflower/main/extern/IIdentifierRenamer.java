package de.fernflower.main.extern;


public interface IIdentifierRenamer {

   int ELEMENT_CLASS = 1;
   int ELEMENT_FIELD = 2;
   int ELEMENT_METHOD = 3;


   boolean toBeRenamed(int var1, String var2, String var3, String var4);

   String getNextClassname(String var1, String var2);

   String getNextFieldname(String var1, String var2, String var3);

   String getNextMethodname(String var1, String var2, String var3);
}
