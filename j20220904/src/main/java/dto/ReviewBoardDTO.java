package dto;

import java.sql.Date;

public class ReviewBoardDTO {
	private int rb_id;
	private String mem_id;
	private int product_id;
	
	private int rb_total;
	private int rb_color;
	private int rb_size;
	private int rb_wide;
	private int rb_instep;
	private String rb_title;
	private String rb_content;
	private String rb_img;
	private Date rb_date;
	private int rb_views;
	
	public int getRb_id() {
		return rb_id;
	}
	public void setRb_id(int rb_id) {
		this.rb_id = rb_id;
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
	public int getRb_total() {
		return rb_total;
	}
	public void setRb_total(int rb_total) {
		this.rb_total = rb_total;
	}
	public int getRb_color() {
		return rb_color;
	}
	public void setRb_color(int rb_color) {
		this.rb_color = rb_color;
	}
	public int getRb_size() {
		return rb_size;
	}
	public void setRb_size(int rb_size) {
		this.rb_size = rb_size;
	}
	public int getRb_wide() {
		return rb_wide;
	}
	public void setRb_wide(int rb_wide) {
		this.rb_wide = rb_wide;
	}
	public int getRb_instep() {
		return rb_instep;
	}
	public void setRb_instep(int rb_instep) {
		this.rb_instep = rb_instep;
	}
	public String getRb_title() {
		return rb_title;
	}
	public void setRb_title(String rb_title) {
		this.rb_title = rb_title;
	}
	public String getRb_content() {
		return rb_content;
	}
	public void setRb_content(String rb_content) {
		this.rb_content = rb_content;
	}
	public String getRb_img() {
		return rb_img;
	}
	public void setRb_img(String rb_img) {
		this.rb_img = rb_img;
	}
	public Date getRb_date() {
		return rb_date;
	}
	public void setRb_date(Date rb_date) {
		this.rb_date = rb_date;
	}
	public int getRb_views() {
		return rb_views;
	}
	public void setRb_views(int rb_views) {
		this.rb_views = rb_views;
	}
	
	
}