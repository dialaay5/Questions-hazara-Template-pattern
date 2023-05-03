package com.templatePattern;

public class Main {
    public static void main(String[] args) {
        BarbecueParty danny = new Danny();
        BarbecueParty moshi = new Moshi();
        BarbecueParty aetsek = new Aetsek();
        BarbecueParty anat = new Anat();

        System.out.println("הדרך של דני");
        danny.start_party();
        System.out.println("--------------------------------");

        System.out.println("הדרך של משה");
        moshi.start_party();
        System.out.println("--------------------------------");

        System.out.println("הדרך של איציק");
        aetsek.start_party();
        System.out.println("--------------------------------");

        System.out.println("הדרך של ענת");
        anat.start_party();



    }
}
