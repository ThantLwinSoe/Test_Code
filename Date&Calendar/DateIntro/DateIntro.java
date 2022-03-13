/* Date class have many Methods but most of method is deplicated
 * So we need to creat date object with the Calender
 */

// Default Constructor 
   Date date = new Date();

// Build Calender object
// Default Time Zone
// Yes We got Calender Object
	Calendar calendar = Calendar.getInstance();

// set(int field, int Value)
// Calendar have many fields just look at the java doc
// set Year
	calender.set(Calendar.YEAR, 1993);
// Calendar start 0 index 	
	calendar.set(Calendar.MONTH, 10);

	calendar.set(Calendar.DAY_OF_MONTH,26);

// instantiate with date object
	var date = calendar.getTime();

// Yes Thats is
