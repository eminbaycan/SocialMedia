package com.emin.ACSocialMedia.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Table(name = "tbltags")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Tags {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    String name;
    int count;
}
