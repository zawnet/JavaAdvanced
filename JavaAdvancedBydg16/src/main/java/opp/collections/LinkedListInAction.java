package opp.collections;

import java.util.*;

public class LinkedListInAction {
    public static void main(String[] args) {
        List list = new LinkedList();
        list.add("Red");
        list.add("Green");
        list.add("Blue");
        System.out.println(list);
        for (Object o : list){
            System.out.println(o);
        }

        for (int i = 0; i < list.size(); i++){
            System.out.println("Element at index "+ i + " = "+list.get(i));
        }

        System.out.println("First element = "+ ((LinkedList)list).getFirst());
        System.out.println("Last element = "+ ((LinkedList)list).getLast());

        list.set(1,"Oraneg");
        list.remove(1);
        System.out.println(list);

        list.remove("Blue");
        System.out.println(list);

        list.add("Green");
        list.add("Blue");
        list.add("Orange");
        list.add("Purple");

        Collections.sort(list);
        System.out.println(list);

        //Mieszanie listy
        Collections.shuffle(list);
        System.out.println(list);

        //przywracanie
        Collections.reverse(list);
        System.out.println(list);

        List list1 = new LinkedList();
        list1.add("Red");
        list1.add("Green");
        list1.add("Blue");

        List list2 = new LinkedList();
        list2.add("Orange");
        list2.add("Purple");
        list2.add("Yellow");

        List a  = new ArrayList();
        System.out.println(a);
        System.out.println(a.isEmpty());

        a.addAll(list1);
        a.addAll(list2);

        System.out.println(a);
        System.out.println(a.isEmpty());

        a.removeAll(list1);
        System.out.println(a);

//        for(int i = 0; i< a.size(); i++){
//            if(a.get(i).equals("PPurple")){
//                a.remove(i);
//            }
//        }
//
//        for (Object obj : a){
//            if(obj.equals("Purple")){
//                a.remove(obj);
//            }
//        }

        ListIterator iterator = list.listIterator();
        while (iterator.hasNext()){
            if("Purple".equals(iterator.next())){
                iterator.remove();
            }
        }

    }
}
