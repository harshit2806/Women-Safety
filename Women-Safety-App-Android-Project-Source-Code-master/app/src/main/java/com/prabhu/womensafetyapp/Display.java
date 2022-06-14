package com.prabhu.womensafetyapp;


import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;

public class Display extends Activity{
	

	public void showMessage(String title,String message)
    {
        Builder builder=new Builder(this);
        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(message);
        builder.show();
    }


	
	
	
	public void back(View v) {
		Intent i_back=new Intent(Display.this,MainActivity.class);
		startActivity(i_back);
		
		}
	
	

}








