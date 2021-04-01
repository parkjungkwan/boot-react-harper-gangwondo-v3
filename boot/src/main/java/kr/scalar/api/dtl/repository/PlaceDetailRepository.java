package kr.scalar.api.dtl.repository;

import java.util.List;

import kr.scalar.api.dtl.domain.PlaceDetail;
import org.springframework.data.jpa.repository.JpaRepository;

interface IPlaceDetailRepository {
    public List<PlaceDetail> findByContentid(String contentid);
}
public interface PlaceDetailRepository extends JpaRepository<PlaceDetail, Long>, IPlaceDetailRepository {

}
