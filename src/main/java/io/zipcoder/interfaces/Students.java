package io.zipcoder.interfaces;

final class Students extends People<Student> {
    private static final Students INSTANCE;

    static{
        try{
            INSTANCE = new Students();
        } catch(Exception e){
            throw new RuntimeException("error");
        }
    }
    private Students(){
        Student khalil = new Student(1L, "Khalil");
        Student khaliah = new Student(2L, "Khaliah");

    }



    public static Students getInstance(){
        return INSTANCE;
    }


}
