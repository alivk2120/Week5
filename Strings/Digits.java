class Digits
{
  public static void main(String[] args) {
    String str1="hi, welcome 1234 to bitLabs 1234";
    System.out.println("The Digits in the given string are:");
    for (int i=0;i<str1.length();i++)
    {
       int ch=str1.charAt(i);
       if(ch>='0' && ch<='9')
       System.out.print(str1.charAt(i)+" ");
    }

  }
}