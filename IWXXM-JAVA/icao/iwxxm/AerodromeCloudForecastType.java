//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0-SNAPSHOT 
// See <a href="https://jaxb.java.net/">https://jaxb.java.net/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.11.10 at 05:15:57 PM HKT 
//


package icao.iwxxm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.AbstractGMLType;


/**
 * <p>Java class for AerodromeCloudForecastType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AerodromeCloudForecastType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractGMLType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="verticalVisibility" type="{http://icao.int/iwxxm/2021-2}LengthWithNilReasonType" minOccurs="0"/&gt;
 *         &lt;element name="layer" type="{http://icao.int/iwxxm/2021-2}CloudLayerPropertyType" maxOccurs="4" minOccurs="0"/&gt;
 *         &lt;element name="extension" type="{http://icao.int/iwxxm/2021-2}ExtensionType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AerodromeCloudForecastType", propOrder = {
    "verticalVisibility",
    "layer",
    "extension"
})
public class AerodromeCloudForecastType
    extends AbstractGMLType
{

    @XmlElementRef(name = "verticalVisibility", namespace = "http://icao.int/iwxxm/2021-2", type = JAXBElement.class, required = false)
    protected JAXBElement<LengthWithNilReasonType> verticalVisibility;
    protected List<CloudLayerPropertyType> layer;
    protected List<ExtensionType> extension;

    /**
     * Gets the value of the verticalVisibility property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LengthWithNilReasonType }{@code >}
     *     
     */
    public JAXBElement<LengthWithNilReasonType> getVerticalVisibility() {
        return verticalVisibility;
    }

    /**
     * Sets the value of the verticalVisibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LengthWithNilReasonType }{@code >}
     *     
     */
    public void setVerticalVisibility(JAXBElement<LengthWithNilReasonType> value) {
        this.verticalVisibility = value;
    }

    /**
     * Gets the value of the layer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the layer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLayer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CloudLayerPropertyType }
     * 
     * 
     */
    public List<CloudLayerPropertyType> getLayer() {
        if (layer == null) {
            layer = new ArrayList<CloudLayerPropertyType>();
        }
        return this.layer;
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
