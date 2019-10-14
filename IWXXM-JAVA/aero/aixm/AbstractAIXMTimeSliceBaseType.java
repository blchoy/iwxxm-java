//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.10.14 at 03:52:52 AM UTC 
//


package aero.aixm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.AbstractTimeSliceType;


/**
 * Base type of AIXM Timeslices.  Removes option attributes that are not used in AIXM.
 * 
 * <p>Java class for AbstractAIXMTimeSliceBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractAIXMTimeSliceBaseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.opengis.net/gml/3.2}AbstractTimeSliceType"&gt;
 *       &lt;sequence&gt;
 *         &lt;sequence&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;element ref="{http://www.opengis.net/gml/3.2}validTime"/&gt;
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
@XmlType(name = "AbstractAIXMTimeSliceBaseType")
@XmlSeeAlso({
    AbstractAIXMTimeSliceType.class
})
public abstract class AbstractAIXMTimeSliceBaseType
    extends AbstractTimeSliceType
{


}
