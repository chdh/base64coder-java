// Tests for the Base64Coder class.

import biz.source_code.base64Coder.Base64Coder;
import static org.junit.Assert.*;
import org.junit.Test;

public class TestBase64Coder {

// Test Base64Coder with constant strings.
@Test
public void test1() {
   check ("Aladdin:open sesame", "QWxhZGRpbjpvcGVuIHNlc2FtZQ==");  // example from RFC 2617
   check ("", "");
   check ("1", "MQ==");
   check ("22", "MjI=");
   check ("333", "MzMz");
   check ("4444", "NDQ0NA==");
   check ("55555", "NTU1NTU=");
   check ("abc:def", "YWJjOmRlZg=="); }

private static void check (String plainText, String base64Text) {
   String s1 = Base64Coder.encodeString(plainText);
   String s2 = Base64Coder.decodeString(base64Text);
   if (!s1.equals(base64Text) || !s2.equals(plainText))
      fail ("Check failed for \""+plainText+"\" / \""+base64Text+"\"."); }

// Test Base64Coder against sun.misc.BASE64Encoder/Decoder with random data.
@Test
public void test2() throws Exception {
   sun.misc.BASE64Encoder enc = new sun.misc.BASE64Encoder();
   sun.misc.BASE64Decoder dec = new sun.misc.BASE64Decoder();
   java.util.Random rnd = new java.util.Random(0x538afb92);
   for (int i=0; i<50000; i++) {
      int len = rnd.nextInt(55);
      byte[] b0 = new byte[len];
      rnd.nextBytes(b0);
      String e1 = new String(Base64Coder.encode(b0));
      String e2 = enc.encode(b0);
      assertEquals (e2, e1);
      byte[] b1 = Base64Coder.decode(e1);
      byte[] b2 = dec.decodeBuffer(e2);
      assertArrayEquals (b0, b1);
      assertArrayEquals (b0, b2); }}

} // end class TestBase64Coder
