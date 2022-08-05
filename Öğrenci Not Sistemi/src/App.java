public class App {
    public static void main(String[] args) throws Exception {

        Course mat = new Course("Matematik", "MAT101", "MAT");
        Course fzk = new Course("Fizik", "FZK101", "FZK");
        Course kimya = new Course("Kimya", "KMY101", "KMY");

        Teacher t1 = new Teacher("Ahmet ", "MAT", "90550000000");
        Teacher t2 = new Teacher("Mehmet ", "FZK", "90550000001");
        Teacher t3 = new Teacher("Ayşe ", "KMY", "90550000002");

        mat.addTeacher(t1);
        fzk.addTeacher(t2);
        kimya.addTeacher(t3);

        Student s1 = new Student("Duhan", 4, "123124564565", mat, fzk, kimya);
        s1.addBulkExamNote(15, 25, 65);
        s1.isPass();

        Student s2 = new Student("Ayse", 3, "12312", mat, fzk, kimya);
        s2.addBulkExamNote(85, 75, 65);
        s2.isPass();

    }
}
