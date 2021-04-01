package kr.scalar.api.dtl.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QPlaceDetail is a Querydsl query type for PlaceDetail
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QPlaceDetail extends EntityPathBase<PlaceDetail> {

    private static final long serialVersionUID = -992615921L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QPlaceDetail placeDetail = new QPlaceDetail("placeDetail");

    public final NumberPath<Long> dtlNum = createNumber("dtlNum", Long.class);

    public final StringPath overview = createString("overview");

    public final kr.scalar.api.pce.domain.QPlace place;

    public QPlaceDetail(String variable) {
        this(PlaceDetail.class, forVariable(variable), INITS);
    }

    public QPlaceDetail(Path<? extends PlaceDetail> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QPlaceDetail(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QPlaceDetail(PathMetadata metadata, PathInits inits) {
        this(PlaceDetail.class, metadata, inits);
    }

    public QPlaceDetail(Class<? extends PlaceDetail> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.place = inits.isInitialized("place") ? new kr.scalar.api.pce.domain.QPlace(forProperty("place"), inits.get("place")) : null;
    }

}

