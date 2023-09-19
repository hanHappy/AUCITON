package auction.web.member.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import auction.web.member.model.Member;

public interface MemberRepository extends JpaRepository<Member, Long> {

    // public Optional<Member> findByName(@Param("name") String memberName);
    public Optional<Member> findByName(String memberName);
}
