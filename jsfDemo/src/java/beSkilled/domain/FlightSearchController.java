/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beSkilled.domain;

import beSkilled.FlightSearch;
import javax.annotation.ManagedBean;
import javax.faces.bean.SessionScoped;
import oracle.jrockit.jfr.parser.FLREvent;

/**
 *
 * @author User
 */
@ManagedBean
@SessionScoped
public class FlightSearchController {
    private FlightSearch flight;
    public  FlightSearch getFlight(){
        if (flight == null) {
            flight=new FlightSearch();
            
        }
        return flight;
    }

    public void setFlight(FlightSearch flight) {
        this.flight = flight;
    }
   
}
