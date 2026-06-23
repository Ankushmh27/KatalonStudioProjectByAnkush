package utility

String filePath = "C:/Users/admin/Katalon Studio/KatalonWebautomationByAnkush/Data Files/LoginTestData.xlsx"

List<Map<String, String>> testData =
		ExcelReader.readExcel(filePath, "Sheet1")

for(Map<String, String> row : testData) {

	String username = row.get("Username")
	String password = row.get("Password")

	println username
	println password

	// Pass data to your test method
	login(username, password)
}