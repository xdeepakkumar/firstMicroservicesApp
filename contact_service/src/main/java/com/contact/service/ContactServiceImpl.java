package com.contact.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.contact.entity.Contact;

@Service
public class ContactServiceImpl implements ContactService {

	//fake service
	private List<Contact> list = List.of(
			new Contact(001L,"deepak@gmail.com", "6200960560",123L),
			new Contact(002L,"rajasai@gmail.com", "9199835013",124L),
			new Contact(003L,"khajasai@gmail.com", "6200960560",124L),
			new Contact(004L,"sahilsai@gmail.com", "6200960560",125L)
	);
	
	@Override
	public List<Contact> getContactOfUser(Long userId) {
		return this.list.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
	}

}
