package kr.scalar.api.rcm.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QRecommend is a Querydsl query type for Recommend
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QRecommend extends EntityPathBase<Recommend> {

    private static final long serialVersionUID = -618406445L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QRecommend recommend = new QRecommend("recommend");

    public final kr.scalar.api.crs.domain.QCourse course;

    public final NumberPath<Long> rcmNum = createNumber("rcmNum", Long.class);

    public final kr.scalar.api.rev.domain.QReview review;

    public final kr.scalar.api.svy.domain.QSurvey survey;

    public QRecommend(String variable) {
        this(Recommend.class, forVariable(variable), INITS);
    }

    public QRecommend(Path<? extends Recommend> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QRecommend(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QRecommend(PathMetadata metadata, PathInits inits) {
        this(Recommend.class, metadata, inits);
    }

    public QRecommend(Class<? extends Recommend> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.course = inits.isInitialized("course") ? new kr.scalar.api.crs.domain.QCourse(forProperty("course")) : null;
        this.review = inits.isInitialized("review") ? new kr.scalar.api.rev.domain.QReview(forProperty("review"), inits.get("review")) : null;
        this.survey = inits.isInitialized("survey") ? new kr.scalar.api.svy.domain.QSurvey(forProperty("survey"), inits.get("survey")) : null;
    }

}

