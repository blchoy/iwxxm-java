//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0-SNAPSHOT 
// See <a href="https://jaxb.java.net/">https://jaxb.java.net/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.07.19 at 10:49:53 AM HKT 
//


package icao.iwxxm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import aero.aixm.AirspaceVolumePropertyType;
import net.opengis.gml.AbstractFeatureType;
import net.opengis.gml.AngleType;
import net.opengis.gml.LengthType;
import net.opengis.gml.SpeedType;


/**
 * <p>Java class for VolcanicAshCloudType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VolcanicAshCloudType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractFeatureType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ashCloudExtent" type="{http://www.aixm.aero/schema/5.1.1}AirspaceVolumePropertyType"/&gt;
 *         &lt;element name="directionOfMotion" type="{http://www.opengis.net/gml/3.2}AngleType" minOccurs="0"/&gt;
 *         &lt;element name="speedOfMotion" type="{http://www.opengis.net/gml/3.2}SpeedType" minOccurs="0"/&gt;
 *         &lt;element name="windSpeed" type="{http://www.opengis.net/gml/3.2}SpeedType" minOccurs="0"/&gt;
 *         &lt;element name="windDirection" type="{http://www.opengis.net/gml/3.2}AngleType" minOccurs="0"/&gt;
 *         &lt;element name="windLowerLimit" type="{http://www.opengis.net/gml/3.2}LengthType" minOccurs="0"/&gt;
 *         &lt;element name="windLowerLimitReference" type="{http://www.aixm.aero/schema/5.1.1}CodeVerticalReferenceBaseType" minOccurs="0"/&gt;
 *         &lt;element name="windUpperLimit" type="{http://www.opengis.net/gml/3.2}LengthType" minOccurs="0"/&gt;
 *         &lt;element name="windUpperLimitReference" type="{http://www.aixm.aero/schema/5.1.1}CodeVerticalReferenceBaseType" minOccurs="0"/&gt;
 *         &lt;element name="extension" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="variableWindDirection" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VolcanicAshCloudType", propOrder = {
    "ashCloudExtent",
    "directionOfMotion",
    "speedOfMotion",
    "windSpeed",
    "windDirection",
    "windLowerLimit",
    "windLowerLimitReference",
    "windUpperLimit",
    "windUpperLimitReference",
    "extension"
})
public class VolcanicAshCloudType
    extends AbstractFeatureType
{

    @XmlElement(required = true, nillable = true)
    protected AirspaceVolumePropertyType ashCloudExtent;
    protected AngleType directionOfMotion;
    protected SpeedType speedOfMotion;
    protected SpeedType windSpeed;
    protected AngleType windDirection;
    protected LengthType windLowerLimit;
    protected String windLowerLimitReference;
    protected LengthType windUpperLimit;
    protected String windUpperLimitReference;
    protected List<Object> extension;
    @XmlAttribute(name = "variableWindDirection")
    protected Boolean variableWindDirection;

    /**
     * Gets the value of the ashCloudExtent property.
     * 
     * @return
     *     possible object is
     *     {@link AirspaceVolumePropertyType }
     *     
     */
    public AirspaceVolumePropertyType getAshCloudExtent() {
        return ashCloudExtent;
    }

    /**
     * Sets the value of the ashCloudExtent property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirspaceVolumePropertyType }
     *     
     */
    public void setAshCloudExtent(AirspaceVolumePropertyType value) {
        this.ashCloudExtent = value;
    }

    /**
     * Gets the value of the directionOfMotion property.
     * 
     * @return
     *     possible object is
     *     {@link AngleType }
     *     
     */
    public AngleType getDirectionOfMotion() {
        return directionOfMotion;
    }

    /**
     * Sets the value of the directionOfMotion property.
     * 
     * @param value
     *     allowed object is
     *     {@link AngleType }
     *     
     */
    public void setDirectionOfMotion(AngleType value) {
        this.directionOfMotion = value;
    }

    /**
     * Gets the value of the speedOfMotion property.
     * 
     * @return
     *     possible object is
     *     {@link SpeedType }
     *     
     */
    public SpeedType getSpeedOfMotion() {
        return speedOfMotion;
    }

    /**
     * Sets the value of the speedOfMotion property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpeedType }
     *     
     */
    public void setSpeedOfMotion(SpeedType value) {
        this.speedOfMotion = value;
    }

    /**
     * Gets the value of the windSpeed property.
     * 
     * @return
     *     possible object is
     *     {@link SpeedType }
     *     
     */
    public SpeedType getWindSpeed() {
        return windSpeed;
    }

    /**
     * Sets the value of the windSpeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpeedType }
     *     
     */
    public void setWindSpeed(SpeedType value) {
        this.windSpeed = value;
    }

    /**
     * Gets the value of the windDirection property.
     * 
     * @return
     *     possible object is
     *     {@link AngleType }
     *     
     */
    public AngleType getWindDirection() {
        return windDirection;
    }

    /**
     * Sets the value of the windDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link AngleType }
     *     
     */
    public void setWindDirection(AngleType value) {
        this.windDirection = value;
    }

    /**
     * Gets the value of the windLowerLimit property.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getWindLowerLimit() {
        return windLowerLimit;
    }

    /**
     * Sets the value of the windLowerLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setWindLowerLimit(LengthType value) {
        this.windLowerLimit = value;
    }

    /**
     * Gets the value of the windLowerLimitReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWindLowerLimitReference() {
        return windLowerLimitReference;
    }

    /**
     * Sets the value of the windLowerLimitReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWindLowerLimitReference(String value) {
        this.windLowerLimitReference = value;
    }

    /**
     * Gets the value of the windUpperLimit property.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getWindUpperLimit() {
        return windUpperLimit;
    }

    /**
     * Sets the value of the windUpperLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setWindUpperLimit(LengthType value) {
        this.windUpperLimit = value;
    }

    /**
     * Gets the value of the windUpperLimitReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWindUpperLimitReference() {
        return windUpperLimitReference;
    }

    /**
     * Sets the value of the windUpperLimitReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWindUpperLimitReference(String value) {
        this.windUpperLimitReference = value;
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

    /**
     * Gets the value of the variableWindDirection property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVariableWindDirection() {
        return variableWindDirection;
    }

    /**
     * Sets the value of the variableWindDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVariableWindDirection(Boolean value) {
        this.variableWindDirection = value;
    }

}