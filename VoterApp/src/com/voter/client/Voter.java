package com.voter.client;

import com.voter.exception.InvalidVoterIdException;
import com.voter.exception.LocalityNotFoundException;
import com.voter.exception.UnderAgeException;
import com.voter.service.ElectionBoothServiceImpl;
import com.voter.service.IElectionBoothService;

public class Voter {

public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    IElectionBoothService election = new ElectionBoothServiceImpl();

    System.out.print("Enter age: ");
    int age = sc.nextInt();

    sc.nextLine();

    System.out.print("Enter locality: ");
    String locatity = sc.nextLine();

    System.out.print("Enter voter id: ");
    int voterId = sc.nextInt();

    try {
        election.checkEligibility(age,locatity,voterId);
        System.out.println("You are eligible to vote.....");
    } catch (UnderAgeException | InvalidVoterIdException | LocalityNotFoundException e) {
        System.out.println("not eligible");
    }
}
}