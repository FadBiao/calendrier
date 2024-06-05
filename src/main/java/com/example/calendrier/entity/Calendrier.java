package com.example.calendrier.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "calendrier")
@Data
public class Calendrier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "sport_id", nullable = false)
    private Integer sportId;

    @Column(name = "date", nullable = false)
    private Date date;

    @Column(name = "site_id", nullable =false)
    private Integer sitesId;


}
