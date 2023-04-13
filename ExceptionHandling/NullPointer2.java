class NullPointer2{
  public static void main(String args[]){
    System.out.println("gfdgd");
  String name=null;
    try{
    System.out.println(name.length());
    }
    catch(NullPointerException e){
      System.out.println(e);
    }
    String name1="ali";
    System.out.println(name1.length());
  
    
  }
}