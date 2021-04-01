package kr.scalar.api.rev.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


import kr.scalar.api.pce.domain.Place;
import kr.scalar.api.rcm.domain.Recommend;
import kr.scalar.api.usr.domain.UserVo;
import lombok.Getter;

@Entity @Getter @Table(name = "reviews")
public class Review {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="rev_num")private long revNum;
    @Column(name="rev_name")private String revName;
    @Column(name="rev_star")private String revStar;
    @Column(name="rev_content")private String revContent;
    @Column(name="rev_date")private String revDate;

    @OneToMany(mappedBy= "review")
    private List<Recommend> recommends = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name="num")
    private UserVo user;

    @ManyToOne
    @JoinColumn(name="pce_num")
    private Place place;
}
