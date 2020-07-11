package testCodeDecode;

import junit.framework.TestCase;
import codeDecode.*;

public class TestCodeDecode extends TestCase
{
  private CodeDecode d;

  public void testCodingString()
  {
    String str ="I.was.going.fishing.that.morning.at.ten.o'clock";
    String codedStr ="c.nhsoIltiahi.oentinwcng.ngak..mg.s/oao.f./'trtig";

    assertEquals(codedStr , d.code(str));
  }

  public void testDecodingString()
  {
    String codedStr ="c.nhsoIltiahi.oentinwcng.ngak..mg.s/oao.f./'trtig";
    String str = "I.was.going.fishing.that.morning.at.ten.o'clock";

    assertEquals(str, d.decode(codedStr));
  }

  public void testCodeAndDecode()
  {
    String str = "I want to finish my task immediately";
    String strOriginal=str;
    str=d.code(str);
    str=d.decode(str);

    assertEquals(strOriginal,str);
  }

  public void testBigText()
  {
    String str = "Yesterday"
        + "all my troubles seemed so far away,"
        + "Now it looks as though they're here to stay."
        + "Oh, I believe in yesterday."
        + ""
        + "Suddenly"
        + "I'm not half the man I used to be,"
        + "There's a shadow hanging over me."
        + "Oh, yesterday came suddenly."
        + ""
        + "Why she had to go,"
        + "I don't know, she wouldn't say."
        + "I said something wrong,"
        + "now I long for yesterday."
        + ""
        + "Yesterday"
        + "love was such an easy game to play."
        + "Now I need a place to hide away."
        + "Oh, I believe in yesterday.";
    String strOriginal = str;
    str=d.code(str);
    str=d.decode(str);

    assertEquals(strOriginal, str);
  }

  @Override
  public void setUp() throws Exception
  {
    super.setUp();
    d=new CodeDecode();
  }

  @Override
  public void tearDown() throws Exception
  {
    super.tearDown();
  }
}
