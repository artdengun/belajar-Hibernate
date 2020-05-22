package Repository;

import com.rizki.mufrizal.belajarHibernate.Mahasiswa;

import java.util.List;

public interface MahasiswaRepository {

        void save(Mahasiswa mahasiswa);
        void update(Mahasiswa mahasiswa);
        void delete(Mahasiswa mahasiswa);
        Mahasiswa getMahasiswa(String npm);
        List<Mahasiswa> getMahasiswas();

}
