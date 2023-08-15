package com.api.Loads.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Load {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long ShipperID;

    private String Loadingpoint;
    private String unLoadingpoint;
    private String productType;

    private String Trucktype;
    private String noOfTrucks;

    private String weight;

    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private LocalDate Date;
}
