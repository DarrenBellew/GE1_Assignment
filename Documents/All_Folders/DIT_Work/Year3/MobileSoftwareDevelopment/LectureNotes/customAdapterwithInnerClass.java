class MyClass extends ListActivity  {


	onCreate()  {
		setListAdapter(new myAdapter(this, R.layourrow, R.someId, data));
	}

	Class MyAdapter extends ArrayAdapter  {
		//constructor

			MyAdapter(...)  {
				super(....);
			}

			@override
			public View getView(paramaters, View convertView, ViewGroup parent)  {
				/*
				View row = convert view;
				if(row == null)  {
					LayoutInflater inflater = getLayoutInflater();
					row = inflater.inflate(R.layout.row... ...);
				}
				*/


				LayoutInflater inflater = getLayoutInflater();
				View row = inflater.inflate(R.layout.row, parent.. various other parameters);

				TextView label = (TextView) row.findViewById(R.id.rowLayoutId);
				label.setText("The next entry of array");
				ImageView icon = (ImageView). find view by id....
				if(dayOfWeek == "Sunday")  {
					icon.setImageResource(sundayIcon);
				}

				return (View);
			}

		///getView()
		//inflate a row
	}
}

// if list view empty, have a text view for no data.

