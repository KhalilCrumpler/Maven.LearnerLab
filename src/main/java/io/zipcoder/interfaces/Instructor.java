package io.zipcoder.interfaces;

public class Instructor extends Person implements Teacher {
    public Instructor(Long id, String name){
        super(id, name);

    }

    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
    }

    public void lecture(Learner[] learners, double numberOfHours) {
        for(Learner a : learners){
            a.learn(numberOfHours/learners.length);
        }
    }
}
