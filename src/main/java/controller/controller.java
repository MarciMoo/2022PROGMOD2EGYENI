package controller;

import java.util.ArrayList;
import model.patient;
import model.patient_enum;
import model.xmlreader;
import model.xmlsaver;

public class controller {
    
    static String path = "C:\\Users\\fmarc\\OneDrive\\Dokumentumok\\NetBeansProjects\\PROGMODBEADANDOEGYENI2022\\src\\main\\java\\resources\\patients.xml";
   
    
    public static ArrayList<patient> listazas(){
        ArrayList<patient> betegek = xmlreader.readPatientsFromXml(path);
        return betegek;
    }
    
    public static String hozzaad(String taj, String nev, String by, String kezd, String betegseg, String allapot){
        ArrayList<patient> betegek = xmlreader.readPatientsFromXml(path);
        patient beteg = new patient(taj, nev, by, kezd, betegseg, patient_enum.valueOf(allapot));
        betegek.add(beteg);
        xmlsaver.savePatientsToXml(betegek, path);
        return "ok";
    }
    
        public static boolean torles(String i){
        ArrayList<patient> betegek = xmlreader.readPatientsFromXml(path);
        for(patient beteg : betegek){
            if(beteg.getTaj().equals(i)){
                betegek.remove(beteg);
                xmlsaver.savePatientsToXml(betegek, path);
                return true;
            }
            else{
                return false;
            }
        }
        xmlsaver.savePatientsToXml(betegek, path);
        return false;
    }
    
    public static boolean frissites(String i, String b, String x){
        ArrayList<patient> betegek = xmlreader.readPatientsFromXml(path);
        for(patient beteg : betegek){
            if(beteg.getTaj().equals(i)) {
                if(b.equals("1")){
                    beteg.setTaj(x);
                    xmlsaver.savePatientsToXml(betegek, path);
                    return true;
                }
                else if(b.equals("2")){
                    beteg.setName(x);
                    xmlsaver.savePatientsToXml(betegek, path);
                    return true;
                }
                else if(b.equals("3")){
                    beteg.setBirthYear(x);
                    xmlsaver.savePatientsToXml(betegek, path);
                    return true;
                }
                else if(b.equals("4")){
                    beteg.setKezeleskezdete(x);
                    xmlsaver.savePatientsToXml(betegek, path);
                    return true;
                }
                else if(b.equals("5")){
                    beteg.setBetegsegneve(x);
                    xmlsaver.savePatientsToXml(betegek, path);
                    return true;
                }
                else if(b.equals("6")){
                    beteg.setAllapot(patient_enum.valueOf(x));
                    xmlsaver.savePatientsToXml(betegek, path);
                    return true;
                }
                else{
                    return false;
                }
            }
            else{
                return false;
            }
        }
        xmlsaver.savePatientsToXml(betegek, path);
        return true;
    }

    public static patient kereses(String i){
        ArrayList<patient> betegek = xmlreader.readPatientsFromXml(path);
        for(patient beteg : betegek){
            if(beteg.getTaj().equals(i)){           
                return beteg;
            }
            else{
                return null;
            }
        }
        return null;
    }
}
