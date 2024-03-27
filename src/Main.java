import java.util.ArrayList;
import java.util.List;


class StudentGroup {
    public String nazwa;
    public List<Student> grupa;

    public StudentGroup(String nazwa) {
        this.nazwa = nazwa;
        this.grupa = new ArrayList<>();
    }

    public void dodajStudenta(Student student) {
        if (grupa.size() >= 15) {
            throw new IllegalStateException("Grupa jest już pełna.");
        }

        if (grupa.contains(student)) {
            throw new IllegalStateException("Ten student już należy do grupy.");
        }

        grupa.add(student);
    }
}

class Studentdane {
    public String fname;
    public String iname;
    public String indexNumber;
    public String email;
    public String address;
    public List<Double> oceny;

    public int LiczenieSumy(List<Double> list) {
        int suma = 0;
        for (Double number : list)
            suma += number;
        return suma;
    }

    public double Srednia() throws IllegalArgumentException {
        if (this.oceny.isEmpty())
            throw new IllegalArgumentException("Student nie ma ocen");
        else if (oceny.size() > 20)
            throw new IllegalArgumentException("Student może mieć maksymalnie 20 ocen.");
        return LiczenieSumy(this.oceny) / (double) this.oceny.size();
    }
}
class Student {
    public String fname;
    public String iname;
    public String indexNumber;
    public String email;
    public String address;
    public List<Double> oceny;

    public void addStudent(String fname, String iname, String indexNumber, String email, String address) {
        this.fname = fname;
        this.iname = iname;
        this.indexNumber = indexNumber;
        this.email = email;
        this.address = address;
        this.oceny = new ArrayList<>();
    }
}

