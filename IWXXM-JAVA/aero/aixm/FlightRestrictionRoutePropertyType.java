//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0-SNAPSHOT 
// See <a href="https://jaxb.java.net/">https://jaxb.java.net/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.05.22 at 02:50:00 PM HKT 
//


package aero.aixm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FlightRestrictionRoutePropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlightRestrictionRoutePropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMPropertyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1.1}FlightRestrictionRoute"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightRestrictionRoutePropertyType", propOrder = {
    "flightRestrictionRoute"
})
public class FlightRestrictionRoutePropertyType
    extends AbstractAIXMPropertyType
{

    @XmlElement(name = "FlightRestrictionRoute", required = true)
    protected FlightRestrictionRouteType flightRestrictionRoute;

    /**
     * Gets the value of the flightRestrictionRoute property.
     * 
     * @return
     *     possible object is
     *     {@link FlightRestrictionRouteType }
     *     
     */
    public FlightRestrictionRouteType getFlightRestrictionRoute() {
        return flightRestrictionRoute;
    }

    /**
     * Sets the value of the flightRestrictionRoute property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightRestrictionRouteType }
     *     
     */
    public void setFlightRestrictionRoute(FlightRestrictionRouteType value) {
        this.flightRestrictionRoute = value;
    }

}
