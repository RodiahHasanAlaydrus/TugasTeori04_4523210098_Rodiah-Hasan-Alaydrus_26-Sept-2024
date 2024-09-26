import com.FeaturePhone;
import com.Handphone;
import com.Smartphone;

public class Main {
    public static void main(String[] args) {
        // Membuat array atau list dari Handphone
        Handphone[] daftarHandphone = new Handphone[2];

        // Mengisi array dengan objek Smartphone dan FeaturePhone
        daftarHandphone[0] = new Smartphone("Samsung", "Galaxy S21");
        daftarHandphone[1] = new FeaturePhone("Nokia", "3310");

        // Menggunakan loop untuk memanggil metode secara polimorfik
        for (Handphone hp : daftarHandphone) {
            hp.nyalakan();
            hp.matikan();
            hp.kirimPesan("087887017444", "What's up?");
            hp.kirimPesan( "0873423984", "0783421434", "Hi Dimas dan Anggun!");
            hp.kirimPesan(new String[]{"078347834738", "09340384034830", "034803480384", "034782378237"}, "Hello angkatan 23 Informatika UP!");
            System.out.println();
        }

        // Mengakses metode khusus dengan casting
        for (Handphone hp : daftarHandphone) {
            if (hp instanceof Smartphone) {
                ((Smartphone) hp).kirimPesan("08123456789", "Hello!");
                ((Smartphone) hp).kirimPesan("diah4523098@univpancasila.ac.id", "Tugas", "Saya izin mengumpulkan tugas PBO.");
                ((Smartphone) hp).aksesInternet();
            } else if (hp instanceof FeaturePhone) {
                ((FeaturePhone) hp).mainGameSnake();
            }
        }
    }
}