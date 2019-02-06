package com.aravi.customspinnerapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Spinner spinner;

    String[] coutryNames = {"Afghanistan", "Albania", "Algeria", "Andorra", "Angola", "Antigua and Barbuda", "Argentina", "Armenia", "Australia", "Austria", "Azerbaijan",
            "Bahamas", "Bahrain", "Bangladesh", "Barbados", "Belarus", "Belgium", "Belize", "Benin", "Bhutan", "Bolivia", "BosniaandHerzegovina", "Botswana", "Brazil", "Brunei", "Bulgaria", "Burkina Faso", "Burundi"};
    //{, "CaboVerde", "Cambodia", "Cameroon", "Canada", "Central African Republic", "Chad", "Chile", "China", "Colombia", "Comoros", "Democratic Republic of the Congo", "Republic of the Congo", "Costa Rica", "Cote d'Ivoire", "Croatia", "Cuba", "Cyprus", "Czech Republic", "Denmark", "Djibouti", "Dominica", "Dominican Republic", "Ecuador", "Egypt", "El Salvador", "Equatorial Guinea", "Eritrea", "Estonia", "Eswatini (formerly Swaziland)", "Ethiopia", "Fiji", "Finland", "France", "Gabon", "Gambia", "Georgia", "Germany", "Ghana", "Greece", "Grenada", "Guatemala", "Guinea", "Guinea-Bissau", "Guyana", "Haiti", "Honduras", "Hungary", "Iceland", "India", "Indonesia", "Iran", "Iraq", "Ireland", "Israel", "Italy", "Jamaica", "Japan", "Jordan", "Kazakhstan", "Kenya", "Kiribati", "Kosovo", "Kuwait", "Kyrgyzstan", "Laos", "Latvia", "Lebanon", "Lesotho", "Liberia", "Libya", "Liechtenstein", "Lithuania", "Luxembourg", "Macedonia", "Madagascar", "Malawi", "Malaysia", "Maldives", "Mali", "Malta", "MarshallIslands", "Mauritania", "Mauritius", "Mexico", "Micronesia", "Moldova", "Monaco", "Mongolia", "Montenegro", "Morocco", "Mozambique", "Myanmar", "Namibia", "Nauru", "Nepal", "Netherlands", "NewZealand", "Nicaragua", "Niger", "Nigeria", "North Korea", "Norway", "Oman", "Pakistan", "Palau", "Palestine", "Panama", "PapuaNewGuinea", "Paraguay", "Peru", "Philippines", "Poland", "Portugal", "Qatar", "Romania", "Russia", "Rwanda", "Saint Lucia", "Samoa", "San Marino", "Sao Tome and Principe", "Saudi Arabia", "Senegal", "Serbia", "Seychelles", "SierraLeone", "Singapore", "Slovakia", "Slovenia", "SolomonIslands", "Somalia", "SouthAfrica", "South Korea", "South Sudan", "Spain", "Sri Lanka", "Sudan", "Suriname", "Sweden", "Switzerland", "Syria", "Taiwan", "Tajikistan", "Tanzania", "Thailand", "Timor_Leste", "Togo", "Tonga", "Trinidad and Tobago", "Tunisia", "Turkey", "Turkmenistan", "Tuvalu", "Uganda", "Ukraine", "United Arab Emirates", "UnitedKingdom", "USA", "Uruguay", "Uzbekistan", "Vanuatu", "VaticanCityHolySee", "Venezuela", "Vietnam", "Yemen", "Zambia", "Zimbabwe"};
    int[] flags = {R.raw.afghanistan, R.raw.albania, R.raw.algeria, R.raw.andorra, R.raw.angola, R.raw.antigua, R.raw.argentina, R.raw.armenia, R.raw.australia, R.raw.austria, R.raw.azerbaijan
            , R.raw.bahamas, R.raw.bangladesh, R.raw.belarus, R.raw.belgium, R.raw.benin, R.raw.bhutan, R.raw.bolivia, R.raw.bosniaherzegovina, R.raw.botswana, R.raw.brazil, R.raw.brunei, R.raw.bulgaria, R.raw.burkinafaso, R.raw.burundi};
    //{, R.raw.caboverde, R.raw.cambodia, R.raw.cameroon, R.raw.canada, R.raw.centralafricanrepublic, R.raw.chad, R.raw.chile, R.raw.china, R.raw.colombia, R.raw.costarica, R.raw.cotedivoire, R.raw.croatia, R.raw.cuba, R.raw.cyprus, R.raw.czechrepublic, R.raw.denmark, R.raw.djibouti, R.raw.dominica, R.raw.dominicanrepublic, R.raw.ecuador, R.raw.egypt, R.raw.eisalvador, R.raw.equatorialguinea, R.raw.eritrea, R.raw.estonia, R.raw.eswatini, R.raw.ethiopia, R.raw.fiji, R.raw.finland, R.raw.france, R.raw.gabon, R.raw.gambia, R.raw.georgia, R.raw.germany, R.raw.ghana, R.raw.greece, R.raw.grenada, R.raw.guatemala, R.raw.guinea, R.raw.guineabissau, R.raw.guyana, R.raw.haiti, R.raw.honduras, R.raw.hungary, R.raw.iceland, R.raw.india, R.raw.indonesia, R.raw.iran, R.raw.iraq, R.raw.ireland, R.raw.israel, R.raw.italy, R.raw.jamaica, R.raw.japan, R.raw.jordan, R.raw.kazakhistan, R.raw.kenya, R.raw.kiribati, R.raw.kosovo, R.raw.kuwait, R.raw.kyrgyzstan, R.raw.laos, R.raw.latvia, R.raw.lebanon, R.raw.lesotho, R.raw.liberia, R.raw.libya, R.raw.liechtenstein, R.raw.lithuania, R.raw.luxembourg, R.raw.macedonia, R.raw.madagascar, R.raw.malawi, R.raw.malaysia, R.raw.maldives, R.raw.mali, R.raw.malta, R.raw.marshallislands, R.raw.mauritania, R.raw.mauritius, R.raw.mexico, R.raw.micronesia, R.raw.moldova, R.raw.monaco, R.raw.mongolia, R.raw.montenegro, R.raw.morocco, R.raw.mozambique, R.raw.myanmar, R.raw.namibia, R.raw.nauru, R.raw.nepal, R.raw.netherlands, R.raw.newzealand, R.raw.nicaragua, R.raw.niger, R.raw.nigeria, R.raw.koreanorth, R.raw.norway, R.raw.oman, R.raw.pakistan, R.raw.palau, R.raw.palestine, R.raw.panama, R.raw.papuanewguinea, R.raw.paraguay, R.raw.peru, R.raw.philippines, R.raw.poland, R.raw.portugal, R.raw.qatar, R.raw.romania, R.raw.russia, R.raw.rwanda, R.raw.saintlucia, R.raw.samoa, R.raw.sanmarino, R.raw.saotomeandprincipe, R.raw.saudiarabia, R.raw.senegal, R.raw.serbia, R.raw.seychelles, R.raw.sierraleone, R.raw.singapore, R.raw.slovakia, R.raw.slovenia, R.raw.solomonislands, R.raw.somalia, R.raw.southafrica, R.raw.koreasouth, R.raw.southsudan, R.raw.spain, R.raw.srilanka, R.raw.sudan, R.raw.suriname, R.raw.sweden, R.raw.switzerland, R.raw.syria, R.raw.taiwan, R.raw.tajikistan, R.raw.tanzania, R.raw.thailand, R.raw.timorleste, R.raw.togo, R.raw.tonga, R.raw.trinidadandtobago, R.raw.tunisia, R.raw.turkey, R.raw.turkmenistan, R.raw.tuvalu, R.raw.uganda, R.raw.ukraine, R.raw.unitedarabemirates, R.raw.unitedkingdom, R.raw.usa, R.raw.uruguay, R.raw.uzbekistan, R.raw.vanuatu, R.raw.vaticancity, R.raw.venezuela, R.raw.vietnam, R.raw.yemen, R.raw.zambia, R.raw.zimbabwe};

        CustomAdapter customAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
        spinner = findViewById(R.id.spinner);

        customAdapter = new CustomAdapter(this, coutryNames, flags);
        spinner.setAdapter(customAdapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "you Selected " + coutryNames[position] + " Country", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
