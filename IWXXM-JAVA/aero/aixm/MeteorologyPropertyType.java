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
 * <p>Java class for MeteorologyPropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MeteorologyPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMPropertyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1.1}Meteorology"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeteorologyPropertyType", propOrder = {
    "meteorology"
})
public class MeteorologyPropertyType
    extends AbstractAIXMPropertyType
{

    @XmlElement(name = "Meteorology", required = true)
    protected MeteorologyType meteorology;

    /**
     * Gets the value of the meteorology property.
     * 
     * @return
     *     possible object is
     *     {@link MeteorologyType }
     *     
     */
    public MeteorologyType getMeteorology() {
        return meteorology;
    }

    /**
     * Sets the value of the meteorology property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeteorologyType }
     *     
     */
    public void setMeteorology(MeteorologyType value) {
        this.meteorology = value;
    }

}
