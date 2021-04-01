package kr.scalar.api.dtl.repository;


import java.util.List;
import static kr.scalar.api.dtl.domain.QPlaceDetail.*;
import javax.persistence.EntityManager;

import kr.scalar.api.dtl.domain.PlaceDetail;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.stereotype.Repository;

import com.querydsl.jpa.impl.JPAQueryFactory;

@Repository
public class PlaceDetailRepositoryImpl extends QuerydslRepositorySupport implements IPlaceDetailRepository{

    //private final JPAQueryFactory qf;
    private EntityManager em;
    public PlaceDetailRepositoryImpl(EntityManager em) {
        super(PlaceDetail.class);
        //this.qf = qf;
        this.em = em;
    }
    @SuppressWarnings("unchecked")
    @Override
    public List<PlaceDetail> findByContentid(String contentid) {
        // return em.createNamedQuery("PlaceDetail.findByContentid").setParameter("contentid", contentid).getResultList();
        return null;
    }

}