package case_study.read_write_file;

import case_study.models.Customer;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class WriteReadCustomer {
    public static File FILE = new File("case_study\\data\\customer.csv");


    public static void writeFile(List<Customer> customers) {
        try {
            FileWriter fileWriter = new FileWriter(FILE);
            BufferedWriter bw = new BufferedWriter(fileWriter);

            for (Customer customer : customers) {
                bw.write(customer.customerString());
                bw.newLine();
            }
            bw.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

//    public static List<Customer> readFile() {
//        List<Customer> list = new LinkedList<>();
//        try {
//            FileReader reader = new FileReader(FILE);
//            BufferedReader br = new BufferedReader(reader);
//            String line = "";
//            while (true) {
//                line=br.readLine();
//                if(line == null){
//                    break;
//                }
//                String  []txt = line.split(",");
//                String name  = txt[0];
//                String born = txt[1];
//                String gender = txt[2];
//                int cmnd = Integer.parseInt(txt[3]);
//                int sdt = Integer.parseInt(txt[4]);
//                String email = txt[5];
//                String typeOfCustomer = txt[6];
//                String address = txt[7];
//                int customerCode = Integer.parseInt(txt[8]);
//                Customer customer = new Customer(name,born,gender,cmnd,sdt,email
//                        ,typeOfCustomer,address,customerCode);
//                list.add(customer);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return list;
//    }
}
