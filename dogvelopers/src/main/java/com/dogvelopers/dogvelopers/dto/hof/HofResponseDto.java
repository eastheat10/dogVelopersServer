package com.dogvelopers.dogvelopers.dto.hof;

import com.dogvelopers.dogvelopers.entity.Hof;
import com.dogvelopers.dogvelopers.entity.Member;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class HofResponseDto {

    private Long id;
    private Member member;
    private String company;
    private String introduction;

    public HofResponseDto(Hof hof){
        this.id = hof.getId();
        this.member = hof.getMember();
        this.company = hof.getCompany();
        this.introduction = hof.getIntroduction();
    }
}
