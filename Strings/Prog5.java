class Prog5
{
  public static void main(String[] args) {
    String str1="Hi, Welcome to bitLabs @#1234";
    int up=0,low=0,dig=0,space=0,chara=0;
    for (int i=0;i<str1.length();i++)
    {
       int ch=str1.charAt(i);
       if(ch>='A' && ch<='Z'){
        up++;
       }
      else if(ch>='a' && ch<='z'){
        low++;
      }
      else if(ch>='0' && ch<='9'){
        dig++;
      }
      else if(ch==' '){
        space++;
      }
      else{
        chara++;
      }
    }
    System.out.print("The no. of Upper case letters in the given string is:");
System.out.println(up);
    System.out.print("The no. of lower case letters in the given string is:");
    System.out.println(low);
    System.out.print("The no. of digits in the given string is:");
System.out.println(dig);
    System.out.print("The no. of spaces in the given string is:");
    System.out.println(space);
    System.out.print("The no. of special characters in the given string is:");
System.out.println(chara);
  }
}