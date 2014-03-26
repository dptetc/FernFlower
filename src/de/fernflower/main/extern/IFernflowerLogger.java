package de.fernflower.main.extern;

import de.fernflower.main.extern.class_106;
import java.util.HashMap;

public interface IFernflowerLogger {

   int DEBUG = 1;
   int INFO = 2;
   int WARNING = 3;
   int ERROR = 4;
   int IMMEDIATE = 5;
   HashMap mapLogLevel;
   String[] names;


   // $FF: renamed from: <clinit> () void
   static void method_6() {
      class_106 var10000 = new class_106;
      var10000.method_391();
      mapLogLevel = var10000;
      names = new String[]{"", "DEBUG", "INFO", "WARNING", "ERROR", ""};
   }

   void writeMessage(String var1, int var2);

   void writeMessage(String var1, int var2, int var3);

   void startClass(String var1);

   void endClass();

   void startWriteClass(String var1);

   void endWriteClass();

   void startMethod(String var1);

   void endMethod();

   int getSeverity();

   void setSeverity(int var1);

   boolean getShowStacktrace();
}
