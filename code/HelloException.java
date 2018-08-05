public class HelloException{

  public static void main(String[] args){
    try{
      mayThrowException();
    } catch (Exception e){
       e.printStackTrace();
    }
  }

  private static void mayThrowException() throws Exception{
      throw new Exception("Exception");
  }
}
