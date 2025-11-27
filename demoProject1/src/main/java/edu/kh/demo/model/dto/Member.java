package edu.kh.demo.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // getter + setter + toString
@NoArgsConstructor // 기본생성자
@AllArgsConstructor // 모든 필드 초기화용 매개변수생성자
public class Member { // DTO로서의 역할, DB와 소통(정보 DB에 보내고, DB에서 보낸 정보 담아오고)
	private String memberId;
	private String memberPw;
	private String memberName;
	private int memberAge;

}
