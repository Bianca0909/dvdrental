package br.com.jovemdev.dvdrental.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@NoArgsConstructor
@Entity
@Getter
@Table(name = "staff")

public class StaffEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "staff_seq_generator")
    @SequenceGenerator(name = "staff_seq_generator", sequenceName = "staff_staff_id_seq", allocationSize = 1)
    @Column(name = "staff_id")
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;



    /*JoinColumns({ @JoinColumn1, @JoinColumn2})*/
    @ManyToOne
    @JoinColumn(name = "address_id", referencedColumnName = "address_id")
    private AddressEntity addressEntity;
   /* @Column(name = "address_id")
    private Long addressId;*/

    @Column(name = "email")
    private String email;

    @Column(name = "store_id")
    private Long storeId;

    @Column(name = "active")
    private Boolean active;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "last_update", insertable = false)
    private LocalDateTime lastUpdate;

    @Column(name = "picture")
    private Byte[] picture;

    public StaffEntity(Long id, String firstName, AddressEntity addressEntity
            /*Long addressId*/, String email, Long storeId,
                       Boolean active, String username, String password,
                       LocalDateTime lastUpdate, Byte[] picture) {
        this.id = id;
        this.firstName = firstName;
        this.addressEntity = addressEntity;
        /* this.addressId = addressId;*/
        this.email = email;
        this.storeId = storeId;
        this.active = active;
        this.username = username;
        this.password = password;
        this.lastUpdate = lastUpdate;
        this.picture = picture;
    }
}
