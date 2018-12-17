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
public class FlightTime {
    static SelectItem[] times=new SelectItem[]{
        new SelectItem("Anytime", "Anytime"),
        new SelectItem("Morning", "Morning"),
        new SelectItem("Afternoon", "Afternoon"),
        new SelectItem("Evening", "evening") };

    public static SelectItem[] getTimes() {
        return times;
    }

    public static void setTimes(SelectItem[] times) {
        FlightTime.times = times;
    }
    
}
