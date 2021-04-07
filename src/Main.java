public class Main {


    public static void main(String[] args) {

        final Student mystudent = new Student();

        mystudent.setId(10001);
        mystudent.setName("James");
        mystudent.setStudentCurriculum("Computer Science");
        System.out.println(mystudent.toString());

        mystudent.setId(10002);
        mystudent.setName("Wendell");
        mystudent.setStudentCurriculum("Computer Engineering");
        System.out.println(mystudent.toString());

        mystudent.setId(10003);
        mystudent.setName("James");
        mystudent.setStudentCurriculum("Information Technology");

        System.out.println(mystudent.toString());


           }
}