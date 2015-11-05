//Lists in Android

/*
on desktop app to enter a lot of fields, is ok*
not okay on a mobile

on phone:
	find contacts


	minimum requirements:
		XML Layout.
		widgets to dosplay items, text???

		Need to supply data to the list from somewhere
			persistant data; SQLLite

		indexing on the rows
		Page scroll

		an adapter to data source

Simplest example:
	display a list of choices (days) on the screen
	Just line of plain text per item

	user can select one

	<listview .... >

	in activity code:
		using a : ListActivity

		String[] daysOfWeek = {Monday,..., ...};
		onCreate(  ){
			setContentView(R.layour.list);
		}

		attach an adapter to the list:
		setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item, DayOfWeek));
		this: this list(row layout)
		android.r.layour... : android gives default list layouts
		dayofweek: the array

		adapter: I wan't to pump data into the list

	Lab: 
	1) flashlight app
	2) containers
	3) basic list implementation...

