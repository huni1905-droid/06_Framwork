package edu.kh.project.myPage.model.mapper;

import org.apache.ibatis.annotations.Mapper;

import edu.kh.project.member.model.dto.Member;

@Mapper
public interface MyPageMapper {

	/** 회원 정보 수정 SQL
	 * @param inputMember
	 * @return
	 */
	int updateInfo(Member inputMember);

	/** 회원 비밀번호 수정 SQL
	 * @param newPw
	 * @return
	 */
	int changePassword(String newPw);

}
