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
import net.opengis.gml.AngleType;
import net.opengis.gml.SpeedType;


/**
 * <p>Java class for WindObservedOrEstimatedType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WindObservedOrEstimatedType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractFeatureType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="verticalLayer" type="{http://icao.int/iwxxm/2023-1}AirspaceLayerPropertyType"/&gt;
 *         &lt;element name="windDirection" type="{http://www.opengis.net/gml/3.2}AngleType" minOccurs="0"/&gt;
 *         &lt;element name="windSpeed" type="{http://www.opengis.net/gml/3.2}SpeedType"/&gt;
 *         &lt;element name="extension" type="{http://icao.int/iwxxm/2023-1}ExtensionType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="variableWindDirection" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WindObservedOrEstimatedType", propOrder = {
    "verticalLayer",
    "windDirection",
    "windSpeed",
    "extension"
})
public class WindObservedOrEstimatedType
    extends AbstractFeatureType
{

    @XmlElement(required = true)
    protected AirspaceLayerPropertyType verticalLayer;
    protected AngleType windDirection;
    @XmlElement(required = true)
    protected SpeedType windSpeed;
    protected List<ExtensionType> extension;
    @XmlAttribute(name = "variableWindDirection", required = true)
    protected boolean variableWindDirection;

    /**
     * Gets the value of the verticalLayer property.
     * 
     * @return
     *     possible object is
     *     {@link AirspaceLayerPropertyType }
     *     
     */
    public AirspaceLayerPropertyType getVerticalLayer() {
        return verticalLayer;
    }

    /**
     * Sets the value of the verticalLayer property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirspaceLayerPropertyType }
     *     
     */
    public void setVerticalLayer(AirspaceLayerPropertyType value) {
        this.verticalLayer = value;
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
     * Gets the value of the variableWindDirection property.
     * 
     */
    public boolean isVariableWindDirection() {
        return variableWindDirection;
    }

    /**
     * Sets the value of the variableWindDirection property.
     * 
     */
    public void setVariableWindDirection(boolean value) {
        this.variableWindDirection = value;
    }

}
