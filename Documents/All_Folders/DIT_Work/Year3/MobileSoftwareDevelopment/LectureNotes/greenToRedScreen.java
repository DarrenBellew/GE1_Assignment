public class RedScreenActivity extends Activity  {

	Button greenButton;
	public void onCreate (Bundle status)  {
		super.onCreate...;
		setContentView(s.layout.whateveryoursmlllayouriscalled);
		greenButton = (Button)findViewById(R.id.whateveryourgavethebuttonasID);
		greenButton.setOnClickListener(//<--.... anonymousClass)
			public void onClick (
				Intent switchScreen = new Intent(RedScreenActivity.this, GreenScreen.class);
				startActivity(switchScreen);
			)
		);
	}


}
//no anonymous class, interface.

public class RedScreenActivity extends Activity implements View.OnClickListener {

	Button greenButton;
	public void onCreate (Bundle status)  {
		super.onCreate...;
		setContentView(s.layout.whateveryoursmlllayouriscalled);
		greenButton = (Button)findViewById(R.id.whateveryourgavethebuttonasID);
		greenButton.setOnClickListener(this);
	}

	public void onClick(View v)  {
		Intent switchScreen = new Intent(RedScreenActivity.this, GreenScreen.class);
		startActivity(switchScreen);
	}
}

//GreenScreenActivity
public class RedScreenActivity extends Activity implements View.OnClickListener {

	Button redButton;
	public void onCreate (Bundle status)  {
		super.onCreate...;
		setContentView(s.layout.whateveryoursmlllayouriscalled);
		redButton = (Button)findViewById(R.id.whateveryourgavethebuttonasID);
		redButton.setOnClickListener(this);
	}

	public void onClick(View v)  {
		stop();
	}
}
