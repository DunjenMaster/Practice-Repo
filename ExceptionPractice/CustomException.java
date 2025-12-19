package ExceptionPractice;


class InvalidAgeException extends Exception{

   public InvalidAgeException(String message){
       super(message);
   }

}



public class CustomException {

    static void validateAge(int age) throws InvalidAgeException{
        if(age < 18) {
            throw new InvalidAgeException("Age is invalid!");
        }else
        System.out.println("Age is valid!");
    }

    public static void main(String[] args) {
        try{
            int age = 16;
            validateAge(age);
        }catch (InvalidAgeException e) {
            System.out.println(e);
        }
    }
}
