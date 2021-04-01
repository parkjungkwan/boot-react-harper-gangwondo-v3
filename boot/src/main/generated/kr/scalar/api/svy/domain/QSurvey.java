package kr.scalar.api.svy.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QSurvey is a Querydsl query type for Survey
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QSurvey extends EntityPathBase<Survey> {

    private static final long serialVersionUID = 101849661L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QSurvey survey = new QSurvey("survey");

    public final StringPath age = createString("age");

    public final StringPath duration = createString("duration");

    public final StringPath gender = createString("gender");

    public final StringPath location = createString("location");

    public final StringPath partner = createString("partner");

    public final kr.scalar.api.pce.domain.QPlace place;

    public final ListPath<kr.scalar.api.rcm.domain.Recommend, kr.scalar.api.rcm.domain.QRecommend> recommends = this.<kr.scalar.api.rcm.domain.Recommend, kr.scalar.api.rcm.domain.QRecommend>createList("recommends", kr.scalar.api.rcm.domain.Recommend.class, kr.scalar.api.rcm.domain.QRecommend.class, PathInits.DIRECT2);

    public final StringPath season = createString("season");

    public final NumberPath<Integer> svyNum = createNumber("svyNum", Integer.class);

    public final StringPath theme1 = createString("theme1");

    public final StringPath theme2 = createString("theme2");

    public final StringPath theme3 = createString("theme3");

    public QSurvey(String variable) {
        this(Survey.class, forVariable(variable), INITS);
    }

    public QSurvey(Path<? extends Survey> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QSurvey(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QSurvey(PathMetadata metadata, PathInits inits) {
        this(Survey.class, metadata, inits);
    }

    public QSurvey(Class<? extends Survey> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.place = inits.isInitialized("place") ? new kr.scalar.api.pce.domain.QPlace(forProperty("place"), inits.get("place")) : null;
    }

}

