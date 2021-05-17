package uaslp.objetos.exams;

import java.util.Arrays;

public class Student {

    private String name;
    private int code;
    private int scores[];

    public Student(String name,int code){
        this.name = name;
        this.code = code;
        scores = new int[4];
    }

    public String getName() {
        return name;
    }

    public int getCode() {
        return code;
    }

    public void setScore(int partial, int score) throws InvalidPartialException{
        if(partial > 3){
            throw new InvalidPartialException();
        }else{
            scores[partial] = score;
        }
    }

    public double getAverage() throws MissingScoreException{
        double average = 0;

        for(int i = 1; i < 4; i++){
            if(scores[i] == 0){
                throw new MissingScoreException("Missing partial 2");
            }else{
                average += scores[i];
            }
        }

        return average/3;
    }
}
