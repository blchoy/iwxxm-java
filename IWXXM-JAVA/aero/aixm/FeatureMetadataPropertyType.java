//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.10.09 at 01:48:28 AM UTC 
//


package aero.aixm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.AbstractMetadataPropertyType;
import org.isotc211.gmd.MDMetadataType;


/**
 * <p>Java class for FeatureMetadataPropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FeatureMetadataPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractMetadataPropertyType"&gt;
 *       &lt;sequence minOccurs="0"&gt;
 *         &lt;element ref="{http://www.isotc211.org/2005/gmd}MD_Metadata"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeatureMetadataPropertyType", propOrder = {
    "mdMetadata"
})
public class FeatureMetadataPropertyType
    extends AbstractMetadataPropertyType
{

    @XmlElement(name = "MD_Metadata", namespace = "http://www.isotc211.org/2005/gmd")
    protected MDMetadataType mdMetadata;

    /**
     * Gets the value of the mdMetadata property.
     * 
     * @return
     *     possible object is
     *     {@link MDMetadataType }
     *     
     */
    public MDMetadataType getMDMetadata() {
        return mdMetadata;
    }

    /**
     * Sets the value of the mdMetadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link MDMetadataType }
     *     
     */
    public void setMDMetadata(MDMetadataType value) {
        this.mdMetadata = value;
    }

}
