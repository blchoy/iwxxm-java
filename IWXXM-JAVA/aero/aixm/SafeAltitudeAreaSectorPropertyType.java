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
 * <p>Java class for SafeAltitudeAreaSectorPropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SafeAltitudeAreaSectorPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMPropertyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1.1}SafeAltitudeAreaSector"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SafeAltitudeAreaSectorPropertyType", propOrder = {
    "safeAltitudeAreaSector"
})
public class SafeAltitudeAreaSectorPropertyType
    extends AbstractAIXMPropertyType
{

    @XmlElement(name = "SafeAltitudeAreaSector", required = true)
    protected SafeAltitudeAreaSectorType safeAltitudeAreaSector;

    /**
     * Gets the value of the safeAltitudeAreaSector property.
     * 
     * @return
     *     possible object is
     *     {@link SafeAltitudeAreaSectorType }
     *     
     */
    public SafeAltitudeAreaSectorType getSafeAltitudeAreaSector() {
        return safeAltitudeAreaSector;
    }

    /**
     * Sets the value of the safeAltitudeAreaSector property.
     * 
     * @param value
     *     allowed object is
     *     {@link SafeAltitudeAreaSectorType }
     *     
     */
    public void setSafeAltitudeAreaSector(SafeAltitudeAreaSectorType value) {
        this.safeAltitudeAreaSector = value;
    }

}
