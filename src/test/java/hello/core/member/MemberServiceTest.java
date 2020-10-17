package hello.core.member;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class MemberServiceTest {

    MemberService memberService = new MemberServiceImpl();

    @Test
    public void join() {
        //givne
        Member member = new Member(1L, "memberA", Grade.VIP);

        //when
        memberService.join(member);
        Member findMember = memberService.findMember(1L);

        //then
        Assertions.assertThat(member).isEqualTo(findMember);
    }
}
