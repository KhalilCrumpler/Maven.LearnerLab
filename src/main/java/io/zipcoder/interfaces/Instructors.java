package io.zipcoder.interfaces;

public final class Instructors extends People<Instructor> {
    private static final Instructors INSTANCE;

    static {
        try {
            INSTANCE = new Instructors();
        } catch (Exception e) {
            throw new RuntimeException("error");
        }
    }
    private Instructors(){
        Instructor tom = new Instructor(1L, "Tom");
        Instructor david = new Instructor(2L, "David");

    }

    public static Instructors getInstance(){
        return INSTANCE;
    }

    @Override
    public Instructor[] listToArray() {
        return getPersonList().toArray(new Instructor[0]);
    }
}
