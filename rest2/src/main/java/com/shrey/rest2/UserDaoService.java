package com.shrey.rest2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {
  private static List<User> users= new ArrayList<>();
  private static int count=0;
  static {
	  users.add(new User(++count,"jon",LocalDate.now().minusYears(30)));
	  users.add(new User(++count,"janvi",LocalDate.now().minusYears(25)));
	  users.add(new User(++count,"juhi",LocalDate.now().minusYears(20)));
  }
  public List<User> all()
  {
	  return users;
  }
  public User save(User user) {
	 user.setId(++count);
	  users.add(user);
	  return user;
  }
public void deleteById(int id) {
	  Predicate<? super User> predicate = user -> user.getId().equals(id);
      users.removeIf(predicate);
	
}
public User findOne(int id) {
	  Predicate<? super User> predicate = user -> user.getId().equals(id);
      return users.stream().filter(predicate).findFirst().orElse(null);
	
}
}
