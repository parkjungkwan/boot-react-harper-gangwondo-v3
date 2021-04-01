package kr.scalar.api.usr.repository;
import kr.scalar.api.usr.domain.UserVo;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepositoryImpl  extends QuerydslRepositorySupport
        implements IUserRepository {
    public UserRepositoryImpl() {
        super(UserVo.class);
        // this.qf = qf;
    }
}
