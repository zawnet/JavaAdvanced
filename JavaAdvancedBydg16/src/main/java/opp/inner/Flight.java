package opp.inner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Flight implements Comparable<Flight>, Iterable<Passenger>{

    private List<Passenger> passengerList = new ArrayList<>();
    @Override
    public int compareTo(Flight o) {
        return 0;
    }

    @Override
    public Iterator<Passenger> iterator() {
        return passengerList.iterator();
    }

    public Iterable<Passenger> getOrderedPassengers(){
       FlightIterable orderedPassengers = new FlightIterable();
       return orderedPassengers;
    }

    public Iterable<Passenger> getPremiumPassengers() {
        //return new PremiumPassengerIterable();
        Iterable<Passenger> premiumPassengerIterable = new Iterable<Passenger>() {
            @Override
            public Iterator<Passenger> iterator() {
                List<Passenger> premiumPassengers = new ArrayList<>();
                for (Passenger passenger : passengerList){
                    if(passenger.getRewardProgram().getMemberLevel() == 3){
                        premiumPassengers.add(passenger);
                    }
                }
                return premiumPassengers.iterator();
            }
        };
        return premiumPassengerIterable;
    };

    public void addPassenger(Passenger passenger) {
        passengerList.add(passenger);
    }

    private class FlightIterable implements Iterable<Passenger>{
        @Override
        public Iterator<Passenger> iterator() {
            Passenger[] passengers = new Passenger[passengerList.size()];
            passengerList.toArray(passengers);
            Arrays.sort(passengers);
            return Arrays.asList(passengers).iterator();
        }
    }
    private class PremiumPassengerIterable implements Iterable<Passenger> {

        @Override
        public Iterator<Passenger> iterator() {
            // TODO
            return null;
        }
    }
}
