package kr.scalar.api.pce.service;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import kr.scalar.api.cmm.service.AbstractService;
import kr.scalar.api.pce.domain.Place;
import kr.scalar.api.pce.domain.PlaceDto;
import kr.scalar.api.pce.repository.PlaceRepository;
import org.springframework.stereotype.Service;



import lombok.RequiredArgsConstructor;
@Service
@RequiredArgsConstructor
public class PlaceServiceImpl extends AbstractService<Place> implements PlaceService{
    private final PlaceRepository repo;

    @Override public String save(Place t) {
        return (repo.save(t) != null)? "SUCCESS": "FAILURE";
    }

    public long saveAll(List<Place> t) {
        return (repo.saveAll(t) !=null) ? 1 : 0;
    }
    @Override public long delete(Place t) {
        repo.delete(t);
        return (getOne(t.getContentid()) == null) ? 1 :0;
    }
    @Override public long count() {
        return (int) repo.count();
    }
    public Place getOne(long id) {
        return repo.getOne(id);
    }
    @Override public Optional<Place> findById(long id) {
        return repo.findById(id);
    }
    @Override public boolean existsById(long id) {
        return repo.existsById(id);
    }
    @Override public List<Place> findAll() {
        return repo.findAll();
    }
    @Override
    public int update(String tel, long contentid) {
        return repo.update(tel, contentid);
    }
    @Override
    public List<Place> findByContentidAndTitle(String contentid, String title) {
        return repo.findByContentidAndTitle(contentid, title);
    }

    @Override
    public List<Place> findByContenttypeid(String contenttypeid) {
        return repo.findAll()
                .stream()
                .filter(place -> place.getContenttypeid().equals(contenttypeid))
                .collect(Collectors.toList());
    }

    @Override
    public List<Place> findByContentid(long contentid) {
        return repo.findByContentid(contentid);
    }

    @Override
    public List<PlaceDto> findByList() {
        return repo.findByList();
    }


}
