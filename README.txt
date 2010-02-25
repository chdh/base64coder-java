
Base64Coder
===========

Base64Coder is a Java class module used to encode and decode data in
Base64 format.

Project home page: http://www.source-code.biz/base64coder/java



Ant build script (build.xml)
----------------------------

The following Ant targets are useful to build and test the software:

 ant buildAll

   This is the default Ant target. It compiles the Base64Coder class,
   builds the JAR file (target/base64coder.jar) and generates the API
   documentation page (target/Base64Coder.html).
   The JAR file and the documentation page are stored in the
   subdirectory named "target".

 ant test

   This Ant target runs the test program TestBase64Coder.java using
   JUnit. A report is written to target/test-reports.
   The compiler warning messages "... is Sun proprietary API ..." are
   normal and cannot be suppressed. The warnings occur because the
   test program uses Suns proprietary Base64 classes to test the
   Base64Coder class.
