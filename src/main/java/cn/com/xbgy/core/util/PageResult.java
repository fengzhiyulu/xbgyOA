package cn.com.xbgy.core.util;

import java.util.ArrayList;
import java.util.List;

public class PageResult {

	private int pageNo;
	private long totalCount;
	private int pageSize;
	private int totalPageCount;
	private List items;
	
	
	public PageResult(int pageNo, int pageSize, long totalCount, List items) {
		// 总记录数是0的情况下，页号应该为0
		if (totalCount == 0) {
			this.pageNo = 0;
		} else {
			this.totalCount = totalCount;
			this.pageNo = pageNo;
			this.pageSize = pageSize;

			// 7条记录，每页3条，共有3页
			int tem = (int)(totalCount / pageSize);
			this.totalPageCount = ((totalCount % pageSize == 0) ? tem: (tem + 1));
		}
		this.items = (items != null)?items: new ArrayList();
	}

	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	public long getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(long totalCount) {
		this.totalCount = totalCount;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getTotalPageCount() {
		return totalPageCount;
	}

	public void setTotalPageCount(int totalPageCount) {
		this.totalPageCount = totalPageCount;
	}

	public List getItems() {
		return items;
	}

	public void setItems(List items) {
		this.items = items;
	}

}
