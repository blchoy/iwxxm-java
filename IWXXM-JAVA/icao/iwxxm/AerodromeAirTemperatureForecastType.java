//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.10.14 at 03:52:52 AM UTC 
//


package icao.iwxxm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.MeasureType;
import net.opengis.gml.TimeInstantPropertyType;


/**
 * <p>Java class for AerodromeAirTemperatureForecastType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AerodromeAirTemperatureForecastType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="maximumAirTemperature" type="{http://www.opengis.net/gml/3.2}MeasureType"/&gt;
 *         &lt;element name="maximumAirTemperatureTime" type="{http://www.opengis.net/gml/3.2}TimeInstantPropertyType"/&gt;
 *         &lt;element name="minimumAirTemperature" type="{http://www.opengis.net/gml/3.2}MeasureType"/&gt;
 *         &lt;element name="minimumAirTemperatureTime" type="{http://www.opengis.net/gml/3.2}TimeInstantPropertyType"/&gt;
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
@XmlType(name = "AerodromeAirTemperatureForecastType", propOrder = {
    "maximumAirTemperature",
    "maximumAirTemperatureTime",
    "minimumAirTemperature",
    "minimumAirTemperatureTime",
    "extension"
})
public class AerodromeAirTemperatureForecastType {

    @XmlElement(required = true)
    protected MeasureType maximumAirTemperature;
    @XmlElement(required = true)
    protected TimeInstantPropertyType maximumAirTemperatureTime;
    @XmlElement(required = true)
    protected MeasureType minimumAirTemperature;
    @XmlElement(required = true)
    protected TimeInstantPropertyType minimumAirTemperatureTime;
    protected List<Object> extension;

    /**
     * Gets the value of the maximumAirTemperature property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getMaximumAirTemperature() {
        return maximumAirTemperature;
    }

    /**
     * Sets the value of the maximumAirTemperature property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setMaximumAirTemperature(MeasureType value) {
        this.maximumAirTemperature = value;
    }

    /**
     * Gets the value of the maximumAirTemperatureTime property.
     * 
     * @return
     *     possible object is
     *     {@link TimeInstantPropertyType }
     *     
     */
    public TimeInstantPropertyType getMaximumAirTemperatureTime() {
        return maximumAirTemperatureTime;
    }

    /**
     * Sets the value of the maximumAirTemperatureTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeInstantPropertyType }
     *     
     */
    public void setMaximumAirTemperatureTime(TimeInstantPropertyType value) {
        this.maximumAirTemperatureTime = value;
    }

    /**
     * Gets the value of the minimumAirTemperature property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getMinimumAirTemperature() {
        return minimumAirTemperature;
    }

    /**
     * Sets the value of the minimumAirTemperature property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setMinimumAirTemperature(MeasureType value) {
        this.minimumAirTemperature = value;
    }

    /**
     * Gets the value of the minimumAirTemperatureTime property.
     * 
     * @return
     *     possible object is
     *     {@link TimeInstantPropertyType }
     *     
     */
    public TimeInstantPropertyType getMinimumAirTemperatureTime() {
        return minimumAirTemperatureTime;
    }

    /**
     * Sets the value of the minimumAirTemperatureTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeInstantPropertyType }
     *     
     */
    public void setMinimumAirTemperatureTime(TimeInstantPropertyType value) {
        this.minimumAirTemperatureTime = value;
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
