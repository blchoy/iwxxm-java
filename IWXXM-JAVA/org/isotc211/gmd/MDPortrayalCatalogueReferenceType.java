//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0-SNAPSHOT 
// See <a href="https://jaxb.java.net/">https://jaxb.java.net/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.05.22 at 02:50:00 PM HKT 
//


package org.isotc211.gmd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.isotc211.gco.AbstractObjectType;


/**
 * Information identifing the portrayal catalogue used
 * 
 * <p>Java class for MD_PortrayalCatalogueReference_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MD_PortrayalCatalogueReference_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="portrayalCatalogueCitation" type="{http://www.isotc211.org/2005/gmd}CI_Citation_PropertyType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MD_PortrayalCatalogueReference_Type", propOrder = {
    "portrayalCatalogueCitation"
})
public class MDPortrayalCatalogueReferenceType
    extends AbstractObjectType
{

    @XmlElement(required = true)
    protected List<CICitationPropertyType> portrayalCatalogueCitation;

    /**
     * Gets the value of the portrayalCatalogueCitation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the portrayalCatalogueCitation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPortrayalCatalogueCitation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CICitationPropertyType }
     * 
     * 
     */
    public List<CICitationPropertyType> getPortrayalCatalogueCitation() {
        if (portrayalCatalogueCitation == null) {
            portrayalCatalogueCitation = new ArrayList<CICitationPropertyType>();
        }
        return this.portrayalCatalogueCitation;
    }

}
