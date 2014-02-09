package com.application.struts.login;

import com.opensymphony.xwork2.ActionSupport;

public final class LogoutAction extends ActionSupport {

	  public String execute() throws Exception {
    return "login";
  }

}
