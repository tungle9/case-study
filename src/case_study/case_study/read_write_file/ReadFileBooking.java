package case_study.read_write_file;

import case_study.models.Booking;

import java.io.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class ReadFileBooking {
    private static File bookingFile = new File("case_study\\data\\booking.csv");

    public static void writeFile(Set<Booking> bookings) {
        try {
            FileWriter fileWriter = new FileWriter(bookingFile);
            BufferedWriter bw = new BufferedWriter(fileWriter);


            for (Booking booking : bookings) {
                bw.write(booking.toString());
                bw.newLine();
            }

            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<String> readFile() {
        List<String> list = new LinkedList<>();
        try {
            FileReader reader = new FileReader(bookingFile);
            BufferedReader br = new BufferedReader(reader);
            String line;
            while ((line = br.readLine()) != null) {
                String []read = line.split(",");
                Booking booking = new Booking();
                list.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }
}
