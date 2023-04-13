class Palindrome{
  public static void main(String args[]){
    String str="nursetrun";
    int count=0;
    int i=0,j=str.length()-1;
    while(i<j){
        for(j=str.length()-1;j>i;j--){
          if(str.charAt(i)==str.charAt(j)){
            count++;
            i++;
          }
        }
    }
    if(count==(str.length())/2){
      System.out.println("It is a palindrome");
    }
    else{
      System.out.println("It is not a palindrome");
    }
  }
}