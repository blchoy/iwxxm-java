//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0-SNAPSHOT 
// See <a href="https://jaxb.java.net/">https://jaxb.java.net/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.11.10 at 05:15:57 PM HKT 
//


package aero.aixm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PassengerLoadingBridgeTimeSlicePropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PassengerLoadingBridgeTimeSlicePropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1.1}PassengerLoadingBridgeTimeSlice"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.opengis.net/gml/3.2}OwnershipAttributeGroup"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PassengerLoadingBridgeTimeSlicePropertyType", propOrder = {
    "passengerLoadingBridgeTimeSlice"
})
public class PassengerLoadingBridgeTimeSlicePropertyType {

    @XmlElement(name = "PassengerLoadingBridgeTimeSlice", required = true)
    protected PassengerLoadingBridgeTimeSliceType passengerLoadingBridgeTimeSlice;
    @XmlAttribute(name = "owns")
    protected Boolean owns;

    /**
     * Gets the value of the passengerLoadingBridgeTimeSlice property.
     * 
     * @return
     *     possible object is
     *     {@link PassengerLoadingBridgeTimeSliceType }
     *     
     */
    public PassengerLoadingBridgeTimeSliceType getPassengerLoadingBridgeTimeSlice() {
        return passengerLoadingBridgeTimeSlice;
    }

    /**
     * Sets the value of the passengerLoadingBridgeTimeSlice property.
     * 
     * @param value
     *     allowed object is
     *     {@link PassengerLoadingBridgeTimeSliceType }
     *     
     */
    public void setPassengerLoadingBridgeTimeSlice(PassengerLoadingBridgeTimeSliceType value) {
        this.passengerLoadingBridgeTimeSlice = value;
    }

    /**
     * Gets the value of the owns property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isOwns() {
        if (owns == null) {
            return false;
        } else {
            return owns;
        }
    }

    /**
     * Sets the value of the owns property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOwns(Boolean value) {
        this.owns = value;
    }

}
