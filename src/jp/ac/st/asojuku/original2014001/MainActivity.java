package jp.ac.st.asojuku.original2014001;
import android.R;
import java.util.Random;
import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;


public class MainActivity extends Activity implements
View.OnClickListener
{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		if (savedInstanceState == null) {
			getFragmentManager().beginTransaction()
					.add(R.id.container, new PlaceholderFragment())
					.commit();
		}
	}

	@Override
	public void onClick(View v) {
		// TODO 自動生成されたメソッド・スタブ
		switch(v.getId()){ //どのボタンが押されたか判定
		case R.id.btnOK: //btnMsgが押された
		//エディットテキストから入力内容を取り出す
		EditText etv = (EditText)findViewByid(R.id.edtName);
		String inputMsg = etv.getText().toString();
		
		//Randomクラスのインスタンスを作る
		Random rnd = new Random();
		// 0～から3の4パターンの数字をranに取得
		int ran = rnd.nextInt(4);
	
		Intent intent = null;
		
		
		
		switch(ran){
			case 0:
				intent = new Intent()
				//大吉
				break;
			case 1:
				//小吉
				break;
			case 2:
				//凶
				break;
			case 3:
				//大凶
				break;
		
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	/**
	 * A placeholder fragment containing a simple view.
	 */
	public static class PlaceholderFragment extends Fragment {

		public PlaceholderFragment() {
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			View rootView = inflater.inflate(R.layout.fragment_main, container, false);
			return rootView;
		}

		@Override
		public void onResume() {
			// TODO 自動生成されたメソッド・スタブ
			super.onResume();
			Button btnOK = (Button)findViewById(R.id.btnOK);
			btnOK.setOnclickListener(this);
		}
	}

}
