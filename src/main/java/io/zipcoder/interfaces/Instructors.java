package io.zipcoder.interfaces;

final class Instructors extends People {
    private static final Instructors instance = new Instructors();

    private Instructors(){

    }

    public static Instructors getInstance(){
        return instance;
    }

}
