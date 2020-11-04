package Collections.task6;

public class Aspirant extends Student{
    private String researchWork;

     Aspirant(String firstName, String lastName, String group, double averageMark,String researchWork){
         super(firstName,lastName,group,averageMark);
         this.researchWork = researchWork;
    }
    Aspirant(){};

    @Override
    public int getScholarship() {
        if (averageMark >= 5){
            return 200;
        }else {
            return 180;
        }
    };
}
