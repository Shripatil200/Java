package com.example.enums.methods_variables;

public enum EnumSample2 {
    MONDAY(101, "1sr day of a week"),
    TUESDAY(102, "2nd day of a week"),
    WEDNESDAY(103, "3rd day of a week"),
    THURSDAY(104, "4th day of a week"),
    FRIDAY(105, "5th day of a week"),
    SATURDAY(106, "1st weekend of a week"),
    SUNDAY(107, "2nd weekend of a week");

    private int value;
    private String comment;

    EnumSample2(int value, String comment){
        this.value = value;
        this.comment = comment;
    }

    public int getValue(){
        return value;
    }

    public String getComment(){
        return comment;
    }

    public static EnumSample2 getEnumByValue(int value){
        for(EnumSample2 sample : EnumSample2.values()){
            if (sample.value == value){
                return sample;
            }
        }
        return null;
    }


}
