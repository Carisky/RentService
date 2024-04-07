package com.org.cariski.rentservice.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.org.cariski.rentservice.model.LandLord;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Getter
@Setter
@Table(name = "Apartments")
public class Apartment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "address", length = 255)
    private String address;

    @Column(name = "number_of_rooms")
    private Integer numberOfRooms;

    @Column(name = "rent_cost", precision = 10, scale = 2)
    private BigDecimal rentCost;

    @ManyToOne
    @JoinColumn(name = "landlord_id")
    @JsonIgnore
    private LandLord landlord;
}
