package id.co.kosankoding.angkotbandung.model;

import com.google.gson.annotations.SerializedName;

public class Angkot {

    @SerializedName("id_angkot")
    private String idAngkot;
    @SerializedName("kode_angkot")
    private String kodeAngkot;
    @SerializedName("trayek")
    private String trayek;
    @SerializedName("jarak")
    private String jarak;
    @SerializedName("jumlah_armada")
    private String jumlahArmada;
    @SerializedName("gambar")
    private String gambar;

    public Angkot(String idAngkot, String kodeAngkot, String trayek, String jarak, String jumlahArmada, String gambar) {
        this.idAngkot = idAngkot;
        this.kodeAngkot = kodeAngkot;
        this.trayek = trayek;
        this.jarak = jarak;
        this.jumlahArmada = jumlahArmada;
        this.gambar = gambar;
    }

    public String getIdAngkot() {
        return idAngkot;
    }

    public String getKodeAngkot() {
        return kodeAngkot;
    }

    public String getTrayek() {
        return trayek;
    }

    public String getJarak() {
        return jarak;
    }

    public String getJumlahArmada() {
        return jumlahArmada;
    }

    public String getGambar() {
        return gambar;
    }
}
