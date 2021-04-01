package kr.scalar.api.rcm.domain;
import kr.scalar.api.crs.domain.Course;
import kr.scalar.api.rev.domain.Review;
import kr.scalar.api.svy.domain.Survey;

import javax.persistence.*;


@Entity @Table(name="recommends")
public class Recommend {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id @Column(name="rcm_num")
    private long rcmNum;

    @ManyToOne
    @JoinColumn(name="crs_num")
    private Course course;
    @ManyToOne
    @JoinColumn(name="svy_num")
    private Survey survey;
    @ManyToOne
    @JoinColumn(name="rev_num")
    private Review review;
}
