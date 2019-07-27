package com.kodilla.testing.book;

public class LibraryUser {

    String firstName;
    String secondName;
    String peselId;

    public LibraryUser(String firstName, String secondName, String peselId) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.peselId = peselId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getPeselId() {
        return peselId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LibraryUser that = (LibraryUser) o;

        if (firstName != null ? !firstName.equals(that.firstName) : that.firstName != null) return false;
        if (secondName != null ? !secondName.equals(that.secondName) : that.secondName != null) return false;
        return peselId != null ? peselId.equals(that.peselId) : that.peselId == null;

    }

    @Override
    public int hashCode() {
        int result = firstName != null ? firstName.hashCode() : 0;
        result = 31 * result + (secondName != null ? secondName.hashCode() : 0);
        result = 31 * result + (peselId != null ? peselId.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "LibraryUser{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", peselId='" + peselId + '\'' +
                '}';
    }
}
