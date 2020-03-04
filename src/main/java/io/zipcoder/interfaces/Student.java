package io.zipcoder.interfaces;

public class Student extends Person implements Learner {

    public double totalStudyTime = 0;
    public int count = 0;
    public Student(){
        count ++;
    }

    public void learn(double numberOfHours) {
        this.totalStudyTime += numberOfHours;

    }

    public Double getTotalStudyTime() {
        return this.totalStudyTime;
    }
}
