package dto;

import java.util.Date;

public class MyPage_QABoardDTO {
	private int q_id;
	private String mem_id;
	private int product_id;
	private int gender;
	private String q_passwd;
	private String q_title;
	private String q_content;
	private Date q_date;
	private int q_views;
	private String q_answer;
	
	private String kor_name;

	public int getQ_id() {
		return q_id;
	}

	public void setQ_id(int q_id) {
		this.q_id = q_id;
	}

	public String getMem_id() {
		return mem_id;
	}

	public void setMem_id(String mem_id) {
		this.mem_id = mem_id;
	}

	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	public String getQ_passwd() {
		return q_passwd;
	}

	public void setQ_passwd(String q_passwd) {
		this.q_passwd = q_passwd;
	}

	public String getQ_title() {
		return q_title;
	}

	public void setQ_title(String q_title) {
		this.q_title = q_title;
	}

	public String getQ_content() {
		return q_content;
	}

	public void setQ_content(String q_content) {
		this.q_content = q_content;
	}

	public Date getQ_date() {
		return q_date;
	}

	public void setQ_date(Date q_date) {
		this.q_date = q_date;
	}

	public int getQ_views() {
		return q_views;
	}

	public void setQ_views(int q_views) {
		this.q_views = q_views;
	}

	public String getQ_answer() {
		return q_answer;
	}

	public void setQ_answer(String q_answer) {
		this.q_answer = q_answer;
	}

	public String getKor_name() {
		return kor_name;
	}

	public void setKor_name(String kor_name) {
		this.kor_name = kor_name;
	}
	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "MyPage_QABoardDTO [q_id=" + q_id + ", mem_id=" + mem_id + ", product_id=" + product_id + ", gender="
				+ gender + ", q_passwd=" + q_passwd + ", q_title=" + q_title + ", q_content=" + q_content + ", q_date="
				+ q_date + ", q_views=" + q_views + ", q_answer=" + q_answer + ", kor_name=" + kor_name + "]";
	}

}
