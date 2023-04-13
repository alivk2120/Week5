class FirstWord
{
  public static void main(String[] args) {
    String str1="Hi, Welcome to bitLabs 1234";
    String words[]=str1.split();
    for (int i=0;i<str1.length();i++)
    {
       int ch=str1.charAt(i);
       if(ch>='A' && ch<='Z'){
        up++;
       }
      else if(ch>='a' && ch<='z'){
        low++;
      }
    }
    System.out.print("The no. of Upper case letters in the given string is:");
System.out.println(up);
    System.out.print("The no. of Upper case letters in the given string is:");
    System.out.println(low);
  }
}