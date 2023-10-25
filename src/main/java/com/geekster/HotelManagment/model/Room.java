package com.geekster.HotelManagment.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "OYO")//remane the table name
public class Room {
    @Id
    private Integer roomId;
    private Integer roomNumber;
    private Type roomType;
    @Column(name = "available")//rename the column name
    private boolean roomAvailable;
    private double roomPrice;
}
