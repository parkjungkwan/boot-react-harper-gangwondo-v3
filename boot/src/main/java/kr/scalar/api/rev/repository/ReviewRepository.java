package kr.scalar.api.rev.repository;

import java.util.List;

import kr.scalar.api.rev.domain.Review;
import org.springframework.data.jpa.repository.JpaRepository;


interface ReviewCustomRepository{
    public List<Review> findByRevName(String revName);
}

public interface ReviewRepository extends JpaRepository<Review, Long>, ReviewCustomRepository {

}

