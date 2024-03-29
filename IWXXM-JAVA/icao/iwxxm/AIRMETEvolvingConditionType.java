//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0-SNAPSHOT 
// See <a href="https://jaxb.java.net/">https://jaxb.java.net/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.05.22 at 02:50:00 PM HKT 
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
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.AbstractFeatureType;
import net.opengis.gml.AngleType;
import net.opengis.gml.LengthType;
import net.opengis.gml.SpeedType;


/**
 * <p>Java class for AIRMETEvolvingConditionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AIRMETEvolvingConditionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractFeatureType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="geometry" type="{http://icao.int/iwxxm/2023-1}AirspaceVolumePropertyType"/&gt;
 *         &lt;element name="directionOfMotion" type="{http://icao.int/iwxxm/2023-1}AngleWithNilReasonType" minOccurs="0"/&gt;
 *         &lt;element name="speedOfMotion" type="{http://www.opengis.net/gml/3.2}SpeedType" minOccurs="0"/&gt;
 *         &lt;element name="cloudBase" type="{http://www.opengis.net/gml/3.2}LengthType" minOccurs="0"/&gt;
 *         &lt;element name="cloudBaseReference" type="{http://www.aixm.aero/schema/5.1.1}CodeVerticalReferenceBaseType" minOccurs="0"/&gt;
 *         &lt;element name="cloudTop" type="{http://www.opengis.net/gml/3.2}LengthType" minOccurs="0"/&gt;
 *         &lt;element name="cloudTopReference" type="{http://www.aixm.aero/schema/5.1.1}CodeVerticalReferenceBaseType" minOccurs="0"/&gt;
 *         &lt;element name="cloudTopAbove" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="surfaceVisibility" type="{http://www.opengis.net/gml/3.2}LengthType" minOccurs="0"/&gt;
 *         &lt;element name="surfaceVisibilityCause" type="{http://icao.int/iwxxm/2023-1}WeatherCausingVisibilityReductionType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="surfaceWindDirection" type="{http://www.opengis.net/gml/3.2}AngleType" minOccurs="0"/&gt;
 *         &lt;element name="surfaceWindSpeed" type="{http://www.opengis.net/gml/3.2}SpeedType" minOccurs="0"/&gt;
 *         &lt;element name="extension" type="{http://icao.int/iwxxm/2023-1}ExtensionType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="intensityChange" type="{http://icao.int/iwxxm/2023-1}AIRMETExpectedIntensityChangeType" /&gt;
 *       &lt;attribute name="approximateLocation" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AIRMETEvolvingConditionType", propOrder = {
    "geometry",
    "directionOfMotion",
    "speedOfMotion",
    "cloudBase",
    "cloudBaseReference",
    "cloudTop",
    "cloudTopReference",
    "cloudTopAbove",
    "surfaceVisibility",
    "surfaceVisibilityCause",
    "surfaceWindDirection",
    "surfaceWindSpeed",
    "extension"
})
public class AIRMETEvolvingConditionType
    extends AbstractFeatureType
{

    @XmlElement(required = true)
    protected AirspaceVolumePropertyType geometry;
    @XmlElementRef(name = "directionOfMotion", namespace = "http://icao.int/iwxxm/2023-1", type = JAXBElement.class, required = false)
    protected JAXBElement<AngleWithNilReasonType> directionOfMotion;
    protected SpeedType speedOfMotion;
    protected LengthType cloudBase;
    protected String cloudBaseReference;
    protected LengthType cloudTop;
    protected String cloudTopReference;
    protected Boolean cloudTopAbove;
    protected LengthType surfaceVisibility;
    protected List<WeatherCausingVisibilityReductionType> surfaceVisibilityCause;
    protected AngleType surfaceWindDirection;
    protected SpeedType surfaceWindSpeed;
    protected List<ExtensionType> extension;
    @XmlAttribute(name = "intensityChange")
    protected AIRMETExpectedIntensityChangeType intensityChange;
    @XmlAttribute(name = "approximateLocation")
    protected Boolean approximateLocation;

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
     * Gets the value of the cloudBase property.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getCloudBase() {
        return cloudBase;
    }

    /**
     * Sets the value of the cloudBase property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setCloudBase(LengthType value) {
        this.cloudBase = value;
    }

    /**
     * Gets the value of the cloudBaseReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCloudBaseReference() {
        return cloudBaseReference;
    }

    /**
     * Sets the value of the cloudBaseReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCloudBaseReference(String value) {
        this.cloudBaseReference = value;
    }

    /**
     * Gets the value of the cloudTop property.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getCloudTop() {
        return cloudTop;
    }

    /**
     * Sets the value of the cloudTop property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setCloudTop(LengthType value) {
        this.cloudTop = value;
    }

    /**
     * Gets the value of the cloudTopReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCloudTopReference() {
        return cloudTopReference;
    }

    /**
     * Sets the value of the cloudTopReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCloudTopReference(String value) {
        this.cloudTopReference = value;
    }

    /**
     * Gets the value of the cloudTopAbove property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCloudTopAbove() {
        return cloudTopAbove;
    }

    /**
     * Sets the value of the cloudTopAbove property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCloudTopAbove(Boolean value) {
        this.cloudTopAbove = value;
    }

    /**
     * Gets the value of the surfaceVisibility property.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getSurfaceVisibility() {
        return surfaceVisibility;
    }

    /**
     * Sets the value of the surfaceVisibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setSurfaceVisibility(LengthType value) {
        this.surfaceVisibility = value;
    }

    /**
     * Gets the value of the surfaceVisibilityCause property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the surfaceVisibilityCause property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSurfaceVisibilityCause().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WeatherCausingVisibilityReductionType }
     * 
     * 
     */
    public List<WeatherCausingVisibilityReductionType> getSurfaceVisibilityCause() {
        if (surfaceVisibilityCause == null) {
            surfaceVisibilityCause = new ArrayList<WeatherCausingVisibilityReductionType>();
        }
        return this.surfaceVisibilityCause;
    }

    /**
     * Gets the value of the surfaceWindDirection property.
     * 
     * @return
     *     possible object is
     *     {@link AngleType }
     *     
     */
    public AngleType getSurfaceWindDirection() {
        return surfaceWindDirection;
    }

    /**
     * Sets the value of the surfaceWindDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link AngleType }
     *     
     */
    public void setSurfaceWindDirection(AngleType value) {
        this.surfaceWindDirection = value;
    }

    /**
     * Gets the value of the surfaceWindSpeed property.
     * 
     * @return
     *     possible object is
     *     {@link SpeedType }
     *     
     */
    public SpeedType getSurfaceWindSpeed() {
        return surfaceWindSpeed;
    }

    /**
     * Sets the value of the surfaceWindSpeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpeedType }
     *     
     */
    public void setSurfaceWindSpeed(SpeedType value) {
        this.surfaceWindSpeed = value;
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
     * {@link ExtensionType }
     * 
     * 
     */
    public List<ExtensionType> getExtension() {
        if (extension == null) {
            extension = new ArrayList<ExtensionType>();
        }
        return this.extension;
    }

    /**
     * Gets the value of the intensityChange property.
     * 
     * @return
     *     possible object is
     *     {@link AIRMETExpectedIntensityChangeType }
     *     
     */
    public AIRMETExpectedIntensityChangeType getIntensityChange() {
        return intensityChange;
    }

    /**
     * Sets the value of the intensityChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link AIRMETExpectedIntensityChangeType }
     *     
     */
    public void setIntensityChange(AIRMETExpectedIntensityChangeType value) {
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
