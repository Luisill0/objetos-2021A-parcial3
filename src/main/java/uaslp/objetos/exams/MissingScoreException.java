package uaslp.objetos.exams;

public class MissingScoreException extends RuntimeException{
    public MissingScoreException() {
    }

    public MissingScoreException(String message) {
        super(message);
    }
}
