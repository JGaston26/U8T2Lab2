public class Student {
    private String name;
    private int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    /**
     * calculates and returns the average class grade as a double for a
     * all Students in the 2D array seatingChart
     * <p>
     * PRECONDITION:  seatingChart contains at least one element with at least
     * one student (i.e. no need to worry about division by 0)
     *
     * @param seatingChart 2D array of Student objects
     * @return the average grade of all Students in seatingChart, as a double
     */
    public static double classAverage(Student[][] seatingChart) {

    }
}
