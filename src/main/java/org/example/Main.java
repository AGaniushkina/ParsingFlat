package org.example;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

//import com.fasterxml.jackson.core.JsonParser;
public class Main {
    public static void main(String[] args) throws IOException
    {
        List<Flat> flats = new ArrayList<>();
        HashMap<Citizen, List<Calendar>> hm0 = new HashMap<>();
        List<Calendar> ls = new ArrayList<>(Arrays.asList(new GregorianCalendar(2017, 1, 25),
                new GregorianCalendar(2018, 4, 23)));
        hm0.put(new Citizen("Иванов", "Иван", "Иванович"), ls);
        HashMap<Citizen, List<Calendar>> hm00 = new HashMap<>();
        ls = new ArrayList<>(Arrays.asList(new GregorianCalendar(2017, 1, 25),
                new GregorianCalendar(2018, 4, 23)));
        hm00.put(new Citizen("Иванов", "Иван", "Иванович"), ls);
        flats.add(new Flat("г.Саратов, ул.Белоглинская, д.19, кв.34", 87.0, 90.0, 10,
                true, false, false, false, hm0, hm00));

        HashMap<Citizen, List<Calendar>> hm1 = new HashMap<>();
        ls = new ArrayList<>(Arrays.asList(new GregorianCalendar(2009, 9, 1),
                null));
        hm1.put(new Citizen("Ганюшкина", "Анна", "Вячеславовна"), ls);
        HashMap<Citizen, List<Calendar>> hm11 = new HashMap<>();
        ls = new ArrayList<>(Arrays.asList(new GregorianCalendar(2009, 9, 1),
                null));
        hm11.put(new Citizen("Ганюшкина", "Анна", "Вячеславовна"), ls);
        hm11.put(new Citizen("Ганюшкина", "Ксения", "Вячеславовна"), ls);
        flats.add(new Flat("г.Энгельс, ул.Краснодарская, д.18, кв.27", 87.0, 90.0, 10,
                true, false, false, false, hm1, hm11));

        HashMap<Citizen, List<Calendar>> hm2 = new HashMap<>();
        ls = new ArrayList<>(Arrays.asList(new GregorianCalendar(2017, 1, 25),
                new GregorianCalendar(2018, 4, 23)));
        hm2.put(new Citizen("Быков", "Иван", "Александрович"), ls);
        ls = new ArrayList<>(Arrays.asList(new GregorianCalendar(2018, 4, 23),
                new GregorianCalendar(2021, 11, 2)));
        hm2.put(new Citizen("Быков", "Влдаислав", "Иванович"), ls);
        HashMap<Citizen, List<Calendar>> hm22 = new HashMap<>();
        ls = new ArrayList<>(Arrays.asList(new GregorianCalendar(2017, 1, 25),
                new GregorianCalendar(2021, 11, 2)));
        hm22.put(new Citizen("Быков", "Владислав", "Иванович"), ls);
        flats.add(new Flat("г.Саратов, ул.Белоглинская, д.17, кв.1", 87.0, 87.0, 5,
                true, false, false, false, hm2, hm22));

        HashMap<Citizen, List<Calendar>> hm3 = new HashMap<>();
        ls = new ArrayList<>(Arrays.asList(new GregorianCalendar(2013, 9, 1),
                new GregorianCalendar(2022, 12, 31)));
        hm3.put(new Citizen("Смирнов", "Денис", "Сергеевич"), ls);
        HashMap<Citizen, List<Calendar>> hm33 = new HashMap<>();
        ls = new ArrayList<>(Arrays.asList(new GregorianCalendar(2013, 9, 1),
                new GregorianCalendar(2022, 12, 31)));
        hm33.put(new Citizen("Смирнов", "Данил", "Денисович"), ls);
        hm33.put(new Citizen("Смирнов", "Денис", "Сергеевич"), ls);
        flats.add(new Flat("г.Энгельс, ул.Ленинградская, д.35, кв.57", 110.0, 115.0, 7,
                true, false, false, false, hm3, hm33));

        HashMap<Citizen, List<Calendar>> hm4 = new HashMap<>();
        ls = new ArrayList<>(Arrays.asList(new GregorianCalendar(2013, 1, 7),
                new GregorianCalendar(2016, 8, 1)));
        hm4.put(new Citizen("Денисов", "Матвей", "Сергеевич"), ls);
        HashMap<Citizen, List<Calendar>> hm44 = new HashMap<>();
        ls = new ArrayList<>(Arrays.asList(new GregorianCalendar(2013, 1, 7),
                new GregorianCalendar(2016, 8, 1)));
        hm44.put(new Citizen("Денисов", "Матвей", "Сергеевич"), ls);
        flats.add(new Flat("г.Саратов, пл.Славянская, д.2, кв.45", 95.0, 97.0, 18,
                true, true, true, true, hm4, hm44));

        HashMap<Citizen, List<Calendar>> hm5 = new HashMap<>();
        ls = new ArrayList<>(Arrays.asList(new GregorianCalendar(2017, 1, 25),
                new GregorianCalendar(2018, 4, 23)));
        hm5.put(new Citizen("Иванов", "Степан", "Александрович"), ls);
        HashMap<Citizen, List<Calendar>> hm55 = new HashMap<>();
        ls = new ArrayList<>(Arrays.asList(new GregorianCalendar(2017, 1, 25),
                new GregorianCalendar(2018, 4, 23)));
        hm55.put(new Citizen("Иванов", "Степан", "Александрович"), ls);
        flats.add(new Flat("г.Саратов, ул.Чапаева, д.19, кв.45", 100.0, 105.0, 9,
                true, false, false, false, hm5, hm55));

        HashMap<Citizen, List<Calendar>> hm6 = new HashMap<>();
        ls = new ArrayList<>(Arrays.asList(new GregorianCalendar(2017, 1, 25),
                new GregorianCalendar(2023, 4, 23)));
        hm6.put(new Citizen("Федоров", "Иван", "Васильевич"), ls);
        HashMap<Citizen, List<Calendar>> hm66 = new HashMap<>();
        ls = new ArrayList<>(Arrays.asList(new GregorianCalendar(2017, 1, 25),
                new GregorianCalendar(2023, 4, 23)));
        hm66.put(new Citizen("Федоров", "Иван", "Васильевич"), ls);
        flats.add(new Flat("г.Саратов, ул.Белоглинская, д.18, кв.64", 87.0, 93.0, 10,
                true, false, false, false, hm6, hm66));

        HashMap<Citizen, List<Calendar>> hm7 = new HashMap<>();
        ls = new ArrayList<>(Arrays.asList(new GregorianCalendar(2017, 1, 25),
                new GregorianCalendar(2018, 4, 23)));
        hm7.put(new Citizen("Иванов", "Иван", "Иванович"), ls);
        HashMap<Citizen, List<Calendar>> hm77 = new HashMap<>();
        ls = new ArrayList<>(Arrays.asList(new GregorianCalendar(2017, 1, 25),
                new GregorianCalendar(2018, 4, 23)));
        hm77.put(new Citizen("Иванов", "Иван", "Иванович"), ls);
        flats.add(new Flat("г.Саратов, ул.Белоглинская, д.18", 87.0, 90.0, 10,
                true, false, false, false, hm7, hm77));

        HashMap<Citizen, List<Calendar>> hm8 = new HashMap<>();
        ls = new ArrayList<>(Arrays.asList(new GregorianCalendar(2000, 1, 25),
                new GregorianCalendar(2018, 4, 23)));
        hm8.put(new Citizen("Степанов", "Данил", "Иванович"), ls);
        HashMap<Citizen, List<Calendar>> hm88 = new HashMap<>();
        ls = new ArrayList<>(Arrays.asList(new GregorianCalendar(2000, 1, 25),
                new GregorianCalendar(2018, 4, 23)));
        hm88.put(new Citizen("Степанов", "Данил", "Иванович"), ls);
        flats.add(new Flat("г.Саратов, ул.рахова, д.75, кв.90", 55.0, 60.0, 4,
                false, false, true, true, hm8, hm88));

        HashMap<Citizen, List<Calendar>> hm9 = new HashMap<>();
        ls = new ArrayList<>(Arrays.asList(new GregorianCalendar(2000, 2, 2),
                null));
        hm9.put(new Citizen("Ганюшкин", "Валерий", "Николаевич"), ls);
        HashMap<Citizen, List<Calendar>> hm99 = new HashMap<>();
        ls = new ArrayList<>(Arrays.asList(new GregorianCalendar(2000, 2, 2),
                null));
        hm99.put(new Citizen("Ганюшкина", "Валерий", "Николаевич"), ls);
        hm99.put(new Citizen("Ганюшкина", "Ольга", "Константиновна"), ls);
        ls = new ArrayList<>(Arrays.asList(new GregorianCalendar(2005, 5, 5),
                null));
        hm99.put(new Citizen("Ганюшкина", "Вячеслав", "Валериевич"), ls);
        flats.add(new Flat("г.Энгельс, пр-т.Строителей, д.9, кв.185", 100.0, 112.0, 4,
                true, false, false, false, hm9, hm99));

        HashMap<Citizen, List<Calendar>> hm10 = new HashMap<>();
        ls = new ArrayList<>(Arrays.asList(new GregorianCalendar(1970, 1, 27),
                new GregorianCalendar(2018, 4, 23)));
        hm10.put(new Citizen("Петров", "Петр", "Петрович"), ls);
        HashMap<Citizen, List<Calendar>> hm1010 = new HashMap<>();
        ls = new ArrayList<>(Arrays.asList(new GregorianCalendar(1970, 1, 27),
                new GregorianCalendar(2000, 9, 30)));
        hm1010.put(new Citizen("Петров", "Петр", "Петрович"), ls);
        ls = new ArrayList<>(Arrays.asList(new GregorianCalendar(2000, 11, 10),
                new GregorianCalendar(2018, 4, 23)));
        hm1010.put(new Citizen("Семенов", "Семен", "Семенович"), ls);
        flats.add(new Flat("г.Саратов, ул.Вольская, д.82", 87.0, 90.0, 3,
                true, false, false, false, hm10, hm1010));

        HashMap<Citizen, List<Calendar>> hm111 = new HashMap<>();
        ls = new ArrayList<>(Arrays.asList(new GregorianCalendar(2008, 4, 30),
                new GregorianCalendar(2010, 12, 12)));
        hm111.put(new Citizen("Астафьев", "Максим", "Олегович"), ls);
        ls = new ArrayList<>(Arrays.asList(new GregorianCalendar(2010, 12, 12),
                null));
        hm111.put(new Citizen("Никифоров", "Семен", "Алексеевич"), ls);
        HashMap<Citizen, List<Calendar>> hm1111 = new HashMap<>();
        ls = new ArrayList<>(Arrays.asList(new GregorianCalendar(2010, 12, 12),
                null));
        hm1111.put(new Citizen("Никифоров", "Семен", "Алексеевич"), ls);
        flats.add(new Flat("г.Саратов, ул.Зарубина, д.132/138, кв.164", 80.0, 85.0, 4,
                true, false, false, false, hm111, hm1111));


        ObjectMapper objectMapper = new ObjectMapper();
//        objectMapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
//        objectMapper.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);
//        ObjectWriter writer = objectMapper.writer(new DefaultPrettyPrinter());
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
        objectMapper.writeValue(new File("flats.json"), flats);

        String result = objectMapper.writeValueAsString(flats);
        System.out.println(result);

//        for (Flat flat :flats)
//            System.out.println(flat);

//        byte[] jsonData = Files.readAllBytes(Paths.get("flats.json"));
//        ObjectMapper mapperBack = new ObjectMapper();
//        Flat[] resultBack = mapperBack.readValue(jsonData, Flat[].class);
//        for (Flat flat :resultBack)
//            System.out.println(flat);

        List<Flat> RegisteredPersons = new ArrayList<>();
        List<Flat> FlatWithParking = new ArrayList<>();
        List<Flat> FlatsBySpace = new ArrayList<>();
        List<Flat> FlatsByFloor = new ArrayList<>();


        System.out.println("Квартиры с парковочным местом:\n");


        FlatWithParking =  flats.stream()
                .filter(f -> f.getParkingSpace())
                .collect(Collectors.toList());

        for (Flat flat: FlatWithParking){
            System.out.println(flat);
        }

        System.out.println('\n');

        System.out.println("Список квартир отсортированных по общей площади:\n");

       FlatsBySpace = flats.stream()
               .sorted(Comparator.comparing(Flat::getTotalFloorSpace)).toList();

         for (Flat flat: FlatsBySpace){
           System.out.println(flat);
         }

        System.out.println('\n');

//        System.out.println("Список прописанных людей:\n");
//
//
//        RegisteredPersons = flats.stream()
//                 .collect(Collectors.toList());
//
//        for(Flat flat: RegisteredPersons){
//            System.out.println(flat.getRegisteredPersons().keySet() + " adress: " + flat.getAdress());
//        }
//
//        System.out.println('\n');
        System.out.println("Список квартир на определенном этаже:\n");

        FlatsByFloor =  flats.stream()
                .filter(f -> f.getFloor() == 10)
                .collect(Collectors.toList());

        for (Flat flat: FlatsByFloor){
            System.out.println(flat);
        }

        System.out.println('\n');


        //List<Citizen> citizens = new ArrayList<>();
        System.out.println("Список прописанных людей:\n");

        Map<String, List<Flat>> citizens = flats.stream()
                .collect(Collectors.groupingBy(f ->
                String.join(" ",
                        ((Flat) f).getRegisteredPersons().keySet().toString(),
                        ((Flat) f).getAdress())));

        for ( String citize: citizens.keySet()){
            System.out.println(citize);
        }

//        System.out.println('\n');
//        System.out.println("Список прописанных людей:\n");
//
//        for ( List<Flat> citiz: citizens.values()){
//            System.out.println(citiz);
//        }

    }
}