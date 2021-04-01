package kr.scalar.api.crs.domain;
import kr.scalar.api.rcm.domain.Recommend;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity @Table(name="courses")
public class Course {
    @Id @Column(name="crs_num") @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long crsNum;
    @Column private String crsName;

    @OneToMany(mappedBy = "course")
    private List<Recommend> Recommends = new ArrayList<>();
}
