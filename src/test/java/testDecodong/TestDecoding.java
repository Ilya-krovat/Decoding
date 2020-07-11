package testDecodong;

import junit.framework.TestCase;
import decoding.*;

public class TestDecoding extends TestCase
{

  public void testCodingString() throws Exception
  {
    String s = "abcd\nefgh\nijkl\nmnop";
    Decoging d = new Decoging();
    String f ="c.nhsoI\nltiahi.\noentinw\ncng.nga\nk..mg.s\n\\voao.f.\n\\v'trtig";

    assertEquals(f , d.code(s));
  }

  public void testDecodingString() throws Exception
  {
    String f ="c.nhsoI\nltiahi.\noentinw\ncng.nga\nk..mg.s\n\\voao.f.\n\\v'trtig";
    String s = "abcd\nefgh\nijkl\nmnop";
    Decoging d = new Decoging();

    assertEquals(s, d.decode(f));
  }

  @Override
  public void setUp() throws Exception
  {
    super.setUp();
  }

  @Override
  public void tearDown() throws Exception
  {
    super.tearDown();
  }
}
