package dao.guest;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
/*
VO(Value Object),DTO(Data Transfer Object)
	- guest 테이블 1개 row의 데이타의 값을 가지는객체
	- guest 테이블 1개 row의 데이타값을 이동(파라메타,리턴데이타)시키기위한객체 
	- guest 테이블의 컬럼과 동일한수의 멤버변수를가지는객체
*/
/*
이름             널?       유형             
-------------- -------- -------------- 
GUEST_NO       NOT NULL NUMBER(10)     
GUEST_NAME              VARCHAR2(50)   
GUEST_DATE              DATE           
GUEST_EMAIL             VARCHAR2(50)   
GUEST_HOMEPAGE          VARCHAR2(50)   
GUEST_TITLE             VARCHAR2(100)  
GUEST_CONTENT           VARCHAR2(4000) 
*/
public class Guest {
	private int guestNo;
	private String guestName;
	private Date guestDate;
	private String guestEmail;
	private String guestHomepage;
	private String guestTitle;
	private String guestContent;
	@Override
	public String toString() {
		return "Guest [guestNo=" + guestNo + ", guestName=" + guestName + ", guestDate=" + guestDate + ", guestEmail="
				+ guestEmail + ", guestHomepage=" + guestHomepage + ", guestTitle=" + guestTitle + ", guestContent="
				+ guestContent + "]\n";
	}
}
