package kr.scalar.api.pce.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QPlace is a Querydsl query type for Place
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QPlace extends EntityPathBase<Place> {

    private static final long serialVersionUID = -928988952L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QPlace place = new QPlace("place");

    public final StringPath addr1 = createString("addr1");

    public final StringPath addr2 = createString("addr2");

    public final StringPath areacode = createString("areacode");

    public final StringPath cat1 = createString("cat1");

    public final StringPath cat2 = createString("cat2");

    public final StringPath cat3 = createString("cat3");

    public final NumberPath<Long> contentid = createNumber("contentid", Long.class);

    public final StringPath contenttypeid = createString("contenttypeid");

    public final StringPath createdtime = createString("createdtime");

    public final kr.scalar.api.dtl.domain.QPlaceDetail detail;

    public final StringPath firstimage = createString("firstimage");

    public final StringPath firstimage2 = createString("firstimage2");

    public final StringPath mapx = createString("mapx");

    public final StringPath mapy = createString("mapy");

    public final StringPath mlevel = createString("mlevel");

    public final StringPath modifiedtime = createString("modifiedtime");

    public final StringPath readcount = createString("readcount");

    public final StringPath sigungucode = createString("sigungucode");

    public final StringPath tel = createString("tel");

    public final StringPath title = createString("title");

    public final StringPath zipcode = createString("zipcode");

    public QPlace(String variable) {
        this(Place.class, forVariable(variable), INITS);
    }

    public QPlace(Path<? extends Place> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QPlace(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QPlace(PathMetadata metadata, PathInits inits) {
        this(Place.class, metadata, inits);
    }

    public QPlace(Class<? extends Place> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.detail = inits.isInitialized("detail") ? new kr.scalar.api.dtl.domain.QPlaceDetail(forProperty("detail"), inits.get("detail")) : null;
    }

}

