package com.shwet.secureapi.service;

import com.shwet.secureapi.dto.req.UserRequestDto;
import com.shwet.secureapi.dto.resp.UserResponseDto;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UserService extends UserDetailsService {
    List<UserResponseDto> getAllUser();
    public UserResponseDto createUser(UserRequestDto userRequestDto);

}
