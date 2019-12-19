package com.sgic.internal.login.servicesimpl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sgic.internal.login.entities.Role;
import com.sgic.internal.login.entities.User;
import com.sgic.internal.login.repositories.ConfirmationTokenRepository;
import com.sgic.internal.login.repositories.RoleRepository;
import com.sgic.internal.login.repositories.UserRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	UserRepository userRepository;
	
	@Autowired
	RoleRepository roleRepository;
	
	@Autowired 
	ConfirmationTokenRepository comfirmationTokenRepository;

	@Override
	@Transactional
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		User user = userRepository.findByUsername(username);
		return UserPrinciple.build(user);
	}
	
	public List<User> getUserDetails() {
		return userRepository.findAll();
		
	}
	public User getByEmail(String email) {
		try {
			
			return userRepository.findUserByEmail(email);
		} catch (Exception ex) {
			
		}
		return null;

	}
	
	public User getByuserId(Long id) {
		return userRepository.findUserById(id);	
	}
	
	public User updateUser(User user) {
		try {
			Long id = user.getId();
			boolean isExist = userRepository.findById(id) != null;
			if (isExist) {
				return userRepository.save(user);
			} else {
				
			}
		} catch (Exception ex) {
		}
		return null;
	}
	
	public void deleteBytokenId(Long tokenid) {
		comfirmationTokenRepository.deleteById(tokenid);
	}
}