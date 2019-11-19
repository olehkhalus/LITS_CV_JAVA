package demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Starter {
    public static void main(String[] args) {
        for(Record record:getFileLines("data.csv")){
            System.out.println(record);
        }

    }



    public static List<Record> getFileLines(String fileName) {
        List<Record> recordList = new ArrayList<>();
        File myObj = new File(fileName);
        Scanner myReader = null;
        try {
            boolean isFirst = true;
            myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                if (isFirst) {
                    isFirst = false;
                    myReader.nextLine();
                    continue;
                }
                String line = myReader.nextLine();
                recordList.add(new Record(getDate(line), getDistrict(line), getCountOfRecords(line)));
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occured.");
            return null;
        }
        return recordList;
    }

    public static LocalDate getDate(String line) {
        String date = line.substring(0, line.indexOf(','));
        LocalDate dateInLocalDate = LocalDate.parse(date, DateTimeFormatter.ISO_LOCAL_DATE);
        return dateInLocalDate;
    }

    public static District getDistrict(String line) {
        String district = line.substring(line.indexOf(',') + 1, line.lastIndexOf(','));
        switch (district){
            case("Одеська"): return District.ODESA_OBLAST;
            case ("Дніпропетровська"): return District.DNIPROPETROVSK_OBLAST;
            case ("Чернігівська"): return District.CHERNIHIV_OBLAST;
            case ("Харківська"): return District.KHARKIV_OBLAST;
            case ("Житомирська"): return District.ZHYTOMYR_OBLAST;
            case ("Полтавська"): return District.POLTAVA_OBLAST;
            case("Херсонська"): return District.KHERSON_OBLAST;
            case ("Київська"): return District.KIEV_OBLAST;
            case ("Зарорізька"): return District.ZAPORIZHIA_OBLAST;
            case("Луганська"): return District.LUHANSK_OBLAST;
            case("Донецька"): return District.DONETSK_OBLAST;
            case("Вінницька"): return District.VINNYTSIA_OBLAST;
            case("Миколаївська"): return District.MYKOLAIV_OBLAST;
            case("Кіровоградська"): return District.KIROVOHRAD_OBLAST;
            case("Сумська"): return District.SUMY_OBLAST;
            case("Львівська"): return District.LVIV_OBLAST;
            case("Черкаська"): return District.CHERKASY_OBLAST;
            case("Хмельницька"): return District.KHMELNYTSKIY_OBLAST;
            case("Волинська"): return District.VOLYN_OBLAST;
            case("Рівненська"): return District.RIVNE_OBLAST;
            case("Івано-Франківська"): return District.IVANO_FRANKIVSK_OBLAST;
            case("Тернопільська"): return District.TERNOPIL_OBLAST;
            case("Закарпатська"): return District.ZAKARPATTIA_OBLAST;
            case("Чернівецька"): return District.CHERNIVTSY_OBLAST;
            case("Київ"): return District.KIEV;
            case("АР Крим"): return District.AR_KRYM;
            case("Севастополь"): return District.SEVASTOPOL;
        }
        return null;
    }

    public static Integer getCountOfRecords(String line) {
        String countOfDistrict = line.substring(line.lastIndexOf(',') + 1);
        int count = Integer.parseInt(countOfDistrict);
        return count;
    }
}
