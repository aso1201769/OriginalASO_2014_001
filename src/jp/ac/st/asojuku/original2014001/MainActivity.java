package jp.ac.st.asojuku.original2014001;

import java.util.Random;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity implements View.OnClickListener
{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

	}

	@Override
	protected void onResume() {
		// TODO 自動生成されたメソッド・スタブ
		super.onResume();
	}

	@Override
	public void onClick(View v) {
		// TODO 自動生成されたメソッド・スタブ
		switch(v.getId()){ //どのボタンが押されたか判定
			case R.id.btnOK: //btnMsgが押された

		//Randomクラスのインスタンスを作る
		Random rnd = new Random();
		// 0～から3の4パターンの数字をranに取得
		int ran = rnd.nextInt(4);
		
		//生成して代入用のIntentインスタンス変数を用意
		Intent intent = null;
		//ranの値によって処理を分ける
		switch(ran){
			case 0:
				//大吉
				intent = new Intent(MainActivity.this, Daikitiactivity.class);
				startActivity(intent);
				break;
			case 1:
				//中吉
				intent = new Intent(MainActivity.this, ChukitiActivity.class);
				startActivity(intent);
				break;
			case 2:
				//凶
				intent = new Intent(MainActivity.this, KyouActivity.class);
				startActivity(intent);
				break;
			case 3:
				//大凶
				intent = new Intent(MainActivity.this, DaikyouActivity.class);
				startActivity(intent);
				break;
				}
		}
	}





}
