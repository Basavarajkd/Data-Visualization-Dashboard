package com.visualization.dashboard.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@lombok.Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "data")

public class Data {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "end_year")
    private int endyear;
    @Column(name="citylng")
    private double citylng;
    @Column(name="citylat")
    private double citylat;
    @Column(name="intensity")
    private int intensity;
    @Column(name="sector")
    private String sector;
    @Column(name="topic")
    private String topic;
    @Column(name="insight")
    private String insight;
    @Column(name="swot")
    private String swot;

    private String url;
    @Column(name="region")
    private String region;
    @Column(name = "start_year")
    private int startyear;
    @Column(name="impact")
    private int impact;


    @JsonFormat(pattern = "yyyy-MM-dd",shape = JsonFormat.Shape.STRING)
    @Column(name = "added")
    private String added;
    @JsonFormat(pattern = "yyyy-MM-dd",shape = JsonFormat.Shape.STRING)
    @Column(name = "published")
    private String published;
    @Column(name="city")
    private String city;
    @Column(name="country")
    private String country;
    @Column(name="relevance")
    private int relevance;
    @Column(name="pestle")
    private String pestle;
    @Column(name="source")
    private String source;
    @Column(name="title")
    private String title;
    @Column(name="likelihood")
    private int likelihood;
}
