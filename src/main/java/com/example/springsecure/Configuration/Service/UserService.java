package com.example.springsecure.Configuration.Service;

import com.example.springsecure.Model.ApplicationUser;
import com.example.springsecure.Model.Role;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Data
@RequiredArgsConstructor
public class UserService implements UserDetailsService {

    private PasswordEncoder encoder;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        System.out.println("In he user detail service");
        if(!username.equals("Ethan")) throw new UsernameNotFoundException("not ethan");
        Set<Role> roles = new HashSet<>();
        roles.add(new Role(1,"USER"));
        return new ApplicationUser(1,"Ethan", encoder.encode("password"),roles);
    }
}
