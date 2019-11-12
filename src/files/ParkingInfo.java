package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ParkingInfo {
    public static void main(String[] args) {
        String[] fileLines =
                getFileLines("parking_chernivtsi.csv");
        boolean isFirstLine = true;
        for (String line : fileLines) {
            if (isFirstLine) {
                isFirstLine = false;
                continue;
            }

            printAllParkingLotsOfMyTime(setTimeOfParking(),printWorkHourStart(line),printWorkHourEnd(line),line);
        }
    }
    private static void printAllParkingLotsOfMyTime(LocalTime myTime, LocalTime workHourStart, LocalTime workHourEnd, String line){
        try {
            FileWriter myWriter = new FileWriter("parking_info.txt");
            if(myTime.isAfter(workHourStart) && myTime.isBefore(workHourEnd)){
                myWriter.write(line);
            }
           myWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static LocalTime setTimeOfParking(){
        //Scanner timeInput = new Scanner(System.in);
       // System.out.println("Input time what you want in format \"HH:mm:ss\":");
       // String timeStr = timeInput.nextLine();
        LocalTime timeLocal = LocalTime.parse("12:00:00",DateTimeFormatter.ofPattern("HH:mm:ss"));
      //  timeInput.close();
        return timeLocal;
    }

    private static LocalTime printWorkHourStart(String line) {
        int position = line.indexOf(":");
        int startPosition = position - 2;
        int endPosition = position + 6;
        String workHourStart = line.substring(startPosition, endPosition);
        LocalTime startTime = LocalTime.parse(workHourStart, DateTimeFormatter.ofPattern("HH:mm:ss"));
        return startTime;
    }

    private static LocalTime printWorkHourEnd(String line) {
        int position = line.indexOf(":");
        int startPosition = position + 7;
        int endPosition = position + 15;
        String workHourEnd = line.substring(startPosition, endPosition);
        LocalTime endTime = LocalTime.parse(workHourEnd, DateTimeFormatter.ofPattern("HH:mm:ss"));
        return endTime;
    }

    private static String[] getFileLines(String fileName) {
        File myObj = new File(fileName);
        Scanner myReader = null;
        try {
            myReader = new Scanner(myObj);
            int lineCount = 0;
            while (myReader.hasNextLine()) {
                myReader.nextLine();
                lineCount++;
            }
            myReader.close();
// -------------------------------------------------
            myReader = new Scanner(myObj);
            String[] fileLines = new String[lineCount];
            for (int i = 0; i < fileLines.length; i++) {
                String line = myReader.nextLine();
                fileLines[i] = line;
            }
            return fileLines;
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
            return null;
        } finally {
            myReader.close();
        }
    }
}
