class Character
{
  public static void main(String[] args) {
    String str1="hi, welcome to bitLabs @#1234";
    System.out.println("The Characters in the given string are:");
    for (int i=0;i<str1.length();i++)
    {
      int ch=str1.charAt(i);
       if(str1.charAt(i)>='a' && ch<='z' ||  ch>='A' && ch<='Z' || ch>='0' && ch<='9' || ch!=' '){

       }
      else{
      System.out.println(str1.charAt(i)+" ");
      }
    }

  }
}