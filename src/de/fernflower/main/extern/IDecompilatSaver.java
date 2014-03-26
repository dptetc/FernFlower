package de.fernflower.main.extern;

import java.util.jar.Manifest;

public interface IDecompilatSaver {

   void copyFile(String var1, String var2, String var3);

   void saveFolder(String var1);

   void saveClassFile(String var1, String var2, String var3, String var4);

   void saveFile(String var1, String var2, String var3);

   void createArchive(String var1, String var2, Manifest var3);

   void saveClassEntry(String var1, String var2, String var3, String var4, String var5);

   void saveEntry(String var1, String var2, String var3, String var4);

   void copyEntry(String var1, String var2, String var3, String var4);

   void closeArchive(String var1, String var2);
}
