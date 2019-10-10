 package com.data.table.client.constant;

public class GenericSearchCriteria {
	
	private Integer pageNumber;
	
	private String sortingColumn;
	
	private String sortingType;
	
	private Integer pageSize;
	
	private String searchString ;
	
	public Integer getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public String getSortingColumn() {
		return sortingColumn;
	}

	public void setSortingColumn(String sortingColumn) {
		this.sortingColumn = sortingColumn;
	}

	public String getSortingType() {
		return sortingType;
	}

	public void setSortingType(String sortingType) {
		this.sortingType = sortingType;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public String getSearchString() {
		return searchString;
	}

	public void setSearchString(String searchString) {
		this.searchString = searchString;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "GenericSearchCriteria [pageNumber=" + pageNumber + ", sortingColumn=" + sortingColumn + ", sortingType="
				+ sortingType + ", pageSize=" + pageSize + ", searchString=" + searchString + "]";
	}
	
	

}
