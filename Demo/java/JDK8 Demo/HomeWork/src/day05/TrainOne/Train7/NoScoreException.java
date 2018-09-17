package day05.TrainOne.Train7;

public class NoScoreException extends RuntimeException {
    public NoScoreException(){};

    public NoScoreException(String message){
        super(message);
    }
}
