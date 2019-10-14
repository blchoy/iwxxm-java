//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.10.09 at 01:48:28 AM UTC 
//


package icao.iwxxm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.LengthType;
import net.opengis.gml.MeasureType;


/**
 * <p>Java class for AerodromeSeaStateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AerodromeSeaStateType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="seaSurfaceTemperature" type="{http://www.opengis.net/gml/3.2}MeasureType"/&gt;
 *         &lt;element name="significantWaveHeight" type="{http://www.opengis.net/gml/3.2}LengthType" minOccurs="0"/&gt;
 *         &lt;element name="seaState" type="{http://icao.int/iwxxm/2.1}SeaSurfaceStateType" minOccurs="0"/&gt;
 *         &lt;element name="extension" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AerodromeSeaStateType", propOrder = {
    "seaSurfaceTemperature",
    "significantWaveHeight",
    "seaState",
    "extension"
})
public class AerodromeSeaStateType {

    @XmlElement(required = true)
    protected MeasureType seaSurfaceTemperature;
    protected LengthType significantWaveHeight;
    protected SeaSurfaceStateType seaState;
    protected List<Object> extension;

    /**
     * Gets the value of the seaSurfaceTemperature property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getSeaSurfaceTemperature() {
        return seaSurfaceTemperature;
    }

    /**
     * Sets the value of the seaSurfaceTemperature property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setSeaSurfaceTemperature(MeasureType value) {
        this.seaSurfaceTemperature = value;
    }

    /**
     * Gets the value of the significantWaveHeight property.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getSignificantWaveHeight() {
        return significantWaveHeight;
    }

    /**
     * Sets the value of the significantWaveHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setSignificantWaveHeight(LengthType value) {
        this.significantWaveHeight = value;
    }

    /**
     * Gets the value of the seaState property.
     * 
     * @return
     *     possible object is
     *     {@link SeaSurfaceStateType }
     *     
     */
    public SeaSurfaceStateType getSeaState() {
        return seaState;
    }

    /**
     * Sets the value of the seaState property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeaSurfaceStateType }
     *     
     */
    public void setSeaState(SeaSurfaceStateType value) {
        this.seaState = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extension property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtension().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getExtension() {
        if (extension == null) {
            extension = new ArrayList<Object>();
        }
        return this.extension;
    }

}