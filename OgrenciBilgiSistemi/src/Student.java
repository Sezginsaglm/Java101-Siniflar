public class Student {
    String name,stuNo;
    int classes;
    Course mat;
    Course matS;
    Course fizik;
    Course fizikS;
    Course kimya;
    Course kimyaS;
    double average;
    double fizikavr;
    double matavr;
    double kimyavr;
    boolean isPass;


    Student(String name, int classes, String stuNo, Course mat,Course fizik,Course kimya,
            Course matS,Course kimyaS,Course fizikS) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.matS = matS;
        this.fizik = fizik;
        this.fizikS = fizikS;
        this.kimya = kimya;
        this.kimyaS = kimyaS;
        this.isPass = false;
    }


    public void addBulkExamNote(int mat, int fizik, int kimya,int matS,int kimyaS,int fizikS) {

        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
        }
        if (matS >= 0 && matS <= 100) {
            this.matS.note = matS;
        }
        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
        }
        if (fizikS >= 0 && fizikS <= 100) {
            this.fizikS.note = fizikS;
        }
        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
        }
        if (kimyaS >= 0 && kimyaS <= 100) {
            this.kimyaS.note = kimyaS;
        }
    }

    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0
            ||this.matS.note == 0 ||this.fizikS.note == 0 || this.kimyaS.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.average);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAverage() {
        this.fizikavr=(this.fizik.note)*(0.8)+(this.fizikS.note)*(0.2);
        this.kimyavr=(this.kimya.note)*(0.8)+(this.kimyaS.note)*(0.2);
        this.matavr=(this.mat.note)*(0.8)+(this.matS.note)*(0.2);
        this.average = (this.matavr + this.kimyavr + this.matavr) / 3.0;
    }

    public boolean isCheckPass() {
        calcAverage();
        return this.average > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.matavr);
        System.out.println("Fizik Notu : " + this.fizikavr);
        System.out.println("Kimya Notu : " + this.kimyavr);
    }

}