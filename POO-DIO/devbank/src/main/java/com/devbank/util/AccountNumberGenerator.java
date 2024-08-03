package com.devbank.util;

import java.security.SecureRandom;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class AccountNumberGenerator {
    private static final int ACCOUNT_NUMBER_LENGTH = 7;

    private static String generateRandomNumber(int length) {
        SecureRandom random = new SecureRandom();
        StringBuilder number = new StringBuilder();
        for (int i = 0; i < length; i++) {
            number.append(random.nextInt(10));
        }
        return number.toString();
    }

    private static String generateCheckDigit(String accountNumber) {
        int sum = 0;
        for (int i = 0; i < accountNumber.length(); i++) {
            int digit = Character.getNumericValue(accountNumber.charAt(i));
            sum += digit * (i + 1);
        }
        int checkDigit = sum % 11;
        return String.valueOf(checkDigit);
    }

    public String generateAccountNumber(){
        String accountNumber = generateRandomNumber(ACCOUNT_NUMBER_LENGTH);
        String checkDigit = generateCheckDigit(accountNumber);
        return String.format("%s-%s", accountNumber,checkDigit);
    }
}
