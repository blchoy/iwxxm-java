//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.11.08 at 04:16:07 AM UTC 
//


package icao.iwxxm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.AbstractFeatureType;
import net.opengis.gml.AngleType;
import net.opengis.gml.SpeedType;


/**
 * <p>Java class for VolcanicAshCloudObservedOrEstimatedType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VolcanicAshCloudObservedOrEstimatedType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractFeatureType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ashCloudExtent" type="{http://icao.int/iwxxm/3.0}AirspaceVolumePropertyType"/&gt;
 *         &lt;element name="directionOfMotion" type="{http://www.opengis.net/gml/3.2}AngleType"/&gt;
 *         &lt;element name="speedOfMotion" type="{http://www.opengis.net/gml/3.2}SpeedType"/&gt;
 *         &lt;element name="extension" type="{http://icao.int/iwxxm/3.0}ExtensionType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VolcanicAshCloudObservedOrEstimatedType", propOrder = {
    "ashCloudExtent",
    "directionOfMotion",
    "speedOfMotion",
    "extension"
})
public class VolcanicAshCloudObservedOrEstimatedType
    extends AbstractFeatureType
{

    @XmlElement(required = true, nillable = true)
    protected AirspaceVolumePropertyType ashCloudExtent;
    @XmlElement(required = true)
    protected AngleType directionOfMotion;
    @XmlElement(required = true)
    protected SpeedType speedOfMotion;
    protected List<ExtensionType> extension;

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
