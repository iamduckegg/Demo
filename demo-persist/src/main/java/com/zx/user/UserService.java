package com.zx.user;

import org.omg.CORBA.UserException;

public interface UserService {
	User ceateUser(User user) throws UserException;
	User readUser(String id) throws UserException;
	User updateUser(User user) throws UserException;
	void deleteUser(String id) throws UserException;
}
