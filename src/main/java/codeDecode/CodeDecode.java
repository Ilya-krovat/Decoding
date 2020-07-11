package codeDecode;

public class CodeDecode implements CodeDecodeInterface
{
  private int squareSize;
  @Override
  public String code(String str)
  {
    squareSize=(int)Math.ceil(Math.sqrt(str.length()));
    while(squareSize*squareSize!=str.length())
    {
      str=str+"/";
    }
    return clockwiseRotation(str);
  }

  @Override
  public String decode(String str)
  {
    squareSize = (int)Math.sqrt(str.length());
    str = counterClockwiseRotation(str);
    return str.replaceAll("/","");
  }

  private String clockwiseRotation (String str)
  {
    String rotatedStr = "";
    for(int i=0;i<squareSize;i++)
      for (int j=squareSize - 1; j >= 0; j--)
        rotatedStr += str.charAt(j * squareSize + i);
    return rotatedStr;
  }

  private String counterClockwiseRotation(String str)
  {
    String rotatedStr="";
    for(int i=squareSize-1;i>=0;i--)
      for(int j=0;j<squareSize;j++)
        rotatedStr+=str.charAt(j*squareSize+i);
    return rotatedStr;
  }
}
