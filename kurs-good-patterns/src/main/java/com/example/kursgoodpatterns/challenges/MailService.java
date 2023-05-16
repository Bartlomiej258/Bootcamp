package com.example.kursgoodpatterns.challenges;

public class MailService implements InformationService {
    @Override
    public void inform(User user) {
        System.out.println("Sending email to user... " + user.getFirstName() + " " + user.getLastName());
    }
}
