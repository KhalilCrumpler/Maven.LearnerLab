package io.zipcoder.interfaces;

public class Student extends Person implements Learner {

    public double totalStudyTime = 0;
    public Student(){

    }

    public void learn(double numberOfHours) {
        this.totalStudyTime += numberOfHours;

    }

    public Double getTotalStudyTime() {
        return this.totalStudyTime;
    }
}
