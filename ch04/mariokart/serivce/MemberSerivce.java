package ch04.mariokart.serivce;

import java.util.Scanner;

import javax.lang.model.element.NestingKind;

import ch04.mariokart.dto.MemberDTO;

public class MemberSerivce {

	public MemberDTO menu(Scanner input, 
			MemberDTO[] memberDTOs, MemberDTO loginState) {
		//회원관리
		
		System.out.println("=====회원관리 메뉴에 진입하셨습니다.=====");
		boolean subrun = true ;
		while (subrun) {
			
			System.out.println("1. 가입 | 2. 로그인 | 3. 수정 | 4. 삭제 | 5. 종료");
			System.out.print(">>>");
			String select = input.next();
			
			switch(select) {
			case "1" :
				System.out.println("계정을 생성합니다.");
				create(input, memberDTOs);
				break;
			
			case "2" :
				System.out.println("로그인 합니다.");
				loginState = login(input, memberDTOs, loginState);
				break;
				
			case "3" :
				System.out.println("계정을 수정합니다.");
				modify(input, memberDTOs, loginState);
				break;
				
			case "4" :
				System.out.println("계정을 삭제합니다.");
				delete(input, memberDTOs, loginState);
				break;
				
			case "5" :
				System.out.println("회원관리메뉴를 종료합니다.");
				System.out.println("메인메뉴로 복귀합니다.");
				subrun = false;
				break;
				
			case "99" :
				System.out.println("히든메뉴로 진입하였습니다.");
				System.out.println("캐릭터 해킹을 진행합니다.");
				break;
				
			default : 
				System.out.println("1~5사이 값만 허용합니다.");
				break;
				
				
			}//switch종료
			
			
		}//while 종료
		
		
		return loginState ;
	}

	private void delete(Scanner input, MemberDTO[] memberDTOs, MemberDTO loginState) {
		// 회원 삭제 메서드
		
		System.out.println("삭제할 회원 id와 pw를 입력헤주세요.");
		System.out.print("id : ");
		String id = input.next();
		
		System.out.print("pw : ");
		String pw = input.next();
		
		MemberDTO deleteMember = new MemberDTO();
		
		deleteMember.id = id ;
		deleteMember.pw = pw ;
		
		for(int i = 0; i < memberDTOs.length; i++) {
			
			if(loginState.id.equals(deleteMember.id) &&//id, pw일치 확인if문
				loginState.pw.equals(deleteMember.pw) && 
				memberDTOs[i] != null) {
					memberDTOs[i] = null;
					System.out.println("계정을 삭제하였습니다.");
					break;
					
					
			}else {
				System.out.println("일치하는 정보가 없습니다.");
				System.out.println("id, pw를 확인해주세요.");
				break;
			}//if문 종료
		}//for문 종료
		
		
	}// 회원삭제 메서드종료

	public void modify(Scanner input, MemberDTO[] memberDTOs, MemberDTO loginState) {
		// 회원 수정 메서드
		
		System.out.println("id를 입력하세요");
		System.out.print(">>");
		String id = input.next();
		
		System.out.println("pw를 입력하세요");
		System.out.print(">>");
		String pw = input.next();
		
		MemberDTO modifyMember = new MemberDTO();
		
		modifyMember.id = id ;
		modifyMember.pw = pw ;
		
		if(loginState.id.equals(modifyMember.id) &&
			loginState.pw.equals(modifyMember.pw)) {
			//키보드로 입력한 id와 로그인id 비교 if문
			System.out.println("변경할 pw를 입력하세요.");
			System.out.print(">>");
			loginState.pw = input.next();
		}
		System.out.println("pw가 정상적으로 변경되었습니다.");
		
		
		
		
	}// 회원계정 수정 메서드 종료

	public MemberDTO login(Scanner input, MemberDTO[] memberDTOs,
			MemberDTO loginState) {
		// 로그인 메서드
		
		System.out.println("id를 입력하세요.");
		System.out.print(">>");
		String id = input.next();
		
		System.out.println("pw를 입력하세요.");
		System.out.print(">>");
		String pw = input.next();
		// 키보드로 입력 -> 빈객체생성 -> 삽입
		MemberDTO loginMember = new MemberDTO();
		loginMember.id = id ;
		loginMember.pw = pw ;
		
		for (int i = 0; i < memberDTOs.length; i++) {//id,pw일치 확인 메서드
			if (memberDTOs[i] != null && memberDTOs[i].id.equals(loginMember.id)
					&& memberDTOs[i].pw.equals(loginMember.pw)) {
				System.out.println("로그인 성공 !");
				loginState = memberDTOs[i]; // 배열에 있는 정보가 login상태 객체에 삽입
				break;
			}else {
				System.out.println("로그인에 실패했습니다.");
				System.out.println("id, pw를 확인해주세요.");
				break;
			}//if문 종료
			
		}//for문 종료
		
		return loginState ;
	}// 로그인 메서드 종료

	public void create(Scanner input, MemberDTO[] memberDTOs) {
		// 회원가입 메서드
		System.out.println("회원가입용 메서드에 오신걸 환영합니다.");
		MemberDTO memberDTO = new MemberDTO(); // 빈 객체 생성
		
		System.out.println("사용할 id를 입력하세요.");
		System.out.print(">>");
		memberDTO.id = input.next();
		
		System.out.println("사용할 pw를 입력하세요.");
		System.out.print(">>");
		memberDTO.pw = input.next();
		
		System.out.println("사용할 닉네임 입력하세요.");
		System.out.print(">>");
		memberDTO.nickName = input.next();
		
		System.out.println("사용할 이메일 입력하세요.");
		System.out.print(">>");
		memberDTO.email = input.next();
		// 빈 객체에 필드값 입력 완료
		
		for(int i = 0; i < memberDTOs.length; i++) {
			if(memberDTOs[i] == null) { // null 이면 값이 없음
				memberDTOs[i] = memberDTO;
				break;
			}
		}//for 종료
		
		System.out.println(memberDTO.nickName + "님 회원가입을 축하드립니다.");
		
	}//회원가입 메서드 종료

}//클래스 종료
