package com.company.task4;

import java.util.ArrayList;

public class Library extends Reader{

    protected ArrayList<String> books = new ArrayList<>();
    protected ArrayList<Reader> readers = new ArrayList<Reader>();

    public ArrayList<Reader> getReaders() {
        return readers;
    }

    public void showReaders(){
        readers.add(new Reader("Bayan","Buitek",122,"+7707888888"));
        readers.add(new Reader("Aida","Sultanovna", 123,"+77948495048"));
        for (int i = 0 ; i < readers.size(); i++){
            Reader r = readers.get(i);
            System.out.println("Name:" + r.getName() + " Surname:" + r.getLastName() + " Number of ticket:" + r.getNumberOfTicket()
                    + " Phone number:" + r.getNumberOfPhone());
        }
    }
}
