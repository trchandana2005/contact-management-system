package com.parking.dao;
// test pipeline
import com.parking.model.ParkingSlot;
import java.util.*;

public class ParkingDAO {

    private static List<ParkingSlot> slots = new ArrayList<>();

    static {
        for(int i=1;i<=5;i++){
            ParkingSlot s = new ParkingSlot();
            s.setSlotId(i);
            s.setOccupied(false);
            slots.add(s);
        }
    }

    // Park vehicle
    public String parkVehicle(String vehicleNo) {
        for(ParkingSlot s : slots){
            if(!s.isOccupied()){
                s.setOccupied(true);
                s.setVehicleNumber(vehicleNo);
                return "Parked at slot " + s.getSlotId();
            }
        }
        return "Parking Full";
    }

    // Remove vehicle
    public String removeVehicle(int slotId){
        for(ParkingSlot s : slots){
            if(s.getSlotId() == slotId){
                s.setOccupied(false);
                s.setVehicleNumber(null);
                return "Vehicle removed";
            }
        }
        return "Invalid slot";
    }

    // View available slots
    public List<ParkingSlot> getAllSlots(){
        return slots;
    }
}

    // DELETE
    public void deleteContact(int id) {
        contacts.removeIf(c -> c.getId() == id);
    }
}