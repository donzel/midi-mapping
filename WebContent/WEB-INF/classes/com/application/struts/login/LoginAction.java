package com.application.struts.login;

import com.opensymphony.xwork2.ActionSupport;

public  class LoginAction extends ActionSupport {

	public String execute() throws Exception {

		if(!getIdentifiant().equals("admin") || !getPassword().equals("admin")){
			 return ERROR;
		}else{
			return SUCCESS;
		}
	}

    private String identifiant = null;
    public String getIdentifiant() {
        return identifiant;
    }
    public void setIdentifiant(String value) {
    	identifiant = value;
    }

    private String password = null;
    public String getPassword() {
        return password;
    }
    public void setPassword(String value) {
        password = value;
    }
}
