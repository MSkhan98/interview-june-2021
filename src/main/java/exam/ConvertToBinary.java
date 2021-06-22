package exam;

public class ConvertToBinary
{

  public String toBinary(final int n)
  {
    //TODO write your code here to achieve the desired result as explained in Readme file for this problem.
    for (int i = 31; i >= 0; i--) 
    {
            int k = n >> i;
            if ((k & 1) > 0)
                System.out.print("1");
            else
                System.out.print("0");
    return "";
  }
}
  return 0;
}
