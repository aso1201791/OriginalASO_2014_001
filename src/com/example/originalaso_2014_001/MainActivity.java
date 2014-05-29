package com.example.originalaso_2014_001;

import java.util.Random;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

public void onClick(View v) {
	switch(v.getId()){
		case R.id.btnOK: //btnMsg押された
		//エディットテキストから入力された内容を取り出す
			EditText etv = (EditText)findViewById(R.id.edtName);
			String inputMsg = etv.getText().toString();

			//Randomクラスのインスタンスを作る
			Random rnd = new Random();
			//0～3の4パターンの数字をranに取得
			int ran = rnd.nextInt(4);

			//生成して代入用のIntentインスタンス変数を用意
			Intent intent = null;
			//ranの値によって処理を分ける
			switch(ran){
				case 0:
					//0なら大吉のページへ飛ばす
					//次画面のインスタンス生成
					intent = new Intent(MainActivity.this,DaikichiActivity.class);
					//次画面のアクティビティー起動
					startActivity(intent);
					break;
				case 1:
					//1なら中吉のページへ飛ばす
					//インテントのインスタンス生成
					intent =new Intent(MainActivity.this,ChukichiActhivity.class);
					//次画面のアクティビティー起動
					startActivity(intent);
					break;
				case 2:
					//2なら凶のページへ飛ばす
					//インテントのインスタンス生成
					intent =new Intent(MainActivity.this,KyouActhivity.class);
					//次画面のアクティビティー起動
					startActivity(intent);
					break;
				case 3:
					//3大凶のページへ飛ばす
					//インテントのインスタンス生成
					intent =new Intent(MainActivity.this,DaikyouActhivity.class);
					//次画面のアクティビティー起動
					startActivity(intent);
					break;
			}
	}
}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
