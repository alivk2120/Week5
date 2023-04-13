class Alphabets
{
  public static void main(String[] args) {
    String str1="hi, welcome to bitLabs 1234";
    System.out.println("The alphabets in the given string are:");
    for (int i=0;i<str1.length();i++)
    {
       int ch=str1.charAt(i);
       if(ch>='a' && ch<='z' ||  ch>='A' && ch<='Z')
System.out.print(str1.charAt(i)+" ");
    }

  }
}