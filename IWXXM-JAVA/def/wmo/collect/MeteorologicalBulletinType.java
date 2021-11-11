//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0-SNAPSHOT 
// See <a href="https://jaxb.java.net/">https://jaxb.java.net/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.11.10 at 05:15:57 PM HKT 
//


package def.wmo.collect;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.AbstractFeatureType;


/**
 * <p>Java class for MeteorologicalBulletinType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MeteorologicalBulletinType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractFeatureType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="meteorologicalInformation" type="{http://def.wmo.int/collect/2014}MeteorologicalInformationMemberPropertyType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="bulletinIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeteorologicalBulletinType", propOrder = {
    "meteorologicalInformation",
    "bulletinIdentifier"
})
public class MeteorologicalBulletinType
    extends AbstractFeatureType
{

    @XmlElement(required = true)
    protected List<MeteorologicalInformationMemberPropertyType> meteorologicalInformation;
    @XmlElement(required = true)
    protected String bulletinIdentifier;

    /**
     * Gets the value of the meteorologicalInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the meteorologicalInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMeteorologicalInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeteorologicalInformationMemberPropertyType }
     * 
     * 
     */
    public List<MeteorologicalInformationMemberPropertyType> getMeteorologicalInformation() {
        if (meteorologicalInformation == null) {
            meteorologicalInformation = new ArrayList<MeteorologicalInformationMemberPropertyType>();
        }
        return this.meteorologicalInformation;
    }

    /**
     * Gets the value of the bulletinIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBulletinIdentifier() {
        return bulletinIdentifier;
    }

    /**
     * Sets the value of the bulletinIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBulletinIdentifier(String value) {
        this.bulletinIdentifier = value;
    }

}
