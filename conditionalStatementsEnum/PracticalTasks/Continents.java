package conditionalStatementsEnum.PracticalTasks;

public enum Continents {
    AFRICA("Algeria,Angola,Benin,Botswana,Burkina,Burundi,Cameroon,Cape Verde,Central African Republic,Chad,Comoros,Congo,Congo, Democratic Republic of,Djibouti,Egypt,quatorial Guinea," +
            "Eritrea,Ethiopia,Gabon,Gambia,Ghana,Guinea,Guinea-Bissau,Ivory Coast,Kenya,Lesotho,Liberia,Libya,Madagascar,Malawi,Mali,Mauritania,Mauritius,Morocco,Mozambique,Namibia,Niger," +
            "Nigeria,Rwanda,Sao Tome and Principe,Senegal,eychelles,Sierra Leone,Somalia,South Africa,South Sudan,Sudan,Swaziland,Tanzania,Togo,Tunisia,Uganda,Zambia,Zimbabwe"),
    ASIA("Afghanistan,Bahrain,Bangladesh,Bhutan,Brunei,Burma,Cambodia,China,East Timor,India,Indonesia,Iran,Iraq,Israel,Japan,Jordan,Kazakhstan,Korea North,Korea South,Kuwait," +
            "Kyrgyzstan,Laos,Lebanon,Malaysia,Maldives,Mongolia,Nepal,Oman,Pakistan,Philippines,Qatar,Russian Federation,Saudi Arabia,Singapore,Sri Lanka,Syria,Tajikistan,Thailand," +
            "Turkey,Turkmenistan,United Arab Emirates,Uzbekistan, Vietnam,Yemen"),
    AUSTRALIA_OCEANIA("Australia,Fiji,Kiribati,Marshall Islands,Micronesia,Nauru,New Zealand,Palau,Papua New Guinea,Samoa,Solomon Islands,Tonga,Tuvalu,Vanuatu"),
    EUROPE("Albania,Andorra,Armenia,Austria,Azerbaija,Belarus,Belgium,Bosnia and Herzegovina,Bulgaria,Croatia,Cyprus,Czech Republic,Denmark,Estonia,Finland,France,Georgia,Germany,Greece," +
            "Hungary,Iceland,Ireland,Italy,Latvia,Liechtenstein,Lithuania,Luxembourg,Macedonia,Malta,Moldova,Monaco,Montenegro,Netherlands,Norway,Poland,Portugal,Romania,San Marino,Serbia," +
            "Slovakia,Slovenia,Spain,Sweden,Switzerland,Ukraine, United Kingdom,Vatican City"),
    NORTH_AMERICA("Antigua and Barbuda,Bahamas,Barbados,Belize,Canada,Costa Rica,Cuba,Dominica,Dominican Republic,El Salvador,Grenada,Guatemala,Haiti,Honduras,Jamaica,Mexico,Nicaragua," +
            "Panama,Saint Kitts and Nevis,Saint Lucia,Saint Vincent and the Grenadines,Trinidad and Tobago,United States"),
    SOUTH_AMERICA("Argentina,Bolivia,Brazil,Chile,Colombia,Ecuador,Guyana,Paraguay,Per,Suriname,Uruguay,Venezuela");


    String countries;

    Continents(String countries) {
        this.countries = countries;
    }

    public String getCountries() {
        return countries;
    }
}
