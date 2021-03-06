package entity;

import javax.persistence.*;

@Entity
public class ClientAddress {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String street;

    @Column
    private Integer houseNo;

    @Column
    private String city;

    @Column
    private String country;

    @OneToOne(mappedBy = "clientAddress")
    private Client client;

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Integer getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(Integer houseNo) {
        this.houseNo = houseNo;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "ClientAddress{" +
                "id=" + id +
                ", street='" + street + '\'' +
                ", houseNo=" + houseNo +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", clientSurname'" + client.getName() + '\'' +
                '}';
    }
}
