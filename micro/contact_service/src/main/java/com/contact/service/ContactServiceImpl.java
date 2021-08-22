package com.contact.service;

import com.contact.entity.Contact;
import org.springframework.stereotype.Service;

import java.util.*;

import java.util.stream.Collectors;
@Service
public class ContactServiceImpl implements ContactService {
    // fake list of contacts
    List<Contact> list=List.of(
            new Contact(1L,"yo@gmailcom","Ankit",1234L),
            new Contact(2L,"yrao@gmailcom","kartik",1234L),
            new Contact(3L,"yraj@gmailcom","Anuj",1234L)
    );
    @Override
    public List<Contact> getContactsOfUser(Long userId) {
        return list.stream().filter(contact->contact.getUserId().equals(userId)).collect(Collectors.toList());



    }
}

