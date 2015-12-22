package com.TicketReservation.Model;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
public class UserDetails {
	private Date date1;
	    private int role;
        private String msg;
	    private int roleid=1;
		private int id;
		private String username;
		private String password;
	    private String email;
	    private String fname;
	    private String lname;
	    private String address;
	    private String contact;
	    private String createdby;
	    private String updatedby;
	    private String createddate;
	    private String updateddate;
	    
	    
		public Date getDate1() {
			return date1;
		}
		public void setDate1(Date date1) {
			this.date1 = date1;
		}
		public int getRole() {
			return role;
		}
		public void setRole(int role) {
			this.role = role;
		}
		public String getMsg() {
			return msg;
		}
		public void setMsg(String msg) {
			this.msg = msg;
		}
		public int getRoleid() {
			return roleid;
		}
		public void setRoleid(int roleid) {
			this.roleid = roleid;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getFname() {
			return fname;
		}
		public void setFname(String fname) {
			this.fname = fname;
		}
		public String getLname() {
			return lname;
		}
		public void setLname(String lname) {
			this.lname = lname;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getContact() {
			return contact;
		}
		public void setContact(String contact) {
			this.contact = contact;
		}
		public String getCreatedby() {
			return createdby;
		}
		public void setCreatedby(String createdby) {
			this.createdby = createdby;
		}
		public String getUpdatedby() {
			return updatedby;
		}
		public void setUpdatedby(String updatedby) {
			this.updatedby = updatedby;
		}
		public String getCreateddate() {
			return createddate;
		}
		public void setCreateddate(String createddate) {
			this.createddate = createddate;
		}
		public String getUpdateddate() {
			return updateddate;
		}
		public void setUpdateddate(String updateddate) {
			this.updateddate = updateddate;
		}
		Date today=Calendar.getInstance().getTime();
		SimpleDateFormat formatter=new SimpleDateFormat("yyyy-MM-dd-hh.mm.ss");
		private String Date=formatter.format(today);
		
		
		public String getDate() {
			return Date;
		}
		public void setDate(String date) {
			Date = date;
		}
		
		@Override
		public String toString() {
			
			return "Model [id=" + id + ", username=" + username + ", password="
					+ password + ", email=" + email + ", fname=" + fname
					+ ", lname=" + lname + ", address=" + address + ", contact="
					+ contact + ", createdby=" + createdby + ", updatedby="
					+ updatedby + ", createddate=" + createddate + ", updateddate="
					+ updateddate + "]";
		}
	    

	


}
