//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0-SNAPSHOT 
// See <a href="https://jaxb.java.net/">https://jaxb.java.net/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.05.22 at 02:50:00 PM HKT 
//


package icao.iwxxm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.AbstractFeatureType;
import net.opengis.gml.AngleType;
import net.opengis.gml.MeasureType;
import net.opengis.gml.PointPropertyType;
import net.opengis.gml.SpeedType;


/**
 * <p>Java class for TropicalCycloneObservedConditionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TropicalCycloneObservedConditionsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractFeatureType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="phenomenonTime" type="{http://icao.int/iwxxm/2023-1}AbstractTimeObjectPropertyType"/&gt;
 *         &lt;element name="tropicalCyclonePosition" type="{http://www.opengis.net/gml/3.2}PointPropertyType"/&gt;
 *         &lt;element name="cumulonimbusCloudLocation" type="{http://icao.int/iwxxm/2023-1}AirspaceVolumePropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="movement" type="{http://icao.int/iwxxm/2023-1}TropicalCycloneMovementType"/&gt;
 *         &lt;element name="movementDirection" type="{http://www.opengis.net/gml/3.2}AngleType" minOccurs="0"/&gt;
 *         &lt;element name="movementSpeed" type="{http://www.opengis.net/gml/3.2}SpeedType" minOccurs="0"/&gt;
 *         &lt;element name="intensityChange" type="{http://icao.int/iwxxm/2023-1}TropicalCycloneIntensityChangeType"/&gt;
 *         &lt;element name="centralPressure" type="{http://www.opengis.net/gml/3.2}MeasureType"/&gt;
 *         &lt;element name="maximumSurfaceWindSpeed" type="{http://www.opengis.net/gml/3.2}SpeedType"/&gt;
 *         &lt;element name="extension" type="{http://icao.int/iwxxm/2023-1}ExtensionType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TropicalCycloneObservedConditionsType", propOrder = {
    "phenomenonTime",
    "tropicalCyclonePosition",
    "cumulonimbusCloudLocation",
    "movement",
    "movementDirection",
    "movementSpeed",
    "intensityChange",
    "centralPressure",
    "maximumSurfaceWindSpeed",
    "extension"
})
public class TropicalCycloneObservedConditionsType
    extends AbstractFeatureType
{

    @XmlElement(required = true)
    protected AbstractTimeObjectPropertyType phenomenonTime;
    @XmlElement(required = true)
    protected PointPropertyType tropicalCyclonePosition;
    @XmlElement(nillable = true)
    protected List<AirspaceVolumePropertyType> cumulonimbusCloudLocation;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected TropicalCycloneMovementType movement;
    protected AngleType movementDirection;
    protected SpeedType movementSpeed;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected TropicalCycloneIntensityChangeType intensityChange;
    @XmlElement(required = true)
    protected MeasureType centralPressure;
    @XmlElement(required = true)
    protected SpeedType maximumSurfaceWindSpeed;
    protected List<ExtensionType> extension;

    /**
     * Gets the value of the phenomenonTime property.
     * 
     * @return
     *     possible object is
     *     {@link AbstractTimeObjectPropertyType }
     *     
     */
    public AbstractTimeObjectPropertyType getPhenomenonTime() {
        return phenomenonTime;
    }

    /**
     * Sets the value of the phenomenonTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link AbstractTimeObjectPropertyType }
     *     
     */
    public void setPhenomenonTime(AbstractTimeObjectPropertyType value) {
        this.phenomenonTime = value;
    }

    /**
     * Gets the value of the tropicalCyclonePosition property.
     * 
     * @return
     *     possible object is
     *     {@link PointPropertyType }
     *     
     */
    public PointPropertyType getTropicalCyclonePosition() {
        return tropicalCyclonePosition;
    }

    /**
     * Sets the value of the tropicalCyclonePosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointPropertyType }
     *     
     */
    public void setTropicalCyclonePosition(PointPropertyType value) {
        this.tropicalCyclonePosition = value;
    }

    /**
     * Gets the value of the cumulonimbusCloudLocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cumulonimbusCloudLocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCumulonimbusCloudLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirspaceVolumePropertyType }
     * 
     * 
     */
    public List<AirspaceVolumePropertyType> getCumulonimbusCloudLocation() {
        if (cumulonimbusCloudLocation == null) {
            cumulonimbusCloudLocation = new ArrayList<AirspaceVolumePropertyType>();
        }
        return this.cumulonimbusCloudLocation;
    }

    /**
     * Gets the value of the movement property.
     * 
     * @return
     *     possible object is
     *     {@link TropicalCycloneMovementType }
     *     
     */
    public TropicalCycloneMovementType getMovement() {
        return movement;
    }

    /**
     * Sets the value of the movement property.
     * 
     * @param value
     *     allowed object is
     *     {@link TropicalCycloneMovementType }
     *     
     */
    public void setMovement(TropicalCycloneMovementType value) {
        this.movement = value;
    }

    /**
     * Gets the value of the movementDirection property.
     * 
     * @return
     *     possible object is
     *     {@link AngleType }
     *     
     */
    public AngleType getMovementDirection() {
        return movementDirection;
    }

    /**
     * Sets the value of the movementDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link AngleType }
     *     
     */
    public void setMovementDirection(AngleType value) {
        this.movementDirection = value;
    }

    /**
     * Gets the value of the movementSpeed property.
     * 
     * @return
     *     possible object is
     *     {@link SpeedType }
     *     
     */
    public SpeedType getMovementSpeed() {
        return movementSpeed;
    }

    /**
     * Sets the value of the movementSpeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpeedType }
     *     
     */
    public void setMovementSpeed(SpeedType value) {
        this.movementSpeed = value;
    }

    /**
     * Gets the value of the intensityChange property.
     * 
     * @return
     *     possible object is
     *     {@link TropicalCycloneIntensityChangeType }
     *     
     */
    public TropicalCycloneIntensityChangeType getIntensityChange() {
        return intensityChange;
    }

    /**
     * Sets the value of the intensityChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link TropicalCycloneIntensityChangeType }
     *     
     */
    public void setIntensityChange(TropicalCycloneIntensityChangeType value) {
        this.intensityChange = value;
    }

    /**
     * Gets the value of the centralPressure property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getCentralPressure() {
        return centralPressure;
    }

    /**
     * Sets the value of the centralPressure property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setCentralPressure(MeasureType value) {
        this.centralPressure = value;
    }

    /**
     * Gets the value of the maximumSurfaceWindSpeed property.
     * 
     * @return
     *     possible object is
     *     {@link SpeedType }
     *     
     */
    public SpeedType getMaximumSurfaceWindSpeed() {
        return maximumSurfaceWindSpeed;
    }

    /**
     * Sets the value of the maximumSurfaceWindSpeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpeedType }
     *     
     */
    public void setMaximumSurfaceWindSpeed(SpeedType value) {
        this.maximumSurfaceWindSpeed = value;
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

}
