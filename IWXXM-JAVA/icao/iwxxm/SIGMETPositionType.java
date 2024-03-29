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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.AbstractFeatureType;
import net.opengis.gml.PointPropertyType;


/**
 * <p>Java class for SIGMETPositionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SIGMETPositionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractFeatureType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tropicalCyclonePosition" type="{http://www.opengis.net/gml/3.2}PointPropertyType" minOccurs="0"/&gt;
 *         &lt;element name="geometry" type="{http://icao.int/iwxxm/2023-1}AirspaceVolumePropertyType"/&gt;
 *         &lt;element name="extension" type="{http://icao.int/iwxxm/2023-1}ExtensionType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="approximateLocation" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SIGMETPositionType", propOrder = {
    "tropicalCyclonePosition",
    "geometry",
    "extension"
})
public class SIGMETPositionType
    extends AbstractFeatureType
{

    protected PointPropertyType tropicalCyclonePosition;
    @XmlElement(required = true)
    protected AirspaceVolumePropertyType geometry;
    protected List<ExtensionType> extension;
    @XmlAttribute(name = "approximateLocation")
    protected Boolean approximateLocation;

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
