/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beSkilled;

import javax.faces.model.SelectItem;

/**
 *
 * @author Mostafizur
 */
public class FlightType {
    static  SelectItem[] tripTypes=new SelectItem[]{
    new SelectItem("Roundtrip","Roundtrip"),
    new SelectItem("One way","One way")};

    public static SelectItem[] getTripTypes() {
        return tripTypes;
    }

    public static void setTripTypes(SelectItem[] tripTypes) {
        FlightType.tripTypes = tripTypes;
    }
    
    
}
