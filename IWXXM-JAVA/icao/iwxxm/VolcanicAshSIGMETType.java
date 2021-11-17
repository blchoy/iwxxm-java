//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0-SNAPSHOT 
// See <a href="https://jaxb.java.net/">https://jaxb.java.net/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.11.10 at 05:15:57 PM HKT 
//


package icao.iwxxm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import def.wmo.metce.VolcanoPropertyType;


/**
 * <p>Java class for VolcanicAshSIGMETType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VolcanicAshSIGMETType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://icao.int/iwxxm/2021-2}SIGMETType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="eruptingVolcano" type="{http://def.wmo.int/metce/2013}VolcanoPropertyType" minOccurs="0"/&gt;
 *         &lt;element name="volcanicAshMovedToFIR" type="{http://icao.int/iwxxm/2021-2}AirspacePropertyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VolcanicAshSIGMETType", propOrder = {
    "eruptingVolcano",
    "volcanicAshMovedToFIR"
})
public class VolcanicAshSIGMETType
    extends SIGMETType
{

    protected VolcanoPropertyType eruptingVolcano;
    protected AirspacePropertyType volcanicAshMovedToFIR;

    /**
     * Gets the value of the eruptingVolcano property.
     * 
     * @return
     *     possible object is
     *     {@link VolcanoPropertyType }
     *     
     */
    public VolcanoPropertyType getEruptingVolcano() {
        return eruptingVolcano;
    }

    /**
     * Sets the value of the eruptingVolcano property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolcanoPropertyType }
     *     
     */
    public void setEruptingVolcano(VolcanoPropertyType value) {
        this.eruptingVolcano = value;
    }

    /**
     * Gets the value of the volcanicAshMovedToFIR property.
     * 
     * @return
     *     possible object is
     *     {@link AirspacePropertyType }
     *     
     */
    public AirspacePropertyType getVolcanicAshMovedToFIR() {
        return volcanicAshMovedToFIR;
    }

    /**
     * Sets the value of the volcanicAshMovedToFIR property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirspacePropertyType }
     *     
     */
    public void setVolcanicAshMovedToFIR(AirspacePropertyType value) {
        this.volcanicAshMovedToFIR = value;
    }

}
