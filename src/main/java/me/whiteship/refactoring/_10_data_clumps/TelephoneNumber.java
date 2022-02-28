package me.whiteship.refactoring._10_data_clumps;

public class TelephoneNumber {

    private String areaCode;

    private String number;

    public TelephoneNumber(String personalAreaCode, String number) {
        this.areaCode = personalAreaCode;
        this.number = number;
    }

    @Override
    public String toString() {
        return this.areaCode + "-" + this.number;
    }
}
