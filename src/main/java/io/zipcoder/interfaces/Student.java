package io.zipcoder.interfaces;

public class Student extends Person implements Learner {

    public double totalStudyTime = 0;
    public int count = 0;
    public Student(Long id, String name){
        super(id, name);
    }

    public void learn(double numberOfHours) {
        this.totalStudyTime += numberOfHours;

    }

    public Double getTotalStudyTime() {
        return this.totalStudyTime;
    }
    @Override
    public String toString(){

        return "Name: " + this.getName() + " Average score: " + this.getTotalStudyTime();
    }
}
