package br.edu.novaroma.appmototaxi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import br.edu.novaroma.appmototaxi.util.MensagemUtil;

public class LoginActivity extends Activity {

	private EditText edtLogin;

	private EditText edtSenha;

	//private Button btnEntrar;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);

		edtLogin = (EditText) findViewById(R.id.edt_login);
		edtSenha = (EditText) findViewById(R.id.edt_senha);
	}
	public void entrar(View view){
		String login = edtLogin.getText().toString();
		String senha = edtSenha.getText().toString();

		boolean dadosValidos = true;
		if (login == null || login.equals("")) {
			dadosValidos = false;
			edtLogin.setError(getString(R.string.msg_login_obg));
		}
		if (senha == null || senha.equals("")) {
			dadosValidos = false;
			edtLogin.setError(getString(R.string.msg_senha_obg));
		} 
		if(dadosValidos){
		    MensagemUtil.addMsg(LoginActivity.this, "Logon Realizado com Sucesso!");
		}

		if (dadosValidos) {
			Intent i = new Intent(LoginActivity.this, DashBoardActivity.class);
			startActivity(i);
		}
	}
	
}

