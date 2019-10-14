//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.10.09 at 01:48:28 AM UTC 
//


package icao.iwxxm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import aero.aixm.AirspaceVolumePropertyType;
import net.opengis.gml.AbstractFeatureType;
import net.opengis.gml.SpeedType;


/**
 * <p>Java class for SIGMETEvolvingConditionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SIGMETEvolvingConditionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractFeatureType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="directionOfMotion" type="{http://icao.int/iwxxm/2.1}AngleWithNilReasonType" minOccurs="0"/&gt;
 *         &lt;element name="geometry" type="{http://www.aixm.aero/schema/5.1.1}AirspaceVolumePropertyType"/&gt;
 *         &lt;element name="geometryLowerLimitOperator" type="{http://icao.int/iwxxm/2.1}RelationalOperatorType" minOccurs="0"/&gt;
 *         &lt;element name="geometryUpperLimitOperator" type="{http://icao.int/iwxxm/2.1}RelationalOperatorType" minOccurs="0"/&gt;
 *         &lt;element name="speedOfMotion" type="{http://www.opengis.net/gml/3.2}SpeedType" minOccurs="0"/&gt;
 *         &lt;element name="extension" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="intensityChange" type="{http://icao.int/iwxxm/2.1}ExpectedIntensityChangeType" /&gt;
 *       &lt;attribute name="approximateLocation" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SIGMETEvolvingConditionType", propOrder = {
    "directionOfMotion",
    "geometry",
    "geometryLowerLimitOperator",
    "geometryUpperLimitOperator",
    "speedOfMotion",
    "extension"
})
public class SIGMETEvolvingConditionType
    extends AbstractFeatureType
{

    @XmlElementRef(name = "directionOfMotion", namespace = "http://icao.int/iwxxm/2.1", type = JAXBElement.class, required = false)
    protected JAXBElement<AngleWithNilReasonType> directionOfMotion;
    @XmlElement(required = true)
    protected AirspaceVolumePropertyType geometry;
    @XmlSchemaType(name = "string")
    protected RelationalOperatorType geometryLowerLimitOperator;
    @XmlSchemaType(name = "string")
    protected RelationalOperatorType geometryUpperLimitOperator;
    protected SpeedType speedOfMotion;
    protected List<Object> extension;
    @XmlAttribute(name = "intensityChange")
    protected ExpectedIntensityChangeType intensityChange;
    @XmlAttribute(name = "approximateLocation")
    protected Boolean approximateLocation;

    /**
     * Gets the value of the directionOfMotion property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AngleWithNilReasonType }{@code >}
     *     
     */
    public JAXBElement<AngleWithNilReasonType> getDirectionOfMotion() {
        return directionOfMotion;
    }

    /**
     * Sets the value of the directionOfMotion property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AngleWithNilReasonType }{@code >}
     *     
     */
    public void setDirectionOfMotion(JAXBElement<AngleWithNilReasonType> value) {
        this.directionOfMotion = value;
    }

    /**
     * Gets the value of the geometry property.
     * 
     * @return
     *     possible object is
     *     {@link AirspaceVolumePropertyType }
     *     
     */
    public AirspaceVolumePropertyType getGeometry() {
        return geometry;
    }

    /**
     * Sets the value of the geometry property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirspaceVolumePropertyType }
     *     
     */
    public void setGeometry(AirspaceVolumePropertyType value) {
        this.geometry = value;
    }

    /**
     * Gets the value of the geometryLowerLimitOperator property.
     * 
     * @return
     *     possible object is
     *     {@link RelationalOperatorType }
     *     
     */
    public RelationalOperatorType getGeometryLowerLimitOperator() {
        return geometryLowerLimitOperator;
    }

    /**
     * Sets the value of the geometryLowerLimitOperator property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelationalOperatorType }
     *     
     */
    public void setGeometryLowerLimitOperator(RelationalOperatorType value) {
        this.geometryLowerLimitOperator = value;
    }

    /**
     * Gets the value of the geometryUpperLimitOperator property.
     * 
     * @return
     *     possible object is
     *     {@link RelationalOperatorType }
     *     
     */
    public RelationalOperatorType getGeometryUpperLimitOperator() {
        return geometryUpperLimitOperator;
    }

    /**
     * Sets the value of the geometryUpperLimitOperator property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelationalOperatorType }
     *     
     */
    public void setGeometryUpperLimitOperator(RelationalOperatorType value) {
        this.geometryUpperLimitOperator = value;
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
     * Gets the value of the intensityChange property.
     * 
     * @return
     *     possible object is
     *     {@link ExpectedIntensityChangeType }
     *     
     */
    public ExpectedIntensityChangeType getIntensityChange() {
        return intensityChange;
    }

    /**
     * Sets the value of the intensityChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpectedIntensityChangeType }
     *     
     */
    public void setIntensityChange(ExpectedIntensityChangeType value) {
        this.intensityChange = value;
    }

    /**
     * Gets the value of the approximateLocation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isApproximateLocation() {
        return approximateLocation;
    }

    /**
     * Sets the value of the approximateLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setApproximateLocation(Boolean value) {
        this.approximateLocation = value;
    }

}
