package auction.web.repository;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import auction.web.member.model.Member;
import auction.web.member.repository.MemberRepository;

@DataJpaTest
public class MemberRepositoryTest {
    @Autowired
    MemberRepository memberRepository;

    @Test
    public void 회원가입(){
        Member member = Member.builder()
                                .id(1L)
                                .roleId(1L)
                                .email("hansmin95@gmail.com")
                                .password("dlstnehowl1")
                                .name("상민")
                                .build();

        memberRepository.save(member);

        Member newMember = memberRepository.findByName("상민").get();

        Assertions.assertThat(newMember.getName()).isEqualTo(newMember.getName());
    }
}
