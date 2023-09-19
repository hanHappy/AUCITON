package auction.web.member.service;

import java.util.List;
import java.util.Optional;

import auction.web.member.model.Member;

public interface MemberService {
    
    // 조회
    List<Member> findMembers();
    Optional<Member> findOneById(Long memberId);
    Optional<Member> findOneByName(String memberName);

    // 회원 가입
    Member join(Member member);

}