package Task1.Jackson;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class Currency {

        //digital code
        @JsonProperty("r030")
        private int digitalCode;

        @JsonProperty("txt")
        private String currencyName;

        private BigDecimal rate;

        @JsonProperty("cc")
        private String shortName;

        @JsonProperty("exchangedate")
        private String exchangeDate;

        //constructors
        public Currency() { }
        public Currency(int digitalCode, String currencyName, BigDecimal rate, String shortName, String exchangeDate) {
            this.digitalCode = digitalCode;
            this.currencyName = currencyName;
            this.rate = rate;
            this.shortName = shortName;
            this.exchangeDate = exchangeDate;
        }


        //getter/setter
        public int getDigitalCode(){return digitalCode;}
        public void setDigitalCode(int digitalCode){this.digitalCode = digitalCode;}

        public BigDecimal getRate(){return rate;}
        public void setRate (BigDecimal rate){this.rate=rate;}

        public String getCurrencyName(){return currencyName;}
        public void setCurrencyName(String currencyName){this.currencyName = currencyName;}

        public String getShortName(){return shortName;}
        public void setShortName(String shortName){this.shortName = shortName;}

        public String getExchangeDate(){return exchangeDate;}
        public void setExchangeDate (String exchangeDate){this.exchangeDate=exchangeDate;}

        @Override
        public String toString(){
            return "Code: " + digitalCode + " | Currency: " + currencyName + "(" + shortName + ") | Rate: " + rate
                    + " UAH | Exchange date: " + exchangeDate;
        }


    }
