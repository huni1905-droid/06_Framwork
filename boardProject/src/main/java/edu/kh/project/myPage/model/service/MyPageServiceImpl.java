package edu.kh.project.myPage.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.kh.project.member.model.dto.Member;
import edu.kh.project.myPage.model.mapper.MyPageMapper;
import lombok.extern.slf4j.Slf4j;

@Service
@Transactional(rollbackFor = Exception.class)
@Slf4j
public class MyPageServiceImpl implements MyPageService {

	@Autowired
	private MyPageMapper mapper;

	@Autowired
	private BCryptPasswordEncoder bcrypt;

	// 회원 정보 수정
	@Override
	public int updateInfo(Member inputMember, String[] memberAddress) {

		// 입력된 주소가 있을 경우
		// A^^^B^^^C 형태로 가공

		// 주소가 입력되었을 때
		if (!inputMember.getMemberAddress().equals(",,")) {
			String address = String.join("^^^", memberAddress);
			inputMember.setMemberAddress(address);

		} else {
			// 주소가 입력되지 않았을 때
			inputMember.setMemberAddress(null);
		}

		// inputMember: 수정 닉네임, 수정 전화번호, 수정 주소,
		// 회원 번호

		return mapper.updateInfo(inputMember);
	}

	
	
	
	@Override
	public int changePassword(Member loginMember, String currentPw, String newPw, String newPwConfirm) {
		// 기존 비밀번호가 일치하지 않으면
		/*
		if(!bcrypt.matches(currentPw, loginMember.getMemberPw())) { 
			return 0;
		*/
		
		if(!loginMember.getMemberPw().equals(currentPw)) {
			return 0;
			
		// 새비밀번호와 비밀번호 확인이 일치하지 않는 경우	
		} else if (newPw != newPwConfirm)  {
			return 0;
			
		} else {
			return mapper.changePassword(newPw);
		}
			
			
		
		
		
		
		/*
		// 로그인한 회원 정보에서 비밀번호 제거
		loginMember.setMemberPw(null);
		return 0;
		 */
	}
	

	

}
