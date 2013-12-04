package br.edu.novaroma.appmototaxi.util;

import android.app.Activity;
import android.widget.Toast;

public class MensagemUtil {
	/*
	 * Metodo de criacao de mensagens rapidas
	 */
	public static void addMsg(Activity activity, String msg){
		Toast.makeText(activity, msg, Toast.LENGTH_SHORT).show();
	}

}
