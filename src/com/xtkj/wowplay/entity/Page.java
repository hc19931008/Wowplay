package com.xtkj.wowplay.entity;

public class Page {

	private int rows=10;			//每页显示的数量
	private int currentPage;	//当前页
	private int totalRecord;	//总记录
	private int totalPage;		//总页数
	private int start;			//起始位置
	private int end;			//结束位置
	private String sortColumn;		//排序字段
	private String sortWay;		//排序方式
	
	/**分页*/
	public Page splitPage(Page page){
		//设置总页数
		page.setTotalPage(page.getTotalRecord()/rows);
		if(page.getTotalRecord()%rows!=0){
			page.setTotalPage(page.getTotalRecord()/rows+1);
		}
		//设置当前页数
		if(page.getCurrentPage()<=0){
			page.setCurrentPage(1);
		}
		if(page.getCurrentPage()>page.getTotalPage()){
			page.setCurrentPage(page.getTotalPage());
		}
		return page;		
	}
	
	public Page() {
		
	}

	public Page(int rows, int currentPage, int totalRecord,
			int start, int end, String sortColumn, String sortWay) {
		super();
		this.rows = rows;
		this.currentPage = currentPage;
		this.totalRecord = totalRecord;
		this.start = start;
		this.end = end;
		this.sortColumn = sortColumn;
		this.sortWay = sortWay;
	}

	public int getRows() {
		return rows;
	}
	
	public void setRows(int rows) {
		this.rows = rows;
	}
	
	public int getCurrentPage() {
		return currentPage;
	}
	
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	
	public int getTotalRecord() {
		return totalRecord;
	}
	
	public void setTotalRecord(int totalRecord) {
		this.totalRecord = totalRecord;
	}
	
	public int getTotalPage() {
		return totalPage;
	}
	
	public void setTotalPage(int totalPage){
		this.totalPage = totalPage;
	}
	
	public int getStart() {
		return start;
	}
	
	public void setStart(int start) {
		this.start = start;
	}
	
	public int getEnd() {
		return end;
	}
	
	public void setEnd(int end) {
		this.end = end;
	}
	
	public String getSortColumn() {
		return sortColumn;
	}
	
	public void setSortColumn(String sortColumn) {
		this.sortColumn = sortColumn;
	}
	
	public String getSortWay() {
		return sortWay;
	}
	
	public void setSortWay(String sortWay) {
		this.sortWay = sortWay;
	}
}
