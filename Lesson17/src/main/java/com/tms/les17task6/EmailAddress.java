package com.tms.les17task6;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class EmailAddress {
    private String eMail;
    private String additionallyInfo;

    @Override
    public String toString() {
        return "EmailAddress{" +
                "eMail='" + eMail + '\'' +
                ", additionallyInfo='" + additionallyInfo + '\'' +
                '}';
    }
}
