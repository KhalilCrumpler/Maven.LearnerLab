package io.zipcoder.interfaces;

final class Students extends People {
    private static final Students instance = new Students();

    private Students(){

    }

    public static Students getInstance(){
        return instance;
    }
  //
    //
    //  static{
      //  try {
     //       instance = new Students();
     //   }catch(Exception e){
       //     throw new RuntimeException("Exception occurred in creating singleton instance");
       // }
   // }

}
