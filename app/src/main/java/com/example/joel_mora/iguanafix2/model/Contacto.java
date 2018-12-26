package com.example.joel_mora.iguanafix2.model;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.List;

public class Contacto implements Parcelable {
    private String id;
    private String dateCreated;
    private String birthDate;
    private String firstName;
    private String lastName;
    private List<Phone> phones;
    private String thumb;
    private String photo;

    public Contacto(){
    }

    protected Contacto(Parcel in) {
        id = in.readString();
        dateCreated = in.readString();
        birthDate = in.readString();
        firstName = in.readString();
        lastName = in.readString();
        phones = in.createTypedArrayList(Phone.CREATOR);
        thumb = in.readString();
        photo = in.readString();
    }

    public static final Creator<Contacto> CREATOR = new Creator<Contacto>() {
        @Override
        public Contacto createFromParcel(Parcel in) {
            return new Contacto(in);
        }

        @Override
        public Contacto[] newArray(int size) {
            return new Contacto[size];
        }
    };

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<Phone> getPhones() {
        return phones;
    }

    public void setPhones(List<Phone> phones) {
        this.phones = phones;
    }

    public String getThumb() {
        return thumb;
    }

    public void setThumb(String thumb) {
        this.thumb = thumb;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(id);
        dest.writeString(dateCreated);
        dest.writeString(birthDate);
        dest.writeString(firstName);
        dest.writeString(lastName);
        dest.writeTypedList(phones);
        dest.writeString(thumb);
        dest.writeString(photo);
    }
}
