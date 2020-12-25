package com.example.absensi.model.laporan;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DataLaporanResponse {
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("status")
    @Expose
    private Boolean status;
    @SerializedName("data_laporan")
    @Expose
    private List<DataLaporan> dataLaporan = null;
    @SerializedName("hadir")
    @Expose
    private String hadir;
    @SerializedName("tidak_hadir")
    @Expose
    private String tidakHadir;
    @SerializedName("izin")
    @Expose
    private String izin;

    public String getHadir() {
        return hadir;
    }

    public void setHadir(String hadir) {
        this.hadir = hadir;
    }

    public String getTidakHadir() {
        return tidakHadir;
    }

    public void setTidakHadir(String tidakHadir) {
        this.tidakHadir = tidakHadir;
    }

    public String getIzin() {
        return izin;
    }

    public void setIzin(String izin) {
        this.izin = izin;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public List<DataLaporan> getDataLaporan() {
        return dataLaporan;
    }

    public void setDataLaporan(List<DataLaporan> dataLaporan) {
        this.dataLaporan = dataLaporan;
    }
}
