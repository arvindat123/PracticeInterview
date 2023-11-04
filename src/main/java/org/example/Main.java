package org.example;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};




       /* String s = "arvind aarabhbabu buby";
        Optional<Integer> p = Stream.of(s).map(q ->  q.split(" "))
                .flatMap(t -> Arrays.stream(t))
                .map(i -> i.length())
                .max((y,u)->y-u);
        System.out.println(p.get());
*/

    /*    long p = Stream.of(s).map(q ->  q.split(" "))
                .flatMap(t -> Arrays.stream(t))
                .map(i -> i.length())
                        .mapToInt(j -> j)
                                .sum();
        System.out.println(p);*/

        Map<Integer,String> map = new ConcurrentHashMap<>();
        map.put(1,"arvind");
        map.put(2, "Buby");
        map.put(3,"aarabh");
        // Iterator<Integer> it = map.keySet().iterator();
        Iterator<Map.Entry<Integer,String>>    it = map.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry<Integer,String>  a= it.next();
            System.out.println(a.getKey() + " "+ a.getValue());
            // map.remove(1,"buby");
            //System.out.println(" -- "+map.get(it.next()));
            //it.remove();
            //  map.put(4,"buby");
        }

        /*Map<Integer,String> map = new HashMap<>();
        map.put(1,"arvind");
        map.put(2, "Buby");
        map.put(3,"aarabh");
        Iterator<Integer> it = map.keySet().iterator();
        while(it.hasNext()){
            System.out.println(" -- "+map.get(it.next()));
           //it.remove();
            map.put(4,"buby");
        }*/

        //Stream.iterate(0, i->i+1).limit(10).forEach(System.out::println);
        //IntStream.rangeClosed(1,10).forEach(System.out::println);

    /*    Optional<Integer> out = Arrays.stream(arr).boxed().sorted().skip(1).findFirst();
        if(out.isPresent()){
            System.out.println(out.get());
        }*/

       /* Optional<Integer> n1 = Arrays.stream(arr).boxed().sorted().skip(2).findFirst();
        n1.ifPresent(i -> System.out.println(i));

        List<String> list = Arrays.asList("arvind","buby","aarabh");
        List<Integer> out =  list.stream().map(String::length).collect(Collectors.toList());
        System.out.println(out);
        */

    }


}