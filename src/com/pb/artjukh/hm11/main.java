package com.pb.artjukh.hm11;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.module.SimpleModule;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class main {
    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        //ObjectMapper mapper=new ObjectMapper();
        // для работы с полями типа LocalDate
        SimpleModule module = new SimpleModule();
        module.addSerializer(LocalDate.class, new LocalDateSerializer());
        module.addDeserializer(LocalDate.class, new LocalDateDeserializer());
        mapper.registerModule(module);
//////////////
        List<adonent> abonents = Arrays.asList(
           new adonent("name1","01","adr1",LocalDate.of(2000,5,1),
                   LocalDate.of(2021,6,2)));

        String personsJson = mapper.writeValueAsString(abonents);
        System.out.println(personsJson);
    }
}
