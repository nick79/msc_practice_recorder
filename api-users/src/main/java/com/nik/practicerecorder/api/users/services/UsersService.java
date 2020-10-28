package com.nik.practicerecorder.api.users.services;

import com.nik.practicerecorder.api.users.shared.UserDto;

public interface UsersService {
    UserDto createUser(UserDto userDetails);
}
