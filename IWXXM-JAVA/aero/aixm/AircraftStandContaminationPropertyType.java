//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0-SNAPSHOT 
// See <a href="https://jaxb.java.net/">https://jaxb.java.net/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.11.10 at 05:15:57 PM HKT 
//


package aero.aixm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AircraftStandContaminationPropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AircraftStandContaminationPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMPropertyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1.1}AircraftStandContamination"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AircraftStandContaminationPropertyType", propOrder = {
    "aircraftStandContamination"
})
public class AircraftStandContaminationPropertyType
    extends AbstractAIXMPropertyType
{

    @XmlElement(name = "AircraftStandContamination", required = true)
    protected AircraftStandContaminationType aircraftStandContamination;

    /**
     * Gets the value of the aircraftStandContamination property.
     * 
     * @return
     *     possible object is
     *     {@link AircraftStandContaminationType }
     *     
     */
    public AircraftStandContaminationType getAircraftStandContamination() {
        return aircraftStandContamination;
    }

    /**
     * Sets the value of the aircraftStandContamination property.
     * 
     * @param value
     *     allowed object is
     *     {@link AircraftStandContaminationType }
     *     
     */
    public void setAircraftStandContamination(AircraftStandContaminationType value) {
        this.aircraftStandContamination = value;
    }

}