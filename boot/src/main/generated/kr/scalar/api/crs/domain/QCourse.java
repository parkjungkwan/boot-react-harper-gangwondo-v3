package kr.scalar.api.crs.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCourse is a Querydsl query type for Course
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCourse extends EntityPathBase<Course> {

    private static final long serialVersionUID = 1046969836L;

    public static final QCourse course = new QCourse("course");

    public final StringPath crsName = createString("crsName");

    public final NumberPath<Long> crsNum = createNumber("crsNum", Long.class);

    public final ListPath<kr.scalar.api.rcm.domain.Recommend, kr.scalar.api.rcm.domain.QRecommend> Recommends = this.<kr.scalar.api.rcm.domain.Recommend, kr.scalar.api.rcm.domain.QRecommend>createList("Recommends", kr.scalar.api.rcm.domain.Recommend.class, kr.scalar.api.rcm.domain.QRecommend.class, PathInits.DIRECT2);

    public QCourse(String variable) {
        super(Course.class, forVariable(variable));
    }

    public QCourse(Path<? extends Course> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCourse(PathMetadata metadata) {
        super(Course.class, metadata);
    }

}

