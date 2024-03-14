import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> passedCourses= new ArrayList<>();
        passedCourses.add("introduktions programmering");
        passedCourses.add("avanceret matematik");


        ArrayList<String>canTeach = new ArrayList<>();
        canTeach.add("blomsterbinding");
        canTeach.add("negletekniker");
        canTeach.add("sygeplerjske");

        ArrayList<Person>persons= new ArrayList<>();
        persons.add(new Student("Mhaa",passedCourses));
        persons.add(new Teacher("Mhaa",canTeach));

        ArrayList<Person>persons2= new ArrayList<>();
        persons2.add(new Student("Andrea",passedCourses));
        persons2.add(new Teacher("Maria",canTeach));
        canTeach.add("java 1,0");
        for (Person person: persons) {
            boolean succes = person.addCourse("java 1,0");
            if (succes == false) {
                System.out.println(person.getName());
                if (person instanceof Student) {
                    System.out.println("jeg har allerede bestået dette kursus");
                } else {
                    System.out.println("kan ikke undervise i dette fag");
                }
            }
        }



    }




}
