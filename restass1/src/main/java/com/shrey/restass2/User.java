package com.shrey.restass2;

import org.springframework.stereotype.Component;

@Component
public class User {
	private String username="kanu";
	  private String password="shr@123";
	  public boolean find(String username1,String password1)
	  {
	     /* if((username==username1)&&(password==password1))
	      {
	          return true;
	      }
	      else
	      {
	          return false;
	      }
	  }*/
	      return username.equals(username1)&&password.equals(password1);
	}
	
}
