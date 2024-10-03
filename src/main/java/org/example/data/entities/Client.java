package org.example.data.entities;

import java.util.ArrayList;
import java.util.List;

public class Client {
    private int id;
    private String surname;
    private String telephone;
    private String address;
    private static int nbrClient;

    // Navigabilite
    //OneToOne (Client => User)
    private User user;
    //OneToMany (Client => Dette)
    private List<Dette> dettes =new ArrayList<>();

    public Client() {
        id = ++nbrClient;
    }
    public Client(String surname, String telephone, String address) {
        id = ++nbrClient;
        this.surname = surname;
        this.telephone = telephone;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Dette> getDettes() {
        return dettes;
    }

    public void add(Dette dette) {
        this.dettes.add(dette);
    }

    @Override
    public String toString() {
        return "Client [id=" + id + ", surname=" + surname + ", telephone=" + telephone + ", address=" + address + ",user=" + user + "]";
    }
}
