package kr.scalar.api.usr.repository;
import java.util.List;
import java.util.Optional;

import kr.scalar.api.usr.domain.UserVo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

interface IUserRepository {

}
public interface UserRepository extends JpaRepository<UserVo, Long>, IUserRepository{
    Optional<UserVo> findByProviderAndProviderId(String provider, String providerId);
    Optional<UserVo> findByProviderIdOrEmail(String ProviderId, String Email);
    Optional<UserVo> findByNum(Long num);
    boolean existsByProviderId(String providerId);
    boolean existsByEmail(String email);
    boolean existsByUsername(String username);
    UserVo findByUsername(String username);
    @Transactional
    void deleteByUsername(String username);
}
