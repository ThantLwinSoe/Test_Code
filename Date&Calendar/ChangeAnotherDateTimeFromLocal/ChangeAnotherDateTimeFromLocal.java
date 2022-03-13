// This is our Local Time
	
	LocalDateTime local = LocalDateTime.now();

// We need to change DonedDateTime

	DonedDateTime zone = local.atZone(ZoneId.systemDefault());

// We change again MachineTime
	
	var instant = zone.toInstant();

// Now we change other Time Zone

	var tokyo = instant.atZone(ZoneId.of("Asia/Tokyo"));



//    Other Way to Change\
// 	  toInstant() with ZoneOffset Object
// 	  Creat ZoneOffset Object

	var yangon = ZoneOffest.ofHoursMinutes(7,30);

// Change to Machine Time
	var yangonInstant = local.toInstant(yangon);

// Change to Soul
	var tokyo =	yangonInstant.atZone(ZoneId.of("Asia/Tokyo"));

