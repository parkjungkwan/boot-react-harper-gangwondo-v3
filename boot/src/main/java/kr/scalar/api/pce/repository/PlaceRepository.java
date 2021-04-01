package kr.scalar.api.pce.repository;

import java.util.List;

import kr.scalar.api.pce.domain.Place;
import kr.scalar.api.pce.domain.PlaceDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


interface IPlaceRepository {
    public List<Place> findByTitle(String title);
    public List<Place> findByContentid(long contentid);
    public List<PlaceDto> findByList();
}
public interface PlaceRepository extends JpaRepository<Place, Long>, IPlaceRepository {
    @Query(value="update place p set p.tel = :tel "
            + " where p.pce_num = :pceNum", nativeQuery = true)
    public int update(@Param("tel") String tel, @Param("pceNum") long pceNum);
    public List<Place> findByContentidAndTitle(String contentid, String title);
    public List<Place> findByContenttypeid(String contenttypeid);

}
