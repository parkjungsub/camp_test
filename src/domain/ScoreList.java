package domain;

import java.util.ArrayList;
import java.util.List;

public class ScoreList {
    private List<Score> scoreList = new ArrayList<>();

    public ScoreList() {
    }

    public List<Score> getScoreList() {
        return scoreList;
    }

    public void addScore(Score score){
        scoreList.add(score);
    }

    //수정할 점수의 학생이 존재하는 지
    public Integer containStudentByScore(Student student){
        for (Score score : scoreList) {
            if(score.getStudentId() == student.getStudentId()) return student.getStudentId();
        }
        return -1;
    }
    public void print(){
        for (Score score : scoreList) {
            System.out.println(score.getStudentId() + " " + score.getSubjectId() + " " + score.getTestRound() +" "+ score.getScore());
        }
    }
}
