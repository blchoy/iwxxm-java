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
 * <p>Java class for ApproachAltitudeTablePropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ApproachAltitudeTablePropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMPropertyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1.1}ApproachAltitudeTable"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApproachAltitudeTablePropertyType", propOrder = {
    "approachAltitudeTable"
})
public class ApproachAltitudeTablePropertyType
    extends AbstractAIXMPropertyType
{

    @XmlElement(name = "ApproachAltitudeTable", required = true)
    protected ApproachAltitudeTableType approachAltitudeTable;

    /**
     * Gets the value of the approachAltitudeTable property.
     * 
     * @return
     *     possible object is
     *     {@link ApproachAltitudeTableType }
     *     
     */
    public ApproachAltitudeTableType getApproachAltitudeTable() {
        return approachAltitudeTable;
    }

    /**
     * Sets the value of the approachAltitudeTable property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApproachAltitudeTableType }
     *     
     */
    public void setApproachAltitudeTable(ApproachAltitudeTableType value) {
        this.approachAltitudeTable = value;
    }

}
