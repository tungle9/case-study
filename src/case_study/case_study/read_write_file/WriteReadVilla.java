package case_study.read_write_file;

import case_study.models.Customer;
import case_study.models.Villa;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class WriteReadVilla {
    public static File villaFile = new File("D:\\case_study\\src\\case_study\\case_study\\data\\villa.csv");


    public static void writeFile(List<Villa> villas) {

        try {
            FileWriter fileWriter = new FileWriter(villaFile);
            BufferedWriter bw = new BufferedWriter(fileWriter);


            for (Villa villa : villas) {
                bw.write(villa.toString());
                bw.newLine();
            }
            bw.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Villa> readFile() {
        List<Villa> list = new LinkedList<>();
        try {
            FileReader reader = new FileReader(villaFile);
            BufferedReader br = new BufferedReader(reader);
            String line = "";
            while (true) {
                line = br.readLine();
                if (line == null) {
                    break;
                }
                String[] txt = line.split(",");
                String maDichVu = txt[0];
                String dichVu = txt[1];
                double dienTich = Double.parseDouble(txt[2]);
                double chiPhi = Double.parseDouble(txt[3]);
                int soLuong = Integer.parseInt(txt[4]);
                String kieuThue = txt[5];
                String tieuChuan = txt[6];
                int soTang = Integer.parseInt(txt[7]);
                double hoBoi = Double.parseDouble(txt[8]);
                Villa villa = new Villa(maDichVu, dichVu, dienTich, chiPhi, soLuong, kieuThue
                        , tieuChuan, soTang, hoBoi);
                list.add(villa);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }
}

