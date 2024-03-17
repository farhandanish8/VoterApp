package com.voter.service;

import com.voter.exception.InvalidVoterIdException;
import com.voter.exception.LocalityNotFoundException;
import com.voter.exception.UnderAgeException;

public interface IElectionBoothService {
    boolean checkEligibility(int age, String locality, int voterId) throws UnderAgeException, InvalidVoterIdException, LocalityNotFoundException;
}
}
