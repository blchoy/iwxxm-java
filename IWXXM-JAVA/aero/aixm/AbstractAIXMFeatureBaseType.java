//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0-SNAPSHOT 
// See <a href="https://jaxb.java.net/">https://jaxb.java.net/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.11.10 at 05:15:57 PM HKT 
//


package aero.aixm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.DynamicFeatureType;


/**
 * This derives from gml:DynamicFeatureType, as all AIXM features are expected to have temporal properties modeled using the Timeslice model. While the GML specification does not mandate that dynamic features derive from gml:DynamicFeatureType, many GML-aware applications may only detect a dynamic feature by this type hierarchy. Note that all temporal properties of gml:DynamicFeatureType are removed during this restriction, because they will be added for each AIXM feature specifically, based on the TimeSlice model
 * 
 * <p>Java class for AbstractAIXMFeatureBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractAIXMFeatureBaseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.opengis.net/gml/3.2}DynamicFeatureType"&gt;
 *       &lt;sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;sequence&gt;
 *             &lt;element ref="{http://www.opengis.net/gml/3.2}description" minOccurs="0"/&gt;
 *             &lt;element ref="{http://www.opengis.net/gml/3.2}identifier" minOccurs="0"/&gt;
 *             &lt;element ref="{http://www.opengis.net/gml/3.2}name" maxOccurs="unbounded" minOccurs="0"/&gt;
 *           &lt;/sequence&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;element ref="{http://www.opengis.net/gml/3.2}boundedBy" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute ref="{http://www.opengis.net/gml/3.2}id use="required""/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractAIXMFeatureBaseType")
@XmlSeeAlso({
    AbstractAIXMFeatureType.class,
    AbstractAIXMMessageBaseType.class
})
public abstract class AbstractAIXMFeatureBaseType
    extends DynamicFeatureType
{


}
