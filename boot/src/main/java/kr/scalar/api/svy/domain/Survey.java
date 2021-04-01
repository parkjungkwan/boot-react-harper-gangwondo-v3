package kr.scalar.api.svy.domain;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;


import kr.scalar.api.pce.domain.Place;
import kr.scalar.api.rcm.domain.Recommend;
import lombok.Getter;

@Entity @Getter @Table(name="surveys")
public class Survey {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id @Column(name="svy_num")
    private int svyNum;
    @Column
    private String gender;
    @Column(name="age")
    private String age;
    @Column
    private String season;
    @Column
    private String partner;
    @Column
    private String duration;
    @Column
    private String location;
    @Column
    private String theme1;
    @Column
    private String theme2;
    @Column
    private String theme3;

    @ManyToOne
    @JoinColumn(name="contentid")
    private Place place;

    @OneToMany(mappedBy = "survey",fetch = FetchType.EAGER)
    private List<Recommend> recommends = new ArrayList<>();
}
