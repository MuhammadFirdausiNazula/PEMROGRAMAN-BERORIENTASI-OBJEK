import java.util.Scanner;
public class User {
    private String namaUser;
    private String passwordUser;
    private int roleUser;
    private boolean statusUser;

    private boolean admin;
    private int userIndex;
    private Object[][] userDB;

    public User() {
        this.userDB = new Object[][]{
                {"admin", "admin", 0, true},
                {"202110370311147", "UMM21", 1, true},
                {"202110370311145", "UMM21", 1, false}
        };
        this.admin = false;
        this.userIndex = -1;
    }

    public void login() {
        Scanner scanner = new Scanner(System.in);


        System.out.println("==========LOGIN============");
        System.out.print("username: ");
        String namaUser = scanner.nextLine();
        System.out.print("password: ");
        String passwordUser = scanner.nextLine();

        for (int i = 0; i < userDB.length; i++) {
            if (namaUser.equals((String) userDB[i][0]) && passwordUser.equals((String) userDB[i][1])) {
                this.namaUser = namaUser;
                this.passwordUser = passwordUser;
                this.roleUser = (int) userDB[i][2];
                this.statusUser = (boolean) userDB[i][3];
                this.userIndex = i;
                if (roleUser == 0) {
                    admin = true;
                }
                System.out.println("Berhasil masuk sebagai " + (roleUser == 0 ? "admin" : "mahasiswa"));
                dashboard();
                return;
            }
        }

        System.out.println("Nama pengguna atau kata sandi salah.");
    }

    public void dashboard() {
        System.out.println("==========DASHBOARD============");
        if (isAdmin()) {
            System.out.println("1. Update Status Mahasiswa");
            System.out.println("2. Update Password Mahasiswa");
            System.out.println("3. Logout");
            System.out.print("masukan (1-3) :");
            Scanner input = new Scanner(System.in);
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    updateStatus();
                    break;
                case 2:
                    updatePassword();
                    break;
                case 3:
                    admin = false;
                    userIndex = -1;
                    System.out.println("Logout Successful!");
                    login();
                    break;
                default:
                    System.out.println("Invalid choice!");
                    dashboard();
                    break;
            }
        } else {
            System.out.println("1. Update Password");
            System.out.println("2. Logout");
            System.out.print("masukan (1-2) :");
            Scanner input = new Scanner(System.in);
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    updatePassword();
                    break;
                case 2:
                    admin = false;
                    userIndex = -1;
                    System.out.println("Logout Successful!");
                    login();
                    break;
                default:
                    System.out.println("Invalid choice!");
                    dashboard();
                    break;
            }
        }
    }

    public boolean isAdmin() {
        return roleUser == 0;
    }

    public void updateStatus() {
        if (!isAdmin()) {
            System.out.println("Tidak dapat mengakses menu ini.");
            return;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nama pengguna mahasiswa: ");
        String namaMahasiswa = scanner.nextLine();

        for (int i = 0; i < userDB.length; i++) {
            if (namaMahasiswa.equals((String) userDB[i][0])) {
                boolean status = (boolean) userDB[i][3];
                System.out.println("Ganti Status Mahasiswa:");
                System.out.println("1. Aktif");
                System.out.println("2. Tidak Aktif");
                System.out.print("masukan (1-2) :");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        userDB[i][3] = true;
                        System.out.println("Berhasil mengubah status mahasiswa menjadi aktif.");
                        return;
                    case 2:
                        userDB[i][3] = false;
                        System.out.println("Berhasil mengubah status mahasiswa menjadi tidak aktif.");
                        return;
                    default:
                        System.out.println("Pilihan tidak valid!");
                        return;
                }
            }
        }

        System.out.println("Nama pengguna mahasiswa tidak ditemukan.");
    }

    public void updatePassword() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan password lama: ");
        String oldPassword = scanner.nextLine();


        if (!passwordUser.equals(oldPassword)) {
            System.out.println("Password lama salah!");
            return;
        }


        System.out.print("Masukkan password baru: ");
        String newPassword = scanner.nextLine();


        if (!isPassSymbols(newPassword) || !isPassDigit(newPassword) || !isPassUpperCase(newPassword)) {
            System.out.println("Password tidak memenuhi kriteria!");
            System.out.println("Password harus memiliki setidaknya satu simbol (!@#$%^&*), satu angka, dan satu huruf kapital");
            return;
        } else {

            passwordUser = newPassword;
            System.out.println("Password berhasil diubah!");
        }
    }
    private boolean isPassSymbols(String password) {
        return password.matches(".*[!@#$%^&*].*");
    }

    private boolean isPassDigit(String password) {
        return password.matches(".*\\d.*");
    }

    private boolean isPassUpperCase(String password) {
        return password.matches(".*[A-Z].*");
    }
    public static void main(String[] args) {
        // Inisialisasi database user
        Object[][] userDB = {
                {"admin", "admin", 0, true},
                {"202110370311147", "UMM21", 1, true},
                {"202110370311145", "UMM21", 1, false}
        };

        User user = new User();


        user.login();

        user.dashboard();

        user.updatePassword();


        if (user.isAdmin()) {
            user.updateStatus();
        }
    }
}



