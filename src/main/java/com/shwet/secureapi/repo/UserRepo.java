package com.shwet.secureapi.repo;

import com.shwet.secureapi.enitiy.UserEnitiy;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepo extends JpaRepository<UserEnitiy,Long> {

    public Optional<UserEnitiy> findByEmail(String email);

}
