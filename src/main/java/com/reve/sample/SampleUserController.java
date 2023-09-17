package com.reve.sample;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 
 * @author reve
 *
 */
@Controller
public class SampleUserController {

	@Autowired
	private SampleUserMapper userMapper;

	@RequestMapping("/findAll")
	@ResponseBody
	public List<SampleUser> findAll() {
		List<SampleUser> users = userMapper.findAll();
		return users;
	}
	@RequestMapping("/insertUser")
	@ResponseBody
	public int insert() {
		SampleUser user = new SampleUser();
		
		user.setId(2);
		user.setUsername("username2");
		user.setPassword("password2");
		user.setJob("job2");
		
		int cnt = userMapper.insertUser(user);
		return cnt;
	}
}
