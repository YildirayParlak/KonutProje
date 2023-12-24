import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Burada gerekli nesneleri oluşturduk
        Daire daire = new Daire("", 0);
        Konut konut = new Konut("");
        Bina bina = new Bina("", 0);
        Kiraci kiraci = new Kiraci("", "", "");
        EvSahibi evSahibi = new EvSahibi("", "", bina);

        // Nesnelerin oluşturduktan sonra bu nesnelerdeki create metotlarını kullanarak kullanıcıdan bilgileri aldık
        daire.olustur();
        konut.olustur();
        bina.olustur();
        kiraci.olustur();
        evSahibi.olustur();

        //burada bağlantıları kurarak Bir konutun içinde bir daire ve bir ev sahibinin sahip olduğu daireler belirlerizs
        konut.setDaire(daire);
        evSahibi.addApartmen(daire);

        // burada ise en son displayInfo metodunu kullanarak bilgileri ekrana yazdırırız
        System.out.println("\nDaire Bilgisi:");
        daire.displayInfo();

        System.out.println("\nKonut Bilgisi:");
        konut.displayInfo();

        System.out.println("\nBina Bilgisi:");
        bina.displayInfo();

        System.out.println("\nKiracı Bilgisi:");
        kiraci.displayInfo();

        System.out.println("\nEv Sahibi Bilgisi:");
        evSahibi.displayInfo();
    }
}