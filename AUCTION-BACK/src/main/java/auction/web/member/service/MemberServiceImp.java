package auction.web.member.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import auction.web.member.model.Member;
import auction.web.member.repository.MemberRepository;

@Service
public class MemberServiceImp implements MemberService{

    private final MemberRepository memberRepository;

    @Autowired
    public MemberServiceImp(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public List<Member> findMembers() {
        return memberRepository.findAll();
    }

    @Override
    public Optional<Member> findOneById(Long memberId) {
        return memberRepository.findById(memberId);
    }

    @Override
    public Optional<Member> findOneByName(String memberName) {
        return memberRepository.findByName(memberName);
    }

    @Override
    public Member join(Member member) {
        return memberRepository.save(member);
    }
    
}
