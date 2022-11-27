package temperature;

import javax.sound.midi.Soundbank;
import java.sql.Ref;
import java.sql.SQLOutput;

public class conversion {

    public static void main (String[] args){

        double C,K, Re, Ra, F;
        C = 2.43;

        F = C * 1.8 + 32;
        K = C + 273.15;
        Re = C * 0.8;
        Ra = C * 1.8 + 32 + 459.67;

        System.out.println("Temperatura em Celsius: " + C);

        System.out.println("Temperatura em Fahrenheit: " + F);

        System.out.println("Temperatura em Kelvin: " + K);

        System.out.println("Temperatura em Reaumur: " + Re);

        System.out.println("Temperatura em Rankine: " + Ra);


    }
}
