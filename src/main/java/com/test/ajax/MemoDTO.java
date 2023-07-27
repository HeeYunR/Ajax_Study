package com.test.ajax;

import lombok.Data;

//lombok의 라이브러리의 장점
//코드 자동생성 + 코드 축소

//@Setter - 말그대로 getter
//@Getter - 말그대로 setter
//@ToString - 말그대로 tostring
@Data //@ToString + @Getter + @Setter + @EqualsAndHashCode + @RequiredArgsConstructor
public class MemoDTO {
	
	private String seq;
	private String memo;
	private String regdate;
	private String cseq;
	
	private String icon;
	private String color;
	
}








