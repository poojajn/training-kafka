package com.traning.stratergy;

public class EWallet  implements Payment{

	private String email;
	private String password;
	private String walletName;
	protected String getEmail() {
		return email;
	}
	protected void setEmail(String email) {
		this.email = email;
	}
	protected String getPassword() {
		return password;
	}
	protected void setPassword(String password) {
		this.password = password;
	}
	protected String getWalletName() {
		return walletName;
	}
	protected void setWalletName(String walletName) {
		this.walletName = walletName;
	}
	public EWallet(String email, String password, String walletName) {
		super();
		this.email = email;
		this.password = password;
		this.walletName = walletName;
	}
	@Override
	public String toString() {
		return "EWallet [email=" + email + ", password=" + password + ", walletName=" + walletName + "]";
	}
	@Override
	public void pay(int amt) {
		if(walletName.equalsIgnoreCase("paytm")) {
			
		amt=(int)( amt-(amt*0.1));
		System.out.println("u r payment with Ewallet");
		}else
		{ System.out.println("paid amount through Ewallet");
		}
   }
}

