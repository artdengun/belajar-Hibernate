package com.rizki.mufrizal.belajarHibernate;

import Repository.MahasiswaRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws ParseException {
        MahasiswaRepository mahasiswaRepository = HibernateUtil.getMahasiswaRepository();
        Logger logger = LoggerFactory.getLogger(App.class);

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.setNpm("58412085");
        mahasiswa.setNama("Rizki Mufrizal");
        mahasiswa.setKelas("3IA04");
        mahasiswa.setJenisKelamin(JenisKelamin.PRIA);
        mahasiswa.setTanggalLahir(new SimpleDateFormat("dd/MM/yyyy").parse("15/11/1993"));

        mahasiswaRepository.save(mahasiswa);

        List<Mahasiswa> mahasiswas = mahasiswaRepository.getMahasiswas();

        for(Mahasiswa mahasiswaData: mahasiswas){
            logger.info("Npm           : {}", mahasiswaData.getNpm());
            logger.info("Nama          : {}", mahasiswaData.getNama());
            logger.info("Kelas         : {}", mahasiswaData.getKelas());
            logger.info("Jenis Kelamin : {}", mahasiswaData.getJenisKelamin());
            logger.info("Tanggal Lahir : {}", mahasiswaData.getTanggalLahir());
        }

        Mahasiswa mahasiswa1 = mahasiswaRepository.getMahasiswa("58412085");
        mahasiswa1.setNama("rizki");

        mahasiswaRepository.update(mahasiswa1);

        mahasiswaRepository.delete(mahasiswa1);

    }
}
