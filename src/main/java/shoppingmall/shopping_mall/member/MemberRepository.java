package shoppingmall.shopping_mall.member;


import shoppingmall.shopping_mall.member.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member);

    Member findById(Long id);

    Optional<Member> findByLoginId(String loginId);

    List<Member> findAll();

    void clearStore();

}
