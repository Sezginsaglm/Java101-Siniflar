public class OgrenciBilgiSistemi {
    public static void main(String[] args) {

        Course mat = new Course("Matematik", "MAT101", "MAT");
        Course matS = new Course("Matematik", "MAT101", "MAT");
        Course fizik = new Course("Fizik", "FZK101", "FZK");
        Course fizikS = new Course("Fizik", "FZK101", "FZK");
        Course kimya = new Course("Kimya", "KMY101", "KMY");
        Course kimyaS = new Course("Kimya", "KMY101", "KMY");

        Teacher t1 = new Teacher("James Cameron", "90550000000", "MAT");
        Teacher t2 = new Teacher("Woody Allen", "90550000001", "FZK");
        Teacher t3 = new Teacher("Christopher Nolan", "90550000002", "KMY");

        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);


        Student s1 = new Student
                ("Quentin Tarantino", 4, "140144015", mat, fizik, kimya,matS,kimyaS,fizikS);
        s1.addBulkExamNote
                (50,20,40,55,50,80);
        s1.isPass();



        Student s2 = new Student
                ("Alfred Hitchcock", 4, "2211133", mat, fizik,kimya,matS,kimyaS,fizikS);
        s2.addBulkExamNote
                (100,50,40,65,49,75);
        s2.isPass();



        Student s3 = new Student
                ("Stanley Kubrick", 4, "221121312", mat, fizik,kimya,matS,kimyaS,fizikS);
        s3.addBulkExamNote
                (50,20,40,54,46,67);
        s3.isPass();

    }
}