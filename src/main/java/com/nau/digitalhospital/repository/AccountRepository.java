package com.nau.digitalhospital.repository;

import com.nau.digitalhospital.document.Account;
import com.nau.digitalhospital.document.MedicalCard;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface AccountRepository extends MongoRepository<Account, String> {
    Account findAccountByLoginAndPassword(String login, String password);

    @Query("{'medicalCard.patient.middleName': ?0}")
    Account findAccountByMiddleName(String middleName);

}
