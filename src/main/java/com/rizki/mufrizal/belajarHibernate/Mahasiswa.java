package com.rizki.mufrizal.belajarHibernate;


import org.hibernate.annotations.Entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name="tb_mahasiswa")
public class Mahasiswa implements Serializable {

    @Id
    @Column(name = "npm", length = 8)
    private String npm;

    @Column(name = "nama", nullable = false, length = 45)
    private String nama;

    @Column(name = "kelas", nullable = false, length = 5)
    private String kelas;

    @Column(name = "jenisKelamin", nullable = false, length = 6)
    @Enumerated(EnumType.STRING)
    private JenisKelamin jenisKelamin;

    @Column(name = "tanggalLahir", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date tanggalLahir;

    public String getNpm() {
        return npm;
    }

    public void setNpm(String npm) {
        this.npm = npm;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public JenisKelamin getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(JenisKelamin jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public Date getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(Date tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }
}
