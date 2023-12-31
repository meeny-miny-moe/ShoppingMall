package shoppingmall.shopping_mall.web.validation.login;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import shoppingmall.shopping_mall.member.Member;
import shoppingmall.shopping_mall.member.MemberRepository;

@Service
@RequiredArgsConstructor
public class LoginService {
    private final MemberRepository memberRepository;
    /**
     * @return null 로그인 실패
     */
    public Member login(String longinId, String password){
        return memberRepository.findByLoginId(longinId)
                .filter(m -> m.getPassword().equals(password))
                .orElse(null);
    }
}
