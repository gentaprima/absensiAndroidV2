package com.example.absensi.model.laporan;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DataLaporan implements Parcelable {
    @SerializedName("id_absensi")
    @Expose
    private String idAbsensi;
    @SerializedName("id_users")
    @Expose
    private String idUsers;
    @SerializedName("check_in")
    @Expose
    private String checkIn;
    @SerializedName("check_out")
    @Expose
    private String checkOut;
    @SerializedName("late")
    @Expose
    private String late;
    @SerializedName("work_time")
    @Expose
    private String workTime;
    @SerializedName("date")
    @Expose
    private String date;
    @SerializedName("is_late")
    @Expose
    private String isLate;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("keterangan")
    private String keterangan;

    protected DataLaporan(Parcel in) {
        idAbsensi = in.readString();
        idUsers = in.readString();
        checkIn = in.readString();
        checkOut = in.readString();
        late = in.readString();
        workTime = in.readString();
        date = in.readString();
        isLate = in.readString();
        status = in.readString();
        keterangan = in.readString();
    }

    public static final Creator<DataLaporan> CREATOR = new Creator<DataLaporan>() {
        @Override
        public DataLaporan createFromParcel(Parcel in) {
            return new DataLaporan(in);
        }

        @Override
        public DataLaporan[] newArray(int size) {
            return new DataLaporan[size];
        }
    };

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public String getIdAbsensi() {
        return idAbsensi;
    }

    public void setIdAbsensi(String idAbsensi) {
        this.idAbsensi = idAbsensi;
    }

    public String getIdUsers() {
        return idUsers;
    }

    public void setIdUsers(String idUsers) {
        this.idUsers = idUsers;
    }

    public String getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(String checkIn) {
        this.checkIn = checkIn;
    }

    public String getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(String checkOut) {
        this.checkOut = checkOut;
    }

    public String getLate() {
        return late;
    }

    public void setLate(String late) {
        this.late = late;
    }

    public String getWorkTime() {
        return workTime;
    }

    public void setWorkTime(String workTime) {
        this.workTime = workTime;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getIsLate() {
        return isLate;
    }

    public void setIsLate(String isLate) {
        this.isLate = isLate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(idAbsensi);
        parcel.writeString(idUsers);
        parcel.writeString(checkIn);
        parcel.writeString(checkOut);
        parcel.writeString(late);
        parcel.writeString(workTime);
        parcel.writeString(date);
        parcel.writeString(isLate);
        parcel.writeString(status);
        parcel.writeString(keterangan);
    }
}
