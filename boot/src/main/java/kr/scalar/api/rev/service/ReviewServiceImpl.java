package kr.scalar.api.rev.service;

import java.util.List;
import java.util.Optional;

import kr.scalar.api.cmm.service.AbstractService;
import kr.scalar.api.rev.domain.Review;
import kr.scalar.api.rev.repository.ReviewRepository;
import org.springframework.stereotype.Service;


import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ReviewServiceImpl extends AbstractService<Review> implements ReviewService{
    private final ReviewRepository repo;

    @Override
    public String save(Review review) {return (repo.save(review) != null)? "SUCCESS": "FAILURE";}

    @Override
    public long delete(Review review) {repo.delete(review); return (getOne(review.getRevNum()) == null) ? 1 : 0;}

    @Override
    public long count() {return (long)repo.count();}

    @Override
    public Review getOne(long id) {return repo.getOne(id);}

    @Override
    public Optional<Review> findById(long id) {return repo.findById(id);}

    @Override
    public boolean existsById(long id) {return repo.existsById(id);}

    @Override
    public List<Review> findAll() {return repo.findAll();}
}
