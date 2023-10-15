package edu.wctc.distjavazodiac.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
//gittest
@Data
@NoArgsConstructor
public class Birthday {
    private int year;
    private int day;
    private int month;
    private String zodiacType;
    private boolean termsAccepted;
}
