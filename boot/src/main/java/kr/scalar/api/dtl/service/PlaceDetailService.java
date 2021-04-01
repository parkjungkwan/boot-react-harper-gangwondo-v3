package kr.scalar.api.dtl.service;

import kr.scalar.api.dtl.domain.PlaceDetail;

import java.util.List;

public interface PlaceDetailService {
    public List<PlaceDetail> findByContentid(String contentid);
}
