package kr.or.member;

import kr.or.member.MemberVO;

public class MemberService {
	public void printMember(MemberVO[] members) {
		//서비스 구현메서드 내용(아래) 향상된 for 반복문사용
			int cnt=0;
			for(MemberVO member:members) {//members여러 레코드중 1개의 레코드를 member오브젝트 객체로 대입
				cnt = cnt + 1;
				System.out.println(cnt + " 번째 레코드는" + member.toString());
			}
			//데이터를 가공한다.(아래)
			//위처럼 데이터Select가져오기, insert 입력하기, update수정하기
			//delete삭제하기=> CRUD를 구현하는 내용
		}
	}
