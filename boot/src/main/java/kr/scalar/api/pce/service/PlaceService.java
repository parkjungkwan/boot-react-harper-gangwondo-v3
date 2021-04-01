package kr.scalar.api.pce.service;

import kr.scalar.api.pce.domain.Place;
import kr.scalar.api.pce.domain.PlaceDto;

import java.util.List;



public interface PlaceService{
    public List<Place> findByContentidAndTitle(String contentid, String title);
    public List<Place> findByContenttypeid(String contenttypeid);
    public int update(String tel, long pceNum);
    public List<Place> findByContentid(long contentid);
    public List<PlaceDto> findByList();

}