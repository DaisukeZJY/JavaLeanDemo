package com.Object.extend;

public class User {
	public int ensure;
	public void addSure(int money) {
		this.ensure  += money * 2;
	}
	
	
	public static void main(String[] args) {
		User user = new User();
		user.addSure(1);
		System.out.println("user:"+user.ensure);
		
		VipUser vipUser = new VipUser();
		vipUser.addSure2(1);
		System.out.println("vip:"+vipUser.ensure);
	}
}
