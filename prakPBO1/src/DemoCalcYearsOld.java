import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class DemoCalcYearsOld {
    private int yourBirthYear;

    public int getYourBirthYear() {
        return yourBirthYear;
    }

    public void setYourBirthYear(int yourBirthYear) {
        this.yourBirthYear = yourBirthYear;
    }

    public static void main(String[] args) {
        DemoCalcYearsOld obj = new DemoCalcYearsOld();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan tahun kelahiran anda: ");
        int birthYear = scanner.nextInt();
        obj.setYourBirthYear(birthYear);

        int age = obj.calculateAge();
        System.out.println("Umur anda : " + age + " tahun.");
    }

    public int calculateAge() {
        LocalDate currentDate = LocalDate.now();
        LocalDate birthDate = LocalDate.of(this.getYourBirthYear(), 1, 1);
        Period period = Period.between(birthDate, currentDate);
        return period.getYears();
    }
}
