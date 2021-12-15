package com.pb.artjukh.hm12;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.module.SimpleModule;

import java.io.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;


public class action  {

    private static  LocalDateTime ldt = LocalDateTime.now();
    private static List<abonent> abonents2 = new ArrayList<>();
    private static ObjectMapper mapper = new ObjectMapper();

    static class SortByName implements Comparator<abonent> {

        public int compare(abonent a, abonent b) {
            return a.getName().compareTo(b.getName());
        }
    }
    static class SortByAdr implements Comparator<abonent> {

        public int compare(abonent a, abonent b) {
            return a.getAddress().compareTo(b.getAddress());
        }
    }


    public static void add() throws IOException {
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        SimpleModule module = new SimpleModule();
        module.addSerializer(LocalDate.class, new LocalDateSerializer());
        module.addDeserializer(LocalDate.class, new LocalDateDeserializer());
        mapper.registerModule(module);

        Scanner sc2 = new Scanner(System.in);

        abonent abonent1 = new abonent();
        System.out.println("Введите имя:");
        abonent1.setName(sc2.nextLine());
        System.out.println("Введите номер:");
        abonent1.setPhone(sc2.nextLine());
        System.out.println("Введите адресс:");
        abonent1.setAddress(sc2.nextLine());
        System.out.println("Введите д.р d/MM/yyyy:");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
        String q = sc2.nextLine();
        LocalDate date = LocalDate.parse(q, formatter);
        abonent1.setDateOfBirth(date);
        abonent1.setDateOfChange(ldt.toString());
  abonents2.add(new abonent(abonent1.getName(), abonent1.getPhone(), abonent1.getAddress(), abonent1.getDateOfBirth(), abonent1.getDateOfChange()));

        String personsJson = mapper.writeValueAsString(abonents2);
        System.out.println(personsJson);


    }

    public static void dell() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите имя контакта для удаления");
        System.out.println(abonents2.toString());
        String name2 = sc.next();
        for (abonent name1 : abonents2) {
            if (name1.getName().equals(name2))
                abonents2.remove(name1);
            System.out.println(abonents2.toString());
        }

    }

    public static void find() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Поиск по имени .");
        System.out.println("2. Поиск по номеру/a через пробел.");
        int res = sc.nextInt();
        switch (res) {
            case 1: {
                System.out.println("Введите имя контакта:");
                String name2 = sc.next();
                for (abonent x : abonents2) {
                    if (x.getName().equals(name2))
                        System.out.println(x);
                }
                break;
            }
            case 2: {
                System.out.println("Введите номер телефона:");
                String nom = sc.next();
                for (abonent x : abonents2) {
                    if (x.getPhone().equals(nom))
                        System.out.println(x);
                }
                break;
            }
            default:
                System.out.println("Введите 1 или 2");
        }

    }
    public static void sort (){

        Scanner sc = new Scanner(System.in);
        System.out.println("1. Сортировка по имени.");
        System.out.println("2. Сортировка по адрессу.");
        int res = sc.nextInt();
        switch (res) {
            case 1: {
                Collections.sort(abonents2, new SortByName());
                System.out.println(abonents2.toString());
                break;
            }
            case 2: {

                Collections.sort(abonents2, new SortByAdr());
                System.out.println(abonents2.toString());
                break;
            }
            default:
                System.out.println("Введите 1 или 2");
        }
    }
    public static void edit() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите имя контакта:");
        String name2 = sc.next();

        for (abonent x : abonents2) {
            if (x.getName().equals(name2))
                abonents2.remove(x);
            abonent abonent1 = new abonent();
           abonent1.setName(name2);
            System.out.println("Введите номер:/a через пробел");
            abonent1.setPhone(sc.next());
            System.out.println("Введите адресс:");
            abonent1.setAddress(sc.next());
            System.out.println("Введите д.р d/MM/yyyy:");
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
            String q = sc.next();
            LocalDate date = LocalDate.parse(q, formatter);
            abonent1.setDateOfBirth(date);
            abonent1.setDateOfChange(ldt.toString());
            abonents2.add(new abonent(abonent1.getName(), abonent1.getPhone(), abonent1.getAddress(), abonent1.getDateOfBirth(), abonent1.getDateOfChange()));

            String personsJson = null;
            try {
                personsJson = mapper.writeValueAsString(abonents2);
            } catch (JsonProcessingException e) {
                e.printStackTrace();
            }
            System.out.println(personsJson);

        }
    }
    public static void wtofile () throws IOException {
       mapper.enable(SerializationFeature.INDENT_OUTPUT);
       SimpleModule module = new SimpleModule();
        module.addSerializer(LocalDate.class, new LocalDateSerializer());
        module.addDeserializer(LocalDate.class, new LocalDateDeserializer());
        mapper.registerModule(module);
        String json=mapper.writeValueAsString(abonents2);
        try (Writer writer = new FileWriter("files/1.json")){
            writer.write(json);
        } catch (Exception e){e.getStackTrace();}
    }
    public static void rffile () throws Exception {

        BufferedReader reader = new BufferedReader( new FileReader ("files/1.json"));
        String line = null;
        StringBuilder stringBuilder = new StringBuilder();
        String ls = System.getProperty("line.separator");
        while( ( line = reader.readLine() ) != null ) {
            stringBuilder.append( line );
            stringBuilder.append( ls );
        }
        stringBuilder.deleteCharAt(stringBuilder.length()-1);
        System.out.println(stringBuilder.toString());

    }

}