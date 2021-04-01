package kr.scalar.api.rev.repository;
import java.util.List;

import javax.persistence.EntityManager;
import static kr.scalar.api.rev.domain.QReview.*;

import kr.scalar.api.rev.domain.Review;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.stereotype.Repository;


@Repository
public class ReviewRepositoryImpl extends QuerydslRepositorySupport implements ReviewCustomRepository{
    private final EntityManager em;
    public ReviewRepositoryImpl(EntityManager em) {
        super(Review.class);
        this.em = em;
    }
    @SuppressWarnings("unchecked")
    @Override
    public List<Review> findByRevName(String revName) {
       /* return em.createQuery("select b from reviews b where b.rev_name like :revName")
                .setParameter("revName", revName)
                .getResultList(); */
        return null;
    }
}
