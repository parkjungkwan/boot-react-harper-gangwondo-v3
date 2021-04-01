package kr.scalar.api.svy.repository;

import kr.scalar.api.svy.domain.Survey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


interface ISurveyRepository {

}
@Repository
public interface SurveyRepository extends JpaRepository<Survey, Integer>,ISurveyRepository{
}
