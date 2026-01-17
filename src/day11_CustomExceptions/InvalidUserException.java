package day11_CustomExceptions;

//Create Custom Exception: InvalidUserException
//Represents a business rule violation (user-related).


public class InvalidUserException extends RuntimeException {

    public InvalidUserException(String message) {
        super(message);
    }
}


//Why RuntimeException?

//No signature pollution
//Clean service APIs
//Preferred in backend systems