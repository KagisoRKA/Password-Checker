# Password-Checker

Please note that when running tests, to test different types/values of passwords you must edit the string within the passwordIsValid parameter...
/*
assertThrows(Exception.class, () -> PasswordChecker.passwordIsValid("P@ssword")); //this test passes
assertThrows(Exception.class, () -> PasswordChecker.passwordIsValid("P@ssword2")); //this test fails
*/
