package com.pb.artjukh.hm12;

import java.util.Scanner;


import static com.pb.artjukh.hm12.action12.*;

public class main12 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.println("Выберите действие, указв номер пункта меню:"+"\n"+
                "1. Добавить контакт"+"\n"+"2. Удалить конакт"+"\n"+"3. Поиск"+"\n"+
                "4.Сортировка"+"\n"+"5.Редактировать контакт"+"\n"+"6. Записать в файл"+"\n"+"7. Считать с файла"+"\n"+"0.Выход");


        while (sc.hasNext()) {
            int select = 0;
            if (sc.hasNextInt()) {
                select = sc.nextInt();
            }
            switch (select) {

                case 1:

                    add12();

                    break;
                case 2:

                    dell12();
                    break;
                case 3:
                    find12();
                    break;
                case 4:
                    sort12();

                    break;
                case 5:
                    edit12();
                    break;
                case 6:
                    wtofile12();
                    break;
                case 7:
                    rffile12();
                    break;

                case 0:
                    System.out.println("Выходим...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Выберите пункт меню");


            }

            System.out.println("Выберите действие, указв номер пункта меню:"+"\n"+
                    "1. Добавить контакт"+"\n"+"2. Удалить конакт"+"\n"+"3. Поиск"+"\n"+
                    "4.Сортировка"+"\n"+"5.Редактировать контакт"+"\n"+"6. Записать в файл"+"\n"+"7. Считать с файла"+"\n"+"0.Выход");
        }

//        List persons2 = mapper.readValue(personsJson, List.class);
//        System.out.println(persons2);


        //objectOutputStream.close();
    }
}
