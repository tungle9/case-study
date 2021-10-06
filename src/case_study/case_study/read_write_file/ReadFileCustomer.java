package case_study.read_write_file;

import case_study.models.Booking;
import case_study.models.Customer;

import java.io.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class ReadFileCustomer {
    private static File customerFile = new File("case_study\\data\\customer.csv");

    public static void writeFile(List<Customer> customers) {
        try {
            FileWriter fileWriter = new FileWriter(customerFile);
            BufferedWriter bw = new BufferedWriter(fileWriter);


            for (Customer customer : customers) {
                bw.write(customer.toString());
                bw.newLine();
            }

            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Customer> readFile() {
        List<Customer> list = new LinkedList<>();
        try {
            FileReader reader = new FileReader(customerFile);
            BufferedReader br = new BufferedReader(reader);
            String line;
            while ((line = br.readLine()) != null) {
                String []read = line.split(",");
                Customer customer = new Customer(read[0],read[1],read[2],Integer.parseInt(read[3]),);
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
