class NumOfWords
{
  public static void main(String[] args) {
    String str1="hi hsoe djj eui9hf4 4uh 2974hr 79h9u3r h9u";
    int count=0;
    System.out.print("The no. of words in the given string is:");
    for (int i=0;i<str1.length();i++)
    {
       if(str1.charAt(i)==' ')
       count++;
    }
System.out.println(count+1);
  }
}