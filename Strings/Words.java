class Words
{
  public static void main(String[] args) {
    String str1="hi hsoe djj eui9hf4 4uh 2974hr 79h9u3r h9u";
    int count=0,j=0;
    String words[]=str1.split(" ");
    for (int i=0;i<words.length;i++)
    {
        int ch=str1.charAt(i);
        if(ch>='a' && ch<='z' || ch>='A' && ch<='B'){
          count++;
        }
    }
          System.out.println("No. of alphabets in word "+i+" is ";
       
    }
  }