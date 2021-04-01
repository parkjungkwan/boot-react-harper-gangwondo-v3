package kr.scalar.api.usr.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QUserVo is a Querydsl query type for UserVo
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QUserVo extends EntityPathBase<UserVo> {

    private static final long serialVersionUID = -1862804123L;

    public static final QUserVo userVo = new QUserVo("userVo");

    public final StringPath age = createString("age");

    public final DateTimePath<java.sql.Timestamp> createDate = createDateTime("createDate", java.sql.Timestamp.class);

    public final StringPath email = createString("email");

    public final StringPath gender = createString("gender");

    public final NumberPath<Long> num = createNumber("num", Long.class);

    public final StringPath password = createString("password");

    public final StringPath provider = createString("provider");

    public final StringPath providerId = createString("providerId");

    public final ListPath<kr.scalar.api.rev.domain.Review, kr.scalar.api.rev.domain.QReview> reviews = this.<kr.scalar.api.rev.domain.Review, kr.scalar.api.rev.domain.QReview>createList("reviews", kr.scalar.api.rev.domain.Review.class, kr.scalar.api.rev.domain.QReview.class, PathInits.DIRECT2);

    public final StringPath role = createString("role");

    public final ListPath<Role, EnumPath<Role>> roles = this.<Role, EnumPath<Role>>createList("roles", Role.class, EnumPath.class, PathInits.DIRECT2);

    public final StringPath username = createString("username");

    public QUserVo(String variable) {
        super(UserVo.class, forVariable(variable));
    }

    public QUserVo(Path<? extends UserVo> path) {
        super(path.getType(), path.getMetadata());
    }

    public QUserVo(PathMetadata metadata) {
        super(UserVo.class, metadata);
    }

}

