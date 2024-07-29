package com.youthLab.cheerupDemo.domain;


import com.youthlab.cheerup.domain.enums.MemberGender;
import com.youthlab.cheerup.domain.enums.MemberRank;
import com.youthlab.cheerup.domain.enums.MemberStatus;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Getter
@Builder
public class Member extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String nickName;

    private String password;

    private String email;

    private LocalDate birth;

    private Integer point;

    private String phone;

    private Long exp;

    // 비활성화 날짜 기반 데이터 정리를 위해 추가
    private LocalDate inactiveDate;

    @Enumerated(EnumType.STRING)
    private MemberGender gender;

    @Enumerated(EnumType.STRING)
    private MemberRank rank;

    // 데이터베이스에 숫자로 안들어가고 enum을 통해 들어갈 예정
    @Enumerated(EnumType.STRING)
    private MemberStatus status;

}
