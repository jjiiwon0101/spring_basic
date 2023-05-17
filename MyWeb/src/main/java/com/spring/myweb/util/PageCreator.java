package com.spring.myweb.util;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class PageCreator {

	private PageVO paging;
	
	private int articleTotalCount, endPage, beginPage;
	private boolean prev, next;
	
	private final int buttonNum = 5;
	
	public PageCreator(PageVO paging, int articleTotalCount ) {
		this.paging = paging;
		this.articleTotalCount = articleTotalCount;
		calcDataOfPage();
	} //이러한 형식으로만 작성하도록 강제함. 기본 생성자 안 꺼냄.
	
	private void calcDataOfPage() {
		
		endPage = (int) (Math.ceil(paging.getPageNum() /(double) buttonNum) * buttonNum);
		
		beginPage = endPage - buttonNum + 1;
		
		prev = (beginPage == 1) ? false : true;
		
		next = articleTotalCount <= (endPage * paging.getCpp()) ? false : true;
		
		if(!next) {
			endPage = (int) Math.ceil(articleTotalCount / (double)paging.getCpp());
		}
	}
}
