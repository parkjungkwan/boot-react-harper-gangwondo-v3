package kr.scalar.api.dtl.domain;
import javax.persistence.*;


import kr.scalar.api.pce.domain.Place;
import lombok.Data;
import lombok.Getter;

@Entity @Getter @Data @Table(name="place_details")
public class PlaceDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="dtl_num") private long dtlNum;
    @Column(name="overview") private String overview;

    @OneToOne
    @JoinColumn(name="contentid")
    private Place place;
}
