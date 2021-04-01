package kr.scalar.api.rev.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QReview is a Querydsl query type for Review
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QReview extends EntityPathBase<Review> {

    private static final long serialVersionUID = -1433300568L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QReview review = new QReview("review");

    public final kr.scalar.api.pce.domain.QPlace place;

    public final ListPath<kr.scalar.api.rcm.domain.Recommend, kr.scalar.api.rcm.domain.QRecommend> recommends = this.<kr.scalar.api.rcm.domain.Recommend, kr.scalar.api.rcm.domain.QRecommend>createList("recommends", kr.scalar.api.rcm.domain.Recommend.class, kr.scalar.api.rcm.domain.QRecommend.class, PathInits.DIRECT2);

    public final StringPath revContent = createString("revContent");

    public final StringPath revDate = createString("revDate");

    public final StringPath revName = createString("revName");

    public final NumberPath<Long> revNum = createNumber("revNum", Long.class);

    public final StringPath revStar = createString("revStar");

    public final kr.scalar.api.usr.domain.QUserVo user;

    public QReview(String variable) {
        this(Review.class, forVariable(variable), INITS);
    }

    public QReview(Path<? extends Review> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QReview(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QReview(PathMetadata metadata, PathInits inits) {
        this(Review.class, metadata, inits);
    }

    public QReview(Class<? extends Review> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.place = inits.isInitialized("place") ? new kr.scalar.api.pce.domain.QPlace(forProperty("place"), inits.get("place")) : null;
        this.user = inits.isInitialized("user") ? new kr.scalar.api.usr.domain.QUserVo(forProperty("user")) : null;
    }

}

