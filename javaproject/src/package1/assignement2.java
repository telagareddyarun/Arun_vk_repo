package package1;

public class assignement2 {public int sum (int a,int b)
{
    int c;
    c=a+b;
      System.out.println("sum result is =" +c);
      return c;
  }

  public int sub (int x,int y )
  {
      int z;
      z=x-y;
      System.out.println("sub result is ="+z);
      return z;
  }

  public int mul (int a1,int a2 )
  {
      int a3;
      a3 = a1*a2;
      System.out.println(" mul result is ="+a3);
      return a3;
  }

  public void div (int a3,int a4 )
  {
     int a5;
     a5 = a3/a4;
      System.out.println("final result ="+a5);
      System.out.println("");
  }

  public static void main(String[] args)
  {
       assignement2 abc = new assignement2();
      int sumresult=abc.sum(10,2);
       int sumresult2= abc.sum(sumresult,2);
       int subresult=abc.sub(sumresult2,2);
       int mulresult=abc.mul(subresult,2);
       abc.div(mulresult,2);

       int mulr=abc.mul(10,2);
       int subr=abc.sub(mulr,2);
       int sumr=abc.sum(subr,2);
       int subr2=abc.sub(sumr,2);
       abc.div(subr2,2);

       int sumh=abc.sum(160,260);
       abc.div(sumh,46);


  }


}
