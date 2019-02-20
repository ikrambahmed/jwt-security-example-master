package com.demo.security.jwtsecurity.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.demo.security.jwtsecurity.dao.UserRepository;
import com.demo.security.jwtsecurity.model.JwtUser;
@Service
@Repository
@Transactional
public class IUserImp implements IUser {

	 @Autowired
		private UserRepository userRepository  ; 
		

		@Override
		public List<JwtUser> list() {
			
			return userRepository.list() ; 
		}


		@Override
		public List<JwtUser> lista(String code) {
			
			return userRepository.lista(code);
		}


		@Override
		public List<JwtUser> oneUser(String username, String password) {
			return userRepository.oneUser(username , password) ; 
		}



}
