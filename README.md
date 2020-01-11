# Password-Checker
#NB
#when downloading or cloning this project, it will download a folder named Password-Checker which contains a README.md and 'Password-Checker' sub-folder, this sub-folder should be opened as a project instead of the main folder.

Please note that when running tests, to test different types/values of passwords you must edit the string within the passwordIsValid parameter...

/*
assertThrows(Exception.class, () -> PasswordChecker.passwordIsValid("P@ssword")); //this test passes

assertThrows(Exception.class, () -> PasswordChecker.passwordIsValid("P@ssword2")); //this test fails
*/
