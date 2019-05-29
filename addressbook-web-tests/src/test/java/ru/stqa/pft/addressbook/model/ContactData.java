package ru.stqa.pft.addressbook.model;

public class ContactData {
    private final String firstname;
    private final String middlename;
    private final String lastname;
    private final String nickname;
    private final String title;
    private final String company;
    private final String address;
    private final String phonehome;
    private final String phonemobile;
    private final String phonework;

    public ContactData(String firstname, String middlename, String lastname, String nickname, String title, String company, String address, String phonehome, String phonemobile, String phonework) {
        this.firstname = firstname;
        this.middlename = middlename;
        this.lastname = lastname;
        this.nickname = nickname;
        this.title = title;
        this.company = company;
        this.address = address;
        this.phonehome = phonehome;
        this.phonemobile = phonemobile;
        this.phonework = phonework;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getMiddlename() {
        return middlename;
    }

    public String getLastname() {
        return lastname;
    }

    public String getNickname() {
        return nickname;
    }

    public String getTitle() {
        return title;
    }

    public String getCompany() {
        return company;
    }

    public String getAddress() {
        return address;
    }

    public String getPhonehome() {
        return phonehome;
    }

    public String getPhonemobile() {
        return phonemobile;
    }

    public String getPhonework() {
        return phonework;
    }
}
