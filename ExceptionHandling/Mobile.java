class InvalidMobileNumberException extends Exception{
  InvalidMobileNumberException(String str){
    super(str);
  }
}
class CheckMobileNumber{
  void validateNumber(String number) throws InvalidMobileNumberException{
    if(number.length()==10){
      System.out.println("Valid mobile number");
    }
    else{
      throw new InvalidMobileNumberException("Invalid mobile number");
    }
  }
}
class Mobile{
  public static void main(String args[]){
    CheckMobileNumber c=new CheckMobileNumber();
    try{
      c.validateNumber("6238786104");
    }
    catch(InvalidMobileNumberException e){
      System.out.println(e);
    }
  }
}