package br.edu.novaroma.appmototaxi.bo;

import android.content.Context;
import br.edu.novaroma.appmototaxi.R;

public class LoginBO {

	private Context context;
	
	public LoginBO(Context context){
		this.context = context;
	}
	
	public String validarLogin(String login, String senha){
		
		if (login == null || login.equals("")) {
			
			return context.getString(R.string.msg_login_obg);
		} else if (senha == null || senha.equals("")) {
			
		    return context.getString(R.string.msg_senha_obg);
		} 

		return null;
	}
}
