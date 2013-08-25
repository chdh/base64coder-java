
Base64Coder
===========

Base64Coder is a Java class module used to encode and decode data in
Base64 format.

Project home page: http://www.source-code.biz/base64coder/java



Ant build script (build.xml)
----------------------------

The following Ant targets can be used to build and test the software:

 ant package

   This is the default Ant target. It compiles the Base64Coder class
   and builds the JAR file (target/base64coder.jar).

 ant javadoc

   Generates the API documentation pages (target/apidocs).

 ant test

   This Ant target runs the test module TestBase64Coder.java using
   JUnit. A report is written to the directory "target/test-reports".
   The compiler warning messages "... is internal proprietary API ..."
   are normal and cannot be suppressed. The warnings occur because the
   test program uses the JDKs internal Base64 classes to test the
   Base64Coder class.
