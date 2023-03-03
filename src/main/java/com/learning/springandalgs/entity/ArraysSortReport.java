package com.learning.springandalgs.entity;

import javax.persistence.*;

@Entity
@Table(name = "arrays_sort")
public class ArraysSortReport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
