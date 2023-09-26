package Exercicio06;

import java.util.LinkedList;
import java.util.Objects;

public class Passagens {
    private String reserva;

    private String data;


    public static void add(LinkedList<Objects> reservas) {
    }

    public static int get(int i) {
        int i1 = 0;
        return i1;
    }

    public String getData() {
        return data;
    }

    public Passagens(String reserva, String data){
        this.reserva = reserva;
        this.data = data;
    }

    public String getReserva() {
        return reserva;
    }


    public  void MostraPassangns(){
        System.out.println("Sua passagem: "+this.reserva);
        System.out.println("Data: "+this.data);

    }
}
